package com.gmall.oms.service.impl;

import com.gmall.oms.entity.OrderOperateHistory;
import com.gmall.oms.mapper.OrderOperateHistoryMapper;
import com.gmall.oms.service.OrderOperateHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements OrderOperateHistoryService {

}
