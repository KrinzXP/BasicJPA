package entity;
import java.io.*;
public class DosenPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nid;
	public String getNim() {
		return nid;
	}
	public void setNim(String nid) {
		this.nid = nid;
	}
}
