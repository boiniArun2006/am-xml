package com.google.android.gms.internal.p002firebaseauthapi;

import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzanp {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    private static final class zza extends zzb {
        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final double zza(Object obj, long j2) {
            return Double.longBitsToDouble(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzanp.zza) {
                zzanp.zza(obj, j2, z2);
            } else {
                zzanp.zzb(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final boolean zzc(Object obj, long j2) {
            return zzanp.zza ? zzanp.zzf(obj, j2) : zzanp.zzg(obj, j2);
        }

        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final float zzb(Object obj, long j2) {
            return Float.intBitsToFloat(zzd(obj, j2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j2, byte b2) {
            if (!zzanp.zza) {
                zzanp.zzd(obj, j2, b2);
            } else {
                zzanp.zzc(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j2, float f3) {
            zza(obj, j2, Float.floatToIntBits(f3));
        }
    }

    private static abstract class zzb {
        Unsafe zza;

        public abstract double zza(Object obj, long j2);

        public abstract void zza(Object obj, long j2, byte b2);

        public abstract void zza(Object obj, long j2, double d2);

        public abstract void zza(Object obj, long j2, float f3);

        public final void zza(Object obj, long j2, int i2) {
            this.zza.putInt(obj, j2, i2);
        }

        public abstract void zza(Object obj, long j2, boolean z2);

        public abstract float zzb(Object obj, long j2);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzanp.zze() != null;
            } catch (Throwable th) {
                zzanp.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j2);

        public final void zza(Object obj, long j2, long j3) {
            this.zza.putLong(obj, j2, j3);
        }

        public final int zzd(Object obj, long j2) {
            return this.zza.getInt(obj, j2);
        }

        public final long zze(Object obj, long j2) {
            return this.zza.getLong(obj, j2);
        }

        zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
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
                zzanp.zza(th);
                return false;
            }
        }
    }

    private static final class zzc extends zzb {
        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final double zza(Object obj, long j2) {
            return Double.longBitsToDouble(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzanp.zza) {
                zzanp.zza(obj, j2, z2);
            } else {
                zzanp.zzb(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final boolean zzc(Object obj, long j2) {
            return zzanp.zza ? zzanp.zzf(obj, j2) : zzanp.zzg(obj, j2);
        }

        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final float zzb(Object obj, long j2) {
            return Float.intBitsToFloat(zzd(obj, j2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j2, byte b2) {
            if (!zzanp.zza) {
                zzanp.zzd(obj, j2, b2);
            } else {
                zzanp.zzc(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j2, float f3) {
            zza(obj, j2, Float.floatToIntBits(f3));
        }
    }

    private zzanp() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static long zzd(Object obj, long j2) {
        return zzf.zze(obj, j2);
    }

    static Object zze(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    static float zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        zza(obj, j3, ((255 & b2) << i2) | (zzc(obj, j3) & (~(255 << i2))));
    }

    static /* synthetic */ boolean zzf(Object obj, long j2) {
        return ((byte) (zzc(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j2) {
        return ((byte) (zzc(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)))) != 0;
    }

    static boolean zzh(Object obj, long j2) {
        return zzf.zzc(obj, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    static {
        zzb zzaVar;
        boolean zZzb;
        boolean zZza;
        Unsafe unsafeZzb = zzb();
        zzb = unsafeZzb;
        zzc = zzaji.zza();
        boolean zZzd = zzd(Long.TYPE);
        zzd = zZzd;
        boolean zZzd2 = zzd(Integer.TYPE);
        zze = zZzd2;
        if (unsafeZzb != null) {
            if (zZzd) {
                zzaVar = new zzc(unsafeZzb);
            } else if (zZzd2) {
                zzaVar = new zza(unsafeZzb);
            }
        } else {
            zzaVar = null;
        }
        zzf = zzaVar;
        boolean z2 = false;
        if (zzaVar == null) {
            zZzb = false;
        } else {
            zZzb = zzaVar.zzb();
        }
        zzg = zZzb;
        if (zzaVar == null) {
            zZza = false;
        } else {
            zZza = zzaVar.zza();
        }
        zzh = zZza;
        zzi = zzb(byte[].class);
        zzb(boolean[].class);
        zzc(boolean[].class);
        zzb(int[].class);
        zzc(int[].class);
        zzb(long[].class);
        zzc(long[].class);
        zzb(float[].class);
        zzc(float[].class);
        zzb(double[].class);
        zzc(double[].class);
        zzb(Object[].class);
        zzc(Object[].class);
        Field fieldZze = zze();
        if (fieldZze != null && zzaVar != null) {
            zzaVar.zza.objectFieldOffset(fieldZze);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        }
        zza = z2;
    }

    static double zza(Object obj, long j2) {
        return zzf.zza(obj, j2);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int zzc(Object obj, long j2) {
        return zzf.zzd(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, SafeDKWebAppInterface.f62924j);
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static void zzc(Object obj, long j2, boolean z2) {
        zzf.zza(obj, j2, z2);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
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

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzanr());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iZzc = zzc(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        zza(obj, j3, ((255 & b2) << i2) | (iZzc & (~(255 << i2))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzanp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static /* synthetic */ void zzb(Object obj, long j2, boolean z2) {
        zzd(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    static boolean zzc() {
        return zzh;
    }

    static /* synthetic */ void zza(Object obj, long j2, boolean z2) {
        zzc(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    static void zza(byte[] bArr, long j2, byte b2) {
        zzf.zza((Object) bArr, zzi + j2, b2);
    }

    static void zza(Object obj, long j2, double d2) {
        zzf.zza(obj, j2, d2);
    }

    static void zza(Object obj, long j2, float f3) {
        zzf.zza(obj, j2, f3);
    }

    static void zza(Object obj, long j2, int i2) {
        zzf.zza(obj, j2, i2);
    }

    static boolean zzd() {
        return zzg;
    }

    static void zza(Object obj, long j2, long j3) {
        zzf.zza(obj, j2, j3);
    }

    static void zza(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }
}
