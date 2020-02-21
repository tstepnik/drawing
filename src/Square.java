

public class Square implements Drawable {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println();
        slide();
        for (int i = 0; i < this.side; i++) {
            System.out.print("*  ");
        }

        for (int i = 0; i < side - 2; i++) {
            System.out.println();
            slide();
            System.out.print("*  ");
            for (int j = 0; j < side - 2; j++) {
                System.out.print("   ");
            }

            System.out.print("*");
        }

        System.out.println();
        slide();
        for (int i = 0; i < this.side; i++) {
            System.out.print("*  ");
        }

        System.out.println();
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void slide() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" ");
        }
    }
}

