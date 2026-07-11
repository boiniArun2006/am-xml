package androidx.content.preferences.protobuf;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class UnsafeUtil {
    private static final long HI;
    private static final long Ik;
    static final long KN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final int f38189S;
    static final boolean WPU;
    private static final long XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final long f38190Z;
    private static final long az;
    private static final long ck;
    private static final long gh;
    private static final long mUb;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f38192o;
    private static final long qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f38193r;
    private static final long ty;
    private static final long xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Unsafe f38191n = N();
    private static final Class rl = Android.rl();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f38194t = r(Long.TYPE);
    private static final boolean nr = r(Integer.TYPE);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final MemoryAccessor f38188O = X();
    private static final boolean J2 = J();
    private static final boolean Uo = B();

    private static final class Android32MemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean aYN() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void HI(Object obj, long j2, boolean z2) {
            if (UnsafeUtil.WPU) {
                UnsafeUtil.bzg(obj, j2, z2);
            } else {
                UnsafeUtil.Xw(obj, j2, z2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void Ik(Object obj, long j2, byte b2) {
            if (UnsafeUtil.WPU) {
                UnsafeUtil.P5(obj, j2, b2);
            } else {
                UnsafeUtil.M7(obj, j2, b2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte J2(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean O(Object obj, long j2) {
            return UnsafeUtil.WPU ? UnsafeUtil.S(obj, j2) : UnsafeUtil.WPU(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte Uo(Object obj, long j2) {
            return UnsafeUtil.WPU ? UnsafeUtil.nY(obj, j2) : UnsafeUtil.g(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void ck(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long gh(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void nr(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void t(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double KN(Object obj, long j2) {
            return Double.longBitsToDouble(qie(obj, j2));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void o(Object obj, long j2, float f3) {
            Z(obj, j2, Float.floatToIntBits(f3));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void r(Object obj, long j2, double d2) {
            XQ(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float xMQ(Object obj, long j2) {
            return Float.intBitsToFloat(mUb(obj, j2));
        }
    }

    private static final class Android64MemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean aYN() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void HI(Object obj, long j2, boolean z2) {
            if (UnsafeUtil.WPU) {
                UnsafeUtil.bzg(obj, j2, z2);
            } else {
                UnsafeUtil.Xw(obj, j2, z2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void Ik(Object obj, long j2, byte b2) {
            if (UnsafeUtil.WPU) {
                UnsafeUtil.P5(obj, j2, b2);
            } else {
                UnsafeUtil.M7(obj, j2, b2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte J2(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean O(Object obj, long j2) {
            return UnsafeUtil.WPU ? UnsafeUtil.S(obj, j2) : UnsafeUtil.WPU(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte Uo(Object obj, long j2) {
            return UnsafeUtil.WPU ? UnsafeUtil.nY(obj, j2) : UnsafeUtil.g(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void ck(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long gh(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void nr(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void t(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double KN(Object obj, long j2) {
            return Double.longBitsToDouble(qie(obj, j2));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void o(Object obj, long j2, float f3) {
            Z(obj, j2, Float.floatToIntBits(f3));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void r(Object obj, long j2, double d2) {
            XQ(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float xMQ(Object obj, long j2) {
            return Float.intBitsToFloat(mUb(obj, j2));
        }
    }

    private static final class JvmMemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void HI(Object obj, long j2, boolean z2) {
            this.f38195n.putBoolean(obj, j2, z2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void Ik(Object obj, long j2, byte b2) {
            this.f38195n.putByte(obj, j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte J2(long j2) {
            return this.f38195n.getByte(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double KN(Object obj, long j2) {
            return this.f38195n.getDouble(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean O(Object obj, long j2) {
            return this.f38195n.getBoolean(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte Uo(Object obj, long j2) {
            return this.f38195n.getByte(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean WPU() {
            if (!super.WPU()) {
                return false;
            }
            try {
                Class<?> cls = this.f38195n.getClass();
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
                UnsafeUtil.wTp(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean aYN() {
            if (!super.aYN()) {
                return false;
            }
            try {
                Class<?> cls = this.f38195n.getClass();
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
                UnsafeUtil.wTp(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void ck(long j2, byte b2) {
            this.f38195n.putByte(j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long gh(long j2) {
            return this.f38195n.getLong(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void nr(byte[] bArr, long j2, long j3, long j4) {
            this.f38195n.copyMemory(bArr, UnsafeUtil.KN + j2, (Object) null, j3, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void o(Object obj, long j2, float f3) {
            this.f38195n.putFloat(obj, j2, f3);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void r(Object obj, long j2, double d2) {
            this.f38195n.putDouble(obj, j2, d2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void t(long j2, byte[] bArr, long j3, long j4) {
            this.f38195n.copyMemory((Object) null, j2, bArr, UnsafeUtil.KN + j3, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float xMQ(Object obj, long j2) {
            return this.f38195n.getFloat(obj, j2);
        }

        JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }
    }

    private static abstract class MemoryAccessor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Unsafe f38195n;

        public abstract void HI(Object obj, long j2, boolean z2);

        public abstract void Ik(Object obj, long j2, byte b2);

        public abstract byte J2(long j2);

        public abstract double KN(Object obj, long j2);

        public abstract boolean O(Object obj, long j2);

        public abstract byte Uo(Object obj, long j2);

        public abstract void ck(long j2, byte b2);

        public abstract long gh(long j2);

        public abstract void nr(byte[] bArr, long j2, long j3, long j4);

        public abstract void o(Object obj, long j2, float f3);

        public abstract void r(Object obj, long j2, double d2);

        public abstract void t(long j2, byte[] bArr, long j3, long j4);

        public abstract float xMQ(Object obj, long j2);

        public final void S(Object obj, long j2, Object obj2) {
            this.f38195n.putObject(obj, j2, obj2);
        }

        public boolean WPU() {
            Unsafe unsafe = this.f38195n;
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
                UnsafeUtil.wTp(th);
                return false;
            }
        }

        public final void XQ(Object obj, long j2, long j3) {
            this.f38195n.putLong(obj, j2, j3);
        }

        public final void Z(Object obj, long j2, int i2) {
            this.f38195n.putInt(obj, j2, i2);
        }

        public boolean aYN() {
            Unsafe unsafe = this.f38195n;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return UnsafeUtil.HI() != null;
            } catch (Throwable th) {
                UnsafeUtil.wTp(th);
                return false;
            }
        }

        public final Object az(Object obj, long j2) {
            return this.f38195n.getObject(obj, j2);
        }

        public final int mUb(Object obj, long j2) {
            return this.f38195n.getInt(obj, j2);
        }

        public final int n(Class cls) {
            return this.f38195n.arrayBaseOffset(cls);
        }

        public final long qie(Object obj, long j2) {
            return this.f38195n.getLong(obj, j2);
        }

        public final int rl(Class cls) {
            return this.f38195n.arrayIndexScale(cls);
        }

        public final long ty(Field field) {
            return this.f38195n.objectFieldOffset(field);
        }

        MemoryAccessor(Unsafe unsafe) {
            this.f38195n = unsafe;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Xw(Object obj, long j2, boolean z2) {
        M7(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bzg(Object obj, long j2, boolean z2) {
        P5(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    private static boolean B() {
        MemoryAccessor memoryAccessor = f38188O;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.WPU();
    }

    static void E(Object obj, long j2, int i2) {
        f38188O.Z(obj, j2, i2);
    }

    static long E2(long j2) {
        return f38188O.gh(j2);
    }

    static void FX(Object obj, long j2, Object obj2) {
        f38188O.S(obj, j2, obj2);
    }

    static void Ik(byte[] bArr, long j2, long j3, long j4) {
        f38188O.nr(bArr, j2, j3, j4);
    }

    private static boolean J() {
        MemoryAccessor memoryAccessor = f38188O;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.aYN();
    }

    static void M(Object obj, long j2, long j3) {
        f38188O.XQ(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M7(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        E(obj, j3, ((255 & b2) << i2) | (fD(obj, j3) & (~(255 << i2))));
    }

    static Unsafe N() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: androidx.datastore.preferences.protobuf.UnsafeUtil.1
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
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P5(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iFD = fD(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        E(obj, j3, ((255 & b2) << i2) | (iFD & (~(255 << i2))));
    }

    static Object T(Object obj, long j2) {
        return f38188O.az(obj, j2);
    }

    static void U(byte[] bArr, long j2, byte b2) {
        f38188O.Ik(bArr, KN + j2, b2);
    }

    static byte ViF(byte[] bArr, long j2) {
        return f38188O.Uo(bArr, KN + j2);
    }

    private static MemoryAccessor X() {
        Unsafe unsafe = f38191n;
        if (unsafe == null) {
            return null;
        }
        if (!Android.t()) {
            return new JvmMemoryAccessor(unsafe);
        }
        if (f38194t) {
            return new Android64MemoryAccessor(unsafe);
        }
        if (nr) {
            return new Android32MemoryAccessor(unsafe);
        }
        return null;
    }

    static boolean XQ(Object obj, long j2) {
        return f38188O.O(obj, j2);
    }

    private static long Z(Field field) {
        MemoryAccessor memoryAccessor;
        if (field == null || (memoryAccessor = f38188O) == null) {
            return -1L;
        }
        return memoryAccessor.ty(field);
    }

    static byte aYN(long j2) {
        return f38188O.J2(j2);
    }

    private static int az(Class cls) {
        if (Uo) {
            return f38188O.n(cls);
        }
        return -1;
    }

    static void ck(long j2, byte[] bArr, long j3, long j4) {
        f38188O.t(j2, bArr, j3, j4);
    }

    static long e(Object obj, long j2) {
        return f38188O.qie(obj, j2);
    }

    static void eF(Object obj, long j2, float f3) {
        f38188O.o(obj, j2, f3);
    }

    static int fD(Object obj, long j2) {
        return f38188O.mUb(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte g(Object obj, long j2) {
        return (byte) ((fD(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    static long gh(ByteBuffer byteBuffer) {
        return f38188O.qie(byteBuffer, XQ);
    }

    static float iF(Object obj, long j2) {
        return f38188O.xMQ(obj, j2);
    }

    static void jB(long j2, byte b2) {
        f38188O.ck(j2, b2);
    }

    static boolean nHg() {
        return Uo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte nY(Object obj, long j2) {
        return (byte) ((fD(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    static void p5(Object obj, long j2, double d2) {
        f38188O.r(obj, j2, d2);
    }

    static Object qie(Class cls) {
        try {
            return f38191n.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static boolean r(Class cls) {
        if (!Android.t()) {
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

    static void rV9(Object obj, long j2, boolean z2) {
        f38188O.HI(obj, j2, z2);
    }

    static boolean s7N() {
        return J2;
    }

    static double te(Object obj, long j2) {
        return f38188O.KN(obj, j2);
    }

    private static int ty(Class cls) {
        if (Uo) {
            return f38188O.rl(cls);
        }
        return -1;
    }

    static long v(Field field) {
        return f38188O.ty(field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wTp(Throwable th) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static {
        boolean z2;
        long jAz = az(byte[].class);
        KN = jAz;
        xMQ = az(boolean[].class);
        mUb = ty(boolean[].class);
        gh = az(int[].class);
        qie = ty(int[].class);
        az = az(long[].class);
        ty = ty(long[].class);
        HI = az(float[].class);
        ck = ty(float[].class);
        Ik = az(double[].class);
        f38193r = ty(double[].class);
        f38192o = az(Object[].class);
        f38190Z = ty(Object[].class);
        XQ = Z(HI());
        f38189S = (int) (jAz & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        } else {
            z2 = false;
        }
        WPU = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field HI() {
        Field fieldO;
        if (Android.t() && (fieldO = o(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldO;
        }
        Field fieldO2 = o(Buffer.class, SafeDKWebAppInterface.f62924j);
        if (fieldO2 != null && fieldO2.getType() == Long.TYPE) {
            return fieldO2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean S(Object obj, long j2) {
        if (nY(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean WPU(Object obj, long j2) {
        if (g(obj, j2) != 0) {
            return true;
        }
        return false;
    }

    private static Field o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
