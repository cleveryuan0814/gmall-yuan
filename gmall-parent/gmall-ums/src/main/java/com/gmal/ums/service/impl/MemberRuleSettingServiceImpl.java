package com.gmal.ums.service.impl;

import com.gmall.ums.entity.MemberRuleSetting;
import com.gmall.ums.mapper.MemberRuleSettingMapper;
import com.gmall.ums.service.MemberRuleSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员积分成长规则表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class MemberRuleSettingServiceImpl extends ServiceImpl<MemberRuleSettingMapper, MemberRuleSetting> implements MemberRuleSettingService {

}
