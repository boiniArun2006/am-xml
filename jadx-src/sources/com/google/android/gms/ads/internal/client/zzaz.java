package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.android.gms.internal.ads.zzcdd;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaz {
    private final zzk zza;
    private final zzi zzb;
    private final zzff zzc;
    private final zzbmo zzd;
    private final zzbxp zze;
    private final zzbmp zzf;
    private zzbyr zzg;
    private final zzl zzh;

    public zzaz(zzk zzkVar, zzi zziVar, zzff zzffVar, zzbmo zzbmoVar, zzcbl zzcblVar, zzbxp zzbxpVar, zzbmp zzbmpVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzffVar;
        this.zzd = zzbmoVar;
        this.zze = zzbxpVar;
        this.zzf = zzbmpVar;
        this.zzh = zzlVar;
    }

    final /* synthetic */ zzk zzn() {
        return this.zza;
    }

    final /* synthetic */ zzi zzo() {
        return this.zzb;
    }

    final /* synthetic */ zzff zzp() {
        return this.zzc;
    }

    final /* synthetic */ zzbmo zzq() {
        return this.zzd;
    }

    final /* synthetic */ zzbxp zzr() {
        return this.zze;
    }

    final /* synthetic */ zzbmp zzs() {
        return this.zzf;
    }

    final /* synthetic */ zzbyr zzt() {
        return this.zzg;
    }

    final /* synthetic */ void zzu(zzbyr zzbyrVar) {
        this.zzg = zzbyrVar;
    }

    final /* synthetic */ zzl zzv() {
        return this.zzh;
    }

    static /* synthetic */ void zzm(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(FileUploadManager.f61572j, "no_ads_fallback");
        bundle.putString("flow", str);
        zzbb.zza().zzh(context, zzbb.zzg().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbx zza(Context context, zzr zzrVar, String str, zzbtt zzbttVar) {
        return (zzbx) new zzam(this, context, zzrVar, str, zzbttVar).zzd(context, false);
    }

    public final zzbx zzb(Context context, zzr zzrVar, String str, zzbtt zzbttVar) {
        return (zzbx) new zzao(this, context, zzrVar, str, zzbttVar).zzd(context, false);
    }

    public final zzbt zzc(Context context, String str, zzbtt zzbttVar) {
        return (zzbt) new zzaq(this, context, str, zzbttVar).zzd(context, false);
    }

    public final zzck zzd(Context context, zzbtt zzbttVar) {
        return (zzck) new zzas(this, context, zzbttVar).zzd(context, false);
    }

    public final zzbkw zze(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbkw) new zzaw(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzblc zzf(View view, HashMap map, HashMap map2) {
        return (zzblc) new zzay(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final zzcaz zzg(Context context, String str, zzbtt zzbttVar) {
        return (zzcaz) new zzaa(this, context, str, zzbttVar).zzd(context, false);
    }

    @Nullable
    public final zzbxs zzh(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("useClientJar flag not found in activity intent extras.");
        }
        return (zzbxs) zzacVar.zzd(activity, booleanExtra);
    }

    @Nullable
    public final zzdw zzi(Context context, zzbtt zzbttVar) {
        return (zzdw) new zzae(this, context, zzbttVar).zzd(context, false);
    }

    @Nullable
    public final zzcdd zzj(Context context, zzbtt zzbttVar) {
        return (zzcdd) new zzag(this, context, zzbttVar).zzd(context, false);
    }

    @Nullable
    public final zzbxl zzk(Context context, zzbtt zzbttVar) {
        return (zzbxl) new zzai(this, context, zzbttVar).zzd(context, false);
    }

    public final zzbpk zzl(Context context, zzbtt zzbttVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbpk) new zzak(this, context, zzbttVar, onH5AdsEventListener).zzd(context, false);
    }
}
