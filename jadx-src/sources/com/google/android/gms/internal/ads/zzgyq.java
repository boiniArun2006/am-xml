package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class zzgyq extends zzgyu {
    private static final zzgzw zza = new zzgzw(zzgyq.class);
    private zzgub zzb;
    private final boolean zzc;
    private final boolean zzd;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i2, com.google.common.util.concurrent.Xo xo) {
        try {
            if (xo.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i2, xo);
            }
            zzz(null);
        } catch (Throwable th) {
            zzz(null);
            throw th;
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", CreativeInfo.f62442f, true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    void zzA(int i2) {
        this.zzb = null;
    }

    abstract void zzw(int i2, Object obj);

    abstract void zzx();

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        zzgub zzgubVar = this.zzb;
        zzA(1);
        if ((zzgubVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgwt it = zzgubVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        zzgub zzgubVar = this.zzb;
        return zzgubVar != null ? "futures=".concat(zzgubVar.toString()) : super.zzd();
    }

    final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgwt it = this.zzb.iterator();
            final int i2 = 0;
            while (it.hasNext()) {
                final com.google.common.util.concurrent.Xo xo = (com.google.common.util.concurrent.Xo) it.next();
                int i3 = i2 + 1;
                if (xo.isDone()) {
                    zzy(i2, xo);
                } else {
                    xo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyp
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i2, xo);
                        }
                    }, zzgzd.INSTANCE);
                }
                i2 = i3;
            }
            return;
        }
        zzgub zzgubVar = this.zzb;
        final zzgub zzgubVar2 = true != this.zzd ? null : zzgubVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgubVar2);
            }
        };
        zzgwt it2 = zzgubVar.iterator();
        while (it2.hasNext()) {
            com.google.common.util.concurrent.Xo xo2 = (com.google.common.util.concurrent.Xo) it2.next();
            if (xo2.isDone()) {
                zzz(zzgubVar2);
            } else {
                xo2.addListener(runnable, zzgzd.INSTANCE);
            }
        }
    }

    zzgyq(zzgub zzgubVar, boolean z2, boolean z3) {
        super(zzgubVar.size());
        this.zzb = zzgubVar;
        this.zzc = z2;
        this.zzd = z3;
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }

    private final void zzG(int i2, Future future) {
        try {
            zzw(i2, zzhap.zza(future));
        } catch (ExecutionException e2) {
            zzE(e2.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgub zzgubVar) {
        boolean z2;
        int iZzC = zzC();
        int i2 = 0;
        if (iZzC >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zzj(z2, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgubVar != null) {
                zzgwt it = zzgubVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i2, future);
                    }
                    i2++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    final void zzf(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable thZzl = zzl();
            Objects.requireNonNull(thZzl);
            zzI(set, thZzl);
        }
    }
}
