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
public class MemberChangeReq implements TBase, java.io.Serializable, Cloneable, Comparable<MemberChangeReq> {
  private static final TStruct STRUCT_DESC = new TStruct("MemberChangeReq");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PART_ID_FIELD_DESC = new TField("part_id", TType.I32, (short)2);
  private static final TField PEER_FIELD_DESC = new TField("peer", TType.STRUCT, (short)3);
  private static final TField ADD_FIELD_DESC = new TField("add", TType.BOOL, (short)4);

  public int space_id;
  public int part_id;
  public com.vesoft.nebula.HostAddr peer;
  public boolean add;
  public static final int SPACE_ID = 1;
  public static final int PART_ID = 2;
  public static final int PEER = 3;
  public static final int ADD = 4;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private static final int __PART_ID_ISSET_ID = 1;
  private static final int __ADD_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PART_ID, new FieldMetaData("part_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PEER, new FieldMetaData("peer", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    tmpMetaDataMap.put(ADD, new FieldMetaData("add", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(MemberChangeReq.class, metaDataMap);
  }

  public MemberChangeReq() {
  }

  public MemberChangeReq(
      int space_id,
      int part_id,
      com.vesoft.nebula.HostAddr peer,
      boolean add) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.part_id = part_id;
    setPart_idIsSet(true);
    this.peer = peer;
    this.add = add;
    setAddIsSet(true);
  }

  public static class Builder {
    private int space_id;
    private int part_id;
    private com.vesoft.nebula.HostAddr peer;
    private boolean add;

    BitSet __optional_isset = new BitSet(3);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setPart_id(final int part_id) {
      this.part_id = part_id;
      __optional_isset.set(__PART_ID_ISSET_ID, true);
      return this;
    }

    public Builder setPeer(final com.vesoft.nebula.HostAddr peer) {
      this.peer = peer;
      return this;
    }

    public Builder setAdd(final boolean add) {
      this.add = add;
      __optional_isset.set(__ADD_ISSET_ID, true);
      return this;
    }

    public MemberChangeReq build() {
      MemberChangeReq result = new MemberChangeReq();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      if (__optional_isset.get(__PART_ID_ISSET_ID)) {
        result.setPart_id(this.part_id);
      }
      result.setPeer(this.peer);
      if (__optional_isset.get(__ADD_ISSET_ID)) {
        result.setAdd(this.add);
      }
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MemberChangeReq(MemberChangeReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    this.part_id = TBaseHelper.deepCopy(other.part_id);
    if (other.isSetPeer()) {
      this.peer = TBaseHelper.deepCopy(other.peer);
    }
    this.add = TBaseHelper.deepCopy(other.add);
  }

  public MemberChangeReq deepCopy() {
    return new MemberChangeReq(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public MemberChangeReq setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, __value);
  }

  public int getPart_id() {
    return this.part_id;
  }

  public MemberChangeReq setPart_id(int part_id) {
    this.part_id = part_id;
    setPart_idIsSet(true);
    return this;
  }

  public void unsetPart_id() {
    __isset_bit_vector.clear(__PART_ID_ISSET_ID);
  }

  // Returns true if field part_id is set (has been assigned a value) and false otherwise
  public boolean isSetPart_id() {
    return __isset_bit_vector.get(__PART_ID_ISSET_ID);
  }

  public void setPart_idIsSet(boolean __value) {
    __isset_bit_vector.set(__PART_ID_ISSET_ID, __value);
  }

  public com.vesoft.nebula.HostAddr getPeer() {
    return this.peer;
  }

  public MemberChangeReq setPeer(com.vesoft.nebula.HostAddr peer) {
    this.peer = peer;
    return this;
  }

  public void unsetPeer() {
    this.peer = null;
  }

  // Returns true if field peer is set (has been assigned a value) and false otherwise
  public boolean isSetPeer() {
    return this.peer != null;
  }

  public void setPeerIsSet(boolean __value) {
    if (!__value) {
      this.peer = null;
    }
  }

  public boolean isAdd() {
    return this.add;
  }

  public MemberChangeReq setAdd(boolean add) {
    this.add = add;
    setAddIsSet(true);
    return this;
  }

  public void unsetAdd() {
    __isset_bit_vector.clear(__ADD_ISSET_ID);
  }

  // Returns true if field add is set (has been assigned a value) and false otherwise
  public boolean isSetAdd() {
    return __isset_bit_vector.get(__ADD_ISSET_ID);
  }

  public void setAddIsSet(boolean __value) {
    __isset_bit_vector.set(__ADD_ISSET_ID, __value);
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case PART_ID:
      if (__value == null) {
        unsetPart_id();
      } else {
        setPart_id((Integer)__value);
      }
      break;

    case PEER:
      if (__value == null) {
        unsetPeer();
      } else {
        setPeer((com.vesoft.nebula.HostAddr)__value);
      }
      break;

    case ADD:
      if (__value == null) {
        unsetAdd();
      } else {
        setAdd((Boolean)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PART_ID:
      return new Integer(getPart_id());

    case PEER:
      return getPeer();

    case ADD:
      return new Boolean(isAdd());

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
    if (!(_that instanceof MemberChangeReq))
      return false;
    MemberChangeReq that = (MemberChangeReq)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.part_id, that.part_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPeer(), that.isSetPeer(), this.peer, that.peer)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.add, that.add)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, part_id, peer, add});
  }

  @Override
  public int compareTo(MemberChangeReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPart_id()).compareTo(other.isSetPart_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(part_id, other.part_id);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPeer()).compareTo(other.isSetPeer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(peer, other.peer);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetAdd()).compareTo(other.isSetAdd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(add, other.add);
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
        case SPACE_ID:
          if (__field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PART_ID:
          if (__field.type == TType.I32) {
            this.part_id = iprot.readI32();
            setPart_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PEER:
          if (__field.type == TType.STRUCT) {
            this.peer = new com.vesoft.nebula.HostAddr();
            this.peer.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ADD:
          if (__field.type == TType.BOOL) {
            this.add = iprot.readBool();
            setAddIsSet(true);
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
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PART_ID_FIELD_DESC);
    oprot.writeI32(this.part_id);
    oprot.writeFieldEnd();
    if (this.peer != null) {
      oprot.writeFieldBegin(PEER_FIELD_DESC);
      this.peer.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ADD_FIELD_DESC);
    oprot.writeBool(this.add);
    oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("MemberChangeReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("part_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getPart_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("peer");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getPeer() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getPeer(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("add");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isAdd(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

