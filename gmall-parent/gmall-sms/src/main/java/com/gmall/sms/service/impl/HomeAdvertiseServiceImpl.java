package com.gmall.sms.service.impl;

import com.gmall.sms.entity.HomeAdvertise;
import com.gmall.sms.mapper.HomeAdvertiseMapper;
import com.gmall.sms.service.HomeAdvertiseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 首页轮播广告表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class HomeAdvertiseServiceImpl extends ServiceImpl<HomeAdvertiseMapper, HomeAdvertise> implements HomeAdvertiseService {

}
