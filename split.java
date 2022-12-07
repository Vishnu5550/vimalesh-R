package j;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.*;
import java.util.concurrent.ExecutionException;
public class split {
	public static void main(String[] args)throws Exception{
     Scanner sc=new Scanner(System.in);
     
     enum level{
    	 HIGH,
    	 MEDIUM,
    	 LOWvi
    	 }
     String value=sc.nextLine();
     String[] array=value.split("#");
     
     
     System.out.println(array[0]);
     try {
     Date date = new SimpleDateFormat("DD.MM.YY").parse(array[1]);
     System.out.println(date);
     }
     catch(Exception e) {
    	 System.out.print("invalid date");
     }
     try{
     level levelEnum =  level.valueOf(array[2]);
     System.out.print(levelEnum);
     }
     catch(Exception e) {
    	 System.out.print("invalid severity ");
     
	}
     }}


