
import java.util.Scanner;
public class Find_Day {
    public static void main(String[] args) {
        String arr[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Date:");
        int day=sc.nextInt();
        System.out.println("Enter Month:");
        int mon=sc.nextInt();
        System.out.println("Enter Year:");
        int year=sc.nextInt();
        int sum=0;
        int leap=0;
        if(year>2000)
        {
            for(int i=2001;i<year;i++)
            {
                sum=sum+365;
                if(i%4==0)
                {
                    leap+=1;
                   // System.out.println("okk"+leap);
                }
            }
           // System.out.println(sum);
                sum=sum+leap;
                int remain=sum%7;
            //System.out.println(remain);
            
            int sum2=0;
            for(int i=0;i<mon-1;i++)
            {
                sum2=sum2+month[i];

            }
            //System.out.println(sum2);
            int remain2=sum2%7;
            if(year%4==0)
            {
                remain2=remain2+1;
               //System.out.println("ok"+leap);

            }
            //System.out.println(remain2);
            int t_balance=remain+remain2+day;
            //System.out.println(t_balance);
            int original=t_balance%7;
            //System.out.println(original);
            if(original<5)
            {
                System.out.println(arr[original-1]);
            }
            else{
                if(original==5)
                {
                System.out.println(arr[0]);
                }
                else{
                System.out.println(arr[1]);
                }
                
            }
        }
        if(year==2000)
        {
             int sum2=0;
            for(int i=0;i<mon-1;i++)
            {
                sum2=sum2+month[i];

            }
            int remain2=sum2%7;
           
                remain2=remain2+1;
               //System.out.println("ok"+leap);

      
            //System.out.println(remain2);
            int t_balance=remain2+day;
            //System.out.println(t_balance);
            int original=t_balance%7;
            //System.out.println(original);
            if(original<5)
            {
                System.out.println(arr[original-1]);
            }
            else{
                if(original==5)
                {
                System.out.println(arr[0]);
                }
                else{
                System.out.println(arr[1]);
                }
                
            }
        }
    }
}
