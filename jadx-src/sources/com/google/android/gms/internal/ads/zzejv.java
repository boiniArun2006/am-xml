package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzejv implements zzejw {
    static /* synthetic */ zzekb zzl(String str, String str2, String str3, zzejx zzejxVar, String str4, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zzfsxVarZza = zzfsx.zza("Google", str2);
        zzfsw zzfswVarZzn = zzn("javascript");
        zzfso zzfsoVarZzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzfswVarZzn == zzfswVar) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfsoVarZzp == null) {
            String strValueOf = String.valueOf(zzejxVar);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzfsw zzfswVarZzn2 = zzn(str4);
        if (zzfsoVarZzp != zzfso.VIDEO || zzfswVarZzn2 != zzfswVar) {
            zzfsl zzfslVarZza = zzfsl.zza(zzfsxVarZza, webView, str5, "");
            return new zzekb(zzfsj.zze(zzfsk.zza(zzfsoVarZzp, zzo(zzejyVar.toString()), zzfswVarZzn, zzfswVarZzn2, true), zzfslVarZza), zzfslVarZza);
        }
        String strValueOf2 = String.valueOf(str4);
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    private static zzfsw zzn(@Nullable String str) {
        return "native".equals(str) ? zzfsw.NATIVE : "javascript".equals(str) ? zzfsw.JAVASCRIPT : zzfsw.NONE;
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeju() { // from class: com.google.android.gms.internal.ads.zzejt
                @Override // com.google.android.gms.internal.ads.zzeju
                public final /* synthetic */ Object zza() {
                    if (zzfsh.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfsh.zza(context);
                    return Boolean.valueOf(zzfsh.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    @Nullable
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
            return (String) zzq(zzejk.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    @Nullable
    public final zzekb zzc(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzejy zzejyVar, final zzejx zzejxVar, @Nullable final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() || !zzfsh.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzekb) zzq(new zzeju(str7, str, str6, zzejxVar, str4, webView, str5, str8, zzejyVar) { // from class: com.google.android.gms.internal.ads.zzejl
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzejx zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzejy zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzejxVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzejyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                return zzejv.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    @Nullable
    public final zzekb zzd(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzejy zzejyVar, final zzejx zzejxVar, @Nullable final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() || !zzfsh.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzekb) zzq(new zzeju(str5, str, str8, str4, zzejxVar, webView, str6, str7, zzejyVar) { // from class: com.google.android.gms.internal.ads.zzejm
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzejx zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzejy zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzejxVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzejyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                return zzejv.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zze(final zzfsj zzfsjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
            Objects.requireNonNull(zzfsjVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfsjVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzf(final zzfsj zzfsjVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsjVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzg(final zzfsj zzfsjVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsjVar.zzd(view, zzfsq.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzh(final zzfsj zzfsjVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsjVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    @Nullable
    public final zzfsv zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z2) {
        final boolean z3 = true;
        return (zzfsv) zzq(new zzeju(webView, z3) { // from class: com.google.android.gms.internal.ads.zzejq
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                int i2 = versionInfoParcel2.buddyApkVersion;
                int i3 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(i3).length());
                sb.append(i2);
                sb.append(".");
                sb.append(i3);
                return zzfsv.zza(zzfsx.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzj(final zzfsv zzfsvVar, final zzfsu zzfsuVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsvVar.zzb(zzfsuVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzk(final zzfsv zzfsvVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsvVar.zzd(view, zzfsq.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    static /* synthetic */ zzekb zzm(String str, String str2, String str3, String str4, zzejx zzejxVar, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zzfsxVarZza = zzfsx.zza(str, str2);
        zzfsw zzfswVarZzn = zzn("javascript");
        zzfsw zzfswVarZzn2 = zzn(str4);
        zzfso zzfsoVarZzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzfswVarZzn == zzfswVar) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfsoVarZzp == null) {
            String strValueOf = String.valueOf(zzejxVar);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfsoVarZzp == zzfso.VIDEO && zzfswVarZzn2 == zzfswVar) {
            String strValueOf2 = String.valueOf(str4);
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
            return null;
        }
        zzfsl zzfslVarZzb = zzfsl.zzb(zzfsxVarZza, webView, str5, "");
        return new zzekb(zzfsj.zze(zzfsk.zza(zzfsoVarZzp, zzo(zzejyVar.toString()), zzfswVarZzn, zzfswVarZzn2, true), zzfslVarZzb), zzfslVarZzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzfsr zzo(String str) {
        byte b2;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b2 = 1;
            }
        } else if (str.equals("beginToRender")) {
            b2 = 0;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    return zzfsr.UNSPECIFIED;
                }
                return zzfsr.ONE_PIXEL;
            }
            return zzfsr.DEFINED_BY_JAVASCRIPT;
        }
        return zzfsr.BEGIN_TO_RENDER;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzfso zzp(String str) {
        byte b2;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("video")) {
                b2 = 2;
            }
        } else if (str.equals("htmlDisplay")) {
            b2 = 0;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    return null;
                }
                return zzfso.VIDEO;
            }
            return zzfso.NATIVE_DISPLAY;
        }
        return zzfso.HTML_DISPLAY;
    }

    @Nullable
    private static final Object zzq(zzeju zzejuVar) {
        try {
            return zzejuVar.zza();
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "omid exception");
        }
    }
}
