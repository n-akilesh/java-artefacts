/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the cds-codegen package
 * https://github.com/ConsumerDataStandardsAustralia/cds-codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.holder.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.net.URI;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import au.org.consumerdatastandards.holder.model.CommonOrganisation.OrganisationType;

/** CommonOrganisationDetail */
@Entity
@Table(name = "CommonOrganisation")
public class CommonOrganisationDetail {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String organisationId;

    // The date and time that this record was last updated by the
    // customer. If no update has occurred then this date should
    // reflect the initial creation date for the data
    @JsonProperty("lastUpdateTime")
    @DateTimeFormat(iso = ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private OffsetDateTime lastUpdateTime;
    // The first name of the individual providing access on behalf
    // of the organisation. For people with single names this field
    // need not be present. The single name should be in the
    // lastName field
    @JsonProperty("agentFirstName")
    private String agentFirstName;
    // The last name of the individual providing access on behalf
    // of the organisation. For people with single names the single
    // name should be in this field
    @JsonProperty("agentLastName")
    private String agentLastName;
    // The role of the individual identified as the agent who is
    // providing authorisation. Expected to be used for display.
    // Default to “Unspecified” if the role is not known
    @JsonProperty("agentRole")
    private String agentRole;
    // Name of the organisation
    @JsonProperty("businessName")
    private String businessName;
    // Legal name, if different to the business name
    @JsonProperty("legalName")
    private String legalName;
    // Short name used for communication, if different to the
    // business name
    @JsonProperty("shortName")
    private String shortName;
    // Australian Business Number for the organisation
    @JsonProperty("abn")
    private String abn;
    // Australian Company Number for the organisation. Required
    // only if an ACN is applicable for the organisation type
    @JsonProperty("acn")
    private String acn;
    // True if registered with the ACNC. False if not. Absent or
    // null if not confirmed.
    @JsonProperty("isACNCRegistered")
    private Boolean isACNCRegistered;
    // [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the
    // organisation.
    @JsonProperty("industryCode")
    private String industryCode;
    // Legal organisation type
    @JsonProperty("organisationType")
    private OrganisationType organisationType;
    // Enumeration with values from [ISO 3166
    // Alpha-3](https://www.iso.org/iso-3166-country-codes.html)
    // country codes. Assumed to be AUS if absent
    @JsonProperty("registeredCountry")
    private String registeredCountry;
    // The date the organisation described was established
    @JsonProperty("establishmentDate")
    @DateTimeFormat(iso = ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate establishmentDate;
    // Must contain at least one address. One and only one address
    // may have the purpose of REGISTERED. Zero or one, and no more
    // than one, record may have the purpose of MAIL. If zero then
    // the REGISTERED address is to be used for mail
    @JsonProperty("physicalAddresses")
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "physical_addresses", joinColumns = @JoinColumn(name = "organisation_id"), inverseJoinColumns = @JoinColumn(name = "paf_address_id"))
    private List<CommonPhysicalAddressWithPurpose> physicalAddresses;

    public OffsetDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(OffsetDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getAgentFirstName() {
        return agentFirstName;
    }

    public void setAgentFirstName(String agentFirstName) {
        this.agentFirstName = agentFirstName;
    }

    public String getAgentLastName() {
        return agentLastName;
    }

    public void setAgentLastName(String agentLastName) {
        this.agentLastName = agentLastName;
    }

    public String getAgentRole() {
        return agentRole;
    }

    public void setAgentRole(String agentRole) {
        this.agentRole = agentRole;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAbn() {
        return abn;
    }

    public void setAbn(String abn) {
        this.abn = abn;
    }

    public String getAcn() {
        return acn;
    }

    public void setAcn(String acn) {
        this.acn = acn;
    }

    public Boolean getIsACNCRegistered() {
        return isACNCRegistered;
    }

    public void setIsACNCRegistered(Boolean isACNCRegistered) {
        this.isACNCRegistered = isACNCRegistered;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public OrganisationType getOrganisationType() {
        return organisationType;
    }

    public void setOrganisationType(OrganisationType organisationType) {
        this.organisationType = organisationType;
    }

    public String getRegisteredCountry() {
        return registeredCountry;
    }

    public void setRegisteredCountry(String registeredCountry) {
        this.registeredCountry = registeredCountry;
    }

    public LocalDate getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(LocalDate establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public List<CommonPhysicalAddressWithPurpose> getPhysicalAddresses() {
        return physicalAddresses;
    }

    public void setPhysicalAddresses(List<CommonPhysicalAddressWithPurpose> physicalAddresses) {
        this.physicalAddresses = physicalAddresses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CommonOrganisationDetail inputModel = (CommonOrganisationDetail) o;
        if (!(lastUpdateTime.equals(inputModel.getLastUpdateTime()))) {
            return false;
        }
        if (!(agentFirstName.equals(inputModel.getAgentFirstName()))) {
            return false;
        }
        if (!(agentLastName.equals(inputModel.getAgentLastName()))) {
            return false;
        }
        if (!(agentRole.equals(inputModel.getAgentRole()))) {
            return false;
        }
        if (!(businessName.equals(inputModel.getBusinessName()))) {
            return false;
        }
        if (!(legalName.equals(inputModel.getLegalName()))) {
            return false;
        }
        if (!(shortName.equals(inputModel.getShortName()))) {
            return false;
        }
        if (!(abn.equals(inputModel.getAbn()))) {
            return false;
        }
        if (!(acn.equals(inputModel.getAcn()))) {
            return false;
        }
        if (!(isACNCRegistered.equals(inputModel.getIsACNCRegistered()))) {
            return false;
        }
        if (!(industryCode.equals(inputModel.getIndustryCode()))) {
            return false;
        }
        if (!(organisationType.equals(inputModel.getOrganisationType()))) {
            return false;
        }
        if (!(registeredCountry.equals(inputModel.getRegisteredCountry()))) {
            return false;
        }
        if (!(establishmentDate.equals(inputModel.getEstablishmentDate()))) {
            return false;
        }
        if (!(physicalAddresses.equals(inputModel.getPhysicalAddresses()))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdateTime, agentFirstName, agentLastName, agentRole, businessName, legalName,
                shortName, abn, acn, isACNCRegistered, industryCode, organisationType, registeredCountry,
                establishmentDate, physicalAddresses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("class %s {\n", getClass()));

        for (Field oneField : getClass().getFields()) {
            oneField.setAccessible(true);
            try {
                sb.append(String.format("    %s: %s\n", oneField.getName(), (oneField.get(Object.class) == null ? "null"
                        : oneField.get(Object.class).toString().replace("\n", "\n    "))));
            } catch (IllegalArgumentException | IllegalAccessException e) {
                // I guess we won't print it
                sb.append(String.format("    %s, [unreadable]\n", oneField.getName()));
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
