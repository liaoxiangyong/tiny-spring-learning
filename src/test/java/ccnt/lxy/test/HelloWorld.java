package ccnt.lxy.test;

/**
 * Created by LXY on 2017/10/20.
 */
public class HelloWorld {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void helloWorld(){
        System.out.println("Hello World!"+this.name+"多少岁："+this.age);
    }
}
