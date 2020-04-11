package designPattern;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/9 18:59
 * @Version 1.0
 **/
public class ObserverPatternTest {
    public static void main(String[] args) {
        FootballSubject 天下足球 = new FootballSubject("messi","天下足球");
        Fans zhangsan = new Fans(天下足球, "张三");
        zhangsan.subscribe();
        Fans lisi = new Fans(天下足球, "李四");
        lisi.subscribe();
        天下足球.say("大家好，很高兴看到大家");
        lisi.unSubscribe();
        天下足球.say("我第一次来中国");
        Fans wangwu = new Fans(天下足球, "王五");
        wangwu.subscribe();
        天下足球.say("今天的访谈结束了");
    }
}
