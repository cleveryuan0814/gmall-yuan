package com.gmall.oms.service.impl;

import com.gmall.oms.entity.OrderItem;
import com.gmall.oms.mapper.OrderItemMapper;
import com.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
