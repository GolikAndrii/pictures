import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws AWTException {
        clearAll();
        System.out.println();
        delay();
        row_16();
        System.out.println();
        row_16();
        System.out.println();
        System.out.println();
        System.out.println();
        delay();
        rowFirst();
        System.out.println();
        delay();
        row_2();
        System.out.println();
        delay();
        row_3();
        System.out.println();
        delay();
        row_4();
        System.out.println();
        delay();
        row_5();
        System.out.println();
        delay();
        row_6();
        System.out.println();
        delay();
        row_7();
        System.out.println();
        delay();
        row_8();
        System.out.println();
        delay();
        row_9();
        System.out.println();
        delay();
        row_10();
        System.out.println();
        delay();
        row_11();
        System.out.println();
        delay();
        row_12();
        System.out.println();
        delay();
        row_13();
        System.out.println();
        delay();
        row_14();
        System.out.println();
        delay();
        row_15();
        System.out.println();
        System.out.println();
        System.out.println();
        delay();
        row_16();
        System.out.println();
        row_16();
    }

    public static void delay(){
        int delay = 350; // number of milliseconds to sleep
        long start = System.currentTimeMillis();
        while (start >= System.currentTimeMillis() - delay) ; // do nothing
    }
    public static void clearAll() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_Q);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_Q);
    }
    public static void rowFirst(){
        for (int i = 0; i<14; ++i){
            System.out.print(ConsoleColors.BLUE + '*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<11; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<8; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<6; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<8; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<5; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<8; ++i){
            System.out.print(' ');
        }

        for (int i = 0; i<5; ++i){
            System.out.print('*');
        }
    }
    public static void row_2(){
        for (int i = 0; i<14; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<11; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<8; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }

        for (int i = 0; i<7; ++i){
            System.out.print('*');
        }
    }
    public static void row_3(){
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<13; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<3; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<3; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }

        for (int i = 0; i<7; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print('*');
        }
    }
    public static void row_4(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<12; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<1; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<3; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<3; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<1; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_5(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<2; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<2; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_6(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<6; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_7(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<3; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<3; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_8(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<8; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<14; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<2; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_9(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<8; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<14; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_10(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_11(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_12(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_13(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_14(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<11; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }
    public static void row_15(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<11; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
    }

    public static void row_16(){
        for (int i = 0; i<69; ++i){
            System.out.print(ConsoleColors.BLUE_BRIGHT + '=' + ConsoleColors.RESET);
        }

    }



}
