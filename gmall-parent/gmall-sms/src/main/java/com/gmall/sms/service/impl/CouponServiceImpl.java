package com.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.sms.entity.Coupon;
import com.gmall.sms.mapper.CouponMapper;
import com.gmall.sms.service.CouponService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 优惠卷表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements CouponService {

}
