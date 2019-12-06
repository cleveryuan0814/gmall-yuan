package com.gmal.ums.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gmall.ums.entity.Admin;
import com.gmall.ums.mapper.AdminMapper;
import com.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    AdminMapper adminMapper;


    @Override
    public Admin login(String username, String password) {

        String pwd= DigestUtils.md5DigestAsHex(password.getBytes());

        QueryWrapper<Admin> wrapper= new QueryWrapper<Admin>().eq("username",username).eq("password",pwd);

        return adminMapper.selectOne(wrapper);


    }
}
