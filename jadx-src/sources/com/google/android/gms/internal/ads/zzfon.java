package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfon {
    public static zzfmu zzc(final zzfoe zzfoeVar) {
        return new zzfmu() { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfoeVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(com.google.common.util.concurrent.Xo xo, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(xo, zzfooVar, zzfoeVar, false);
    }

    public static void zze(com.google.common.util.concurrent.Xo xo, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(xo, zzfooVar, zzfoeVar, true);
    }

    public static int zzg(zzfjk zzfjkVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfjkVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    public static void zzb(com.google.common.util.concurrent.Xo xo, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(xo), new zzfoj(zzfoeVar), zzcei.zzg);
        }
    }

    public static void zzf(com.google.common.util.concurrent.Xo xo, zzfoo zzfooVar, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(xo), new zzfol(zzfooVar, zzfoeVar), zzcei.zzg);
        }
    }

    private static void zzh(com.google.common.util.concurrent.Xo xo, zzfoo zzfooVar, zzfoe zzfoeVar, boolean z2) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(xo), new zzfok(zzfooVar, zzfoeVar, z2), zzcei.zzg);
        }
    }

    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzke), str);
    }
}
