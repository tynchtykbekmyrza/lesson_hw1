public class Director {
    private int  age;
    private String name;
    private Home home;
    private AreaEnum areaEnum;


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Home getHome() {
        return home;
    }

    public AreaEnum getAreaEnum() {
        return areaEnum;
    }

    public Director(int age, String name, Home home, AreaEnum areaEnum) {
        this.age = age;
        this.name = name;
        this.home = home;
        this.areaEnum = areaEnum;
    }

}
