public class Switch {

    public static void main(String[] args) {

        int number = 134354;
        String result = "";

        // 여기에 코드를 작성하세요.
        switch (number % 7) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
        }

        System.out.println(result);

    }

}
