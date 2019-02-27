package com.xiaogang.mybatisspringbootdemo.constants;

import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/27 22:52
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface BaseMapper<T> extends MySqlMapper<T>, tk.mybatis.mapper.common.Mapper<T> {
}
