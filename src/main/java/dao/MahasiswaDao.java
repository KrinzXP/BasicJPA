package dao;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import entity.Mahasiswa;
import entity.MahasiswaPK;
import java.util.*;

public interface MahasiswaDao extends JpaRepository<Mahasiswa, MahasiswaPK>{
	
	@Query("select a from Mahasiswa as a")
	public List<Mahasiswa> findAllMahasiswa();
	
	//Using SQL Server query style
	@Query(value = "select * from Mahasiswa a", nativeQuery = true)
	public List<Mahasiswa> findAllMahasiswaNative();
	
	@Query("select a,b.namaMatkul from Mahasiswa a, MataKuliah b"
			+ " where a.idMatkul = b.idMatkul")
	public List<Object[]> findAllMahasiswaWithMatKul();
}
