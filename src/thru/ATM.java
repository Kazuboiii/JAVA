package thru;

public class ATM {
    public static void main(String[]args){
        Account account= new Account("Kazuha",5000);
        account.displayAccountNameAndAmount();
        double finalAmount=account.depositAmountToAccount(1000);
        System.out.println("Your Total balance after deposit:"+finalAmount);
        double finalAmount1=account.withdrawAmountFromAccount(4000);
        System.out.println("Your Total balance after withdrawal:"+finalAmount1);
    }
}
