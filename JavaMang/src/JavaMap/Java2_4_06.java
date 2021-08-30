package JavaMap;

import java.util.Map;
import java.util.TreeMap;


public class Java2_4_06 {
public static void main(String[] args) {
	int a[] = {1,1,2,5,1};
    TreeMap<Integer, Integer> treemap = new TreeMap<Integer, Integer>();
    for(int i = 0; i < a.length;i++)
    {
    
    	addElement(treemap, a[i]);
    	
    }
    System.out.println("cac phan tu xuat hien 1 lan la ");
    for(Integer key : treemap.keySet())
    {
    	if(treemap.get(key) == 1)
    	{
    		System.out.println(key);
    	}
    }
}
public static void addElement(Map<Integer, Integer> map, int e)
{
	if(map.containsKey(e))
	{
	   int cout = map.get(e)+1;
	   map.put(e, cout);
	}
	else
	{
		map.put(e, 1);
		
	}
}
}
