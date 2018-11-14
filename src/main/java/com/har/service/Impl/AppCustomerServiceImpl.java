package com.har.service.Impl;

import com.har.dao.AppCustomerDao;
import com.har.dao.mapper.AppCustomerMapper;
import com.har.entity.AppCustomerEntity;
import com.har.service.AppCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("appCustomerService")
public class AppCustomerServiceImpl implements AppCustomerService {

    @Autowired
    private AppCustomerMapper appCustomer;
    @Autowired
    private AppCustomerDao appCustomerDao;

    @Override
    public AppCustomerEntity findByAppCode(String code) {
        return appCustomer.findByAppCode(code);
    }

    @Override
    public AppCustomerEntity findById(Long id) {
        return null;
    }


}
