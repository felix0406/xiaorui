package atm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void depositTest() {
        Account account = AccountManager.openAccount("张三","123456","123456");
        assertNotNull(account);
        assertNotNull(account.accountId);
        AccountManager.loginAccount("张三","123456");
        AccountManager.deposit(100);
        assertEquals(100,account.balance);
    }

    @Test
    void openAccount() {
        Account account = AccountManager.openAccount("张三","123456","123456");
        assertNotNull(account);
        assertNotNull(account.accountId);

        Account account1 = AccountManager.openAccount("张三","1234561","123456");
        assertNotNull(account);
    }
    @Test
    void loginAccountTest() {
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        assertTrue(AccountManager.loginAccount(account.accountId,"123456"));
        assertFalse(AccountManager.loginAccount(account.accountId,"1234561"));
        assertFalse(AccountManager.loginAccount(null,"123456"));
        //account.classAccount
    }
}