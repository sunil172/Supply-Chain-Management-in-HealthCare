/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sutha
 */
public class Category {
    
    private String CategoryName;
    private List<Item> itemDir;
    
    public Category(){
        itemDir = new ArrayList<>();
    }
    
    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }
    
    public Item addItem(String ItemName, int Quantity){
        Item item = new Item();
        item.setName(ItemName);
        item.setQuantity(Quantity);
        itemDir.add(item);
        return item;
    }

    public List<Item> getItemDir() {
        return itemDir;
    }

    public void setItemDir(List<Item> itemDir) {
        this.itemDir = itemDir;
    }
    
    @Override
    public String toString(){
        return CategoryName;
    }
    
}
