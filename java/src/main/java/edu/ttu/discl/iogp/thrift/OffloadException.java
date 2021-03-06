/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.ttu.discl.iogp.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2016-7-24")
public class OffloadException extends TException implements org.apache.thrift.TBase<OffloadException, OffloadException._Fields>, java.io.Serializable, Cloneable, Comparable<OffloadException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OffloadException");

  private static final org.apache.thrift.protocol.TField SRC_FIELD_DESC = new org.apache.thrift.protocol.TField("src", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OffloadExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OffloadExceptionTupleSchemeFactory());
  }

  public ByteBuffer src; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SRC((short)1, "src");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SRC
          return SRC;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SRC, new org.apache.thrift.meta_data.FieldMetaData("src", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OffloadException.class, metaDataMap);
  }

  public OffloadException() {
  }

  public OffloadException(
    ByteBuffer src)
  {
    this();
    this.src = org.apache.thrift.TBaseHelper.copyBinary(src);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OffloadException(OffloadException other) {
    if (other.isSetSrc()) {
      this.src = org.apache.thrift.TBaseHelper.copyBinary(other.src);
    }
  }

  public OffloadException deepCopy() {
    return new OffloadException(this);
  }

  @Override
  public void clear() {
    this.src = null;
  }

  public byte[] getSrc() {
    setSrc(org.apache.thrift.TBaseHelper.rightSize(src));
    return src == null ? null : src.array();
  }

  public ByteBuffer bufferForSrc() {
    return org.apache.thrift.TBaseHelper.copyBinary(src);
  }

  public OffloadException setSrc(byte[] src) {
    this.src = src == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(src, src.length));
    return this;
  }

  public OffloadException setSrc(ByteBuffer src) {
    this.src = org.apache.thrift.TBaseHelper.copyBinary(src);
    return this;
  }

  public void unsetSrc() {
    this.src = null;
  }

  /** Returns true if field src is set (has been assigned a value) and false otherwise */
  public boolean isSetSrc() {
    return this.src != null;
  }

  public void setSrcIsSet(boolean value) {
    if (!value) {
      this.src = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SRC:
      if (value == null) {
        unsetSrc();
      } else {
        setSrc((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SRC:
      return getSrc();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SRC:
      return isSetSrc();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OffloadException)
      return this.equals((OffloadException)that);
    return false;
  }

  public boolean equals(OffloadException that) {
    if (that == null)
      return false;

    boolean this_present_src = true && this.isSetSrc();
    boolean that_present_src = true && that.isSetSrc();
    if (this_present_src || that_present_src) {
      if (!(this_present_src && that_present_src))
        return false;
      if (!this.src.equals(that.src))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_src = true && (isSetSrc());
    list.add(present_src);
    if (present_src)
      list.add(src);

    return list.hashCode();
  }

  @Override
  public int compareTo(OffloadException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSrc()).compareTo(other.isSetSrc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSrc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.src, other.src);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("OffloadException(");
    boolean first = true;

    sb.append("src:");
    if (this.src == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.src, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (src == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'src' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OffloadExceptionStandardSchemeFactory implements SchemeFactory {
    public OffloadExceptionStandardScheme getScheme() {
      return new OffloadExceptionStandardScheme();
    }
  }

  private static class OffloadExceptionStandardScheme extends StandardScheme<OffloadException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OffloadException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SRC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.src = iprot.readBinary();
              struct.setSrcIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, OffloadException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.src != null) {
        oprot.writeFieldBegin(SRC_FIELD_DESC);
        oprot.writeBinary(struct.src);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OffloadExceptionTupleSchemeFactory implements SchemeFactory {
    public OffloadExceptionTupleScheme getScheme() {
      return new OffloadExceptionTupleScheme();
    }
  }

  private static class OffloadExceptionTupleScheme extends TupleScheme<OffloadException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OffloadException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBinary(struct.src);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OffloadException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.src = iprot.readBinary();
      struct.setSrcIsSet(true);
    }
  }

}

