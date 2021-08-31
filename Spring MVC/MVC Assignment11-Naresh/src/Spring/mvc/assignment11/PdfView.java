package Spring.mvc.assignment11;



import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;
import java.awt.Color;
import java.awt.color.ICC_Profile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
   import java.util.ArrayList;
   import java.util.Arrays;
   import java.util.LinkedHashMap;
   import java.util.HashMap;
   import java.util.HashSet;
   import java.util.Iterator;
   import java.util.Map;
  import java.util.TreeMap;
   import java.util.TreeSet;
   import java.security.cert.Certificate;
   
  
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		response.setHeader("Content-Dispositoin", "attachment; filename=\"employees.pdf\"");
		
		@SuppressWarnings("unchecked")
		List<Employee> list=(List<Employee>) model.get("employeeList");
		
		Table table= new Table(3);
		table.addCell("ID");
		table.addCell("NAME");
		table.addCell("SALARY");
		
		for(Employee emp: list) {
			table.addCell(String.valueOf(emp.getId()));
			table.addCell(emp.getName());
			table.addCell(String.valueOf(emp.getSalary()));
		}
		document.add(table);
	}
	
}
