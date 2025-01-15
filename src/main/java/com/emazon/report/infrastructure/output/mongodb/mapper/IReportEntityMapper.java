package com.emazon.report.infrastructure.output.mongodb.mapper;

import com.emazon.report.domain.model.Report;
import com.emazon.report.infrastructure.output.mongodb.entity.ReportEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IReportEntityMapper {


    Report reportEntityToReport(ReportEntity reportEntity);

    ReportEntity reportToReportEntity(Report report);
}
