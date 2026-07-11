package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8ValueDataView extends V8ValueObject {
    protected static final String FUNCTION_GET_BIG_INT_64 = "getBigInt64";
    protected static final String FUNCTION_GET_FLOAT_32 = "getFloat32";
    protected static final String FUNCTION_GET_FLOAT_64 = "getFloat64";
    protected static final String FUNCTION_GET_INT_16 = "getInt16";
    protected static final String FUNCTION_GET_INT_32 = "getInt32";
    protected static final String FUNCTION_GET_INT_8 = "getInt8";
    protected static final String FUNCTION_SET_BIG_INT_64 = "setBigInt64";
    protected static final String FUNCTION_SET_FLOAT_32 = "setFloat32";
    protected static final String FUNCTION_SET_FLOAT_64 = "setFloat64";
    protected static final String FUNCTION_SET_INT_16 = "setInt16";
    protected static final String FUNCTION_SET_INT_32 = "setInt32";
    protected static final String FUNCTION_SET_INT_8 = "setInt8";
    protected static final String PROPERTY_BUFFER = "buffer";
    protected static final String PROPERTY_BYTE_LENGTH = "byteLength";
    protected static final String PROPERTY_BYTE_OFFSET = "byteOffset";

    public long getBigInt64(int i2) throws JavetException {
        return getBigInt64(i2, true);
    }

    public float getFloat32(int i2) throws JavetException {
        return getFloat32(i2, true);
    }

    public double getFloat64(int i2) throws JavetException {
        return getFloat64(i2, true);
    }

    public short getInt16(int i2) throws JavetException {
        return getInt16(i2, true);
    }

    public int getInt32(int i2) throws JavetException {
        return getInt32(i2, true);
    }

    public void setBigInt64(int i2, long j2) throws JavetException {
        setBigInt64(i2, j2, true);
    }

    public void setFloat32(int i2, float f3) throws JavetException {
        setFloat32(i2, f3, true);
    }

    public void setFloat64(int i2, double d2) throws JavetException {
        setFloat64(i2, d2, true);
    }

    public void setInt16(int i2, short s2) throws JavetException {
        setInt16(i2, s2, true);
    }

    public void setInt32(int i2, int i3) throws JavetException {
        setInt32(i2, i3, true);
    }

    public long getBigInt64(int i2, boolean z2) throws JavetException {
        return invokeLong(FUNCTION_GET_BIG_INT_64, Integer.valueOf(i2), Boolean.valueOf(z2)).longValue();
    }

    public V8ValueArrayBuffer getBuffer() throws JavetException {
        return (V8ValueArrayBuffer) get("buffer");
    }

    public int getByteLength() throws JavetException {
        return getInteger("byteLength").intValue();
    }

    public int getByteOffset() throws JavetException {
        return getInteger("byteOffset").intValue();
    }

    public float getFloat32(int i2, boolean z2) throws JavetException {
        return invokeDouble(FUNCTION_GET_FLOAT_32, Integer.valueOf(i2), Boolean.valueOf(z2)).floatValue();
    }

    public double getFloat64(int i2, boolean z2) throws JavetException {
        return invokeDouble(FUNCTION_GET_FLOAT_64, Integer.valueOf(i2), Boolean.valueOf(z2)).doubleValue();
    }

    public short getInt16(int i2, boolean z2) throws JavetException {
        return invokeInteger(FUNCTION_GET_INT_16, Integer.valueOf(i2), Boolean.valueOf(z2)).shortValue();
    }

    public int getInt32(int i2, boolean z2) throws JavetException {
        return invokeInteger(FUNCTION_GET_INT_32, Integer.valueOf(i2), Boolean.valueOf(z2)).intValue();
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.DataView;
    }

    public void setBigInt64(int i2, long j2, boolean z2) throws JavetException {
        invokeVoid(FUNCTION_SET_BIG_INT_64, Integer.valueOf(i2), Long.valueOf(j2), Boolean.valueOf(z2));
    }

    public void setFloat32(int i2, float f3, boolean z2) throws JavetException {
        invokeVoid(FUNCTION_SET_FLOAT_32, Integer.valueOf(i2), Float.valueOf(f3), Boolean.valueOf(z2));
    }

    public void setFloat64(int i2, double d2, boolean z2) throws JavetException {
        invokeVoid(FUNCTION_SET_FLOAT_64, Integer.valueOf(i2), Double.valueOf(d2), Boolean.valueOf(z2));
    }

    public void setInt16(int i2, short s2, boolean z2) throws JavetException {
        invokeVoid(FUNCTION_SET_INT_16, Integer.valueOf(i2), Short.valueOf(s2), Boolean.valueOf(z2));
    }

    public void setInt32(int i2, int i3, boolean z2) throws JavetException {
        invokeVoid(FUNCTION_SET_INT_32, Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2));
    }

    V8ValueDataView(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    public byte getInt8(int i2) throws JavetException {
        return invokeInteger(FUNCTION_GET_INT_8, Integer.valueOf(i2)).byteValue();
    }

    public void setInt8(int i2, byte b2) throws JavetException {
        invokeVoid(FUNCTION_SET_INT_8, Integer.valueOf(i2), Byte.valueOf(b2));
    }
}
