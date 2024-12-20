import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         //Задание 1
        Scanner scanner = new Scanner(System.in);
         System.out.println("Задание 1");
        System.out.println("Введи заглавную букву английского алфавита:");
        String input = scanner.nextLine();
        if (validateInput(input)){
            int i=Alphabet.valueOf(input).ordinal();
            System.out.println("Позиция буквы " + input + " :" + (i+1));
        } else {
            System.out.println("Введена неправильная буква");
        }
        //Задание 2
        System.out.println("Задание 2");
        List<Person> humans = new ArrayList<>();
        humans.add(new Person("Иван", 25, Person.Gender.MAN));
        humans.add(new Person("Ирина", 23, Person.Gender.WOMAN));
        humans.add(new Person("Николай", 28, Person.Gender.MAN));
        humans.add(new Person("Анна", 21, Person.Gender.WOMAN));
        humans.add(new Person("Матвей", 26, Person.Gender.MAN));
        humans.add(new Person("Надежда", 21, Person.Gender.WOMAN));
        humans.add(new Person("Иван", 34, Person.Gender.MAN));
        humans.add(new Person("Мария", 33, Person.Gender.WOMAN));
        humans.add(new Person("Юрий", 38, Person.Gender.MAN));
        humans.add(new Person("Алла", 27, Person.Gender.WOMAN));

        System.out.println("Введи пол человека MAN/WOMAN:");

        String inputGenger = scanner.nextLine();
        if (validateGender(inputGenger)){
            for (Person human : humans) {
                if (human.gender.name().equals(inputGenger)) {
                    System.out.println(human);
                }
            }
        }else {
            System.out.println("Ошибка введения данных");
        }
   }

    public static boolean validateInput(String input){
        Alphabet[] types = Alphabet.values();
        for (Alphabet charDate: types) {
            if (charDate.name().equals(input)) {
                return true;
            }
        }
        return false;
    }

    enum Alphabet {
        A,B,C,D,I,F,G,H,K,J,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
    }

    public static boolean validateGender(String input){
        Person.Gender[] types = Person.Gender.values();
        for (Person.Gender str: types) {
            if (str.name().equals(input)) {
                return true;
            }
        }
        return false;
    }

}