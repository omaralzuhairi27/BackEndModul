package at.nacs.drhouseaccountancy;

import lombok.Data;

@Data
public class PatientDTO {
    private String id;
    private String name;
    private String symptoms;
    private String diagnosis;
    private String treatment;
    private String medicine;
}
