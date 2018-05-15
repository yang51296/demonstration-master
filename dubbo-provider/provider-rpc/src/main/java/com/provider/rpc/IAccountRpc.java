package com.provider.rpc;

import com.provider.pojo.AccountPojo;

import java.util.List;

/**
 * Created by hp on 2018/5/4.
 */
public interface IAccountRpc {
    public List<AccountPojo> findAll();
}
