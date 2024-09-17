package org.petrolpump.admin.repository;

import java.util.List;

import org.petrolpumpadmin.model.MachineModel;

public interface MachineRepository {
  public boolean isAddNewMachine(MachineModel model);
  public List<MachineModel> getAllMachines();
  public boolean isDeleteMachineById(int mid);
}
