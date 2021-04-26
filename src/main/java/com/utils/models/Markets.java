package com.utils.models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        "version",
        "generator",
        "osm3s",
        "elements"
})
public class Markets {

    @JsonProperty("version")
    private Double version;
    @JsonProperty("generator")
    private String generator;
    @JsonProperty("osm3s")
    private Osm3s osm3s;
    @JsonProperty("elements")
    private List<Element> elements = new ArrayList<Element>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    public Markets withVersion(Double version) {
        this.version = version;
        return this;
    }

    @JsonProperty("generator")
    public String getGenerator() {
        return generator;
    }

    @JsonProperty("generator")
    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public Markets withGenerator(String generator) {
        this.generator = generator;
        return this;
    }

    @JsonProperty("osm3s")
    public Osm3s getOsm3s() {
        return osm3s;
    }

    @JsonProperty("osm3s")
    public void setOsm3s(Osm3s osm3s) {
        this.osm3s = osm3s;
    }

    public Markets withOsm3s(Osm3s osm3s) {
        this.osm3s = osm3s;
        return this;
    }

    @JsonProperty("elements")
    public List<Element> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public Markets withElements(List<Element> elements) {
        this.elements = elements;
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

    public Markets withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(version).append(generator).append(osm3s).append(elements).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Markets) == false) {
            return false;
        }
        Markets rhs = ((Markets) other);
        return new EqualsBuilder().append(version, rhs.version).append(generator, rhs.generator).append(osm3s, rhs.osm3s).append(elements, rhs.elements).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
