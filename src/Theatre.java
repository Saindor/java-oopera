import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {


        Actor actor = new Actor("Денис","Родькин",Gender.MALE,186);
        Actor actor1 = new Actor("Евгений","Иванченко",Gender.MALE,172);
        Actor actor2 = new Actor("Светлана","Захарова",Gender.FEMALE,172);


        Director director = new Director("Гильермо", "дель Торо",Gender.MALE,25);
        Director director1 = new Director("София", "Коппола",Gender.FEMALE,12);


        Composer composer = new Composer("Макс","Рихтер",Gender.MALE);
        Choreographer choreographer = new Choreographer("Михаил", "Барышников",Gender.MALE);


        Show show = new Show("Современная драма",12,director);

        Opera opera = new Opera("Современная опера",135,director1,composer,"Либретто оперы...",50);

        Ballet ballet = new Ballet("Лебединное Озеро",145,director1,composer,"Либретто балета...",choreographer);


        show.addActor(actor);
        show.addActor(actor1);


        opera.addActor(actor2);
        opera.addActor(actor);

        ballet.addActor(actor);
        ballet.addActor(actor2);

        show.printlistOfActors();
        System.out.println("__________________________________________");
        opera.printlistOfActors();
        System.out.println("__________________________________________");
        ballet.printlistOfActors();
        System.out.println("__________________________________________");

        show.replaceActor(actor2,"Самойлова");
        System.out.println("__________________________________________");
        show.printlistOfActors();
        System.out.println("__________________________________________");

        opera.replaceActor(actor,"Лопатин");

        opera.printComposer();
        System.out.println("__________________________________________");
        opera.printLibretto();
        System.out.println("__________________________________________");

        ballet.printComposer();
        System.out.println("__________________________________________");
        ballet.printChoreographer();
        System.out.println("__________________________________________");
        ballet.printLibretto();
        System.out.println("__________________________________________");


        Choreographer choreographer1 = new Choreographer("Михаил", "Барышников",Gender.MALE);
    }
}
