package com.gmal.ums.service.impl;

import com.gmall.ums.entity.MemberTag;
import com.gmall.ums.mapper.MemberTagMapper;
import com.gmall.ums.service.MemberTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户标签表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class MemberTagServiceImpl extends ServiceImpl<MemberTagMapper, MemberTag> implements MemberTagService {

}
