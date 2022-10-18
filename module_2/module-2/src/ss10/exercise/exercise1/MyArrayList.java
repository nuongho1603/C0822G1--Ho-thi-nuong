package ss10.exercise.exercise1;

import javax.xml.soap.Node;
import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * Số lượng phần tử có trong MyArrayList.
     */
    private int size = 0;
    /**
     * Sửa chửa của MyArrayList.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Mảng chứa các phần tử.
     */
    Object elements[];

    /**
     * Sức chứa mặc định khi khởi tạo Contruc k tham số.
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phương thức Contruc với sức chứa được tuyền vào.
     * @param capacity
     */
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("capacity: " + capacity);
        }

    }

    /**
     * pHương thức trả về số lượng phần tử.
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * Phthuc clear ARRAYLIST.
     */
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**
     * pHương thức add 1 phần tử vào MyArrayList.
     * @param element
     * @return
     */
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(6);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(6);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }


    /**
     * Phuong thức tăng kích thước của MyArrayList.
     *
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IndexOutOfBoundsException("minCapa: " + minCapacity);
        }
    }

    /**
     * Phuonwg thuc lay 1 element tai vi tri index
     * @param index
     * @return
     */
    public E get(int index){
        return (E)elements[index];
    }


    /**
     *  Phuong thuc lay index cua 1 phan tu.
     * @param element
     * @return
     */
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size ; i++) {
            if(this.elements[i].equals(element)){
                return i;
            }
        } return index;
    }

    /**
     * Phthuc kiem tra 1 phantu co trong MyArrayList hay k?
     * @param element
     * @return
     */
    public boolean contains(E element){
        return this.indexOf(element) >0;
    }

    /**
     * Phthuc tao ra 1 ban sao cua MyArrayList hien tai.
     * @return
     */
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }

    /**
     * Phthuc xoa
     * @param index
     * @return
     */
    public E remove(int index ){
      if(index <0 ||  index > elements.length) {
          throw new IndexOutOfBoundsException("ERROR INDEX: "+index);
      }
      E element = (E) elements[index];
        for (int i = index; i <size-1 ; i++) {
            elements[i] = elements[i+1];
        }
        elements[size -1 ]= null;
        size--;
        return element;
    }

}
