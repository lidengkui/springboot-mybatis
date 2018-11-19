package com.har.entity;


import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AccessLevel;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Proxy(lazy = false)
@Data
@Entity
@Table(name = "app_customer")
public class AppCustomerEntity implements Serializable {
    @Id
    private Long id;
    @Column(name="user_ui")
    private Long userUi;
    @Column(name="app_version")
    private String appVersion;
    @Column(name="app_code")
    private String appCode;
    @Column(name="app_name")
    private String appName;
    @Column(name="renewal_flag")
    private Byte renewalFlag;
    @Column(name="app_type")
    private Byte appType;
    @Column(name="device_type")
    private Byte deviceType;
    @Column(name="device_model")
    private String deviceModel;
    @Column(name="create_time")
    private Date createTime;
    @Column(name="update_time")
    private Date updateTime;

}