package by.belstu.it.fedorov;
import  static java.lang.Math.*;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TestFunction obj = new TestFunction();
        System.out.println(obj.getValue());

        Scanner in = new Scanner(System.in);
        String cac = in.next();
        char symb = '&';
        int inum = 256;
        short snum = 128;
        byte bnum = 1;
        long lnum = 123098;
        double dnum = 23411;
        boolean flag = false;
        String str = "SomeText ";

        //Operations with basic types
        System.out.println(str + inum);
        System.out.println(str + symb);
        System.out.println(str + dnum);
        System.out.println(bnum + inum);
        System.out.println(inum + lnum + dnum);
        long test = 1L + 2147483647L;
        System.out.println(test);
        System.out.println(flag && false);
        System.out.println(flag ^ true);
        long hexnumber = 0x7fff_ffff_fffL;
        long bignum = 9223372036854775807L;
        System.out.println(hexnumber);
        System.out.println(bignum);
        char sym1 = 'a';
        char sym2 = '\u0061';
        System.out.println(sym1 + sym2);
        System.out.println(3.45 % 2.4);
        System.out.println(1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        double p = PI;
        double e = E;
        System.out.println(p);
        System.out.println(e);
        System.out.println(round(p));
        System.out.println(round(e));
        System.out.println(min(p, e));
        double random = random();
        System.out.println(random);

        Integer iobj = new Integer(10);
        Long lobj = new Long(100l);
        Character cobj = new Character('@');
        Boolean bobj = new Boolean(false);
        Double dobj = new Double(3.54d);
        Float fobj = new Float(2.13f);

        System.out.println(iobj + lobj);
        System.out.println(dobj > fobj);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        int primitivenum = iobj.intValue();
        System.out.println(primitivenum);
        System.out.println(iobj.parseInt("23"));
        System.out.println(iobj.toHexString(iobj.intValue()));
        System.out.println(iobj.toString());

        String s = "123456";
        Integer castnum1 = Integer.parseInt(s);
        Integer castnum2 = Integer.valueOf(s);
        System.out.println(castnum1);
        System.out.println(castnum2);
        String str1 = "Hello";
        String str2 = "Hello";
        byte[] bytearray = str1.getBytes();
        String sfrombytearray = new String(bytearray);
        System.out.println(sfrombytearray);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        str2 = null;
        //System.out.println(str1 == str2);
        //System.out.println(str1.equals(str2));
        //System.out.println(str1.compareTo(str2));
        //System.out.println(str1.split(str2));
        System.out.println(str1.contains("H"));
        System.out.println(str1.hashCode());
        System.out.println(str1.indexOf('o'));
        System.out.println(str1.length());

        char[][] cArray1 = new char[0][0];
        char [] cArray2 [] = {{'v', 'f'}, {'e', 'r', 's'}};
        char cArray3 [][] = {{'v', 'f'}, {' ', 'k', 'y'}};
        boolean comRez = cArray2 == cArray3;
        System.out.println(comRez);
        cArray2 = cArray3;
        for (char c:cArray2[0])
        {
            System.out.println(c);
        }

    }
}
