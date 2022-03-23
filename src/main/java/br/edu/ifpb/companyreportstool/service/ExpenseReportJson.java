package br.edu.ifpb.companyreportstool.service;

import java.util.Objects;
import java.util.stream.Collectors;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;

public class ExpenseReportJson extends ExpenseReport {

    public ExpenseReportJson(ExpenseRepository expenseRepository) {
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
        return getExporter().exportBody("This is the Expense Report",fillBodyJson());
    }

    @Override
    public String writeFooter() {
        // TODO Auto-generated method stub
        return getExporter().exportFooter("2022- Design Patterns IFPB");
    }

    public JsonExporter getExporter() {
        JsonExporter jsonExporter = new JsonExporter();
        return jsonExporter;
    }

    public String fillBodyJson() {
        return expenseRepository.findAll().stream()
                .map(Objects::toString).collect(Collectors.joining(","));
    }
    
}
