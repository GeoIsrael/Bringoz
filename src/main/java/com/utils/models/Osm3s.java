package com.utils.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "timestamp_osm_base",
        "timestamp_areas_base",
        "copyright"
})
public class Osm3s {

    @JsonProperty("timestamp_osm_base")
    private String timestampOsmBase;
    @JsonProperty("timestamp_areas_base")
    private String timestampAreasBase;
    @JsonProperty("copyright")
    private String copyright;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("timestamp_osm_base")
    public String getTimestampOsmBase() {
        return timestampOsmBase;
    }

    @JsonProperty("timestamp_osm_base")
    public void setTimestampOsmBase(String timestampOsmBase) {
        this.timestampOsmBase = timestampOsmBase;
    }

    public Osm3s withTimestampOsmBase(String timestampOsmBase) {
        this.timestampOsmBase = timestampOsmBase;
        return this;
    }

    @JsonProperty("timestamp_areas_base")
    public String getTimestampAreasBase() {
        return timestampAreasBase;
    }

    @JsonProperty("timestamp_areas_base")
    public void setTimestampAreasBase(String timestampAreasBase) {
        this.timestampAreasBase = timestampAreasBase;
    }

    public Osm3s withTimestampAreasBase(String timestampAreasBase) {
        this.timestampAreasBase = timestampAreasBase;
        return this;
    }

    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Osm3s withCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Osm3s withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timestampOsmBase).append(timestampAreasBase).append(copyright).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Osm3s) == false) {
            return false;
        }
        Osm3s rhs = ((Osm3s) other);
        return new EqualsBuilder().append(timestampOsmBase, rhs.timestampOsmBase).append(timestampAreasBase, rhs.timestampAreasBase).append(copyright, rhs.copyright).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
