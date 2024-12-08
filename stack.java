// this class defines an integer stack that can hold 10 values.
class stack {
    int stack [] = new int [10];
    int tos;
    
//initialize top of stack 
 stack (){
     tos = -1 ;
     
 }
  //push an item onto the stack
void push (int item){
    if(tos == 9)
    System.out.println("stack is full .");
    else
    stack[++tos] = item;
}

//pop an item from the stack
int pop(){
    if (tos<0){
        System.out.println("stack underflow");
        return 0;
        }
        else
        return stack[tos --];
}
}
public class Main
{
	public static void main(String[] args) {
	stack mystack1= new stack ();
	stack mystack2 = new stack();
	
	//push some numbers onto the stack
for (int i = 0; i<10 ;i++)mystack1.push(i);
for (int i = 10; i<20 ;i++)mystack2.push(i);

//pop those numbers off the stack
System.out.println("stack in mystack1 : ");
for (int i = 0; i<10 ;i++)
System.out.println(mystack1.pop());


System.out.println("stack in mystack2 : ");
for (int i = 0; i<10 ;i++)
System.out.println(mystack2.pop());

	}
}