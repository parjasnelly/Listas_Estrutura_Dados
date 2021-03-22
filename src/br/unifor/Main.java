package br.unifor;

public class Main {

    public static void main(String[] args) {
        //Testando a Lista
        DynamicList list = new DynamicList();
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(9);
        list.print();
        list.add(2,4);
        list.print();
        list.add(0,9);
        list.print();
        list.remove(1);
        list.print();
        list.remove(5);
        list.print();

        if(list.search(9)){
            System.out.println("Found on position: " + list.searchIndex(9));
        } else {
            System.out.println("Error 404 - Not Found");
        }
        System.out.println(list.searchElement(2));
    }
}
