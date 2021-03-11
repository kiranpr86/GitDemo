import java.util.ArrayList;
import java.util.Iterator;

public class ArraListbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> mylist=new ArrayList<String>();
	
	mylist.add("kiran");
	
	mylist.add("surya");
	
	mylist.add("Aami");
	
	ArrayList<String> mylist1=new ArrayList<String>();
	
	mylist1.add("Father");
	
	mylist1.add("Mother");
	
	mylist1.add("Daughter");
	

	
Iterator<String> it=mylist.iterator();
while(it.hasNext())
	
{
	System.out.println(mylist.get(0));
	it.next();
}
	
	}

}
