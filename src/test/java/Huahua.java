import org.junit.Test;

public class Huahua {
    @Test
    public void huahua() {
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 4 - a; b++)
                System.out.print(" ");
            for (int c = 1; c <= a * 2 - 1; c++)
                System.out.print("*");
            System.out.println();
        }
        for (int d = 3; d >= 1; d--) {
            for (int b = 1; b <= 4 - d; b++)

                System.out.print(" ");

            for (int c = 4 - d; c <= 2 + d; c++)
                System.out.print("*");
            System.out.println();
        }
    }
}
