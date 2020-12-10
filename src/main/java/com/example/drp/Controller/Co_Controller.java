package com.example.drp.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.drp.Entity.Co;
import com.example.drp.Server.Co_Server;
import com.example.drp.Util.FTPUtil;
import com.example.drp.common.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import java.util.*;

/**
 * @Author LT
 * @create 2020-11-23 11:17
 */
@RestController
public class Co_Controller {
    @Autowired
    private Co_Server co_server;

    /*新增*/
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Result save(Co co) {
       /* Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println(year + "-" + month + "-" + date + " " +hour + ":" +minute + ":" + second);*/

        /*Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//可以方便地修改日期格式
        String hehe = dateFormat.format( now );
        System.out.println(hehe);*/

        co.setUupdate(new Date());
        co.setUflag('0');
        try {
            boolean b = co_server.save(co);
            if (b) {
                return Result.SUCCESS();
            } else {
                return Result.FAIL();
            }
        }catch (Exception e){
            return Result.FAIL();
        }
    }

    /*分页查询*/
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public List<Co> list(int pageNo, int pageSize, int desc) {
        IPage<Co> page = new Page<>(pageNo, pageSize);
        QueryWrapper<Co> wrapper = new QueryWrapper<>();
        /* Co co = new Co();
         *//*co.setCoid(1);*//*
        wrapper.setEntity(co);*/
        if (desc == 1) {
            wrapper.orderByAsc("uupdate");
        } else {
            wrapper.orderByDesc("uupdate");
        }
        co_server.page(page, wrapper).getRecords();
        //List<Co> cos= (List<Co>) JSONArray.parse(co_server.page(page,wrapper).toString());
        return co_server.page(page, wrapper).getRecords();
    }

    @RequestMapping(value = "/size", method = RequestMethod.POST)
    public int list() {

        return co_server.size();
    }

    /*删除*/
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public boolean del(int id) {
        Map<String, Object> map = new HashMap<>();
        map.put("coid", id);
        return co_server.removeById(id);
        //co_server.removeByMap(map);
    }

    /*修改*/
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public boolean update(Co co) {
        return co_server.updateById(co);
    }

    /*获取全部的公司名称和id    下拉列表*/
    @RequestMapping(value = "/listselect", method = RequestMethod.POST)
    public List<Map<Object, Object>> select() {
        return co_server.colist();
    }

    //文件上传
    /*@RequestMapping(value = "/file", method = RequestMethod.POST)
    public boolean add(String url) throws IOException {
        return FTPUtil.addFtp(url);
    }*/
    @RequestMapping(value = "files", method = RequestMethod.POST)
    public Result dome1(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws Exception{
        //file对象名记得和前端name属性值一致
        System.out.println(file.getOriginalFilename());
        try {
            boolean b =  FTPUtil.addFtp(file);
            if (b) {
                return Result.SUCCESS();
            } else {
                return Result.FAIL();
            }
        }catch (Exception e){
            return Result.FAIL();
        }
    }
}
