public class MusicalShow extends Show{

    protected Composer musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, Composer musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto(){
        System.out.println("Либретто спектакля " + title + ":");
        System.out.println(librettoText);

    }

    public void printComposer(){
        System.out.println(musicAuthor.toString());
    }
}
