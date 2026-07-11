package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzfxx implements Closeable {
    public static zzfyj zza() {
        return new zzfyj();
    }

    public static zzfyj zzb(zzgru<Integer> zzgruVar, zzgru<Integer> zzgruVar2, zzfxz zzfxzVar) {
        return new zzfyj(zzgruVar, zzgruVar2, zzfxzVar);
    }

    public static zzfyj zzc(final int i2, zzfxz zzfxzVar) {
        return new zzfyj(new zzgru() { // from class: com.google.android.gms.internal.ads.zzfxw
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        }, zzfxv.zza, zzfxzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }
}
