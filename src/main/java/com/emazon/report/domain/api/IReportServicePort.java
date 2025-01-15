package com.emazon.report.domain.api;

import com.emazon.report.domain.model.Report;

public interface IReportServicePort {
    void save(Report report);
}
