package org.petrolpump.admin.service;
import java.util.List;
import org.petrolpump.admin.service.MachineService;
import org.petrolpump.admin.repository.MachineRepository;
import org.petrolpump.admin.repository.MachineRepositoryImpl;
import org.petrolpumpadmin.model.MachineModel;

public class MachineServiceImpl implements MachineService{
	MachineRepository m = new MachineRepositoryImpl();
	@Override
	public boolean isAddNewMachine(MachineModel model) {
		
		return m.isAddNewMachine(model);
	}
	@Override
	public List<MachineModel> getAllMachines() {
		// TODO Auto-generated method stub
		return m.getAllMachines();
	}
	@Override
	public boolean isDeleteMachineById(int mid) {
		// TODO Auto-generated method stub
		return m.isDeleteMachineById(mid);
		
		
	}
}
