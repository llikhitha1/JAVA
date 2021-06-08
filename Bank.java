class bank {
    String accno;
    String name;
    long balance;

    Scanner s = new Scanner(System.in);

    void openAccount() {
        System.out.print("Enter Account No: ");
        accno = s.next();
        System.out.print("Enter Name: ");
        name = s.next();
        System.out.print("Enter Balance: ");
        balance = s.nextLong();
    }

    void showAccount() {
        System.out.println("Account No: "+accno + "," +" Name: "+ name + ","+ " Balance: "+ balance);
    }

    public static void main(String[] args) {
        Bank b=new Bank();
        b.openAccount();
        b.showAccount();
    }
}