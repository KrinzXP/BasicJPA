package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="Dosen")
@IdClass(DosenPK.class)
public class Dosen {
	@Id
	@Column(name="NID")
	private String nid;
	
	@Column(name="NAMA")
	private String nama;
	
	@Column(name="ALAMAT")
	private String alamat;
	
	@Column(name="JENIS_KELAMIN")
	private Character jenisKelamin;
	
	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
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


}
