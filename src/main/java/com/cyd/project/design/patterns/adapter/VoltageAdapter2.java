package com.cyd.project.design.patterns.adapter;

/**
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承src类，而是持有src类的实例，以解决兼容性的问题。
 * 即：持有 src类，实现 dst 类接口，完成src->dst的适配。
 * （根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系，因此大部分结构型模式都是对象结构型模式。）
 *
 * 对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。
 * 根据合成复用原则，组合大于继承，
 * 所以它解决了类适配器必须继承src的局限性问题，也不再强求dst必须是接口。
 * 同样的它使用成本更低，更灵活。
 *
 * （和装饰者模式初学时可能会弄混，这里要搞清，装饰者是对src的装饰，使用者毫无察觉到src已经被装饰了（使用者用法不变）。 这里对象适配以后，使用者的用法还是变的。
 * 即，装饰者用法： setSrc->setSrc，对象适配器用法：setSrc->setAdapter.)
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 16:10
 * @ClassName VoltageAdapter2
 * @Version: 1.0
 */
public class VoltageAdapter2 implements Voltage5 {
    private Voltage220 mVoltage220;

    public VoltageAdapter2(Voltage220 voltage220) {
        mVoltage220 = voltage220;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != mVoltage220) {
            int src = mVoltage220.output220V();
            System.out.println("对象适配器工作，开始适配电压");
            dst = src / 44;
            System.out.println("适配完成后输出电压：" + dst);
        }
        return dst;
    }
}