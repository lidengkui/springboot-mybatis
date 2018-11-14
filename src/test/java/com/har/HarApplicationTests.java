package com.har;

import com.har.entity.AppCustomerEntity;
import com.har.service.AppCustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HarApplicationTests {

    @Autowired
    private AppCustomerService userService;
    @Test
    public void findByAppCode() {

        AppCustomerEntity appCustomerEntity = userService.findByAppCode("C000011");
        System.out.println(appCustomerEntity.toString());

    }

}
