package com.google.android.gms.internal.ads;

import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziem {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zziel zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    private zziem() {
    }

    static boolean zza() {
        return zzh;
    }

    static boolean zzb() {
        return zzg;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        boolean z2;
        boolean z3;
        zziel zzielVar;
        Unsafe unsafeZzs = zzs();
        zzc = unsafeZzs;
        int i2 = zziaa.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzt = zzt(cls);
        zze = zZzt;
        Class cls2 = Integer.TYPE;
        boolean zZzt2 = zzt(cls2);
        zziel zziejVar = null;
        if (unsafeZzs != null) {
            if (zZzt) {
                zziejVar = new zziek(unsafeZzs);
            } else if (zZzt2) {
                zziejVar = new zziej(unsafeZzs);
            }
        }
        zzf = zziejVar;
        if (zziejVar == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = zziejVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzD() != null) {
                    z2 = true;
                }
            } catch (Throwable th) {
                zzA(th);
            }
        }
        zzg = z2;
        zziel zzielVar2 = zzf;
        if (zzielVar2 == null) {
            z3 = false;
        } else {
            try {
                Class<?> cls4 = zzielVar2.zza.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z3 = true;
            } catch (Throwable th2) {
                zzA(th2);
                z3 = false;
            }
        }
        zzh = z3;
        zza = zzB(byte[].class);
        zzB(boolean[].class);
        zzC(boolean[].class);
        zzB(int[].class);
        zzC(int[].class);
        zzB(long[].class);
        zzC(long[].class);
        zzB(float[].class);
        zzC(float[].class);
        zzB(double[].class);
        zzC(double[].class);
        zzB(Object[].class);
        zzC(Object[].class);
        Field fieldZzD = zzD();
        long jObjectFieldOffset = -1;
        if (fieldZzD != null && (zzielVar = zzf) != null) {
            jObjectFieldOffset = zzielVar.zza.objectFieldOffset(fieldZzD);
        }
        zzi = jObjectFieldOffset;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static /* synthetic */ void zzA(Throwable th) {
        Logger.getLogger(zziem.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzB(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzD() {
        int i2 = zziaa.zza;
        Field fieldZzE = zzE(Buffer.class, "effectiveDirectAddress");
        if (fieldZzE != null) {
            return fieldZzE;
        }
        Field fieldZzE2 = zzE(Buffer.class, SafeDKWebAppInterface.f62924j);
        if (fieldZzE2 == null || fieldZzE2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzE2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzF(Object obj, long j2, byte b2) {
        Unsafe unsafe = zzf.zza;
        long j3 = (-4) & j2;
        int i2 = unsafe.getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b2) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j2, byte b2) {
        Unsafe unsafe = zzf.zza;
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b2) << i2) | (unsafe.getInt(obj, j3) & (~(255 << i2))));
    }

    static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static int zzd(Object obj, long j2) {
        return zzf.zza.getInt(obj, j2);
    }

    static void zze(Object obj, long j2, int i2) {
        zzf.zza.putInt(obj, j2, i2);
    }

    static long zzf(Object obj, long j2) {
        return zzf.zza.getLong(obj, j2);
    }

    static void zzg(Object obj, long j2, long j3) {
        zzf.zza.putLong(obj, j2, j3);
    }

    static boolean zzh(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    static void zzi(Object obj, long j2, boolean z2) {
        zzf.zzc(obj, j2, z2);
    }

    static float zzj(Object obj, long j2) {
        return zzf.zzd(obj, j2);
    }

    static void zzk(Object obj, long j2, float f3) {
        zzf.zze(obj, j2, f3);
    }

    static double zzl(Object obj, long j2) {
        return zzf.zzf(obj, j2);
    }

    static void zzm(Object obj, long j2, double d2) {
        zzf.zzg(obj, j2, d2);
    }

    static Object zzn(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    static void zzo(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }

    static void zzp(byte[] bArr, long j2, byte b2) {
        zzf.zza(bArr, zza + j2, b2);
    }

    static byte zzq(long j2) {
        return zzf.zzh(j2);
    }

    static long zzr(ByteBuffer byteBuffer) {
        zziel zzielVar = zzf;
        return zzielVar.zza.getLong(byteBuffer, zzi);
    }

    static Unsafe zzs() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zziei());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzt(Class cls) {
        int i2 = zziaa.zza;
        try {
            Class cls2 = zzd;
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

    static /* synthetic */ boolean zzw(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzx(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    private static Field zzE(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
