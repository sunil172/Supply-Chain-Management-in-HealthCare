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
public class HospitalInventory {
    
    private static HospitalInventory catalogInstance;
    private List<Catalog> catalogDir;
    
    public static HospitalInventory getInstance(){
        if(catalogInstance==null){
            catalogInstance=new HospitalInventory();
        }
        return  catalogInstance;
    }

    private HospitalInventory() {
        catalogDir = new ArrayList<>();
    }

    public Catalog addCatalog(String CatalogName) {
        Catalog catalog = new Catalog();
        catalog.setCatalogName(CatalogName);
        catalogDir.add(catalog);
        return catalog;
    }

    public List<Catalog> getCatalogDir() {
        return catalogDir;
    }

    public void setCatalogDir(List<Catalog> catalogDir) {
        this.catalogDir = catalogDir;
    }
    
    

}
