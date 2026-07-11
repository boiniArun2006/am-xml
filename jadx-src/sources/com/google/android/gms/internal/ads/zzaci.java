package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzaci implements zzadr {
    final /* synthetic */ zzaco zza;
    private zzguf zzb;

    @Nullable
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzc(zzado zzadoVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final Surface zzk() {
        zzgrc.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzo(long j2) {
        this.zzd = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzs(int i2, zzv zzvVar, long j2, int i3, List list) {
        zzgrc.zzi(false);
        this.zzb = zzguf.zzq(list);
        this.zzc = zzvVar;
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j3 = this.zze;
        long j4 = -4611686018427387904L;
        if (zzacoVar.zzt()) {
            if (j3 != -9223372036854775807L) {
                j4 = j3 + 1;
            }
        } else if (j3 != -9223372036854775807L) {
            return;
        }
        long j5 = j4;
        zzacoVar.zzw().zza(j5, new zzacn(j2 + this.zzd, i3, j5));
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzu(long j2, zzadp zzadpVar) {
        int i2;
        zzgrc.zzi(false);
        long j3 = j2 + this.zzd;
        zzaco zzacoVar = this.zza;
        long jZzb = zzacoVar.zzv().zzb(j3);
        if (jZzb == -9223372036854775807L || zzacoVar.zzu() == -9223372036854775807L || jZzb >= zzacoVar.zzu() || (i2 = this.zzf) >= 2) {
            if (zzacoVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i2 + 1;
        zzadpVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zza() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzb() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzd(zzv zzvVar) throws zzadq {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzh(boolean z2) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzi() {
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(this.zze);
        if (zzacoVar.zzy() >= zzacoVar.zzz()) {
            zzacoVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzl(zzacp zzacpVar) {
        this.zza.zzp(zzacpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzm(@FloatRange float f3) {
        this.zza.zzq(f3);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzguf.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzp(Surface surface, zzes zzesVar) {
        this.zza.zzc(surface, zzesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzr(int i2) {
        this.zza.zzr(i2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzt() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzw().zzc() == 0) {
            zzacoVar.zzo();
            return;
        }
        zzff zzffVar = new zzff(10);
        boolean z2 = true;
        while (zzacoVar.zzw().zzc() > 0) {
            zzacn zzacnVar = (zzacn) zzacoVar.zzw().zzd();
            zzacnVar.getClass();
            if (z2) {
                int i2 = zzacnVar.zzb;
                if (i2 == 0 || i2 == 1) {
                    zzacnVar = new zzacn(zzacnVar.zza, 0, zzacnVar.zzc);
                } else {
                    zzacoVar.zzo();
                }
            }
            zzffVar.zza(zzacnVar.zzc, zzacnVar);
            z2 = false;
        }
        zzacoVar.zzx(zzffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzv(long j2, long j3) throws zzadq {
        this.zza.zzl(j2 + this.zzd, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzw(boolean z2) {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzn(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzx() {
        this.zza.zzg();
    }

    public zzaci(zzaco zzacoVar, Context context, int i2) {
        Objects.requireNonNull(zzacoVar);
        this.zza = zzacoVar;
        zzfj.zzR(context);
        this.zzb = zzguf.zzi();
        this.zze = -9223372036854775807L;
        zzado zzadoVar = zzado.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzC(zzaco.zzC(zzvVar.zzE));
        zztVarZza.zzM();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzg(boolean z2) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z2);
    }
}
