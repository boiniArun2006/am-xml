package com.google.android.gms.internal.auth;

import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzhj {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhi zze;
    private static final boolean zzf;
    private static final boolean zzg;

    private zzhj() {
    }

    static boolean zzu() {
        return zzg;
    }

    static boolean zzv() {
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        boolean z2;
        boolean z3;
        zzhi zzhiVar;
        Unsafe unsafeZzg = zzg();
        zzb = unsafeZzg;
        int i2 = zzds.zza;
        zzc = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzs = zzs(cls);
        zzd = zZzs;
        Class cls2 = Integer.TYPE;
        boolean zZzs2 = zzs(cls2);
        zzhi zzhgVar = null;
        if (unsafeZzg != null) {
            if (zZzs) {
                zzhgVar = new zzhh(unsafeZzg);
            } else if (zZzs2) {
                zzhgVar = new zzhg(unsafeZzg);
            }
        }
        zze = zzhgVar;
        if (zzhgVar == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = zzhgVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzy() != null) {
                    z2 = true;
                }
            } catch (Throwable th) {
                zzh(th);
            }
        }
        zzf = z2;
        zzhi zzhiVar2 = zze;
        if (zzhiVar2 == null) {
            z3 = false;
        } else {
            try {
                Class<?> cls4 = zzhiVar2.zza.getClass();
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
                zzh(th2);
                z3 = false;
            }
        }
        zzg = z3;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        Field fieldZzy = zzy();
        if (fieldZzy != null && (zzhiVar = zze) != null) {
            zzhiVar.zza.objectFieldOffset(fieldZzy);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static double zza(Object obj, long j2) {
        return zze.zza(obj, j2);
    }

    static float zzb(Object obj, long j2) {
        return zze.zzb(obj, j2);
    }

    static int zzc(Object obj, long j2) {
        return zze.zza.getInt(obj, j2);
    }

    static long zzd(Object obj, long j2) {
        return zze.zza.getLong(obj, j2);
    }

    static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object zzf(Object obj, long j2) {
        return zze.zza.getObject(obj, j2);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static /* synthetic */ void zzi(Object obj, long j2, boolean z2) {
        zzhi zzhiVar = zze;
        long j3 = (-4) & j2;
        int i2 = zzhiVar.zza.getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        zzhiVar.zza.putInt(obj, j3, ((z2 ? 1 : 0) << i3) | ((~(255 << i3)) & i2));
    }

    static /* synthetic */ void zzj(Object obj, long j2, boolean z2) {
        zzhi zzhiVar = zze;
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        zzhiVar.zza.putInt(obj, j3, ((z2 ? 1 : 0) << i2) | ((~(255 << i2)) & zzhiVar.zza.getInt(obj, j3)));
    }

    static void zzk(Object obj, long j2, boolean z2) {
        zze.zzc(obj, j2, z2);
    }

    static void zzl(Object obj, long j2, double d2) {
        zze.zzd(obj, j2, d2);
    }

    static void zzm(Object obj, long j2, float f3) {
        zze.zze(obj, j2, f3);
    }

    static void zzn(Object obj, long j2, int i2) {
        zze.zza.putInt(obj, j2, i2);
    }

    static void zzo(Object obj, long j2, long j3) {
        zze.zza.putLong(obj, j2, j3);
    }

    static void zzp(Object obj, long j2, Object obj2) {
        zze.zza.putObject(obj, j2, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j2) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j2) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzs(Class cls) {
        int i2 = zzds.zza;
        try {
            Class cls2 = zzc;
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

    static boolean zzt(Object obj, long j2) {
        return zze.zzf(obj, j2);
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i2 = zzds.zza;
        Field fieldZzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (fieldZzz != null) {
            return fieldZzz;
        }
        Field fieldZzz2 = zzz(Buffer.class, SafeDKWebAppInterface.f62924j);
        if (fieldZzz2 == null || fieldZzz2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
