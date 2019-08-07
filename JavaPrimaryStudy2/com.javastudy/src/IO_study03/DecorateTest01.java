package IO_study03;

/**
 * @PackageName:IO_study03
 * @ClassName: DecorateTest01
 * @Description:
 * 1.抽象组件：需要装饰的抽象对象（接口或者抽象父类）
 * 2.具体组件：需要装饰的对象
 * 3.抽象装饰类：包含了对抽象组件的引用以及装饰折共有的方法
 * 4.具体装饰类：被装饰的对象
 * @author:Dong
 * @data 7月29-029 16:47
 */
public class DecorateTest01 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.say();

        //装饰
        Amplifier p2 = new Amplifier(p1);
        p2.say();

        }
}
interface Say{
    void say();
}
class Person implements Say{
    //属性
    private int voice = 10;
    @Override
    public void say(){
        System.out.println("人的声音为："+this.getVoice()+"分贝");
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
}
//模拟放大器
class Amplifier implements Say{
    private Person p;
    Amplifier(Person p){
        this.p = p;
    }
    @Override
    public void say(){
        System.out.println("人声音为："+p.getVoice()*100+"分贝，达到噪音级别");
    }
}

