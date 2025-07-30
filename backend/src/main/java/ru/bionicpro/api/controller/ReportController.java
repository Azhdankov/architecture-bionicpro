package ru.bionicpro.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bionicpro.api.service.ReportService;
import ru.bionicpro.api.security.RequireRole;

@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/reports")
    @RequireRole("prothetic_user")
    public ResponseEntity<String> getReports() {
        String report = reportService.getReport();
        return ResponseEntity.ok(report);
    }
} 