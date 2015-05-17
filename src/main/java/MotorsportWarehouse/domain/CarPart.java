package MotorsportWarehouse.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Byron on 2015/05/11.
 */

@Entity
public class CarPart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String partNum;
    private String status;
    private double price;

    private CarPart(){

    }

    public CarPart(Builder builder){
        this.partNum = builder.partNum;
        this.status = builder.status;
        this.price = builder.price;
    }

    public static class Builder{
        private String partNum;
        private String status;
        private double price;
    }

    public Builder partNum (String value){
        this.partNum = value;
        return this;
    }

    public Builder status (String value){
        this.status = value;
        return this;
    }

    public Builder price (double value){
        this.price = value;
        return this;
    }

    public CarPart build(){
        return new CarPart(this);
    }

}
