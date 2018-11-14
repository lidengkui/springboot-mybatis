package com.har.dao.mapper;

import com.har.entity.AppCustomerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AppCustomerMapper {

    AppCustomerEntity findByAppCode(@Param("code") String code);
}
