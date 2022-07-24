package exercise6.atm;
import java.util.Random;
public class AccountManager {
    public static Account[] accounts = new Account[100];
    public static int currentAccountIndex = 0;
    public static Account currrentAccount = null;

    public static Account openAccount(String username, String password, String checkPassword) {
        if (!password.equals(checkPassword)) {
            System.out.println("两次输入的密码不一致");
            return null;
        }
        Account account = new Account();
        account.username = username;
        account.password = password;
        account.accountId = getRandomAccountId();
        accounts [ currentAccountIndex ] = account;
        currentAccountIndex ++;
        return account;

    }

    private static void reSize() {
        Account[] newAccounts = new Account[accounts.length * 2];
        for (int i = 0; i < accounts.length; i++) {
            newAccounts[i] = accounts[i];
        }
        accounts = newAccounts;
    }

    private static String getRandomAccountId() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }

    public static boolean loginAccount(String accountId, String password) {
        for (int i = 0; i < currentAccountIndex; i++) {
            Account account = accounts[i];
            if (account == null) {
                continue;

            }
            if (account.accountId.equals(accountId) && account.password.equals(password)) {
                currrentAccount = account;
                return true;
            }
        }
        return false;
    }

    public static double withdraw(double amount) {
        if (currrentAccount == null) {
            System.out.println("请先登录");
            Main.printMainMenu();
            return -1;
        }
        if (amount <= 0) {
            System.out.println("提取金额必须大于0");
            return -1;
        }
        currrentAccount.balance -= amount;
        CashOrder cashOrder = new CashOrder(currrentAccount.accountId, CashEnum.WITHDRAW, amount, true);
        currrentAccount.addCashOrder(cashOrder);
        System.out.println("提现" + amount + "元" + "，当前余额为：" + currrentAccount.balance);
        return amount;

    }

    //存钱
    public static double deposit(double amount) {
        if (currrentAccount == null) {
            System.out.println("请先登录");
            Main.printMainMenu();
            return -1;
        }
        if (amount <= 0) {
            System.out.println("存入的金额必须大于0");
            return -1;
        }
        currrentAccount.balance += amount;
        return amount;
    }

    public static double getBalance() {
        if (currrentAccount == null) {
            System.out.println("请先登录");
            Main.printMainMenu();
            return -1;
        }
        return 0;
    }

    public static boolean transfer(String toAccountId, String tousername, double amount) {
        if (currrentAccount == null) {
            System.out.println("请先登录");
            Main.printMainMenu();
            return false;
        }
        Account toAccount = getAccountByIdAndUsername(toAccountId, tousername);
        if (toAccount == null) {
            System.out.println("账户不存在");
            return false;
        }
        if (amount <= 0) {
            System.out.println("转账金额必须大于0");
            return false;
        }
        if (amount >= currrentAccount.balance) {
            System.out.println("余额不足");
            return false;
        }
        currrentAccount.balance -= amount;
        toAccount.balance += amount;
        return true;
    }

    private static Account getAccountByIdAndUsername(String accountId, String username) {
        for (int i = 0; i < currentAccountIndex; i++) {
            Account account = accounts[i];
            if (account == null) {
                continue;
            }
            if (account.accountId.equals(accountId) && account.username.equals(username)) {
                return account;
            }
        }
        return null;
    }

    public static void logout() {
        currrentAccount = null;
    }
}

