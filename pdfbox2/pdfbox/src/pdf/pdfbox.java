package pdf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.PDFont;


public class pdfbox{
     public static void main(String args[]) throws IOException {
        

    PDDocument pd;
    BufferedWriter wr;
    PDDocument doc = null;
    PDPage page = null;

       try{
           doc = new PDDocument();
           page = new PDPage();

           doc.addPage(page);
           PDFont font = PDType1Font.HELVETICA_BOLD;

           PDPageContentStream content = new PDPageContentStream(doc, page);
           content.beginText();
           content.setFont( font, 12 );
           content.newLineAtOffset( 100, 700 );
           content.drawString("This is the text we're writing to our text file!");
           
////           content.newLine();
////           content.setFont( font, 12 );
//           content.newLineAtOffset( 100, 700 );
//           content.drawString("545");

           content.endText();
           content.close();
          doc.save("myFirstPDF.pdf");
          doc.close();
    } catch (Exception e){
        System.out.println(e);
    }                           
                                    //this is the extracting part
        // The input PDF file from where you want to extract text
        File input = new File("E:\\Obj. Oriented Prog. 2016\\pdfbox2\\pdfbox\\MyFirstPDF.pdf");                 // The PDF file from where you would like to extract
        // The text file where you will store the extracted data
        File output = new File("E:\\Obj. Oriented Prog. 2016\\pdfbox2\\pdfbox\\output.doc");
        pd = PDDocument.load(input); // Loads the input pdf file
        PDFTextStripper stripper = new PDFTextStripper();
        wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
        stripper.writeText(pd, wr); // Extract and save the text
        pd.close();
        wr.close();
 
    
}
}
// --------- Trial and Error below this line.  Beware all ye who enter here! -----------------------------

//import org.apache.pdfbox.pdmodel.*;                   //THIS WORKS blank pdf
//
//public class pdfbox {
//    public static void main(String[] args) {
//        PDDocument doc = new PDDocument();
//        doc.addPage(new PDPage());
//        try{
//            doc.save("Empty PDF.pdf");
//            doc.close();
//        } catch (Exception io){
//            System.out.println(io);
//        }
//    }
//}

//public class pdfbox {                           //THIS WORKS add text pdf
//    public static void main(String[] args) {
//        PDDocument doc = null;
//        PDPage page = null;
//
//       try{
//           doc = new PDDocument();
//           page = new PDPage();
//
//           doc.addPage(page);
//           PDFont font = PDType1Font.HELVETICA_BOLD;
//
//           PDPageContentStream content = new PDPageContentStream(doc, page);
//           content.beginText();
//           content.setFont( font, 12 );
//           content.newLineAtOffset( 100, 700 );
//           content.drawString("This is the text it's writing to the pdf.");
//           
//////           content.newLine();
//////           content.setFont( font, 12 );
////           content.newLineAtOffset( 100, 700 );
////           content.drawString("545");
//
//           content.endText();
//           content.close();
//          doc.save("myFirstPDF.pdf");
//          doc.close();
//    } catch (Exception e){
//        System.out.println(e);
//    }
//}
//}
//import java.io.*;                             THIS ONE DOESN'T WORK YET broken extract
//import org.apache.pdfbox.pdmodel.*;
//import org.apache.pdfbox.util.PDFTextStripper;
//
//public class pdfbox {
//
// public static void main(String[] args){
// PDDocument pd;
// BufferedWriter wr;
// try {      
//         File input = new File("C:\\FromHere.pdf");                                   // The PDF file from where you would like to extract
//         File output = new File("C:\\ToHere.txt");                               // The text file where you are going to store the extracted data
//         pd = PDDocument.load(input);
//         System.out.println(pd.getNumberOfPages());
//         System.out.println(pd.isEncrypted());
//         pd.save("CopyOfInvoice.pdf"); // Creates a copy called "CopyOfInvoice.pdf"
//         PDFTextStripper stripper = new PDFTextStripper();
//         stripper.setStartPage(1); //Start extracting from page 3
//         stripper.setEndPage(1); //Extract till page 5
//         wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
//         stripper.writeText(pd, wr);
//         if (pd != null) {
//             pd.close();
//         }
//        // I use close() to flush the stream.
//        wr.close();
// } catch (Exception e){
//         e.printStackTrace();
//        } 
//     }
//}

