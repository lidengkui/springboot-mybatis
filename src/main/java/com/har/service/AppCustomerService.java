package com.har.service;

import com.har.entity.AppCustomerEntity;

public interface AppCustomerService {


    AppCustomerEntity findByAppCode(String code);

}
