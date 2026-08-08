import sprint.ListManipulator;
import java.util.ArrayList;
import java.util.List;

public class TestManipulator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListManipulator listManipulator = new ListManipulator();
        list = listManipulator.manipulateList(list);
        System.out.println(list);
    }
}