public class Main {
    public static void main(String[] args) {


        Teachers teachers = new Teachers(29,"Nurgazy","Мужской", 777);

        Ucheniki ucheniki = new Ucheniki(45, "Tynchtykbek","Мужской", 888,"Murzakulov", 220877);
        Ucheniki ucheniki1 = new Ucheniki(25,"Asel","Женский", 456, "Asanova");
        System.out.println(teachers.getInfo());
        teachers.makeSpeak();
        teachers.makeSpeak("Сегодня отличный день");
        System.out.println(ucheniki.getInfo());
        System.out.println(ucheniki1.getInfo());

    }
}