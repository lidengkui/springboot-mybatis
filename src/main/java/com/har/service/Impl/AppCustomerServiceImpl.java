package com.har.service.Impl;

import com.har.dao.AppCustomerMapperExt;
import com.har.entity.AppCustomerEntity;
import com.har.service.AppCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppCustomerServiceImpl implements AppCustomerService {

    @Autowired
    private AppCustomerMapperExt appCustomer;

    @Override
    public AppCustomerEntity findByAppCode(String code) {
        return appCustomer.findByAppCode(code);
    }


}
