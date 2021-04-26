/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class TraverseSpec implements TBase, java.io.Serializable, Cloneable, Comparable<TraverseSpec> {
  private static final TStruct STRUCT_DESC = new TStruct("TraverseSpec");
  private static final TField EDGE_TYPES_FIELD_DESC = new TField("edge_types", TType.LIST, (short)1);
  private static final TField EDGE_DIRECTION_FIELD_DESC = new TField("edge_direction", TType.I32, (short)2);
  private static final TField DEDUP_FIELD_DESC = new TField("dedup", TType.BOOL, (short)3);
  private static final TField STAT_PROPS_FIELD_DESC = new TField("stat_props", TType.LIST, (short)4);
  private static final TField VERTEX_PROPS_FIELD_DESC = new TField("vertex_props", TType.LIST, (short)5);
  private static final TField EDGE_PROPS_FIELD_DESC = new TField("edge_props", TType.LIST, (short)6);
  private static final TField EXPRESSIONS_FIELD_DESC = new TField("expressions", TType.LIST, (short)7);
  private static final TField ORDER_BY_FIELD_DESC = new TField("order_by", TType.LIST, (short)8);
  private static final TField RANDOM_FIELD_DESC = new TField("random", TType.BOOL, (short)9);
  private static final TField LIMIT_FIELD_DESC = new TField("limit", TType.I64, (short)10);
  private static final TField FILTER_FIELD_DESC = new TField("filter", TType.STRING, (short)11);

  public List<Integer> edge_types;
  /**
   * 
   * @see EdgeDirection
   */
  public EdgeDirection edge_direction;
  public boolean dedup;
  public List<StatProp> stat_props;
  public List<VertexProp> vertex_props;
  public List<EdgeProp> edge_props;
  public List<Expr> expressions;
  public List<OrderBy> order_by;
  public boolean random;
  public long limit;
  public byte[] filter;
  public static final int EDGE_TYPES = 1;
  public static final int EDGE_DIRECTION = 2;
  public static final int DEDUP = 3;
  public static final int STAT_PROPS = 4;
  public static final int VERTEX_PROPS = 5;
  public static final int EDGE_PROPS = 6;
  public static final int EXPRESSIONS = 7;
  public static final int ORDER_BY = 8;
  public static final int RANDOM = 9;
  public static final int LIMIT = 10;
  public static final int FILTER = 11;

  // isset id assignments
  private static final int __DEDUP_ISSET_ID = 0;
  private static final int __RANDOM_ISSET_ID = 1;
  private static final int __LIMIT_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(EDGE_TYPES, new FieldMetaData("edge_types", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(EDGE_DIRECTION, new FieldMetaData("edge_direction", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(DEDUP, new FieldMetaData("dedup", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(STAT_PROPS, new FieldMetaData("stat_props", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, StatProp.class))));
    tmpMetaDataMap.put(VERTEX_PROPS, new FieldMetaData("vertex_props", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, VertexProp.class))));
    tmpMetaDataMap.put(EDGE_PROPS, new FieldMetaData("edge_props", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, EdgeProp.class))));
    tmpMetaDataMap.put(EXPRESSIONS, new FieldMetaData("expressions", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Expr.class))));
    tmpMetaDataMap.put(ORDER_BY, new FieldMetaData("order_by", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, OrderBy.class))));
    tmpMetaDataMap.put(RANDOM, new FieldMetaData("random", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(LIMIT, new FieldMetaData("limit", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(FILTER, new FieldMetaData("filter", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(TraverseSpec.class, metaDataMap);
  }

  public TraverseSpec() {
    this.edge_direction = com.vesoft.nebula.storage.EdgeDirection.BOTH;

    this.dedup = false;

  }

  public TraverseSpec(
      List<Integer> edge_types,
      EdgeDirection edge_direction,
      boolean dedup) {
    this();
    this.edge_types = edge_types;
    this.edge_direction = edge_direction;
    this.dedup = dedup;
    setDedupIsSet(true);
  }

  public TraverseSpec(
      List<Integer> edge_types,
      EdgeDirection edge_direction,
      boolean dedup,
      List<StatProp> stat_props,
      List<VertexProp> vertex_props,
      List<EdgeProp> edge_props,
      List<Expr> expressions,
      List<OrderBy> order_by,
      boolean random,
      long limit,
      byte[] filter) {
    this();
    this.edge_types = edge_types;
    this.edge_direction = edge_direction;
    this.dedup = dedup;
    setDedupIsSet(true);
    this.stat_props = stat_props;
    this.vertex_props = vertex_props;
    this.edge_props = edge_props;
    this.expressions = expressions;
    this.order_by = order_by;
    this.random = random;
    setRandomIsSet(true);
    this.limit = limit;
    setLimitIsSet(true);
    this.filter = filter;
  }

  public static class Builder {
    private List<Integer> edge_types;
    private EdgeDirection edge_direction;
    private boolean dedup;
    private List<StatProp> stat_props;
    private List<VertexProp> vertex_props;
    private List<EdgeProp> edge_props;
    private List<Expr> expressions;
    private List<OrderBy> order_by;
    private boolean random;
    private long limit;
    private byte[] filter;

    BitSet __optional_isset = new BitSet(3);

    public Builder() {
    }

    public Builder setEdge_types(final List<Integer> edge_types) {
      this.edge_types = edge_types;
      return this;
    }

    public Builder setEdge_direction(final EdgeDirection edge_direction) {
      this.edge_direction = edge_direction;
      return this;
    }

    public Builder setDedup(final boolean dedup) {
      this.dedup = dedup;
      __optional_isset.set(__DEDUP_ISSET_ID, true);
      return this;
    }

    public Builder setStat_props(final List<StatProp> stat_props) {
      this.stat_props = stat_props;
      return this;
    }

    public Builder setVertex_props(final List<VertexProp> vertex_props) {
      this.vertex_props = vertex_props;
      return this;
    }

    public Builder setEdge_props(final List<EdgeProp> edge_props) {
      this.edge_props = edge_props;
      return this;
    }

    public Builder setExpressions(final List<Expr> expressions) {
      this.expressions = expressions;
      return this;
    }

    public Builder setOrder_by(final List<OrderBy> order_by) {
      this.order_by = order_by;
      return this;
    }

    public Builder setRandom(final boolean random) {
      this.random = random;
      __optional_isset.set(__RANDOM_ISSET_ID, true);
      return this;
    }

    public Builder setLimit(final long limit) {
      this.limit = limit;
      __optional_isset.set(__LIMIT_ISSET_ID, true);
      return this;
    }

    public Builder setFilter(final byte[] filter) {
      this.filter = filter;
      return this;
    }

    public TraverseSpec build() {
      TraverseSpec result = new TraverseSpec();
      result.setEdge_types(this.edge_types);
      result.setEdge_direction(this.edge_direction);
      if (__optional_isset.get(__DEDUP_ISSET_ID)) {
        result.setDedup(this.dedup);
      }
      result.setStat_props(this.stat_props);
      result.setVertex_props(this.vertex_props);
      result.setEdge_props(this.edge_props);
      result.setExpressions(this.expressions);
      result.setOrder_by(this.order_by);
      if (__optional_isset.get(__RANDOM_ISSET_ID)) {
        result.setRandom(this.random);
      }
      if (__optional_isset.get(__LIMIT_ISSET_ID)) {
        result.setLimit(this.limit);
      }
      result.setFilter(this.filter);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TraverseSpec(TraverseSpec other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetEdge_types()) {
      this.edge_types = TBaseHelper.deepCopy(other.edge_types);
    }
    if (other.isSetEdge_direction()) {
      this.edge_direction = TBaseHelper.deepCopy(other.edge_direction);
    }
    this.dedup = TBaseHelper.deepCopy(other.dedup);
    if (other.isSetStat_props()) {
      this.stat_props = TBaseHelper.deepCopy(other.stat_props);
    }
    if (other.isSetVertex_props()) {
      this.vertex_props = TBaseHelper.deepCopy(other.vertex_props);
    }
    if (other.isSetEdge_props()) {
      this.edge_props = TBaseHelper.deepCopy(other.edge_props);
    }
    if (other.isSetExpressions()) {
      this.expressions = TBaseHelper.deepCopy(other.expressions);
    }
    if (other.isSetOrder_by()) {
      this.order_by = TBaseHelper.deepCopy(other.order_by);
    }
    this.random = TBaseHelper.deepCopy(other.random);
    this.limit = TBaseHelper.deepCopy(other.limit);
    if (other.isSetFilter()) {
      this.filter = TBaseHelper.deepCopy(other.filter);
    }
  }

  public TraverseSpec deepCopy() {
    return new TraverseSpec(this);
  }

  public List<Integer> getEdge_types() {
    return this.edge_types;
  }

  public TraverseSpec setEdge_types(List<Integer> edge_types) {
    this.edge_types = edge_types;
    return this;
  }

  public void unsetEdge_types() {
    this.edge_types = null;
  }

  // Returns true if field edge_types is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_types() {
    return this.edge_types != null;
  }

  public void setEdge_typesIsSet(boolean __value) {
    if (!__value) {
      this.edge_types = null;
    }
  }

  /**
   * 
   * @see EdgeDirection
   */
  public EdgeDirection getEdge_direction() {
    return this.edge_direction;
  }

  /**
   * 
   * @see EdgeDirection
   */
  public TraverseSpec setEdge_direction(EdgeDirection edge_direction) {
    this.edge_direction = edge_direction;
    return this;
  }

  public void unsetEdge_direction() {
    this.edge_direction = null;
  }

  // Returns true if field edge_direction is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_direction() {
    return this.edge_direction != null;
  }

  public void setEdge_directionIsSet(boolean __value) {
    if (!__value) {
      this.edge_direction = null;
    }
  }

  public boolean isDedup() {
    return this.dedup;
  }

  public TraverseSpec setDedup(boolean dedup) {
    this.dedup = dedup;
    setDedupIsSet(true);
    return this;
  }

  public void unsetDedup() {
    __isset_bit_vector.clear(__DEDUP_ISSET_ID);
  }

  // Returns true if field dedup is set (has been assigned a value) and false otherwise
  public boolean isSetDedup() {
    return __isset_bit_vector.get(__DEDUP_ISSET_ID);
  }

  public void setDedupIsSet(boolean __value) {
    __isset_bit_vector.set(__DEDUP_ISSET_ID, __value);
  }

  public List<StatProp> getStat_props() {
    return this.stat_props;
  }

  public TraverseSpec setStat_props(List<StatProp> stat_props) {
    this.stat_props = stat_props;
    return this;
  }

  public void unsetStat_props() {
    this.stat_props = null;
  }

  // Returns true if field stat_props is set (has been assigned a value) and false otherwise
  public boolean isSetStat_props() {
    return this.stat_props != null;
  }

  public void setStat_propsIsSet(boolean __value) {
    if (!__value) {
      this.stat_props = null;
    }
  }

  public List<VertexProp> getVertex_props() {
    return this.vertex_props;
  }

  public TraverseSpec setVertex_props(List<VertexProp> vertex_props) {
    this.vertex_props = vertex_props;
    return this;
  }

  public void unsetVertex_props() {
    this.vertex_props = null;
  }

  // Returns true if field vertex_props is set (has been assigned a value) and false otherwise
  public boolean isSetVertex_props() {
    return this.vertex_props != null;
  }

  public void setVertex_propsIsSet(boolean __value) {
    if (!__value) {
      this.vertex_props = null;
    }
  }

  public List<EdgeProp> getEdge_props() {
    return this.edge_props;
  }

  public TraverseSpec setEdge_props(List<EdgeProp> edge_props) {
    this.edge_props = edge_props;
    return this;
  }

  public void unsetEdge_props() {
    this.edge_props = null;
  }

  // Returns true if field edge_props is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_props() {
    return this.edge_props != null;
  }

  public void setEdge_propsIsSet(boolean __value) {
    if (!__value) {
      this.edge_props = null;
    }
  }

  public List<Expr> getExpressions() {
    return this.expressions;
  }

  public TraverseSpec setExpressions(List<Expr> expressions) {
    this.expressions = expressions;
    return this;
  }

  public void unsetExpressions() {
    this.expressions = null;
  }

  // Returns true if field expressions is set (has been assigned a value) and false otherwise
  public boolean isSetExpressions() {
    return this.expressions != null;
  }

  public void setExpressionsIsSet(boolean __value) {
    if (!__value) {
      this.expressions = null;
    }
  }

  public List<OrderBy> getOrder_by() {
    return this.order_by;
  }

  public TraverseSpec setOrder_by(List<OrderBy> order_by) {
    this.order_by = order_by;
    return this;
  }

  public void unsetOrder_by() {
    this.order_by = null;
  }

  // Returns true if field order_by is set (has been assigned a value) and false otherwise
  public boolean isSetOrder_by() {
    return this.order_by != null;
  }

  public void setOrder_byIsSet(boolean __value) {
    if (!__value) {
      this.order_by = null;
    }
  }

  public boolean isRandom() {
    return this.random;
  }

  public TraverseSpec setRandom(boolean random) {
    this.random = random;
    setRandomIsSet(true);
    return this;
  }

  public void unsetRandom() {
    __isset_bit_vector.clear(__RANDOM_ISSET_ID);
  }

  // Returns true if field random is set (has been assigned a value) and false otherwise
  public boolean isSetRandom() {
    return __isset_bit_vector.get(__RANDOM_ISSET_ID);
  }

  public void setRandomIsSet(boolean __value) {
    __isset_bit_vector.set(__RANDOM_ISSET_ID, __value);
  }

  public long getLimit() {
    return this.limit;
  }

  public TraverseSpec setLimit(long limit) {
    this.limit = limit;
    setLimitIsSet(true);
    return this;
  }

  public void unsetLimit() {
    __isset_bit_vector.clear(__LIMIT_ISSET_ID);
  }

  // Returns true if field limit is set (has been assigned a value) and false otherwise
  public boolean isSetLimit() {
    return __isset_bit_vector.get(__LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean __value) {
    __isset_bit_vector.set(__LIMIT_ISSET_ID, __value);
  }

  public byte[] getFilter() {
    return this.filter;
  }

  public TraverseSpec setFilter(byte[] filter) {
    this.filter = filter;
    return this;
  }

  public void unsetFilter() {
    this.filter = null;
  }

  // Returns true if field filter is set (has been assigned a value) and false otherwise
  public boolean isSetFilter() {
    return this.filter != null;
  }

  public void setFilterIsSet(boolean __value) {
    if (!__value) {
      this.filter = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case EDGE_TYPES:
      if (__value == null) {
        unsetEdge_types();
      } else {
        setEdge_types((List<Integer>)__value);
      }
      break;

    case EDGE_DIRECTION:
      if (__value == null) {
        unsetEdge_direction();
      } else {
        setEdge_direction((EdgeDirection)__value);
      }
      break;

    case DEDUP:
      if (__value == null) {
        unsetDedup();
      } else {
        setDedup((Boolean)__value);
      }
      break;

    case STAT_PROPS:
      if (__value == null) {
        unsetStat_props();
      } else {
        setStat_props((List<StatProp>)__value);
      }
      break;

    case VERTEX_PROPS:
      if (__value == null) {
        unsetVertex_props();
      } else {
        setVertex_props((List<VertexProp>)__value);
      }
      break;

    case EDGE_PROPS:
      if (__value == null) {
        unsetEdge_props();
      } else {
        setEdge_props((List<EdgeProp>)__value);
      }
      break;

    case EXPRESSIONS:
      if (__value == null) {
        unsetExpressions();
      } else {
        setExpressions((List<Expr>)__value);
      }
      break;

    case ORDER_BY:
      if (__value == null) {
        unsetOrder_by();
      } else {
        setOrder_by((List<OrderBy>)__value);
      }
      break;

    case RANDOM:
      if (__value == null) {
        unsetRandom();
      } else {
        setRandom((Boolean)__value);
      }
      break;

    case LIMIT:
      if (__value == null) {
        unsetLimit();
      } else {
        setLimit((Long)__value);
      }
      break;

    case FILTER:
      if (__value == null) {
        unsetFilter();
      } else {
        setFilter((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case EDGE_TYPES:
      return getEdge_types();

    case EDGE_DIRECTION:
      return getEdge_direction();

    case DEDUP:
      return new Boolean(isDedup());

    case STAT_PROPS:
      return getStat_props();

    case VERTEX_PROPS:
      return getVertex_props();

    case EDGE_PROPS:
      return getEdge_props();

    case EXPRESSIONS:
      return getExpressions();

    case ORDER_BY:
      return getOrder_by();

    case RANDOM:
      return new Boolean(isRandom());

    case LIMIT:
      return new Long(getLimit());

    case FILTER:
      return getFilter();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof TraverseSpec))
      return false;
    TraverseSpec that = (TraverseSpec)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetEdge_types(), that.isSetEdge_types(), this.edge_types, that.edge_types)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetEdge_direction(), that.isSetEdge_direction(), this.edge_direction, that.edge_direction)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.dedup, that.dedup)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStat_props(), that.isSetStat_props(), this.stat_props, that.stat_props)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetVertex_props(), that.isSetVertex_props(), this.vertex_props, that.vertex_props)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetEdge_props(), that.isSetEdge_props(), this.edge_props, that.edge_props)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetExpressions(), that.isSetExpressions(), this.expressions, that.expressions)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOrder_by(), that.isSetOrder_by(), this.order_by, that.order_by)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetRandom(), that.isSetRandom(), this.random, that.random)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetLimit(), that.isSetLimit(), this.limit, that.limit)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetFilter(), that.isSetFilter(), this.filter, that.filter)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {edge_types, edge_direction, dedup, stat_props, vertex_props, edge_props, expressions, order_by, random, limit, filter});
  }

  @Override
  public int compareTo(TraverseSpec other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEdge_types()).compareTo(other.isSetEdge_types());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(edge_types, other.edge_types);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetEdge_direction()).compareTo(other.isSetEdge_direction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(edge_direction, other.edge_direction);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDedup()).compareTo(other.isSetDedup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(dedup, other.dedup);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetStat_props()).compareTo(other.isSetStat_props());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(stat_props, other.stat_props);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetVertex_props()).compareTo(other.isSetVertex_props());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(vertex_props, other.vertex_props);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetEdge_props()).compareTo(other.isSetEdge_props());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(edge_props, other.edge_props);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetExpressions()).compareTo(other.isSetExpressions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(expressions, other.expressions);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOrder_by()).compareTo(other.isSetOrder_by());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(order_by, other.order_by);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRandom()).compareTo(other.isSetRandom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(random, other.random);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetLimit()).compareTo(other.isSetLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(limit, other.limit);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetFilter()).compareTo(other.isSetFilter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(filter, other.filter);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case EDGE_TYPES:
          if (__field.type == TType.LIST) {
            {
              TList _list12 = iprot.readListBegin();
              this.edge_types = new ArrayList<Integer>(Math.max(0, _list12.size));
              for (int _i13 = 0; 
                   (_list12.size < 0) ? iprot.peekList() : (_i13 < _list12.size); 
                   ++_i13)
              {
                int _elem14;
                _elem14 = iprot.readI32();
                this.edge_types.add(_elem14);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case EDGE_DIRECTION:
          if (__field.type == TType.I32) {
            this.edge_direction = EdgeDirection.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case DEDUP:
          if (__field.type == TType.BOOL) {
            this.dedup = iprot.readBool();
            setDedupIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STAT_PROPS:
          if (__field.type == TType.LIST) {
            {
              TList _list15 = iprot.readListBegin();
              this.stat_props = new ArrayList<StatProp>(Math.max(0, _list15.size));
              for (int _i16 = 0; 
                   (_list15.size < 0) ? iprot.peekList() : (_i16 < _list15.size); 
                   ++_i16)
              {
                StatProp _elem17;
                _elem17 = new StatProp();
                _elem17.read(iprot);
                this.stat_props.add(_elem17);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case VERTEX_PROPS:
          if (__field.type == TType.LIST) {
            {
              TList _list18 = iprot.readListBegin();
              this.vertex_props = new ArrayList<VertexProp>(Math.max(0, _list18.size));
              for (int _i19 = 0; 
                   (_list18.size < 0) ? iprot.peekList() : (_i19 < _list18.size); 
                   ++_i19)
              {
                VertexProp _elem20;
                _elem20 = new VertexProp();
                _elem20.read(iprot);
                this.vertex_props.add(_elem20);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case EDGE_PROPS:
          if (__field.type == TType.LIST) {
            {
              TList _list21 = iprot.readListBegin();
              this.edge_props = new ArrayList<EdgeProp>(Math.max(0, _list21.size));
              for (int _i22 = 0; 
                   (_list21.size < 0) ? iprot.peekList() : (_i22 < _list21.size); 
                   ++_i22)
              {
                EdgeProp _elem23;
                _elem23 = new EdgeProp();
                _elem23.read(iprot);
                this.edge_props.add(_elem23);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case EXPRESSIONS:
          if (__field.type == TType.LIST) {
            {
              TList _list24 = iprot.readListBegin();
              this.expressions = new ArrayList<Expr>(Math.max(0, _list24.size));
              for (int _i25 = 0; 
                   (_list24.size < 0) ? iprot.peekList() : (_i25 < _list24.size); 
                   ++_i25)
              {
                Expr _elem26;
                _elem26 = new Expr();
                _elem26.read(iprot);
                this.expressions.add(_elem26);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ORDER_BY:
          if (__field.type == TType.LIST) {
            {
              TList _list27 = iprot.readListBegin();
              this.order_by = new ArrayList<OrderBy>(Math.max(0, _list27.size));
              for (int _i28 = 0; 
                   (_list27.size < 0) ? iprot.peekList() : (_i28 < _list27.size); 
                   ++_i28)
              {
                OrderBy _elem29;
                _elem29 = new OrderBy();
                _elem29.read(iprot);
                this.order_by.add(_elem29);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case RANDOM:
          if (__field.type == TType.BOOL) {
            this.random = iprot.readBool();
            setRandomIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LIMIT:
          if (__field.type == TType.I64) {
            this.limit = iprot.readI64();
            setLimitIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case FILTER:
          if (__field.type == TType.STRING) {
            this.filter = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.edge_types != null) {
      oprot.writeFieldBegin(EDGE_TYPES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.edge_types.size()));
        for (int _iter30 : this.edge_types)        {
          oprot.writeI32(_iter30);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.edge_direction != null) {
      oprot.writeFieldBegin(EDGE_DIRECTION_FIELD_DESC);
      oprot.writeI32(this.edge_direction == null ? 0 : this.edge_direction.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(DEDUP_FIELD_DESC);
    oprot.writeBool(this.dedup);
    oprot.writeFieldEnd();
    if (this.stat_props != null) {
      if (isSetStat_props()) {
        oprot.writeFieldBegin(STAT_PROPS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.stat_props.size()));
          for (StatProp _iter31 : this.stat_props)          {
            _iter31.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.vertex_props != null) {
      if (isSetVertex_props()) {
        oprot.writeFieldBegin(VERTEX_PROPS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.vertex_props.size()));
          for (VertexProp _iter32 : this.vertex_props)          {
            _iter32.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.edge_props != null) {
      if (isSetEdge_props()) {
        oprot.writeFieldBegin(EDGE_PROPS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.edge_props.size()));
          for (EdgeProp _iter33 : this.edge_props)          {
            _iter33.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.expressions != null) {
      if (isSetExpressions()) {
        oprot.writeFieldBegin(EXPRESSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.expressions.size()));
          for (Expr _iter34 : this.expressions)          {
            _iter34.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.order_by != null) {
      if (isSetOrder_by()) {
        oprot.writeFieldBegin(ORDER_BY_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.order_by.size()));
          for (OrderBy _iter35 : this.order_by)          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (isSetRandom()) {
      oprot.writeFieldBegin(RANDOM_FIELD_DESC);
      oprot.writeBool(this.random);
      oprot.writeFieldEnd();
    }
    if (isSetLimit()) {
      oprot.writeFieldBegin(LIMIT_FIELD_DESC);
      oprot.writeI64(this.limit);
      oprot.writeFieldEnd();
    }
    if (this.filter != null) {
      if (isSetFilter()) {
        oprot.writeFieldBegin(FILTER_FIELD_DESC);
        oprot.writeBinary(this.filter);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("TraverseSpec");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("edge_types");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getEdge_types() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getEdge_types(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("edge_direction");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getEdge_direction() == null) {
      sb.append("null");
    } else {
      String edge_direction_name = this.getEdge_direction() == null ? "null" : this.getEdge_direction().name();
      if (edge_direction_name != null) {
        sb.append(edge_direction_name);
        sb.append(" (");
      }
      sb.append(this.getEdge_direction());
      if (edge_direction_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("dedup");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isDedup(), indent + 1, prettyPrint));
    first = false;
    if (isSetStat_props())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("stat_props");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getStat_props() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getStat_props(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetVertex_props())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("vertex_props");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getVertex_props() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getVertex_props(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetEdge_props())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("edge_props");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getEdge_props() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getEdge_props(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetExpressions())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("expressions");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getExpressions() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getExpressions(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetOrder_by())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("order_by");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getOrder_by() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getOrder_by(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetRandom())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("random");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.isRandom(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetLimit())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("limit");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.getLimit(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetFilter())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("filter");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getFilter() == null) {
        sb.append("null");
      } else {
          int __filter_size = Math.min(this.getFilter().length, 128);
          for (int i = 0; i < __filter_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this.getFilter()[i]).length() > 1 ? Integer.toHexString(this.getFilter()[i]).substring(Integer.toHexString(this.getFilter()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getFilter()[i]).toUpperCase());
          }
          if (this.getFilter().length > 128) sb.append(" ...");
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

