package lesson7;

public class StringLesson {
    public static void main(String[] args) {
        String text = "пішла по справам їжа в холодильнику";//перевіряє чи немає вже строчки з таким текстом
        String text2 = "пішла по справам їжа в холодильнику";//перевіряє чи немає вже строчки з таким текстом

        //string pull
        System.out.println("kek");//це шукається в пуле і кладеться в пул
        System.out.println("kek");//це береться з пула

        System.out.println(text == text2);
        System.out.println(text.equals(text2));

        System.out.println("_______");

        String text3 = new String("пішла по справам їжа в холодильнику");
        System.out.println(text == text3);
        System.out.println(text.equals(text3));
        System.out.println("_______");
//        String a = "1";
        String b = "1";

        String c = new String("1" + "2");
        b += 1;
        System.out.println(b);
//        System.out.println(a);

        String text4 = "Я люблю їсти суп";
        System.out.println(text4);
        System.out.println(text4.replace("суп", "землю"));
    }
}
