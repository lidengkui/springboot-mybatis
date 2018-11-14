package com.har.dao;

import com.har.entity.AppCustomerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AppCustomerMapperExt {

    AppCustomerEntity findByAppCode(@Param("code") String code);
}
