package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaru;
import com.google.android.gms.internal.ads.zzary;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzasn;
import com.google.android.gms.internal.ads.zzasu;
import com.google.android.gms.internal.ads.zzasz;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzfxl;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzay extends zzasn {
    private final Context zzb;

    public static zzasb zzb(Context context) {
        zzasb zzasbVar = new zzasb(new zzasu(new File(zzfxl.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new zzay(context, new zzasz(null, null)), 4);
        zzasbVar.zza();
        return zzasbVar;
    }

    private zzay(Context context, zzasm zzasmVar) {
        super(zzasmVar);
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzasn, com.google.android.gms.internal.ads.zzarr
    public final zzaru zza(zzary zzaryVar) throws zzash {
        if (zzaryVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfq), zzaryVar.zzh())) {
                Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzbb.zza();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 13400000)) {
                    zzaru zzaruVarZza = new zzbqf(context).zza(zzaryVar);
                    if (zzaruVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzaryVar.zzh())));
                        return zzaruVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzaryVar.zzh())));
                }
            }
        }
        return super.zza(zzaryVar);
    }
}
