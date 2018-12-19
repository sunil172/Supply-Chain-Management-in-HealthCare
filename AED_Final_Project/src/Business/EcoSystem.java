/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Inventory.HospitalInventory;
import Business.Inventory.ManufactureInventory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author sutha
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ManufactureInventory manuDir;
    private HospitalInventory catDir;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        catDir = HospitalInventory.getInstance();
        manuDir = ManufactureInventory.getInstance();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {

        }
        return true;
    }

    public HospitalInventory getCatDir() {
        return catDir;
    }

    public void setCatDir(HospitalInventory catDir) {
        this.catDir = catDir;
    }

    public ManufactureInventory getManuDir() {
        return manuDir;
    }

    public void setManuDir(ManufactureInventory manuDir) {
        this.manuDir = manuDir;
    }

    public boolean checkIfNetworkIsUnique(String name) {
        for (Network n : networkList) {
            if (n.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

}
