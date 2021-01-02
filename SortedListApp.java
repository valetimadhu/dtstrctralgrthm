package ds;

class Link{
	public long data;
	public Link next;
	
	public Link(Long data) {
		this.data = data;
		
	}
	
	public void displayLink() {
		System.out.println(" "+data);
	}
	
}

class SortedList{
	private Link first;
	
	public SortedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insert(long key) {
		Link newLink = new Link(key);
		Link previous = null;
		Link current = first;
		while(current != null && key > current.data) {
			previous = current;
			current = current.next;
		}
		
		if(previous == null) 
			first = newLink;
		else
			previous.next = newLink;
		
		newLink.next = current;
			
	}
	
	public Link remove() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
	}
}
public class SortedListApp {
	
	public static void main(String[] args) {
		SortedList sortedList = new SortedList();
		sortedList.insert(50);
		sortedList.insert(30);
		sortedList.insert(80);
		sortedList.insert(20);
		sortedList.insert(10);
		sortedList.displayList();
		sortedList.remove();
		sortedList.remove();
		sortedList.displayList();
	}

}
