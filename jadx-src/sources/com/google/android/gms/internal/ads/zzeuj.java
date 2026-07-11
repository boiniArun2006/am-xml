package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final /* synthetic */ class zzeuj implements zzgqt {
    static final /* synthetic */ zzeuj zza = new zzeuj();

    private /* synthetic */ zzeuj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzeul(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
