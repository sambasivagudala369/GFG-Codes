//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    // Function to print nodes in a given circular linked list
    static void printList(Node head) {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int key = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            tail.next = head; // Make the list circular
            Solution ob = new Solution();
            Node current = ob.deleteNode(head, key);
            Node rev = ob.reverse(current);
            printList(rev);
        }
    }
}

// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/
class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // code here
        if(head==null || head.next == head) return null;

        Node pre = head;
        Node current = head.next;
        Node next;
        do{
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }while(head != current);
         head.next = pre;
         head = pre;
        return head;
    }
    Node deleteNode(Node last, int key) {
        if(last.data == key){
             Node temp = last;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
           
            return last.next;
        }
        
        Node pre = last;
        Node cur = last.next;
       
        do {
            if (cur.data == key) {
                pre.next = cur.next; 
                return last;  
            }
            pre = cur;
            cur = cur.next;
        } while (cur != last.next); 
        return last;
    }
}