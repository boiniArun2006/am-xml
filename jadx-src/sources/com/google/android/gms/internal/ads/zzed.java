package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzed {
    private final Thread zza;

    @Nullable
    private final zzdx zzb;

    @Nullable
    private final zzdz zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;

    @GuardedBy
    private boolean zzh;
    private boolean zzi;

    public zzed(Looper looper, zzdn zzdnVar, @Nullable zzdz zzdzVar) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), zzdnVar, zzdzVar, true);
    }

    @Deprecated
    public final void zzg(boolean z2) {
        this.zzi = false;
    }

    private final void zzi() {
        if (this.zzi) {
            zzgrc.zzi(Thread.currentThread() == this.zza);
        }
    }

    @CheckResult
    public final zzed zza(Looper looper, @Nullable zzdn zzdnVar, @Nullable zzdz zzdzVar) {
        return new zzed(this.zzd, looper, looper.getThread(), zzdnVar, zzdzVar, this.zzi);
    }

    final /* synthetic */ boolean zzh(Message message) {
        zzdz zzdzVar = this.zzc;
        zzdzVar.getClass();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzea) it.next()).zzb(zzdzVar);
            zzdx zzdxVar = this.zzb;
            zzdxVar.getClass();
            if (zzdxVar.zzb(1)) {
                break;
            }
        }
        return true;
    }

    public final void zzb(Object obj) {
        obj.getClass();
        synchronized (this.zzg) {
            try {
                if (this.zzh) {
                    return;
                }
                this.zzd.add(new zzea(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(Object obj) {
        zzi();
        CopyOnWriteArraySet<zzea> copyOnWriteArraySet = this.zzd;
        for (zzea zzeaVar : copyOnWriteArraySet) {
            if (zzeaVar.zza.equals(obj)) {
                zzeaVar.zzc(this.zzc);
                copyOnWriteArraySet.remove(zzeaVar);
            }
        }
    }

    public final void zzd(final int i2, final zzdy zzdyVar) {
        zzi();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzdy zzdyVar2 = zzdyVar;
                    ((zzea) it.next()).zza(i2, zzdyVar2);
                }
            }
        });
    }

    public final void zze() {
        zzi();
        ArrayDeque arrayDeque = this.zzf;
        if (!arrayDeque.isEmpty()) {
            if (this.zzc != null) {
                zzdx zzdxVar = this.zzb;
                zzdxVar.getClass();
                if (!zzdxVar.zzb(1)) {
                    zzdxVar.zzg(zzdxVar.zzc(1));
                }
            }
            ArrayDeque arrayDeque2 = this.zze;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (zIsEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void zzf() {
        zzi();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzea) it.next()).zzc(this.zzc);
        }
        copyOnWriteArraySet.clear();
    }

    public zzed(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    private zzed(CopyOnWriteArraySet copyOnWriteArraySet, @Nullable Looper looper, Thread thread, @Nullable zzdn zzdnVar, @Nullable zzdz zzdzVar, boolean z2) {
        this.zza = thread;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdzVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = (looper == null || zzdnVar == null || zzdzVar == null) ? null : zzdnVar.zzd(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzec
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                this.zza.zzh(message);
                return true;
            }
        });
        this.zzi = z2;
    }
}
