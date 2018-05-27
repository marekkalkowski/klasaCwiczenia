public class Menu {

    int number;
    String text;


    public Menu() {
        //number = 1;
        //text = "some text";
    }

    public Menu(int number) {
        this.number = number;
    }

    public Menu(String someText) {
        this.text = someText;
    }

    public Menu(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public Menu(String text, int number) {
        this.number = number;
        this.text = text;

    }
}
