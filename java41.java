import java.util.LinkedList;
import java.util.Random;

public class java41{
    public static void main(String[] args){
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        Random random = new Random();
        int i = 0;
        while (i<10){
            linkedlist.add(random.nextInt(100) +1);
            i = i+1;
        }
        System.out.println("Изначальный список " + linkedlist);
        LinkedList<Integer> linkedlist1 = new LinkedList<Integer>();
        linkedlist1 = reverselinkedlist(linkedlist);
        System.out.println("Перевернутый список " + linkedlist1);
    }
     public static LinkedList<Integer> reverselinkedlist(LinkedList<Integer> revlist)
    {
        for (int i = 0; i < revlist.size() / 2; i++) {
            Integer temp = revlist.get(i);
            revlist.set(i, revlist.get(revlist.size() - i - 1));
            revlist.set(revlist.size() - i - 1, temp);
        }
        return revlist;
    }
}