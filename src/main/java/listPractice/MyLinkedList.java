package listPractice;

import lombok.Value;

import java.util.Collection;
import java.util.List;

public class MyLinkedList<E> {
    private MyNode<E> head = null;

    public MyLinkedList() {

    }

    public int size() {
        MyNode<E> node = head;
        int count = 1;
        if (head != null) {
            while (node.getNext() != null) {
                node = node.getNext();
                count++;
            }
        } else {
            return 0;
        }
        System.out.println(count);
        return count;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public boolean contains(E e) {
        MyNode<E> node = head;
        if (head != null) {
            while (!node.getValue().equals(e)) {
                node=node.getNext();
            }
            System.out.println(true);
            return true;
        }
        return false;
    }


    public E[] toArray() {
        MyNode<E> node = head;
        E[] myNodeArray = (E[]) new Object[size()];
        int count = 1;
        if (head != null) {
            myNodeArray[0] = head.getValue();
            while (node.getNext() != null) {
                node = node.getNext();
                myNodeArray[count] = node.getValue();
                count++;
            }
        }
        return myNodeArray;
    }


    public boolean add(E e) {
        MyNode<E> node = new MyNode<>(e, null);
        if (head == null) {
            head = node;
        } else {
            MyNode<E> curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(node);
        }
        return false;
    }


    public boolean remove(E e) {
        MyNode<E> node = head;//Создаем узел присваиваем значение  "головной"
        MyNode<E> reNode = null;//Создаем ещё узел, где будем хранить удаляемый, присваиваем "налл"
        if (head != null) {
            if (head.getValue().equals(e)) {//если значение в головном узле равно удаляемому
                head = node.getNext();//головным будет следующий узел
                if (head != null) {// если новый головной узел не налл, значит в нем будет значение
                    head.getValue();
                    return true;
                } else {
                    head = null;// в противном случае в головной, естественно, налл
                }
            } else {//если значение в головном узле не равно удаляемому. Тут самое интересное
                while (!node.getNext().getValue().equals(e)) {//до тех пор, пока значение в следующем узле
                    node = node.getNext();//не равно удаляемому, идём к следующему дальше
                }
                reNode = node.getNext();//как только равно в созданный удаляемый узел с нулем присваиваем
                if (reNode.getNext() != null) {//это значение, далее проверяем. Если следующее от удаляемого
                    node.setNext(reNode.getNext());//не налл значит следующее для доудаляемого будет
                } else {// значение следующее после удаляемого. В противном случае, сразу после доудаляемого
                    node.setNext(null);// будет налл. То есть стереть переход
                }
            }
            assert false;// Идея сказала проверить утверждение таким макаром.
            reNode.setNext(null);// а здесь стереть переход от удаляемого значения. Как-то так.
            return true;

        }
        return false;
    }


    public boolean addAll(E e) {
        MyNode<E> node = head;//это основной узел
        MyNode<E> subNode = new MyNode<E>(e, null);// это присоединяемый
        if (head != null) {
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(subNode);
            while (subNode.getNext() != null) {
                subNode = subNode.getNext();
            }
        } else {
            head = subNode;
        }
        return true;
    }


    public boolean addAll(int index, E e) {
        MyNode<E> node = head;
        MyNode<E> subNode = new MyNode<>(e, null);
        if (head != null) {
            if (index > 0) {//если индекс больше нуля
                for (int i = 0; i < index - 1; i++) {//плывем до предындексового узла
                    node = node.getNext();
                }
                MyNode<E> helpNode = new MyNode<>(e, null);//создаем вспомогательный узел для хранения
                for (int i = 0; i < index + 1; i++) {           //послеиндексового узла, плывем до него
                    helpNode = node.getNext();
                }
                node.setNext(subNode);//индесовый узел связываем с входящей коллекцией
                subNode.setNext(helpNode);//входящую коллекцию связываем, с сохранённый послеиндексовым узлом
            } else if (index == 0) {
                head = subNode;//если индекс равен нулю, голове присваиваем новую коллекцию
                while (subNode.getNext() != null) {// как только коллекция заканчивается
                    subNode = subNode.getNext();
                }
                subNode.setNext(node);//связываем её с основной. занавес.
            }
        }
        return true;
    }


    public void clear() {
        MyNode<E> node = head;
        if (head != null) {
            while (node.getNext() != null) {
                node.setNext(null);
            }
            head = null;
        }
    }


    public E get(int index) {
        MyNode<E> node = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
        }
        return node.getValue();
    }


    public E set(int index, E e) {
        MyNode<E> node = head;
        MyNode<E> subNode = new MyNode<>(e, null);// входящий узел.
        if (head != null) {
            if (index > 0) {// если индекс больше нуля, бежим до предындексового значения
                for (int j = 0; j < index - 1; j++) {
                    node = node.getNext();
                }
                MyNode<E> helpNode = new MyNode<>(e, null);// вспомогательный узел
                for (int i = 0; i < index; i++) {// бежим до индексового значения и сохраняем то,
                    helpNode = node.getNext();  // что за ним
                }                               // связываем предындексовое значение с входящим
                node.setNext(subNode);          //дабы избавиться от значения в позиции индекса
                subNode.setNext(helpNode.getNext());//связываем входящий узел с заиндексовым, иначе удаления
            } else if (index == 0) {                //не произойдет
                head = subNode;                     // отдельное условие для нулевого индекса.
                subNode.setNext(node.getNext());//с новой головы перепрыгнуть через бывшую голову
            }
        }
        return node.getValue();
    }


    public void add(int index, E e) {
        MyNode<E> node = head;
        MyNode<E> subNode = new MyNode<>(e, null);
        if (head != null) {
            if (index > 0) {
                for (int i = 0; i < index - 1; i++) {
                    node = node.getNext();
                }
                MyNode<E> helpNode = new MyNode<>(e, null);
                for (int i = 0; i < index; i++) {
                    helpNode = node.getNext();
                }
                node.setNext(subNode);
                subNode.setNext(helpNode);
            } else if (index == 0) {
                head = subNode;
                subNode.setNext(node);
            }
        }
    }

    public E remove(int index) {
        MyNode<E> curNode = head;
        MyNode<E> removingNode = null;
        if (head != null) {
            if (index == 0) {
                head = curNode.getNext();
                return head != null ? head.getValue() : null;
            } else {
                for (int j = 0; j < index - 1; j++) {
                    curNode = curNode.getNext();
                }
                removingNode = curNode.getNext();
                if (removingNode.getNext() != null) {
                    curNode.setNext(removingNode.getNext());
                } else {
                    curNode.setNext(null);
                }
            }
            removingNode.setNext(null);
        }
        assert removingNode != null;
        return removingNode.getValue();
    }


    public int indexOf(E e) {
        MyNode<E> node = head;
        int count = 0;
        while (!node.getValue().equals(e)) {
            node = node.getNext();
            count++;
        }
        System.out.println(count);
        return count;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public boolean removeAll(E e) {
        MyNode<E> node = head;
        MyNode<E> subNode = new MyNode<>(e, null);
        int count = 0;
        if (!head.getValue().equals(e)) {
            while (!node.getValue().equals(e)) {//бежим до элемента равного удаляемому
                node = node.getNext();          //теперь в ноде лежит удаляемое значение
                count++;                        //счётчиком выясняем номер позиции
            }
            node = head;                        //поэтому начинаем с начала списка, и бежим до
            for (int i = 0; i < count - 1; i++) {//предудаляемого
                node = node.getNext();
            }
            subNode = node.getNext();// храним удаляемый элемент в вспомогательном узле
            if (subNode.getNext() != null) {// если после удаляемого не налл, то связываем
                node.setNext(subNode.getNext());
            }//связываем предудаляемое с послеудаляемым
            else {// в противном случае
                node.setNext(null);
            }//следующий от предудаляемого налл

        } else {
            head = node.getNext();
        }
        return true;
    }


    public boolean containsAll(E e) {
        MyNode<E> node = head;
        if (head != null) {
            while (!node.getValue().equals(e)) {
                node = node.getNext();
            }
            System.out.println(true);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (head != null) {
            MyNode<E> curNode = head;
            while (curNode.getNext() != null) {
                stringBuilder.append(curNode.getValue()).append(" ");
                curNode = curNode.getNext();
            }
            stringBuilder.append(curNode.getValue());
        }
        return stringBuilder.toString();
    }
}
