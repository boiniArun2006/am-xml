package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzasb {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzari zze;
    private final zzarr zzf;
    private final zzars[] zzg;
    private zzark zzh;
    private final List zzi;
    private final List zzj;
    private final zzarp zzk;

    public zzasb(zzari zzariVar, zzarr zzarrVar, int i2) {
        zzarp zzarpVar = new zzarp(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzariVar;
        this.zzf = zzarrVar;
        this.zzg = new zzars[4];
        this.zzk = zzarpVar;
    }

    public final void zza() {
        zzark zzarkVar = this.zzh;
        if (zzarkVar != null) {
            zzarkVar.zza();
        }
        zzars[] zzarsVarArr = this.zzg;
        for (int i2 = 0; i2 < 4; i2++) {
            zzars zzarsVar = zzarsVarArr[i2];
            if (zzarsVar != null) {
                zzarsVar.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        zzari zzariVar = this.zze;
        zzarp zzarpVar = this.zzk;
        zzark zzarkVar2 = new zzark(priorityBlockingQueue, priorityBlockingQueue2, zzariVar, zzarpVar);
        this.zzh = zzarkVar2;
        zzarkVar2.start();
        for (int i3 = 0; i3 < 4; i3++) {
            zzars zzarsVar2 = new zzars(priorityBlockingQueue2, this.zzf, zzariVar, zzarpVar);
            zzarsVarArr[i3] = zzarsVar2;
            zzarsVar2.start();
        }
    }

    final void zzc(zzary zzaryVar) {
        Set set = this.zzb;
        synchronized (set) {
            set.remove(zzaryVar);
        }
        List list = this.zzi;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzasa) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzd(zzaryVar, 5);
    }

    final void zzd(zzary zzaryVar, int i2) {
        List list = this.zzj;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzarz) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzary zzb(zzary zzaryVar) {
        zzaryVar.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            set.add(zzaryVar);
        }
        zzaryVar.zzg(this.zza.incrementAndGet());
        zzaryVar.zzc("add-to-queue");
        zzd(zzaryVar, 0);
        this.zzc.add(zzaryVar);
        return zzaryVar;
    }
}
