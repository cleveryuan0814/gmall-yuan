package com.gmall.ums.service;

import com.gmall.ums.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
public interface AdminService extends IService<Admin> {

    Admin login(String username, String password);
}
