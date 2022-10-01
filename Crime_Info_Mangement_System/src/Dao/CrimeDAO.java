package Dao;

import java.util.List;

import Bean.Crime;
import Dto.CriminalCrimeDTO;
import Exception.CrimeException;

public interface CrimeDAO {
	public List<Crime> getAllCrimes() throws CrimeException;
	
	public List<CriminalCrimeDTO> getCrimesOfACriminal(int criminalId) throws CrimeException;
}
