package listPractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MyNode<E> {
    private E value;
    private MyNode<E> next;


}
