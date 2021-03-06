/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.mc.server.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lenovo™
 */
@Entity
public class TempOrderDetails implements Serializable{
    private int order_QTY;
    private String itemName;
    private double price;
    private String chefName;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="OID", referencedColumnName = "OID", insertable = false, updatable = false)
    private Orders orders;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="code", referencedColumnName = "code", insertable = false, updatable = false)
    private Item item;
    
    
    @EmbeddedId
    private OrderDetails_PK orderDetails_PK;

    public TempOrderDetails() {
    }

    public TempOrderDetails(int order_QTY, String itemName, double price, String chefName) {
        this.order_QTY = order_QTY;
        this.itemName = itemName;
        this.price = price;
        this.chefName = chefName;
    }

    public TempOrderDetails(int order_QTY, String itemName, double price, String chefName, Orders orders, Item item) {
        this.order_QTY = order_QTY;
        this.itemName = itemName;
        this.price = price;
        this.chefName = chefName;
        this.orders = orders;
        this.item = item;
    }

    
    /**
     * @return the order_QTY
     */
    public int getOrder_QTY() {
        return order_QTY;
    }

    /**
     * @param order_QTY the order_QTY to set
     */
    public void setOrder_QTY(int order_QTY) {
        this.order_QTY = order_QTY;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the chefName
     */
    public String getChefName() {
        return chefName;
    }

    /**
     * @param chefName the chefName to set
     */
    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    /**
     * @return the orders
     */
    public Orders getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    

    /**
     * @return the orderDetails_PK
     */
    public OrderDetails_PK getOrderDetails_PK() {
        return orderDetails_PK;
    }

    /**
     * @param orderDetails_PK the orderDetails_PK to set
     */
    public void setOrderDetails_PK(OrderDetails_PK orderDetails_PK) {
        this.orderDetails_PK = orderDetails_PK;
    }

    @Override
    public String toString() {
        return "TempOrderDetails{" + "order_QTY=" + order_QTY + ", itemName=" + itemName + ", price=" + price + ", chefName=" + chefName + '}';
    }
    
    

    
}
