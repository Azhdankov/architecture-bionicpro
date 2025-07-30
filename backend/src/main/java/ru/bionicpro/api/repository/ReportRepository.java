package ru.bionicpro.api.repository;

import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class ReportRepository {
    
    public String getReportGuid() {
        return UUID.randomUUID().toString();
    }
} 