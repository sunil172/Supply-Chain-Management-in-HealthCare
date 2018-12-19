/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HospitalEnterprise.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.HospitalEnterprise.Organization.DoctorOrganization;
import Business.Inventory.HospitalInventory;
import Business.Inventory.ManufactureInventory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.Hospital.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sutha
 */
public class DoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HospitalInventory catDir,ManufactureInventory manuDir) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization) organization, enterprise,catDir);
    }

}
