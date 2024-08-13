import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    private void add() {
        String word = "";
        String translation = "";

        System.out.print("Word: ");
        word = this.scanner.nextLine();
        System.out.print("Translation: ");
        translation = this.scanner.nextLine();

        this.dictionary.add(word, translation);
    }

    private void search() {
        String word = "";

        System.out.print("To be translated: ");
        word = this.scanner.nextLine();

        String translation = this.dictionary.translate(word);

        if(translation == null) {
            System.out.println("Word " + word + " was not found.");
        }
        else {
            System.out.println("Translation: " + translation);
        }
    }

    public void start() {
        String input = "";

        do {
            System.out.print("Command: ");
            input = this.scanner.nextLine();

            if(input.equals("end")) {
                break;
            }
            else if(input.equals("add")) {
                this.add();
            }
            else if(input.equals("search")) {
                this.search();
            }
            else {
                System.out.println("Unknown command");
            }
        } while(true);

        System.out.println("Bye bye!");
    }
}
