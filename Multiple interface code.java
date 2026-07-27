interface Camera {
    void photo();
}

interface Music {
    void playmusic();
}

class Mobile implements Camera, Music {

    public void photo() {
        System.out.println("Photo taken");
    }

    public void playmusic() {
        System.out.println("Music playing");
    }
}

public class Main {
    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.photo();
        m.playmusic();
    }
}
