package com.config.druidConfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

/**
 * Created by hp on 2017/6/21.
 */
@Configuration
public class DataSourceConfig {
    @Value("${common-datasource.initialSize}")
    private int initialSize;

    @Value("${common-datasource.minIdle}")
    private int minIdle;

    @Value("${common-datasource.maxActive}")
    private int maxActive;

    @Value("${common-datasource.maxWait}")
    private int maxWait;

    @Value("${common-datasource.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${common-datasource.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${common-datasource.validationQuery}")
    private String validationQuery;

    @Value("${common-datasource.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${common-datasource.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${common-datasource.testOnReturn}")
    private boolean testOnReturn;

    @Value("${common-datasource.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${common-datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${common-datasource.filters}")
    private String filters;

    @Value("{common-datasource.connectionProperties}")
    private String connectionProperties;

    public DruidDataSource getBaseDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setInitialSize(initialSize);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxActive(maxActive);
        dataSource.setMaxWait(maxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            dataSource.setFilters(filters);
        } catch (SQLException e) {
            //logger.error("druid configuration initialization filter", e);
        }
        dataSource.setConnectionProperties(connectionProperties);
        return dataSource;
    }

}
