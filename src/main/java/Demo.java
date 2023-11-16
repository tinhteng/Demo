import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

public class Demo{
    public static void main(String[] args) {

        // covert time UTC to local time
        //TH1:
        // get UTC time
        LocalDateTime nowUTC = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println("now " + nowUTC);

        // convert to local time
        LocalDateTime lct = nowUTC.atOffset(ZoneOffset.UTC).atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("lct " + lct);

           // convert to milli second
        long cv = nowUTC.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println("cv " + cv);


        // TH2:
        LocalDateTime lc = LocalDateTime.now().atOffset(ZoneOffset.UTC).toLocalDateTime();
        System.out.println("lc " + lc);


        // Convert Long to time
        Instant time= Instant.ofEpochMilli(cv);

        LocalDateTime check = LocalDateTime.ofInstant(time, ZoneOffset.systemDefault());
        System.out.println(check);


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


//        int hour = 14;
//        int minute = 19;
//        int second = 20;
//
//        int totalSecond;
//        System.out.println(hour + ":" + minute + ":" + second);
//
//        totalSecond = (minute * 60) + (60 * 60 * hour);
//        System.out.println("total second from mid night: " + totalSecond );
//
//        totalSecond = ((60 - minute) * 60) + ((24 - hour) * 60 * 60);
//        System.out.println("total second from now to mid night: " + totalSecond );


//        double x =  1;
//        double y = 3;
//
//        int a = 1;
//        int b = 3;
//        System.out.println(x/y);
//
//        System.out.println(a/b);

//        zippo("rattle1", 13);

//        int bizz = 5;
//        int buzz = 2;
//        zoop("just for", bizz);
//        clink(2*buzz);

//        check_fermat(2, 3, 4, 1);

//        System.out.println(first("viet"));
//        System.out.println(rest("viet"));
//        System.out.println(length("viet"));

//        String a = "viet";
//        printString(a);
//        printBack(a);
//
//        System.out.println(reverseString(a));

//        loop(10);
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
