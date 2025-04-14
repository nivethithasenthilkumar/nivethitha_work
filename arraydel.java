import java.util.*;
public class arraydel {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
int arr[]={1,2,3,4,5,6};
int n=arr.length;
int new_arr[]=new int[n-1];
System.out.println("enter the index to be deleted");
int index=sc.nextInt();
System.out.println("enter the value to be deleted");
int value=sc.nextInt();
if(index<0||index>=n){
System.out.print("Index range out of bound");
}
else{
    for(int i=0;i<index;i++){
new_arr[i]=arr[i];
    }
    System.out.print(Arrays.toString(arr));
    }
}

}



































    

