package com.gmall.sms.service.impl;

import com.gmall.sms.entity.FlashPromotionSession;
import com.gmall.sms.mapper.FlashPromotionSessionMapper;
import com.gmall.sms.service.FlashPromotionSessionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 限时购场次表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class FlashPromotionSessionServiceImpl extends ServiceImpl<FlashPromotionSessionMapper, FlashPromotionSession> implements FlashPromotionSessionService {

}
