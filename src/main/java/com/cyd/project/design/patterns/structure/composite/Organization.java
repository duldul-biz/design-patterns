package com.cyd.project.design.patterns.structure.composite;

/**
 * @Description  总的接口  组织机构 提供统一的组织机构处理方式
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/11 9:23
 * @InterfaceName Organization
 * @Version: 1.0
 */
public interface Organization {
    default void add(Organization organization){
        throw new UnsupportedOperationException();
    }

    default void remove(Organization organization){
        throw new UnsupportedOperationException();
    }

    default String getName(){
        throw new UnsupportedOperationException();
    }

    default String getDescription(){
        throw new UnsupportedOperationException();
    }

    default void print(){
        throw new UnsupportedOperationException();
    }
}
