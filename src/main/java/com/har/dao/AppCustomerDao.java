package com.har.dao;

import com.har.entity.AppCustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppCustomerDao extends JpaRepository<AppCustomerEntity,Long> {

}
