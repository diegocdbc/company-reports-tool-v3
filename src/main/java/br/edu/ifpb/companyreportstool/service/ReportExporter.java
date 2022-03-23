package br.edu.ifpb.companyreportstool.service;



public abstract class ReportExporter {
    public abstract String exportHeader(String title);
    public abstract String exportBody(String subtitle, String dados);
    public abstract String exportFooter(String desc);
    
}
