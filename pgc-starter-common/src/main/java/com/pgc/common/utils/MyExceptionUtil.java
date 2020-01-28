package com.pgc.common.utils;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.pgc.common.exception.MyException;

/**
 * CreateTime: 2018-12-18 22:32
 * ClassName: MyExceptionUtil
 * Package: com.pgc.common.utils
 * Describe:
 * 异常工具类
 *
 * @author pgc
 */
public class MyExceptionUtil {

    public MyExceptionUtil() {
    }

    public static MyException mxe(String msg, Throwable t, Object... params){
        return new MyException(StringUtils.format(msg, params),t);
    }

    public static MyException mxe(String msg, Object... params){
        return new MyException(StringUtils.format(msg, params));
    }

    public static MyException mxe(Throwable t){
        return new MyException(t);
    }

}
