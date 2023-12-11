package com.tscinc.nextpospdfservices;

import com.tscinc.nextpospdfservices.helpers.InvoiceManager;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pdf-services")
public class PdfServicesController {
    InvoiceManager invoiceManager=new InvoiceManager();


    @GetMapping(value = "/generate/{pdf}",produces = "application/json")
    public ResponseEntity<String> GeneratePdf(@RequestParam(name = "pdf") String pdf){
        String result="";
         invoiceManager.createPDF(pdf);
         result=pdf;
        return new ResponseEntity<>(result, HttpStatusCode.valueOf(200));
    }
}
