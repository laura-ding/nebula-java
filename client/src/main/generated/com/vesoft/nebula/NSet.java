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
public class NSet implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("NSet");
  private static final TField VALUES_FIELD_DESC = new TField("values", TType.SET, (short)1);

  public Set<Value> values;
  public static final int VALUES = 1;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(VALUES, new FieldMetaData("values", TFieldRequirementType.DEFAULT, 
        new SetMetaData(TType.SET, 
            new StructMetaData(TType.STRUCT, Value.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(NSet.class, metaDataMap);
  }

  public NSet() {
  }

  public NSet(
      Set<Value> values) {
    this();
    this.values = values;
  }

  public static class Builder {
    private Set<Value> values;

    public Builder() {
    }

    public Builder setValues(final Set<Value> values) {
      this.values = values;
      return this;
    }

    public NSet build() {
      NSet result = new NSet();
      result.setValues(this.values);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NSet(NSet other) {
    if (other.isSetValues()) {
      this.values = TBaseHelper.deepCopy(other.values);
    }
  }

  public NSet deepCopy() {
    return new NSet(this);
  }

  public Set<Value> getValues() {
    return this.values;
  }

  public NSet setValues(Set<Value> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  // Returns true if field values is set (has been assigned a value) and false otherwise
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean __value) {
    if (!__value) {
      this.values = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case VALUES:
      if (__value == null) {
        unsetValues();
      } else {
        setValues((Set<Value>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case VALUES:
      return getValues();

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
    if (!(_that instanceof NSet))
      return false;
    NSet that = (NSet)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetValues(), that.isSetValues(), this.values, that.values)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {values});
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
        case VALUES:
          if (__field.type == TType.SET) {
            {
              TSet _set9 = iprot.readSetBegin();
              this.values = new HashSet<Value>(Math.max(0, 2*_set9.size));
              for (int _i10 = 0; 
                   (_set9.size < 0) ? iprot.peekSet() : (_i10 < _set9.size); 
                   ++_i10)
              {
                Value _elem11;
                _elem11 = new Value();
                _elem11.read(iprot);
                this.values.add(_elem11);
              }
              iprot.readSetEnd();
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
    if (this.values != null) {
      oprot.writeFieldBegin(VALUES_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.STRUCT, this.values.size()));
        for (Value _iter12 : this.values)        {
          _iter12.write(oprot);
        }
        oprot.writeSetEnd();
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
    StringBuilder sb = new StringBuilder("NSet");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("values");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getValues() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getValues(), indent + 1, prettyPrint));
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

