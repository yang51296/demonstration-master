package com.provider;


import com.provider.model.AccountModel;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;


public interface AccountDao {

    public List<AccountModel> getAll();
}