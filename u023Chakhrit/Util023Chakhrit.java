package u023Chakhrit;

public final class Util023Chakhrit {
    private static long seed023 = 66130500023L; //6.1
    private Util023Chakhrit(){} //6.2
    public static long unique023Chakhrit(){
        long newSeed023 = seed023;
        seed023 += (int) (1 + 9 *  Math.random()); // 0-9
        return newSeed023;
    }

    public static int checkDigit023(long number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        // วิธีที่ 1
//        boolean odd = true;
//        while(number > 0){
//            long digit = number % 10;
//            if(odd){
//                sum+=digit;
//            }else{
//                sum-=digit;
//            }
//            number /= 10;
//        }

        // วิธีที่ 2
//        for(boolean odd = true; number > 0 ; number /= 10 ){
//            long digit = number % 10;
//            if(odd){
//                sum+=digit;
//            }else{
//                sum-=digit;
//            }
//        }

        //วิธีที่  3
//        for(int sign = 1; number > 0 ; number /= 10 , sign*=-1 ){
//            long digit = number % 10;
//            sum += number % 10 * sign;
//        }
        // วิธีที่ 3
        for(int sign = 1; number > 0 ; number /= 10 , sign = 0 - sign ){
            long digit = number % 10;
            sum += number % 10 * sign;
        }
        // more addition
        if(sum < 0) sum*=-1;
        return sum;
    }

}
