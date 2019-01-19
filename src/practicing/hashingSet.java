package practicing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hashingSet {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        Set set = new HashSet();
        
        for (int i = 0; i < t; i++) {
            String s1 =  s.next();
            String s2 = s.next();
            s.nextLine();
            if(!set.contains(s1+"$"+s2)) set.add(s1+"$"+s2);
            System.out.println(set.size());
        }

	}

}
