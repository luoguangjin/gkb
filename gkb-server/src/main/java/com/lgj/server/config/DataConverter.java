package com.lgj.server.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 日期转换类
 */
@Component
public class DataConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String source) {

        //ctrl+alt+T是抛异常的快捷键
        try {
            return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
