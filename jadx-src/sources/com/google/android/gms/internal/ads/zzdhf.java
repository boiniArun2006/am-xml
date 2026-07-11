package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdhf {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;

    @Nullable
    private final zzfgg zzo;
    private zzdbh zzp;

    /* synthetic */ zzdhf(zzdhe zzdheVar, byte[] bArr) {
        this.zza = zzdheVar.zzq();
        this.zzb = zzdheVar.zzr();
        this.zzd = zzdheVar.zzt();
        this.zze = zzdheVar.zzu();
        this.zzc = zzdheVar.zzs();
        this.zzf = zzdheVar.zzv();
        this.zzg = zzdheVar.zzo();
        this.zzh = zzdheVar.zzw();
        this.zzi = zzdheVar.zzz();
        this.zzj = zzdheVar.zzx();
        this.zzk = zzdheVar.zzy();
        this.zzl = zzdheVar.zzA();
        this.zzo = zzdheVar.zzC();
        this.zzm = zzdheVar.zzB();
        this.zzn = zzdheVar.zzp();
    }

    final Set zza() {
        return this.zzc;
    }

    public final Set zzb() {
        return this.zzf;
    }

    public final Set zzc() {
        return this.zzh;
    }

    public final Set zzd() {
        return this.zzi;
    }

    final Set zze() {
        return this.zzj;
    }

    public final Set zzf() {
        return this.zzk;
    }

    public final Set zzg() {
        return this.zza;
    }

    final Set zzh() {
        return this.zzb;
    }

    public final Set zzi() {
        return this.zzd;
    }

    public final Set zzj() {
        return this.zze;
    }

    public final Set zzk() {
        return this.zzl;
    }

    public final Set zzl() {
        return this.zzn;
    }

    final Set zzm() {
        return this.zzg;
    }

    public final Set zzn() {
        return this.zzm;
    }

    @Nullable
    public final zzfgg zzo() {
        return this.zzo;
    }

    public final zzdbh zzp(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzdbh(set);
        }
        return this.zzp;
    }
}
