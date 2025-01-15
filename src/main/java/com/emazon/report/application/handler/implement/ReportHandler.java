package com.emazon.report.application.handler.implement;

import com.emazon.report.application.handler.IReportHandler;
import com.emazon.report.domain.api.IReportServicePort;
import com.emazon.report.domain.model.Report;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ReportHandler implements IReportHandler {
    private final IReportServicePort reportServicePort;

    @Override
    public void save(Report report) {
        this.reportServicePort.save(report);
    }
}
