package CustomList.CustomList;
import java.util.*;
public class CustomList<T> 
{
    //Size of list
    private int size = 0;
     
    //Default capacity of list is 10
    private static final int CAPACITY = 10;
     
    //This array will store all list added to list
    private Object list[];
 
    //Default constructor
    public CustomList() {
        list = new Object[CAPACITY];
    }
 
    //Add method
    public void add(T e) {
        if (size == list.length) {
            extendCapacity();
        }
        list[size++] = e;
    }
     
    //Get method
    public T get(int i) {
    	return (T) list[i];
        
    }
     
    //Remove method
    public T remove(int i) {
        Object item = list[i];
        int num = list.length - ( i + 1 ) ;
        System.arraycopy( list, i + 1, list, i, num) ;
        size--;
		return (T) item;
    }
     
    //Get Size of list
    public int size() {
        return size;
    }
     
    //Print method
    @Override
    public String toString() 
    {
         String s="";
         s+='[';
         for(int i = 0; i < size ;i++) {
             s+=list[i].toString();
             if(i<size-1){
                 s+=",";
             }
         }
         s+=']';
         return s;
    }
     
    private void extendCapacity() {
        int newSize = list.length * 2;
        list = Arrays.copyOf(list, newSize);
    }
}