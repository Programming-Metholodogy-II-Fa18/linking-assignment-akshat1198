import java.util.Scanner;
public class Problem1 {

	Node first;
	Node last;

	private class Node {
		Object stackItem;
		Node next;
		Node Previous;
		private Node(Object object) {

			this.stackItem = object;

		}
	}

	public void enqueue(Object object) {
		Node temp = new Node(object);

		if (this.last != null) {
			this.last.next = temp;
			temp.Previous = this.last;
		}
		this.last = temp;
		if (this.first == null) {
			this.first = temp;
		}
	}

	public void push(Object object) {
		Node temp = new Node(object);
		if (this.first != null) {
			this.first.Previous = temp;
			temp.next = this.first;
		}
		this.first = temp;
		if (this.last == null) {
			this.last = temp;
		}
	}

	public Object pop() {
		try {
			Node temp = this.first;
			if (this.first.next != null) {
				this.first = this.first.next;
			} else {
				this.first = null;
				this.last = null;

			}
			return temp.stackItem;
		}

		catch (NullPointerException e) {
			return "No stackItems in the queue";

		}

	}

	public Object dequeue() {
		try {
			Node temp = this.last;
			if (this.last.Previous != null) {
				this.last = this.last.Previous;
			} else {
				this.first = null;
				this.last = null;
			}
			return temp.stackItem;
		} catch (NullPointerException e) {
			return "No stackItems in the queue";

		}
	}

	public Object traverse(int index) {
		int count = 0;
		try {
			Node current = this.first;
			while (count < index) {
				current = current.next;
				count++;
			}
			return current.stackItem;
		} catch (NullPointerException e) {
			return " No stackItem at that index!";

		}

	}

}
