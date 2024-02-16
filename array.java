import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class array {
    public static void main(String[] args) {
        List<Integer> list=new List<Integer>(10,20,45,78,78,96,96,85,85,47,52,52);
        Set<Integer> set= new HashSet<>();
        list.forEach(x->System.out.println(x));
        System.out.println("hi");
    }
    
}
