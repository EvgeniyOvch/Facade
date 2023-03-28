public class BinOps {

    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
    public String sum(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int result = aInt+bInt;
        return  Integer.toBinaryString(result);
        //return Integer.toBinaryString(aInt + bInt);
    }
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/

    public String mult(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aInt * bInt);
    }
}