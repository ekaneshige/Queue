
public class Node {

	/**
	 * @param args
	 */
	private String content;
	public Node next;
	public Node prev;
	
	public Node(String message) {
		content = message;
		next = null;
		prev = null;
	}
	public String getContent(){
		return content;
	}

}
