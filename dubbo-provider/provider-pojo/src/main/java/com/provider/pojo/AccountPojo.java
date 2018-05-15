package com.provider.pojo;

import java.io.Serializable;

/**
 * Created by hp on 2018/5/4.
 */
public class AccountPojo implements Serializable {
    private String  accountCode  ;
    private String  communityId  ;

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    @Override
    public String toString() {
        return "AccountPojo{" +
                "accountCode='" + accountCode + '\'' +
                ", communityId='" + communityId + '\'' +
                '}';
    }
}
