package practicing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapping {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map map = new HashMap();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			map.put(name,new Integer(phone));
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			
			System.out.println(map.get(s)==null?"Not found":s+"="+map.get(s));
		}
	}

}
