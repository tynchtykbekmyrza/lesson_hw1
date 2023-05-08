public class Teachers extends Director{
    private String Pol;
    private int id;

    public String getPol() {
        return Pol;
    }

    public int getId() {
        return id;
    }

    public Teachers(int age, String name, String pol, int id) {
        super(age, name, new Home("Lenina", 12), AreaEnum.Oktober);
        this.Pol = pol;
        this.id = id;

    }
    public String getInfo() {
        return "\nПол: " + Pol +
                "\nПаспорт номер: " + id  +
                "\nВозраст " +getAge() +
                "\nИмя " +getName() +
                "\nРайон " +getAreaEnum() +
                "\nАдрес " + getHome().getAddress() +
                "\nРасстояние до школы км  " +getHome().getDistance();


    }

    public void makeSpeak() {System.out.println("Я учитель"); }

    public void makeSpeak(String speak) {
        System.out.println(speak);
    }
}
