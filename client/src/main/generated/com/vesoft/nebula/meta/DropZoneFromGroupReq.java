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
public class DropZoneFromGroupReq implements TBase, java.io.Serializable, Cloneable, Comparable<DropZoneFromGroupReq> {
  private static final TStruct STRUCT_DESC = new TStruct("DropZoneFromGroupReq");
  private static final TField ZONE_NAME_FIELD_DESC = new TField("zone_name", TType.STRING, (short)1);
  private static final TField GROUP_NAME_FIELD_DESC = new TField("group_name", TType.STRING, (short)2);

  public byte[] zone_name;
  public byte[] group_name;
  public static final int ZONE_NAME = 1;
  public static final int GROUP_NAME = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ZONE_NAME, new FieldMetaData("zone_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(GROUP_NAME, new FieldMetaData("group_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(DropZoneFromGroupReq.class, metaDataMap);
  }

  public DropZoneFromGroupReq() {
  }

  public DropZoneFromGroupReq(
      byte[] zone_name,
      byte[] group_name) {
    this();
    this.zone_name = zone_name;
    this.group_name = group_name;
  }

  public static class Builder {
    private byte[] zone_name;
    private byte[] group_name;

    public Builder() {
    }

    public Builder setZone_name(final byte[] zone_name) {
      this.zone_name = zone_name;
      return this;
    }

    public Builder setGroup_name(final byte[] group_name) {
      this.group_name = group_name;
      return this;
    }

    public DropZoneFromGroupReq build() {
      DropZoneFromGroupReq result = new DropZoneFromGroupReq();
      result.setZone_name(this.zone_name);
      result.setGroup_name(this.group_name);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DropZoneFromGroupReq(DropZoneFromGroupReq other) {
    if (other.isSetZone_name()) {
      this.zone_name = TBaseHelper.deepCopy(other.zone_name);
    }
    if (other.isSetGroup_name()) {
      this.group_name = TBaseHelper.deepCopy(other.group_name);
    }
  }

  public DropZoneFromGroupReq deepCopy() {
    return new DropZoneFromGroupReq(this);
  }

  public byte[] getZone_name() {
    return this.zone_name;
  }

  public DropZoneFromGroupReq setZone_name(byte[] zone_name) {
    this.zone_name = zone_name;
    return this;
  }

  public void unsetZone_name() {
    this.zone_name = null;
  }

  // Returns true if field zone_name is set (has been assigned a value) and false otherwise
  public boolean isSetZone_name() {
    return this.zone_name != null;
  }

  public void setZone_nameIsSet(boolean __value) {
    if (!__value) {
      this.zone_name = null;
    }
  }

  public byte[] getGroup_name() {
    return this.group_name;
  }

  public DropZoneFromGroupReq setGroup_name(byte[] group_name) {
    this.group_name = group_name;
    return this;
  }

  public void unsetGroup_name() {
    this.group_name = null;
  }

  // Returns true if field group_name is set (has been assigned a value) and false otherwise
  public boolean isSetGroup_name() {
    return this.group_name != null;
  }

  public void setGroup_nameIsSet(boolean __value) {
    if (!__value) {
      this.group_name = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case ZONE_NAME:
      if (__value == null) {
        unsetZone_name();
      } else {
        setZone_name((byte[])__value);
      }
      break;

    case GROUP_NAME:
      if (__value == null) {
        unsetGroup_name();
      } else {
        setGroup_name((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ZONE_NAME:
      return getZone_name();

    case GROUP_NAME:
      return getGroup_name();

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
    if (!(_that instanceof DropZoneFromGroupReq))
      return false;
    DropZoneFromGroupReq that = (DropZoneFromGroupReq)_that;

    if (!TBaseHelper.equalsSlow(this.isSetZone_name(), that.isSetZone_name(), this.zone_name, that.zone_name)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetGroup_name(), that.isSetGroup_name(), this.group_name, that.group_name)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {zone_name, group_name});
  }

  @Override
  public int compareTo(DropZoneFromGroupReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetZone_name()).compareTo(other.isSetZone_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(zone_name, other.zone_name);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetGroup_name()).compareTo(other.isSetGroup_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(group_name, other.group_name);
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
        case ZONE_NAME:
          if (__field.type == TType.STRING) {
            this.zone_name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case GROUP_NAME:
          if (__field.type == TType.STRING) {
            this.group_name = iprot.readBinary();
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
    if (this.zone_name != null) {
      oprot.writeFieldBegin(ZONE_NAME_FIELD_DESC);
      oprot.writeBinary(this.zone_name);
      oprot.writeFieldEnd();
    }
    if (this.group_name != null) {
      oprot.writeFieldBegin(GROUP_NAME_FIELD_DESC);
      oprot.writeBinary(this.group_name);
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
    StringBuilder sb = new StringBuilder("DropZoneFromGroupReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("zone_name");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getZone_name() == null) {
      sb.append("null");
    } else {
        int __zone_name_size = Math.min(this.getZone_name().length, 128);
        for (int i = 0; i < __zone_name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getZone_name()[i]).length() > 1 ? Integer.toHexString(this.getZone_name()[i]).substring(Integer.toHexString(this.getZone_name()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getZone_name()[i]).toUpperCase());
        }
        if (this.getZone_name().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("group_name");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getGroup_name() == null) {
      sb.append("null");
    } else {
        int __group_name_size = Math.min(this.getGroup_name().length, 128);
        for (int i = 0; i < __group_name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getGroup_name()[i]).length() > 1 ? Integer.toHexString(this.getGroup_name()[i]).substring(Integer.toHexString(this.getGroup_name()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getGroup_name()[i]).toUpperCase());
        }
        if (this.getGroup_name().length > 128) sb.append(" ...");
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

