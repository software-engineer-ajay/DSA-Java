class Stack{
	int[] arr;
	int top;
	int capacity;
	
	//Creating Stack
	Stack(int size){
		arr = new int[size];
		capacity = size;
		top=-1;
	}
	
	//Add an element into stack
	public void push(int x){
		if(isFull()){
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}
		System.out.println("Inserting. "+ x);
		arr[++top] = x;
	}
	
	//Remove an element from stack 
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		System.out.println("Removing. "+ arr[top]);
		return arr[--top];
	}
	
	//Check if Stack is empty
	public boolean isEmpty(){
		return top == -1;
	}
	
	//check if Stack is full
	public boolean isFull(){
		return top == capacity-1;
	}
	
	public int size(){
		return top + 1;
	}
	
	//Get element from stack without removing it.
	public int Peek(){
		return arr[top];
	}
	
	public void printStack(){
		for(int i=0;i<= top;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		stack.pop();
		System.out.println("\nAfter popping out");

		stack.printStack();

	}
}