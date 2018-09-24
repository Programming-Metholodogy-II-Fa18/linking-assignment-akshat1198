public static void main(String[] args){
char answer='A';
string input;
int index;
string returns;
Problem1 myQueue;

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