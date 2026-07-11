package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@MainThread
@VisibleForTesting
final class zzkx implements Application.ActivityLifecycleCallbacks, zzkv {
    final /* synthetic */ zzli zza;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // com.google.android.gms.measurement.internal.zzkv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) throws Throwable {
        zzkx zzkxVar;
        zzib zzibVar;
        zzli zzliVar;
        zzib zzibVar2;
        Intent intent;
        Uri uri;
        try {
            try {
                zzliVar = this.zza;
                zzibVar2 = zzliVar.zzu;
                zzibVar2.zzaV().zzk().zza("onActivityCreated");
                intent = zzdfVar.zzc;
            } catch (Throwable th) {
                th = th;
                zzkxVar.zza.zzu.zzs().zzm(zzdfVar, bundle);
                throw th;
            }
        } catch (RuntimeException e2) {
            e = e2;
            zzkxVar = this;
        } catch (Throwable th2) {
            th = th2;
            zzkxVar = this;
            zzkxVar.zza.zzu.zzs().zzm(zzdfVar, bundle);
            throw th;
        }
        if (intent != null) {
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                uri = null;
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                        uri = data;
                    }
                }
                if (uri != null && uri.isHierarchical()) {
                    zzibVar2.zzk();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    String str = (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : TtmlNode.TEXT_EMPHASIS_AUTO;
                    String queryParameter = uri.getQueryParameter("referrer");
                    zzkxVar = this;
                    try {
                        zzibVar2.zzaW().zzj(new zzkw(zzkxVar, bundle != null, uri, str, queryParameter));
                    } catch (RuntimeException e3) {
                        e = e3;
                        zzkxVar.zza.zzu.zzaV().zzb().zzb("Throwable caught in onActivityCreated", e);
                    }
                    zzibVar = zzkxVar.zza.zzu;
                }
            } else {
                uri = data;
                if (uri != null) {
                    zzibVar2.zzk();
                    String stringExtra2 = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra2)) {
                        String str2 = (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra2) || "https://www.google.com".equals(stringExtra2) || "android-app://com.google.appcrawler".equals(stringExtra2)) ? "gs" : TtmlNode.TEXT_EMPHASIS_AUTO;
                        String queryParameter2 = uri.getQueryParameter("referrer");
                        zzkxVar = this;
                        zzibVar2.zzaW().zzj(new zzkw(zzkxVar, bundle != null, uri, str2, queryParameter2));
                        zzibVar = zzkxVar.zza.zzu;
                    }
                }
            }
            zzibVar.zzs().zzm(zzdfVar, bundle);
        }
        zzibVar = zzliVar.zzu;
        zzibVar.zzs().zzm(zzdfVar, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zzb(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        this.zza.zzu.zzs().zzs(zzdfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    @MainThread
    public final void zzc(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        zzib zzibVar = this.zza.zzu;
        zzibVar.zzs().zzp(zzdfVar);
        zzob zzobVarZzh = zzibVar.zzh();
        zzib zzibVar2 = zzobVarZzh.zzu;
        zzibVar2.zzaW().zzj(new zznu(zzobVarZzh, zzibVar2.zzaZ().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    @MainThread
    public final void zzd(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        zzib zzibVar = this.zza.zzu;
        zzob zzobVarZzh = zzibVar.zzh();
        zzib zzibVar2 = zzobVarZzh.zzu;
        zzibVar2.zzaW().zzj(new zznt(zzobVarZzh, zzibVar2.zzaZ().elapsedRealtime()));
        zzibVar.zzs().zzn(zzdfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zze(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        this.zza.zzu.zzs().zzq(zzdfVar, bundle);
    }

    zzkx(zzli zzliVar) {
        Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        zza(com.google.android.gms.internal.measurement.zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzd(com.google.android.gms.internal.measurement.zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zze(com.google.android.gms.internal.measurement.zzdf.zza(activity), bundle);
    }
}
