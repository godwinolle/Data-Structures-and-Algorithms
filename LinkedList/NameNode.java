package LinkedList;

public class NameNode {
    private String name;
	private NameNode next;
	
	public NameNode(String name) {
		this.name = name;
		this.next = null;
	}
	
	public String getName() {
		return name;
	}
	public NameNode getNext() {
		return next;
	}
	public void setNext(NameNode next) {
		this.next = next;
	}
}