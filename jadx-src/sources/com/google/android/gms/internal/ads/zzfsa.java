package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzfsa {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfkg zzd;
    protected com.google.android.gms.ads.internal.client.zzft zze;

    @Nullable
    protected final zzfqr zzf;
    protected AtomicBoolean zzg;

    @Nullable
    protected com.google.android.gms.ads.internal.client.zzch zzh;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzce zzi;
    private final Queue zzj;
    private final zzfra zzk;
    private final String zzl;
    private AtomicBoolean zzm;
    private final ScheduledExecutorService zzn;
    private final zzfmy zzo;
    private AtomicBoolean zzp;
    private AtomicBoolean zzq;
    private zzfrf zzr;
    private final Clock zzs;
    private final zzfrm zzt;

    public zzfsa(ClientApi clientApi, Context context, int i2, zzfkg zzfkgVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull zzfmy zzfmyVar, zzfra zzfraVar, Clock clock) {
        this("none", clientApi, context, i2, zzfkgVar, zzftVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, null);
        this.zzi = zzceVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzB(Object obj) {
        try {
            this.zzm.set(false);
            if (obj != null) {
                this.zzk.zza();
                this.zzq.set(true);
                zzP(obj);
            }
            if (obj == null || this.zzf == null) {
                zzQ(obj == null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzC(Throwable th) {
        try {
            this.zzm.set(false);
            if ((th instanceof zzfqs) && ((zzfqs) th).zza() == 0) {
                throw null;
            }
            zzQ(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfrt(this, zzeVar));
            }
            this.zzm.set(false);
            int i2 = zzeVar.zza;
            if (i2 != 1 && i2 != 8 && i2 != 10 && i2 != 11) {
                zzQ(true);
                return;
            }
            com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
            int i3 = zzftVar.zzb;
            String str = zzftVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 26 + String.valueOf(str).length() + 61);
            sb.append("Preloading ");
            sb.append(i3);
            sb.append(", for adUnitId:");
            sb.append(str);
            sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
            String string = sb.toString();
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
            this.zzg.set(false);
            zzfqr zzfqrVar = this.zzf;
            if (zzfqrVar != null) {
                zzfqrVar.zza(this);
            }
            zzfrl zzfrlVar = new zzfrl(this.zze.zza, zzo());
            zzfrlVar.zza(this.zzl);
            this.zzr.zzk(this.zzs.currentTimeMillis(), new zzfrm(zzfrlVar, null), zzeVar, this.zze.zzd, zzp(), zzH());
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzP(Object obj) {
        try {
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzc = zzc(obj);
            double dZzl = !(zzeaVarZzc instanceof zzday) ? 0.0d : ((zzday) zzeaVarZzc).zzl();
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzc2 = zzc(obj);
            int iZzm = zzeaVarZzc2 instanceof zzday ? ((zzday) zzeaVarZzc2).zzm() : 2;
            Clock clock = this.zzs;
            zzfro zzfroVar = new zzfro(obj, clock, dZzl, iZzm);
            this.zzj.add(zzfroVar);
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzc3 = zzc(obj);
            long jCurrentTimeMillis = clock.currentTimeMillis();
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfrr(this, zzeaVarZzc3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzn;
            scheduledExecutorService.execute(new zzfrs(this, jCurrentTimeMillis, zzeaVarZzc3));
            if (this.zzf != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzE)).booleanValue()) {
                    this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfry
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzA();
                        }
                    }, zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                    return;
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzz();
                        }
                    }, zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                    return;
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzE)).booleanValue()) {
                this.zzo.zzb(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
            } else {
                scheduledExecutorService.schedule(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzQ(boolean z2) {
        try {
            zzfqr zzfqrVar = this.zzf;
            if (zzfqrVar != null) {
                if (z2) {
                    this.zzk.zzc();
                }
                zzfqrVar.zza(this);
            } else {
                zzfra zzfraVar = this.zzk;
                if (zzfraVar.zze()) {
                    return;
                }
                if (z2) {
                    zzfraVar.zzc();
                }
                this.zzn.schedule(new zzfrq(this), zzfraVar.zzb(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzz() {
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            if (((zzfro) it.next()).zzb()) {
                it.remove();
                zzfqr zzfqrVar = this.zzf;
                if (zzfqrVar != null) {
                    zzfqrVar.zza(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzE(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zzg(this.zzl, zzeVar);
            } catch (RemoteException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzF(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar;
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zze);
            } catch (RemoteException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
            zzchVar = this.zzh;
            if (zzchVar == null) {
                try {
                    zzchVar.zze(this.zzl, zzeaVar);
                    return;
                } catch (RemoteException unused2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
                    return;
                }
            }
            return;
        }
        zzchVar = this.zzh;
        if (zzchVar == null) {
        }
    }

    private final synchronized void zzU() {
        try {
            if (this.zzq.get() && this.zzj.isEmpty()) {
                this.zzq.set(false);
                if (this.zzp.get()) {
                    com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfru(this));
                }
                this.zzn.execute(new zzfrv(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzG() {
        com.google.android.gms.ads.internal.client.zzch zzchVar;
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zze);
            } catch (RemoteException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
            zzchVar = this.zzh;
            if (zzchVar == null) {
                try {
                    zzchVar.zzf(this.zzl);
                    return;
                } catch (RemoteException unused2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
                    return;
                }
            }
            return;
        }
        zzchVar = this.zzh;
        if (zzchVar == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
    public final String zzH() {
        return true != "none".equals(this.zzl) ? "2" : "1";
    }

    final /* synthetic */ zzfrf zzI() {
        return this.zzr;
    }

    final /* synthetic */ Clock zzJ() {
        return this.zzs;
    }

    final /* synthetic */ zzfrm zzK() {
        return this.zzt;
    }

    protected abstract com.google.common.util.concurrent.Xo zza(Context context);

    protected long zzb() {
        throw null;
    }

    @Nullable
    protected abstract com.google.android.gms.ads.internal.client.zzea zzc(Object obj);

    public final synchronized zzfsa zzd() {
        this.zzn.submit(new zzfrq(this));
        return this;
    }

    public final synchronized void zze() {
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            this.zzn.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv();
                }
            });
        }
    }

    public final synchronized boolean zzf() {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzK)).booleanValue()) {
                this.zzk.zza();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzD)).booleanValue() && this.zzf == null) {
                zzu();
            } else {
                zzz();
            }
        } catch (Throwable th) {
            throw th;
        }
        return !this.zzj.isEmpty();
    }

    @Nullable
    public final synchronized Object zzg() {
        try {
            boolean z2 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzN)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzL)).booleanValue() || this.zzj.size() == 1) {
                    this.zzk.zza();
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzM)).booleanValue()) {
                zzz();
            }
            Queue queue = this.zzj;
            zzfro zzfroVar = (zzfro) queue.poll();
            AtomicBoolean atomicBoolean = this.zzq;
            if (zzfroVar == null) {
                z2 = false;
            }
            atomicBoolean.set(z2);
            if (zzfroVar == null) {
                zzfroVar = null;
            } else if (!queue.isEmpty()) {
                zzfro zzfroVar2 = (zzfro) queue.peek();
                AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
                String strZzX = zzX(zzc(zzfroVar.zza()));
                if (zzfroVar2 != null && adFormat != null && strZzX != null && zzfroVar2.zzd() < zzfroVar.zzd()) {
                    this.zzr.zzg(this.zzs.currentTimeMillis(), this.zze.zzd, zzp(), strZzX, this.zzt, zzH());
                }
            }
            zzfqr zzfqrVar = this.zzf;
            if (zzfqrVar != null) {
                zzfqrVar.zzb(this);
            } else {
                long jZzy = zzy();
                if (jZzy > 0) {
                    this.zzn.schedule(new zzfrq(this), jZzy, TimeUnit.MILLISECONDS);
                } else {
                    zzu();
                }
            }
            if (zzfroVar == null) {
                return null;
            }
            return zzfroVar.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        if (this.zzf == null) {
            this.zzn.submit(new zzfrq(this));
        }
    }

    @Nullable
    public final synchronized String zzk() {
        Object objZzs;
        objZzs = zzs();
        return zzX(objZzs == null ? null : zzc(objZzs));
    }

    public final void zzl(zzfrf zzfrfVar) {
        this.zzr = zzfrfVar;
    }

    public final synchronized void zzm(int i2) {
        Preconditions.checkArgument(i2 >= 5);
        this.zzk.zzf(i2);
    }

    protected final String zzn() {
        return this.zzl;
    }

    protected final synchronized int zzp() {
        return this.zzj.size();
    }

    protected final synchronized void zzr() {
        this.zzj.clear();
    }

    @Nullable
    protected final synchronized Object zzs() {
        zzfro zzfroVar = (zzfro) this.zzj.peek();
        if (zzfroVar == null) {
            return null;
        }
        return zzfroVar.zza();
    }

    protected final synchronized void zzu() {
        zzz();
        zzU();
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            zzv();
        }
    }

    protected final synchronized void zzv() {
        com.google.common.util.concurrent.Xo xoZza;
        try {
            Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
            if (activityZzd == null) {
                String strValueOf = String.valueOf(this.zze.zza);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(strValueOf));
                xoZza = zza(this.zzb);
            } else {
                xoZza = zza(activityZzd);
            }
            zzgzo.zzr(xoZza, new zzfrp(this), this.zzn);
        } catch (Throwable th) {
            throw th;
        }
    }

    protected final void zzw(int i2) {
        zzfqr zzfqrVar;
        Preconditions.checkArgument(i2 > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i3 = this.zze.zzd;
        int size = this.zzj.size();
        synchronized (this) {
            try {
                com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
                this.zze = new com.google.android.gms.ads.internal.client.zzft(zzftVar.zza, zzftVar.zzb, zzftVar.zzc, i2 > 0 ? i2 : zzftVar.zzd);
                Queue queue = this.zzj;
                if (queue.size() > i2) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzx)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i5 = 0; i5 < i2; i5++) {
                            zzfro zzfroVar = (zzfro) queue.poll();
                            if (zzfroVar != null) {
                                arrayList.add(zzfroVar);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        if (size > arrayList.size() && (zzfqrVar = this.zzf) != null) {
                            int size2 = size - arrayList.size();
                            if (arrayList.isEmpty()) {
                                size2--;
                            }
                            zzfqrVar.zzc(this, size2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfrf zzfrfVar = this.zzr;
        if (zzfrfVar == null || adFormat == null) {
            return;
        }
        zzfrfVar.zzc(i3, i2, this.zzs.currentTimeMillis(), new zzfrm(new zzfrl(this.zze.zza, adFormat), null));
    }

    public zzfsa(String str, ClientApi clientApi, Context context, int i2, zzfkg zzfkgVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, @Nullable zzfqr zzfqrVar) {
        this(str, clientApi, context, i2, zzfkgVar, zzftVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, zzfqrVar);
        this.zzh = zzchVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static final String zzX(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzday) {
            return ((zzday) zzeaVar).zzk();
        }
        return null;
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    @Nullable
    protected final AdFormat zzo() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    protected final boolean zzq() {
        return this.zzg.get() && !this.zzm.get() && zzp() < this.zze.zzd && !this.zzk.zzd();
    }

    protected final boolean zzt() {
        return this.zzm.get();
    }

    protected final void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzC)).booleanValue()) {
            Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzp());
            bundle.putInt("plbs", this.zze.zzd);
            bundle.putString("plid", this.zzl);
        }
    }

    private zzfsa(String str, ClientApi clientApi, Context context, int i2, zzfkg zzfkgVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, @Nullable zzfqr zzfqrVar) {
        Queue priorityQueue;
        this.zzl = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i2;
        this.zzd = zzfkgVar;
        this.zze = zzftVar;
        int iMax = Math.max(1, zzftVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzX)).booleanValue()) {
            priorityQueue = new zzfsd();
        } else {
            priorityQueue = new PriorityQueue(iMax, zzfrw.zza);
        }
        this.zzj = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzm = new AtomicBoolean(false);
        this.zzn = scheduledExecutorService;
        this.zzo = zzfmyVar;
        this.zzk = zzfraVar;
        this.zzp = new AtomicBoolean(true);
        this.zzq = new AtomicBoolean(false);
        this.zzs = clock;
        zzfrl zzfrlVar = new zzfrl(zzftVar.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfrlVar.zza(str);
        this.zzt = new zzfrm(zzfrlVar, null);
        this.zzf = zzfqrVar;
    }

    final long zzy() {
        long jZzb = zzb();
        if (jZzb < 0) {
            return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzP)).longValue();
        }
        return jZzb;
    }
}
