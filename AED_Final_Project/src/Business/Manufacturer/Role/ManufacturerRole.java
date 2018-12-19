/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ManufacturerEnterprise.Organization.ManufacturerOrganization;
import Business.Inventory.HospitalInventory;
import Business.Inventory.ManufactureInventory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ManufacturerRole.ManufacturerWorkAreaJPanel;

/**
 *
 * @author parkh
 */
public class ManufacturerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HospitalInventory catDir,ManufactureInventory manuDir) {
        return new ManufacturerWorkAreaJPanel(userProcessContainer, account, (ManufacturerOrganization) organization, enterprise,manuDir);
    }
}
