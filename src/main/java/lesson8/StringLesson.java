package lesson8;

public class StringLesson {
    public static void main(String[] args) {
        System.out.println("lol" + 1);
        System.out.println();

//        String text = "";
//        for (int i = 0; i <100_000; i++) {
//            text += i;
//        }
//        System.out.println(text);

//        String text = "";
//        for (int i = 0; i < 100_000; i++) {
//            text = text.concat(i + "");
//        }
//        System.out.println(text);

//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < 10; i++) {
//            stringBuilder.append(i);
//        }
//
//        System.out.println(stringBuilder);

        String text = "Я їм соплі";
        String[] words = text.split(" ");
        String abr = "";
        for (int i = 0; i < words.length; i++) {
            abr += words[i].substring(0, 1).toUpperCase();
        }
        System.out.println(abr);

        String olegStory = "Олег пішов пити сік";
        if (olegStory.contains("Олег")){
            olegStory = olegStory.replace("пішов","пішов нахуй");
        }
        System.out.println(olegStory);

        String solovText = "КАТАСТРОФА НАЧАЛЬНОГО ОБРАЗОВАНИЯ В 90-Х. \n" +
                "Нужно помнить в каком состоянии были школы, чтобы оценить современные изменения.\n" +
                "ЭКСКЛЮЗИВНО для моего проекта «НОВЫЙ МИР ОТ ПЕРВЫХ ЛИЦ» министр Просвещения Российской Федерации СЕРГЕЙ СЕРГЕЕВИЧ КРАВЦОВ.\n" +
                "Совместный проект с выставкой «РОССИЯ» (https://t.me/forumrussianews) и телеканалом СОЛОВЬЕВ LIVE (https://t.me/SolovievLive) \n" +
                "ПОЛНУЮ ВЕРСИЮ ИНТЕРВЬЮ СМОТРИТЕ ПРЯМО СЕЙЧАС НА  СОЛОВЬЕВ LIVE (https://t.me/SolovievLive)";
        solovText = solovText.replace("СОЛОВЬЕВ","ХУЕЛОВЬЕВ");
        solovText = solovText.replace("ЛИЦ","ХУИЛИЦ");
        solovText = solovText.replace("РОССИЯ","СОСІЯ").trim();

        System.out.println(solovText);


    }
}
