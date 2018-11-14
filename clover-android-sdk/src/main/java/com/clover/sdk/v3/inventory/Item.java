/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.inventory;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getHidden hidden}</li>
 * <li>{@link #getItemGroup itemGroup}</li>
 * <li>{@link #getOptions options}</li>
 * <li>{@link #getName name}</li>
 * <li>{@link #getAlternateName alternateName}</li>
 * <li>{@link #getCode code}</li>
 * <li>{@link #getSku sku}</li>
 * <li>{@link #getPrice price}</li>
 * <li>{@link #getPriceType priceType}</li>
 * <li>{@link #getDefaultTaxRates defaultTaxRates}</li>
 * <li>{@link #getUnitName unitName}</li>
 * <li>{@link #getCost cost}</li>
 * <li>{@link #getIsRevenue isRevenue}</li>
 * <li>{@link #getStockCount stockCount}</li>
 * <li>{@link #getTaxRates taxRates}</li>
 * <li>{@link #getModifierGroups modifierGroups}</li>
 * <li>{@link #getCategories categories}</li>
 * <li>{@link #getTags tags}</li>
 * <li>{@link #getItemStock itemStock}</li>
 * <li>{@link #getModifiedTime modifiedTime}</li>
 * <li>{@link #getDeletedTime deletedTime}</li>
 * <li>{@link #getPriceWithoutVat priceWithoutVat}</li>
 * </ul>
 * <p>
 * @see com.clover.sdk.v3.inventory.IInventoryService
 */
@SuppressWarnings("all")
public class Item extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * True if this item is hidden from Clover Register App
   */
  public java.lang.Boolean getHidden() {
    return genClient.cacheGet(CacheKey.hidden);
  }

  /**
   * Reference to an item group
   */
  public com.clover.sdk.v3.base.Reference getItemGroup() {
    return genClient.cacheGet(CacheKey.itemGroup);
  }

  /**
   * List of options pertaining to this item's attribute variation
   */
  public java.util.List<com.clover.sdk.v3.inventory.Option> getOptions() {
    return genClient.cacheGet(CacheKey.options);
  }

  /**
   * Name of the item
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * Alternate name of the item
   */
  public java.lang.String getAlternateName() {
    return genClient.cacheGet(CacheKey.alternateName);
  }

  /**
   * Product code, e.g. UPC or EAN
   */
  public java.lang.String getCode() {
    return genClient.cacheGet(CacheKey.code);
  }

  /**
   * SKU of the item
   */
  public java.lang.String getSku() {
    return genClient.cacheGet(CacheKey.sku);
  }

  /**
   * Price of the item, typically in cents; use priceType and merchant currency to determine actual item price. For non-VAT merchants, this field is exclusive of tax. For VAT merchants, this field is inclusive of tax.
   */
  public java.lang.Long getPrice() {
    return genClient.cacheGet(CacheKey.price);
  }

  public com.clover.sdk.v3.inventory.PriceType getPriceType() {
    return genClient.cacheGet(CacheKey.priceType);
  }

  /**
   * Flag to indicate whether or not to use default tax rates
   */
  public java.lang.Boolean getDefaultTaxRates() {
    return genClient.cacheGet(CacheKey.defaultTaxRates);
  }

  /**
   * Unit name, e.g. oz, lb
   */
  public java.lang.String getUnitName() {
    return genClient.cacheGet(CacheKey.unitName);
  }

  /**
   * Cost of the item to merchant, as opposed to customer price
   */
  public java.lang.Long getCost() {
    return genClient.cacheGet(CacheKey.cost);
  }

  /**
   * True if this item should be counted as revenue, for example gift cards and donations would not
   */
  public java.lang.Boolean getIsRevenue() {
    return genClient.cacheGet(CacheKey.isRevenue);
  }

  /**
   * DEPRECATED: use itemStock instead
   */
  public java.lang.Long getStockCount() {
    return genClient.cacheGet(CacheKey.stockCount);
  }

  public java.util.List<com.clover.sdk.v3.inventory.TaxRate> getTaxRates() {
    return genClient.cacheGet(CacheKey.taxRates);
  }

  public java.util.List<com.clover.sdk.v3.inventory.ModifierGroup> getModifierGroups() {
    return genClient.cacheGet(CacheKey.modifierGroups);
  }

  /**
   * Categories associated with this item
   */
  public java.util.List<com.clover.sdk.v3.inventory.Category> getCategories() {
    return genClient.cacheGet(CacheKey.categories);
  }

  /**
   * Tags associated with this item
   */
  public java.util.List<com.clover.sdk.v3.inventory.Tag> getTags() {
    return genClient.cacheGet(CacheKey.tags);
  }

  /**
   * Item stock attribute that can be expanded to show stock quantity
   */
  public com.clover.sdk.v3.inventory.ItemStock getItemStock() {
    return genClient.cacheGet(CacheKey.itemStock);
  }

  public java.lang.Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }

  /**
   * Timestamp when item was last deleted
   */
  public java.lang.Long getDeletedTime() {
    return genClient.cacheGet(CacheKey.deletedTime);
  }

  /**
   * The price without value-added tax (VAT). For non-VAT merchants, this field is ignored. For VAT merchants, this field is the base price of an item.
   */
  public java.lang.Long getPriceWithoutVat() {
    return genClient.cacheGet(CacheKey.priceWithoutVat);
  }



  public static final String AUTHORITY = "com.clover.inventory";

  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Item> {
    id {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    hidden {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("hidden", java.lang.Boolean.class);
      }
    },
    itemGroup {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractRecord("itemGroup", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    options {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractListRecord("options", com.clover.sdk.v3.inventory.Option.JSON_CREATOR);
      }
    },
    name {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    alternateName {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("alternateName", java.lang.String.class);
      }
    },
    code {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("code", java.lang.String.class);
      }
    },
    sku {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("sku", java.lang.String.class);
      }
    },
    price {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("price", java.lang.Long.class);
      }
    },
    priceType {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractEnum("priceType", com.clover.sdk.v3.inventory.PriceType.class);
      }
    },
    defaultTaxRates {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("defaultTaxRates", java.lang.Boolean.class);
      }
    },
    unitName {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("unitName", java.lang.String.class);
      }
    },
    cost {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("cost", java.lang.Long.class);
      }
    },
    isRevenue {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("isRevenue", java.lang.Boolean.class);
      }
    },
    stockCount {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("stockCount", java.lang.Long.class);
      }
    },
    taxRates {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractListRecord("taxRates", com.clover.sdk.v3.inventory.TaxRate.JSON_CREATOR);
      }
    },
    modifierGroups {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractListRecord("modifierGroups", com.clover.sdk.v3.inventory.ModifierGroup.JSON_CREATOR);
      }
    },
    categories {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractListRecord("categories", com.clover.sdk.v3.inventory.Category.JSON_CREATOR);
      }
    },
    tags {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractListRecord("tags", com.clover.sdk.v3.inventory.Tag.JSON_CREATOR);
      }
    },
    itemStock {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractRecord("itemStock", com.clover.sdk.v3.inventory.ItemStock.JSON_CREATOR);
      }
    },
    modifiedTime {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("modifiedTime", java.lang.Long.class);
      }
    },
    deletedTime {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("deletedTime", java.lang.Long.class);
      }
    },
    priceWithoutVat {
      @Override
      public Object extractValue(Item instance) {
        return instance.genClient.extractOther("priceWithoutVat", java.lang.Long.class);
      }
    },
      ;
  }

  private GenericClient<Item> genClient;

  /**
   * Constructs a new empty instance.
   */
  public Item() {
    genClient = new GenericClient<Item>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected Item(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Item(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Item(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Item(Item src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    genClient.validateNull(getName(), "name");
    genClient.validateLength(getName(), 127);

    genClient.validateLength(getAlternateName(), 127);

    genClient.validateLength(getCode(), 100);

    genClient.validateLength(getSku(), 100);

    genClient.validateNull(getPrice(), "price");
    if (getPrice() != null && ( getPrice() < 0)) throw new IllegalArgumentException("Invalid value for 'getPrice()'");

    genClient.validateLength(getUnitName(), 64);

    if (getCost() != null && ( getCost() < 0)) throw new IllegalArgumentException("Invalid value for 'getCost()'");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'hidden' field is set and is not null */
  public boolean isNotNullHidden() {
    return genClient.cacheValueIsNotNull(CacheKey.hidden);
  }

  /** Checks whether the 'itemGroup' field is set and is not null */
  public boolean isNotNullItemGroup() {
    return genClient.cacheValueIsNotNull(CacheKey.itemGroup);
  }

  /** Checks whether the 'options' field is set and is not null */
  public boolean isNotNullOptions() {
    return genClient.cacheValueIsNotNull(CacheKey.options);
  }

  /** Checks whether the 'options' field is set and is not null and is not empty */
  public boolean isNotEmptyOptions() { return isNotNullOptions() && !getOptions().isEmpty(); }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'alternateName' field is set and is not null */
  public boolean isNotNullAlternateName() {
    return genClient.cacheValueIsNotNull(CacheKey.alternateName);
  }

  /** Checks whether the 'code' field is set and is not null */
  public boolean isNotNullCode() {
    return genClient.cacheValueIsNotNull(CacheKey.code);
  }

  /** Checks whether the 'sku' field is set and is not null */
  public boolean isNotNullSku() {
    return genClient.cacheValueIsNotNull(CacheKey.sku);
  }

  /** Checks whether the 'price' field is set and is not null */
  public boolean isNotNullPrice() {
    return genClient.cacheValueIsNotNull(CacheKey.price);
  }

  /** Checks whether the 'priceType' field is set and is not null */
  public boolean isNotNullPriceType() {
    return genClient.cacheValueIsNotNull(CacheKey.priceType);
  }

  /** Checks whether the 'defaultTaxRates' field is set and is not null */
  public boolean isNotNullDefaultTaxRates() {
    return genClient.cacheValueIsNotNull(CacheKey.defaultTaxRates);
  }

  /** Checks whether the 'unitName' field is set and is not null */
  public boolean isNotNullUnitName() {
    return genClient.cacheValueIsNotNull(CacheKey.unitName);
  }

  /** Checks whether the 'cost' field is set and is not null */
  public boolean isNotNullCost() {
    return genClient.cacheValueIsNotNull(CacheKey.cost);
  }

  /** Checks whether the 'isRevenue' field is set and is not null */
  public boolean isNotNullIsRevenue() {
    return genClient.cacheValueIsNotNull(CacheKey.isRevenue);
  }

  /** Checks whether the 'stockCount' field is set and is not null */
  public boolean isNotNullStockCount() {
    return genClient.cacheValueIsNotNull(CacheKey.stockCount);
  }

  /** Checks whether the 'taxRates' field is set and is not null */
  public boolean isNotNullTaxRates() {
    return genClient.cacheValueIsNotNull(CacheKey.taxRates);
  }

  /** Checks whether the 'taxRates' field is set and is not null and is not empty */
  public boolean isNotEmptyTaxRates() { return isNotNullTaxRates() && !getTaxRates().isEmpty(); }

  /** Checks whether the 'modifierGroups' field is set and is not null */
  public boolean isNotNullModifierGroups() {
    return genClient.cacheValueIsNotNull(CacheKey.modifierGroups);
  }

  /** Checks whether the 'modifierGroups' field is set and is not null and is not empty */
  public boolean isNotEmptyModifierGroups() { return isNotNullModifierGroups() && !getModifierGroups().isEmpty(); }

  /** Checks whether the 'categories' field is set and is not null */
  public boolean isNotNullCategories() {
    return genClient.cacheValueIsNotNull(CacheKey.categories);
  }

  /** Checks whether the 'categories' field is set and is not null and is not empty */
  public boolean isNotEmptyCategories() { return isNotNullCategories() && !getCategories().isEmpty(); }

  /** Checks whether the 'tags' field is set and is not null */
  public boolean isNotNullTags() {
    return genClient.cacheValueIsNotNull(CacheKey.tags);
  }

  /** Checks whether the 'tags' field is set and is not null and is not empty */
  public boolean isNotEmptyTags() { return isNotNullTags() && !getTags().isEmpty(); }

  /** Checks whether the 'itemStock' field is set and is not null */
  public boolean isNotNullItemStock() {
    return genClient.cacheValueIsNotNull(CacheKey.itemStock);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }

  /** Checks whether the 'deletedTime' field is set and is not null */
  public boolean isNotNullDeletedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.deletedTime);
  }

  /** Checks whether the 'priceWithoutVat' field is set and is not null */
  public boolean isNotNullPriceWithoutVat() {
    return genClient.cacheValueIsNotNull(CacheKey.priceWithoutVat);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'hidden' field has been set, however the value could be null */
  public boolean hasHidden() {
    return genClient.cacheHasKey(CacheKey.hidden);
  }

  /** Checks whether the 'itemGroup' field has been set, however the value could be null */
  public boolean hasItemGroup() {
    return genClient.cacheHasKey(CacheKey.itemGroup);
  }

  /** Checks whether the 'options' field has been set, however the value could be null */
  public boolean hasOptions() {
    return genClient.cacheHasKey(CacheKey.options);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'alternateName' field has been set, however the value could be null */
  public boolean hasAlternateName() {
    return genClient.cacheHasKey(CacheKey.alternateName);
  }

  /** Checks whether the 'code' field has been set, however the value could be null */
  public boolean hasCode() {
    return genClient.cacheHasKey(CacheKey.code);
  }

  /** Checks whether the 'sku' field has been set, however the value could be null */
  public boolean hasSku() {
    return genClient.cacheHasKey(CacheKey.sku);
  }

  /** Checks whether the 'price' field has been set, however the value could be null */
  public boolean hasPrice() {
    return genClient.cacheHasKey(CacheKey.price);
  }

  /** Checks whether the 'priceType' field has been set, however the value could be null */
  public boolean hasPriceType() {
    return genClient.cacheHasKey(CacheKey.priceType);
  }

  /** Checks whether the 'defaultTaxRates' field has been set, however the value could be null */
  public boolean hasDefaultTaxRates() {
    return genClient.cacheHasKey(CacheKey.defaultTaxRates);
  }

  /** Checks whether the 'unitName' field has been set, however the value could be null */
  public boolean hasUnitName() {
    return genClient.cacheHasKey(CacheKey.unitName);
  }

  /** Checks whether the 'cost' field has been set, however the value could be null */
  public boolean hasCost() {
    return genClient.cacheHasKey(CacheKey.cost);
  }

  /** Checks whether the 'isRevenue' field has been set, however the value could be null */
  public boolean hasIsRevenue() {
    return genClient.cacheHasKey(CacheKey.isRevenue);
  }

  /** Checks whether the 'stockCount' field has been set, however the value could be null */
  public boolean hasStockCount() {
    return genClient.cacheHasKey(CacheKey.stockCount);
  }

  /** Checks whether the 'taxRates' field has been set, however the value could be null */
  public boolean hasTaxRates() {
    return genClient.cacheHasKey(CacheKey.taxRates);
  }

  /** Checks whether the 'modifierGroups' field has been set, however the value could be null */
  public boolean hasModifierGroups() {
    return genClient.cacheHasKey(CacheKey.modifierGroups);
  }

  /** Checks whether the 'categories' field has been set, however the value could be null */
  public boolean hasCategories() {
    return genClient.cacheHasKey(CacheKey.categories);
  }

  /** Checks whether the 'tags' field has been set, however the value could be null */
  public boolean hasTags() {
    return genClient.cacheHasKey(CacheKey.tags);
  }

  /** Checks whether the 'itemStock' field has been set, however the value could be null */
  public boolean hasItemStock() {
    return genClient.cacheHasKey(CacheKey.itemStock);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }

  /** Checks whether the 'deletedTime' field has been set, however the value could be null */
  public boolean hasDeletedTime() {
    return genClient.cacheHasKey(CacheKey.deletedTime);
  }

  /** Checks whether the 'priceWithoutVat' field has been set, however the value could be null */
  public boolean hasPriceWithoutVat() {
    return genClient.cacheHasKey(CacheKey.priceWithoutVat);
  }


  /**
   * Sets the field 'id'.
   */
  public Item setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'hidden'.
   */
  public Item setHidden(java.lang.Boolean hidden) {
    return genClient.setOther(hidden, CacheKey.hidden);
  }

  /**
   * Sets the field 'itemGroup'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Item setItemGroup(com.clover.sdk.v3.base.Reference itemGroup) {
    return genClient.setRecord(itemGroup, CacheKey.itemGroup);
  }

  /**
   * Sets the field 'options'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Item setOptions(java.util.List<com.clover.sdk.v3.inventory.Option> options) {
    return genClient.setArrayRecord(options, CacheKey.options);
  }

  /**
   * Sets the field 'name'.
   */
  public Item setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'alternateName'.
   */
  public Item setAlternateName(java.lang.String alternateName) {
    return genClient.setOther(alternateName, CacheKey.alternateName);
  }

  /**
   * Sets the field 'code'.
   */
  public Item setCode(java.lang.String code) {
    return genClient.setOther(code, CacheKey.code);
  }

  /**
   * Sets the field 'sku'.
   */
  public Item setSku(java.lang.String sku) {
    return genClient.setOther(sku, CacheKey.sku);
  }

  /**
   * Sets the field 'price'.
   */
  public Item setPrice(java.lang.Long price) {
    return genClient.setOther(price, CacheKey.price);
  }

  /**
   * Sets the field 'priceType'.
   */
  public Item setPriceType(com.clover.sdk.v3.inventory.PriceType priceType) {
    return genClient.setOther(priceType, CacheKey.priceType);
  }

  /**
   * Sets the field 'defaultTaxRates'.
   */
  public Item setDefaultTaxRates(java.lang.Boolean defaultTaxRates) {
    return genClient.setOther(defaultTaxRates, CacheKey.defaultTaxRates);
  }

  /**
   * Sets the field 'unitName'.
   */
  public Item setUnitName(java.lang.String unitName) {
    return genClient.setOther(unitName, CacheKey.unitName);
  }

  /**
   * Sets the field 'cost'.
   */
  public Item setCost(java.lang.Long cost) {
    return genClient.setOther(cost, CacheKey.cost);
  }

  /**
   * Sets the field 'isRevenue'.
   */
  public Item setIsRevenue(java.lang.Boolean isRevenue) {
    return genClient.setOther(isRevenue, CacheKey.isRevenue);
  }

  /**
   * Sets the field 'stockCount'.
   */
  public Item setStockCount(java.lang.Long stockCount) {
    return genClient.setOther(stockCount, CacheKey.stockCount);
  }

  /**
   * Sets the field 'taxRates'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Item setTaxRates(java.util.List<com.clover.sdk.v3.inventory.TaxRate> taxRates) {
    return genClient.setArrayRecord(taxRates, CacheKey.taxRates);
  }

  /**
   * Sets the field 'modifierGroups'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Item setModifierGroups(java.util.List<com.clover.sdk.v3.inventory.ModifierGroup> modifierGroups) {
    return genClient.setArrayRecord(modifierGroups, CacheKey.modifierGroups);
  }

  /**
   * Sets the field 'categories'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Item setCategories(java.util.List<com.clover.sdk.v3.inventory.Category> categories) {
    return genClient.setArrayRecord(categories, CacheKey.categories);
  }

  /**
   * Sets the field 'tags'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Item setTags(java.util.List<com.clover.sdk.v3.inventory.Tag> tags) {
    return genClient.setArrayRecord(tags, CacheKey.tags);
  }

  /**
   * Sets the field 'itemStock'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Item setItemStock(com.clover.sdk.v3.inventory.ItemStock itemStock) {
    return genClient.setRecord(itemStock, CacheKey.itemStock);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public Item setModifiedTime(java.lang.Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }

  /**
   * Sets the field 'deletedTime'.
   */
  public Item setDeletedTime(java.lang.Long deletedTime) {
    return genClient.setOther(deletedTime, CacheKey.deletedTime);
  }

  /**
   * Sets the field 'priceWithoutVat'.
   */
  public Item setPriceWithoutVat(java.lang.Long priceWithoutVat) {
    return genClient.setOther(priceWithoutVat, CacheKey.priceWithoutVat);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'hidden' field, the 'has' method for this field will now return false */
  public void clearHidden() {
    genClient.clear(CacheKey.hidden);
  }
  /** Clears the 'itemGroup' field, the 'has' method for this field will now return false */
  public void clearItemGroup() {
    genClient.clear(CacheKey.itemGroup);
  }
  /** Clears the 'options' field, the 'has' method for this field will now return false */
  public void clearOptions() {
    genClient.clear(CacheKey.options);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'alternateName' field, the 'has' method for this field will now return false */
  public void clearAlternateName() {
    genClient.clear(CacheKey.alternateName);
  }
  /** Clears the 'code' field, the 'has' method for this field will now return false */
  public void clearCode() {
    genClient.clear(CacheKey.code);
  }
  /** Clears the 'sku' field, the 'has' method for this field will now return false */
  public void clearSku() {
    genClient.clear(CacheKey.sku);
  }
  /** Clears the 'price' field, the 'has' method for this field will now return false */
  public void clearPrice() {
    genClient.clear(CacheKey.price);
  }
  /** Clears the 'priceType' field, the 'has' method for this field will now return false */
  public void clearPriceType() {
    genClient.clear(CacheKey.priceType);
  }
  /** Clears the 'defaultTaxRates' field, the 'has' method for this field will now return false */
  public void clearDefaultTaxRates() {
    genClient.clear(CacheKey.defaultTaxRates);
  }
  /** Clears the 'unitName' field, the 'has' method for this field will now return false */
  public void clearUnitName() {
    genClient.clear(CacheKey.unitName);
  }
  /** Clears the 'cost' field, the 'has' method for this field will now return false */
  public void clearCost() {
    genClient.clear(CacheKey.cost);
  }
  /** Clears the 'isRevenue' field, the 'has' method for this field will now return false */
  public void clearIsRevenue() {
    genClient.clear(CacheKey.isRevenue);
  }
  /** Clears the 'stockCount' field, the 'has' method for this field will now return false */
  public void clearStockCount() {
    genClient.clear(CacheKey.stockCount);
  }
  /** Clears the 'taxRates' field, the 'has' method for this field will now return false */
  public void clearTaxRates() {
    genClient.clear(CacheKey.taxRates);
  }
  /** Clears the 'modifierGroups' field, the 'has' method for this field will now return false */
  public void clearModifierGroups() {
    genClient.clear(CacheKey.modifierGroups);
  }
  /** Clears the 'categories' field, the 'has' method for this field will now return false */
  public void clearCategories() {
    genClient.clear(CacheKey.categories);
  }
  /** Clears the 'tags' field, the 'has' method for this field will now return false */
  public void clearTags() {
    genClient.clear(CacheKey.tags);
  }
  /** Clears the 'itemStock' field, the 'has' method for this field will now return false */
  public void clearItemStock() {
    genClient.clear(CacheKey.itemStock);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
  }
  /** Clears the 'deletedTime' field, the 'has' method for this field will now return false */
  public void clearDeletedTime() {
    genClient.clear(CacheKey.deletedTime);
  }
  /** Clears the 'priceWithoutVat' field, the 'has' method for this field will now return false */
  public void clearPriceWithoutVat() {
    genClient.clear(CacheKey.priceWithoutVat);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public Item copyChanges() {
    Item copy = new Item();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Item src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Item(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<Item> CREATOR = new android.os.Parcelable.Creator<Item>() {
    @Override
    public Item createFromParcel(android.os.Parcel in) {
      Item instance = new Item(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Item[] newArray(int size) {
      return new Item[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Item> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Item>() {
    @Override
    public Item create(org.json.JSONObject jsonObject) {
      return new Item(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean HIDDEN_IS_REQUIRED = false;
    public static final boolean ITEMGROUP_IS_REQUIRED = false;
    public static final boolean OPTIONS_IS_REQUIRED = false;
    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 127;
    public static final boolean ALTERNATENAME_IS_REQUIRED = false;
    public static final long ALTERNATENAME_MAX_LEN = 127;
    public static final boolean CODE_IS_REQUIRED = false;
    public static final long CODE_MAX_LEN = 100;
    public static final boolean SKU_IS_REQUIRED = false;
    public static final long SKU_MAX_LEN = 100;
    public static final boolean PRICE_IS_REQUIRED = true;
    public static final long PRICE_MIN = 0;
    public static final boolean PRICETYPE_IS_REQUIRED = false;
    public static final boolean DEFAULTTAXRATES_IS_REQUIRED = false;
    public static final boolean UNITNAME_IS_REQUIRED = false;
    public static final long UNITNAME_MAX_LEN = 64;
    public static final boolean COST_IS_REQUIRED = false;
    public static final long COST_MIN = 0;
    public static final boolean ISREVENUE_IS_REQUIRED = false;
    public static final boolean STOCKCOUNT_IS_REQUIRED = false;
    public static final boolean TAXRATES_IS_REQUIRED = false;
    public static final boolean MODIFIERGROUPS_IS_REQUIRED = false;
    public static final boolean CATEGORIES_IS_REQUIRED = false;
    public static final boolean TAGS_IS_REQUIRED = false;
    public static final boolean ITEMSTOCK_IS_REQUIRED = false;
    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;
    public static final boolean DELETEDTIME_IS_REQUIRED = false;
    public static final boolean PRICEWITHOUTVAT_IS_REQUIRED = false;

  }

}
