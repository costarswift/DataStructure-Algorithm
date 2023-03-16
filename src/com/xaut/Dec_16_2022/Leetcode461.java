package com.xaut.Dec_16_2022;

public class Leetcode461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(10, 15));
        System.out.println(hammingDistance2(10, 15));
        System.out.println(hammingDistance3(10, 15));
        System.out.println(Integer.bitCount(10 ^ 15));
        System.out.println(Integer.bitCount(-1));
    }

    public static int hammingDistance(int x, int y) {
        return countBits(x ^ y);
    }

    private static int countBits(int n) {
        return n == 0 ? 0 : countBits(n >> 1) + (n & 1);
    }

    public static int hammingDistance2(int x, int y) {
        int s = x ^ y, ret = 0;
        while(s != 0){
            ret += s & 1;
            s >>= 1;
        }
        return ret;
    }

    public static int hammingDistance3(int x, int y) {
        int s = x ^ y, ret = 0;
        while (s != 0) {
            s &= s - 1;//每跟上一个数按位与，就会从右至左消去一个“1”.
            ret++;
        }
        return ret;
    }

    public static int Bitcount (int i) {
        //HD, figure 5-2
        /*
         * Every two bits is a unit, the original unit 1 is stored in the original unit
         */
        i = i - ((i >>> 1) & 0x55555555);
        /*
         * 0x33333333 is actually binary system ...
         * 00110011 (a total of 32), because each of the two bits above represents the number of 1,
         * so the following lines are to add each of the above two number,
         * the following line of code can be understood,
         * each 4 bits divided into a group, and then 4 bits of each two bits added,
         * the result of the addition is stored in the 4 bits binary number,
         * I & 0x33333333 represents a low of 2 bits per 4 bits,
         * (I >>> 2) & 0x33333333 represents a high 2 bits per 4 bits, and then add
         */
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        /*
         * This better understanding, I >>> 4 means to move to the right 4 bits, and then add to I,
         * equivalent to every 8 bits of a group,
         * and then 8 bits in the high 4-bit and low 4 bits of the addition stored in the low 4 bits,
         * and here in the 0x0f0f0f0f with the operation,
         * the high The 4-bit is completely set to 0,
         * because the 0x0f0f0f0f with binary representation is 00001111000011110000111100001111,
         * see here may be a bit confusing, why here and 0x0f0f0f0f with the operation, because every 8 bit a group,
         * Up to 8, then 4 digits enough, high 4 bit is not necessary,
         * if the pail for 0 has no effect, in fact,
         * if the number of bits of 1 is very little is not affected,
         * but if the number of 1 is more than the result of the calculation can go forward bit,
         * resulting in error,
         * so this step to be carried out Once with the operation,
         * then why the above line of code does not put 4 bits in a group of high two positions 0,
         * this is because the 4-bit group has a maximum of 4 1,
         * while the 2-bit binary number represents a maximum of 3,
         * less than 4, so cannot be set to 0,
         * */
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        /*
         * and similar above, each 16 bits divided into a group, each group of high 8-bit and low 8 bits added,
         * here the code added is very clean,
         * because whether it is high 8-bit or low 8 bits in the top 4 in the line above has been set to 0,
         * here can also be as above, after adding to the 0X00FF00FF is carried out and operation,
         * but it is not necessary here, because the int type is 32 bits,
         * up to 32 1, with 8 digits to store enough,
         * so no more than 8 bits, there is no need to worry over 8 bits in the forward 1-bit problem.
         */
        i = i + (i >>> 8);
        /*
         * Similar to above, not in detail
         */
        i = i + (i >>> 16);
        /*
         * To finally why and 0x3f with the operation, 0x3f with binary representation is 111111,
         * because the above two lines are not performed and operation,
         * so the previous data are not valid,
         * only the last 8 bits are valid, and then 8 bits of the first two not to mention 0,
         * because the most 32 1, with the following 6 digits is enough, so here and 0x3f with the operation,
         * to calculate the number of final 1
         */
        return i & 0x3f;

    }


}
