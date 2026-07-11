package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfsl {
    private final zzfsx zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;
    private final zzfsm zzg;

    public final zzfsx zzc() {
        return this.zza;
    }

    public final WebView zzf() {
        return this.zzb;
    }

    @Nullable
    public final String zzg() {
        return this.zzf;
    }

    @Nullable
    public final String zzh() {
        return this.zze;
    }

    public final zzfsm zzi() {
        return this.zzg;
    }

    public static zzfsl zza(zzfsx zzfsxVar, WebView webView, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzfuh.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfsl(zzfsxVar, webView, null, null, str, str2, zzfsm.HTML);
    }

    public static zzfsl zzb(zzfsx zzfsxVar, WebView webView, @Nullable String str, @Nullable String str2) {
        zzfuh.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfsl(zzfsxVar, webView, null, null, str, "", zzfsm.JAVASCRIPT);
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zze() {
        return Collections.unmodifiableMap(this.zzd);
    }

    private zzfsl(zzfsx zzfsxVar, WebView webView, String str, List list, @Nullable String str2, @Nullable String str3, zzfsm zzfsmVar) {
        this.zza = zzfsxVar;
        this.zzb = webView;
        this.zzg = zzfsmVar;
        this.zzf = str2;
        this.zze = str3;
    }
}
