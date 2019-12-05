package algo_searching_array;
import java.util.Scanner;
public class Algo_searching_Array {
    public static void main(String[] args) {
        // TODO code application logic here
        int F=0,L=6,mid,sk = 6,index;
        int arr[]= {2,5,6,7,10,15,20};
        for (int i = 0; i < L; i++) {
            mid = (F+L)/2;
            if(arr[mid] == sk){
                System.out.println("Found : "+arr[mid]+" | Index is : "+mid);
                break;
            }else if(arr[mid]>sk){
                mid = (mid-1)/2; 
                if(arr[mid] == sk){
                    System.out.println("Found : "+arr[mid]+" | Index is : "+mid);
                    break;
                }else if(arr[mid]<sk){
                    index = mid+1;
                    System.out.println("Found : "+arr[index]+" | Index is : "+index);
                    break;
                }else{
                    index = mid-1;
                    System.out.println("Found : "+arr[index]+" | Index is : "+index);
                    break;
                }
            }else{
                mid = (mid+1+L)/2; 
                if(arr[mid] == sk){
                    System.out.println("Found : "+arr[mid]+" | Index is : "+mid);
                    break;
                }else if(arr[mid]<sk){
                    index = mid+1;
                    System.out.println("Found : "+arr[index]+" | Index is : "+index);
                    break;
                }else{
                    index = mid-1;
                    System.out.println("Found : "+arr[index]+" | Index is : "+index);
                    break;
                }
            }
        }
    }
    
}
