package com.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.pms.entity.ProductAttribute;
import com.gmall.pms.mapper.ProductAttributeMapper;
import com.gmall.pms.service.ProductAttributeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品属性参数表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeMapper, ProductAttribute> implements ProductAttributeService {

}
