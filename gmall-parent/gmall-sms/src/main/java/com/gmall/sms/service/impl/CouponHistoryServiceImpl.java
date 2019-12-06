package com.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.sms.entity.CouponHistory;
import com.gmall.sms.mapper.CouponHistoryMapper;
import com.gmall.sms.service.CouponHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 优惠券使用、领取历史表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryMapper, CouponHistory> implements CouponHistoryService {

}
