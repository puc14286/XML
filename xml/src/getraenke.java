import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

public class getraenke {
	private String name;
	private String alk;
	private String groesse;
	private String flasche;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlk() {
		return alk;
	}
	public void setAlk(String alk) {
		this.alk = alk;
	}
	
	
	public String getGroesse() {
		return groesse;
	}
	public void setGroesse(String groesse) {
		this.groesse = groesse;
	}
	public String getFlasche() {
		return flasche;
	}
	public void setFlasche(String flasche) {
		this.flasche = flasche;
	}
	
	
}
