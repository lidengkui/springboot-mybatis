package com.har;

import com.har.dto.AppCustomerDto;
import com.har.entity.AppCustomerEntity;
import com.har.service.AppCustomerService;
import com.har.service.query.AppCustomerTask;
import com.har.service.query.AppCustomerTaskService;
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
    @Autowired
    private AppCustomerTaskService appCustomerQueryService;
    @Test
    public void findByAppCode() {
        AppCustomerTask appCustomerDto = new AppCustomerTask();
        appCustomerDto.setCode("C000011");
        appCustomerQueryService.addTask(appCustomerDto);
        AppCustomerEntity appCustomerEntity = userService.findByAppCode("C000011");
       // System.out.println(appCustomerEntity.toString());

    }
    /*@Test
    public void findById() {

        AppCustomerEntity appCustomerEntity = userService.findById(1L);
        System.out.println(appCustomerEntity.toString());

    }*/

}
