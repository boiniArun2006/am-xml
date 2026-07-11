package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzepl extends zzcue {
    @Override // com.google.android.gms.internal.ads.zzcue
    public final zzdcr zze(Set set) {
        return new zzdcr(Collections.EMPTY_SET);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzepl(zzepp zzeppVar, View view, zzcjl zzcjlVar, zzcwd zzcwdVar, zzfis zzfisVar) {
        super(view, null, zzcwdVar, zzfisVar);
        Objects.requireNonNull(zzeppVar);
    }
}
