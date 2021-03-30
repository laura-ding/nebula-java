/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula;

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
public class PartitionBackupInfo implements TBase, java.io.Serializable, Cloneable, Comparable<PartitionBackupInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("PartitionBackupInfo");
  private static final TField INFO_FIELD_DESC = new TField("info", TType.MAP, (short)1);

  public Map<Integer,LogInfo> info;
  public static final int INFO = 1;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(INFO, new FieldMetaData("info", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new StructMetaData(TType.STRUCT, LogInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(PartitionBackupInfo.class, metaDataMap);
  }

  public PartitionBackupInfo() {
  }

  public PartitionBackupInfo(
      Map<Integer,LogInfo> info) {
    this();
    this.info = info;
  }

  public static class Builder {
    private Map<Integer,LogInfo> info;

    public Builder() {
    }

    public Builder setInfo(final Map<Integer,LogInfo> info) {
      this.info = info;
      return this;
    }

    public PartitionBackupInfo build() {
      PartitionBackupInfo result = new PartitionBackupInfo();
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
  public PartitionBackupInfo(PartitionBackupInfo other) {
    if (other.isSetInfo()) {
      this.info = TBaseHelper.deepCopy(other.info);
    }
  }

  public PartitionBackupInfo deepCopy() {
    return new PartitionBackupInfo(this);
  }

  public Map<Integer,LogInfo> getInfo() {
    return this.info;
  }

  public PartitionBackupInfo setInfo(Map<Integer,LogInfo> info) {
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
    case INFO:
      if (__value == null) {
        unsetInfo();
      } else {
        setInfo((Map<Integer,LogInfo>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
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
    if (!(_that instanceof PartitionBackupInfo))
      return false;
    PartitionBackupInfo that = (PartitionBackupInfo)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetInfo(), that.isSetInfo(), this.info, that.info)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {info});
  }

  @Override
  public int compareTo(PartitionBackupInfo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

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
        case INFO:
          if (__field.type == TType.MAP) {
            {
              TMap _map48 = iprot.readMapBegin();
              this.info = new HashMap<Integer,LogInfo>(Math.max(0, 2*_map48.size));
              for (int _i49 = 0; 
                   (_map48.size < 0) ? iprot.peekMap() : (_i49 < _map48.size); 
                   ++_i49)
              {
                int _key50;
                LogInfo _val51;
                _key50 = iprot.readI32();
                _val51 = new LogInfo();
                _val51.read(iprot);
                this.info.put(_key50, _val51);
              }
              iprot.readMapEnd();
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
    if (this.info != null) {
      oprot.writeFieldBegin(INFO_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.STRUCT, this.info.size()));
        for (Map.Entry<Integer, LogInfo> _iter52 : this.info.entrySet())        {
          oprot.writeI32(_iter52.getKey());
          _iter52.getValue().write(oprot);
        }
        oprot.writeMapEnd();
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
    StringBuilder sb = new StringBuilder("PartitionBackupInfo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

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

