package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgeg implements zzgdd {
    private final zzgbf zza;
    private final zzgec zzb;
    private final zzgdw zzc;
    private final ExecutorService zzd;
    private final zzgoe zze;
    private final AtomicReference zzf = new AtomicReference();

    final /* synthetic */ zzgdw zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final com.google.common.util.concurrent.Xo zza() {
        zzgec zzgecVar = this.zzb;
        zzgbf zzgbfVar = this.zza;
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzk(zzgzg.zzw(zzgecVar.zzb(zzgbfVar.zzE(), zzgbfVar.zza())), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgef
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzgdv zzgdvVar = (zzgdv) obj;
                this.zza.zzf(zzgdvVar);
                return zzgdvVar;
            }
        }, zzhaf.zza());
        zzgzo.zzr(zzgzgVar, new zzgee(this), this.zzd);
        return zzgzgVar;
    }

    public final com.google.common.util.concurrent.Xo zzb(Context context) {
        return ((zzgdv) this.zzf.get()).zzc(context);
    }

    public final com.google.common.util.concurrent.Xo zzc(Context context, String str, View view, Activity activity) {
        return ((zzgdv) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final com.google.common.util.concurrent.Xo zzd(Context context, String str, View view, Activity activity) {
        return ((zzgdv) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(InputEvent inputEvent) {
        zzgdv zzgdvVar = (zzgdv) this.zzf.get();
        if (zzgdvVar == null) {
            this.zze.zzb(54);
        } else {
            zzgdvVar.zzf(inputEvent);
        }
    }

    final /* synthetic */ zzgdv zzf(zzgdv zzgdvVar) {
        this.zzf.set(zzgdvVar);
        return zzgdvVar;
    }

    public final int zzh() {
        zzgdv zzgdvVar = (zzgdv) this.zzf.get();
        if (zzgdvVar == null) {
            return 1;
        }
        return zzgdvVar.zzg();
    }

    zzgeg(zzgbf zzgbfVar, zzgec zzgecVar, zzgdw zzgdwVar, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgbfVar;
        this.zzb = zzgecVar;
        this.zzc = zzgdwVar;
        this.zzd = executorService;
        this.zze = zzgoeVar;
    }
}
