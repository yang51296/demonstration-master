package com.excel.easypoi.mvc.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.io.Serializable;

/**
 * Created by hp on 2019/1/3.
 */
@ExcelTarget("userDo")
public class UserDO implements Serializable{
    @Excel(name="yangjunwu")
    private String name;
}
