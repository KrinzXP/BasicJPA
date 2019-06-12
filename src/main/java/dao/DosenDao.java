package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import entity.*;


public interface DosenDao extends JpaRepository<Dosen, DosenPK>{
	@Query("select a from Dosen as a")
	public List<Dosen> findAllDosen();
	
	//Using SQL Server query style
	@Query(value = "select * from Dosen a", nativeQuery = true)
	public List<Dosen> findAllDosenNative();
}
