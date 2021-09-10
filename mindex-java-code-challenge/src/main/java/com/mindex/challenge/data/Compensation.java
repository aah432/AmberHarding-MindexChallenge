package com.mindex.challenge.data;

import java.time.LocalDateTime;

public class Compensation {
    private  Employee employee;
    private  int salary;
    private  String effectiveDate;

    public Compensation(){ }

    public Employee getEmployee(){return employee;}

    public void setEmployee(Employee _employee){this.employee = _employee;}

    public int getSalary(){return salary;}

    public void setSalary(int _salary){this.salary = _salary;}

    public String getEffectiveDate(){return effectiveDate;}

    public void setEffectiveDate(String _effectiveDate){this.effectiveDate = _effectiveDate;}


}