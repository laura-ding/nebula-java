/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.graph;

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
public class PlanNodeDescription implements TBase, java.io.Serializable, Cloneable, Comparable<PlanNodeDescription> {
  private static final TStruct STRUCT_DESC = new TStruct("PlanNodeDescription");
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField ID_FIELD_DESC = new TField("id", TType.I64, (short)2);
  private static final TField OUTPUT_VAR_FIELD_DESC = new TField("output_var", TType.STRING, (short)3);
  private static final TField DESCRIPTION_FIELD_DESC = new TField("description", TType.LIST, (short)4);
  private static final TField PROFILES_FIELD_DESC = new TField("profiles", TType.LIST, (short)5);
  private static final TField BRANCH_INFO_FIELD_DESC = new TField("branch_info", TType.STRUCT, (short)6);
  private static final TField DEPENDENCIES_FIELD_DESC = new TField("dependencies", TType.LIST, (short)7);

  public byte[] name;
  public long id;
  public byte[] output_var;
  public List<Pair> description;
  public List<ProfilingStats> profiles;
  public PlanNodeBranchInfo branch_info;
  public List<Long> dependencies;
  public static final int NAME = 1;
  public static final int ID = 2;
  public static final int OUTPUT_VAR = 3;
  public static final int DESCRIPTION = 4;
  public static final int PROFILES = 5;
  public static final int BRANCH_INFO = 6;
  public static final int DEPENDENCIES = 7;

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(NAME, new FieldMetaData("name", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(ID, new FieldMetaData("id", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(OUTPUT_VAR, new FieldMetaData("output_var", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(DESCRIPTION, new FieldMetaData("description", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Pair.class))));
    tmpMetaDataMap.put(PROFILES, new FieldMetaData("profiles", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, ProfilingStats.class))));
    tmpMetaDataMap.put(BRANCH_INFO, new FieldMetaData("branch_info", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, PlanNodeBranchInfo.class)));
    tmpMetaDataMap.put(DEPENDENCIES, new FieldMetaData("dependencies", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(PlanNodeDescription.class, metaDataMap);
  }

  public PlanNodeDescription() {
  }

  public PlanNodeDescription(
      byte[] name,
      long id,
      byte[] output_var) {
    this();
    this.name = name;
    this.id = id;
    setIdIsSet(true);
    this.output_var = output_var;
  }

  public PlanNodeDescription(
      byte[] name,
      long id,
      byte[] output_var,
      List<Pair> description,
      List<ProfilingStats> profiles,
      PlanNodeBranchInfo branch_info,
      List<Long> dependencies) {
    this();
    this.name = name;
    this.id = id;
    setIdIsSet(true);
    this.output_var = output_var;
    this.description = description;
    this.profiles = profiles;
    this.branch_info = branch_info;
    this.dependencies = dependencies;
  }

  public static class Builder {
    private byte[] name;
    private long id;
    private byte[] output_var;
    private List<Pair> description;
    private List<ProfilingStats> profiles;
    private PlanNodeBranchInfo branch_info;
    private List<Long> dependencies;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setName(final byte[] name) {
      this.name = name;
      return this;
    }

    public Builder setId(final long id) {
      this.id = id;
      __optional_isset.set(__ID_ISSET_ID, true);
      return this;
    }

    public Builder setOutput_var(final byte[] output_var) {
      this.output_var = output_var;
      return this;
    }

    public Builder setDescription(final List<Pair> description) {
      this.description = description;
      return this;
    }

    public Builder setProfiles(final List<ProfilingStats> profiles) {
      this.profiles = profiles;
      return this;
    }

    public Builder setBranch_info(final PlanNodeBranchInfo branch_info) {
      this.branch_info = branch_info;
      return this;
    }

    public Builder setDependencies(final List<Long> dependencies) {
      this.dependencies = dependencies;
      return this;
    }

    public PlanNodeDescription build() {
      PlanNodeDescription result = new PlanNodeDescription();
      result.setName(this.name);
      if (__optional_isset.get(__ID_ISSET_ID)) {
        result.setId(this.id);
      }
      result.setOutput_var(this.output_var);
      result.setDescription(this.description);
      result.setProfiles(this.profiles);
      result.setBranch_info(this.branch_info);
      result.setDependencies(this.dependencies);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PlanNodeDescription(PlanNodeDescription other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetName()) {
      this.name = TBaseHelper.deepCopy(other.name);
    }
    this.id = TBaseHelper.deepCopy(other.id);
    if (other.isSetOutput_var()) {
      this.output_var = TBaseHelper.deepCopy(other.output_var);
    }
    if (other.isSetDescription()) {
      this.description = TBaseHelper.deepCopy(other.description);
    }
    if (other.isSetProfiles()) {
      this.profiles = TBaseHelper.deepCopy(other.profiles);
    }
    if (other.isSetBranch_info()) {
      this.branch_info = TBaseHelper.deepCopy(other.branch_info);
    }
    if (other.isSetDependencies()) {
      this.dependencies = TBaseHelper.deepCopy(other.dependencies);
    }
  }

  public PlanNodeDescription deepCopy() {
    return new PlanNodeDescription(this);
  }

  public byte[] getName() {
    return this.name;
  }

  public PlanNodeDescription setName(byte[] name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean __value) {
    if (!__value) {
      this.name = null;
    }
  }

  public long getId() {
    return this.id;
  }

  public PlanNodeDescription setId(long id) {
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

  public byte[] getOutput_var() {
    return this.output_var;
  }

  public PlanNodeDescription setOutput_var(byte[] output_var) {
    this.output_var = output_var;
    return this;
  }

  public void unsetOutput_var() {
    this.output_var = null;
  }

  // Returns true if field output_var is set (has been assigned a value) and false otherwise
  public boolean isSetOutput_var() {
    return this.output_var != null;
  }

  public void setOutput_varIsSet(boolean __value) {
    if (!__value) {
      this.output_var = null;
    }
  }

  public List<Pair> getDescription() {
    return this.description;
  }

  public PlanNodeDescription setDescription(List<Pair> description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  // Returns true if field description is set (has been assigned a value) and false otherwise
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean __value) {
    if (!__value) {
      this.description = null;
    }
  }

  public List<ProfilingStats> getProfiles() {
    return this.profiles;
  }

  public PlanNodeDescription setProfiles(List<ProfilingStats> profiles) {
    this.profiles = profiles;
    return this;
  }

  public void unsetProfiles() {
    this.profiles = null;
  }

  // Returns true if field profiles is set (has been assigned a value) and false otherwise
  public boolean isSetProfiles() {
    return this.profiles != null;
  }

  public void setProfilesIsSet(boolean __value) {
    if (!__value) {
      this.profiles = null;
    }
  }

  public PlanNodeBranchInfo getBranch_info() {
    return this.branch_info;
  }

  public PlanNodeDescription setBranch_info(PlanNodeBranchInfo branch_info) {
    this.branch_info = branch_info;
    return this;
  }

  public void unsetBranch_info() {
    this.branch_info = null;
  }

  // Returns true if field branch_info is set (has been assigned a value) and false otherwise
  public boolean isSetBranch_info() {
    return this.branch_info != null;
  }

  public void setBranch_infoIsSet(boolean __value) {
    if (!__value) {
      this.branch_info = null;
    }
  }

  public List<Long> getDependencies() {
    return this.dependencies;
  }

  public PlanNodeDescription setDependencies(List<Long> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public void unsetDependencies() {
    this.dependencies = null;
  }

  // Returns true if field dependencies is set (has been assigned a value) and false otherwise
  public boolean isSetDependencies() {
    return this.dependencies != null;
  }

  public void setDependenciesIsSet(boolean __value) {
    if (!__value) {
      this.dependencies = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case NAME:
      if (__value == null) {
        unsetName();
      } else {
        setName((byte[])__value);
      }
      break;

    case ID:
      if (__value == null) {
        unsetId();
      } else {
        setId((Long)__value);
      }
      break;

    case OUTPUT_VAR:
      if (__value == null) {
        unsetOutput_var();
      } else {
        setOutput_var((byte[])__value);
      }
      break;

    case DESCRIPTION:
      if (__value == null) {
        unsetDescription();
      } else {
        setDescription((List<Pair>)__value);
      }
      break;

    case PROFILES:
      if (__value == null) {
        unsetProfiles();
      } else {
        setProfiles((List<ProfilingStats>)__value);
      }
      break;

    case BRANCH_INFO:
      if (__value == null) {
        unsetBranch_info();
      } else {
        setBranch_info((PlanNodeBranchInfo)__value);
      }
      break;

    case DEPENDENCIES:
      if (__value == null) {
        unsetDependencies();
      } else {
        setDependencies((List<Long>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case NAME:
      return getName();

    case ID:
      return new Long(getId());

    case OUTPUT_VAR:
      return getOutput_var();

    case DESCRIPTION:
      return getDescription();

    case PROFILES:
      return getProfiles();

    case BRANCH_INFO:
      return getBranch_info();

    case DEPENDENCIES:
      return getDependencies();

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
    if (!(_that instanceof PlanNodeDescription))
      return false;
    PlanNodeDescription that = (PlanNodeDescription)_that;

    if (!TBaseHelper.equalsSlow(this.isSetName(), that.isSetName(), this.name, that.name)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.id, that.id)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetOutput_var(), that.isSetOutput_var(), this.output_var, that.output_var)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetDescription(), that.isSetDescription(), this.description, that.description)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetProfiles(), that.isSetProfiles(), this.profiles, that.profiles)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetBranch_info(), that.isSetBranch_info(), this.branch_info, that.branch_info)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetDependencies(), that.isSetDependencies(), this.dependencies, that.dependencies)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {name, id, output_var, description, profiles, branch_info, dependencies});
  }

  @Override
  public int compareTo(PlanNodeDescription other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(name, other.name);
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
    lastComparison = Boolean.valueOf(isSetOutput_var()).compareTo(other.isSetOutput_var());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(output_var, other.output_var);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(description, other.description);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetProfiles()).compareTo(other.isSetProfiles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(profiles, other.profiles);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetBranch_info()).compareTo(other.isSetBranch_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(branch_info, other.branch_info);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDependencies()).compareTo(other.isSetDependencies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(dependencies, other.dependencies);
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
        case NAME:
          if (__field.type == TType.STRING) {
            this.name = iprot.readBinary();
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
        case OUTPUT_VAR:
          if (__field.type == TType.STRING) {
            this.output_var = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case DESCRIPTION:
          if (__field.type == TType.LIST) {
            {
              TList _list5 = iprot.readListBegin();
              this.description = new ArrayList<Pair>(Math.max(0, _list5.size));
              for (int _i6 = 0; 
                   (_list5.size < 0) ? iprot.peekList() : (_i6 < _list5.size); 
                   ++_i6)
              {
                Pair _elem7;
                _elem7 = new Pair();
                _elem7.read(iprot);
                this.description.add(_elem7);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PROFILES:
          if (__field.type == TType.LIST) {
            {
              TList _list8 = iprot.readListBegin();
              this.profiles = new ArrayList<ProfilingStats>(Math.max(0, _list8.size));
              for (int _i9 = 0; 
                   (_list8.size < 0) ? iprot.peekList() : (_i9 < _list8.size); 
                   ++_i9)
              {
                ProfilingStats _elem10;
                _elem10 = new ProfilingStats();
                _elem10.read(iprot);
                this.profiles.add(_elem10);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BRANCH_INFO:
          if (__field.type == TType.STRUCT) {
            this.branch_info = new PlanNodeBranchInfo();
            this.branch_info.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case DEPENDENCIES:
          if (__field.type == TType.LIST) {
            {
              TList _list11 = iprot.readListBegin();
              this.dependencies = new ArrayList<Long>(Math.max(0, _list11.size));
              for (int _i12 = 0; 
                   (_list11.size < 0) ? iprot.peekList() : (_i12 < _list11.size); 
                   ++_i12)
              {
                long _elem13;
                _elem13 = iprot.readI64();
                this.dependencies.add(_elem13);
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
    if (!isSetId()) {
      throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeBinary(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI64(this.id);
    oprot.writeFieldEnd();
    if (this.output_var != null) {
      oprot.writeFieldBegin(OUTPUT_VAR_FIELD_DESC);
      oprot.writeBinary(this.output_var);
      oprot.writeFieldEnd();
    }
    if (this.description != null) {
      if (isSetDescription()) {
        oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.description.size()));
          for (Pair _iter14 : this.description)          {
            _iter14.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.profiles != null) {
      if (isSetProfiles()) {
        oprot.writeFieldBegin(PROFILES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.profiles.size()));
          for (ProfilingStats _iter15 : this.profiles)          {
            _iter15.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.branch_info != null) {
      if (isSetBranch_info()) {
        oprot.writeFieldBegin(BRANCH_INFO_FIELD_DESC);
        this.branch_info.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.dependencies != null) {
      if (isSetDependencies()) {
        oprot.writeFieldBegin(DEPENDENCIES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I64, this.dependencies.size()));
          for (long _iter16 : this.dependencies)          {
            oprot.writeI64(_iter16);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
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
    StringBuilder sb = new StringBuilder("PlanNodeDescription");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("name");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getName() == null) {
      sb.append("null");
    } else {
        int __name_size = Math.min(this.getName().length, 128);
        for (int i = 0; i < __name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getName()[i]).length() > 1 ? Integer.toHexString(this.getName()[i]).substring(Integer.toHexString(this.getName()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getName()[i]).toUpperCase());
        }
        if (this.getName().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getId(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("output_var");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getOutput_var() == null) {
      sb.append("null");
    } else {
        int __output_var_size = Math.min(this.getOutput_var().length, 128);
        for (int i = 0; i < __output_var_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getOutput_var()[i]).length() > 1 ? Integer.toHexString(this.getOutput_var()[i]).substring(Integer.toHexString(this.getOutput_var()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getOutput_var()[i]).toUpperCase());
        }
        if (this.getOutput_var().length > 128) sb.append(" ...");
    }
    first = false;
    if (isSetDescription())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("description");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getDescription() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getDescription(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetProfiles())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("profiles");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getProfiles() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getProfiles(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetBranch_info())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("branch_info");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getBranch_info() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getBranch_info(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetDependencies())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("dependencies");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getDependencies() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getDependencies(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (name == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'name' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    if (output_var == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'output_var' was not present! Struct: " + toString());
    }
  }

}

