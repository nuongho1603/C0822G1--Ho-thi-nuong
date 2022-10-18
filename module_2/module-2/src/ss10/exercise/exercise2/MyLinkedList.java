package ss10.exercise.exercise2;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import javax.xml.soap.Node;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class MyLinkedList<E, index> {

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //Phan tu dau tien cua dsach lien ket.
    private Node head;
    //So luong phan tu trong dsach.
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        //kHAI bao 1 bien la temp trỏ đến giá trị của head.
        Node temp = head;
        // BIen Head se nhan gia tri 1 node ms.
        head = new Node(element);
        //head.next trỏ đến temp.
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        //Khai bao bien trỏ đến head.
        Node temp = head;
        //Se cho con trỏ chạy đến phần tử cuối cùng cura dsach
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        //Khai bao biến trỏ đến head.
        Node temp = head;

        //Khai baos 1 node laf holder.
        Node holder;

        //Cho con trỏ chạy đến vị trí -1;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        // cho holder tham chieu toi vi tri index.
        holder = temp.next;
        //Node tai vi tri index = -1 sẽ trỏ tới node mới.
        temp.next = new Node(element);
        //node ms sex trỏ den holder
        temp.next.next = holder;

        //tăng số lượng phần tử trong danh sachs len 1.
        numNodes++;
    }

    public Object get(int index) {
        //KHAI BAO BIEN TRONG TEMP toi head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;


        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("ERROR INDEX: " + index);
        }

        //KHai baos bien temp tro den head
        Node temp = head;

        Object data;

        //Neus index =0  thi se tra ve data hien tai
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;

            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //Remove dtuong neu element Head.
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //Khai baos 1 node temp tro den head
            Node temp = head;
            while (temp.next != null) {
                //neu nhu ton tai 1 phan tu co data = data truyen vao thi node do se bi remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

//    public MyLinkedList<E> clone() {
//        //Kiem tra linkedList co phan tu hay khong
//        if (numNodes == 0) {
//            throw new NullPointerException("LinkedList nay null");
//        }
//
//    }
//    //Khai baos linkedList tra ve
//    MyLinkedList<E> returnLinkedList = new LinkedList<>();
//
    }
