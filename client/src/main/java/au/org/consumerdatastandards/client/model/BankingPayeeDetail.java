/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.util.Objects;

public class BankingPayeeDetail extends BankingPayee {

    public enum PayeeUType {
        biller,
        domestic,
        international
    }

    private BankingBillerPayee biller;

    private BankingDomesticPayee domestic;

    private BankingInternationalPayee international;

    private PayeeUType payeeUType;

    /**
     * Get biller
     * @return biller
     */
    public BankingBillerPayee getBiller() {
        return biller;
    }

    public void setBiller(BankingBillerPayee biller) {
        this.biller = biller;
    }

    /**
     * Get domestic
     * @return domestic
     */
    public BankingDomesticPayee getDomestic() {
        return domestic;
    }

    public void setDomestic(BankingDomesticPayee domestic) {
        this.domestic = domestic;
    }

    /**
     * Get international
     * @return international
     */
    public BankingInternationalPayee getInternational() {
        return international;
    }

    public void setInternational(BankingInternationalPayee international) {
        this.international = international;
    }

    /**
     * Get payeeUType
     * @return payeeUType
     */
    public PayeeUType getPayeeUType() {
        return payeeUType;
    }

    public void setPayeeUType(PayeeUType payeeUType) {
        this.payeeUType = payeeUType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingPayeeDetail bankingPayeeDetail = (BankingPayeeDetail) o;
        return Objects.equals(this.biller, bankingPayeeDetail.biller) &&
            Objects.equals(this.domestic, bankingPayeeDetail.domestic) &&
            Objects.equals(this.international, bankingPayeeDetail.international) &&
            Objects.equals(this.payeeUType, bankingPayeeDetail.payeeUType) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            biller,
            domestic,
            international,
            payeeUType,
            super.hashCode());
    }

    @Override
    public String toString() {
        return "class BankingPayeeDetail {\n" +
            "   creationDate: " + toIndentedString(getCreationDate()) + "\n" + 
            "   description: " + toIndentedString(getDescription()) + "\n" + 
            "   nickname: " + toIndentedString(getNickname()) + "\n" + 
            "   payeeId: " + toIndentedString(getPayeeId()) + "\n" + 
            "   type: " + toIndentedString(getType()) + "\n" + 
            "   biller: " + toIndentedString(biller) + "\n" + 
            "   domestic: " + toIndentedString(domestic) + "\n" + 
            "   international: " + toIndentedString(international) + "\n" + 
            "   payeeUType: " + toIndentedString(payeeUType) + "\n" + 
            "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
