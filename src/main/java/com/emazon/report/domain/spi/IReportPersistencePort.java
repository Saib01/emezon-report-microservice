package com.emazon.report.domain.spi;

import com.emazon.report.domain.model.Report;

public interface IReportPersistencePort {
    void save(Report report);
}
