package 猜拳;

import java.util.Random;
import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        gameStart();
    }
    public static void gameStart()
    {
        System.out.println("请输入你的选择:1.剪刀 2.石头 3.布");
        Scanner scanner=new Scanner(System.in);
        int underchoice=scanner.nextInt();
        Random random=new Random();
        if(underchoice<=0||underchoice>3)
        {
            System.out.println("游戏结束");
        }
        else
        {
            int systemchoice=random.nextInt(3)+1;
            judge(underchoice,systemchoice);
        }
    }
    public static void judge(int underchoice,int systemchoice)
    {
        System.out.println("你的选择是"+getChoice(underchoice)+"系统的选择是"+getChoice(systemchoice));
        if (underchoice==1&&systemchoice==3)
        {
            System.out.println("用户赢");
        }
        else if(systemchoice==1&&underchoice==3)
        {
            System.out.println("系统赢");
        }
        else if(systemchoice>underchoice)
        {
            System.out.println("系统赢");
        }
        else if(underchoice>systemchoice)
        {
            System.out.println("用户赢");
        }
        else
        {
            System.out.println("平局");
        }
    }
    public static String getChoice(int choice)
    {
        switch(choice){
            case 1:
                return "剪刀";

            case 2:
                return "石头";

            case 3:
                return "布";

            default:
                return "错误";

        }

    }
}

