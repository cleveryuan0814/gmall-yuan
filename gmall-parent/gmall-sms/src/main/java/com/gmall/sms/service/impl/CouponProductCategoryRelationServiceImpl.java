package com.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.sms.entity.CouponProductCategoryRelation;
import com.gmall.sms.mapper.CouponProductCategoryRelationMapper;
import com.gmall.sms.service.CouponProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 优惠券和产品分类关系表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class CouponProductCategoryRelationServiceImpl extends ServiceImpl<CouponProductCategoryRelationMapper, CouponProductCategoryRelation> implements CouponProductCategoryRelationService {

}
