public class Main {
    public static void main(String[] args) {
        IntegerSequence r = new Range(10, 20);
        int i = 0;
        while (i < 20) {
            System.out.print(r.next());
            if (r.hasNext()) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.println();
    }
}