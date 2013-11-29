
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Markt {

	private static final String HANDEL_XML = "./handel.xml";

	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub
		ArrayList<getraenke> lager = new ArrayList<getraenke>();
		
		haendler h = new haendler();
		h.setName("Soso GmbH");
		h.setStandort("Wien");
		
		getraenke g1 = new getraenke();
		g1.setAlk("Ja");
		g1.setFlasche("Nein");
		g1.setGroesse("1 Liter");
		lager.add(g1);
		
		getraenke g2 = new getraenke();
		g1.setAlk("Nope");
		g1.setFlasche("Joa");
		g1.setGroesse("50 Liter");
		lager.add(g2);
		
		h.setLager(lager);
		
		JAXBContext context = JAXBContext.newInstance(haendler.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    
	    m.marshal(h, System.out);
	    m.marshal(h, new File(HANDEL_XML));
	    
	    System.out.println();
	    System.out.println("Output from our XML File: ");
	    Unmarshaller um = context.createUnmarshaller();
	    haendler h2 = (haendler) um.unmarshal(new FileReader(HANDEL_XML));
	    ArrayList<getraenke> list = h2.getLager();
	    for (getraenke getrank : list) {
	      System.out.println("Getraenk: " + getrank.getName() + ", mit Alkohol:" + getrank.getAlk());
	    }
	}
}
