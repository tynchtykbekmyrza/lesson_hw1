public class Home {
    private String address;
    private int distance;

    public String getAddress() {
        return address;
    }

    public int getDistance() {
        return distance;
    }

    public Home(String address, int distance) {
        this.address = address;
        this.distance = distance;
    }
    private  String getInfo (){
        return
                "\n Адрес " + address +
                        "\n Расстояние до школы "  + distance;
    }
}

