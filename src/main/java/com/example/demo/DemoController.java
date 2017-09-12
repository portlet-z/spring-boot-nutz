package com.example.demo;

import org.nutz.dao.Dao;
import org.nutz.dao.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: 张新征
 * Date: 2017/9/12 11:11
 * Description:
 */
@RestController("/demo")
public class DemoController {

    @Autowired
    private Dao dao;

    @GetMapping
    public String demo(){
        List<Record> list = dao.query("admin", null);
        return list.toString();
    }
}
