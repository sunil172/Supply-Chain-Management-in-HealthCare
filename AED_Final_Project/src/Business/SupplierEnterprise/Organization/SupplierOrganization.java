/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierEnterprise.Organization;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.SupplierEnterprise.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Krina Thakkar
 */
public class SupplierOrganization extends Organization {
     public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierRole());
        return roles;
    }
}
