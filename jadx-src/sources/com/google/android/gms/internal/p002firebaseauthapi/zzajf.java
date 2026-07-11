package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import com.google.android.gms.internal.p002firebaseauthapi.zzajf;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class zzajf<MessageType extends zzajf<MessageType, BuilderType>, BuilderType extends zzaje<MessageType, BuilderType>> implements zzamc {
    protected int zza = 0;

    int zza(zzamv zzamvVar) {
        int iZzi = zzi();
        if (iZzi != -1) {
            return iZzi;
        }
        int iZza = zzamvVar.zza(this);
        zzb(iZza);
        return iZza;
    }

    void zzb(int i2) {
        throw new UnsupportedOperationException();
    }

    int zzi() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final zzajp a_() {
        try {
            zzaju zzajuVarZzc = zzajp.zzc(zzl());
            zza(zzajuVarZzc.zzb());
            return zzajuVarZzc.zza();
        } catch (IOException e2) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e2);
        }
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzakg zzakgVarZzb = zzakg.zzb(bArr);
            zza(zzakgVarZzb);
            zzakgVarZzb.zzb();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e2);
        }
    }

    public final void zza(OutputStream outputStream) throws IOException {
        zzakg zzakgVarZza = zzakg.zza(outputStream, zzakg.zzf(zzl()));
        zza(zzakgVarZza);
        zzakgVarZza.zzc();
    }
}
