package com.example.drp.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author LT
 * @create 2020-11-11 17:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("jcb_lottery_data")
public class jcb_lottery_data implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;
    @TableField("type")
    private Integer type;
    @TableField("number")
    private String number;
    @TableField("data")
    private String data;
    @TableField("time")
    private String time;
}
