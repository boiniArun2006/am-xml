package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final /* synthetic */ class zzvc implements zzvf {
    static final /* synthetic */ zzvc zza = new zzvc();

    private /* synthetic */ zzvc() {
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final /* synthetic */ int zza(Object obj) {
        int i2 = zzvg.zza;
        String str = ((zzun) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
