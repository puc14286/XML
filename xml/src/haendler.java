import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

public class haendler {
	private ArrayList<getraenke> lager;
	private String name;
	private String standort;
	
	public ArrayList<getraenke> getLager() {
		return lager;
	}
	public void setLager(ArrayList<getraenke> lager) {
		this.lager = lager;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandort() {
		return standort;
	}
	public void setStandort(String standort) {
		this.standort = standort;
	}
}
