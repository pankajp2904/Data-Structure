
class Queue
{
    int[] q;
    int size;
    int front,rear;
    Queue(int n)
    {
        q=new int[n];
        front=-1;
        rear=-1;
        size=n;
    }
    boolean isempty()
    {
        if(front==-1&& rear==-1)return false;
        return true;
    }
    boolean isfull()
    {
        if(rear==size)return false;
        return true;
    }
    int insert(int item)
    {
        if(isfull())
        {
             if(front==-1)front=0;
             rear++;
             q[rear]=item;
             return rear;
        }
        return 0;
    }
    int delete()
    {
        if(isempty())
        {
            if(front==rear)
            {
                front=rear=-1;
                return q[size-1];
            }
            return q[front++];
        }
        return 0;
    }
    void display()
    {
        if(isempty())
        {
            for(int i=front;i<=rear;i++)
                System.out.println(q[i]);
        }
        else
        {
            System.out.println("Empty Queue");
        }
    }
    
}
class Datastructure {
    public static void main(String[] args) {
        Queue q=new Queue(10);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.delete();
        q.delete();
        q.delete();
        q.display();
    }
}
