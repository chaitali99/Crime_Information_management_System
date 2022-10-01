package Dao;

import java.util.List;

import Bean.Address;
import Dto.AddressDTO;
import Exception.AddressException;

public interface AddressDAO {
	public List<Address> getAddress() throws AddressException;

	public List<AddressDTO> getAddress(int id) throws AddressException;

}
