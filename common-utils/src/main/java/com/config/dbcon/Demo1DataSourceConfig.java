package com.config.dbcon;

import com.alibaba.druid.pool.DruidDataSource;
import com.config.druidConfig.DataSourceConfig;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
// 扫描 Mapper 接口并容器管  理
@MapperScan(basePackages = Demo1DataSourceConfig.PACKAGE, sqlSessionFactoryRef = "Demo1SqlSessionFactory")
public class Demo1DataSourceConfig {
    @Autowired
    private DataSourceConfig dataSourceConfig;


    // 精确到 batch 目录，以便跟其他数据源隔离
    // static final String PACKAGE = "com.workflow.dao.batch";
    static final String PACKAGE = "com.provider";
    // static final String MAPPER_LOCATION = "classpath*:mapper/batch/*.xml";
    static final String MAPPER_LOCATION = "classpath*:mapper/provider/*.xml";
    @Value("${demo1.datasource.url}")
    private String url;

    @Value("${demo1.datasource.username}")
    private String user;

    @Value("${demo1.datasource.password}")
    private String password;

    @Value("${demo1.datasource.driverClassName}")
    private String driverClass;


    @Bean(name = "Demo1DataSource")
    public DataSource Demo1DataSource() {

        DruidDataSource dataSource = dataSourceConfig.getBaseDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "Demo1TransactionManager")
    public DataSourceTransactionManager Demo1TransactionManager() {
        System.out.println("连接到读取数据源:"+url);
        return new DataSourceTransactionManager(Demo1DataSource());
    }

    @Bean(name = "Demo1SqlSessionFactory")
    public SqlSessionFactory Demo1SqlSessionFactory(@Qualifier("Demo1DataSource") DataSource Demo1DataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(Demo1DataSource);
        // 分页插件
        PageHelper pageHelper = new PageHelper();
        Properties props = new Properties();
        props.setProperty("reasonable", "true");
        props.setProperty("supportMethodsArguments", "true");
        props.setProperty("returnPageInfo", "check");
        props.setProperty("params", "count=countSql");
        pageHelper.setProperties(props);
        // 添加插件
        sessionFactory.setPlugins(new Interceptor[] { pageHelper });
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(Demo1DataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}