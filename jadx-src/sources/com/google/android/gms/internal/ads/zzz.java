package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzz {

    @Nullable
    private String zza;

    @Nullable
    private Uri zzb;
    private final zzaa zzc = new zzaa();
    private final List zzd;
    private final zzguf zze;
    private final zzae zzf;
    private final zzai zzg;

    public final zzz zzb(@Nullable Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzz zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzak zzc() {
        zzag zzagVar;
        Uri uri = this.zzb;
        byte[] bArr = null;
        if (uri != null) {
            zzagVar = new zzag(uri, null, null, null, this.zzd, null, this.zze, null, -9223372036854775807L, null);
        } else {
            zzagVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzak(str, new zzac(this.zzc, null), zzagVar, new zzaf(this.zzf, bArr), zzan.zza, this.zzg, null);
    }

    public zzz() {
        zzguf.zzi();
        this.zzd = Collections.EMPTY_LIST;
        this.zze = zzguf.zzi();
        this.zzf = new zzae();
        this.zzg = zzai.zza;
    }
}
