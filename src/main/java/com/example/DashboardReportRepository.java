package com.example;

import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface DashboardReportRepository extends CrudRepository <DashboardReport, Long> {

}
