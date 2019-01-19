package practicing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class itera {
	static Iterator func(ArrayList mylist){
	      Iterator it=mylist.iterator();
	      while(it.hasNext()){
	    	  String n =(String)String.valueOf( it.next()) ;
	          if( n!= "###"){
	              it.remove();
	          }if(n == "###")
				break;
			}
	      return it;
	      
	   }
	   public static void main(String []args){
	      ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      Integer n =new Integer(sc.nextInt());
	      Integer m = new Integer(sc.nextInt());
	      for(int i = 0;i<n.intValue();i++){
	         mylist.add(new Integer(i));
	      }
	      
	      mylist.add("###");
	      for(int i=0;i<m.intValue();i++){
	         mylist.add(sc.next());
	      }
	      
	      Iterator it=func(mylist);
	      while(it.hasNext()){
	         Object element = it.next();
	         System.out.println((String)element);
	      }
	   }

}
