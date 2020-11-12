package com.example.drp.Controller;

import com.example.drp.Entity.jcb_lottery_data;
import com.example.drp.Server.jcd_data_server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author LT
 * @create 2020-11-12
 */
@RestController
public class jcb_data_controller {
    @Autowired
    private jcd_data_server jcb;
    @PostMapping("/list")
    public List<jcb_lottery_data> ls(){
        return jcb.list();
    }
}
