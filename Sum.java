public class Sum {
    public static void main(String[] args) {
        Sum obj = new Sum();
        System.out.println(obj.sum(10, 19));

    }

    public int sum(int a, int b) {
        int c = a + b;
        System.out.println("Sum is" + c);
        return c;
    }

}
