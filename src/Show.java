import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector(){
        System.out.println(director.toString());
    }

    public void printlistOfActors(){
        System.out.println("Актёры спектакля " + title + ":");
        for (Actor actor : listOfActors){
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor){
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр: " + actor + " уже есть в списке!");
        } else{
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameToReplace)){
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией: " + surnameToReplace + " заменён на: " + newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией: " + surnameToReplace + " не найден!");
    }
}
