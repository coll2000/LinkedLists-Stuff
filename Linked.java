import java.util.LinkedList;

public class Linked {
    public static void main (String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("Chicken");
        list.add("XDDDDDDDDDDDD?");

        list.addFirst("Okay I'm First :)");
        list.addLast("Okay, I'm Last :(");

        list.add(3, "I'm 3rd lol");

        System.out.println("LinkedListStuff.Linked List: " + list);


        list.remove("A");
        list.remove(3);

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println("LinkedListStuff.Linked List after deletion: " + list);

        for(int i =0; i < 10; i++){
            list.add(String.valueOf(i));
        }

        System.out.println(list);

        boolean status = list.contains("Chicken");

        if(status){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
