package com.fyber.inneractive.sdk.protobuf;

import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f56718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f56719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w3 f56720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f56721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f56722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f56723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f56724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f56725h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[PHI: r4
      0x00a2: PHI (r4v20 java.lang.reflect.Field) = (r4v18 java.lang.reflect.Field), (r4v23 java.lang.reflect.Field) binds: [B:39:0x00b2, B:31:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    static {
        Unsafe unsafe;
        w3 u3Var;
        Field declaredField;
        Field field = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new s3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f56718a = unsafe;
        f56719b = d.f56543a;
        Class<?> cls = Long.TYPE;
        boolean zC2 = c(cls);
        boolean zC3 = c(Integer.TYPE);
        if (unsafe != null) {
            u3Var = d.a() ? zC2 ? new u3(unsafe) : zC3 ? new t3(unsafe) : null : new v3(unsafe);
        }
        f56720c = u3Var;
        f56721d = u3Var == null ? false : u3Var.b();
        f56722e = u3Var == null ? false : u3Var.a();
        f56723f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        if (d.a()) {
            try {
                declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused2) {
                declaredField = null;
            }
            if (declaredField != null) {
                field = declaredField;
            } else {
                try {
                    declaredField = Buffer.class.getDeclaredField(SafeDKWebAppInterface.f62924j);
                } catch (Throwable unused3) {
                    declaredField = null;
                }
                if (declaredField != null && declaredField.getType() == cls) {
                }
            }
        }
        f56724g = (field == null || u3Var == null) ? -1L : u3Var.f56706a.objectFieldOffset(field);
        f56725h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (f56722e) {
            return f56720c.f56706a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f56722e) {
            f56720c.f56706a.arrayIndexScale(cls);
        }
    }

    public static int c(Object obj, long j2) {
        return f56720c.f56706a.getInt(obj, j2);
    }

    public static long d(Object obj, long j2) {
        return f56720c.f56706a.getLong(obj, j2);
    }

    public static Object e(Object obj, long j2) {
        return f56720c.f56706a.getObject(obj, j2);
    }

    public static void a(Object obj, long j2, int i2) {
        f56720c.f56706a.putInt(obj, j2, i2);
    }

    public static byte b(Object obj, long j2) {
        return (byte) ((c(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static boolean c(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = f56719b;
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

    public static void b(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (c(obj, j3) & (~(255 << i2))));
    }

    public static void a(Object obj, long j2, long j3) {
        f56720c.f56706a.putLong(obj, j2, j3);
    }

    public static void a(long j2, Object obj, Object obj2) {
        f56720c.f56706a.putObject(obj, j2, obj2);
    }

    public static byte a(Object obj, long j2) {
        return (byte) ((c(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static void a(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iC = c(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (iC & (~(255 << i2))));
    }

    public static void a(Throwable th) {
        Logger.getLogger(x3.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
