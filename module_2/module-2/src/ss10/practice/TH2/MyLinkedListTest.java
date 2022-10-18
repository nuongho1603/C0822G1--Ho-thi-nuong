package ss10.practice.TH2;

public class MyLinkedListTest {
    public static class TestMyLinkedList {
        public static void main(String[] args) {
            //Tạo đối tượng thuộc lớp MyLinkedList.
            System.out.println("/=/=/=/= TESTING /=/=/=/=");
            MyLinkedList ll = new MyLinkedList(10);
            ll.addFirst(11);
            ll.addFirst(12);
            ll.addFirst(13);

            ll.add(4,9);
            ll.add(4,9);
            ll.printList();
        }
    }
}

