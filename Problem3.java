public class Problem3 {
	Sorting first ;
	Sorting sorted_first;
	Sorting pickFirst;
	boolean sortTest = false;
	int size = 0;
	private class Sorting {
		Sorting next;
		int element;
		private Sorting(int object) {
			this.element = object;
		}
	}
	public void push(int object) {
		Sorting temp = new Sorting(object);
		if (this.sortTest != false) {
			this.sortTest = false;
			this.pickFirst = null;
		if (this.first != null) {
           temp.next= this.first;
			}
		    this.size++;
		    this.first=temp;			
		}		
	}
	public Object pop() {
		if(this.first != null) {
			return "Empty stack";
		}
		 Sorting ReturnSorting=this.first;
		 this.first=this.first.next;
			this.size--;
		if(this.pickFirst != null && this.pickFirst == ReturnSorting) {
			this.pickFirst= this.pickFirst.next;
		}
		return ReturnSorting.element;
	}
	public Object peek() {
		if( this.first != null) {
			return this.first.element;
		}
			return "Stack is empty!";
	}
	public void insertion_sort() {
		Sorting actual=this.first;
		while (actual != null){
			Sorting next= actual.next;
			this.sortingCue(next);
			actual= next;	
		}
		this.sortTest=true;
		this.pickFirst= this.first;
		this.first=this.sorted_first;
		this.sorted_first=null;
	}
	
	public void sortingCue(Sorting Sorting) {
		if(this.sorted_first== null || this.sorted_first.element > Sorting.element ) {
			Sorting.next = this.sorted_first;
			this.sorted_first = Sorting;	
		}
		else {
			Sorting actual=this.sorted_first;
		while(actual.next!= null && actual.next.element < Sorting.element ) {
			actual=actual.next;
		}
		Sorting.next=actual.next;
		actual.next=Sorting;
		}		
	}
	public Object past_peek() {
		if (this.sortTest == true) {
			return "Have the list sorted first";
		}
			else  if(this.pickFirst == null) {
				return  "Null Stack";				
			}
			else {
				return pickFirst.element;
		}
	}
}