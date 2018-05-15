package com.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.provider.AccountDao;
import com.provider.model.AccountModel;
import com.provider.pojo.AccountPojo;
import com.provider.rpc.IAccountRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2018/5/4.
 */
@Component
@Service(version = "0.1")
public class AccountService implements IAccountRpc {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<AccountPojo> findAll() {
        List<AccountModel> accountModelList =   accountDao.getAll();
        AccountPojo accountPojo = null;
        List<AccountPojo> accountPojoList = new ArrayList<AccountPojo>();
        if(accountModelList.size()>0) {
            for (AccountModel accountModel : accountModelList) {
                accountPojo = new AccountPojo();
                accountPojo.setAccountCode(accountModel.getAccountCode());
                accountPojoList.add(accountPojo);
            }
        }else{
            accountPojo = new AccountPojo();
            accountPojoList.add(accountPojo);
        }
        return accountPojoList;
    }
}
