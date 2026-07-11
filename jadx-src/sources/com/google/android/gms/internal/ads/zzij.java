package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzij implements zzml, zzmn {
    private final int zzb;

    @Nullable
    private zzmo zzd;
    private int zze;
    private zzpq zzf;
    private zzdn zzg;
    private int zzh;

    @Nullable
    private zzyc zzi;

    @Nullable
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;

    @Nullable
    private zzwk zzq;

    @Nullable
    @GuardedBy
    private zzmm zzr;
    private final Object zza = new Object();
    private final zzlh zzc = new zzlh();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;

    private final void zzac(long j2, boolean z2, boolean z3) throws zziw {
        this.zzn = false;
        this.zzl = j2;
        this.zzm = j2;
        if (!z3) {
            z3 = zzP(j2) != 0;
        }
        zzA(j2, z2, z3);
    }

    protected void zzA(long j2, boolean z2, boolean z3) throws zziw {
        throw null;
    }

    protected void zzB() throws zziw {
    }

    protected void zzC() {
    }

    protected void zzD() {
        throw null;
    }

    protected void zzE() {
    }

    protected void zzF() {
    }

    protected final long zzG() {
        return this.zzl;
    }

    protected final zzlh zzH() {
        zzlh zzlhVar = this.zzc;
        zzlhVar.zza = null;
        zzlhVar.zzb = null;
        return zzlhVar;
    }

    protected final zzbf zzM() {
        return this.zzp;
    }

    protected final zziw zzN(Throwable th, @Nullable zzv zzvVar, boolean z2, int i2) {
        int iZzab = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzab = zzab(zzvVar) & 7;
            } catch (zziw unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zziw.zzb(th, zzS(), this.zze, zzvVar, iZzab, this.zzq, z2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzml, com.google.android.gms.internal.ads.zzmn
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final zzmn zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzc(int i2, zzpq zzpqVar, zzdn zzdnVar) {
        this.zze = i2;
        this.zzf = zzpqVar;
        this.zzg = zzdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    @Nullable
    public final zzyc zzcV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    @Nullable
    public zzlm zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzp(long j2, boolean z2) throws zziw {
        zzac(j2, false, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public int zzu() throws zziw {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public void zzx(int i2, @Nullable Object obj) throws zziw {
    }

    protected void zzy(boolean z2, boolean z3) throws zziw {
    }

    protected void zzz(zzv[] zzvVarArr, long j2, long j3, zzwk zzwkVar) throws zziw {
    }

    protected final zzv[] zzI() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    protected final zzmo zzJ() {
        zzmo zzmoVar = this.zzd;
        zzmoVar.getClass();
        return zzmoVar;
    }

    protected final zzpq zzK() {
        zzpq zzpqVar = this.zzf;
        zzpqVar.getClass();
        return zzpqVar;
    }

    protected final zzdn zzL() {
        zzdn zzdnVar = this.zzg;
        zzdnVar.getClass();
        return zzdnVar;
    }

    protected final int zzO(zzlh zzlhVar, zzih zzihVar, int i2) {
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        int iZzd = zzycVar.zzd(zzlhVar, zzihVar, i2);
        if (iZzd == -4) {
            if (zzihVar.zzb()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j2 = zzihVar.zze + this.zzk;
            zzihVar.zze = j2;
            this.zzm = Math.max(this.zzm, j2);
            return iZzd;
        }
        if (iZzd == -5) {
            zzv zzvVar = zzlhVar.zzb;
            zzvVar.getClass();
            long j3 = zzvVar.zzt;
            if (j3 != Long.MAX_VALUE) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzr(j3 + this.zzk);
                zzlhVar.zzb = zztVarZza.zzM();
                return -5;
            }
        }
        return iZzd;
    }

    protected final int zzP(long j2) {
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        return zzycVar.zze(j2 - this.zzk);
    }

    protected final void zzR() {
        zzmm zzmmVar;
        synchronized (this.zza) {
            zzmmVar = this.zzr;
        }
        if (zzmmVar != null) {
            zzmmVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzcT() throws zziw {
        zzgrc.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzcU(zzv[] zzvVarArr, zzyc zzycVar, long j2, long j3, zzwk zzwkVar) throws zziw {
        zzgrc.zzi(!this.zzn);
        this.zzi = zzycVar;
        this.zzq = zzwkVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j2;
        }
        this.zzj = zzvVarArr;
        this.zzk = j3;
        zzz(zzvVarArr, j2, j3, zzwkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzf(zzmo zzmoVar, zzv[] zzvVarArr, zzyc zzycVar, long j2, boolean z2, boolean z3, long j3, long j4, zzwk zzwkVar) throws zziw {
        zzgrc.zzi(this.zzh == 0);
        this.zzd = zzmoVar;
        this.zzq = zzwkVar;
        this.zzh = 1;
        zzy(z2, z3);
        zzcU(zzvVarArr, zzycVar, j3, j4, zzwkVar);
        zzac(j3, z2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzn() throws IOException {
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        zzycVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzq() {
        zzgrc.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzr() {
        zzgrc.zzi(this.zzh == 1);
        zzlh zzlhVar = this.zzc;
        zzlhVar.zza = null;
        zzlhVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzs() {
        zzgrc.zzi(this.zzh == 0);
        zzlh zzlhVar = this.zzc;
        zzlhVar.zza = null;
        zzlhVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzt() {
        zzgrc.zzi(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzv(zzmm zzmmVar) {
        synchronized (this.zza) {
            this.zzr = zzmmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzw() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    public zzij(int i2) {
        this.zzb = i2;
    }

    protected final boolean zzQ() {
        if (zzcW()) {
            return this.zzn;
        }
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        return zzycVar.zzb();
    }
}
