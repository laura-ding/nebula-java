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
public class GetLeaderPartsResp implements TBase, java.io.Serializable, Cloneable, Comparable<GetLeaderPartsResp> {
  private static final TStruct STRUCT_DESC = new TStruct("GetLeaderPartsResp");
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField LEADER_PARTS_FIELD_DESC = new TField("leader_parts", TType.MAP, (short)2);

  public ResponseCommon result;
  public Map<Integer,List<Integer>> leader_parts;
  public static final int RESULT = 1;
  public static final int LEADER_PARTS = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(RESULT, new FieldMetaData("result", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ResponseCommon.class)));
    tmpMetaDataMap.put(LEADER_PARTS, new FieldMetaData("leader_parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new FieldValueMetaData(TType.I32)))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(GetLeaderPartsResp.class, metaDataMap);
  }

  public GetLeaderPartsResp() {
  }

  public GetLeaderPartsResp(
      ResponseCommon result) {
    this();
    this.result = result;
  }

  public GetLeaderPartsResp(
      ResponseCommon result,
      Map<Integer,List<Integer>> leader_parts) {
    this();
    this.result = result;
    this.leader_parts = leader_parts;
  }

  public static class Builder {
    private ResponseCommon result;
    private Map<Integer,List<Integer>> leader_parts;

    public Builder() {
    }

    public Builder setResult(final ResponseCommon result) {
      this.result = result;
      return this;
    }

    public Builder setLeader_parts(final Map<Integer,List<Integer>> leader_parts) {
      this.leader_parts = leader_parts;
      return this;
    }

    public GetLeaderPartsResp build() {
      GetLeaderPartsResp result = new GetLeaderPartsResp();
      result.setResult(this.result);
      result.setLeader_parts(this.leader_parts);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetLeaderPartsResp(GetLeaderPartsResp other) {
    if (other.isSetResult()) {
      this.result = TBaseHelper.deepCopy(other.result);
    }
    if (other.isSetLeader_parts()) {
      this.leader_parts = TBaseHelper.deepCopy(other.leader_parts);
    }
  }

  public GetLeaderPartsResp deepCopy() {
    return new GetLeaderPartsResp(this);
  }

  public ResponseCommon getResult() {
    return this.result;
  }

  public GetLeaderPartsResp setResult(ResponseCommon result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  // Returns true if field result is set (has been assigned a value) and false otherwise
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean __value) {
    if (!__value) {
      this.result = null;
    }
  }

  public Map<Integer,List<Integer>> getLeader_parts() {
    return this.leader_parts;
  }

  public GetLeaderPartsResp setLeader_parts(Map<Integer,List<Integer>> leader_parts) {
    this.leader_parts = leader_parts;
    return this;
  }

  public void unsetLeader_parts() {
    this.leader_parts = null;
  }

  // Returns true if field leader_parts is set (has been assigned a value) and false otherwise
  public boolean isSetLeader_parts() {
    return this.leader_parts != null;
  }

  public void setLeader_partsIsSet(boolean __value) {
    if (!__value) {
      this.leader_parts = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case RESULT:
      if (__value == null) {
        unsetResult();
      } else {
        setResult((ResponseCommon)__value);
      }
      break;

    case LEADER_PARTS:
      if (__value == null) {
        unsetLeader_parts();
      } else {
        setLeader_parts((Map<Integer,List<Integer>>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return getResult();

    case LEADER_PARTS:
      return getLeader_parts();

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
    if (!(_that instanceof GetLeaderPartsResp))
      return false;
    GetLeaderPartsResp that = (GetLeaderPartsResp)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetResult(), that.isSetResult(), this.result, that.result)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetLeader_parts(), that.isSetLeader_parts(), this.leader_parts, that.leader_parts)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {result, leader_parts});
  }

  @Override
  public int compareTo(GetLeaderPartsResp other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(result, other.result);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetLeader_parts()).compareTo(other.isSetLeader_parts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(leader_parts, other.leader_parts);
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
        case RESULT:
          if (__field.type == TType.STRUCT) {
            this.result = new ResponseCommon();
            this.result.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LEADER_PARTS:
          if (__field.type == TType.MAP) {
            {
              TMap _map183 = iprot.readMapBegin();
              this.leader_parts = new HashMap<Integer,List<Integer>>(Math.max(0, 2*_map183.size));
              for (int _i184 = 0; 
                   (_map183.size < 0) ? iprot.peekMap() : (_i184 < _map183.size); 
                   ++_i184)
              {
                int _key185;
                List<Integer> _val186;
                _key185 = iprot.readI32();
                {
                  TList _list187 = iprot.readListBegin();
                  _val186 = new ArrayList<Integer>(Math.max(0, _list187.size));
                  for (int _i188 = 0; 
                       (_list187.size < 0) ? iprot.peekList() : (_i188 < _list187.size); 
                       ++_i188)
                  {
                    int _elem189;
                    _elem189 = iprot.readI32();
                    _val186.add(_elem189);
                  }
                  iprot.readListEnd();
                }
                this.leader_parts.put(_key185, _val186);
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
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.leader_parts != null) {
      oprot.writeFieldBegin(LEADER_PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.leader_parts.size()));
        for (Map.Entry<Integer, List<Integer>> _iter190 : this.leader_parts.entrySet())        {
          oprot.writeI32(_iter190.getKey());
          {
            oprot.writeListBegin(new TList(TType.I32, _iter190.getValue().size()));
            for (int _iter191 : _iter190.getValue())            {
              oprot.writeI32(_iter191);
            }
            oprot.writeListEnd();
          }
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
    StringBuilder sb = new StringBuilder("GetLeaderPartsResp");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("result");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getResult() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getResult(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("leader_parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getLeader_parts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getLeader_parts(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (result == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'result' was not present! Struct: " + toString());
    }
  }

}

