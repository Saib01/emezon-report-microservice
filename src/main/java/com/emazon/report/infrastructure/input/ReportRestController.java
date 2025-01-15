package com.emazon.report.infrastructure.input;

import com.emazon.report.application.handler.IReportHandler;
import com.emazon.report.domain.model.Report;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/report")
@RequiredArgsConstructor
public class ReportRestController {
    private final IReportHandler reportHandler;

    @PostMapping
    public ResponseEntity<Void> saveReport(@RequestBody Report report) {
        reportHandler.save(report);
        return ResponseEntity.ok().build();
    }
}
