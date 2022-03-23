package br.edu.ifpb.companyreportstool.service;

import java.util.Objects;
import java.util.stream.Collectors;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;

public class ExpenseReportHtml extends ExpenseReport {

    public ExpenseReportHtml(ExpenseRepository expenseRepository) {
        super(expenseRepository);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String writeHeader() {
        // TODO Auto-generated method stub
        return getExporter().exportHeader("Company Report");
    }

    @Override
    public String writeBody() {
        // TODO Auto-generated method stub
        return getExporter().exportBody("This is the Expense Report",fillBodyHtml());
    }

    @Override
    public String writeFooter() {
        // TODO Auto-generated method stub
        return getExporter().exportFooter("2022- Design Patterns IFPB");
    }

    public HtmlExporter getExporter() {
        HtmlExporter htmlExporter = new HtmlExporter();
        return htmlExporter;
    }

    public String fillBodyHtml() {
        return "<ul><li>"+expenseRepository.findAll().stream()
                .map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";
    }
    
}
