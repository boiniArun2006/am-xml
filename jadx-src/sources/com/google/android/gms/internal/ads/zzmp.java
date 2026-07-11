package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzmp {
    private final zzml zza;
    private final int zzb;

    @Nullable
    private final zzml zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmp(zzml zzmlVar, @Nullable zzml zzmlVar2, int i2) {
        this.zza = zzmlVar;
        this.zzb = i2;
        this.zzc = zzmlVar2;
    }

    private final boolean zzN() {
        int i2 = this.zzd;
        return i2 == 2 || i2 == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzln zzlnVar, @Nullable zzml zzmlVar) {
        if (zzmlVar == null) {
            return true;
        }
        zzyc[] zzycVarArr = zzlnVar.zzc;
        int i2 = this.zzb;
        zzyc zzycVar = zzycVarArr[i2];
        if (zzmlVar.zzcV() != null) {
            if (zzmlVar.zzcV() == zzycVar) {
                if (zzycVar != null && !zzmlVar.zzcW()) {
                    zzlnVar.zzp();
                    boolean z2 = zzlnVar.zzg.zzg;
                }
            }
            zzln zzlnVarZzp = zzlnVar.zzp();
            return zzlnVarZzp != null && zzlnVarZzp.zzc[i2] == zzmlVar.zzcV();
        }
        return true;
    }

    private final void zzT(boolean z2) {
        if (z2) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzml zzmlVar = this.zzc;
            zzmlVar.getClass();
            zzmlVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(@Nullable zzml zzmlVar, zzln zzlnVar, zzaak zzaakVar, zziu zziuVar) throws zziw {
        if (zzmlVar != null && zzW(zzmlVar)) {
            zzml zzmlVar2 = this.zza;
            boolean z2 = zzmlVar != zzmlVar2;
            if ((zzmlVar != zzmlVar2 || !zzN()) && (zzmlVar != this.zzc || !zzO())) {
                zzyc zzycVarZzcV = zzmlVar.zzcV();
                zzyc[] zzycVarArr = zzlnVar.zzc;
                int i2 = this.zzb;
                zzyc zzycVar = zzycVarArr[i2];
                boolean zZza = zzaakVar.zza(i2);
                if (zZza && zzycVarZzcV == zzycVar) {
                    return 1;
                }
                if (!zzmlVar.zzm()) {
                    zzv[] zzvVarArrZzV = zzV(zzaakVar.zzc[i2]);
                    zzyc zzycVar2 = zzycVarArr[i2];
                    zzycVar2.getClass();
                    zzmlVar.zzcU(zzvVarArrZzV, zzycVar2, zzlnVar.zzc(), zzlnVar.zza(), zzlnVar.zzg.zza);
                    return 3;
                }
                if (!zzmlVar.zzZ()) {
                    return 0;
                }
                zzS(zzmlVar, zziuVar);
                if (!zZza || zzc()) {
                    zzT(!z2);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(@Nullable zzaac zzaacVar) {
        int iZze = zzaacVar != null ? zzaacVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[iZze];
        for (int i2 = 0; i2 < iZze; i2++) {
            zzaacVar.getClass();
            zzvVarArr[i2] = zzaacVar.zzb(i2);
        }
        return zzvVarArr;
    }

    @Nullable
    private final zzml zzX(@Nullable zzln zzlnVar) {
        if (zzlnVar != null) {
            int i2 = this.zzb;
            zzyc[] zzycVarArr = zzlnVar.zzc;
            if (zzycVarArr[i2] != null) {
                zzml zzmlVar = this.zza;
                zzyc zzycVarZzcV = zzmlVar.zzcV();
                zzyc zzycVar = zzycVarArr[i2];
                if (zzycVarZzcV == zzycVar) {
                    return zzmlVar;
                }
                zzml zzmlVar2 = this.zzc;
                if (zzmlVar2 != null && zzmlVar2.zzcV() == zzycVar) {
                    return zzmlVar2;
                }
            }
        }
        return null;
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    private final void zzQ(boolean z2) throws zziw {
        if (z2) {
            zzml zzmlVar = this.zzc;
            zzmlVar.getClass();
            zzmlVar.zzx(17, this.zza);
        } else {
            zzml zzmlVar2 = this.zza;
            zzml zzmlVar3 = this.zzc;
            zzmlVar3.getClass();
            zzmlVar2.zzx(17, zzmlVar3);
        }
    }

    private final void zzS(zzml zzmlVar, zziu zziuVar) {
        boolean z2 = true;
        if (this.zza != zzmlVar && this.zzc != zzmlVar) {
            z2 = false;
        }
        zzgrc.zzi(z2);
        if (zzW(zzmlVar)) {
            zziuVar.zze(zzmlVar);
            zzY(zzmlVar);
            zzmlVar.zzr();
        }
    }

    public final void zzA(zziu zziuVar) throws zziw {
        zzS(this.zza, zziuVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            boolean z2 = zzW(zzmlVar) && this.zzd != 3;
            zzS(zzmlVar, zziuVar);
            zzT(false);
            if (z2) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zziw {
        int i2 = this.zzd;
        if (i2 == 3 || i2 == 4) {
            zzQ(i2 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i2 == 2) {
            this.zzd = 0;
        }
    }

    public final void zzD(zzyc zzycVar, zziu zziuVar, long j2, boolean z2) throws zziw {
        zzR(this.zza, zzycVar, zziuVar, j2, z2);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzR(zzmlVar, zzycVar, zziuVar, j2, z2);
        }
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || zzW(zzmlVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzln zzlnVar, zzaak zzaakVar, zziu zziuVar) throws zziw {
        int iZzU = zzU(this.zza, zzlnVar, zzaakVar, zziuVar);
        return iZzU == 1 ? zzU(this.zzc, zzlnVar, zzaakVar, zziuVar) : iZzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzt();
            this.zzf = false;
        }
    }

    public final boolean zzM() {
        int i2 = this.zzd;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            return zzW(this.zza);
        }
        zzml zzmlVar = this.zzc;
        zzmlVar.getClass();
        return zzW(zzmlVar);
    }

    public final int zzd() {
        zzml zzmlVar = this.zzc;
        boolean zZzW = zzW(this.zza);
        int i2 = 0;
        if (zzmlVar != null && zzW(zzmlVar)) {
            i2 = 1;
        }
        return (zZzW ? 1 : 0) + i2;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final void zzi(zzaak zzaakVar, zzaak zzaakVar2, long j2) {
        int i2;
        int i3 = this.zzb;
        boolean zZza = zzaakVar.zza(i3);
        boolean zZza2 = zzaakVar2.zza(i3);
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || (i2 = this.zzd) == 3 || (i2 == 0 && zzW(this.zza))) {
            zzmlVar = this.zza;
        }
        if (!zZza || zzmlVar.zzm()) {
            return;
        }
        zze();
        zzmo zzmoVar = zzaakVar.zzb[i3];
        zzmo zzmoVar2 = zzaakVar2.zzb[i3];
        if (zZza2 && Objects.equals(zzmoVar2, zzmoVar) && !zzc()) {
            return;
        }
        zzZ(zzmlVar, j2);
    }

    public final void zzj(long j2) {
        int i2;
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar) && (i2 = this.zzd) != 4 && i2 != 2) {
            zzZ(zzmlVar, j2);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zzmlVar2, j2);
    }

    public final long zzk(long j2, long j3) {
        zzml zzmlVar = this.zza;
        long jZzT = zzW(zzmlVar) ? zzmlVar.zzT(j2, j3) : Long.MAX_VALUE;
        zzml zzmlVar2 = this.zzc;
        return (zzmlVar2 == null || !zzW(zzmlVar2)) ? jZzT : Math.min(jZzT, zzmlVar2.zzT(j2, j3));
    }

    public final void zzl() {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzmlVar.zzW();
            return;
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzmlVar2.zzW();
    }

    public final void zzm(float f3, float f4) throws zziw {
        this.zza.zzV(f3, f4);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzV(f3, f4);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zzml zzmlVar = this.zza;
        boolean zZzZ = zzW(zzmlVar) ? zzmlVar.zzZ() : true;
        zzml zzmlVar2 = this.zzc;
        return (zzmlVar2 == null || !zzW(zzmlVar2)) ? zZzZ : zZzZ & zzmlVar2.zzZ();
    }

    public final boolean zzr(zzln zzlnVar) {
        return zzP(zzlnVar, this.zza) && zzP(zzlnVar, this.zzc);
    }

    public final void zzs(long j2, long j3) throws zziw {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzmlVar.zzX(j2, j3);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzmlVar2.zzX(j2, j3);
    }

    public final void zzv() throws zziw {
        zzml zzmlVar = this.zza;
        if (zzmlVar.zze() == 1 && this.zzd != 4) {
            zzmlVar.zzcT();
            return;
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || zzmlVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzmlVar2.zzcT();
    }

    public final void zzw() {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzY(zzmlVar);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzY(zzmlVar2);
    }

    public final void zzx(zzmo zzmoVar, zzaac zzaacVar, zzyc zzycVar, long j2, boolean z2, boolean z3, long j3, long j4, zzwk zzwkVar, zziu zziuVar) throws zziw {
        zzv[] zzvVarArrZzV = zzV(zzaacVar);
        int i2 = this.zzd;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.zze = true;
            zzml zzmlVar = this.zza;
            zzmlVar.zzf(zzmoVar, zzvVarArrZzV, zzycVar, j2, z2, z3, j3, j4, zzwkVar);
            zziuVar.zzd(zzmlVar);
            return;
        }
        this.zzf = true;
        zzml zzmlVar2 = this.zzc;
        zzmlVar2.getClass();
        zzmlVar2.zzf(zzmoVar, zzvVarArrZzV, zzycVar, j2, z2, z3, j3, j4, zzwkVar);
        zziuVar.zzd(zzmlVar2);
    }

    public final void zzz(@Nullable zzms zzmsVar) throws zziw {
        this.zza.zzx(18, zzmsVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzx(18, zzmsVar);
        }
    }

    private final void zzR(zzml zzmlVar, zzyc zzycVar, zziu zziuVar, long j2, boolean z2) throws zziw {
        if (zzW(zzmlVar)) {
            if (zzycVar != zzmlVar.zzcV()) {
                zzS(zzmlVar, zziuVar);
            } else if (z2) {
                zzmlVar.zzp(j2, true);
            }
        }
    }

    private static boolean zzW(zzml zzmlVar) {
        if (zzmlVar.zze() != 0) {
            return true;
        }
        return false;
    }

    private static final void zzY(zzml zzmlVar) {
        if (zzmlVar.zze() == 2) {
            zzmlVar.zzq();
        }
    }

    private static final void zzZ(zzml zzmlVar, long j2) {
        zzmlVar.zzl();
        if (!(zzmlVar instanceof zzyr)) {
            return;
        }
        throw null;
    }

    public final void zzC(zziu zziuVar) {
        boolean z2;
        zzml zzmlVar;
        if (!zzc()) {
            return;
        }
        int i2 = this.zzd;
        int i3 = 0;
        if (i2 != 4) {
            if (i2 == 2) {
                i2 = 2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (z2) {
            zzmlVar = this.zza;
        } else {
            zzmlVar = this.zzc;
            zzmlVar.getClass();
        }
        zzS(zzmlVar, zziuVar);
        zzT(z2);
        if (i2 == 4) {
            i3 = 1;
        }
        this.zzd = i3;
    }

    public final void zzE(zzln zzlnVar, long j2, boolean z2) throws zziw {
        zzml zzmlVarZzX = zzX(zzlnVar);
        if (zzmlVarZzX != null) {
            zzmlVarZzX.zzp(j2, z2);
        }
    }

    public final boolean zzF(zzln zzlnVar, long j2) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        if (zzmlVarZzX != null && zzmlVarZzX.zzU(j2)) {
            return true;
        }
        return false;
    }

    public final void zzJ(@Nullable Object obj) throws zziw {
        if (zze() != 2) {
            return;
        }
        int i2 = this.zzd;
        if (i2 != 4 && i2 != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzml zzmlVar = this.zzc;
        zzmlVar.getClass();
        zzmlVar.zzx(1, obj);
    }

    public final void zzK(zzacp zzacpVar) throws zziw {
        if (zze() == 2) {
            this.zza.zzx(7, zzacpVar);
            zzml zzmlVar = this.zzc;
            if (zzmlVar != null) {
                zzmlVar.zzx(7, zzacpVar);
                return;
            }
            return;
        }
        zze();
    }

    public final void zzL(float f3) throws zziw {
        if (zze() == 1) {
            zzml zzmlVar = this.zza;
            Float fValueOf = Float.valueOf(f3);
            zzmlVar.zzx(2, fValueOf);
            zzml zzmlVar2 = this.zzc;
            if (zzmlVar2 != null) {
                zzmlVar2.zzx(2, fValueOf);
            }
        }
    }

    public final void zzb() {
        int i2;
        zzgrc.zzi(!zzc());
        if (zzW(this.zza)) {
            i2 = 3;
        } else {
            zzml zzmlVar = this.zzc;
            if (zzmlVar != null && zzW(zzmlVar)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
        }
        this.zzd = i2;
    }

    public final long zzf(@Nullable zzln zzlnVar) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        Objects.requireNonNull(zzmlVarZzX);
        return zzmlVarZzX.zzk();
    }

    public final boolean zzg(zzln zzlnVar) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        zzmlVarZzX.getClass();
        return zzmlVarZzX.zzcW();
    }

    public final void zzh(zzln zzlnVar, long j2) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        zzmlVarZzX.getClass();
        zzZ(zzmlVarZzX, j2);
    }

    public final boolean zzp(@Nullable zzln zzlnVar) {
        if (zzX(zzlnVar) != null) {
            return true;
        }
        return false;
    }

    public final boolean zzq(zzln zzlnVar) {
        boolean z2;
        boolean z3;
        if (zzN() && zzX(zzlnVar) == this.zza) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zzO() && zzX(zzlnVar) == this.zzc) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public final boolean zzt(zzln zzlnVar) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        if (zzmlVarZzX != null && !zzmlVarZzX.zzcW() && !zzmlVarZzX.zzY() && !zzmlVarZzX.zzZ()) {
            return false;
        }
        return true;
    }

    public final void zzu(zzln zzlnVar) throws IOException {
        zzml zzmlVarZzX = zzX(zzlnVar);
        zzmlVarZzX.getClass();
        zzmlVarZzX.zzn();
    }

    public final void zzy(int i2, @Nullable Object obj, zzln zzlnVar) throws zziw {
        zzml zzmlVarZzX = zzX(zzlnVar);
        zzmlVarZzX.getClass();
        zzmlVarZzX.zzx(11, obj);
    }
}
