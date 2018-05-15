package com.provider.rpc;

import com.provider.pojo.AccountPojo;

/**
 * Created by hp on 2018/5/7.
 */
public interface IMqSenderObject {
    public void send(AccountPojo accountPojo);
}
