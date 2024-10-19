public class N2_31 {
    public static void main(String[] args) {
        System.out.println("Number  Square  Cube");

        for(int num = 0; num < 11; num++){
            int square = num*num;
            int cube = num*num*num;
            System.out.printf("%d       %d       %d\n", num, square, cube);
        }
    }
}