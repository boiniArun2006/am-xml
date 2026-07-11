package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzbg implements zzbx {
    private final OutputStream zza;

    public static zzbx zza(OutputStream outputStream) {
        return new zzbg(outputStream);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbx
    public final void zza(zzvq zzvqVar) throws IOException {
        try {
            ((zzvq) ((zzaky) zzvqVar.zzn().zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    private zzbg(OutputStream outputStream) {
        this.zza = outputStream;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbx
    public final void zza(zzxc zzxcVar) throws IOException {
        try {
            zzxcVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
