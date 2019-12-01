package com.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.pms.entity.FeightTemplate;
import com.gmall.pms.mapper.FeightTemplateMapper;
import com.gmall.pms.service.FeightTemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 运费模版 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class FeightTemplateServiceImpl extends ServiceImpl<FeightTemplateMapper, FeightTemplate> implements FeightTemplateService {

}
