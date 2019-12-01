package com.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.pms.entity.ProductAttributeCategory;
import com.gmall.pms.mapper.ProductAttributeCategoryMapper;
import com.gmall.pms.service.ProductAttributeCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 产品属性分类表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class ProductAttributeCategoryServiceImpl extends ServiceImpl<ProductAttributeCategoryMapper, ProductAttributeCategory> implements ProductAttributeCategoryService {

}
