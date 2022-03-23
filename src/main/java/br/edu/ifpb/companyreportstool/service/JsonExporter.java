package br.edu.ifpb.companyreportstool.service;



public class JsonExporter extends ReportExporter{

    @Override
    public String exportHeader(String title) {
        // TODO Auto-generated method stub
        return "{header: \""+title+"\",";
    }

    @Override
    public String exportBody(String subtitle, String dados) {
        // TODO Auto-generated method stub
        return "main: { title:\""+subtitle+"\", content: \""+dados+"\",}";
    }

    @Override
    public String exportFooter(String desc) {
        // TODO Auto-generated method stub
        return "footer: \""+desc+"\"}";
    }
    
}
