package com.xiaogang.mybatisspringbootdemo.model;

import com.xiaogang.mybatisspringbootdemo.constants.CountryLevel;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/27 22:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class Country {

    private Long id;

    private String countryName;

    private String countryCode;

    private CountryLevel countryLevel;

}
