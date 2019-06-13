/**
 * 桥接模式
 *
 * driver 类 里 定义了 DriverSource接口  并有两个实现 driver方法具体调用谁 根据setDriverSource的结果决定
 * 数据库的连接就通过了桥接模式 加载了驱动程序
 */
package com.cyd.project.design.patterns.structure.bridge;