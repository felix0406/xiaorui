package exercise6.atm;

import java.util.Date;

public class TransferOrder {
    private String orderId;
    private  String fromAccountId;
    private String toAccountId;
    private double amount;
    private boolean isSuccess;
    private Date time = new Date();
    public  TransferOrder(String fromAccountId,String toAccountId,double amount){
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
    }
    public String getToAccountId() {
        return toAccountId;
    }
    public boolean isSuccess() {
        return isSuccess;
    }
    public void setSuccess(boolean success) {
        isSuccess = success;
    }
    //@override
    public String getOrderId(){

        return orderId;
    }
    public String getFromAccountId(){

        return getFromAccountId();
    }
    public double getAmount(){
        return amount;
    }
    public Date getTime(){

        return time;
    }

    //@override
    public boolean getIsSuccess(){

        return isSuccess;
    }
}
