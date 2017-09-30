package com.imooc.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author KeeYang on 2017/9/27.
 * @Description :
 */
@Entity
@Data
@DynamicUpdate
public class SellerInfo {

    @Id
    private String id;

    private String username;

    private String passwordk;

    private String openid;

    private Date createTime;

    private Date updateTime;


}
