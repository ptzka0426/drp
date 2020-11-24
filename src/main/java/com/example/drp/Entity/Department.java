package com.example.drp.Entity;

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

    private  Integer did;
    private  String dname;
    private  Integer coid;
    private  Integer djur;
    private  char dflag;
    private Date dupdate;
}
