package thru;

class Account {
    Account (String name,float amount) {
        this.name = name;
        this.amount = amount;
    }
    String name;
    double amount;

    double depositAmountToAccount(double deposit_amount){
        this.amount=deposit_amount+this.amount;
        return this.amount;
    }
    double withdrawAmountFromAccount(double withdraw_amount){
        this.amount=this.amount-withdraw_amount;
        return this.amount;
    }
    void displayAccountNameAndAmount(){
    System.out.println("Account name: "+this.name);
    System.out.println("Account Amount Rs. "+this.amount);
    }
}
