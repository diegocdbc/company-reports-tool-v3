package br.edu.ifpb.companyreportstool.service;



public class HtmlExporter extends ReportExporter{

    @Override
    public String exportHeader(String title) {
        // TODO Auto-generated method stub
        return "<header><h1>"+title+"</h1></header>";
    }

    @Override
    public String exportBody(String subtitle, String dados) {
        // TODO Auto-generated method stub
        return "<main><h2>"+subtitle+"</h2>"+"<p>"+dados+"<p></main>";
    }

    @Override
    public String exportFooter(String desc) {
        // TODO Auto-generated method stub
        return "<footer>"+desc+"</footer>";
    }
    
}
