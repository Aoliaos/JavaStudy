package alittle_game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

class game{
private JFrame jf=new JFrame("���ټ���boo!");
private int a=0;
private int e=100;
private JLabel jl=new JLabel();
private JLabel jl2=new JLabel("������!");
private JLabel jl6=new JLabel("��Ӯ��!");
private JLabel jl3=new JLabel("��ͣ");
private JLabel jl4=new JLabel();
private JLabel jl5=new JLabel();
private JLabel jl7=new JLabel("Boo!");

private JPanel jp=new JPanel();
private JTextField jt=new JTextField();
private   JMenuBar jm=new JMenuBar();
private JMenu jmenu=new JMenu("ѡ��");
private JMenuItem jm1=new JMenu("�ر�");
private JMenuItem jm2=new JMenu("�Ŵ�");
private JMenuItem jm3=new JMenu("����");
private boolean flag=false;
private boolean flag2=false;

private int b=50;
private int c=50;
private int d=2;

private Container con=null;
public game()throws Exception{
con=jf.getContentPane();
jmenu.add(jm1);
jmenu.add(jm2);
jmenu.add(jm3);
jm.add(jmenu);
jf.setJMenuBar(jm);





jf.setLayout(null);
jf.setSize(400, 400);

jl4.setBounds(0, 0, 300, 300);
jl2.setBounds(100, 100, 100, 100);
ImageIcon im=new ImageIcon("E:"+File.separator+"boo.png");
ImageIcon im2=new ImageIcon("E:"+File.separator+"ooo.png");
ImageIcon im3=new ImageIcon("E:"+File.separator+"bb.png");
ImageIcon im4=new ImageIcon("E:"+File.separator+"aa.png");
jl.setIcon(im);
jl5.setIcon(im4);
jp.add(jl5);
jl5.setBounds(225, 225, 100, 100);
jl2.setBounds(60, 60, 200, 100);
jl6.setBounds(60, 60, 200, 100);
jl7.setBounds(10, 100, 400, 150);
jp.setBackground(Color.cyan);
jl3.setBounds(100,100,100,100);
jl3.setVisible(false);
jp.add(jl3);
Font font=new Font("����",1,14);
Font font2=new Font("����",1,60);
jl2.setFont(font);
jl6.setFont(font);
jl3.setFont(font);
jl7.setFont(font);
jl.setBounds(50, 50, 50, 50);
jp.setBounds(0, 0, 400, 400);
jp.setLayout(null);
jp.add(jt);
jp.add(jl);
con.add(jp);
jp.add(jl2);
jp.add(jl6);
jp.add(jl7);
jl2.setVisible(false);
jl6.setVisible(false);
jl7.setVisible(false);
jf.setVisible(true);
jf.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent arg0){
System.exit(1);
}

});
jm2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent arg0){
System.out.println(11);
}
});
jm3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent arg0) {
// TODO �Զ����ɵķ������

System.out.println(11);


}

});
jm1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent arg0) {
// TODO �Զ����ɵķ������

System.out.println(11);


}

});


jt.addKeyListener(new KeyListener(){


@Override
public void keyPressed(KeyEvent arg0) {
if("���ϼ�ͷ".equals(KeyEvent.getKeyText(arg0.getKeyCode()))){// TODO �Զ����ɵķ������
System.out.println(KeyEvent.getKeyText(arg0.getKeyCode()));
flag=true;
a=1;
}
if("���¼�ͷ".equals(KeyEvent.getKeyText(arg0.getKeyCode()))){// TODO �Զ����ɵķ������
System.out.println(KeyEvent.getKeyText(arg0.getKeyCode()));
flag=true;
a=2;
}
if("�����ͷ".equals(KeyEvent.getKeyText(arg0.getKeyCode()))){// TODO �Զ����ɵķ������
System.out.println(KeyEvent.getKeyText(arg0.getKeyCode()));
flag=true;
a=3;
}
if("���Ҽ�ͷ".equals(KeyEvent.getKeyText(arg0.getKeyCode()))){// TODO �Զ����ɵķ������
System.out.println(KeyEvent.getKeyText(arg0.getKeyCode()));
flag=true;
a=4;
}
if("Enter".equals(KeyEvent.getKeyText(arg0.getKeyCode()))){// TODO �Զ����ɵķ������
System.out.println(KeyEvent.getKeyText(arg0.getKeyCode()));
if(d%2==0){
flag2=true;
}else{
flag2=false;
}
d++;


}
}

@Override
public void keyReleased(KeyEvent arg0) {
// TODO �Զ����ɵķ������

}

@Override
public void keyTyped(KeyEvent arg0) {

}});




while(1!=0){

Thread.sleep(1000);

if(flag==true){

for(int i=0;i<1000;i++){
if(flag2==false){
jl3.setVisible(false);
if((b<400&&c<400&&b>-50&&c>-50)){
if(!((b>200&&b<250)&&(c>200&&c<250))){

try {
if(e>5){

System.out.println(e);
Thread.sleep(e=200-2*i);
}else{
Thread.sleep(5);	
}
} catch (InterruptedException e1) {
// TODO �Զ����ɵ� catch ��
e1.printStackTrace();
}

if(a==1){
jl.setBounds(b, c=c-1*5, 50, 50);
jp.add(jl);
jl.setIcon(im);


}
if(a==2){
jl.setBounds(b, c=c+1*5, 50, 50);
jp.add(jl);
jl.setIcon(im2);
}
if(a==3){
jl.setBounds(b=b-1*5, c, 50, 50);
jp.add(jl);
jl.setIcon(im3);

}
if(a==4){
jl.setBounds(b=b+1*5, c, 50, 50);
jp.add(jl);
jl.setIcon(im3);
}}else{
jl6.setVisible(true);
jl7.setVisible(true);
jl7.setText("��ȫ�ٻ���"+e+" boo!���Ѿ��ѳ���ײ��֧��������");
}
}else {
jl2.setVisible(true);

}
}else{



jl3.setVisible(true);

}
}}}

}
}

public class dsf {

/**
 * @param args
 */
public static void main(String[] args)throws Exception {
// TODO �Զ����ɵķ������
new game();


}}

