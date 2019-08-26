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
import com.fasterxml.jackson.annotation.JsonValue;


/**
* BankingEnumProductCategory
* 
* * The category to which a product or account belongs. See
* [here](#product-categories) for more details
* 
*/
public enum BankingEnumProductCategory {
    TRANS_AND_SAVINGS_ACCOUNTS("TRANS_AND_SAVINGS_ACCOUNTS"),
    TERM_DEPOSITS("TERM_DEPOSITS"),
    TRAVEL_CARDS("TRAVEL_CARDS"),
    REGULATED_TRUST_ACCOUNTS("REGULATED_TRUST_ACCOUNTS"),
    RESIDENTIAL_MORTGAGES("RESIDENTIAL_MORTGAGES"),
    CRED_AND_CHRG_CARDS("CRED_AND_CHRG_CARDS"),
    PERS_LOANS("PERS_LOANS"),
    MARGIN_LOANS("MARGIN_LOANS"),
    LEASES("LEASES"),
    TRADE_FINANCE("TRADE_FINANCE"),
    OVERDRAFTS("OVERDRAFTS"),
    BUSINESS_LOANS("BUSINESS_LOANS");
    
    private String value;
    
    BankingEnumProductCategory(String value) {
      this.value = value;
    }
    
    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BankingEnumProductCategory fromValue(String value) {
      for (BankingEnumProductCategory b : BankingEnumProductCategory.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
