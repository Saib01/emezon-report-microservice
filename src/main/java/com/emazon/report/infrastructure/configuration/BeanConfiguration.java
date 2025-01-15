package com.emazon.report.infrastructure.configuration;

import com.emazon.report.domain.api.IReportServicePort;
import com.emazon.report.domain.spi.IReportPersistencePort;
import com.emazon.report.domain.usecase.ReportUseCase;
import com.emazon.report.infrastructure.output.mongodb.adapters.ReportMongoAdapter;
import com.emazon.report.infrastructure.output.mongodb.mapper.IReportEntityMapper;
import com.emazon.report.infrastructure.output.mongodb.repository.IReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@RequiredArgsConstructor
@EnableMongoAuditing
public class BeanConfiguration {
    private final IReportRepository reportRepository;
    private final IReportEntityMapper reportEntityMapper;

    @Bean
    IReportPersistencePort reportPersistencePort(){
        return new ReportMongoAdapter(reportRepository,reportEntityMapper);
    }
    @Bean
    IReportServicePort reportServicePort(){
        return new ReportUseCase(reportPersistencePort());
    }
}
