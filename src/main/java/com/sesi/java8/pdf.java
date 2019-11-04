package com.sesi.java8;

import java.util.Arrays;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class pdf {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("sesi", 30), new Person("jack", 20),
				new Person("lawrence", 40));

		String s = persons.stream().map(b -> b.toString()).reduce("", String::concat);

		PDDocument doc = null;
		PDPage page = null;
		try {
			doc = new PDDocument();
			PDFont font = PDType1Font.HELVETICA;
			page = new PDPage();
			doc.addPage(page);
			PDPageContentStream content = new PDPageContentStream(doc, page);
			content.beginText();
			content.setFont(font, 12);
			content.moveTextPositionByAmount(100, 700);
			content.drawString(s);
			content.endText();
			content.close();
			doc.save("helloworld.pdf");
			doc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
