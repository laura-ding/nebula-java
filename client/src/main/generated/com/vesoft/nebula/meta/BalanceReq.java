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
public class BalanceReq implements TBase, java.io.Serializable, Cloneable, Comparable<BalanceReq> {
  private static final TStruct STRUCT_DESC = new TStruct("BalanceReq");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField ID_FIELD_DESC = new TField("id", TType.I64, (short)2);
  private static final TField HOST_DEL_FIELD_DESC = new TField("host_del", TType.LIST, (short)3);
  private static final TField STOP_FIELD_DESC = new TField("stop", TType.BOOL, (short)4);
  private static final TField RESET_FIELD_DESC = new TField("reset", TType.BOOL, (short)5);

  public int space_id;
  public long id;
  public List<com.vesoft.nebula.HostAddr> host_del;
  public boolean stop;
  public boolean reset;
  public static final int SPACE_ID = 1;
  public static final int ID = 2;
  public static final int HOST_DEL = 3;
  public static final int STOP = 4;
  public static final int RESET = 5;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private static final int __ID_ISSET_ID = 1;
  private static final int __STOP_ISSET_ID = 2;
  private static final int __RESET_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(ID, new FieldMetaData("id", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(HOST_DEL, new FieldMetaData("host_del", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class))));
    tmpMetaDataMap.put(STOP, new FieldMetaData("stop", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(RESET, new FieldMetaData("reset", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(BalanceReq.class, metaDataMap);
  }

  public BalanceReq() {
  }

  public BalanceReq(
      int space_id,
      long id,
      List<com.vesoft.nebula.HostAddr> host_del,
      boolean stop,
      boolean reset) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.id = id;
    setIdIsSet(true);
    this.host_del = host_del;
    this.stop = stop;
    setStopIsSet(true);
    this.reset = reset;
    setResetIsSet(true);
  }

  public static class Builder {
    private int space_id;
    private long id;
    private List<com.vesoft.nebula.HostAddr> host_del;
    private boolean stop;
    private boolean reset;

    BitSet __optional_isset = new BitSet(4);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setId(final long id) {
      this.id = id;
      __optional_isset.set(__ID_ISSET_ID, true);
      return this;
    }

    public Builder setHost_del(final List<com.vesoft.nebula.HostAddr> host_del) {
      this.host_del = host_del;
      return this;
    }

    public Builder setStop(final boolean stop) {
      this.stop = stop;
      __optional_isset.set(__STOP_ISSET_ID, true);
      return this;
    }

    public Builder setReset(final boolean reset) {
      this.reset = reset;
      __optional_isset.set(__RESET_ISSET_ID, true);
      return this;
    }

    public BalanceReq build() {
      BalanceReq result = new BalanceReq();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      if (__optional_isset.get(__ID_ISSET_ID)) {
        result.setId(this.id);
      }
      result.setHost_del(this.host_del);
      if (__optional_isset.get(__STOP_ISSET_ID)) {
        result.setStop(this.stop);
      }
      if (__optional_isset.get(__RESET_ISSET_ID)) {
        result.setReset(this.reset);
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
  public BalanceReq(BalanceReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    this.id = TBaseHelper.deepCopy(other.id);
    if (other.isSetHost_del()) {
      this.host_del = TBaseHelper.deepCopy(other.host_del);
    }
    this.stop = TBaseHelper.deepCopy(other.stop);
    this.reset = TBaseHelper.deepCopy(other.reset);
  }

  public BalanceReq deepCopy() {
    return new BalanceReq(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public BalanceReq setSpace_id(int space_id) {
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

  public long getId() {
    return this.id;
  }

  public BalanceReq setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  // Returns true if field id is set (has been assigned a value) and false otherwise
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean __value) {
    __isset_bit_vector.set(__ID_ISSET_ID, __value);
  }

  public List<com.vesoft.nebula.HostAddr> getHost_del() {
    return this.host_del;
  }

  public BalanceReq setHost_del(List<com.vesoft.nebula.HostAddr> host_del) {
    this.host_del = host_del;
    return this;
  }

  public void unsetHost_del() {
    this.host_del = null;
  }

  // Returns true if field host_del is set (has been assigned a value) and false otherwise
  public boolean isSetHost_del() {
    return this.host_del != null;
  }

  public void setHost_delIsSet(boolean __value) {
    if (!__value) {
      this.host_del = null;
    }
  }

  public boolean isStop() {
    return this.stop;
  }

  public BalanceReq setStop(boolean stop) {
    this.stop = stop;
    setStopIsSet(true);
    return this;
  }

  public void unsetStop() {
    __isset_bit_vector.clear(__STOP_ISSET_ID);
  }

  // Returns true if field stop is set (has been assigned a value) and false otherwise
  public boolean isSetStop() {
    return __isset_bit_vector.get(__STOP_ISSET_ID);
  }

  public void setStopIsSet(boolean __value) {
    __isset_bit_vector.set(__STOP_ISSET_ID, __value);
  }

  public boolean isReset() {
    return this.reset;
  }

  public BalanceReq setReset(boolean reset) {
    this.reset = reset;
    setResetIsSet(true);
    return this;
  }

  public void unsetReset() {
    __isset_bit_vector.clear(__RESET_ISSET_ID);
  }

  // Returns true if field reset is set (has been assigned a value) and false otherwise
  public boolean isSetReset() {
    return __isset_bit_vector.get(__RESET_ISSET_ID);
  }

  public void setResetIsSet(boolean __value) {
    __isset_bit_vector.set(__RESET_ISSET_ID, __value);
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case ID:
      if (__value == null) {
        unsetId();
      } else {
        setId((Long)__value);
      }
      break;

    case HOST_DEL:
      if (__value == null) {
        unsetHost_del();
      } else {
        setHost_del((List<com.vesoft.nebula.HostAddr>)__value);
      }
      break;

    case STOP:
      if (__value == null) {
        unsetStop();
      } else {
        setStop((Boolean)__value);
      }
      break;

    case RESET:
      if (__value == null) {
        unsetReset();
      } else {
        setReset((Boolean)__value);
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

    case ID:
      return new Long(getId());

    case HOST_DEL:
      return getHost_del();

    case STOP:
      return new Boolean(isStop());

    case RESET:
      return new Boolean(isReset());

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
    if (!(_that instanceof BalanceReq))
      return false;
    BalanceReq that = (BalanceReq)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetSpace_id(), that.isSetSpace_id(), this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetId(), that.isSetId(), this.id, that.id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetHost_del(), that.isSetHost_del(), this.host_del, that.host_del)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStop(), that.isSetStop(), this.stop, that.stop)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetReset(), that.isSetReset(), this.reset, that.reset)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, id, host_del, stop, reset});
  }

  @Override
  public int compareTo(BalanceReq other) {
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
    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(id, other.id);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetHost_del()).compareTo(other.isSetHost_del());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(host_del, other.host_del);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetStop()).compareTo(other.isSetStop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(stop, other.stop);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetReset()).compareTo(other.isSetReset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(reset, other.reset);
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
        case ID:
          if (__field.type == TType.I64) {
            this.id = iprot.readI64();
            setIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case HOST_DEL:
          if (__field.type == TType.LIST) {
            {
              TList _list169 = iprot.readListBegin();
              this.host_del = new ArrayList<com.vesoft.nebula.HostAddr>(Math.max(0, _list169.size));
              for (int _i170 = 0; 
                   (_list169.size < 0) ? iprot.peekList() : (_i170 < _list169.size); 
                   ++_i170)
              {
                com.vesoft.nebula.HostAddr _elem171;
                _elem171 = new com.vesoft.nebula.HostAddr();
                _elem171.read(iprot);
                this.host_del.add(_elem171);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STOP:
          if (__field.type == TType.BOOL) {
            this.stop = iprot.readBool();
            setStopIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case RESET:
          if (__field.type == TType.BOOL) {
            this.reset = iprot.readBool();
            setResetIsSet(true);
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
    if (isSetSpace_id()) {
      oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
      oprot.writeI32(this.space_id);
      oprot.writeFieldEnd();
    }
    if (isSetId()) {
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(this.id);
      oprot.writeFieldEnd();
    }
    if (this.host_del != null) {
      if (isSetHost_del()) {
        oprot.writeFieldBegin(HOST_DEL_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.host_del.size()));
          for (com.vesoft.nebula.HostAddr _iter172 : this.host_del)          {
            _iter172.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (isSetStop()) {
      oprot.writeFieldBegin(STOP_FIELD_DESC);
      oprot.writeBool(this.stop);
      oprot.writeFieldEnd();
    }
    if (isSetReset()) {
      oprot.writeFieldBegin(RESET_FIELD_DESC);
      oprot.writeBool(this.reset);
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
    StringBuilder sb = new StringBuilder("BalanceReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetSpace_id())
    {
      sb.append(indentStr);
      sb.append("space_id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetId())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.getId(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetHost_del())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("host_del");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getHost_del() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getHost_del(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetStop())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("stop");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.isStop(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetReset())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("reset");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.isReset(), indent + 1, prettyPrint));
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

