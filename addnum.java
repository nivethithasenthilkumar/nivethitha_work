public class addnum {
    public static void main (String[]args){
        int a=8,b=0;
        while(b!=0){
            int temp=a&b;
            a^=b;
            b=temp<<1;
        }System.out.print(a);


        }
    }
    

