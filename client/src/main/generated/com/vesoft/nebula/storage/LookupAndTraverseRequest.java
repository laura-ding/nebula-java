/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class LookupAndTraverseRequest implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LookupAndTraverseRequest");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.LIST, (short)2);
  private static final TField INDICES_FIELD_DESC = new TField("indices", TType.STRUCT, (short)3);
  private static final TField TRAVERSE_SPEC_FIELD_DESC = new TField("traverse_spec", TType.STRUCT, (short)4);

  public int space_id;
  public List<Integer> parts;
  public IndexSpec indices;
  public TraverseSpec traverse_spec;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int INDICES = 3;
  public static final int TRAVERSE_SPEC = 4;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(INDICES, new FieldMetaData("indices", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, IndexSpec.class)));
    tmpMetaDataMap.put(TRAVERSE_SPEC, new FieldMetaData("traverse_spec", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, TraverseSpec.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(LookupAndTraverseRequest.class, metaDataMap);
  }

  public LookupAndTraverseRequest() {
  }

  public LookupAndTraverseRequest(
    int space_id,
    List<Integer> parts)
  {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
  }

  public LookupAndTraverseRequest(
    int space_id,
    List<Integer> parts,
    IndexSpec indices,
    TraverseSpec traverse_spec)
  {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.indices = indices;
    this.traverse_spec = traverse_spec;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LookupAndTraverseRequest(LookupAndTraverseRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetIndices()) {
      this.indices = TBaseHelper.deepCopy(other.indices);
    }
    if (other.isSetTraverse_spec()) {
      this.traverse_spec = TBaseHelper.deepCopy(other.traverse_spec);
    }
  }

  public LookupAndTraverseRequest deepCopy() {
    return new LookupAndTraverseRequest(this);
  }

  @Deprecated
  public LookupAndTraverseRequest clone() {
    return new LookupAndTraverseRequest(this);
  }

  public int  getSpace_id() {
    return this.space_id;
  }

  public LookupAndTraverseRequest setSpace_id(int space_id) {
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

  public void setSpace_idIsSet(boolean value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, value);
  }

  public List<Integer>  getParts() {
    return this.parts;
  }

  public LookupAndTraverseRequest setParts(List<Integer> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean value) {
    if (!value) {
      this.parts = null;
    }
  }

  public IndexSpec  getIndices() {
    return this.indices;
  }

  public LookupAndTraverseRequest setIndices(IndexSpec indices) {
    this.indices = indices;
    return this;
  }

  public void unsetIndices() {
    this.indices = null;
  }

  // Returns true if field indices is set (has been assigned a value) and false otherwise
  public boolean isSetIndices() {
    return this.indices != null;
  }

  public void setIndicesIsSet(boolean value) {
    if (!value) {
      this.indices = null;
    }
  }

  public TraverseSpec  getTraverse_spec() {
    return this.traverse_spec;
  }

  public LookupAndTraverseRequest setTraverse_spec(TraverseSpec traverse_spec) {
    this.traverse_spec = traverse_spec;
    return this;
  }

  public void unsetTraverse_spec() {
    this.traverse_spec = null;
  }

  // Returns true if field traverse_spec is set (has been assigned a value) and false otherwise
  public boolean isSetTraverse_spec() {
    return this.traverse_spec != null;
  }

  public void setTraverse_specIsSet(boolean value) {
    if (!value) {
      this.traverse_spec = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SPACE_ID:
      if (value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)value);
      }
      break;

    case PARTS:
      if (value == null) {
        unsetParts();
      } else {
        setParts((List<Integer>)value);
      }
      break;

    case INDICES:
      if (value == null) {
        unsetIndices();
      } else {
        setIndices((IndexSpec)value);
      }
      break;

    case TRAVERSE_SPEC:
      if (value == null) {
        unsetTraverse_spec();
      } else {
        setTraverse_spec((TraverseSpec)value);
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

    case PARTS:
      return getParts();

    case INDICES:
      return getIndices();

    case TRAVERSE_SPEC:
      return getTraverse_spec();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return isSetSpace_id();
    case PARTS:
      return isSetParts();
    case INDICES:
      return isSetIndices();
    case TRAVERSE_SPEC:
      return isSetTraverse_spec();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LookupAndTraverseRequest)
      return this.equals((LookupAndTraverseRequest)that);
    return false;
  }

  public boolean equals(LookupAndTraverseRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_space_id = true;
    boolean that_present_space_id = true;
    if (this_present_space_id || that_present_space_id) {
      if (!(this_present_space_id && that_present_space_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id))
        return false;
    }

    boolean this_present_parts = true && this.isSetParts();
    boolean that_present_parts = true && that.isSetParts();
    if (this_present_parts || that_present_parts) {
      if (!(this_present_parts && that_present_parts))
        return false;
      if (!TBaseHelper.equalsNobinary(this.parts, that.parts))
        return false;
    }

    boolean this_present_indices = true && this.isSetIndices();
    boolean that_present_indices = true && that.isSetIndices();
    if (this_present_indices || that_present_indices) {
      if (!(this_present_indices && that_present_indices))
        return false;
      if (!TBaseHelper.equalsNobinary(this.indices, that.indices))
        return false;
    }

    boolean this_present_traverse_spec = true && this.isSetTraverse_spec();
    boolean that_present_traverse_spec = true && that.isSetTraverse_spec();
    if (this_present_traverse_spec || that_present_traverse_spec) {
      if (!(this_present_traverse_spec && that_present_traverse_spec))
        return false;
      if (!TBaseHelper.equalsNobinary(this.traverse_spec, that.traverse_spec))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_space_id = true;
    builder.append(present_space_id);
    if (present_space_id)
      builder.append(space_id);

    boolean present_parts = true && (isSetParts());
    builder.append(present_parts);
    if (present_parts)
      builder.append(parts);

    boolean present_indices = true && (isSetIndices());
    builder.append(present_indices);
    if (present_indices)
      builder.append(indices);

    boolean present_traverse_spec = true && (isSetTraverse_spec());
    builder.append(present_traverse_spec);
    if (present_traverse_spec)
      builder.append(traverse_spec);

    return builder.toHashCode();
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SPACE_ID:
          if (field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARTS:
          if (field.type == TType.LIST) {
            {
              TList _list167 = iprot.readListBegin();
              this.parts = new ArrayList<Integer>(Math.max(0, _list167.size));
              for (int _i168 = 0; 
                   (_list167.size < 0) ? iprot.peekList() : (_i168 < _list167.size); 
                   ++_i168)
              {
                int _elem169;
                _elem169 = iprot.readI32();
                this.parts.add(_elem169);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INDICES:
          if (field.type == TType.STRUCT) {
            this.indices = new IndexSpec();
            this.indices.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TRAVERSE_SPEC:
          if (field.type == TType.STRUCT) {
            this.traverse_spec = new TraverseSpec();
            this.traverse_spec.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetSpace_id()) {
      throw new TProtocolException("Required field 'space_id' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.parts.size()));
        for (int _iter170 : this.parts)        {
          oprot.writeI32(_iter170);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.indices != null) {
      oprot.writeFieldBegin(INDICES_FIELD_DESC);
      this.indices.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.traverse_spec != null) {
      oprot.writeFieldBegin(TRAVERSE_SPEC_FIELD_DESC);
      this.traverse_spec.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("LookupAndTraverseRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getParts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("indices");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getIndices() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getIndices(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("traverse_spec");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getTraverse_spec() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getTraverse_spec(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'space_id' because it's a primitive and you chose the non-beans generator.
    if (parts == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'parts' was not present! Struct: " + toString());
    }
    // check that fields of type enum have valid values
  }

}

