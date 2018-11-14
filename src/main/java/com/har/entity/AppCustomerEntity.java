package com.har.entity;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@TableName("app_customer")
public class AppCustomerEntity implements Serializable {

    private static final long serialVersionUID = 576414586209715763L;
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long userUi;
    private String appVersion;
    private String appCode;
    private String appName;
    private Byte renewalFlag;
    private Byte appType;
    private Byte deviceType;
    private String deviceModel;
    private Date createTime;
    private Date updateTime;

}