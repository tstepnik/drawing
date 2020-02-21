import java.util.Scanner;

public class Draw {
    Scanner sc = new Scanner(System.in);

    public void chooseAndDraw() {

        System.out.println("Co chciałbyś wydrukować?");
        System.out.println("tree/rectangle/square");
        String choose = sc.nextLine();

        switch (choose) {
            case "tree":
                System.out.println("Podaj wysokość choinki:");
                int height = nextInt();
                Tree tree = new Tree(height);
                tree.draw();
                break;
            case "rectangle":
                System.out.println("Podaj długość pierwszego boku:");
                int sideA = nextInt();
                System.out.println("Podaj długość drugiego boku:");
                int sideB = nextInt();
                Rectangle rectangle = new Rectangle(sideA,sideB);
                rectangle.draw();
                break;
            case "square":
                System.out.println("Podaj długość boku:");
                int side = nextInt();
                Square square = new Square(side);
                break;
            case "exit":
                System.out.println("Zakończenie programu.");
            default:
                System.out.println("Podałeś niepoprawne dane.");

        }
    }

    private int nextInt() {
        int x = sc.nextInt();
        sc.nextLine();
        return x;
    }


}
