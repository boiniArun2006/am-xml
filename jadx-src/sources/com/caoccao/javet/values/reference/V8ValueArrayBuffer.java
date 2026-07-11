package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8ValueArrayBuffer extends V8ValueObject {
    protected static final int BYTE_LENGTH_1 = 1;
    protected static final int BYTE_LENGTH_2 = 2;
    protected static final int BYTE_LENGTH_3 = 3;
    protected static final String PROPERTY_BYTE_LENGTH = "byteLength";
    protected ByteBuffer byteBuffer;
    protected ByteOrder byteOrder;

    public boolean fromBytes(byte[] bArr) {
        if (bArr == null || bArr.length <= 0 || bArr.length != this.byteBuffer.capacity()) {
            return false;
        }
        this.byteBuffer.put(bArr);
        return true;
    }

    public boolean fromDoubles(double[] dArr) {
        if (dArr == null || dArr.length <= 0 || dArr.length != (this.byteBuffer.capacity() >> 3)) {
            return false;
        }
        this.byteBuffer.order(this.byteOrder).asDoubleBuffer().put(dArr);
        return true;
    }

    public boolean fromFloats(float[] fArr) {
        if (fArr == null || fArr.length <= 0 || fArr.length != (this.byteBuffer.capacity() >> 2)) {
            return false;
        }
        this.byteBuffer.order(this.byteOrder).asFloatBuffer().put(fArr);
        return true;
    }

    public boolean fromIntegers(int[] iArr) {
        if (iArr == null || iArr.length <= 0 || iArr.length != (this.byteBuffer.capacity() >> 2)) {
            return false;
        }
        this.byteBuffer.order(this.byteOrder).asIntBuffer().put(iArr);
        return true;
    }

    public boolean fromLongs(long[] jArr) {
        if (jArr == null || jArr.length <= 0 || jArr.length != (this.byteBuffer.capacity() >> 3)) {
            return false;
        }
        this.byteBuffer.order(this.byteOrder).asLongBuffer().put(jArr);
        return true;
    }

    public boolean fromShorts(short[] sArr) {
        if (sArr == null || sArr.length <= 0 || sArr.length != (this.byteBuffer.capacity() >> 1)) {
            return false;
        }
        this.byteBuffer.order(this.byteOrder).asShortBuffer().put(sArr);
        return true;
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    public int getByteLength() throws JavetException {
        return getInteger("byteLength").intValue();
    }

    public ByteOrder getByteOrder() {
        return this.byteOrder;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.ArrayBuffer;
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.byteBuffer.capacity()];
        this.byteBuffer.get(bArr);
        return bArr;
    }

    public double[] toDoubles() {
        double[] dArr = new double[this.byteBuffer.capacity() >> 3];
        this.byteBuffer.order(this.byteOrder).asDoubleBuffer().get(dArr);
        return dArr;
    }

    public float[] toFloats() {
        float[] fArr = new float[this.byteBuffer.capacity() >> 2];
        this.byteBuffer.order(this.byteOrder).asFloatBuffer().get(fArr);
        return fArr;
    }

    public int[] toIntegers() {
        int[] iArr = new int[this.byteBuffer.capacity() >> 2];
        this.byteBuffer.order(this.byteOrder).asIntBuffer().get(iArr);
        return iArr;
    }

    public long[] toLongs() {
        long[] jArr = new long[this.byteBuffer.capacity() >> 3];
        this.byteBuffer.order(this.byteOrder).asLongBuffer().get(jArr);
        return jArr;
    }

    public short[] toShorts() {
        short[] sArr = new short[this.byteBuffer.capacity() >> 1];
        this.byteBuffer.order(this.byteOrder).asShortBuffer().get(sArr);
        return sArr;
    }

    V8ValueArrayBuffer(V8Runtime v8Runtime, long j2, ByteBuffer byteBuffer) throws JavetException {
        super(v8Runtime, j2);
        this.byteBuffer = byteBuffer;
        this.byteOrder = ByteOrder.nativeOrder();
    }

    public void setByteOrder(ByteOrder byteOrder) {
        Objects.requireNonNull(byteOrder);
        this.byteOrder = byteOrder;
    }
}
