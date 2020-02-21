public class Rectangle extends Square implements Drawable {
    private int secondSide;

    public Rectangle(int side, int secondSide) {
        super(side);
        this.secondSide = secondSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println();

        for (int i = 0; i < getSide(); i++) {
            slide();
            for (int i1 = 0; i1 < getSecondSide(); i1++) {
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}
