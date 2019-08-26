/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the cds-codegen package
 * https://github.com/ConsumerDataStandardsAustralia/cds-codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.holder.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.lang.reflect.Field;
import java.util.List;




/**
* CommonPerson
* 
* 
*/
@Entity
public class CommonPerson  {
        
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String personId;
    
    // The date and time that this record was last updated by the
    // customer.  If no update has occurred then this date should
    // reflect the initial creation date for the data
    @JsonProperty("lastUpdateTime")
    @DateTimeFormat(iso = ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING)    
    private OffsetDateTime lastUpdateTime;
    // For people with single names this field need not be present.
    // The single name should be in the lastName field
    @JsonProperty("firstName")
    private String firstName;
    // For people with single names the single name should be in
    // this field
    @JsonProperty("lastName")
    private String lastName;
    // Field is mandatory but array may be empty
    @JsonProperty("middleNames")
    @Valid
    @ElementCollection (targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(
        name="MiddleNames",
        joinColumns=@JoinColumn(name="personId")
    )
    @Column(name="middleName")    
    private List<String> middleNames;
    // Also known as title or salutation.  The prefix to the name
    // (e.g. Mr, Mrs, Ms, Miss, Sir, etc)
    @JsonProperty("prefix")
    private String prefix;
    // Used for a trailing suffix to the name (e.g. Jr)
    @JsonProperty("suffix")
    private String suffix;
    // Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO)
    // Standard Occupation classification.
    @JsonProperty("occupationCode")
    private String occupationCode;

    
    public OffsetDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(OffsetDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public List<String> getMiddleNames() {
        return middleNames;
    }

    public void setMiddleNames(List<String> middleNames) {
        this.middleNames = middleNames;
    }
    
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    public String getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        CommonPerson inputModel = (CommonPerson) o;
        if(! (lastUpdateTime.equals(inputModel.getLastUpdateTime()))) { return false; }
        if(! (firstName.equals(inputModel.getFirstName()))) { return false; }
        if(! (lastName.equals(inputModel.getLastName()))) { return false; }
        if(! (middleNames.equals(inputModel.getMiddleNames()))) { return false; }
        if(! (prefix.equals(inputModel.getPrefix()))) { return false; }
        if(! (suffix.equals(inputModel.getSuffix()))) { return false; }
        if(! (occupationCode.equals(inputModel.getOccupationCode()))) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
      return Objects.hash(occupationCode,occupationCode,occupationCode,occupationCode,occupationCode,occupationCode,occupationCode);
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
