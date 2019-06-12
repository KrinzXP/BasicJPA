package main;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DosenDao;
import dao.MahasiswaDao;
import dao.MataKuliahDao;
import entity.Dosen;
import entity.Mahasiswa;
import entity.MahasiswaPK;

public class tes {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/META-INF/spring/app-config.xml");	
		
		MahasiswaDao dao = ctx.getBean(MahasiswaDao.class);
		DosenDao dosenDao = ctx.getBean(DosenDao.class);
		MataKuliahDao matkulDao = ctx.getBean(MataKuliahDao.class);
		List<Dosen> listDosen = dosenDao.findAllDosenNative();
		
//		for(Dosen d : listDosen)
//		{
//			System.out.printf("NIM: %s\n"
//					+ "Nama: %s\n"
//					+ "Alamat: %s\n"
//					+ "Jenis Kelamin: %s\n" , 
//					d.getNid(),d.getNama(),d.getAlamat(),d.getJenisKelamin());
//		}
//		
//		Dosen dosen = new Dosen();
//		dosen.setNid("D001");
//		dosen.setNama("Abdul Jamal");
//		dosen.setAlamat("Jl Buntut Sapi");
//		dosen.setJenisKelamin('L');
//		dosenDao.save(dosen);
		
		
		
		
//		List<Mahasiswa> list = dao.findAllMahasiswaNative();
//		for(Mahasiswa m : list)
//		{
//			System.out.printf("NIM: %s\n"
//					+ "Nama: %s\n"
//					+ "Alamat: %s\n"
//					+ "Jenis Kelamin: %s\n" , 
//					m.getNim(),m.getNama(),m.getAlamat(),m.getJenisKelamin());
//		}
		
//		//insert data
//		Mahasiswa mahasiswa = new Mahasiswa();
//		mahasiswa.setNim("A006");
//		mahasiswa.setNama("Emi");
//		mahasiswa.setAlamat("Jl. Lebak Bulus");
//		mahasiswa.setJenisKelamin('P');
//		dao.save(mahasiswa);
		
//		//Update data
//		MahasiswaPK pk = new MahasiswaPK();
//		pk.setNim("A006");
//		Mahasiswa mahasiswa = dao.findOne(pk);
//		mahasiswa.setNama("Emi Kristen");
//		dao.save(mahasiswa);
		
//		//Delete data
//		MahasiswaPK pk = new MahasiswaPK();
//		pk.setNim("A006");
//		dao.delete(pk);
		
		//Test join
		List<Object[]> objects = dao.findAllMahasiswaWithMatKul();
		for(Object[] obj : objects)
		{
			Mahasiswa mahasiswa = (Mahasiswa) obj[0];
			String namaMataKuliah = (String) obj[1];
			System.out.println("Nama: " + mahasiswa.getNama());
			System.out.println("Nama Mata Kuliah: " + namaMataKuliah);
		}
	}

}
