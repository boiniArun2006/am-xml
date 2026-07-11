package com.google.android.gms.internal.ads;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.google.android.gms.internal.ads.zzgyh;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class zzgyi<V> extends zzhaq implements com.google.common.util.concurrent.Xo {
    private static final zza zzbp;
    static final Object zze = new Object();
    static final zzgzw zzf = new zzgzw(zzgyh.class);
    static final boolean zzg;
    volatile zzgyh.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    abstract class zza {
        /* synthetic */ zza(byte[] bArr) {
        }

        abstract void zza(zze zzeVar, Thread thread);

        abstract void zzb(zze zzeVar, zze zzeVar2);

        abstract boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2);

        abstract boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2);

        abstract zze zze(zzgyi zzgyiVar, zze zzeVar);

        abstract zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar);

        abstract boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzgyi<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzgyi.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzgyi<?>, zzgyh.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzgyi.class, zzgyh.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzgyi<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzgyi.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2) {
            return androidx.concurrent.futures.j.n(zzc, zzgyiVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
            return androidx.concurrent.futures.j.n(zzd, zzgyiVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zze zze(zzgyi zzgyiVar, zze zzeVar) {
            return zzc.getAndSet(zzgyiVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar) {
            return zzd.getAndSet(zzgyiVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.j.n(zze, zzgyiVar, obj, obj2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzgyiVar) {
                try {
                    if (zzgyiVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzgyiVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
            synchronized (zzgyiVar) {
                try {
                    if (zzgyiVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzgyiVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zze zze(zzgyi zzgyiVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzgyiVar) {
                try {
                    zzeVar2 = zzgyiVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzgyiVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar) {
            zzgyh.zzd zzdVar2;
            synchronized (zzgyiVar) {
                try {
                    zzdVar2 = zzgyiVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzgyiVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2) {
            synchronized (zzgyiVar) {
                try {
                    if (zzgyiVar.valueField != obj) {
                        return false;
                    }
                    zzgyiVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        private zzd() {
            throw null;
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(zzgyj.zza);
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzgyi.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzgyi.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzgyi.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2) {
            return ci.n(zza, zzgyiVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
            return ci.n(zza, zzgyiVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zze zze(zzgyi zzgyiVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzgyiVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzgyiVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar) {
            zzgyh.zzd zzdVar2;
            do {
                zzdVar2 = zzgyiVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzgyiVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2) {
            return ci.n(zza, zzgyiVar, zzd, obj, obj2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze(boolean z2) {
        }

        zze() {
            zzgyi.zzv(this, Thread.currentThread());
        }
    }

    zzgyi() {
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbp.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    static {
        boolean z2;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", V8ValueBoolean.FALSE));
        } catch (SecurityException unused) {
            z2 = false;
        }
        zzg = z2;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e2) {
                try {
                    zzcVar = new zzb(bArr);
                    th = null;
                    th2 = e2;
                } catch (Error | Exception e3) {
                    th = e3;
                    th2 = e2;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th = null;
        th2 = null;
        zzbp = zzcVar;
        if (th != null) {
            zzgzw zzgzwVar = zzf;
            Logger loggerZza = zzgzwVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzgzwVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    static boolean zzr(zzgyi zzgyiVar, Object obj, Object obj2) {
        return zzbp.zzg(zzgyiVar, obj, obj2);
    }

    static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbp.zza(zzeVar, thread);
    }

    final boolean zzp(zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
        return zzbp.zzd(this, zzdVar, zzdVar2);
    }

    final zzgyh.zzd zzq(zzgyh.zzd zzdVar) {
        return zzbp.zzf(this, zzdVar);
    }

    final void zzs() {
        for (zze zzeVarZze = zzbp.zze(this, zze.zza); zzeVarZze != null; zzeVarZze = zzeVarZze.next) {
            Thread thread = zzeVarZze.thread;
            if (thread != null) {
                zzeVarZze.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final Object zzt(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzgyh.zzh(obj)) {
            return zzgyh.zzg(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzbp;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzgyh.zzh(obj2)) {
                                return zzgyh.zzg(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzgyh.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzgyh.zzh(obj4)) {
                return zzgyh.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 8 + String.valueOf(lowerCase2).length());
        sb.append("Waited ");
        sb.append(j2);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb2 = new StringBuilder(strConcat.length() + String.valueOf(jConvert).length() + 1 + String.valueOf(lowerCase).length());
                sb2.append(strConcat);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z2) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z2) {
                StringBuilder sb3 = new StringBuilder(strConcat.length() + String.valueOf(nanos2).length() + 13);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(string3.length() + 5 + String.valueOf(string).length());
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    final Object zzu() throws ExecutionException, InterruptedException {
        boolean z2;
        Object obj;
        boolean z3;
        if (!Thread.interrupted()) {
            Object obj2 = this.valueField;
            if (obj2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 & zzgyh.zzh(obj2)) {
                return zzgyh.zzg(obj2);
            }
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzbp;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.valueField;
                                if (obj != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z3 & zzgyh.zzh(obj)));
                        return zzgyh.zzg(obj);
                    }
                    zzeVar = this.waitersField;
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzgyh.zzg(obj3);
        }
        throw new InterruptedException();
    }
}
