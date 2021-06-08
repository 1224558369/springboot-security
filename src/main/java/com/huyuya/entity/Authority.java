package com.huyuya.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author huyu
 * @since 2021-06-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "auth_id", type = IdType.AUTO)
    private Integer authId;

    private String authName;

    private String authAlias;

    private String autoDescription;


}
