package com.example.student.ebook;

public class ebookData {

    String name , pdfUrl;



    public ebookData(String name, String pdfUrl) {
        this.name = name;
        this.pdfUrl = pdfUrl;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public ebookData() {

    }
}


