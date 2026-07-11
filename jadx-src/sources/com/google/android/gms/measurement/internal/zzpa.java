package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzpa implements zzpn {
    final /* synthetic */ zzpf zza;

    zzpa(zzpf zzpfVar) {
        Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpn
    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            zzpf zzpfVar = this.zza;
            if (zzpfVar.zzaw() != null) {
                zzpfVar.zzaw().zzaV().zzb().zzb("AppId not known when logging event", str2);
                return;
            }
            return;
        }
        this.zza.zzaW().zzj(new zzoz(this, str, str2, bundle));
    }
}
