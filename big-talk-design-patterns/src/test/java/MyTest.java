import org.junit.Test;

import java.util.ArrayList;

/**
 * @author zhouzh
 * @since 2023/6/7 10:26
 */
public class MyTest {

    @Test
    public void testList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");

        list.remove(1);
        list.remove(1);

        list.forEach(System.out::println);
    }
}
