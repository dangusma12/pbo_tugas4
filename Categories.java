public class Categories {
    private String bahan;
    private String jesnih;
    private String nama_barang;
    private Product product;


    public Categories(Categories sueb) {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Categories(String bambu_kayau, String kategoriBahan) {
        this.bahan = bahan;
        this.jesnih = jesnih;
        this.nama_barang = nama_barang;
        this.product = product;


    }

    @Override
    protected   Categories clone() throws CloneNotSupportedException {
        Categories seub = null;
        try {
            seub = (Categories) super.clone();
        } catch (CloneNotSupportedException e) {
            seub = (Categories) super.clone();
        } catch(CloneNotSupportedException){
        new Categories(this.getNama_barang(), this.getBahan(),this.getJesnih(),this.getProduct());
        }
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getJesnih() {
        return jesnih;
    }

    public void setJesnih(String jesnih) {
        this.jesnih = jesnih;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    @Override
    public String toString() {
        return "categories{" +
                "bahan='" + bahan + '\'' +
                ", jesnih='" + jesnih + '\'' +
                ", nama_barang='" + nama_barang + '\'' +
                '}';
    }
}