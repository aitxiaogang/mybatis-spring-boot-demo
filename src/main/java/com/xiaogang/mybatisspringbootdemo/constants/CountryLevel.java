package com.xiaogang.mybatisspringbootdemo.constants;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/27 22:34
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public enum CountryLevel {
    ONE("1","第一"),TWO("2","第二"),THREE("3","第三");
    private String code;
    private String desc;

    CountryLevel(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
