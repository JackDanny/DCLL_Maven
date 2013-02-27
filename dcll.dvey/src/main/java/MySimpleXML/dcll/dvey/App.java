package MySimpleXML.dcll.dvey;

import java.io.IOException;

import nu.xom.*;
import nu.*;
import org.w3c.dom.Element;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ValidityException, ParsingException, IOException {
    	
    	//root.getAttribute("root");
    	//System.out.println("aha");
    	Builder builder = new Builder();
    	Document doc=builder.build("pom.xml");
    	System.out.println(doc.toXML());
    	System.out.println("wahou");
    	System.out.println("wihou");
    	
    	
    
    	
    	
    	
    	
    }
}
