package com.gmal.ums.service.impl;

import com.gmall.ums.entity.MemberTask;
import com.gmall.ums.mapper.MemberTaskMapper;
import com.gmall.ums.service.MemberTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员任务表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class MemberTaskServiceImpl extends ServiceImpl<MemberTaskMapper, MemberTask> implements MemberTaskService {

}
