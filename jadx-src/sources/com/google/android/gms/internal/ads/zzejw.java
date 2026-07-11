package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface zzejw {
    boolean zza(Context context);

    @Nullable
    String zzb(Context context);

    @Nullable
    zzekb zzc(String str, WebView webView, String str2, String str3, @Nullable String str4, zzejy zzejyVar, zzejx zzejxVar, @Nullable String str5);

    @Nullable
    zzekb zzd(String str, WebView webView, String str2, String str3, @Nullable String str4, String str5, zzejy zzejyVar, zzejx zzejxVar, @Nullable String str6);

    void zze(zzfsj zzfsjVar);

    void zzf(zzfsj zzfsjVar);

    void zzg(zzfsj zzfsjVar, View view);

    void zzh(zzfsj zzfsjVar, View view);

    @Nullable
    zzfsv zzi(VersionInfoParcel versionInfoParcel, WebView webView, boolean z2);

    void zzj(zzfsv zzfsvVar, zzfsu zzfsuVar);

    void zzk(zzfsv zzfsvVar, View view);
}
