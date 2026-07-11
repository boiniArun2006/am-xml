package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcen;
import com.google.common.util.concurrent.Xo;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbl {
    private static zzasb zza;
    private static final Object zzb = new Object();

    public final Xo zza(String str) {
        zzcen zzcenVar = new zzcen();
        zza.zzb(new zzbk(str, null, zzcenVar));
        return zzcenVar;
    }

    public final Xo zzb(int i2, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbi zzbiVar = new zzbi(null);
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i2, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, "GET", zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzarg e2) {
                String message = e2.getMessage();
                int i3 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.zzb(zzbhVar);
        return zzbiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbl(Context context) {
        zzasb zzasbVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zzbhe.zza(context);
                    if (!ClientLibraryUtils.isPackageSide()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfp)).booleanValue()) {
                            zzasbVarZza = zzay.zzb(context);
                        } else {
                            zzasbVarZza = zzatd.zza(context, null);
                        }
                        zza = zzasbVarZza;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
