package wuziqi;

import java.awt.*;
 
import javax.swing.*;
 
import java.awt.event.*;
import java.awt.Component;
//import java.awt.geom.Line2D;
 
 
public class Frame {
int [][]chess=new int[16][16];
boolean isBlack=true;
JFrame frame=new JFrame("欢迎来到五子棋！");
public  Frame() {     //游戏界面
 
 
 
frame.getContentPane().setBackground(Color.white);
 
paintLine panel=new paintLine();
panel.setBackground(Color.white);
 
JButton button1=new JButton("重新游戏");
JButton button2=new JButton("退出游戏");
panel.add(button1);
panel.add(button2);
 
button1.addActionListener(new ButtonReset());
button2.addActionListener(new ButtonQuit());   
 
 
frame.getContentPane().add(new paintLine());
 
frame.getContentPane().add(panel,BorderLayout.SOUTH);
frame.getContentPane().addMouseListener(new MousePress());
 
frame.setSize(600,600);
frame.setVisible(true);
}
 
public class ButtonQuit implements ActionListener{         //退出按钮
public void actionPerformed(ActionEvent e){
System.exit(1);
}
 
}
 
public class ButtonReset implements ActionListener{         //重新游戏按钮
public void actionPerformed(ActionEvent e){
for(int i=0;i<15;i++)
for(int j=0;j<15;j++){
chess[i][j]=0;
}
frame.getContentPane().repaint();
}
 
}
 
private class MousePress extends MouseAdapter {            //鼠标单击
    public void mousePressed(MouseEvent e) {
    
      int x = e.getX();
      int y = e.getY();
      if((x-130)%20<10)
      x=x-(x-130)%20;
      else x=x-(x-130)%20+20;
      if((y-50)%20<10)
      y=y-(y-50)%20;
      else y=y-(y-50)%20+20;
      x=(x-130)/20;
      y=(y-50)/20;
  
      
      if(chess[x][y]==0){
      if(isBlack){
      chess[x][y]=1;
      isBlack=false;
      
      }
      else{
      chess[x][y]=2;
          isBlack=true;
      }
 
    
    }
    else  ;
    
    frame.getContentPane().repaint();
    }
}
class paintLine extends JPanel{      //画图      
protected void paintComponent(Graphics g) {  
super.paintComponent(g);
 
 
int startX = 130;
    int startY = 50;
    for(int i=0; i<16; i++) {                    //*********绘制直线
      g.drawLine(startX, startY+20*i, startX+300, startY+20*i);
      g.drawLine(startX+20*i,startY, startX+20*i, startY+300);
    }
    
    for(int i=0;i<16;i++)             //画棋子
    for(int j=0;j<16;j++){
    if(chess[i][j]==1){          //画黑棋
    int cx=i*20+130;
    int cy=j*20+50;
    
    g.setColor(Color.black);
    g.fillOval(cx-10, cy-10, 20, 20);
    }
    else if(chess[i][j]==2){    //画白棋
    int cx=i*20+130;
    int cy=j*20+50;
    
    g.setColor(Color.white);
    g.fillOval(cx-10, cy-10, 20, 20);
    }
    checkWhite(chess);
    checkBlack(chess);
    }
    
    
    
}
 
}
 
 
void checkBlack(int p[][]){         //判断黑胜
boolean a=false;
int i=0,j=0;
for( j=0;j<16;j++)
for( i=0;i<12;i++)
if(p[i][j]==1&&p[i+1][j]==1&&p[i+2][j]==1&&p[i+3][j]==1&&p[i+4][j]==1)
a=true; 
 
for(i= 0;i<16;i++)
for(j=0;j<12;j++)
if(p[i][j]==1&&p[i][j+1]==1&&p[i][j+2]==1&&p[i][j+3]==1&&p[i][j+4]==1)
a=true;
 
 
for(i=0;i<12;i++)
for(j=0;j<12;j++)
if(p[i][j]==1&&p[i+1][j+1]==1&&p[i+2][j+2]==1&&p[i+3][j+3]==1&&p[i+4][j+4]==1)
a=true;
 
 
for(i=5;i<16;i++)
for(j=0;j<12;j++)
if(p[i-1][j+1]==1&&p[i-2][j+2]==1&&p[i-5][j+5]==1&&p[i-3][j+3]==1&&p[i-4][j+4]==1)
a=true;
 
if(a==true){
for( i=0;i<16;i++)
for( j=0;j<16;j++){
chess[i][j]=0;
}
frame.getContentPane().repaint();
new heisheng();
isBlack=true;
}
 
 
 
}
 
void checkWhite(int p[][]){               //判断白胜
boolean a=false;
int i=0,j=0;
for( j=0;j<16;j++)
for( i=0;i<12;i++)
if(p[i][j]==2&&p[i+1][j]==2&&p[i+2][j]==2&&p[i+3][j]==2&&p[i+4][j]==2)
a=true; 
 
for(i= 0;i<16;i++)
for(j=0;j<12;j++)
if(p[i][j]==2&&p[i][j+1]==2&&p[i][j+2]==2&&p[i][j+3]==2&&p[i][j+4]==2)
a=true;
 
 
for(i=0;i<12;i++)
for(j=0;j<12;j++)
if(p[i][j]==2&&p[i+1][j+1]==2&&p[i+2][j+2]==2&&p[i+3][j+3]==2&&p[i+4][j+4]==2)
a=true;
 
 
for(i=5;i<16;i++)
for(j=0;j<11;j++)
if(p[i-1][j+1]==2&&p[i-2][j+2]==2&&p[i-5][j+5]==2&&p[i-3][j+3]==2&&p[i-4][j+4]==2)
a=true;
 
if(a==true){
for( i=0;i<16;i++)
for( j=0;j<16;j++){
chess[i][j]=0;
}
frame.getContentPane().repaint();
new baisheng();
isBlack=true;
}
 
 
 
}
 
public class heisheng extends JFrame{                     //黑胜信息
JLabel e=new JLabel();
 
public heisheng() {
e.setBounds(150,100,100,50);
e.setText("黑方胜！");
this.getContentPane().add(e);
this.setLocation(180,100);
this.setLayout(null);
this.setSize(300,300);
  this.setVisible(true);
  this.addWindowListener(new WindowAdapter() {
     public void windowClosing(WindowEvent ev) {
     dispose();
     }
});
}
 
}
 
 
 
 
 
 
public class baisheng extends JFrame{          //判断白胜
JLabel e=new JLabel();
 
public baisheng() {
e.setBounds(150,100,100,50);
e.setText("白方胜！");
this.getContentPane().add(e);
this.setLocation(180,100);
this.setLayout(null);
this.setSize(300,300);
  this.setVisible(true);
  this.addWindowListener(new WindowAdapter() {
     public void windowClosing(WindowEvent ev) {
     dispose();
     }
});
}
 
}
 
 
 
 
 
 
 
 
 
 
 
 
public static void main(String[] args){
 
 
new Frame();
 
 
 
 
}
 
 
}