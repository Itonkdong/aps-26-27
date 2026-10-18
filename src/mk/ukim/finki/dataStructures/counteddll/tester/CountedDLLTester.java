package mk.ukim.finki.dataStructures.counteddll.tester;

import mk.ukim.finki.dataStructures.counteddll.CountedDLL;
import mk.ukim.finki.dataStructures.counteddll.CountedDLLNode;

public class CountedDLLTester
{
    public static void main(String[] args)
    {
        CountedDLL<Integer> list = new CountedDLL<>();
        list.insertLast(4);
        list.insertLast(9);
        list.insertFirst(2);
        System.out.println("After inserting 2, 4, and 9:");
        System.out.println(list);

        CountedDLLNode<Integer> node = list.find(4);
        list.insertBefore(3, node);
        list.insertAfter(5, node);
        System.out.println("After inserting 3 before 4 and 5 after 4:");
        System.out.println(list);

        node.occurrenceCount = 3;
        System.out.println("After setting the occurrence count for 4 to 3:");
        System.out.println(list);
        System.out.println("Backward traversal:");
        System.out.println(list.toStringR());

        list.delete(node);
        list.deleteFirst();
        list.deleteLast();
        System.out.println("After deleting 4 and both endpoint nodes:");
        System.out.println(list);
        System.out.println("Size: " + list.getSize());

        list.deleteList();
        System.out.println("After clearing the list:");
        System.out.println(list);
    }
}
