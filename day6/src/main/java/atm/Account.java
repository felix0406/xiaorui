package atm;
import java.util.Random;
public class Account {
    public String accountId;
    public String username;
    public String password;
    public double balance = 0;
    public Date creatTime = new Date();
    private CashOrder[] cashOrders = new CashOrder[1000];
    private int cashOrderIndex = 0;
    private TransferOrder[] transferOrders = new TransferOrder[1000];
    private int transferOrderIndex = 0;
    public void addCashOrder(CashOrder cashOrder){
        cashOrders[cashOrderIndex] = cashOrder;
        cashOrderIndex++;
    }
    public CashOrder[] getCashOrders() {
        return cashOrders;
    }
}
