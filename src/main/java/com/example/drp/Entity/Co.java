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
 * @create 2020-11-23 11:09
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("br_co")
public class Co implements Serializable {
    private static final long serialVersionUID = 1L;
    //公司ID
    @TableId
    private Integer coid;
    //公司名称
    private String coname;
    //公司联系电话
    private String cotell;
    //公司邮箱
    private String coemail;
    //公司地址
    private String coadress;
    //删除标志（前端不用管）
    private char uflag;
    //更新日期（前端不用管）
    private Date uupdate;
}
