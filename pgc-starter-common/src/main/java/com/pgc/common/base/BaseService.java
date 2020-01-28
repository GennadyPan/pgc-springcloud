package com.pgc.common.base;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * CreateTime: 2018-12-18 20:42
 * ClassName: BaseService
 * Package: com.pgc.common.base
 * Describe:
 * 基础的service接口，所有的service都要继承这个接口  如果有什么通用的方法，可自行扩展
 *
 * @author pgc
 */
public interface BaseService<T> extends IService<T> {
}
