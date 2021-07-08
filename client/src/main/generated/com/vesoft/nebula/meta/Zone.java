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
public class Zone implements TBase, java.io.Serializable, Cloneable, Comparable<Zone> {
  private static final TStruct STRUCT_DESC = new TStruct("Zone");
  private static final TField ZONE_NAME_FIELD_DESC = new TField("zone_name", TType.STRING, (short)1);
  private static final TField NODES_FIELD_DESC = new TField("nodes", TType.LIST, (short)2);

  public byte[] zone_name;
  public List<com.vesoft.nebula.HostAddr> nodes;
  public static final int ZONE_NAME = 1;
  public static final int NODES = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ZONE_NAME, new FieldMetaData("zone_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(NODES, new FieldMetaData("nodes", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Zone.class, metaDataMap);
  }

  public Zone() {
  }

  public Zone(
      byte[] zone_name,
      List<com.vesoft.nebula.HostAddr> nodes) {
    this();
    this.zone_name = zone_name;
    this.nodes = nodes;
  }

  public static class Builder {
    private byte[] zone_name;
    private List<com.vesoft.nebula.HostAddr> nodes;

    public Builder() {
    }

    public Builder setZone_name(final byte[] zone_name) {
      this.zone_name = zone_name;
      return this;
    }

    public Builder setNodes(final List<com.vesoft.nebula.HostAddr> nodes) {
      this.nodes = nodes;
      return this;
    }

    public Zone build() {
      Zone result = new Zone();
      result.setZone_name(this.zone_name);
      result.setNodes(this.nodes);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Zone(Zone other) {
    if (other.isSetZone_name()) {
      this.zone_name = TBaseHelper.deepCopy(other.zone_name);
    }
    if (other.isSetNodes()) {
      this.nodes = TBaseHelper.deepCopy(other.nodes);
    }
  }

  public Zone deepCopy() {
    return new Zone(this);
  }

  public byte[] getZone_name() {
    return this.zone_name;
  }

  public Zone setZone_name(byte[] zone_name) {
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

  public List<com.vesoft.nebula.HostAddr> getNodes() {
    return this.nodes;
  }

  public Zone setNodes(List<com.vesoft.nebula.HostAddr> nodes) {
    this.nodes = nodes;
    return this;
  }

  public void unsetNodes() {
    this.nodes = null;
  }

  // Returns true if field nodes is set (has been assigned a value) and false otherwise
  public boolean isSetNodes() {
    return this.nodes != null;
  }

  public void setNodesIsSet(boolean __value) {
    if (!__value) {
      this.nodes = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case ZONE_NAME:
      if (__value == null) {
        unsetZone_name();
      } else {
        setZone_name((byte[])__value);
      }
      break;

    case NODES:
      if (__value == null) {
        unsetNodes();
      } else {
        setNodes((List<com.vesoft.nebula.HostAddr>)__value);
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

    case NODES:
      return getNodes();

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
    if (!(_that instanceof Zone))
      return false;
    Zone that = (Zone)_that;

    if (!TBaseHelper.equalsSlow(this.isSetZone_name(), that.isSetZone_name(), this.zone_name, that.zone_name)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetNodes(), that.isSetNodes(), this.nodes, that.nodes)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {zone_name, nodes});
  }

  @Override
  public int compareTo(Zone other) {
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
    lastComparison = Boolean.valueOf(isSetNodes()).compareTo(other.isSetNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(nodes, other.nodes);
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
        case NODES:
          if (__field.type == TType.LIST) {
            {
              TList _list210 = iprot.readListBegin();
              this.nodes = new ArrayList<com.vesoft.nebula.HostAddr>(Math.max(0, _list210.size));
              for (int _i211 = 0; 
                   (_list210.size < 0) ? iprot.peekList() : (_i211 < _list210.size); 
                   ++_i211)
              {
                com.vesoft.nebula.HostAddr _elem212;
                _elem212 = new com.vesoft.nebula.HostAddr();
                _elem212.read(iprot);
                this.nodes.add(_elem212);
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
    if (this.zone_name != null) {
      oprot.writeFieldBegin(ZONE_NAME_FIELD_DESC);
      oprot.writeBinary(this.zone_name);
      oprot.writeFieldEnd();
    }
    if (this.nodes != null) {
      oprot.writeFieldBegin(NODES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.nodes.size()));
        for (com.vesoft.nebula.HostAddr _iter213 : this.nodes)        {
          _iter213.write(oprot);
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
    StringBuilder sb = new StringBuilder("Zone");
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
    sb.append("nodes");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getNodes() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getNodes(), indent + 1, prettyPrint));
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

