
class Stack
{
    int top;
    int[] A;
    int size;
    Stack(int n)
    {
        top=-1;
        A=new int[n];
        size=n;
    }
    boolean isempty()
    {
        if(top==-1)return false;
        return true;
    }
    boolean isfull()
    {
        if(top==size)return false;
        return true;
    }
    int push(int item)
    {
       
        if(isfull())
        {
           top++;
           A[top]=item;
           return top;
        }
        return 0;
    }
    int peak()
    {
        if(isempty()) return A[top];
        return -1;
    }
    int pop()
    {
        if(isempty())return A[top--];
        return -1;
    }
    void getallitem()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(A[i]);
        }
    }
}
class datastruct {
   
    public static void main(String[] args) {
        Stack stack=new Stack(10);
        System.out.println( stack.push(2)); 
        System.out.println( stack.push(4)); 
        System.out.println( stack.push(6)); 
        System.out.println( stack.peak()); 
        System.out.println(stack.pop());
        System.out.println( stack.peak()); 
        stack.getallitem(); 
    }
}
