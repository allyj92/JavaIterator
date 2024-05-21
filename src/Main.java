import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    ArrayList<String> list = new ArrayList<>();
    list.add("apple");
    list.add("banana");
    list.add("strawberry");
    list.add("orange");

    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()){
        String str = iterator.next();
        if(str.equals("strawberry")){
            iterator.remove();
        }
    }
    for(String fruit : list){
        System.out.println(fruit);
    }
    }
}