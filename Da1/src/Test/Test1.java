package Test;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        random1(array);
        System.out.println(Arrays.toString(array));
    }
    public static void random1(int[] array)
    {
        int[] dataSource=Arrays.copyOf(array,array.length);
        Random random=new Random();
        for (int i = 0; i < array.length; i++) {
            int index=random.nextInt(dataSource.length);
            int element=dataSource[index];
            array[i]=element;
            System.arraycopy(dataSource,index+1,dataSource,index,dataSource.length-1-index);
            dataSource=Arrays.copyOf(dataSource,dataSource.length-1);
        }
    }
}
