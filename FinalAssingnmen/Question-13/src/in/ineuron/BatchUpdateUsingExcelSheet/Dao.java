package in.ineuron.BatchUpdateUsingExcelSheet;
import java.io.Serializable;

public class Dao implements Serializable {

	private static final long serialVersionUID = 1L;
    private int sid;
    private String sname;
    private String saddress;
   
    
   
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	
	}
    
    

