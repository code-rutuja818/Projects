package org.petrolpump.admin.service;

import java.util.List;
import java.util.*;
import org.petrolpumpadmin.model.MachineModel;

public interface MachineService {
	
    public boolean isAddNewMachine(MachineModel model);
    public  List<MachineModel> getAllMachines();
    public boolean isDeleteMachineById(int mid);
    
}
