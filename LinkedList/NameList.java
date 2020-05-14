package LinkedList;

public class NameList {
    private NameNode head;
		
	public NameList() {
		head = null;
	}
	
	public void append(String name) {
		NameNode me = head;
		if(head == null)
			head = new NameNode(name);
		else {
			while(me.getNext() != null) {
				me = me.getNext();
			}
			me.setNext(new NameNode(name));
		}
	}
	
	public void print() {
		NameNode name = head;
		while(name != null) {
			System.out.println(name.getName());
			name = name.getNext();
		}
	}
}