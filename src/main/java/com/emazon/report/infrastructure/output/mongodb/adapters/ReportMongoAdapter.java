package com.emazon.report.infrastructure.output.mongodb.adapters;

import com.emazon.report.domain.model.Report;
import com.emazon.report.domain.spi.IReportPersistencePort;
import com.emazon.report.infrastructure.output.mongodb.entity.ReportEntity;
import com.emazon.report.infrastructure.output.mongodb.mapper.IReportEntityMapper;
import com.emazon.report.infrastructure.output.mongodb.repository.IReportRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReportMongoAdapter implements IReportPersistencePort {
    private final IReportRepository reportRepository;
    private final IReportEntityMapper reportEntityMapper;

    @Override
    public void save(Report report) {
        ReportEntity reportEntity=this.reportRepository.save(this.reportEntityMapper.reportToReportEntity(report));
    }
}
