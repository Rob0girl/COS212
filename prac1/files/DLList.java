public class DLList<T extends Comparable<T>> {
	
	protected DLNode head = null;
	protected DLNode tail = null;
	
	/*
	This method should create a new node with storing "value" and add it to the end of the list.
	is end and addToHead a typo?
	*/
	public void addToHead(T value) 
	{
		DLNode newNode = new DLNode(value);
		if (head!= null)
		{
			newNode.prev=head;
			head = newNode;
			head.prev.next=head;
		}
		else
			head = tail= newNode;
		
		return;
	}
	
	/*
	Inserts an element to the tail of the list.
	*/
	public void addToTail(T value) 
	{
		DLNode newNode = new DLNode(value);
		if (tail != null)
		{
			newNode.prev = tail;
			//System.out.println("tail not null");
			tail = newNode;
			//System.out.println("tail equals newNode");
			tail.prev.next = tail;
			//System.out.println("tt.p.n = t");
		}
		else
		{
			//System.out.println("tail is null");
			head=tail= newNode;
		}
		
		return;
	}

	
	public void removeHead() throws EmptyListException 
	{
		
			if( (tail == null)&&(head ==null))
				throw ( new EmptyListException());
			else if( tail == head )
			{
				head = tail = null;
			}
			else
			{
				head= head.next;
				head.prev=null;
			}
				
	
		return;
	}
	
	public void removeTail() throws EmptyListException  
	{
		if (isEmpty())
			throw (new EmptyListException());
		else if (head == tail)
			head = tail = null;
		else 
		{
			tail = tail.prev;
			tail.next = null;
		}
	}
	
	public void remove(T value) throws EmptyListException  
	{
		
			boolean found = false;
			DLNode traverse = head;
			if (isEmpty())
			{
				throw (new EmptyListException());
			}
			else 
			{
				while(traverse.next!= null)
				{
					if (traverse.value == value)
					{
						found = true;
						traverse.prev.next = traverse.next;
						traverse.next.prev = traverse.prev;
					}
					traverse = traverse.next;
				}
				if (!found)
					return;
			}
			
		return;
	}
	
	public boolean isEmpty()
	{
		if (head==null)
			return true;
		else
			return false;
	}
	
	public int getCount()
	{
		int count=0;
		DLNode traverse=head;
		if(isEmpty())
			count =0;
		else
		{
			while(traverse.next!=null)
			{
				count = count+1;
				traverse = traverse.next;
			}
		}
		return count;
			
	}
	
	public int getPosition(T value) 
	{
		int count =0;
		int pos =-1;
		boolean found = false;
		DLNode Traverse = head;
		
		
		for(DLNode tmp = head; tmp!= null; tmp=tmp.next)
		{
			if ( value.equals(Traverse.value))
			{
				found = true;
				pos = count;
			}
			else
			{
				count = count +1;
				Traverse= Traverse.next;
			}
		}
		return pos;
		
	}
	
	public void printList(boolean verbose) 
	{
		DLNode iter = head;
		String out = "";
		if (verbose) {
			out += " H ="+ (head == null ? " null"  : head.getString()) + "\n";
			out += " T =" +(tail == null ? " null"  : tail.getString()) + "\n";
		}		
		 else {
			 out += "[";
		 }
		while (iter != null) {
			if (verbose) {
				out += iter.getStringVerbose() + (iter == tail ? "" : "\n");
			} else {
				out += iter.getString();
			}
			iter = iter.next;
		}
		if (!verbose) {
			out += "]";	
		}
		System.out.println(out);
	}
	
	protected class DLNode {
		T value;
		DLNode next = null; 
		DLNode prev = null;
		
		DLNode(T _value) {
			value = _value;
		}
		
		String getStringVerbose() {
			return " ("+value+", next = "+(next == null ? "null" : next.value)+", prev = "+(prev == null ? "null" : prev.value)+") ";
		}
		
		String getString() {
			return " ("+value+") ";
		}
	}
}