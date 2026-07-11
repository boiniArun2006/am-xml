package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcwn implements zzens {
    public final List zza;

    public zzcwn(List list) {
        this.zza = list;
    }

    public static zzekg zza(@NonNull zzemm zzemmVar) {
        return new zzekh(zzemmVar, zzcwm.zza);
    }

    public static zzekg zzb(@NonNull zzekg zzekgVar) {
        return new zzekh(zzekgVar, zzcwl.zza);
    }

    public zzcwn(zzcwf zzcwfVar) {
        this.zza = Collections.singletonList(zzgzo.zza(zzcwfVar));
    }

    @Override // com.google.android.gms.internal.ads.zzens
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgzo.zzr((com.google.common.util.concurrent.Xo) it.next(), new zzcwk(this), zzhaf.zza());
        }
    }
}
