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
        "name",
        "name:en",
        "name:fa",
        "opening_hours",
        "shop",
        "brand",
        "brand:wikidata",
        "brand:wikipedia",
        "name:he",
        "website",
        "wheelchair",
        "addr:city:en",
        "addr:housenumber",
        "addr:street",
        "organic",
        "name:ru",
        "level",
        "addr:city",
        "atm",
        "addr:housename",
        "addr:postcode",
        "air_conditioning",
        "name:ar",
        "payment:cash",
        "payment:credit_cards",
        "fixme",
        "fax",
        "phone",
        "source",
        "contact:website",
        "operator",
        "payment:bitcoin",
        "payment:coins",
        "payment:debit_cards",
        "payment:mastercard",
        "payment:visa",
        "payment:american_express",
        "building",
        "brand:en",
        "brand:he",
        "contact:phone"
})
public class Tags {

    @JsonProperty("name")
    private String name;
    @JsonProperty("name:en")
    private String nameEn;
    @JsonProperty("name:fa")
    private String nameFa;
    @JsonProperty("opening_hours")
    private String openingHours;
    @JsonProperty("shop")
    private String shop;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("brand:wikidata")
    private String brandWikidata;
    @JsonProperty("brand:wikipedia")
    private String brandWikipedia;
    @JsonProperty("name:he")
    private String nameHe;
    @JsonProperty("website")
    private String website;
    @JsonProperty("wheelchair")
    private String wheelchair;
    @JsonProperty("addr:city:en")
    private String addrCityEn;
    @JsonProperty("addr:housenumber")
    private String addrHousenumber;
    @JsonProperty("addr:street")
    private String addrStreet;
    @JsonProperty("organic")
    private String organic;
    @JsonProperty("name:ru")
    private String nameRu;
    @JsonProperty("level")
    private String level;
    @JsonProperty("addr:city")
    private String addrCity;
    @JsonProperty("atm")
    private String atm;
    @JsonProperty("addr:housename")
    private String addrHousename;
    @JsonProperty("addr:postcode")
    private String addrPostcode;
    @JsonProperty("air_conditioning")
    private String airConditioning;
    @JsonProperty("name:ar")
    private String nameAr;
    @JsonProperty("payment:cash")
    private String paymentCash;
    @JsonProperty("payment:credit_cards")
    private String paymentCreditCards;
    @JsonProperty("fixme")
    private String fixme;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("source")
    private String source;
    @JsonProperty("contact:website")
    private String contactWebsite;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("payment:bitcoin")
    private String paymentBitcoin;
    @JsonProperty("payment:coins")
    private String paymentCoins;
    @JsonProperty("payment:debit_cards")
    private String paymentDebitCards;
    @JsonProperty("payment:mastercard")
    private String paymentMastercard;
    @JsonProperty("payment:visa")
    private String paymentVisa;
    @JsonProperty("payment:american_express")
    private String paymentAmericanExpress;
    @JsonProperty("building")
    private String building;
    @JsonProperty("brand:en")
    private String brandEn;
    @JsonProperty("brand:he")
    private String brandHe;
    @JsonProperty("contact:phone")
    private String contactPhone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Tags withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name:en")
    public String getNameEn() {
        return nameEn;
    }

    @JsonProperty("name:en")
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public Tags withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    @JsonProperty("name:fa")
    public String getNameFa() {
        return nameFa;
    }

    @JsonProperty("name:fa")
    public void setNameFa(String nameFa) {
        this.nameFa = nameFa;
    }

    public Tags withNameFa(String nameFa) {
        this.nameFa = nameFa;
        return this;
    }

    @JsonProperty("opening_hours")
    public String getOpeningHours() {
        return openingHours;
    }

    @JsonProperty("opening_hours")
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public Tags withOpeningHours(String openingHours) {
        this.openingHours = openingHours;
        return this;
    }

    @JsonProperty("shop")
    public String getShop() {
        return shop;
    }

    @JsonProperty("shop")
    public void setShop(String shop) {
        this.shop = shop;
    }

    public Tags withShop(String shop) {
        this.shop = shop;
        return this;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Tags withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @JsonProperty("brand:wikidata")
    public String getBrandWikidata() {
        return brandWikidata;
    }

    @JsonProperty("brand:wikidata")
    public void setBrandWikidata(String brandWikidata) {
        this.brandWikidata = brandWikidata;
    }

    public Tags withBrandWikidata(String brandWikidata) {
        this.brandWikidata = brandWikidata;
        return this;
    }

    @JsonProperty("brand:wikipedia")
    public String getBrandWikipedia() {
        return brandWikipedia;
    }

    @JsonProperty("brand:wikipedia")
    public void setBrandWikipedia(String brandWikipedia) {
        this.brandWikipedia = brandWikipedia;
    }

    public Tags withBrandWikipedia(String brandWikipedia) {
        this.brandWikipedia = brandWikipedia;
        return this;
    }

    @JsonProperty("name:he")
    public String getNameHe() {
        return nameHe;
    }

    @JsonProperty("name:he")
    public void setNameHe(String nameHe) {
        this.nameHe = nameHe;
    }

    public Tags withNameHe(String nameHe) {
        this.nameHe = nameHe;
        return this;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    public Tags withWebsite(String website) {
        this.website = website;
        return this;
    }

    @JsonProperty("wheelchair")
    public String getWheelchair() {
        return wheelchair;
    }

    @JsonProperty("wheelchair")
    public void setWheelchair(String wheelchair) {
        this.wheelchair = wheelchair;
    }

    public Tags withWheelchair(String wheelchair) {
        this.wheelchair = wheelchair;
        return this;
    }

    @JsonProperty("addr:city:en")
    public String getAddrCityEn() {
        return addrCityEn;
    }

    @JsonProperty("addr:city:en")
    public void setAddrCityEn(String addrCityEn) {
        this.addrCityEn = addrCityEn;
    }

    public Tags withAddrCityEn(String addrCityEn) {
        this.addrCityEn = addrCityEn;
        return this;
    }

    @JsonProperty("addr:housenumber")
    public String getAddrHousenumber() {
        return addrHousenumber;
    }

    @JsonProperty("addr:housenumber")
    public void setAddrHousenumber(String addrHousenumber) {
        this.addrHousenumber = addrHousenumber;
    }

    public Tags withAddrHousenumber(String addrHousenumber) {
        this.addrHousenumber = addrHousenumber;
        return this;
    }

    @JsonProperty("addr:street")
    public String getAddrStreet() {
        return addrStreet;
    }

    @JsonProperty("addr:street")
    public void setAddrStreet(String addrStreet) {
        this.addrStreet = addrStreet;
    }

    public Tags withAddrStreet(String addrStreet) {
        this.addrStreet = addrStreet;
        return this;
    }

    @JsonProperty("organic")
    public String getOrganic() {
        return organic;
    }

    @JsonProperty("organic")
    public void setOrganic(String organic) {
        this.organic = organic;
    }

    public Tags withOrganic(String organic) {
        this.organic = organic;
        return this;
    }

    @JsonProperty("name:ru")
    public String getNameRu() {
        return nameRu;
    }

    @JsonProperty("name:ru")
    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public Tags withNameRu(String nameRu) {
        this.nameRu = nameRu;
        return this;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    public Tags withLevel(String level) {
        this.level = level;
        return this;
    }

    @JsonProperty("addr:city")
    public String getAddrCity() {
        return addrCity;
    }

    @JsonProperty("addr:city")
    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public Tags withAddrCity(String addrCity) {
        this.addrCity = addrCity;
        return this;
    }

    @JsonProperty("atm")
    public String getAtm() {
        return atm;
    }

    @JsonProperty("atm")
    public void setAtm(String atm) {
        this.atm = atm;
    }

    public Tags withAtm(String atm) {
        this.atm = atm;
        return this;
    }

    @JsonProperty("addr:housename")
    public String getAddrHousename() {
        return addrHousename;
    }

    @JsonProperty("addr:housename")
    public void setAddrHousename(String addrHousename) {
        this.addrHousename = addrHousename;
    }

    public Tags withAddrHousename(String addrHousename) {
        this.addrHousename = addrHousename;
        return this;
    }

    @JsonProperty("addr:postcode")
    public String getAddrPostcode() {
        return addrPostcode;
    }

    @JsonProperty("addr:postcode")
    public void setAddrPostcode(String addrPostcode) {
        this.addrPostcode = addrPostcode;
    }

    public Tags withAddrPostcode(String addrPostcode) {
        this.addrPostcode = addrPostcode;
        return this;
    }

    @JsonProperty("air_conditioning")
    public String getAirConditioning() {
        return airConditioning;
    }

    @JsonProperty("air_conditioning")
    public void setAirConditioning(String airConditioning) {
        this.airConditioning = airConditioning;
    }

    public Tags withAirConditioning(String airConditioning) {
        this.airConditioning = airConditioning;
        return this;
    }

    @JsonProperty("name:ar")
    public String getNameAr() {
        return nameAr;
    }

    @JsonProperty("name:ar")
    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public Tags withNameAr(String nameAr) {
        this.nameAr = nameAr;
        return this;
    }

    @JsonProperty("payment:cash")
    public String getPaymentCash() {
        return paymentCash;
    }

    @JsonProperty("payment:cash")
    public void setPaymentCash(String paymentCash) {
        this.paymentCash = paymentCash;
    }

    public Tags withPaymentCash(String paymentCash) {
        this.paymentCash = paymentCash;
        return this;
    }

    @JsonProperty("payment:credit_cards")
    public String getPaymentCreditCards() {
        return paymentCreditCards;
    }

    @JsonProperty("payment:credit_cards")
    public void setPaymentCreditCards(String paymentCreditCards) {
        this.paymentCreditCards = paymentCreditCards;
    }

    public Tags withPaymentCreditCards(String paymentCreditCards) {
        this.paymentCreditCards = paymentCreditCards;
        return this;
    }

    @JsonProperty("fixme")
    public String getFixme() {
        return fixme;
    }

    @JsonProperty("fixme")
    public void setFixme(String fixme) {
        this.fixme = fixme;
    }

    public Tags withFixme(String fixme) {
        this.fixme = fixme;
        return this;
    }

    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    public Tags withFax(String fax) {
        this.fax = fax;
        return this;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Tags withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public Tags withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("contact:website")
    public String getContactWebsite() {
        return contactWebsite;
    }

    @JsonProperty("contact:website")
    public void setContactWebsite(String contactWebsite) {
        this.contactWebsite = contactWebsite;
    }

    public Tags withContactWebsite(String contactWebsite) {
        this.contactWebsite = contactWebsite;
        return this;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Tags withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    @JsonProperty("payment:bitcoin")
    public String getPaymentBitcoin() {
        return paymentBitcoin;
    }

    @JsonProperty("payment:bitcoin")
    public void setPaymentBitcoin(String paymentBitcoin) {
        this.paymentBitcoin = paymentBitcoin;
    }

    public Tags withPaymentBitcoin(String paymentBitcoin) {
        this.paymentBitcoin = paymentBitcoin;
        return this;
    }

    @JsonProperty("payment:coins")
    public String getPaymentCoins() {
        return paymentCoins;
    }

    @JsonProperty("payment:coins")
    public void setPaymentCoins(String paymentCoins) {
        this.paymentCoins = paymentCoins;
    }

    public Tags withPaymentCoins(String paymentCoins) {
        this.paymentCoins = paymentCoins;
        return this;
    }

    @JsonProperty("payment:debit_cards")
    public String getPaymentDebitCards() {
        return paymentDebitCards;
    }

    @JsonProperty("payment:debit_cards")
    public void setPaymentDebitCards(String paymentDebitCards) {
        this.paymentDebitCards = paymentDebitCards;
    }

    public Tags withPaymentDebitCards(String paymentDebitCards) {
        this.paymentDebitCards = paymentDebitCards;
        return this;
    }

    @JsonProperty("payment:mastercard")
    public String getPaymentMastercard() {
        return paymentMastercard;
    }

    @JsonProperty("payment:mastercard")
    public void setPaymentMastercard(String paymentMastercard) {
        this.paymentMastercard = paymentMastercard;
    }

    public Tags withPaymentMastercard(String paymentMastercard) {
        this.paymentMastercard = paymentMastercard;
        return this;
    }

    @JsonProperty("payment:visa")
    public String getPaymentVisa() {
        return paymentVisa;
    }

    @JsonProperty("payment:visa")
    public void setPaymentVisa(String paymentVisa) {
        this.paymentVisa = paymentVisa;
    }

    public Tags withPaymentVisa(String paymentVisa) {
        this.paymentVisa = paymentVisa;
        return this;
    }

    @JsonProperty("payment:american_express")
    public String getPaymentAmericanExpress() {
        return paymentAmericanExpress;
    }

    @JsonProperty("payment:american_express")
    public void setPaymentAmericanExpress(String paymentAmericanExpress) {
        this.paymentAmericanExpress = paymentAmericanExpress;
    }

    public Tags withPaymentAmericanExpress(String paymentAmericanExpress) {
        this.paymentAmericanExpress = paymentAmericanExpress;
        return this;
    }

    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    public Tags withBuilding(String building) {
        this.building = building;
        return this;
    }

    @JsonProperty("brand:en")
    public String getBrandEn() {
        return brandEn;
    }

    @JsonProperty("brand:en")
    public void setBrandEn(String brandEn) {
        this.brandEn = brandEn;
    }

    public Tags withBrandEn(String brandEn) {
        this.brandEn = brandEn;
        return this;
    }

    @JsonProperty("brand:he")
    public String getBrandHe() {
        return brandHe;
    }

    @JsonProperty("brand:he")
    public void setBrandHe(String brandHe) {
        this.brandHe = brandHe;
    }

    public Tags withBrandHe(String brandHe) {
        this.brandHe = brandHe;
        return this;
    }

    @JsonProperty("contact:phone")
    public String getContactPhone() {
        return contactPhone;
    }

    @JsonProperty("contact:phone")
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Tags withContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
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

    public Tags withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(nameEn).append(nameFa).append(openingHours).append(shop).append(brand).append(brandWikidata).append(brandWikipedia).append(nameHe).append(website).append(wheelchair).append(addrCityEn).append(addrHousenumber).append(addrStreet).append(organic).append(nameRu).append(level).append(addrCity).append(atm).append(addrHousename).append(addrPostcode).append(airConditioning).append(nameAr).append(paymentCash).append(paymentCreditCards).append(fixme).append(fax).append(phone).append(source).append(contactWebsite).append(operator).append(paymentBitcoin).append(paymentCoins).append(paymentDebitCards).append(paymentMastercard).append(paymentVisa).append(paymentAmericanExpress).append(building).append(brandEn).append(brandHe).append(contactPhone).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tags) == false) {
            return false;
        }
        Tags rhs = ((Tags) other);
        return new EqualsBuilder().append(name, rhs.name).append(nameEn, rhs.nameEn).append(nameFa, rhs.nameFa).append(openingHours, rhs.openingHours).append(shop, rhs.shop).append(brand, rhs.brand).append(brandWikidata, rhs.brandWikidata).append(brandWikipedia, rhs.brandWikipedia).append(nameHe, rhs.nameHe).append(website, rhs.website).append(wheelchair, rhs.wheelchair).append(addrCityEn, rhs.addrCityEn).append(addrHousenumber, rhs.addrHousenumber).append(addrStreet, rhs.addrStreet).append(organic, rhs.organic).append(nameRu, rhs.nameRu).append(level, rhs.level).append(addrCity, rhs.addrCity).append(atm, rhs.atm).append(addrHousename, rhs.addrHousename).append(addrPostcode, rhs.addrPostcode).append(airConditioning, rhs.airConditioning).append(nameAr, rhs.nameAr).append(paymentCash, rhs.paymentCash).append(paymentCreditCards, rhs.paymentCreditCards).append(fixme, rhs.fixme).append(fax, rhs.fax).append(phone, rhs.phone).append(source, rhs.source).append(contactWebsite, rhs.contactWebsite).append(operator, rhs.operator).append(paymentBitcoin, rhs.paymentBitcoin).append(paymentCoins, rhs.paymentCoins).append(paymentDebitCards, rhs.paymentDebitCards).append(paymentMastercard, rhs.paymentMastercard).append(paymentVisa, rhs.paymentVisa).append(paymentAmericanExpress, rhs.paymentAmericanExpress).append(building, rhs.building).append(brandEn, rhs.brandEn).append(brandHe, rhs.brandHe).append(contactPhone, rhs.contactPhone).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
