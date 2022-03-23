package br.edu.ifpb.companyreportstool.service;

public abstract class ReportService {
    public String generateReport(){
        return writeHeader()+writeBody()+writeFooter();
    }
    public abstract String writeHeader();
    public abstract String writeBody();
    public abstract String writeFooter();
}
