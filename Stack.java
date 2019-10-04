import java.util.*;
class Stack
{
	int top=-1;
    ArrayList list=new ArrayList();
	
	public void push(int element)
	{
		list.add(element);
		top=top+1;
	}
	
	public void pop()
	{
		if(top>-1 && list.size()>0)
		{
			list.remove(list.size()-1);
			top=top-1;
		}
	}
}