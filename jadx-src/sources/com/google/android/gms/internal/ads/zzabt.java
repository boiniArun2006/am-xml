package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzabt implements zzadr {
    private final zzacs zza;
    private final zzact zzb;
    private final zzada zzc;
    private final Queue zzd;

    @Nullable
    private Surface zze;
    private zzv zzf;
    private long zzg;
    private zzado zzh;
    private Executor zzi;
    private zzacp zzj;

    final /* synthetic */ Surface zzA() {
        return this.zze;
    }

    final /* synthetic */ zzado zzB() {
        return this.zzh;
    }

    final /* synthetic */ Executor zzC() {
        return this.zzi;
    }

    final /* synthetic */ zzacp zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzc(zzado zzadoVar, Executor executor) {
        this.zzh = zzadoVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzd(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzl(zzacp zzacpVar) {
        this.zzj = zzacpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzx() {
    }

    final /* synthetic */ Queue zzz() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzg(boolean z2) {
        if (z2) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzh(boolean z2) {
        return this.zza.zzi(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final Surface zzk() {
        Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzm(float f3) {
        this.zza.zzn(f3);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzo(long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzp(Surface surface, zzes zzesVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzr(int i2) {
        this.zza.zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzu(long j2, zzadp zzadpVar) {
        this.zzd.add(zzadpVar);
        this.zzc.zze(j2);
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzv(long j2, long j3) throws zzadq {
        try {
            this.zzc.zzb(j2, j3);
        } catch (zziw e2) {
            throw new zzadq(e2, this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzw(boolean z2) {
        this.zza.zzj(z2);
    }

    final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    public zzabt(zzacs zzacsVar, zzact zzactVar, zzdn zzdnVar) {
        this.zza = zzacsVar;
        this.zzb = zzactVar;
        zzacsVar.zzg(zzdnVar);
        this.zzc = new zzada(new zzabs(this, null), zzacsVar, zzactVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzt().zzM();
        this.zzg = -9223372036854775807L;
        this.zzh = zzado.zzb;
        this.zzi = zzabo.zza;
        this.zzj = zzabm.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzs(int i2, zzv zzvVar, long j2, int i3, List list) {
        zzgrc.zzi(list.isEmpty());
        int i5 = zzvVar.zzv;
        zzv zzvVar2 = this.zzf;
        if (i5 != zzvVar2.zzv || zzvVar.zzw != zzvVar2.zzw) {
            this.zzc.zzc(i5, zzvVar.zzw);
        }
        float f3 = zzvVar.zzz;
        if (f3 != this.zzf.zzz) {
            this.zza.zze(f3);
        }
        this.zzf = zzvVar;
        if (j2 != this.zzg) {
            this.zzc.zzd(i3, j2);
            this.zzg = j2;
        }
    }
}
