public class Person {
    String name;
    Integer age;
    Gender gender;

    public Person(String name, Integer age, Gender gender ) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{Имя ='" + name + '\'' + ", возраст=" +
                age + '\'' + " род=" + gender.getGender() + '}';
    }

    enum Gender {
        MAN("Мужской"),
        WOMAN("Женский");

        private  String gender;

        Gender(String gender) {
            this.gender = gender;
        }
        public String getGender(){
            return gender;
        }

    }


}
