package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.a;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfbk implements zzfav {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzfbk(String str, int i2, int i3, int i5, boolean z2, int i7) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i5;
        this.zze = z2;
        this.zzf = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        zzfjz.zzb(bundle, "carrier", this.zza, !TextUtils.isEmpty(r0));
        int i2 = this.zzb;
        zzfjz.zzc(bundle, l.f62637R, i2, i2 != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle bundleZza = zzfjz.zza(bundle, "device");
        bundle.putBundle("device", bundleZza);
        Bundle bundleZza2 = zzfjz.zza(bundleZza, a.f62814d);
        bundleZza.putBundle(a.f62814d, bundleZza2);
        bundleZza2.putInt("active_network_state", this.zzf);
        bundleZza2.putBoolean("active_network_metered", this.zze);
    }
}
