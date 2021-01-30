import com.sun.org.apache.xpath.internal.objects.XString;

public class bank {
    private String name;
    private double balance;
    public bank(String name,double balance)
    {
        this.name = name;
        this.balance = balance;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public String getName()
    {
        return this.name;
    }

    public static void main(String[] args) {
        bank account = new bank("有钱人",25);
        System.out.println("开户人："+account.getName());
        System.out.println("余额："+account.getBalance());
    }
}
