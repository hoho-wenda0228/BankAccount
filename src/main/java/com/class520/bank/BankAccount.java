
/**
 * Created by hewenda
 */
package com.class520.bank;
import java.util.Scanner;

/**
 * balance 当前余额
 * limit 当前可透支余额
 * name 用户姓名
 * credit 信用额度
 */
public class BankAccount {
    private float balance;
    private float limit;
    private String name;
    private float credit;

    public BankAccount(){}

    public BankAccount(String name,float balance,float limit){
        this.setBalance(balance);
        this.setLimit(limit);
        this.setName(name);
        this.setCredit(limit);
    }

    /**
     * input a number for amount deposited
     */
    public void deposite(){
        System.out.println("请输入存款金额（100的倍数）:");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        while(num%100!=0){
            System.out.println("请按规定输入100的倍数：");
            num=in.nextInt();
        }
        float i=this.credit-this.limit;
        if(i!=0){
            if(i>num){
                this.limit=this.limit+num;
            }
            else
            {
                this.limit=this.credit;
                this.balance=num-i;
            }
        }
        else{
            this.balance=this.balance+limit;
        }
        System.out.println("存款成功！");
    }
    /**
     * input a number for amount withdraw
     */
    public void withdraw(){
        System.out.println("请输入取款金额（100的倍数）：");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        while(num%100!=0){
            System.out.println("请按规定输入100的倍数：");
            num=in.nextInt();
        }
        if(num>this.balance+this.limit){
            System.out.println("您的余额不足！");
        }
        else {
            if (num > this.balance) {
                this.limit = this.limit - (num - this.balance);
                this.balance = 0;
                System.out.println("扣款成功!透支金额：" + String.valueOf(this.credit-this.limit) + "!");
            } else {
                this.balance = this.balance - num;
                System.out.println("扣款成功！");
            }
        }
    }

    /**
     * check the balance
     */
    public void checkBalance(){
        if(this.limit==this.credit) {
            System.out.println("当前余额为" + String.valueOf(this.balance) + "！可透支金额为：" + String.valueOf(this.limit) + "!");
        }
        else
        {
            System.out.println("当前余额为" + String.valueOf(this.balance) + "！可透支金额为：" + String.valueOf(this.limit) + "!"+"待还款金额："+String.valueOf(this.credit-this.limit)+"!");
        }
    }


    public void exitSrv(){
        System.out.println("感谢使用！");
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
