package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdfw implements AppEventListener, OnAdMetadataChangedListener, zzdbf, com.google.android.gms.ads.internal.client.zza, zzddw, zzdbz, zzdde, com.google.android.gms.ads.internal.overlay.zzr, zzdbv, zzdjm {
    private final zzdev zza = new zzdev(this, null);
    private zzerp zzb;
    private zzert zzc;
    private zzfer zzd;
    private zzfhv zze;

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
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    public final zzdev zzn() {
        return this.zza;
    }

    final /* synthetic */ void zzo(zzerp zzerpVar) {
        this.zzb = zzerpVar;
    }

    final /* synthetic */ void zzp(zzert zzertVar) {
        this.zzc = zzertVar;
    }

    final /* synthetic */ void zzq(zzfer zzferVar) {
        this.zzd = zzferVar;
    }

    final /* synthetic */ void zzr(zzfhv zzfhvVar) {
        this.zze = zzfhvVar;
    }

    private static void zzs(Object obj, zzdfv zzdfvVar) {
        if (obj != null) {
            zzdfvVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(this.zzb, zzdfa.zza);
        zzs(this.zzc, zzdfn.zza);
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzs(this.zze, zzdft.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzden
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(final zzcag zzcagVar, final String str, final String str2) {
        zzs(this.zzb, new zzdfv(zzcagVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdeu
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdem
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzd(zzcagVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
        zzs(this.zzb, zzdex.zza);
        zzs(this.zze, zzdfp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzs(this.zzb, zzdfb.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
        zzs(this.zzd, zzdfh.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(final int i2) {
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdet
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfer) obj).zzdT(i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        zzs(this.zzb, zzdfd.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
        zzs(this.zzb, zzdew.zza);
        zzs(this.zze, zzdfo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
        zzs(this.zzb, zzdfe.zza);
        zzs(this.zze, zzdfu.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzs(this.zzb, zzdfc.zza);
        zzs(this.zzc, zzdfm.zza);
        zzs(this.zze, zzdfs.zza);
        zzs(this.zzd, zzdfl.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzs(this.zzd, zzdfi.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzs(this.zzd, zzdfj.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzs(this.zzd, zzdfk.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
        zzs(this.zzb, zzdey.zza);
        zzs(this.zze, zzdfq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
        zzs(this.zzb, zzdez.zza);
        zzs(this.zze, zzdfr.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzs(this.zzd, zzdfg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzder
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzj(zzeVar);
            }
        });
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdes
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzl() {
        zzs(this.zzd, zzdff.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdeo
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzm(zztVar);
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdep
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzm(zztVar);
            }
        });
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdeq
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfer) obj).zzm(zztVar);
            }
        });
    }
}
