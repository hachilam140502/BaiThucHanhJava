import java.util.ArrayList;

import javax.lang.model.element.Element;
public class App1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> a = new ArrayList<>();
        a.add("Ha");
        a.add("Chi");
        a.add("Lam");
        a.add("love");
        a.add("you");
        System.out.println(a);
        for (int i = 0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        a.set(index 4, Element:"football");
        System.out.println(a);
    }
}
