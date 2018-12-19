/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


//import Business.Organization.HospitalEnterprise.ProcurementOrganization;
//import Business.Organization.HospitalEnterprise.DoctorOrganization;
import Business.ManufacturerEnterprise.Organization.ManufacturerOrganization;
import Business.HospitalEnterprise.Organization.ProcurementOrganization;
import Business.HospitalEnterprise.Organization.DoctorOrganization;
import Business.Organization.Organization.Type;
import Business.SupplierEnterprise.Organization.SupplierOrganization;
import java.util.ArrayList;

/**
 *
 * @author sutha
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Procurement.getValue())){
            organization = new ProcurementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Manufacturer.getValue())){
            organization = new ManufacturerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
