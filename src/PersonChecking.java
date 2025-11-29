import java.util.ArrayList;

public class PersonChecking {

    private static ArrayList<Person> allPersons = new ArrayList<>();

    public static boolean existingPerson(Person person){
        for (Person p : allPersons){
            if (p.getFullName().equals(person.getFullName())){
                return true;
            }
        }
        return false;
    }

    public static boolean register(Person person){
        if (existingPerson(person)){
            System.out.println("Участник '" + person.getFullName() + "' Уже существует!");
            return false;
        }
        allPersons.add(person);
        return true;
    }

    public static void printAll(){
        System.out.println("Все зарегистрированные люди:");
        for (Person p : allPersons){
            System.out.println(p.getFullName());
        }
    }


}
