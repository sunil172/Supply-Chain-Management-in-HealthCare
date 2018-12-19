/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HospitalEnterprise.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.HospitalEnterprise.Organization.ProcurementOrganization;
import Business.Inventory.HospitalInventory;
import Business.Inventory.ManufactureInventory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.Hospital.ProcurementRole.ProcurementWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sutha
 */
public class ProcurementRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HospitalInventory catDir,ManufactureInventory manuDir) {
        return new ProcurementWorkAreaJPanel(userProcessContainer, account, (ProcurementOrganization) organization,enterprise,business,catDir);
    }
}
