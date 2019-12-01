package com.gmall.oms.service.impl;

import com.gmall.oms.entity.OrderSetting;
import com.gmall.oms.mapper.OrderSettingMapper;
import com.gmall.oms.service.OrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单设置表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements OrderSettingService {

}
