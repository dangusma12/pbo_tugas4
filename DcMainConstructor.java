

public class DcMainConstructor {

    public static void main(String args[]) {
        DcMainConstructor main = new DcMainConstructor();
        main.testCase();
    }

    private void testCase() {
        Product product = new Product("sahabat","pasirsireum","indonesia");
        Categories sueb = new Categories("bambu kayau","kayu keras");
        Categories ucok = new Categories (sueb);

        ucok.getProduct().setAddress("pasirsireum");
        ucok.setBahan("bambu kayu");
        ucok.setJesnih("kerajinan");

        System.out.print(sueb);
        System.out.print(ucok);
    }
}
