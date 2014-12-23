import java.util.*;

public class List {

	/**
	 * @param args
	 */
	private Node First;
	private Node Last;
	private Node current;
	
	public List() {
	 //Empty Constructor
		First = null;
		Last = null;
		current = null;
	}
	
	public void add(String message) {
		Node newNode = new Node(message);
		if (First == null) {
			First = newNode;
			Last = newNode;
			current = First;
		} else {
			//Add to end of the list
			Node temp = Last;
			Node Last = newNode;
			temp.prev = Last;
			Last.next = temp;
		}
	}
	
	public void deleteFirst() {
		Node temp = First;
		First = null;
		temp.prev = First;
	}
	
	public void moveNext() {
		if (current != Last) {
			current = current.next;
		}
	}
	public void movePrev() {
		if (current != First) {
			current = current.prev;
		}
	}
	public String getCurrent() {
		return current.getContent();
	}
	

	

}
