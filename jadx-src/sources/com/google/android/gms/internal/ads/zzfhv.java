package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfhv implements OnAdMetadataChangedListener, zzdct, zzdbi, zzdbf, zzdbv, zzddw, zzfgg, zzdjm {
    private final zzfkv zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfhv zzi = null;

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.onAdMetadataChanged();
        } else {
            zzffy.zza(this.zzb, zzfhu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(final zzcag zzcagVar, final String str, final String str2) {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzd(zzcagVar, str, str2);
            return;
        }
        zzffy.zza(this.zzd, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfhb
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzcag zzcagVar2 = zzcagVar;
                ((zzcbc) obj).zzg(new zzcbq(zzcagVar2.zzb(), zzcagVar2.zzc()));
            }
        });
        zzffy.zza(this.zzf, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfhc
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzcag zzcagVar2 = zzcagVar;
                ((zzcbh) obj).zze(new zzcbq(zzcagVar2.zzb(), zzcagVar2.zzc()), str, str2);
            }
        });
        zzffy.zza(this.zze, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfhd
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcam) obj).zzi(zzcagVar);
            }
        });
        zzffy.zza(this.zzg, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfhe
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcah) obj).zze(zzcagVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzdI(zzeVar);
            return;
        }
        final int i2 = zzeVar.zza;
        AtomicReference atomicReference = this.zzc;
        zzffy.zza(atomicReference, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfhi
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbg) obj).zzg(zzeVar);
            }
        });
        zzffy.zza(atomicReference, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfgz
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbg) obj).zzf(i2);
            }
        });
        zzffy.zza(this.zze, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfha
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcam) obj).zzk(i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzdJ();
        } else {
            zzffy.zza(this.zze, zzfhq.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzds();
            return;
        }
        this.zza.zzb();
        zzffy.zza(this.zzd, zzfhk.zza);
        zzffy.zza(this.zze, zzfhp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzdt();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzffy.zza(atomicReference, zzfhm.zza);
        zzffy.zza(this.zze, zzfho.zza);
        zzffy.zza(atomicReference, zzfhj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzdu();
        } else {
            zzffy.zza(this.zzd, zzfhl.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zze();
        } else {
            zzffy.zza(this.zze, zzfhr.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzf();
        } else {
            zzffy.zza(this.zze, zzfhs.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzg();
        } else {
            zzffy.zza(this.zzc, zzfhn.zza);
            zzffy.zza(this.zze, zzfht.zza);
        }
    }

    public final void zzh(zzcbg zzcbgVar) {
        this.zzc.set(zzcbgVar);
    }

    public final void zzi(zzcbc zzcbcVar) {
        this.zzd.set(zzcbcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzj(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzffy.zza(atomicReference, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfhf
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbc) obj).zzi(zzeVar);
            }
        });
        zzffy.zza(atomicReference, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfhg
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbc) obj).zzh(zzeVar.zza);
            }
        });
    }

    public final void zzk(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzh.set(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzm(@NonNull final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfhv zzfhvVar = this.zzi;
        if (zzfhvVar != null) {
            zzfhvVar.zzm(zztVar);
        } else {
            zzffy.zza(this.zzh, new zzffx() { // from class: com.google.android.gms.internal.ads.zzfhh
                @Override // com.google.android.gms.internal.ads.zzffx
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
                }
            });
        }
    }

    @Deprecated
    public final void zzn(zzcam zzcamVar) {
        this.zze.set(zzcamVar);
    }

    public final void zzo(zzcbh zzcbhVar) {
        this.zzf.set(zzcbhVar);
    }

    @Deprecated
    public final void zzp(zzcah zzcahVar) {
        this.zzg.set(zzcahVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzu(zzfgg zzfggVar) {
        this.zzi = (zzfhv) zzfggVar;
    }

    public zzfhv(zzfkv zzfkvVar) {
        this.zza = zzfkvVar;
    }
}
