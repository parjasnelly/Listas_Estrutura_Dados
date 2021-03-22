package br.unifor;

public class DynamicList {
    private Node first;
    private Node last;
    private int cont;
    public DynamicList() {
        cont = 0;
        first = null;
        last = null;
    }
    public void add(int value) {
        Node newNode  = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        cont++;
    }
    public void add(int position, int value) {
        Node newNode  = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else if (position == 0) {
            newNode.next = first;
            first = newNode;
        }else if (position == size()){
            last.next = newNode;
            last = newNode;
        }
        else{
            Node aux = first;

            for (int i = 0; i< position-1; i++){
                aux = aux.next;
            }

            newNode.next = aux.next;
            aux.next = newNode;
        }
        cont++;
    }
    public void remove(int position) {
        if(first != null){
            if(position == 0) first = first.next;
            else {
                Node aux = first;

                for(int i = 0; i<position - 1; i++){
                    aux = aux.next;
                }

                aux.next = aux.next.next;

                if(position == cont-1){
                    last = aux;
                }
            }
        }
        cont--;
    }
    public boolean search(int value) {
        Node aux = first;
        for (int i = 0; i < cont; i++) {
            if (value == aux.data) return true;
            aux = aux.next;
        }
        return false;
    }
    public int searchIndex(int value) {
        Node aux = first;
        for (int i = 0; i < cont; i++) {
            if (value == aux.data) return i;
            aux = aux.next;
        }
        return -1;
    }
    public int searchElement(int position) {
        Node aux = first;
        for (int i = 0; i < position; i++) {
            aux = aux.next;
        }
        return aux.data;
    }
    public int size() {
        return cont;
    }
    public void print() {
        Node aux = first;
        while (aux != null) {
            System.out.print(aux.data + " ");
            aux = aux.next;
        }
        System.out.println();
    }
}