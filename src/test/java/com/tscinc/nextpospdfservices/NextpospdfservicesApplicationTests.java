package com.tscinc.nextpospdfservices;

import com.tscinc.nextpospdfservices.helpers.InvoiceManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.io.File;

@SpringBootTest
class NextpospdfservicesApplicationTests {

	private InvoiceManager invoiceManager=new InvoiceManager();
	@Test
	void contextLoads() {
	}

	@Test
	void can_generate_pdf(){

		Exception exception =new Exception();
		String pdf="C:\\temp\\invoice1.pdf";
		File mypdffile=new File(pdf);
		if(mypdffile.exists()){
			mypdffile.delete();
		}
		try
		{
			invoiceManager.createPDF(pdf);
		}
		catch (Exception ex){
			ex.printStackTrace();
			ex=exception;
		}

		Assert.isNull(exception,"Can   create PDF file");
	}
}
