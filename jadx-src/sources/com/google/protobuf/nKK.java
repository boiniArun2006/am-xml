package com.google.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class nKK {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final AbstractC1923o EMPTY_CODED_INPUT_STREAM;
    static final Charset US_ASCII = Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
    static final Charset UTF_8 = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);
    static final Charset ISO_8859_1 = Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);

    public interface CN3 extends Dsr {
        void addInt(int i2);

        int getInt(int i2);

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ void makeImmutable();

        CN3 mutableCopyWithCapacity(int i2);

        int setInt(int i2, int i3);
    }

    public interface Dsr extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        Dsr mutableCopyWithCapacity(int i2);
    }

    public interface I28 {
        boolean isInRange(int i2);
    }

    public interface Ml {
        w6 findValueByNumber(int i2);
    }

    public interface Wre extends Dsr {
        void addFloat(float f3);

        float getFloat(int i2);

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.nKK.Dsr, com.google.protobuf.nKK.CN3
        Wre mutableCopyWithCapacity(int i2);

        float setFloat(int i2, float f3);
    }

    public interface fuX extends Dsr {
        void addLong(long j2);

        long getLong(int i2);

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.nKK.Dsr, com.google.protobuf.nKK.CN3
        fuX mutableCopyWithCapacity(int i2);

        long setLong(int i2, long j2);
    }

    public interface j extends Dsr {
        void addBoolean(boolean z2);

        boolean getBoolean(int i2);

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.nKK.Dsr, com.google.protobuf.nKK.CN3
        j mutableCopyWithCapacity(int i2);

        boolean setBoolean(int i2, boolean z2);
    }

    public interface n extends Dsr {
        void addDouble(double d2);

        double getDouble(int i2);

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.nKK.Dsr
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.nKK.Dsr, com.google.protobuf.nKK.CN3
        n mutableCopyWithCapacity(int i2);

        double setDouble(int i2, double d2);
    }

    public interface w6 {
        int getNumber();
    }

    static <T> T checkNotNull(T t3) {
        t3.getClass();
        return t3;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        qf.clear(byteBufferDuplicate);
        ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
        qf.clear(byteBufferDuplicate2);
        return byteBufferDuplicate.equals(byteBufferDuplicate2);
    }

    public static int hashBoolean(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + hashCode(it.next());
        }
        return iHashCode;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iHashCodeByteBuffer = 1;
        while (it.hasNext()) {
            iHashCodeByteBuffer = (iHashCodeByteBuffer * 31) + hashCodeByteBuffer(it.next());
        }
        return iHashCodeByteBuffer;
    }

    public static int hashLong(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static boolean isValidUtf8(C c2) {
        return c2.isValidUtf8();
    }

    static int partialHash(int i2, byte[] bArr, int i3, int i5) {
        for (int i7 = i3; i7 < i3 + i5; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = AbstractC1923o.newInstance(bArr);
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static C bytesDefaultValue(String str) {
        return C.copyFrom(str.getBytes(ISO_8859_1));
    }

    static <T> T checkNotNull(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    public static <T extends yg> T getDefaultInstance(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (T) method.invoke(method, new Object[0]);
        } catch (Exception e2) {
            throw new RuntimeException("Failed to get default instance for " + cls, e2);
        }
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return L0y.isValidUtf8(bArr);
    }

    static Object mergeMessage(Object obj, Object obj2) {
        return ((yg) obj).toBuilder().mergeFrom((yg) obj2).buildPartial();
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    private nKK() {
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(byte[] bArr) {
        return hashCode(bArr, 0, bArr.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iPartialHash = partialHash(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (iPartialHash == 0) {
                return 1;
            }
            return iPartialHash;
        }
        int iCapacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        qf.clear(byteBufferDuplicate);
        int iCapacity2 = byteBuffer.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = partialHash(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static int hashEnum(w6 w6Var) {
        return w6Var.getNumber();
    }

    public static int hashEnumList(List<? extends w6> list) {
        Iterator<? extends w6> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    static int hashCode(byte[] bArr, int i2, int i3) {
        int iPartialHash = partialHash(i3, bArr, i2, i3);
        if (iPartialHash == 0) {
            return 1;
        }
        return iPartialHash;
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!equalsByteBuffer(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }
}
