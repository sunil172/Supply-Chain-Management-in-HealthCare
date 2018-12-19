/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author sutha
 */
public class ProcurementOrderRequest extends WorkRequest {

    private String catalog;
    private String category;
    private String item;
    private int quantity;
    private String priority;

    @Override
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String getPriority() {
        return this.priority;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String getItem() {
        return this.item;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    @Override
    public String getCatalog() {
        return this.catalog;
    }
}
