

class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }
}

class MyLinkedList {
    private Node head;//Farid
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void addLast(String value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            Node newNode = new Node(value);
            tmp.next = newNode;
        }
        size++;
    }

    public void addStart(String value) {
//        Node newNode = new Node();//1
//        Node newNode = new Node(value);//2
//        newNode.next = head;//3
//        head = newNode;//4


        Node newNode = new Node(value);//1
        newNode.next = head;
        head = newNode;
        size++;
    }


    public void print() {
////        Node tmp = head;
//        while (head != null) {
//            System.out.print(head.value + " ");
//            head = head.next;//null
//        }
//        System.out.println("Head = " + head);


        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;//null
        }
        System.out.println();
//        System.out.println("Head = " + head.value);
//        System.out.println("TMP = " + tmp);
    }

    public boolean contains(String value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value.equals(value)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(String value) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.value.equals(value)) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range" + index);
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp.value;
    }

    public void add(int index, String value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range" + index);
        }
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node temp =head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;

            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
size++;
    }

    //  +  public void addLast(String value);  DOBAV V KONEC
//  +  public void print();  NAPECATAY VES LINKEDLIST
//  +  public void addStart(String value); DOBAV V NACALO
//  -  public int size(); VERNI RAZMER (SKOLKO NODE)
//  -  public boolean contains(String value); // ESLI EST VERNET TRUE ESLI NET FALSE
//  -  public int indexOf(String value);  VOZVRAWAET INDEX DANNOQO ELEMENTA ELSI NETU -1
//  -  public String get(int index); VOZVRAWAET SAM ELEMENT  ELSI NETU THROW NEW EXCEPTION(VI VISLI ZA RAZMER)
//  -  public void add(int index , String value);// DOBAVIT NODE V UKAZANNIY INDEX


}

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast("Farid");
        myLinkedList.addLast("David");
        myLinkedList.addLast("Oleq");
        myLinkedList.addLast("Mawa");
        myLinkedList.addLast("Dima");
        myLinkedList.addLast("BTC");
        myLinkedList.addLast("COIN");
        myLinkedList.addStart("999");
        myLinkedList.addStart("1000");
        myLinkedList.addStart("00");
        myLinkedList.print();
        System.out.println("Size = " + myLinkedList.size());
        System.out.println("Contains 'Farid'?" + myLinkedList.contains("Farid"));
        System.out.println("Contains 'Max'?" + myLinkedList.contains("Max"));
        System.out.println(" Index of 'Farid' :" + myLinkedList.indexOf("Farid"));
        System.out.println(" Index of 'Max' :" + myLinkedList.indexOf("Max"));
        System.out.println("Element at index 1:" + myLinkedList.get(1));
        myLinkedList.add(1,"Max");
        System.out.println("Element at index 1 posle dobavlenia :" +myLinkedList.get(1));
        System.out.println("Element at index 2 posle dobavlenia :" +myLinkedList.get(2));

//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.addFirst("1");
//        linkedList.addFirst("2");
//        linkedList.addFirst("3");
//        linkedList.addLast("1");
//        linkedList.addLast("2");
//        linkedList.addLast("3");
//        linkedList.add("4");
//        linkedList.add(0,"999");
//        linkedList.remove(0);
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        linkedList.contains("999");
//        linkedList.get(0);
//        linkedList.getFirst();
//        linkedList.getLast();
//        linkedList.clear();
//        linkedList.isEmpty();


//        for (String value : linkedList){
//            System.out.print(value + " ");
//        }

    }
}