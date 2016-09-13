import java.util.*;
public class Collections{
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the item to be sold");
	String item;
	item=sc.nextLine();
	boolean b=check(item);
}
public static boolean check(String item)
{
HashMap<String, Integer> map=new HashMap<String, Integer>();
map.put("Pen", 100);
map.put("Pencil", 80);
map.put("MacBook Pro", 3);
map.put("Power Bank", 10);
map.put("Beats Headphones", 7);
map.put("Cracking the coding interview book",11);
Set s=map.entrySet();
Iterator it=s.iterator();
while(it.hasNext()) {
   Map.Entry m=(Map.Entry)it.next();
   System.out.println("The item "+ m.getKey() + " is present in  "+m.getValue()+" quantity.");
}

if(map.containsKey(item))
{
int val=(Integer)map.get(item);
if(val<=3)
{
	System.out.println("Order more quantity of "+item);
}
int v=val-1;
System.out.println(item+" sold");
System.out.println(v+" more "+item+" available.");
return true;
}
else
{
System.out.println("Item is not present");
return false;
}
}
}