package com.suhuan.homework6;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 17:31
 */
public enum Color implements Interface_{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值："+redValue+","+greenValue+","+blueValue);

    }
}
interface Interface_{

    void show();

}
class Test{
    public static void main(String[] args) {
        Color color = Color.BLACK;
        color.show();

        switch(color){
            case YELLOW:
                System.out.println("黄");break;
            case BLACK:
                System.out.println("黑");break;
            case BLUE:
                System.out.println("蓝");break;
            case RED:
                System.out.println("红");break;
            case GREEN:
                System.out.println("绿");break;
            default:
                System.out.println("没有匹配到");
                break;
        }
    }
}
