// interface Drawable{  
//     public void draw();  
    
// }  
  
// public class main {  
//     public static void main(String[] args) {  
//         int width=10;  
          
//         //with lambda  
//         Drawable d2=()->{  
//             System.out.println("Drawing "+width);  
//         };  
//         d2.draw();  
//     }  
// }  
import java.io.*;
import java.util.*;

public class main{
    public static void main(String[] args)
    {
       String s=new String("Hello").intern();
       String s1=new String("Hello").intern();
       System.out.println(s==s1);
       System.out.println("---------------------");
       String g=new String("j").intern();
       String h=new String("j");
       System.out.println(g==h);
       System.out.println("---------------------");
       String j=new String("op");
       String k=new String("op").intern();
       System.out.println(j==k);
        System.out.println("---------------------");


       String a="h".intern();
       String b="h".intern();
       System.out.println(a==b);
       System.out.println("---------------------");
       String c="k";
       String d="k".intern();
       System.out.println(c==d);
       System.out.println("---------------------");
       String e="l".intern();
       String f="l";
       System.out.println(e==f);
       System.out.println("---------------------");


       String dd=new String("ll").intern();
       String hh="ll".intern();
       System.out.println(dd==hh);
        System.out.println("---------------------");
        String aa=new String("oo").intern();
        String op="oo";
        System.out.println(aa==op);
        System.out.println("---------------------");
        String uu=new String("kp");
        String ff="kp".intern();
        System.out.println(uu==ff);
        System.out.println("---------------------");

        
        String tt="jk".intern();
        String io=new String("jk").intern();
        System.out.println(tt==io);
        System.out.println("---------------------");
        String kl="jii".intern();
        String hj=new String("jii");
        System.out.println(kl==hj);
        System.out.println("---------------------");
        String y="kl";
        String p=new String("kl").intern();
        System.out.println(y==p);
        System.out.println("---------------------");


    }
}