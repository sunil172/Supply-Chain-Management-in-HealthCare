/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HospitalEnterprise.Organization;

import Business.Organization.Organization;
import Business.HospitalEnterprise.Role.ProcurementRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sutha
 */
public class ProcurementOrganization extends Organization {
    public ProcurementOrganization() {
        super(Organization.Type.Procurement.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProcurementRole());
        return roles;
    }
     
}
