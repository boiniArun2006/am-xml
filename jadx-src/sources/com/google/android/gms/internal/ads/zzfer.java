package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfer implements zzdbi, zzdde, zzfgg, com.google.android.gms.ads.internal.overlay.zzr, zzddw, zzdbv, zzdjm {
    private final zzfkv zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();

    @Nullable
    private zzfer zzh = null;

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    public static zzfer zzn(zzfer zzferVar) {
        zzfer zzferVar2 = new zzfer(zzferVar.zza);
        zzferVar2.zzh = zzferVar;
        return zzferVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdI(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzffy.zza(atomicReference, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfeh
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbfa) obj).zzd(zzeVar);
            }
        });
        zzffy.zza(atomicReference, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfei
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbfa) obj).zzc(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdS();
        } else {
            zzffy.zza(this.zzf, zzfed.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(final int i2) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdT(i2);
        } else {
            zzffy.zza(this.zzf, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfej
                @Override // com.google.android.gms.internal.ads.zzffx
                public final /* synthetic */ void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdT(i2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdu();
        } else {
            zzffy.zza(this.zzd, zzfep.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzdv();
        } else {
            zzffy.zza(this.zzf, zzfee.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzh();
            return;
        }
        zzffy.zza(this.zzf, zzfef.zza);
        AtomicReference atomicReference = this.zzd;
        zzffy.zza(atomicReference, zzfen.zza);
        zzffy.zza(atomicReference, zzfeo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzj(zzeVar);
        } else {
            zzffy.zza(this.zzd, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfek
                @Override // com.google.android.gms.internal.ads.zzffx
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbfe) obj).zze(zzeVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzl() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzl();
        } else {
            zzffy.zza(this.zze, zzfec.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzm(zztVar);
        } else {
            zzffy.zza(this.zzg, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfel
                @Override // com.google.android.gms.internal.ads.zzffx
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
                }
            });
        }
    }

    public final void zzo(zzbfa zzbfaVar) {
        this.zzb.set(zzbfaVar);
    }

    public final void zzp(zzbfe zzbfeVar) {
        this.zzd.set(zzbfeVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzg.set(zzdtVar);
    }

    public final void zzs(final zzbex zzbexVar) {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzs(zzbexVar);
        } else {
            zzffy.zza(this.zzb, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfeg
                @Override // com.google.android.gms.internal.ads.zzffx
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbfa) obj).zzb(zzbexVar);
                }
            });
        }
    }

    public final void zzt() {
        zzfer zzferVar = this.zzh;
        if (zzferVar != null) {
            zzferVar.zzt();
            return;
        }
        this.zza.zzb();
        zzffy.zza(this.zzc, zzfem.zza);
        zzffy.zza(this.zzd, zzfeq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzu(zzfgg zzfggVar) {
        this.zzh = (zzfer) zzfggVar;
    }

    public zzfer(zzfkv zzfkvVar) {
        this.zza = zzfkvVar;
    }
}
