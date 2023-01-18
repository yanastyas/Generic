public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox1 = new MagicBox(3);
        magicBox1.add("one! ");
        System.out.println((String)magicBox1.pick());

        MagicBox<Integer> magicBox2 = new MagicBox(4);
        magicBox2.add(Integer.valueOf("two! "));
        System.out.println((Integer)magicBox2.pick());
    }
}