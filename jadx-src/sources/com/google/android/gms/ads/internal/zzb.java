package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzcce;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;

    @Nullable
    private final zzcce zzc;
    private final zzbzb zzd = new zzbzb(false, Collections.EMPTY_LIST);

    private final boolean zzd() {
        zzcce zzcceVar = this.zzc;
        return (zzcceVar != null && zzcceVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public zzb(Context context, @Nullable zzcce zzcceVar, @Nullable zzbzb zzbzbVar) {
        this.zza = context;
        this.zzc = zzcceVar;
    }

    public final void zzc(@Nullable String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzcce zzcceVar = this.zzc;
            if (zzcceVar != null) {
                zzcceVar.zze(str, null, 3);
                return;
            }
            zzbzb zzbzbVar = this.zzd;
            if (zzbzbVar.zza && (list = zzbzbVar.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.zza;
                        zzt.zzc();
                        com.google.android.gms.ads.internal.util.zzs.zzQ(context, "", strReplace);
                    }
                }
            }
        }
    }
}
