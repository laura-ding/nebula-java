/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

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
public class ListConfigsResp implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ListConfigsResp");
  private static final TField CODE_FIELD_DESC = new TField("code", TType.I32, (short)1);
  private static final TField LEADER_FIELD_DESC = new TField("leader", TType.STRUCT, (short)2);
  private static final TField ITEMS_FIELD_DESC = new TField("items", TType.LIST, (short)3);

  /**
   * 
   * @see ErrorCode
   */
  public ErrorCode code;
  public com.vesoft.nebula.HostAddr leader;
  public List<ConfigItem> items;
  public static final int CODE = 1;
  public static final int LEADER = 2;
  public static final int ITEMS = 3;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(CODE, new FieldMetaData("code", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(LEADER, new FieldMetaData("leader", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    tmpMetaDataMap.put(ITEMS, new FieldMetaData("items", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, ConfigItem.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ListConfigsResp.class, metaDataMap);
  }

  public ListConfigsResp() {
  }

  public ListConfigsResp(
      ErrorCode code,
      com.vesoft.nebula.HostAddr leader,
      List<ConfigItem> items) {
    this();
    this.code = code;
    this.leader = leader;
    this.items = items;
  }

  public static class Builder {
    private ErrorCode code;
    private com.vesoft.nebula.HostAddr leader;
    private List<ConfigItem> items;

    public Builder() {
    }

    public Builder setCode(final ErrorCode code) {
      this.code = code;
      return this;
    }

    public Builder setLeader(final com.vesoft.nebula.HostAddr leader) {
      this.leader = leader;
      return this;
    }

    public Builder setItems(final List<ConfigItem> items) {
      this.items = items;
      return this;
    }

    public ListConfigsResp build() {
      ListConfigsResp result = new ListConfigsResp();
      result.setCode(this.code);
      result.setLeader(this.leader);
      result.setItems(this.items);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListConfigsResp(ListConfigsResp other) {
    if (other.isSetCode()) {
      this.code = TBaseHelper.deepCopy(other.code);
    }
    if (other.isSetLeader()) {
      this.leader = TBaseHelper.deepCopy(other.leader);
    }
    if (other.isSetItems()) {
      this.items = TBaseHelper.deepCopy(other.items);
    }
  }

  public ListConfigsResp deepCopy() {
    return new ListConfigsResp(this);
  }

  /**
   * 
   * @see ErrorCode
   */
  public ErrorCode getCode() {
    return this.code;
  }

  /**
   * 
   * @see ErrorCode
   */
  public ListConfigsResp setCode(ErrorCode code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  // Returns true if field code is set (has been assigned a value) and false otherwise
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean __value) {
    if (!__value) {
      this.code = null;
    }
  }

  public com.vesoft.nebula.HostAddr getLeader() {
    return this.leader;
  }

  public ListConfigsResp setLeader(com.vesoft.nebula.HostAddr leader) {
    this.leader = leader;
    return this;
  }

  public void unsetLeader() {
    this.leader = null;
  }

  // Returns true if field leader is set (has been assigned a value) and false otherwise
  public boolean isSetLeader() {
    return this.leader != null;
  }

  public void setLeaderIsSet(boolean __value) {
    if (!__value) {
      this.leader = null;
    }
  }

  public List<ConfigItem> getItems() {
    return this.items;
  }

  public ListConfigsResp setItems(List<ConfigItem> items) {
    this.items = items;
    return this;
  }

  public void unsetItems() {
    this.items = null;
  }

  // Returns true if field items is set (has been assigned a value) and false otherwise
  public boolean isSetItems() {
    return this.items != null;
  }

  public void setItemsIsSet(boolean __value) {
    if (!__value) {
      this.items = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case CODE:
      if (__value == null) {
        unsetCode();
      } else {
        setCode((ErrorCode)__value);
      }
      break;

    case LEADER:
      if (__value == null) {
        unsetLeader();
      } else {
        setLeader((com.vesoft.nebula.HostAddr)__value);
      }
      break;

    case ITEMS:
      if (__value == null) {
        unsetItems();
      } else {
        setItems((List<ConfigItem>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case CODE:
      return getCode();

    case LEADER:
      return getLeader();

    case ITEMS:
      return getItems();

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
    if (!(_that instanceof ListConfigsResp))
      return false;
    ListConfigsResp that = (ListConfigsResp)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetCode(), that.isSetCode(), this.code, that.code)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetLeader(), that.isSetLeader(), this.leader, that.leader)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetItems(), that.isSetItems(), this.items, that.items)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {code, leader, items});
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
        case CODE:
          if (__field.type == TType.I32) {
            this.code = ErrorCode.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LEADER:
          if (__field.type == TType.STRUCT) {
            this.leader = new com.vesoft.nebula.HostAddr();
            this.leader.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ITEMS:
          if (__field.type == TType.LIST) {
            {
              TList _list185 = iprot.readListBegin();
              this.items = new ArrayList<ConfigItem>(Math.max(0, _list185.size));
              for (int _i186 = 0; 
                   (_list185.size < 0) ? iprot.peekList() : (_i186 < _list185.size); 
                   ++_i186)
              {
                ConfigItem _elem187;
                _elem187 = new ConfigItem();
                _elem187.read(iprot);
                this.items.add(_elem187);
              }
              iprot.readListEnd();
            }
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
    if (this.code != null) {
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeI32(this.code == null ? 0 : this.code.getValue());
      oprot.writeFieldEnd();
    }
    if (this.leader != null) {
      oprot.writeFieldBegin(LEADER_FIELD_DESC);
      this.leader.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.items != null) {
      oprot.writeFieldBegin(ITEMS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.items.size()));
        for (ConfigItem _iter188 : this.items)        {
          _iter188.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("ListConfigsResp");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("code");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getCode() == null) {
      sb.append("null");
    } else {
      String code_name = this.getCode() == null ? "null" : this.getCode().name();
      if (code_name != null) {
        sb.append(code_name);
        sb.append(" (");
      }
      sb.append(this.getCode());
      if (code_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("leader");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getLeader() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getLeader(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("items");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getItems() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getItems(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

