// // interface p{
// //     void mai();
// // }
// // interface p1 extends p{
// //     void mai2();
// // }
// // class b implements p1{
// //     public void mai()
// //     {
// //         System.out.println("Hello");
// //     }
// //     public void mai2()
// //     {
// //         System.out.println("hi");
// //     }
// // }
// // class Test{
// //     public static void main(String[] args)
// //     {
// //         b obj =new b();
// //         obj.mai2();
// //     }
// // }
// import java.util.*;
// import java.util.regex.Pattern;
// // class A{
// //     class B{
// //         void mai()
// //         {
// //             System.out.println("hi");
// //         }
// //     }
// // }
// import java.io.*;

// class Test {
//     static void mao(int arr[]) throws IOException
//     {
//         HashSet<Integer> hs=new HashSet<>();
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++){
//             if(arr[i]>arr[j])
//             {
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }

//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             hs.add(arr[i]);
//         }
//         FileOutputStream f=new FileOutputStream("D:\\VS code Programs\\sort.txt");
//         BufferedOutputStream fr=new BufferedOutputStream(f);
        
//         for(Integer x:hs)
//         {
//           int i = x;
//             String str = Integer.toString(i); // Convert int to String and add a newline
//             fr.write(str.getBytes());
//         }
//         fr.close();
//         f.close();


//     }
    
//     public static void main(String[] args) throws IOException {
//         try {
//             FileInputStream f = new FileInputStream("D:\\VS code Programs\\sort.txt");
//             BufferedReader br = new BufferedReader(new InputStreamReader(f));
//             int[] arr = new int[20];
//             int count = 0;
//             String line;
            
//             while ((line = br.readLine()) != null && count < 20) {
//                 // Assuming each line contains a single integer
//                 int num = Integer.parseInt(line.trim());
//                 arr[count] = num;
//                 count++;
//             }
            
//             for (int i = 0; i < count; i++) {
//                 System.out.println(arr[i]);
//             }
//             mao(arr);
            
//             br.close();
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         }
//     }
// }
import java.io.IOException;
import java.math.*;
import java.util.Date;
class a{
    void Tes()
    {
        System.out.println("hello Parent class");
    }
    void f()
    {
        System.out.println(10);
    }
}
class b extends a{
    void Tes()
    {
        super.Tes();
        System.out.println("this is child class");
    }
    
}

public class Test{
    public static void main(String [] args) throws IOException
    {
        // int n=123454321;
        // int t=n;
        // int temp=0;
        
        // int k=n;
        // int count=0;
        // while(k!=0)
        // {
        //     count+=1;
        //     k=k/10;
        // }
        // System.out.println(count);
        // int i=10;
        // while(t!=0)
        // {

        //     temp=(int) (temp+((Math.pow(i,count-1))*(t%10)));
        //     count-=1;
        //    // System.out.println(temp);
        //     t=t/10;
        // }
        // System.out.println(temp);
        // if(temp==n)
        // {
        //     System.out.println("palindrome");
        // }
    // a r=new b();
    // r.f();
    Date d=new Date();
    System.out.println(d);
        // b t =new b();
        // t.Tes();
       
    }
}