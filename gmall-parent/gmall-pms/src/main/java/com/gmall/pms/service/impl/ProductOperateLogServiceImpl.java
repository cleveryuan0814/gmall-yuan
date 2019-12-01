package com.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.pms.entity.ProductOperateLog;
import com.gmall.pms.mapper.ProductOperateLogMapper;
import com.gmall.pms.service.ProductOperateLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class ProductOperateLogServiceImpl extends ServiceImpl<ProductOperateLogMapper, ProductOperateLog> implements ProductOperateLogService {

}
