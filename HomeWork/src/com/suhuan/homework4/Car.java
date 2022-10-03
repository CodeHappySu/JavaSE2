package com.suhuan.homework4;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 17:18
 */
public class Car {

    private double temperature;

    public Car(double temperature){
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("空调大于了40，吹冷气");
            } else if (temperature < 0) {
                System.out.println("空调小于0度，吹暖气");
            } else {
                System.out.println("关闭空调");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }

}
class Test{

    public static void main(String[] args) {
        Car car = new Car(60.2);
        Car car1 = new Car(-0.2);
        car.getAir().flow();
        car1.getAir().flow();
    }

}

