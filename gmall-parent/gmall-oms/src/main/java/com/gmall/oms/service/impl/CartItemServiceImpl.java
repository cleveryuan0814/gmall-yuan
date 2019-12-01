package com.gmall.oms.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gmall.oms.entity.CartItem;
import com.gmall.oms.mapper.CartItemMapper;
import com.gmall.oms.service.CartItemService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author cleveryuan
 * @since 2019-11-30
 */
@Service
@Component
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {


}
