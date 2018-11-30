import java.util.*;
import java.lang.*;

public class SortMixedNumbers {
    public static void main(String[] args){
        MixedNumber[] list = new MixedNumber[5];

        for (int i = 0; i < list.length; i++){
            list[i] = new MixedNumber((long)(Math.random() * 8 + 1), (long)(Math.random() * 5 + 15), (long)(Math.random() * 9 + 1));
        }

        System.out.println("List:");

        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        
         sort(list);

         System.out.println("Sorted list:");
        
         for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }


    public static void sort(MixedNumber[] list){
       
        for(int i=0; i<list.length-2; ++i)
        {
            for(int j=i+1;j<list.length-1;++j)
            {
                if(list[i].compareTo(list[j])>0 )
                {
                    MixedNumber temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
       /*
        int counter = 0;

        if (list[0].compareTo(list[list.length - 1]) == 0){
             sortedList[4] = list[0];
             return;
        }

        MixedNumber min = list[0];

        for(int i = 1; i < list.length - 1; i ++){
            if(min.compareTo(list[i]) == 1){
                min = list[i];
            }
        }

        sortedList[counter] = min;
        counter++;

        MixedNumber[] newList;

        for(int i = 0; i >)
        */
    }
}