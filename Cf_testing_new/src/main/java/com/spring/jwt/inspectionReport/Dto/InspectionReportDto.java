package com.spring.jwt.inspectionReport.Dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class InspectionReportDto {

    private Integer inspectionReportId;

    private String RCAvailability;

    private String MismatchInRC;

    private String RTONOCIssued ;

    private String InsuranceType ;

    private String NoClaimBonus ;

    private String UnderHypothecation ;

    private String LoanStatus  ;

    private String RoadTaxPaid  ;

    private String PartipeshiRequest  ;

    private String DuplicateKey  ;

    private String ChassisNumberEmbossing ;

    private Date ManufacturingDate  ;

    private Date RegistrationDate   ;

    private String RTO  ;

    private Date FitnessUpto  ;

    private String CNGLPGFitmentInRC   ;

    private int userId;

    private Integer beadingCarId;

    private String NOCStatus;

    public InspectionReportDto() {
    }
}
