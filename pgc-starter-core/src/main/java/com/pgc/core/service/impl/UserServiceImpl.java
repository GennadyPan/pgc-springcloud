package com.pgc.core.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.pgc.core.entity.UserEntity;
import com.pgc.core.dao.UserDao;
import com.pgc.core.service.UserService;
import com.pgc.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * CreateTime: 2020-01-22
 * ClassName: UserServiceImpl
 * Package: com.pgc.core.service.impl
 * Describe:
 *  业务逻辑接口的实现类
 * @author pgc
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, UserEntity> implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao dao;

}
