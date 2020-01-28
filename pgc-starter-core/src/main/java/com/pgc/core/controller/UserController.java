package com.pgc.core.controller;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.pgc.common.config.MybatisPlusConfig;
import com.pgc.common.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.pgc.core.service.UserService;
import com.pgc.core.entity.UserEntity;
import org.springframework.web.bind.annotation.RestController;
import com.pgc.common.base.BaseController;

import java.util.List;

/**
 * CreateTime: 2020-01-22
 * ClassName: UserController
 * Package: com.pgc.core.controller
 * Describe:
 *  前端控制器
 * @author pgc
 */
@RestController
@RequestMapping("UserController")
public class UserController extends BaseController<UserService,UserEntity> {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService service;

}
