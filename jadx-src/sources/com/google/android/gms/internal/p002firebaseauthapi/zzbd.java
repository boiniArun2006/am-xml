package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzbd implements zzby {
    private final InputStream zza;

    public static zzby zza(byte[] bArr) {
        return new zzbd(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzby
    public final zzvq zza() throws IOException {
        try {
            return zzvq.zza(this.zza, zzakk.zza());
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzby
    public final zzxc zzb() throws IOException {
        try {
            return zzxc.zza(this.zza, zzakk.zza());
        } finally {
            this.zza.close();
        }
    }

    private zzbd(InputStream inputStream) {
        this.zza = inputStream;
    }
}
