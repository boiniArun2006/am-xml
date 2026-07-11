package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import ep.oxM.esLNYym;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgjq implements zzgjf {
    private final zzfxa zza;
    private final zzgky zzb;
    private final zzgmu zzc;
    private final zzgoe zzd;
    private final ExecutorService zze;
    private final AtomicReference zzf = new AtomicReference("2.825731049.-1");

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final int zzg() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final String zza() {
        return (String) this.zzf.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final com.google.common.util.concurrent.Xo zzb() {
        return (zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzg(zzgzg.zzw(this.zzb.zzb()), Throwable.class, zzgjp.zza, zzhaf.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgjh
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzh((zzgdu) obj);
                return new Boolean(true);
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgji
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzi((Boolean) obj);
            }
        }, zzhaf.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgjj
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzj((zzfwq) obj);
                return new Boolean(true);
            }
        }, zzhaf.zza()), zzgjk.zza, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final com.google.common.util.concurrent.Xo zzc(final Context context) {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgjl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(context);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final com.google.common.util.concurrent.Xo zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgzo.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgjm
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final com.google.common.util.concurrent.Xo zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgzo.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgjn
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final void zzf(InputEvent inputEvent) {
        zzfvk zzfvkVarZzb = this.zza.zzb();
        if (zzfvkVarZzb == null) {
            this.zzd.zzb(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                zzfvkVarZzb.zzd(null, (MotionEvent) inputEvent);
            } catch (zzfwz e2) {
                this.zzd.zzd(15005, e2);
            }
        }
    }

    final /* synthetic */ boolean zzh(zzgdu zzgduVar) {
        if (this.zzc.zzb(zzgduVar) && zzgduVar != null) {
            return true;
        }
        this.zzd.zzb(15003);
        throw new zzgjg(1);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzi(Boolean bool) {
        return this.zzb.zze();
    }

    final /* synthetic */ boolean zzj(final zzfwq zzfwqVar) {
        if (zzfwqVar == null) {
            throw new zzgjg(3);
        }
        File fileZzb = zzfwqVar.zzb();
        if (Build.VERSION.SDK_INT >= 34) {
            fileZzb.setReadOnly();
        }
        this.zzd.zzf(15002, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgjo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(zzfwqVar);
            }
        });
        return true;
    }

    final /* synthetic */ String zzk(Context context) {
        zzfvk zzfvkVarZzb = this.zza.zzb();
        if (zzfvkVarZzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String strZza = zzfvkVarZzb.zza(context, null);
        if (strZza != null) {
            return strZza;
        }
        this.zzd.zzb(15006);
        return "";
    }

    final /* synthetic */ String zzl(Context context, String str, View view, Activity activity) {
        zzfvk zzfvkVarZzb = this.zza.zzb();
        if (zzfvkVarZzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String strZzb = zzfvkVarZzb.zzb(context, null, view, activity);
        if (strZzb != null) {
            return strZzb;
        }
        this.zzd.zzb(15007);
        return "";
    }

    final /* synthetic */ String zzm(Context context, String str, View view, Activity activity) {
        zzfvk zzfvkVarZzb = this.zza.zzb();
        String str2 = esLNYym.mWOAYqyqg;
        if (zzfvkVarZzb == null) {
            this.zzd.zzb(15004);
            return str2;
        }
        String strZzc = zzfvkVarZzb.zzc(context, null, str, view, null);
        if (strZzc != null) {
            return strZzc;
        }
        this.zzd.zzb(15008);
        return str2;
    }

    final /* synthetic */ void zzn(zzfwq zzfwqVar) {
        if (!this.zza.zza(zzfwqVar)) {
            throw new zzgjg(2);
        }
        this.zzf.set("2.825731049.".concat(String.valueOf(zzfwqVar.zza().zza())));
    }

    zzgjq(zzfxa zzfxaVar, zzgky zzgkyVar, zzgmu zzgmuVar, zzgoe zzgoeVar, ExecutorService executorService) {
        this.zza = zzfxaVar;
        this.zzb = zzgkyVar;
        this.zzc = zzgmuVar;
        this.zzd = zzgoeVar;
        this.zze = executorService;
    }
}
