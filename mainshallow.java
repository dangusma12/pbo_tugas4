
public class mainshallow {
    public static void main(String args[]) {
        mainshallow main = new mainshallow();
        main.whenShallowCopying_thenObjectsShouldNotBeSame();
    }

    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        Product produksi = new Product("sahabat", "pasirsireum", "Indonesia");
        Categories kategori = new Categories("bambu kayau", "kayu bambu");

        kategori = new Categories(
                "bambu kayau", kategori.getBahan());

        kategori.setBahan("kayu bambu");
        kategori.setNama_barang("ayaman");
        System.out.print(produksi);
        System.out.print(kategori);
    }
}
