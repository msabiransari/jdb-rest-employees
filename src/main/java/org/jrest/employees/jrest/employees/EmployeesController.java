package org.jrest.employees.jrest.employees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeesController {
  private static final Logger logger = LoggerFactory.getLogger(EmployeesController.class);
  @PostMapping(path = "/jdb-rest/employees/data", produces = "application/json")
  public List<Map<String, Object>> post(@RequestBody Map<String, Object> payload) {
    return Arrays.asList(
        Map.of("id", 1001, "dept_id", 10, "name", "Kevin T", "salary", 130000, "hire_date", LocalDate.of(2021, 5, 24), "active", true),
        Map.of("id", 1034, "dept_id", 20, "name", "Maria P", "salary", 840000, "hire_date", LocalDate.of(2021, 5, 24), "active", true),
        Map.of("id", 1029, "dept_id", 60, "name", "David K", "salary", 90000, "hire_date", LocalDate.of(2021, 5, 24), "active", false),
        Map.of("id", 872, "dept_id", 10, "name", "Lucas E", "salary", 110000, "hire_date", LocalDate.of(2021, 5, 24), "active", true),
        Map.of("id", 26, "dept_id", 20, "name", "Shelly J", "salary", 130000, "hire_date", LocalDate.of(2021, 5, 24), "active", true)
    );
  }
}