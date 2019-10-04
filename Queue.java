import java.util.*;
class Queue
{
	int front=-1;
	int rear=-1;
	ArrayList list=new ArrayList();
	
	public void enqueue(int school,int roll_no)
	{
		Nodek node=new Nodek();
		node.school=school;
		node.roll_no=roll_no;
		rear=rear+1;
		int status=0;
		if(list.size()!=0)
		{
			for(int i=0;i<list.size();i++)
			{
				status=0;
				Nodek nd=(Nodek)list.get(list.size()-1-i);
				if(nd.school==node.school)
				{
					list.add(list.size()-i,node);
					status=1;
					break;
				}
				
			}
			if(status==0)
			{
				list.add(rear,node);
			}
		}
		else
		{
			list.add(rear,node);
		}
		
		if(front==-1)
		{
			front=0;
		}
	}
	
	/*public void get()
	{
	    list.get(front);
		dequeue();
	}*/
	
	
	public Object dequeue()
	{
		Object obj=list.get(front);;
		if(list.size()!=0)
		{
			list.remove(front);
			rear=rear-1;
			if(list.size()==0)
			{
				front=-1;
				rear=-1;
			}
		}
		return obj;
	}
}

class Nodek 
	{
		int school;
		int roll_no;
		
	}