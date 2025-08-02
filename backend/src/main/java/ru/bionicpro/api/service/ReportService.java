package ru.bionicpro.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bionicpro.api.repository.ReportRepository;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;
    
    public String getReport() {
        return reportRepository.getReportGuid();
    }
} 