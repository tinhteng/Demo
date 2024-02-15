import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class Demo{
    public static void main(String[] args) {

        // covert time UTC to local time
        //TH1:
        // get UTC time
        LocalDateTime nowUTC = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println("now " + nowUTC);

        Timestamp tsUTC = Timestamp.valueOf(nowUTC);

        // convert to local time
        LocalDateTime lct = nowUTC.atOffset(ZoneOffset.UTC).atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("lct " + lct);

           // convert to milli second
        long cv = nowUTC.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println("cv " + cv);


        // TH2:
//        LocalDateTime lc = LocalDateTime.now().atOffset(ZoneOffset.UTC).toLocalDateTime();
//        System.out.println("lc " + lc);


        // Convert Long to time
        Instant time= Instant.ofEpochMilli(1701310074910L);

        LocalDateTime check = LocalDateTime.ofInstant(time, ZoneOffset.systemDefault());
        Timestamp cv4 = Timestamp.valueOf(check);
        System.out.println(cv4);

        LocalDateTime cv5 = time.atOffset(ZoneOffset.UTC).atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
        Timestamp cv6 = Timestamp.valueOf(cv5);

        cv5.toString();



        BigDecimal bd = new BigDecimal("2.11633419E8");
        long val = bd.longValue();

        String a = "2.0E10";
        BigDecimal cva = BigDecimal.valueOf(Double.parseDouble(a));
        System.out.println(cva);


        BigDecimal myNumber = new BigDecimal("2.0E10");

//        double myDouble = myNumber.doubleValue();

        NumberFormat formatter = new DecimalFormat("#.##########");
        BigDecimal fm = new BigDecimal(formatter.format(myNumber));
        System.out.println(fm);

        // 1701174785159


        Timestamp timestamp = new Timestamp(1701176751171L);
        System.out.println(timestamp.toString());

//        String time7 = Instant.ofEpochMilli(1701243591550L).toString();
//        System.out.println("time7 " + time7);
//
//        String time8 = new Timestamp(1701243591550L).toString();
//        System.out.println("time8 " + time8);
//

//        System.out.print("goodbye");
//        System.out.println(" my love");
//        int a = 2;
//        int b = 3;
//        int c = 1;
//
//        System.out.println(a/b-c);
//        System.out.println(a/b);
//
//        String day;
//        int date;
//        String month;
//        int year;
//
//        day = "Monday";
//        month = "May";
//        date = 15;
//        year = 2023;
//
//        System.out.println("day: " + day);
//        System.out.println("month: " + month);
//        System.out.println("date: " + date);
//        System.out.println("year: " + year);
//
//        System.out.print(day + ", ");
//        System.out.print(month + " ");
//        System.out.print(date + ", ");
//        System.out.println(year);
//
//
//        System.out.println("American format:" + "\n" );
//        System.out.println(day + ", " + month + " " + date + ", " + year + "\n");
//        System.out.println("European format:" + "\n");
//        System.out.println(day + " " + date + " " + month + ", " + year + "\n");
//
//
//        String text = "ababca";
//        text = text.replace("a", "d");
//        System.out.println(text);
//
//        String text2 = "abcdefghij\n"
//                + "klmnopq\nzzzz";
//        System.out.println("Chuoi ban dau:");
//        System.out.println(text2);
//        text2 = text2.replace("\n", "");
//        System.out.println("\n");
//        System.out.println("Chuoi ket qua");
//        System.out.println(text2);


    }

    public static long calculateValueWithExchangeRate(long value, long contractSize, long exchangeRate) {
        BigDecimal rate = BigDecimal.valueOf(exchangeRate * 1.0 / contractSize);

        return rate
                .multiply(BigDecimal.valueOf(value))
                .longValue();
    }

    public static String timestampToString(Timestamp timestamp, String format) {
        return new SimpleDateFormat(format).format(new Date(timestamp.getTime()));
    }

    public static long setScale(long value, int scale, long contractSize, RoundingMode mode) {
        if (contractSize <= 0)
            return value;

        BigDecimal valueDecimal = new BigDecimal(String.valueOf(value))
                .divide(new BigDecimal(String.valueOf(contractSize)), scale, mode);

        return valueDecimal.multiply(new BigDecimal(String.valueOf(contractSize))).longValue();
    }

    public static long calculateValueWithExchangeRate1(long value, long exchangeRate, long contractSize) {
        long amount = calculateValueWithExchangeRate(value, contractSize, exchangeRate);
        return setScale(amount, 0, contractSize, RoundingMode.DOWN);


    }


    public static void loop(int n) {
        int i = n;
        while (i > 3) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i/2;
            } else {
                i = i + 1;
            }
        }
    }

    static String reverseString(String s) {
        StringBuilder reverseString = new StringBuilder();

        for (int i = (s.length()-1); i >= 0; i--) {
            reverseString = reverseString.append(s.charAt(i));

        }
        return reverseString.toString();
    }

    static void printString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    static void printBack(String s) {
        for (int i = (s.length()-1); i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);

    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + "zoop");
        }else {
            System.out.println("ik1");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork) ;
    }
    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }

    public static void check_fermat(int a, int b, int c, int n) {
        if (n > 2 && raiseToPow(c, n) == (raiseToPow(a, n) + raiseToPow(b, n))) {
            System.out.println("Trời, Fenat đã lầm");
        }
        System.out.println("Không, vẫn không đúng");

    }

    public static double raiseToPow(int x, int n) {
        return Math.pow(x,n);

    }

    public static char first(String s) {
        return s.charAt(0);
    }

    public static String rest(String s) {
        return s.substring(1, s.length());
    }

    public static int length(String s) {
        return s.length();
    }

    static void print2ndBig (int arr[], int arr_size) {
        int second;

        if (arr_size <2) {
            System.out.println("invalid");
            return;
        }

        int first = second = Integer.MIN_VALUE;

        //Cach 1:

            // tim so lon nhat
        for (int i = 0; i <arr_size; i++ ) {
            first = Math.max(first, arr[i]);
        }

            // tim so lon nhat trong nhung so con lai
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] != first)
                second = Math.max(second, arr[i]);
        }
        // Cach 2:
//
//        for (int i = 0; i < arr_size; i++) {
//            if (arr[i] > first) {
//                first = arr[i];
//                second = first;
//            }
//
//            if (arr[i] < first && arr[i] > second) {
//                second = arr[i];
//            }
//        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("khoong ton tai phan tu lon thu 2");
        } else {
            System.out.println("phan tu lon thu 2" + second);
        }

        for (int i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                first = arr[i];
                second = first;
            }

            if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
    }



}
