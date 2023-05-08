public final class Ucheniki extends Teachers {
    /*не наследуемый класс*/
    private String surname;

    private int DateOfBirth;

    public String getSurname() {
        return surname;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public Ucheniki(int age, String name, String pol, int id, String surname, int dateOfBirth) {
        super(age, name, pol, id);
        this.surname = surname;
        DateOfBirth = dateOfBirth;

    }

    public Ucheniki(int age, String name, String pol, int id, String surname) {
        super(age, name, pol, id);
        this.surname = surname;
        super.getAreaEnum();
        super.getHome();
    }


    public String getInfo() {
        return super.getInfo() +

                "\n Фамилия: " + surname +
                "\n Дата рождения: " + DateOfBirth;
    }
}
