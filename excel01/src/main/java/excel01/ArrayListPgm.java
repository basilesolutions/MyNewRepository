package excel01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPgm {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Basil");
		al.add("Bincy");
		al.add("Devika");
		al.add("Jinta");
		al.add("Nithya");
		System.out.println(al);
		
		String element=al.get(3);
		System.out.println(element);
		
		Boolean b=al.contains("Basil");
		System.out.println(b);
		
		int length=al.size();
		System.out.println();
		al.remove(3);
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		for(String ob:al)
		{
			System.out.println(ob);
		}
		
		int arr[]={5,6,8,20};
		for (int c:arr)
		{
			System.out.println(c);
		}
		
	}

	
	
	}

