public class P27_JavaBigInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());
        System.out.println(a.add(b)+"\n"+a.multiply(b));
        s.close();
    }
}