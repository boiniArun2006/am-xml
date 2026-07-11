package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.safedk.android.analytics.brandsafety.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgiu implements zzfxb {
    private final Context zza;
    private final zzgmz zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    final void zza(Map map) {
        com.google.common.util.concurrent.Xo xo;
        zzaxg zzaxgVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            xo = (com.google.common.util.concurrent.Xo) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strZzb = (xo == null || (Build.VERSION.SDK_INT >= 31 && !xo.isDone()) || (zzaxgVar = (zzaxg) xo.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzaxgVar.zzb().length() <= 1) ? "E" : zzaxgVar.zzb();
        if (strZzb.equals("E")) {
            try {
                com.google.common.util.concurrent.Xo xo2 = (com.google.common.util.concurrent.Xo) map.get("ai");
                if (xo2 != null) {
                    String str = (String) xo2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgrt.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put(l.f62668w, strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    zzgiu(Context context, zzgbf zzgbfVar, zzgmz zzgmzVar) {
        this.zza = context;
        this.zzc = zzgbfVar.zzb();
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
        this.zzb = zzgmzVar;
    }
}
