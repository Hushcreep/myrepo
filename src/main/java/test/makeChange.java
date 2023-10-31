package test;

import java.util.*;

public class makeChange {

    public static void main(String[] args) {
        System.out.println("该程序旨在找出货币张数最少的找零方案。");
        System.out.println("------------------------------");

        while (true) {
            System.out.println("");
            System.out.println("请依次输入商品单价和和顾客付款。");
            System.out.println("注意商品单价和顾客付款的范围都在0-100之间，且为整数！");
            System.out.println("如果想退出程序，请输入两次“111”。");

            Scanner sc = new Scanner(System.in);
            int price = sc.nextInt();
            int pay = sc.nextInt();
            int change = pay - price;
            int one = 0;int fiv = 0;
            int ten = 0;int fif = 0;

            if(price == 111 && pay == 111) {
                System.out.println("程序成功退出！");
                System.exit(0);
                break;
            }
            if(price < 0 || price > 100) {
                System.out.println("请按要求输入！");
                continue;
            }
            if(pay < 0 || pay >100) {
                System.out.println("请按要求输入！");
                continue;
            }

            if(change == 0) {
                System.out.println("商品单价为"+price+"元,顾客付款为"+pay+"元。");
                System.out.println("为您找零"+change+"元:"+one+"张一元，"+fiv+"张五元，"+ten+"张十元，"+fif+"张五十元。");
            }else if(change > 0) {
                int rest = 0;rest = change;
                fif = change / 50;
                if(fif > 0) {
                    change = change - 50*fif;
                }
                ten = change / 10;
                if(ten > 0) {
                    change = change - 10*ten;
                }
                fiv = change / 5;
                if(fiv > 0) {
                    change = change - 5*fiv;
                }
                one = change / 1;

                System.out.println("商品单价为"+price+"元,顾客付款为"+pay+"元。");
                System.out.println("为您找零"+rest+"元:"+one+"张一元，"+fiv+"张五元，"+ten+"张十元，"+fif+"张五十元。");
            }else {
                System.out.println("请注意付款要大于单价！");
            }
        }
    }
}
