package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class giveDate {

    public static void main(String[] args) {
        System.out.println("该程序旨在得出用户输入日期的后天日期");
        System.out.println("------------------------------");

        while (true) {
            printMenu();
            System.out.println("");

            int choice = Integer.parseInt(input("请输入年月份:"));
            if(choice == 000) {
                System.out.println("程序成功退出！");
                System.exit(0);
                break;
            }

            int year = choice/10000;
            int month = (choice-10000*year)/100;
            int day = choice%100;
            if(year<1000 || year>9998 || month<1 || month >12 || day<1 || day>31) {
                System.out.println("请按要求输入正确的日期格式！");
                continue;
            }

            switch(month) {
                case 1:	if(day == 30) { day = 1;month += 1;
                } else if(day == 31) {day = 2;month += 1;
                } else  { day += 2; };
                    break;

                case 2: if (year%4 != 0) {
                    if(day == 27) { day = 1;month += 1;
                    } else if(day == 28) { day = 2;month += 1;
                    } else if(day>=1 && day<=26 ) { day += 2;
                    } else { System.out.println("平年二月有二十八天！");continue; };
                } else {
                    if(day == 28) { day = 1;month += 1;
                    } else if(day == 29) { day = 2;month += 1;
                    } else if(day>=1 && day<=27 ) { day += 2;
                    } else { System.out.println("闰年二月有二十九天！");continue; };
                }
                    break;

                case 3:	if(day == 30) { day = 1;month += 1;
                } else if(day == 31) { day = 2;month += 1;
                } else { day += 2; };
                    break;

                case 4:	if(day == 29) { day = 1;month +=1;
                } else if(day == 30) { day = 2;month += 1;
                } else if(day>=1 && day<=28 ) { day += 2;
                } else { System.out.println("四月有三十天！");continue; };
                    break;

                case 5:	if(day == 30) { day = 1;month += 1;
                } else if(day == 31) { day = 2;month += 1;
                } else { day += 2; };
                    break;

                case 6:	if(day == 29) { day = 1;month +=1;
                } else if(day == 30) { day = 2;month += 1;
                } else if(day>=1 && day<=28 ) { day += 2;
                } else { System.out.println("六月有三十天！");continue; };
                    break;

                case 7:	if(day == 30) { day = 1;month += 1;
                } else if(day == 31) { day = 2;month += 1;
                } else { day += 2; };
                    break;

                case 8:	if(day == 30) { day = 1;month += 1;
                } else if(day == 31) { day = 2;month += 1;
                } else { day += 2; };
                    break;

                case 9:	if(day == 29) { day = 1;month +=1;
                } else if(day == 30) { day = 2;month += 1;
                } else if(day>=1 && day<=28 ) { day += 2;
                } else { System.out.println("九月有三十天！");continue; };
                    break;

                case 10: if(day == 30) { day = 1;month += 1;
                } else if(day == 31) { day = 2;month += 1;
                } else { day += 2; };
                    break;

                case 11: if(day == 29) { day = 1;month +=1;
                } else if(day == 30) { day = 2;month += 1;
                } else if(day>=1 && day<=28 ) { day += 2;
                } else { System.out.println("十一月有三十天！");continue; };
                    break;

                case 12: if(day == 30) { day = 1;month = 1;year += 1;
                } else if(day == 31) { day = 2;month = 1;year += 1;
                } else { day += 2; };
                    break;

            }
            System.out.println("您输入的日期的后天的日期为"+year+"年"+month+"月"+day+"日");
        }
    }


    // 打印提示
    public static void printMenu() {
        System.out.println("");
        System.out.println("请您用阿拉伯数字以12340101的格式输入年月日");
        System.out.println("注意输入的年份在1000~9998之间");
        System.out.println("如果想退出程序，请输入'000'");

    }
    // 从控制台获取用户输入
    public static String input(String prompt) {
        System.out.print(prompt);
        String input = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

}
