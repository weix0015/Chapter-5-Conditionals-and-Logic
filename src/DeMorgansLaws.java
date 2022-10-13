public class DeMorgansLaws {
    public static void main(String[] args) {
        // if (!(x == 0 || y == 0)) {
            // System.out.println("Neither x nor y is zero");
        // }

        // De Morgan's laws:
        // !(A && B) is the same as !A || !B
        // !(A || B) is the same as !A && !B

        // De Morgan's laws using the "opposite" relational operator:
        // !(x < 5 && y == 3) is the same as x >= 5 || y != 3
        // !(x >= 1 || y != 7) is the same as x < 1 && y == 7

        // "If x is not zero and y is not zero"

        // if (x != 0 && y != 0) {
            // System.out.println("Neither x nor y is zero");
        // }
    }
}
