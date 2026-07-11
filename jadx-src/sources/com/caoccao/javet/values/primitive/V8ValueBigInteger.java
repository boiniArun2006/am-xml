package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.ArrayUtils;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class V8ValueBigInteger extends V8ValueBigNumber<BigInteger> {
    private static final int BYTE_COUNT_PER_WORD = 8;

    public V8ValueBigInteger(V8Runtime v8Runtime) throws JavetException {
        this(v8Runtime, BigInteger.ZERO);
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueBigInteger toClone(boolean z2) throws JavetException {
        return this;
    }

    @Override // com.caoccao.javet.values.primitive.V8ValuePrimitive
    public String toString() {
        return toString(10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V8ValueBigInteger(V8Runtime v8Runtime, BigInteger bigInteger) throws JavetException {
        super(v8Runtime, bigInteger);
        Objects.requireNonNull(bigInteger);
    }

    static BigInteger toBigInteger(int i2, long[] jArr) {
        if (i2 == 0 || i2 > 1 || i2 < -1 || ArrayUtils.isEmpty(jArr)) {
            return BigInteger.ZERO;
        }
        int length = jArr.length;
        byte[] bArr = new byte[length * 8];
        for (int i3 = 0; i3 < length; i3++) {
            int i5 = ((length - 1) - i3) * 8;
            int i7 = i5 + 8;
            long j2 = jArr[i3];
            for (int i8 = i5; i8 < i7; i8++) {
                bArr[i8] = (byte) ((j2 >> (((i5 + 7) - i8) * 8)) & 255);
            }
        }
        return new BigInteger(i2, bArr);
    }

    static long[] toLongArray(int i2, byte[] bArr) {
        if (i2 == 0) {
            return null;
        }
        int length = bArr.length;
        int i3 = (length + 7) / 8;
        long[] jArr = new long[i3];
        int i5 = 0;
        while (true) {
            long j2 = 0;
            if (i5 >= i3) {
                break;
            }
            int i7 = i5 + 1;
            int i8 = length - (i7 * 8);
            int i9 = i8 + 8;
            for (int iMax = Math.max(0, i8); iMax < i9; iMax++) {
                j2 |= ((long) ((i2 < 0 ? ~bArr[iMax] : bArr[iMax]) & 255)) << (((i8 + 7) - iMax) * 8);
            }
            jArr[i5] = j2;
            i5 = i7;
        }
        if (i2 < 0) {
            for (int i10 = 0; i10 < i3; i10++) {
                long j3 = jArr[i10] + 1;
                jArr[i10] = j3;
                if (j3 != 0) {
                    break;
                }
            }
        }
        return jArr;
    }

    @Override // com.caoccao.javet.values.IV8Value
    public boolean asBoolean() {
        return !BigInteger.ZERO.equals(this.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public double asDouble() {
        return ((BigInteger) this.value).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public int asInt() {
        return ((BigInteger) this.value).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public long asLong() {
        return ((BigInteger) this.value).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    long[] getLongArray() {
        return toLongArray(((BigInteger) this.value).signum(), ((BigInteger) this.value).toByteArray());
    }

    /* JADX WARN: Multi-variable type inference failed */
    int getSignum() {
        return ((BigInteger) this.value).signum();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BigInteger toPrimitive() {
        return (BigInteger) this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString(int i2) {
        return ((BigInteger) this.value).toString(i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V8ValueBigInteger(V8Runtime v8Runtime, String str) throws JavetException {
        this(v8Runtime, new BigInteger(str));
        Objects.requireNonNull(str);
    }

    V8ValueBigInteger(V8Runtime v8Runtime, int i2, long[] jArr) throws JavetException {
        this(v8Runtime, toBigInteger(i2, jArr));
    }
}
