
public class Ch13_pj_01_HTMLConverterApp {

	public static void main(String[] args) {
		System.out.println( "HTML Converter");
		System.out.println();
		
		System.out.println("INPUT");
		String html = "<h1>Grocery list </h1>\n" +
						"<ul>\n" +
						"    <li>Eggs</li>\n" +
						"    <li>Milk</li>\n" +
						"    <li>Butter</li>\n" +
						"</ul>";
		System.out.println(html);	
		System.out.println();
		
		String text = "";
		
		String [] lines = html.split("\n");
		
		for (String line: lines) {
			text += line.trim() + "\n" ; //trim page 427
		}
		text = text.replace("<h1>", "") //replace Page 427
					.replace ("</h1>", "")
					.replace ("<ul>", "")
					.replace ("</ul>", "")
					.replace ("<li>", "* ")
					.replace ("</li>", "")
					.replace ("\n\n", "\n");
					
		System.out.println("OUTPUT");
		System.out.println(text);

	}

}
