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
public class BackupInfo implements TBase, java.io.Serializable, Cloneable, Comparable<BackupInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("BackupInfo");
  private static final TField HOST_FIELD_DESC = new TField("host", TType.STRUCT, (short)1);
  private static final TField INFO_FIELD_DESC = new TField("info", TType.LIST, (short)2);

  public com.vesoft.nebula.HostAddr host;
  public List<com.vesoft.nebula.CheckpointInfo> info;
  public static final int HOST = 1;
  public static final int INFO = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(HOST, new FieldMetaData("host", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    tmpMetaDataMap.put(INFO, new FieldMetaData("info", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.CheckpointInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(BackupInfo.class, metaDataMap);
  }

  public BackupInfo() {
  }

  public BackupInfo(
      com.vesoft.nebula.HostAddr host,
      List<com.vesoft.nebula.CheckpointInfo> info) {
    this();
    this.host = host;
    this.info = info;
  }

  public static class Builder {
    private com.vesoft.nebula.HostAddr host;
    private List<com.vesoft.nebula.CheckpointInfo> info;

    public Builder() {
    }

    public Builder setHost(final com.vesoft.nebula.HostAddr host) {
      this.host = host;
      return this;
    }

    public Builder setInfo(final List<com.vesoft.nebula.CheckpointInfo> info) {
      this.info = info;
      return this;
    }

    public BackupInfo build() {
      BackupInfo result = new BackupInfo();
      result.setHost(this.host);
      result.setInfo(this.info);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BackupInfo(BackupInfo other) {
    if (other.isSetHost()) {
      this.host = TBaseHelper.deepCopy(other.host);
    }
    if (other.isSetInfo()) {
      this.info = TBaseHelper.deepCopy(other.info);
    }
  }

  public BackupInfo deepCopy() {
    return new BackupInfo(this);
  }

  public com.vesoft.nebula.HostAddr getHost() {
    return this.host;
  }

  public BackupInfo setHost(com.vesoft.nebula.HostAddr host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  // Returns true if field host is set (has been assigned a value) and false otherwise
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean __value) {
    if (!__value) {
      this.host = null;
    }
  }

  public List<com.vesoft.nebula.CheckpointInfo> getInfo() {
    return this.info;
  }

  public BackupInfo setInfo(List<com.vesoft.nebula.CheckpointInfo> info) {
    this.info = info;
    return this;
  }

  public void unsetInfo() {
    this.info = null;
  }

  // Returns true if field info is set (has been assigned a value) and false otherwise
  public boolean isSetInfo() {
    return this.info != null;
  }

  public void setInfoIsSet(boolean __value) {
    if (!__value) {
      this.info = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case HOST:
      if (__value == null) {
        unsetHost();
      } else {
        setHost((com.vesoft.nebula.HostAddr)__value);
      }
      break;

    case INFO:
      if (__value == null) {
        unsetInfo();
      } else {
        setInfo((List<com.vesoft.nebula.CheckpointInfo>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case HOST:
      return getHost();

    case INFO:
      return getInfo();

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
    if (!(_that instanceof BackupInfo))
      return false;
    BackupInfo that = (BackupInfo)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetHost(), that.isSetHost(), this.host, that.host)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetInfo(), that.isSetInfo(), this.info, that.info)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {host, info});
  }

  @Override
  public int compareTo(BackupInfo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(host, other.host);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetInfo()).compareTo(other.isSetInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(info, other.info);
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
        case HOST:
          if (__field.type == TType.STRUCT) {
            this.host = new com.vesoft.nebula.HostAddr();
            this.host.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case INFO:
          if (__field.type == TType.LIST) {
            {
              TList _list237 = iprot.readListBegin();
              this.info = new ArrayList<com.vesoft.nebula.CheckpointInfo>(Math.max(0, _list237.size));
              for (int _i238 = 0; 
                   (_list237.size < 0) ? iprot.peekList() : (_i238 < _list237.size); 
                   ++_i238)
              {
                com.vesoft.nebula.CheckpointInfo _elem239;
                _elem239 = new com.vesoft.nebula.CheckpointInfo();
                _elem239.read(iprot);
                this.info.add(_elem239);
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
    if (this.host != null) {
      oprot.writeFieldBegin(HOST_FIELD_DESC);
      this.host.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.info != null) {
      oprot.writeFieldBegin(INFO_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.info.size()));
        for (com.vesoft.nebula.CheckpointInfo _iter240 : this.info)        {
          _iter240.write(oprot);
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
    StringBuilder sb = new StringBuilder("BackupInfo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("host");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getHost() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getHost(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("info");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getInfo() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getInfo(), indent + 1, prettyPrint));
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

