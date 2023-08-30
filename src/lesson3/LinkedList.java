package lesson3;

public class LinkedList {

}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class Answer {
    Node head;
    public void reverse() {
        // Разворот рекурсией
//        if (head != null && head.next != null) {
//            Node temp = head;
//            reverse(head.next, head);
//            temp.next = null;
//
//        }
//    }
//
//    private void reverse(Node curentNode, Node previousNode) {
//        if (curentNode.next == null) {
//            head = curentNode;
//        } else {
//            reverse(curentNode.next, curentNode);
//        }
//        curentNode.next = previousNode;
//    }

        // Разворот без рекурсии
            Node previos = null;

            while (head != null) {
                Node temp = head.next;
                head.next = previos;
                previos = head;
                head = temp;
            }
            head = previos;
        }
    }

class Printer {
    public static void main(String[] args) {
        // Создаем связанный список 1 -> 2 -> 3 -> 4
        Node head;
        if (args.length == 0) {
            head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
        } else {
            head = new Node(Integer.parseInt(args[0]));
            head.next = new Node(Integer.parseInt(args[1]));
            head.next.next = new Node(Integer.parseInt(args[2]));
            head.next.next.next = new Node(Integer.parseInt(args[3]));
        }

        // Сохраняем голову списка в поле класса Answer
        Answer ans = new Answer();
        ans.head = head;
        // Инвертируем порядок элементов списка
        ans.reverse();

        // Выводим инвертированный порядок элементов списка
        Node current = ans.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
