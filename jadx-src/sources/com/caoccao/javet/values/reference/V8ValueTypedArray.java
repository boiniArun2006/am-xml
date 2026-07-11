package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.converters.JavetObjectConverter;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.virtual.V8VirtualValue;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class V8ValueTypedArray extends V8ValueObject implements IV8ValueTypedArray {
    public static final int EIGHT_BYTES_PER_VALUE = 8;
    public static final int FOUR_BYTES_PER_VALUE = 4;
    public static final int ONE_BYTE_PER_VALUE = 1;
    public static final String PROPERTY_BUFFER = "buffer";
    public static final String PROPERTY_BYTE_LENGTH = "byteLength";
    public static final String PROPERTY_BYTE_OFFSET = "byteOffset";
    public static final int TWO_BYTES_PER_VALUE = 2;
    public static final int ZERO_BYTE_PER_VALUE = 0;
    protected int sizeInBytes;
    protected V8ValueReferenceType type;

    /* JADX INFO: renamed from: com.caoccao.javet.values.reference.V8ValueTypedArray$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType;

        static {
            int[] iArr = new int[V8ValueReferenceType.values().length];
            $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType = iArr;
            try {
                iArr[V8ValueReferenceType.Int8Array.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint8Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint8ClampedArray.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Int32Array.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint32Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.BigInt64Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.BigUint64Array.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Int16Array.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint16Array.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Float16Array.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Float32Array.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Float64Array.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public <T extends V8Value> T get(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            T t3 = (T) this.v8Runtime.getV8Internal().objectGet(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return t3;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueTypedArray
    public V8ValueArrayBuffer getBuffer() throws JavetException {
        return (V8ValueArrayBuffer) get(PROPERTY_BUFFER);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueTypedArray
    public int getByteLength() throws JavetException {
        return getInteger(PROPERTY_BYTE_LENGTH).intValue();
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueTypedArray
    public int getByteOffset() throws JavetException {
        return getInteger(PROPERTY_BYTE_OFFSET).intValue();
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueTypedArray
    public int getSizeInBytes() {
        return this.sizeInBytes;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return this.type;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueTypedArray
    public boolean isValid() {
        return this.type != V8ValueReferenceType.Invalid;
    }

    protected void setType(V8ValueReferenceType v8ValueReferenceType) {
        switch (AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[v8ValueReferenceType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.sizeInBytes = 1;
                break;
            case 4:
            case 5:
            case 11:
                this.sizeInBytes = 4;
                break;
            case 6:
            case 7:
            case 12:
                this.sizeInBytes = 8;
                break;
            case 8:
            case 9:
            case 10:
                this.sizeInBytes = 2;
                break;
            default:
                v8ValueReferenceType = V8ValueReferenceType.Invalid;
                this.sizeInBytes = 0;
                break;
        }
        this.type = v8ValueReferenceType;
    }

    public byte[] toBytes() throws JavetException {
        int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[getType().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return null;
        }
        V8ValueArrayBuffer buffer = getBuffer();
        try {
            byte[] bytes = buffer.toBytes();
            buffer.close();
            return bytes;
        } catch (Throwable th) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public int[] toIntegers() throws JavetException {
        int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[getType().ordinal()];
        if (i2 != 4 && i2 != 5) {
            return null;
        }
        V8ValueArrayBuffer buffer = getBuffer();
        try {
            int[] integers = buffer.toIntegers();
            buffer.close();
            return integers;
        } catch (Throwable th) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long[] toLongs() throws JavetException {
        int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[getType().ordinal()];
        if (i2 != 6 && i2 != 7) {
            return null;
        }
        V8ValueArrayBuffer buffer = getBuffer();
        try {
            long[] longs = buffer.toLongs();
            buffer.close();
            return longs;
        } catch (Throwable th) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public short[] toShorts() throws JavetException {
        switch (AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[getType().ordinal()]) {
            case 8:
            case 9:
            case 10:
                V8ValueArrayBuffer buffer = getBuffer();
                try {
                    short[] shorts = buffer.toShorts();
                    buffer.close();
                    return shorts;
                } catch (Throwable th) {
                    if (buffer != null) {
                        try {
                            buffer.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        break;
                    }
                    throw th;
                }
            default:
                return null;
        }
    }

    V8ValueTypedArray(V8Runtime v8Runtime, long j2, int i2) throws JavetException {
        super(v8Runtime, j2);
        setType(V8ValueReferenceType.parse(i2));
    }

    public boolean fromBytes(byte[] bArr) throws JavetException {
        Objects.requireNonNull(bArr);
        int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[getType().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return false;
        }
        V8ValueArrayBuffer buffer = getBuffer();
        try {
            boolean zFromBytes = buffer.fromBytes(bArr);
            buffer.close();
            return zFromBytes;
        } catch (Throwable th) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean fromDoubles(double[] dArr) throws JavetException {
        Objects.requireNonNull(dArr);
        if (getType() == V8ValueReferenceType.Float64Array) {
            V8ValueArrayBuffer buffer = getBuffer();
            try {
                boolean zFromDoubles = buffer.fromDoubles(dArr);
                buffer.close();
                return zFromDoubles;
            } catch (Throwable th) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return false;
    }

    public boolean fromFloats(float[] fArr) throws JavetException {
        Objects.requireNonNull(fArr);
        if (getType() == V8ValueReferenceType.Float32Array) {
            V8ValueArrayBuffer buffer = getBuffer();
            try {
                boolean zFromFloats = buffer.fromFloats(fArr);
                buffer.close();
                return zFromFloats;
            } catch (Throwable th) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return false;
    }

    public boolean fromIntegers(int[] iArr) throws JavetException {
        Objects.requireNonNull(iArr);
        int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[getType().ordinal()];
        if (i2 != 4 && i2 != 5) {
            return false;
        }
        V8ValueArrayBuffer buffer = getBuffer();
        try {
            boolean zFromIntegers = buffer.fromIntegers(iArr);
            buffer.close();
            return zFromIntegers;
        } catch (Throwable th) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean fromLongs(long[] jArr) throws JavetException {
        Objects.requireNonNull(jArr);
        int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[getType().ordinal()];
        if (i2 != 6 && i2 != 7) {
            return false;
        }
        V8ValueArrayBuffer buffer = getBuffer();
        try {
            boolean zFromLongs = buffer.fromLongs(jArr);
            buffer.close();
            return zFromLongs;
        } catch (Throwable th) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean fromShorts(short[] sArr) throws JavetException {
        Objects.requireNonNull(sArr);
        switch (AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[getType().ordinal()]) {
            case 8:
            case 9:
            case 10:
                V8ValueArrayBuffer buffer = getBuffer();
                try {
                    boolean zFromShorts = buffer.fromShorts(sArr);
                    buffer.close();
                    return zFromShorts;
                } catch (Throwable th) {
                    if (buffer != null) {
                        try {
                            buffer.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        break;
                    }
                    throw th;
                }
            default:
                return false;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueTypedArray
    public int getLength() throws JavetException {
        return checkV8Runtime().getV8Internal().arrayGetLength(this);
    }

    public double[] toDoubles() throws JavetException {
        if (getType() == V8ValueReferenceType.Float64Array) {
            V8ValueArrayBuffer buffer = getBuffer();
            try {
                double[] doubles = buffer.toDoubles();
                buffer.close();
                return doubles;
            } catch (Throwable th) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return null;
    }

    public float[] toFloats() throws JavetException {
        if (getType() == V8ValueReferenceType.Float32Array) {
            V8ValueArrayBuffer buffer = getBuffer();
            try {
                float[] floats = buffer.toFloats();
                buffer.close();
                return floats;
            } catch (Throwable th) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return null;
    }
}
