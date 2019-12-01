package com.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.pms.entity.Album;
import com.gmall.pms.mapper.AlbumMapper;
import com.gmall.pms.service.AlbumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
