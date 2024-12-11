
public class LinkedListDemo
{
        class Node
        {
              int data;
             Node next;

        }

   // *********** Insertion At END **************

    Node head;    // here head is first node with null pointer(next ref var)

    public void insert(int data)
    {
        Node node =new Node();  // node is obj of node class
        node.data=data;
        node.next=null;    // start with null  (it will be the last node in the list).


        if(head==null)
         {
               head=node;
         }
        else
         {
             Node n=head;  // create new node n which points to head
             while(n.next!=null)
             {
                 n=n.next;
             }
             n.next=node;
         }
    }


    // ************* Insert At Start ***************
    public void insertAtStart(int data)
    {
        Node node1=new Node();  //node1 is another obj for insert value at start fun()
        node1.data=data;
        node1.next=null;

        node1.next=head;  // here new node will points to head
        head=node1;
    }


// ************************ Insertion At Index *********************************************

    public  void insertAtIndex(int index,int data)
    {
        Node node2=new Node();
        node2.data=data;
        node2.next=null;

        Node n =head;

        // if u try to add elemnt at 0th location that means u want insertAtStart
        if(index==0)
        {
            insertAtStart(data); // call that function
        }
        else
        {
            for (int i = 0; i < index - 1; i++)  // to traverse at that specific index
            {
                n = n.next;
            }

            node2.next = n.next;
            n.next = node2;
        }

    }

// ************************ Delete At Index *********************************************

    public  void deleteAt(int index)
    {
        Node node3 = new Node();
        node3.next=null;

        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node n=head;
            Node m1=null;   // create new node to store

            for (int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            m1=n.next;
            n.next= m1.next;
        }

    }

    // use show method to print values

    public void show()
    {
        Node node=head;    // here for printing again node obj is points to head for traverse from head to tail

        while(node.next!=null)   // Traverses the list until it reaches the last node
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);   // bcz last value contain null as ptr that wont gone print in above while condition thats why we use this statment to print last value
    }
    // ..... main method
    public static void main(String[] args)
    {
        // creat obj of linkelid class
        LinkedListDemo l1=new LinkedListDemo();

        l1.insert(18);  // here we use insert() fun that we created above
        l1.insert(34);
        l1.insert(44);
        l1.insert(55);

        l1.insertAtStart(82);

        l1.insertAtIndex(0,90);  // this for to check if(index==0) condition at line no-61
        l1.insertAtIndex(3,101);

        l1.deleteAt(0);
        l1.deleteAt(4);


        l1.show();
    }
}
