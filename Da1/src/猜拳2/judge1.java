package 猜拳2;

import java.util.Random;
import java.util.Scanner;

public class judge1 {
    public static void main(String[] args) {
        gameStart();
    }
    public static void gameStart()
    {
        System.out.println("请输入你的选择：1.剪刀 2.石头 3.布");
        Scanner scan=new Scanner(System.in);
        int under=scan.nextInt();
        Random random=new Random();
        int system=random.nextInt(3)+1;
        judge(under,system);
    }
    public static void judge(int under,int system)
    {
        System.out.println("你的选择是"+getChoice(under)+"系统的选择是"+getChoice(system));
        if(under<=0||under>3)
        {
            System.out.println("游戏结束");
        }else if(under==1&&system==3)
        {
            System.out.println("用户赢");
        }
        else if(system==1&&under==3)
        {
            System.out.println("系统赢");
        }
        else if(under>system)
        {
            System.out.println("用户赢");
        }
        else if(system>under)
        {
            System.out.println("系统赢");
        }
        else
        {
            System.out.println("平局");
        }
    }
    public static String getChoice(int choice)
    {
        switch (choice){
            case 1:return "剪刀";
            case 2:return "石头";
            case 3:return "布";
            default:return"错误";
        }
    }
}
