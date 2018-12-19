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
public class Catalog {

    
    private String CatalogName;
    private List<Category> categoryDir;
    
   
    
    public Catalog(){
        this.categoryDir = new ArrayList<>();
    }

    public List<Category> getCategoryDir() {
        return categoryDir;
    }

    public void setCategoryDir(List<Category> categoryDir) {
        this.categoryDir = categoryDir;
    }
    
    
    public String getCatalogName() {
        return CatalogName;
    }

    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }
    
    public Category addCategory(String categoryName){
        Category category = new Category();
        category.setCategoryName(categoryName);
        categoryDir.add(category);
        return category;
    }
    
    @Override
    public String toString(){
        return CatalogName;
    }
    
}
