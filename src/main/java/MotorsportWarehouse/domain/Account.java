package MotorsportWarehouse.domain;

import javax.persistence.*;
import java.io.Serializable;
//import java.util.List;


/**
 * Created by Byron on 2015/05/11.
 */
@Embeddable
public class Account implements Serializable {
    @Id
    private int accNum;
    private String status;
    private double balance;

    private Account ()
    {
    }

    public Account(Builder builder)
    {
        accNum = builder.accNum;
        status = builder.status;
        balance = builder.balance;
    }

    public int getAccNum()
    {
        return accNum;
    }

    public String getStatus()
    {
        return status;
    }

    public double getBalance()
    {
        return balance;
    }

    public static class Builder
    {
        private int accNum;
        private String status;
        private double balance;
    }

    public Builder accNum (int acc)
    {
        this.accNum = acc;
        return this;

    }

    public Builder status (String stat)
    {
        this.status = stat;
        return this;

    }

    public Builder balance (double bal)
    {
        this.balance = bal;
        return this;
    }

    public Account build()
    {
        return new Account(this);
    }

}
