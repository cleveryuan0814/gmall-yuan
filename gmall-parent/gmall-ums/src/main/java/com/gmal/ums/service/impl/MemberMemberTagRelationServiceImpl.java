package com.gmal.ums.service.impl;

import com.gmall.ums.entity.MemberMemberTagRelation;
import com.gmall.ums.mapper.MemberMemberTagRelationMapper;
import com.gmall.ums.service.MemberMemberTagRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和标签关系表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class MemberMemberTagRelationServiceImpl extends ServiceImpl<MemberMemberTagRelationMapper, MemberMemberTagRelation> implements MemberMemberTagRelationService {

}
