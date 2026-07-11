package com.google.crypto.tink.shaded.protobuf;

import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class o7q {
    private static final long HI;
    private static final long Ik;
    static final long KN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final int f60021S;
    static final boolean WPU;
    private static final long XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final long f60022Z;
    private static final long az;
    private static final long ck;
    private static final long gh;
    private static final long mUb;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f60024o;
    private static final long qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f60025r;
    private static final long ty;
    private static final long xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Unsafe f60023n = fD();
    private static final Class rl = com.google.crypto.tink.shaded.protobuf.Ml.rl();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f60026t = HI(Long.TYPE);
    private static final boolean nr = HI(Integer.TYPE);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final I28 f60020O = te();
    private static final boolean J2 = M7();
    private static final boolean Uo = P5();

    private static abstract class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Unsafe f60027n;

        public abstract float J2(Object obj, long j2);

        public abstract double O(Object obj, long j2);

        public abstract void az(Object obj, long j2, double d2);

        public abstract void gh(Object obj, long j2, boolean z2);

        public abstract byte nr(Object obj, long j2);

        public abstract void qie(Object obj, long j2, byte b2);

        public abstract boolean t(Object obj, long j2);

        public abstract void ty(Object obj, long j2, float f3);

        public final void HI(Object obj, long j2, int i2) {
            this.f60027n.putInt(obj, j2, i2);
        }

        public final void Ik(Object obj, long j2, Object obj2) {
            this.f60027n.putObject(obj, j2, obj2);
        }

        public final long KN(Object obj, long j2) {
            return this.f60027n.getLong(obj, j2);
        }

        public final int Uo(Object obj, long j2) {
            return this.f60027n.getInt(obj, j2);
        }

        public final void ck(Object obj, long j2, long j3) {
            this.f60027n.putLong(obj, j2, j3);
        }

        public final long mUb(Field field) {
            return this.f60027n.objectFieldOffset(field);
        }

        public final int n(Class cls) {
            return this.f60027n.arrayBaseOffset(cls);
        }

        public boolean o() {
            Unsafe unsafe = this.f60027n;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return o7q.ty() != null;
            } catch (Throwable th) {
                o7q.X(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f60027n;
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
                o7q.X(th);
                return false;
            }
        }

        public final int rl(Class cls) {
            return this.f60027n.arrayIndexScale(cls);
        }

        public final Object xMQ(Object obj, long j2) {
            return this.f60027n.getObject(obj, j2);
        }

        I28(Unsafe unsafe) {
            this.f60027n = unsafe;
        }
    }

    private static final class Ml extends I28 {
        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public float J2(Object obj, long j2) {
            return this.f60027n.getFloat(obj, j2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public double O(Object obj, long j2) {
            return this.f60027n.getDouble(obj, j2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void az(Object obj, long j2, double d2) {
            this.f60027n.putDouble(obj, j2, d2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void gh(Object obj, long j2, boolean z2) {
            this.f60027n.putBoolean(obj, j2, z2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public byte nr(Object obj, long j2) {
            return this.f60027n.getByte(obj, j2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public boolean o() {
            if (!super.o()) {
                return false;
            }
            try {
                Class<?> cls = this.f60027n.getClass();
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
                o7q.X(th);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void qie(Object obj, long j2, byte b2) {
            this.f60027n.putByte(obj, j2, b2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f60027n.getClass();
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
                o7q.X(th);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public boolean t(Object obj, long j2) {
            return this.f60027n.getBoolean(obj, j2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void ty(Object obj, long j2, float f3) {
            this.f60027n.putFloat(obj, j2, f3);
        }

        Ml(Unsafe unsafe) {
            super(unsafe);
        }
    }

    class j implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
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
        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public boolean o() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void gh(Object obj, long j2, boolean z2) {
            if (o7q.WPU) {
                o7q.N(obj, j2, z2);
            } else {
                o7q.nHg(obj, j2, z2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public byte nr(Object obj, long j2) {
            return o7q.WPU ? o7q.S(obj, j2) : o7q.WPU(obj, j2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void qie(Object obj, long j2, byte b2) {
            if (o7q.WPU) {
                o7q.wTp(obj, j2, b2);
            } else {
                o7q.v(obj, j2, b2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public boolean t(Object obj, long j2) {
            return o7q.WPU ? o7q.o(obj, j2) : o7q.Z(obj, j2);
        }

        n(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public float J2(Object obj, long j2) {
            return Float.intBitsToFloat(Uo(obj, j2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public double O(Object obj, long j2) {
            return Double.longBitsToDouble(KN(obj, j2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void az(Object obj, long j2, double d2) {
            ck(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void ty(Object obj, long j2, float f3) {
            HI(obj, j2, Float.floatToIntBits(f3));
        }
    }

    private static final class w6 extends I28 {
        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public boolean o() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void gh(Object obj, long j2, boolean z2) {
            if (o7q.WPU) {
                o7q.N(obj, j2, z2);
            } else {
                o7q.nHg(obj, j2, z2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public byte nr(Object obj, long j2) {
            return o7q.WPU ? o7q.S(obj, j2) : o7q.WPU(obj, j2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void qie(Object obj, long j2, byte b2) {
            if (o7q.WPU) {
                o7q.wTp(obj, j2, b2);
            } else {
                o7q.v(obj, j2, b2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public boolean t(Object obj, long j2) {
            return o7q.WPU ? o7q.o(obj, j2) : o7q.Z(obj, j2);
        }

        w6(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public float J2(Object obj, long j2) {
            return Float.intBitsToFloat(Uo(obj, j2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public double O(Object obj, long j2) {
            return Double.longBitsToDouble(KN(obj, j2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void az(Object obj, long j2, double d2) {
            ck(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o7q.I28
        public void ty(Object obj, long j2, float f3) {
            HI(obj, j2, Float.floatToIntBits(f3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Object obj, long j2, boolean z2) {
        wTp(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void nHg(Object obj, long j2, boolean z2) {
        v(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    static boolean E2() {
        return Uo;
    }

    static boolean HI(Class cls) {
        if (!com.google.crypto.tink.shaded.protobuf.Ml.t()) {
            return false;
        }
        try {
            Class cls2 = rl;
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

    private static long Ik(Field field) {
        I28 i28;
        if (field == null || (i28 = f60020O) == null) {
            return -1L;
        }
        return i28.mUb(field);
    }

    private static boolean M7() {
        I28 i28 = f60020O;
        if (i28 == null) {
            return false;
        }
        return i28.o();
    }

    private static boolean P5() {
        I28 i28 = f60020O;
        if (i28 == null) {
            return false;
        }
        return i28.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte S(Object obj, long j2) {
        return (byte) ((nY(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    static void T(Object obj, long j2, boolean z2) {
        f60020O.gh(obj, j2, z2);
    }

    static void U(Object obj, long j2, Object obj2) {
        f60020O.Ik(obj, j2, obj2);
    }

    static float ViF(Object obj, long j2) {
        return f60020O.J2(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte WPU(Object obj, long j2) {
        return (byte) ((nY(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void X(Throwable th) {
        Logger.getLogger(o7q.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static byte XQ(byte[] bArr, long j2) {
        return f60020O.nr(bArr, KN + j2);
    }

    static void Xw(Object obj, long j2, int i2) {
        f60020O.HI(obj, j2, i2);
    }

    static double aYN(Object obj, long j2) {
        return f60020O.O(obj, j2);
    }

    private static int az(Class cls) {
        if (Uo) {
            return f60020O.rl(cls);
        }
        return -1;
    }

    static void bzg(Object obj, long j2, float f3) {
        f60020O.ty(obj, j2, f3);
    }

    static boolean e() {
        return J2;
    }

    static Unsafe fD() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j());
        } catch (Throwable unused) {
            return null;
        }
    }

    static long g(Object obj, long j2) {
        return f60020O.KN(obj, j2);
    }

    static Object gh(Class cls) {
        try {
            return f60023n.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object iF(Object obj, long j2) {
        return f60020O.xMQ(obj, j2);
    }

    static void jB(Object obj, long j2, long j3) {
        f60020O.ck(obj, j2, j3);
    }

    static int nY(Object obj, long j2) {
        return f60020O.Uo(obj, j2);
    }

    private static int qie(Class cls) {
        if (Uo) {
            return f60020O.n(cls);
        }
        return -1;
    }

    static boolean r(Object obj, long j2) {
        return f60020O.t(obj, j2);
    }

    static void rV9(Object obj, long j2, double d2) {
        f60020O.az(obj, j2, d2);
    }

    static void s7N(byte[] bArr, long j2, byte b2) {
        f60020O.qie(bArr, KN + j2, b2);
    }

    private static I28 te() {
        Unsafe unsafe = f60023n;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.crypto.tink.shaded.protobuf.Ml.t()) {
            return new Ml(unsafe);
        }
        if (f60026t) {
            return new w6(unsafe);
        }
        if (nr) {
            return new n(unsafe);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        Xw(obj, j3, ((255 & b2) << i2) | (nY(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wTp(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iNY = nY(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        Xw(obj, j3, ((255 & b2) << i2) | (iNY & (~(255 << i2))));
    }

    static {
        boolean z2;
        long jQie = qie(byte[].class);
        KN = jQie;
        xMQ = qie(boolean[].class);
        mUb = az(boolean[].class);
        gh = qie(int[].class);
        qie = az(int[].class);
        az = qie(long[].class);
        ty = az(long[].class);
        HI = qie(float[].class);
        ck = az(float[].class);
        Ik = qie(double[].class);
        f60025r = az(double[].class);
        f60024o = qie(Object[].class);
        f60022Z = az(Object[].class);
        XQ = Ik(ty());
        f60021S = (int) (jQie & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        } else {
            z2 = false;
        }
        WPU = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Z(Object obj, long j2) {
        if (WPU(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    private static Field ck(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean o(Object obj, long j2) {
        if (S(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field ty() {
        Field fieldCk;
        if (com.google.crypto.tink.shaded.protobuf.Ml.t() && (fieldCk = ck(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldCk;
        }
        Field fieldCk2 = ck(Buffer.class, SafeDKWebAppInterface.f62924j);
        if (fieldCk2 != null && fieldCk2.getType() == Long.TYPE) {
            return fieldCk2;
        }
        return null;
    }
}
