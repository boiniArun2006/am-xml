package com.google.protobuf;

import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class g9 {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = getUnsafe();
    private static final Class<?> MEMORY_CLASS = com.google.protobuf.Ml.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final I28 MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    private static abstract class I28 {
        Unsafe unsafe;

        public abstract void copyMemory(long j2, byte[] bArr, long j3, long j4);

        public abstract void copyMemory(byte[] bArr, long j2, long j3, long j4);

        public abstract boolean getBoolean(Object obj, long j2);

        public abstract byte getByte(long j2);

        public abstract byte getByte(Object obj, long j2);

        public abstract double getDouble(Object obj, long j2);

        public abstract float getFloat(Object obj, long j2);

        public abstract int getInt(long j2);

        public final int getInt(Object obj, long j2) {
            return this.unsafe.getInt(obj, j2);
        }

        public abstract long getLong(long j2);

        public final long getLong(Object obj, long j2) {
            return this.unsafe.getLong(obj, j2);
        }

        public abstract Object getStaticObject(Field field);

        public abstract void putBoolean(Object obj, long j2, boolean z2);

        public abstract void putByte(long j2, byte b2);

        public abstract void putByte(Object obj, long j2, byte b2);

        public abstract void putDouble(Object obj, long j2, double d2);

        public abstract void putFloat(Object obj, long j2, float f3);

        public abstract void putInt(long j2, int i2);

        public final void putInt(Object obj, long j2, int i2) {
            this.unsafe.putInt(obj, j2, i2);
        }

        public abstract void putLong(long j2, long j3);

        public final void putLong(Object obj, long j2, long j3) {
            this.unsafe.putLong(obj, j2, j3);
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.unsafe.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.unsafe.arrayIndexScale(cls);
        }

        public final Object getObject(Object obj, long j2) {
            return this.unsafe.getObject(obj, j2);
        }

        public final long objectFieldOffset(Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public final void putObject(Object obj, long j2, Object obj2) {
            this.unsafe.putObject(obj, j2, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                g9.logMissingMethod(th);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return g9.bufferAddressField() != null;
            } catch (Throwable th) {
                g9.logMissingMethod(th);
                return false;
            }
        }

        I28(Unsafe unsafe) {
            this.unsafe = unsafe;
        }
    }

    private static final class Ml extends I28 {
        @Override // com.google.protobuf.g9.I28
        public void copyMemory(long j2, byte[] bArr, long j3, long j4) {
            this.unsafe.copyMemory((Object) null, j2, bArr, g9.BYTE_ARRAY_BASE_OFFSET + j3, j4);
        }

        @Override // com.google.protobuf.g9.I28
        public byte getByte(Object obj, long j2) {
            return this.unsafe.getByte(obj, j2);
        }

        @Override // com.google.protobuf.g9.I28
        public void putByte(Object obj, long j2, byte b2) {
            this.unsafe.putByte(obj, j2, b2);
        }

        @Override // com.google.protobuf.g9.I28
        public void copyMemory(byte[] bArr, long j2, long j3, long j4) {
            this.unsafe.copyMemory(bArr, g9.BYTE_ARRAY_BASE_OFFSET + j2, (Object) null, j3, j4);
        }

        @Override // com.google.protobuf.g9.I28
        public boolean getBoolean(Object obj, long j2) {
            return this.unsafe.getBoolean(obj, j2);
        }

        @Override // com.google.protobuf.g9.I28
        public byte getByte(long j2) {
            return this.unsafe.getByte(j2);
        }

        @Override // com.google.protobuf.g9.I28
        public double getDouble(Object obj, long j2) {
            return this.unsafe.getDouble(obj, j2);
        }

        @Override // com.google.protobuf.g9.I28
        public float getFloat(Object obj, long j2) {
            return this.unsafe.getFloat(obj, j2);
        }

        @Override // com.google.protobuf.g9.I28
        public int getInt(long j2) {
            return this.unsafe.getInt(j2);
        }

        @Override // com.google.protobuf.g9.I28
        public long getLong(long j2) {
            return this.unsafe.getLong(j2);
        }

        @Override // com.google.protobuf.g9.I28
        public Object getStaticObject(Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }

        @Override // com.google.protobuf.g9.I28
        public void putBoolean(Object obj, long j2, boolean z2) {
            this.unsafe.putBoolean(obj, j2, z2);
        }

        @Override // com.google.protobuf.g9.I28
        public void putByte(long j2, byte b2) {
            this.unsafe.putByte(j2, b2);
        }

        @Override // com.google.protobuf.g9.I28
        public void putDouble(Object obj, long j2, double d2) {
            this.unsafe.putDouble(obj, j2, d2);
        }

        @Override // com.google.protobuf.g9.I28
        public void putFloat(Object obj, long j2, float f3) {
            this.unsafe.putFloat(obj, j2, f3);
        }

        @Override // com.google.protobuf.g9.I28
        public void putInt(long j2, int i2) {
            this.unsafe.putInt(j2, i2);
        }

        @Override // com.google.protobuf.g9.I28
        public void putLong(long j2, long j3) {
            this.unsafe.putLong(j2, j3);
        }

        @Override // com.google.protobuf.g9.I28
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                g9.logMissingMethod(th);
                return false;
            }
        }

        @Override // com.google.protobuf.g9.I28
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                g9.logMissingMethod(th);
                return false;
            }
        }

        Ml(Unsafe unsafe) {
            super(unsafe);
        }
    }

    class j implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        j() {
        }
    }

    private static final class n extends I28 {
        private static final long SMALL_ADDRESS_MASK = -1;

        private static int smallAddress(long j2) {
            return (int) j2;
        }

        @Override // com.google.protobuf.g9.I28
        public void copyMemory(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public byte getByte(Object obj, long j2) {
            return g9.IS_BIG_ENDIAN ? g9.getByteBigEndian(obj, j2) : g9.getByteLittleEndian(obj, j2);
        }

        @Override // com.google.protobuf.g9.I28
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.g9.I28
        public void putByte(Object obj, long j2, byte b2) {
            if (g9.IS_BIG_ENDIAN) {
                g9.putByteBigEndian(obj, j2, b2);
            } else {
                g9.putByteLittleEndian(obj, j2, b2);
            }
        }

        @Override // com.google.protobuf.g9.I28
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.g9.I28
        public void copyMemory(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public boolean getBoolean(Object obj, long j2) {
            return g9.IS_BIG_ENDIAN ? g9.getBooleanBigEndian(obj, j2) : g9.getBooleanLittleEndian(obj, j2);
        }

        @Override // com.google.protobuf.g9.I28
        public int getInt(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public long getLong(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public void putBoolean(Object obj, long j2, boolean z2) {
            if (g9.IS_BIG_ENDIAN) {
                g9.putBooleanBigEndian(obj, j2, z2);
            } else {
                g9.putBooleanLittleEndian(obj, j2, z2);
            }
        }

        @Override // com.google.protobuf.g9.I28
        public void putInt(long j2, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public void putLong(long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        n(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.g9.I28
        public double getDouble(Object obj, long j2) {
            return Double.longBitsToDouble(getLong(obj, j2));
        }

        @Override // com.google.protobuf.g9.I28
        public float getFloat(Object obj, long j2) {
            return Float.intBitsToFloat(getInt(obj, j2));
        }

        @Override // com.google.protobuf.g9.I28
        public void putDouble(Object obj, long j2, double d2) {
            putLong(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.protobuf.g9.I28
        public void putFloat(Object obj, long j2, float f3) {
            putInt(obj, j2, Float.floatToIntBits(f3));
        }

        @Override // com.google.protobuf.g9.I28
        public byte getByte(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public void putByte(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class w6 extends I28 {
        @Override // com.google.protobuf.g9.I28
        public void copyMemory(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public byte getByte(Object obj, long j2) {
            return g9.IS_BIG_ENDIAN ? g9.getByteBigEndian(obj, j2) : g9.getByteLittleEndian(obj, j2);
        }

        @Override // com.google.protobuf.g9.I28
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.g9.I28
        public void putByte(Object obj, long j2, byte b2) {
            if (g9.IS_BIG_ENDIAN) {
                g9.putByteBigEndian(obj, j2, b2);
            } else {
                g9.putByteLittleEndian(obj, j2, b2);
            }
        }

        @Override // com.google.protobuf.g9.I28
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.g9.I28
        public void copyMemory(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public boolean getBoolean(Object obj, long j2) {
            return g9.IS_BIG_ENDIAN ? g9.getBooleanBigEndian(obj, j2) : g9.getBooleanLittleEndian(obj, j2);
        }

        @Override // com.google.protobuf.g9.I28
        public int getInt(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public long getLong(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public void putBoolean(Object obj, long j2, boolean z2) {
            if (g9.IS_BIG_ENDIAN) {
                g9.putBooleanBigEndian(obj, j2, z2);
            } else {
                g9.putBooleanLittleEndian(obj, j2, z2);
            }
        }

        @Override // com.google.protobuf.g9.I28
        public void putInt(long j2, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public void putLong(long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        w6(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.g9.I28
        public double getDouble(Object obj, long j2) {
            return Double.longBitsToDouble(getLong(obj, j2));
        }

        @Override // com.google.protobuf.g9.I28
        public float getFloat(Object obj, long j2) {
            return Float.intBitsToFloat(getInt(obj, j2));
        }

        @Override // com.google.protobuf.g9.I28
        public void putDouble(Object obj, long j2, double d2) {
            putLong(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.protobuf.g9.I28
        public void putFloat(Object obj, long j2, float f3) {
            putInt(obj, j2, Float.floatToIntBits(f3));
        }

        @Override // com.google.protobuf.g9.I28
        public byte getByte(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.g9.I28
        public void putByte(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }
    }

    static void copyMemory(byte[] bArr, long j2, long j3, long j4) {
        MEMORY_ACCESSOR.copyMemory(bArr, j2, j3, j4);
    }

    static boolean getBoolean(Object obj, long j2) {
        return MEMORY_ACCESSOR.getBoolean(obj, j2);
    }

    static byte getByte(Object obj, long j2) {
        return MEMORY_ACCESSOR.getByte(obj, j2);
    }

    static double getDouble(Object obj, long j2) {
        return MEMORY_ACCESSOR.getDouble(obj, j2);
    }

    static float getFloat(Object obj, long j2) {
        return MEMORY_ACCESSOR.getFloat(obj, j2);
    }

    static int getInt(Object obj, long j2) {
        return MEMORY_ACCESSOR.getInt(obj, j2);
    }

    static long getLong(Object obj, long j2) {
        return MEMORY_ACCESSOR.getLong(obj, j2);
    }

    static Object getObject(Object obj, long j2) {
        return MEMORY_ACCESSOR.getObject(obj, j2);
    }

    static void putBoolean(Object obj, long j2, boolean z2) {
        MEMORY_ACCESSOR.putBoolean(obj, j2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j2, boolean z2) {
        putByteBigEndian(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j2, boolean z2) {
        putByteLittleEndian(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    static void putByte(Object obj, long j2, byte b2) {
        MEMORY_ACCESSOR.putByte(obj, j2, b2);
    }

    static void putDouble(Object obj, long j2, double d2) {
        MEMORY_ACCESSOR.putDouble(obj, j2, d2);
    }

    static void putFloat(Object obj, long j2, float f3) {
        MEMORY_ACCESSOR.putFloat(obj, j2, f3);
    }

    static void putInt(Object obj, long j2, int i2) {
        MEMORY_ACCESSOR.putInt(obj, j2, i2);
    }

    static void putLong(Object obj, long j2, long j3) {
        MEMORY_ACCESSOR.putLong(obj, j2, j3);
    }

    static void putObject(Object obj, long j2, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j2, obj2);
    }

    static long addressOffset(ByteBuffer byteBuffer) {
        return MEMORY_ACCESSOR.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int arrayBaseOffset(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(cls);
        }
        return -1;
    }

    static void copyMemory(long j2, byte[] bArr, long j3, long j4) {
        MEMORY_ACCESSOR.copyMemory(j2, bArr, j3, j4);
    }

    static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (!com.google.protobuf.Ml.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class<?> cls2 = MEMORY_CLASS;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static long fieldOffset(Field field) {
        I28 i28;
        if (field == null || (i28 = MEMORY_ACCESSOR) == null) {
            return -1L;
        }
        return i28.objectFieldOffset(field);
    }

    private static int firstDifferingByteIndexNativeEndian(long j2, long j3) {
        return (IS_BIG_ENDIAN ? Long.numberOfLeadingZeros(j2 ^ j3) : Long.numberOfTrailingZeros(j2 ^ j3)) >> 3;
    }

    static boolean getBoolean(boolean[] zArr, long j2) {
        return MEMORY_ACCESSOR.getBoolean(zArr, BOOLEAN_ARRAY_BASE_OFFSET + (j2 * BOOLEAN_ARRAY_INDEX_SCALE));
    }

    static byte getByte(byte[] bArr, long j2) {
        return MEMORY_ACCESSOR.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j2) {
        return (byte) ((getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j2) {
        return (byte) ((getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    static double getDouble(double[] dArr, long j2) {
        return MEMORY_ACCESSOR.getDouble(dArr, DOUBLE_ARRAY_BASE_OFFSET + (j2 * DOUBLE_ARRAY_INDEX_SCALE));
    }

    static float getFloat(float[] fArr, long j2) {
        return MEMORY_ACCESSOR.getFloat(fArr, FLOAT_ARRAY_BASE_OFFSET + (j2 * FLOAT_ARRAY_INDEX_SCALE));
    }

    static int getInt(int[] iArr, long j2) {
        return MEMORY_ACCESSOR.getInt(iArr, INT_ARRAY_BASE_OFFSET + (j2 * INT_ARRAY_INDEX_SCALE));
    }

    static long getLong(long[] jArr, long j2) {
        return MEMORY_ACCESSOR.getLong(jArr, LONG_ARRAY_BASE_OFFSET + (j2 * LONG_ARRAY_INDEX_SCALE));
    }

    private static I28 getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.protobuf.Ml.isOnAndroidDevice()) {
            return new Ml(unsafe);
        }
        if (IS_ANDROID_64) {
            return new w6(unsafe);
        }
        if (IS_ANDROID_32) {
            return new n(unsafe);
        }
        return null;
    }

    static Object getObject(Object[] objArr, long j2) {
        return MEMORY_ACCESSOR.getObject(objArr, OBJECT_ARRAY_BASE_OFFSET + (j2 * OBJECT_ARRAY_INDEX_SCALE));
    }

    static Object getStaticObject(Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable th) {
        Logger.getLogger(g9.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static int mismatch(byte[] bArr, int i2, byte[] bArr2, int i3, int i5) {
        if (i2 < 0 || i3 < 0 || i5 < 0 || i2 + i5 > bArr.length || i3 + i5 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i7 = 0;
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            for (int i8 = (BYTE_ARRAY_ALIGNMENT + i2) & 7; i7 < i5 && (i8 & 7) != 0; i8++) {
                if (bArr[i2 + i7] != bArr2[i3 + i7]) {
                    return i7;
                }
                i7++;
            }
            int i9 = ((i5 - i7) & (-8)) + i7;
            while (i7 < i9) {
                long j2 = BYTE_ARRAY_BASE_OFFSET;
                long j3 = i7;
                long j4 = getLong((Object) bArr, ((long) i2) + j2 + j3);
                long j5 = getLong((Object) bArr2, j2 + ((long) i3) + j3);
                if (j4 != j5) {
                    return i7 + firstDifferingByteIndexNativeEndian(j4, j5);
                }
                i7 += 8;
            }
        }
        while (i7 < i5) {
            if (bArr[i2 + i7] != bArr2[i3 + i7]) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    static long objectFieldOffset(Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    static void putBoolean(boolean[] zArr, long j2, boolean z2) {
        MEMORY_ACCESSOR.putBoolean(zArr, BOOLEAN_ARRAY_BASE_OFFSET + (j2 * BOOLEAN_ARRAY_INDEX_SCALE), z2);
    }

    static void putByte(byte[] bArr, long j2, byte b2) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        putInt(obj, j3, ((255 & b2) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        putInt(obj, j3, ((255 & b2) << i2) | (getInt(obj, j3) & (~(255 << i2))));
    }

    static void putDouble(double[] dArr, long j2, double d2) {
        MEMORY_ACCESSOR.putDouble(dArr, DOUBLE_ARRAY_BASE_OFFSET + (j2 * DOUBLE_ARRAY_INDEX_SCALE), d2);
    }

    static void putFloat(float[] fArr, long j2, float f3) {
        MEMORY_ACCESSOR.putFloat(fArr, FLOAT_ARRAY_BASE_OFFSET + (j2 * FLOAT_ARRAY_INDEX_SCALE), f3);
    }

    static void putInt(int[] iArr, long j2, int i2) {
        MEMORY_ACCESSOR.putInt(iArr, INT_ARRAY_BASE_OFFSET + (j2 * INT_ARRAY_INDEX_SCALE), i2);
    }

    static void putLong(long[] jArr, long j2, long j3) {
        MEMORY_ACCESSOR.putLong(jArr, LONG_ARRAY_BASE_OFFSET + (j2 * LONG_ARRAY_INDEX_SCALE), j3);
    }

    static void putObject(Object[] objArr, long j2, Object obj) {
        MEMORY_ACCESSOR.putObject(objArr, OBJECT_ARRAY_BASE_OFFSET + (j2 * OBJECT_ARRAY_INDEX_SCALE), obj);
    }

    private static boolean supportsUnsafeArrayOperations() {
        I28 i28 = MEMORY_ACCESSOR;
        if (i28 == null) {
            return false;
        }
        return i28.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        I28 i28 = MEMORY_ACCESSOR;
        if (i28 == null) {
            return false;
        }
        return i28.supportsUnsafeByteBufferOperations();
    }

    static {
        boolean z2;
        long jArrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = jArrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (jArrayBaseOffset & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        } else {
            z2 = false;
        }
        IS_BIG_ENDIAN = z2;
    }

    private g9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field bufferAddressField() {
        Field field;
        if (com.google.protobuf.Ml.isOnAndroidDevice() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        Field field2 = field(Buffer.class, SafeDKWebAppInterface.f62924j);
        if (field2 != null && field2.getType() == Long.TYPE) {
            return field2;
        }
        return null;
    }

    static void copyMemory(byte[] bArr, long j2, byte[] bArr2, long j3, long j4) {
        System.arraycopy(bArr, (int) j2, bArr2, (int) j3, (int) j4);
    }

    private static Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j2) {
        if (getByteBigEndian(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j2) {
        if (getByteLittleEndian(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    static byte getByte(long j2) {
        return MEMORY_ACCESSOR.getByte(j2);
    }

    static int getInt(long j2) {
        return MEMORY_ACCESSOR.getInt(j2);
    }

    static long getLong(long j2) {
        return MEMORY_ACCESSOR.getLong(j2);
    }

    static void putByte(long j2, byte b2) {
        MEMORY_ACCESSOR.putByte(j2, b2);
    }

    static void putInt(long j2, int i2) {
        MEMORY_ACCESSOR.putInt(j2, i2);
    }

    static void putLong(long j2, long j3) {
        MEMORY_ACCESSOR.putLong(j2, j3);
    }
}
