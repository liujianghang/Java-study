package java_study.Java_Object;

public class Java17_Object_Interface {
    public static void main(String[] args) {
        // TODO 面向对象 - Interface
        //  可以简单理解为规则
        //  基本语法：interface 接口名称{规则属性，规则行为}
        //  接口其实是抽象的
        //  规则的属性必须为固定值，且不能修改，属性和方法的访问权限为公共
        //  属性是静态的（和某一个对象无关）
        //  行为是抽象的
        //  接口和类是两个层面上的东西。接口只是让对象遵循这个规则：实现接口（实现多个接口）
        Computer computer = new Computer();
        Light light1 = new Light();
        Light light2 = new Light();
        computer.usb1 = light1; // 很奇妙
        computer.usb2 = light2;
        computer.powerSupply();

    }
}

interface USBInterface {

}

interface USBSupply extends USBInterface {
    public void powerSupply(); // 抽象的 abstract省略了
}

interface USBReceive extends USBInterface {
    public void powerReceive();
}

class Computer implements USBSupply {
    public USBReceive usb1;
    public USBReceive usb2;

    @Override
    public void powerSupply() {
        System.out.println("电脑能提供电源");
        usb1.powerReceive(); // 调用usb1的接收电源
        usb2.powerReceive(); // 调用usb2的接收电源
    }
}
class Light implements USBReceive{

    @Override
    public void powerReceive() {
        System.out.println("电灯接受能源");
    }
}

