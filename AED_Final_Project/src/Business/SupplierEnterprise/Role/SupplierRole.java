/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierEnterprise.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Inventory.HospitalInventory;
import Business.Inventory.ManufactureInventory;
import Business.SupplierEnterprise.Organization.SupplierOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Role.Role;
import userinterface.SupplierRole.SupplierWorkAreaJPanel;

/**
 *
 * @author Krina Thakkar
 */
public class SupplierRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HospitalInventory catDir,ManufactureInventory manuDir) {
        return new SupplierWorkAreaJPanel(userProcessContainer, account, (SupplierOrganization) organization, enterprise,business,catDir);
    }
}
