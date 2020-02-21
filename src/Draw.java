import java.util.InputMismatchException;
import java.util.Scanner;

public class Draw {
    Scanner sc = new Scanner(System.in);

    public final static String RECTANGLE_NAME = "rectangle";
    public final static String SQUARE_NAME = "square";
    public final static String TREE_NAME = "tree";
    public final static String EXIT = "exit";

    public void chooseAndDraw() {
        boolean error = true;
        while (error) {
            try {
                String choose = "";
                while (!choose.equals(EXIT)) {

                    System.out.println("Co chciałbyś wydrukować?");
                    System.out.println("tree/rectangle/square");
                    System.out.println("wyjście z gry, wpisz- " + EXIT);
                    choose = sc.nextLine();
                    switch (choose) {
                        case TREE_NAME:
                            System.out.println("Podaj wysokość choinki:");
                            int height = nextInt();
                            Tree tree = new Tree(height);
                            tree.draw();
                            break;
                        case RECTANGLE_NAME:
                            System.out.println("Podaj długość pierwszego boku:");
                            int sideA = nextInt();
                            System.out.println("Podaj długość drugiego boku:");
                            int sideB = nextInt();
                            Rectangle rectangle = new Rectangle(sideA, sideB);
                            rectangle.draw();
                            break;
                        case SQUARE_NAME:
                            System.out.println("Podaj długość boku:");
                            int side = nextInt();
                            Square square = new Square(side);
                            break;
                        case EXIT:
                            System.out.println("Zakończenie programu.");
                        default:
                            System.out.println("Możesz wpisywać tylko słowa podane w instrukcji.");
                    }
                }

                error = false;

            } catch (InputMismatchException i) {
                System.out.println("Podawaj tylko znaki zgodne z instrukcją, nie wpisuj liczb tam gdzie wymagana" +
                        " jest liczba i odwrotnie.");
                sc.nextLine();
            }
        }
    }

    private int nextInt() {
        int x = sc.nextInt();
        sc.nextLine();
        return x;
    }


}
