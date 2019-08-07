package Thread_study03;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:Thread_study03
 * @ClassName: HappyCinema666
 * @Description:
 * @author:Dong
 * @data 7月31-031 14:49
 */
public class HappyCinema666 {
    public static void main(String[] args){
        //可用位置
        List<Integer> available =new ArrayList<Integer>();
        available.add(1);
        available.add(2);
        available.add(3);
        available.add(6);
        available.add(7);

        //顾客需要的位置
        List<Integer> seats1 =new ArrayList<Integer>();
        seats1.add(1);
        seats1.add(2);
        List<Integer> seats2 =new ArrayList<Integer>();
        seats2.add(3);
        seats2.add(6);
        DDCinema ddc = new DDCinema(available,"北影");
        new Thread(new HappyCustomer(ddc,seats1),"zhangsan").start();
        new Thread(new HappyCustomer(ddc,seats2),"lisi").start();
        }
}
class HappyCustomer implements Runnable{
    DDCinema cinema;
    //用户要买的座位号
    List<Integer> seats;

    public HappyCustomer(DDCinema cinema, List<Integer> seats) {
        this.cinema = cinema;
        this.seats = seats;
    }

    @Override
    public void run(){
        synchronized(cinema){
            boolean flag = cinema.bookTickets(seats);
            if(flag){
                System.out.println("出票成功！"+Thread.currentThread().getName()+"位置为：-->"+seats);
            }else{
                System.out.println("出票失败！"+Thread.currentThread().getName());
            }
        }
    }
}
//影院
class DDCinema {
    List<Integer> available;
    String name;

    public DDCinema(List<Integer> available, String name) {
        this.available = available;
        //影院名称
        this.name = name;
    }

    //购票
    public boolean bookTickets(List<Integer> seats){
        System.out.println("欢迎光临"+this.name+",当前剩余座位号码为"+available);
        List<Integer> copy = new ArrayList<Integer>();
        copy.addAll(available);

        //相减
        copy.removeAll(seats);

        if(available.size() - copy.size() != seats.size()){
            return false;
        }
        //成功
        available = copy;
        return true;
    }
}

