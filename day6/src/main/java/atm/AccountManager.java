package atm;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class AccountManager {
    public static Account[] accounts = new Account[100];
    //public static final List<Account> accounts = new ArrayList<>();
    //public static final ArrayList<Account> accounts2 = new ArrayList<>();
   // public static final LinkedList<Account> linkedList= new LinkedList<>();
    //public static final List<Account> linkedList1 = new LinkedList<>();
    //public static final Set<Account> accountSet = new HashSet<>();
    public static final Map<String,Account> accountMap = new HashMap<>();
    //public static int currentAccountIndex = 0;
    public static Account currrentAccount = null;


    public static Account openAccount(String username, String password, String checkPassword) {


        if (!password.equals(checkPassword)) {
            System.out.println("两次输入的密码不一致");
            return null;
        }
        if (username == null || username.length() == 0){
            System.out.println("用户名不能为空");
            return null;
        }
        Account account = new Account();
        account.username = username;
        account.password = password;
        account.accountId = getRandomAccountId();
        accountMap.put(account.accountId,account);

        //accounts [ currentAccountIndex ] = account;
        //currentAccountIndex ++;
        return account;

    }

    private static void reSize() {
        Account[] newAccounts = new Account[accounts.length * 2];
        for (int i = 0; i < accounts.length; i++) {
            newAccounts[i] = accounts[i];
        }

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
        //accounts.contains(accountId);

        //for (int i = 0; i < currentAccountIndex; i++) {
          //  Account account = accounts[i];
            //if (account == null) {
              //  continue;
        //  }
 //           if (account.accountId.equals(accountId) && account.password.equals(password)) {
 //               currrentAccount = account;
 //               return true;
 //           }


    //}
        Account account = accountMap.get(accountId);
        if (account == null){
            System.out.println("账号不存在");
            return false;
        }
        if (!account.password.equals(password)){
            System.out.println("密码错误");
            return false;
        }
        return true;
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

    public static boolean transfer(String toAccountId, String toUsername, double amount) {
        if (currrentAccount == null) {
            System.out.println("请先登录");
            Main.printMainMenu();
            return false;
        }
        Account toAccount = getAccountByIdAndUsername(toAccountId, toUsername);
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
        Account account = accountMap.get(accountId);
        if (account == null){
            return null;
        }
        if (!account.username.equals(username)){
            return null;
        }
        return account;
    }

//        for (int i = 0; i < currentAccountIndex; i++) {
//            Account account = accounts[i];
//            if (account == null) {
 //               continue;
 //           }
 //           if (account.accountId.equals(accountId) && account.username.equals(username)) {
 //               return account;
 //           }
 //       }
  //      return null;
 //   }




        //* public static void checkTransferOrder(){
       // TransferOrder[] to=currrentAccount.getTransferOrders();
        //for (int i=0;i < currentAccount.getTransferOrderIndex();i++);
        //System.out.println("以上为转账记录");
    //}

    public static void logout() {
        currrentAccount = null;
    }
}


   // public void test(){

        //声明
        //List<Integer> = new ArrayList<>();
        //Integer[] arr = new Integer[10];
        //取值
        //arr[index]
        //list.get(index)

        //赋值
//
//
//        for(int i = 0 ;i < list.size;i++){
//        if (list.get(1) == value){
//            System.out.println("包含");
//        }
//
//
//
//
//
//    arr[index] = value
        //list.add(value)；存到末尾
        //list.add(index，value)存到指定位置

        //判断是否包含


        //*       LinkedList<Long> = new ArrayList<>();

        //     Set<String> set = new HashSet<>();
        //   Set<String> set1 = new TreeSet<>();
        // Map<String,String> map = new HashMap<>();



