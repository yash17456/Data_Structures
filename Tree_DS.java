import java.util.*;
class Tree_DS
{
	public static void main(String...args)
	{
		int counter=0;
		int adder=0;
		Scanner scan=new Scanner(System.in);
		Node node=new Node();
		
		while(true)
		{
			System.out.println("Enter 1 to add a node, Enter 2 to search the tree:");
			int N=scan.nextInt();
			counter=counter+1;
			/*if(counter==0)
			{
				Node node=new Node();
				counter=counter+1;
			}*/
			Node temp=node;
			if(N==1)
			{
				temp=node;
				adder=adder+1;
				System.out.println("Enter the value of node to be added:");
				int add=scan.nextInt();
				while(true)
				{
					if(temp.value!=null)
					{
						if(add>temp.value)
						{
							temp=temp.right;
						}
						if(add<temp.value)
						{
							temp=temp.left;
						}
					}
					else if(temp.value==null)
					{
						temp.value=add;
					}
					if(counter==1)
					{
						node=temp;
						counter=counter+1;
					}
				}
				/*for(int i=0;i<adder;i++)
				{
					if(counter==1)
					{
						element=add;
						counter=counter+1;
					
					else
					{
						if(add>element)
						{
							element=node.right.value;
							if(element==null)
							{
								element=add;
							}
						}
						
						else if(add<element)
						{
							element=node.left.value;
							if(element==null)
							{
								element=add;
							}
						}
					}
				}*/
				
			}
			
			else if(N==2)
			{
				Node var=node;
				while(true)
				{
					
				}
			}
		}
	}
}

class Node
{
	Integer value=null;
	Node right;
	Node left;
}