package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzerp implements AppEventListener, zzdel, zzdct, zzdbi, zzdbz, com.google.android.gms.ads.internal.client.zza, zzdbf, zzddw, zzdbv, zzdjm {

    @Nullable
    final zzdxz zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);

    @VisibleForTesting
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkn)).intValue());

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzffy.zza(this.zzd, new zzffx() { // from class: com.google.android.gms.internal.ads.zzeqy
                @Override // com.google.android.gms.internal.ads.zzffx
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzco) obj).zzb(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The queue for app events is full, dropping the new event.");
            zzdxz zzdxzVar = this.zza;
            if (zzdxzVar != null) {
                zzdxy zzdxyVarZza = zzdxzVar.zza();
                zzdxyVarZza.zzc(FileUploadManager.f61572j, "dae_action");
                zzdxyVarZza.zzc("dae_name", str);
                zzdxyVarZza.zzc("dae_data", str2);
                zzdxyVarZza.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(zzcag zzcagVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final synchronized void zzg() {
        zzffy.zza(this.zzc, zzerd.zza);
        zzffy.zza(this.zzf, zzerk.zza);
        this.zzj.set(true);
        zzr();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbk zzi() {
        return (com.google.android.gms.ads.internal.client.zzbk) this.zzc.get();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzco zzk() {
        return (com.google.android.gms.ads.internal.client.zzco) this.zzd.get();
    }

    private final void zzr() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzffy.zza(this.zzd, new zzffx() { // from class: com.google.android.gms.internal.ads.zzera
                    @Override // com.google.android.gms.internal.ads.zzffx
                    public final /* synthetic */ void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzco) obj).zzb((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
            return;
        }
        zzffy.zza(this.zzc, zzerf.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzffx zzffxVar = new zzffx() { // from class: com.google.android.gms.internal.ads.zzerb
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzd(zzeVar);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzffy.zza(atomicReference, zzffxVar);
        zzffy.zza(atomicReference, new zzffx() { // from class: com.google.android.gms.internal.ads.zzeqv
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc(zzeVar.zza);
            }
        });
        zzffy.zza(this.zzf, new zzffx() { // from class: com.google.android.gms.internal.ads.zzeqw
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbn) obj).zzc(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
        zzffy.zza(this.zzc, zzerc.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzffy.zza(this.zzc, zzerg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        zzffy.zza(this.zzc, zzeri.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
        zzffy.zza(this.zzc, zzerj.zza);
        zzffy.zza(this.zzg, zzero.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
        zzffy.zza(this.zzc, zzere.zza);
        AtomicReference atomicReference = this.zzg;
        zzffy.zza(atomicReference, zzerl.zza);
        zzffy.zza(atomicReference, zzerm.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
            zzffy.zza(this.zzc, zzerh.zza);
        }
        zzffy.zza(this.zzg, zzern.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzffy.zza(this.zzg, new zzffx() { // from class: com.google.android.gms.internal.ads.zzeqz
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcv) obj).zzb(zzeVar);
            }
        });
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzc.set(zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzm(@NonNull final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzffy.zza(this.zze, new zzffx() { // from class: com.google.android.gms.internal.ads.zzeqx
            @Override // com.google.android.gms.internal.ads.zzffx
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
            }
        });
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        this.zzd.set(zzcoVar);
        this.zzi.set(true);
        zzr();
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zze.set(zzdtVar);
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
        this.zzf.set(zzbnVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzg.set(zzcvVar);
    }

    public zzerp(@Nullable zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }
}
