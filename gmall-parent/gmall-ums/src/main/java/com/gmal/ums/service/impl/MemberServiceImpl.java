package com.gmal.ums.service.impl;

import com.gmall.ums.entity.Member;
import com.gmall.ums.mapper.MemberMapper;
import com.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
