package tn.soretras.contestmanager.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link tn.soretras.contestmanager.domain.Certificate} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CertificateDTO implements Serializable {

    private String id;

    @NotNull
    private String designation;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateDTO)) {
            return false;
        }

        CertificateDTO certificateDTO = (CertificateDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, certificateDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CertificateDTO{" +
            "id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            "}";
    }
}
