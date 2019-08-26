/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the cds-codegen package
 * https://github.com/ConsumerDataStandardsAustralia/cds-codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.holder.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.*;
import java.util.Objects;
import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * BankingProductRateTier
 * 
 * * Defines the criteria and conditions for which a rate applies
 * 
 */
@Entity
public class BankingProductRateTier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productRateTierId;

    // A display name for the tier
    @JsonProperty("name")
    private String name;
    // The unit of measure that applies to the tierValueMinimum and
    // tierValueMaximum values e.g. 'DOLLAR', 'MONTH' (in the case
    // of term deposit tiers), 'PERCENT' (in the case of
    // loan-to-value ratio or LVR)
    @JsonProperty("unitOfMeasure")
    private UnitOfMeasure unitOfMeasure;
    // The number of tierUnitOfMeasure units that form the lower
    // bound of the tier. The tier should be inclusive of this
    // value
    @JsonProperty("minimumValue")
    private BigDecimal minimumValue;
    // The number of tierUnitOfMeasure units that form the upper
    // bound of the tier or band. For a tier with a discrete value
    // (as opposed to a range of values e.g. 1 month) this must be
    // the same as tierValueMinimum. Where this is the same as the
    // tierValueMinimum value of the next-higher tier the
    // referenced tier should be exclusive of this value. For
    // example a term deposit of 2 months falls into the upper tier
    // of the following tiers: (1 – 2 months, 2 – 3 months). If
    // absent the tier's range has no upper bound.
    @JsonProperty("maximumValue")
    private BigDecimal maximumValue;
    // The method used to calculate the amount to be applied using
    // one or more tiers. A single rate may be applied to the
    // entire balance or each applicable tier rate is applied to
    // the portion of the balance that falls into that tier
    // (referred to as 'bands' or 'steps')
    @JsonProperty("rateApplicationMethod")
    private RateApplicationMethod rateApplicationMethod;
    @JsonProperty("applicabilityConditions")
    @ManyToOne(cascade = CascadeType.ALL)
    private BankingProductRateCondition applicabilityConditions;
    @JsonProperty("subTier")
    @ManyToOne(cascade = CascadeType.ALL)
    private BankingProductRateTierSubTier subTier;

    @ManyToOne
    private BankingProductDepositRate depositRate;

    @ManyToOne
    private BankingProductLendingRate lendingRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public BigDecimal getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(BigDecimal minimumValue) {
        this.minimumValue = minimumValue;
    }

    public BigDecimal getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(BigDecimal maximumValue) {
        this.maximumValue = maximumValue;
    }

    public RateApplicationMethod getRateApplicationMethod() {
        return rateApplicationMethod;
    }

    public void setRateApplicationMethod(RateApplicationMethod rateApplicationMethod) {
        this.rateApplicationMethod = rateApplicationMethod;
    }

    public BankingProductRateCondition getApplicabilityConditions() {
        return applicabilityConditions;
    }

    public void setApplicabilityConditions(BankingProductRateCondition applicabilityConditions) {
        this.applicabilityConditions = applicabilityConditions;
    }

    public BankingProductRateTierSubTier getSubTier() {
        return subTier;
    }

    public void setSubTier(BankingProductRateTierSubTier subTier) {
        this.subTier = subTier;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BankingProductRateTier inputModel = (BankingProductRateTier) o;
        if (!(name.equals(inputModel.getName()))) {
            return false;
        }
        if (!(unitOfMeasure.equals(inputModel.getUnitOfMeasure()))) {
            return false;
        }
        if (!(minimumValue.equals(inputModel.getMinimumValue()))) {
            return false;
        }
        if (!(maximumValue.equals(inputModel.getMaximumValue()))) {
            return false;
        }
        if (!(rateApplicationMethod.equals(inputModel.getRateApplicationMethod()))) {
            return false;
        }
        if (!(applicabilityConditions.equals(inputModel.getApplicabilityConditions()))) {
            return false;
        }
        if (!(subTier.equals(inputModel.getSubTier()))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subTier, subTier, subTier, subTier, subTier, subTier, subTier);
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

    /**
     * RateApplicationMethod
     * 
     * 
     */
    public enum RateApplicationMethod {
        WHOLE_BALANCE("WHOLE_BALANCE"), PER_TIER("PER_TIER");

        private String value;

        RateApplicationMethod(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RateApplicationMethod fromValue(String value) {
            for (RateApplicationMethod b : RateApplicationMethod.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    /**
     * UnitOfMeasure
     * 
     * 
     */
    public enum UnitOfMeasure {
        DOLLAR("DOLLAR"), PERCENT("PERCENT"), MONTH("MONTH"), DAY("DAY");

        private String value;

        UnitOfMeasure(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static UnitOfMeasure fromValue(String value) {
            for (UnitOfMeasure b : UnitOfMeasure.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

}
