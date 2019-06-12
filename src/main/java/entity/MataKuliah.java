package entity;

import javax.persistence.*;

@Entity
@Table(name="MataKuliah")
@IdClass(MataKuliahPK.class)
public class MataKuliah {
	@Id
	@Column(name="ID_MATA_KULIAH")
	private String idMatkul;
	
	@Column(name="NAMA")
	private String namaMatkul;
	
	
	public String getIdMatkul() {
		return idMatkul;
	}
	public void setIdMatkul(String idMatkul) {
		this.idMatkul = idMatkul;
	}
	

	public String getNamaMatkul() {
		return namaMatkul;
	}
	public void setNamaMatkul(String namaMatkul) {
		this.namaMatkul = namaMatkul;
	}
}
