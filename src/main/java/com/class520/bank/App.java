//: object/Documentation  
/**
 * this is a account management program
 *   @author hewenda
 *   @version 1.0 
 */
package com.class520.bank;

import java.util.Scanner;
public class App extends BankAccount
{
    public static void main( String[] args )
    {
        BankAccount b1=new BankAccount("zak",1000,500);
        Scanner in=new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            System.out.println();
            System.out.println("请根据提示输入所选业务：\n"+"1.取款\n"+"2.存款\n"+"3.查询余额\n"+"4.退出\n");

            switch (in.nextInt()) {
                case 1:
                    b1.withdraw();
                    break;
                case 2:
                    b1.deposite();
                    break;
                case 3:
                    b1.checkBalance();
                    break;
                case 4:
                    b1.exitSrv();
                    flag=false;
                    break;
                default:
                    System.out.println("请按规定输入服务序号！");
                    break;
            }
        }
    }
}
///:~ 