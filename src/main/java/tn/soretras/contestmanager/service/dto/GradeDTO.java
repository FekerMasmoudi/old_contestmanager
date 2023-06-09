package tn.soretras.contestmanager.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link tn.soretras.contestmanager.domain.Grade} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class GradeDTO implements Serializable {

    private String id;

    @NotNull
    private String designation;

    private EducationlevelDTO ideducationlevel;

    private CertificateDTO idcertificate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public EducationlevelDTO getIdeducationlevel() {
        return ideducationlevel;
    }

    public void setIdeducationlevel(EducationlevelDTO ideducationlevel) {
        this.ideducationlevel = ideducationlevel;
    }

    public CertificateDTO getIdcertificate() {
        return idcertificate;
    }

    public void setIdcertificate(CertificateDTO idcertificate) {
        this.idcertificate = idcertificate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GradeDTO)) {
            return false;
        }

        GradeDTO gradeDTO = (GradeDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, gradeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "GradeDTO{" +
            "id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", ideducationlevel=" + getIdeducationlevel() +
            ", idcertificate=" + getIdcertificate() +
            "}";
    }
}
