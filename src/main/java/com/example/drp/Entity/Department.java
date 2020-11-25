package com.example.drp.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author LT
 * @create 2020-11-23 17:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("br_department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private  Integer did;
    //部门名称
    private  String dname;
    //所属公司
    private  Integer coid;
    //权限
    private  Integer djur;
    //删除标志
    private  char dflag;
    //更新时间
    private Date dupdate;
    //部门主管人姓名
    private  int Duid;
    //上级部门
    private Integer dorid;
    //备注信息
    private  String dpostscript;
}
