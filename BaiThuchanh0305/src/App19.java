public class App19 {
    import java.until.ArrayList ;
    import java.until.ListIterator ;
    public class ArrList{
        public static void main (String[] args){
            ArrayList<Character>  arrayListChar = new  ArrayList<>();
            arrListChar.add("a");
            arrListChar.add("e");
            arrListChar.add("b");
            arrListChar.add("c");
            ListIterator<Character> listIterator = arrListChar.listIterator();
            System.out.println("Các phần tử có trong arrListString là: ");
            while (listIterator.hasNext()) {
                Sytem.out.print(listIterator.next + "\t"); }
    }
}