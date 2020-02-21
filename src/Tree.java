public class Tree implements Drawable {
    private int height;

    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        int numberOfStars = 1;
        int emptySpace = height+10;

        System.out.println();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < emptySpace; j++) {
                System.out.print(" ");
            }

            for (int i1 = 0; i1 < numberOfStars; i1++) {
                System.out.print("*");
            }

            System.out.println();
            numberOfStars += 2;
            emptySpace--;
        }
        System.out.println();
    }
}
