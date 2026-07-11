package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbro implements zzbrg, zzbre {

    @Nullable
    private zzcjl zza;

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzh(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzi(final zzbrf zzbrfVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzclj zzcljVarZzP = zzcjlVar.zzP();
            Objects.requireNonNull(zzbrfVar);
            zzcljVarZzP.zzH(new zzcli() { // from class: com.google.android.gms.internal.ads.zzbri
                @Override // com.google.android.gms.internal.ads.zzcli
                public final /* synthetic */ void zza() {
                    zzbrfVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzj() {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final boolean zzk() {
        zzcjl zzcjlVar = this.zza;
        return zzcjlVar == null || zzcjlVar.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final zzbsn zzl() {
        return new zzbsn(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzm(String str, zzboh zzbohVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzab(str, new zzbrh(this, zzbohVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzn(String str, final zzboh zzbohVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzad(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbrm
                @Override // com.google.android.gms.common.util.Predicate
                public final /* synthetic */ boolean apply(Object obj) {
                    zzboh zzbohVar2 = (zzboh) obj;
                    if (zzbohVar2 instanceof zzbrh) {
                        return ((zzbrh) zzbohVar2).zzb().equals(zzbohVar);
                    }
                    return false;
                }
            });
        }
    }

    final /* synthetic */ void zzo(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zza(str);
        }
    }

    final /* synthetic */ void zzp(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.loadData(str, "text/html", com.google.android.exoplayer2.C.UTF8_NAME);
        }
    }

    final /* synthetic */ void zzq(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.loadData(str, "text/html", com.google.android.exoplayer2.C.UTF8_NAME);
        }
    }

    final /* synthetic */ void zzr(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.loadUrl(str);
        }
    }

    public zzbro(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzazh zzazhVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcka {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzcjl zzcjlVarZza = zzckb.zza(context, zzclv.zzb(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbgd.zza(), null, null, null, null, null);
        this.zza = zzcjlVarZza;
        zzcjlVarZza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzz()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (!com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzf(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(str);
            }
        });
    }
}
