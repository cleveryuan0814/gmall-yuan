package com.gmall.sms.service.impl;

import com.gmall.sms.entity.HomeNewProduct;
import com.gmall.sms.mapper.HomeNewProductMapper;
import com.gmall.sms.service.HomeNewProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 新鲜好物表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class HomeNewProductServiceImpl extends ServiceImpl<HomeNewProductMapper, HomeNewProduct> implements HomeNewProductService {

}
