package com.example.drp.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.websocket.server.PathParam;
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
    @TableId
    private Integer uid;
    /*
    * exist 为 false表示该属性不为数据库表字段，但又是必须使用的。
    * */
    @TableField(exist = true)
    private String uuser;
    @TableField(exist = true)
    private String upassword;
    @TableField(exist = true)
    private String uname;
    @TableField(exist = true)
    private Integer coid;
    @TableField(exist = true)
    private Integer did;
    @TableField(exist = true)
    private String uphone;
    @TableField(exist = true)
    private String uidcard;

    private char uflag;

    private Date uupdate;
}
