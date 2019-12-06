package com.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.sms.entity.FlashPromotionLog;
import com.gmall.sms.mapper.FlashPromotionLogMapper;
import com.gmall.sms.service.FlashPromotionLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 限时购通知记录 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class FlashPromotionLogServiceImpl extends ServiceImpl<FlashPromotionLogMapper, FlashPromotionLog> implements FlashPromotionLogService {

}
