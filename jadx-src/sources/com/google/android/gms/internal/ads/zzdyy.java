package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdyy implements AppEventListener, zzdel, com.google.android.gms.ads.internal.client.zza, zzdbf, zzdbz, zzdca, zzdct, zzdbi, zzfnv {
    private final List zza;
    private final zzdym zzb;
    private long zzc;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzi(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
        zzi(zzdbf.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        zzi(zzdbz.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
        zzi(zzdbf.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
        zzi(zzdbf.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
        zzi(zzdbf.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
        zzi(zzdbf.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzi(zzdbi.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    public zzdyy(zzdym zzdymVar, zzcma zzcmaVar) {
        this.zzb = zzdymVar;
        this.zza = Collections.singletonList(zzcmaVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzi(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zza(Context context) {
        zzi(zzdca.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzb(Context context) {
        zzi(zzdca.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzc(Context context) {
        zzi(zzdca.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(zzcag zzcagVar, String str, String str2) {
        zzi(zzdbf.class, "onRewarded", zzcagVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdK(zzfno zzfnoVar, String str) {
        zzi(zzfnn.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdL(zzfno zzfnoVar, String str) {
        zzi(zzfnn.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        zzi(zzfnn.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdN(zzfno zzfnoVar, String str) {
        zzi(zzfnn.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        zzi(zzdel.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        zzi(zzdct.class, "onAdLoaded", new Object[0]);
    }
}
