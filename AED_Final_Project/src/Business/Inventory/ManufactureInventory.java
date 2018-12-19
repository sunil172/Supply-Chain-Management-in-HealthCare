/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;
import java.util.List;

public class ManufactureInventory {

    private static ManufactureInventory manufactureInstance;
    private List<Catalog> catalogDir;

    public static ManufactureInventory getInstance() {
        if (manufactureInstance == null) {
            manufactureInstance = new ManufactureInventory();
        }
        return manufactureInstance;
    }

    private ManufactureInventory() {
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
