/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the cds-codegen package
 * https://github.com/ConsumerDataStandardsAustralia/cds-codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.holder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.util.Objects;
import java.net.URI;
import java.lang.reflect.Field;

/**
 * BankingProductRateCondition
 * 
 * * Defines a condition for the applicability of a tiered rate
 * 
 */
@Entity
public class BankingProductRateCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productRateConditionId;

    // Display text providing more information on the condition
    @JsonProperty("additionalInfo")
    @Column(length = 2048)
    private String additionalInfo;
    // Link to a web page with more information on this condition
    @JsonProperty("additionalInfoUri")
    private URI additionalInfoUri;

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public URI getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(URI additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BankingProductRateCondition inputModel = (BankingProductRateCondition) o;
        if (!(additionalInfo.equals(inputModel.getAdditionalInfo()))) {
            return false;
        }
        if (!(additionalInfoUri.equals(inputModel.getAdditionalInfoUri()))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfoUri, additionalInfoUri);
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
