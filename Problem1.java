import java.util.Scanner;
public class ArbitraryQueue {

	Node first;
	Node last;

	private class Node {
		Object item;
		Node next;
		Node Previous;
		private Node(Object object) {

			this.item = object;

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
			return temp.item;
		}

		catch (NullPointerException e) {
			return "No items in the queue";

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
			return temp.item;
		} catch (NullPointerException e) {
			return "No items in the queue";

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
			return current.item;
		} catch (NullPointerException e) {
			return " No item at that index!";

		}

	}

}
public static void main(String[] args){
char answer='A';
string input;
int index;
string returns;
ArbitraryQueue myQueue;

Scanner reader = new Scanner(System.in);
Scanner texter = new Scanner(System.in);
while(answer!= 'N'){

    System.out.println("Please select what you wish to do\nP: Push\nE: Enqueue\nO: Pop\nD: Dequeue\nT: Traverse\nN: Nothing else\n");
    answer = reader.nextInt();
    if(answer=='P'){
        System.println("Enter the data that you wish to store");
        input = reader.nextInt();
        myQueue.push(input);
    }
    else if (answer=='E'){
        System.out.println("Enter the data that you wish to store\n");
        input = reader.nextInt();
        myQueue.enqueue(input);
    }
    else if(answer=='O'){
        returns=myQueue.pop();
    }
    else if(answer=='D'){
        returns=myQueue.dequeue();
    }
    else if(answer=='T'){
        cout<<"Enter the index you are trying to access\n";
        input = reader.nextInt();
        returns=myQueue.traverse(index);
    }
    else if(answer=='N'){
        System.println("Goodbye");
    }
    else{
        System.println("You have picked and invalid option. Please try again\n");
    }
}

}
