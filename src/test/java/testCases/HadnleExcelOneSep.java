/* MavenProject create Step: create Maven project- next -select org.apache.maven  in quick
  start in 1.4- finish- then type capital Y in console enter thats it. then pom xm file 
  add dependecy like selenium, testng, apache poi api based on opc and common...
  *** remember to add anotation beforre run.
 
 */

package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class HadnleExcelOneSep {
	
	@Test
	public void loginFunction() throws IOException
	{
       FileInputStream fs=new FileInputStream("F:\\Testing class\\Sept\\excel\\1sept handleExcel.xlsx");
	
	   XSSFWorkbook work=new XSSFWorkbook(fs);
	   
	   XSSFSheet sheet=work.getSheetAt(0);
	   
	   XSSFRow row=sheet.getRow(0);
	   
	   XSSFCell cell=row.getCell(0);
	   
	   System.out.println(sheet.getRow(0).getCell(0));
	   
	   System.out.println(sheet.getRow(0).getCell(1));
	   
	   System.out.println(sheet.getRow(1).getCell(0));
	   
	   System.out.println(sheet.getRow(1).getCell(1));
	   
	   
	}

}
