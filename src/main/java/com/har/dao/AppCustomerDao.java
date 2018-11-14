package com.har.dao;

import com.har.entity.AppCustomerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@Mapper
public interface AppCustomerDao /*extends JpaRepository<AppCustomerEntity,Long> */{

}
