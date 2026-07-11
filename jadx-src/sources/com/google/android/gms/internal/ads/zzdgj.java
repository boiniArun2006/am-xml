package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdgj extends zzdhd implements zzbmz {
    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdgi
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }

    public zzdgj(Set set) {
        super(set);
    }
}
