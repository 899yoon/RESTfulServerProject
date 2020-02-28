package com.example.demo.Controller;
 
 import org.mybatis.spring.annotation.MapperScan;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.bind.annotation.RestController;
 import com.example.demo.Dao.TestDao;
 import com.example.demo.Dto.TestVo;

@RestController

 @EnableAutoConfiguration


@MapperScan(basePackages = "com.example.demo.Dao")

	public class TestController {
         @Autowired
         private TestDao testDao;
         
         @RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
         public TestVo users(TestVo insert) throws Exception {
             testDao.newBoard(insert);
             return insert;
         }
 

 }
 
