public class Product {
    private String PT;
    private String address;
    private String country ;

    public Product(String PT, String address, String country) {
        this.PT = PT;
        this.address = address;
        this.country = country;
    }

    public String getPT() {
        return PT;
    }


    public void setPT(String PT) {
        this.PT = PT;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "product{" +
                "PT='" + PT + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

