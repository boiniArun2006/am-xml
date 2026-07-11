package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzof<P> extends zzoc<P> implements zzcg<P> {
    protected zzof(String str, Class<P> cls, zzamp<? extends zzamc> zzampVar) {
        super(str, cls, zzws.zza.ASYMMETRIC_PRIVATE, zzampVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final zzws zzc(zzajp zzajpVar) throws GeneralSecurityException {
        Object objZza = zzpc.zza().zza(zzqe.zza(this.zza, zzajpVar, this.zzb, zzxu.RAW, null), zzbj.zza());
        if (!(objZza instanceof zzcd)) {
            throw new GeneralSecurityException("Key not private key");
        }
        zzqe zzqeVar = (zzqe) zzpc.zza().zza(((zzcd) objZza).zzc(), zzqe.class, zzbj.zza());
        return (zzws) ((zzaky) zzws.zza().zza(zzqeVar.zzf()).zza(zzqeVar.zzd()).zza(zzqeVar.zza()).zze());
    }
}
