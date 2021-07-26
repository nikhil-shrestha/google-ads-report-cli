package com.example;

import com.example.domain.DashboardReport;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface DashboardReportRepository extends CrudRepository <DashboardReport, Long> {

}
