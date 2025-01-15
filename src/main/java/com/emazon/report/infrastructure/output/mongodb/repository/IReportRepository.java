package com.emazon.report.infrastructure.output.mongodb.repository;

import com.emazon.report.infrastructure.output.mongodb.entity.ReportEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IReportRepository extends MongoRepository <ReportEntity,String>{
}
