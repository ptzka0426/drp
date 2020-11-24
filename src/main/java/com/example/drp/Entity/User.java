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
 * @create 2020-11-20 14:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("br_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private String uuser;

    private String upassword;

    private String uname;

    private Integer coid;

    private Integer did;

    private String uphone;

    private String uidCard;

    private char uflag;

    private Date uupdate;
}
