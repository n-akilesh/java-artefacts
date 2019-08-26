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
import java.util.Objects;
import java.lang.reflect.Field;




/**
* PaginatedResponse
* 
* 
*/
public class PaginatedResponse  {
    // The links attribute contains a Links object with links to
    // related API end points. This will include links to support
    // pagination.
    @JsonProperty("links")
    private LinksPaginated links;
    // The meta object is used to provide additional information
    // such as second factor authorisation data, traffic
    // management, pagination counts or other purposes that are
    // complementary to the workings of the API.
    @JsonProperty("meta")
    private MetaPaginated meta;

    
    public LinksPaginated getLinks() {
        return links;
    }

    public void setLinks(LinksPaginated links) {
        this.links = links;
    }
    
    public MetaPaginated getMeta() {
        return meta;
    }

    public void setMeta(MetaPaginated meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        PaginatedResponse inputModel = (PaginatedResponse) o;
        if(! (links.equals(inputModel.getLinks()))) { return false; }
        if(! (meta.equals(inputModel.getMeta()))) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
      return Objects.hash(meta,meta);
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
