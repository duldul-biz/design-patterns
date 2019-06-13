/**
 * 装饰器模式
 *
 *  以鸡尾酒和星巴克咖啡为例
 *
 *  原理就是一种东西可以和多种自己的基类组合  就比如我一杯鸡尾酒可以加入白兰地 再加入威士忌
 *  这时 每次都去new 对象再计算很麻烦  抽象他们的通性，我只要往杯子里添加酒即可。
 *
 *  星巴克咖啡的例子取自 https://blog.csdn.net/sinat_30035833/article/details/82386471
 */
package com.cyd.project.design.patterns.structure.decorator;