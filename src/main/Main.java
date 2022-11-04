package main;

public class Main {
    public static void main(String[] args) {

        GamePanel panel = new GamePanel();
        Window.frame.add(panel);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Place place1 = new Place(200*i, 200*j);
                panel.add(place1);
            }
        }

        Window window = new Window();
        window.setSize(616, 639);
    }
}
