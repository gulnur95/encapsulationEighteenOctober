public class Account {

    private int id;
    private String name;
    private double balance;
    private String country;

    public Account(){}

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }


           public void checkBalance(){
               System.out.println("name: " + name + ",  " + balance + " баланс");
           }

           public void deposit(double amount){
                 if(amount > 0){
                     System.out.print("Баштапкы баланс: "+ balance);
                     balance+=amount;
                     System.out.println("   кошулду "+ amount + " сом  " + " толукталган баланс: " + balance);
                 }
           }


          public void withdrawal (double amount){
              System.out.print("Баштапкы баланс: "+ balance + "  ");
             if(amount > 0 && amount <= balance){
                 balance -= amount;
                 System.out.println( amount + " сом алынды,   калган баланс: " + balance + " сом ");
             } else {
                 System.out.println("Туура эмес сумма же жетишсиз баланс. " );
             }
          }


    public void transaction(Account recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.deposit(amount);
            System.out.println(amount + " трансформация болду " + name + " аттуудан " + recipient.name+ " деген жаранга");
        } else {
            System.out.println("Invalid transaction amount.");
        }
    }



    @Override
    public String toString() {
        return "Account " +
                "id: " + id +
                ",    name: " + name +
                ",    balance: " + balance +
                ",    country: " + country ;
    }



}
