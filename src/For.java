public class For {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            Gugu(i, 1);
        }

    }

    public static void Gugu(int level, int depth) {

        if (depth > 9) {
            return;
        } else {
            System.out.printf("%d * %d = %d%n", level, depth, level * depth);
            Gugu(level, depth + 1);
        }

    }

}
