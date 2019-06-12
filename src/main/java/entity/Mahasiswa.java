package entity;

import javax.persistence.*;

@Entity
@Table(name="Mahasiswa")
@IdClass(MahasiswaPK.class)
public class Mahasiswa {
	
	

	@Id
	@Column(name="NIM")
	private String nim;
	
	@Column(name="NAMA")
	private String nama;
	
	@Column(name="ALAMAT")
	private String alamat;
	
	@Column(name="JENIS_KELAMIN")
	private Character jenisKelamin;
	
	@Column(name="MATA_KULIAH")
	private String idMatkul;

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Character getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(Character jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
	public String getIdMatkul() {
		return idMatkul;
	}

	public void setIdMatkul(String idMatkul) {
		this.idMatkul = idMatkul;
	}
}
