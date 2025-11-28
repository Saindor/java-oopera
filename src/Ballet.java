public class Ballet extends MusicalShow{

    private Choreographer choreographer;

    public Ballet(String title, int duration, Director director, Composer musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public void printChoreographer(){
        System.out.println(choreographer.toString());
    }
}
