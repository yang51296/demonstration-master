package com.provider.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by hp on 2018/5/4.
 */

public class AccountModel implements Serializable {
    private String  accountCode  ;
    private String  communityId  ;
    private Integer expressId    ;
    private Integer accountNum   ;
    private Date    accountTime  ;
    private Integer accountMoney ;
    private Integer chargeStatus ;
    private Integer createUser   ;
    private Date    createTime   ;
    private String  modifyUser   ;
    private Date    modifyTime   ;

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

    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public Date getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    public Integer getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(Integer accountMoney) {
        this.accountMoney = accountMoney;
    }

    public Integer getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(Integer chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    private Integer isDelete     ;


}
