package com.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.sms.entity.CouponProductRelation;
import com.gmall.sms.mapper.CouponProductRelationMapper;
import com.gmall.sms.service.CouponProductRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 优惠券和产品的关系表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class CouponProductRelationServiceImpl extends ServiceImpl<CouponProductRelationMapper, CouponProductRelation> implements CouponProductRelationService {

}
