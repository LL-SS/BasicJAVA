public class While {

    public static void main(String[] args) {

        int num = 10000;
        int key = 153;

        // 여기에 코드를 작성하세요.
        int i = 0;

        while (key * i < num) {
            i ++;
        }

        System.out.println(key * (i - 1));
    }

}