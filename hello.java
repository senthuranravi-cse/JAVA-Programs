import java.io.*;  
public class hello {  
    public static void main(String[] args) {  
        FileDescriptor fd = null;  
        byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 };  
        try  {  
            FileOutputStream fos = new FileOutputStream("/home/senthu/Downloads/hello.txt");  
            FileInputStream fis = new FileInputStream("/home/senthu/Downloads/hello.txt");  
            fd = fos.getFD();  
            fos.write(b);  
            fos.flush();  
            fd.sync();// confirms data to be written to the disk  
            int value = 0;  
            // for every available bytes  
            while ((value = fis.read()) != -1) {  
                char c = (char) value;// converts bytes to char  
                System.out.print(c);  
            }  
            System.out.println(fd);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}  
