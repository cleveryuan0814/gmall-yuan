package com.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.pms.entity.Product;
import com.gmall.pms.mapper.ProductMapper;
import com.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
