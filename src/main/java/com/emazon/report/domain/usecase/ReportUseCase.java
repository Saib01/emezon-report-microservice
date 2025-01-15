package com.emazon.report.domain.usecase;

import com.emazon.report.domain.api.IReportServicePort;
import com.emazon.report.domain.model.Report;
import com.emazon.report.domain.spi.IReportPersistencePort;

public class ReportUseCase implements IReportServicePort {
    private final IReportPersistencePort reportPersistencePort;

    public ReportUseCase(IReportPersistencePort reportPersistencePort) {
        this.reportPersistencePort = reportPersistencePort;
    }

    @Override
    public void save(Report report) {
        this.reportPersistencePort.save(report);
    }
}
