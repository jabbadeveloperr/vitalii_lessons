package lesson11;

import java.util.Arrays;

public class SecondStringLesson {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String text = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            //     text += "k";  text = text + "k";
            //       text = text.concat("k");
            sb.append(i + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println("Час роботи:" + (end - start));
        sb.append(sb);

        System.out.println("__________________");

        String[] lastNames = {"константинов", "некрономеКонстантиновенко", "Константинович", "Литвинов"};

        for (int i = 0; i < lastNames.length; i++) {
//            if (lastNames[i].substring(0, 7).toLowerCase().contains("констан")) {
//            System.out.println("В нас є співпадіння:" + lastNames[i]);

            String firstChar = lastNames[i]
                    .substring(0, 1)
                    .toUpperCase();
            String lastNameWithoutFirstChar = lastNames[i].substring(1).toLowerCase();
            lastNames[i] = firstChar + lastNameWithoutFirstChar;
//            }
        }
        System.out.println(Arrays.toString(lastNames));
    }
}
