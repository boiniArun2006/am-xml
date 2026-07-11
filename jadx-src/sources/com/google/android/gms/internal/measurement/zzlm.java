package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzlm implements zzou {
    private final zzll zza;

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzG(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzi(i2, (zzlg) list.get(i3));
        }
    }

    public static zzlm zza(zzll zzllVar) {
        zzlm zzlmVar = zzllVar.zza;
        return zzlmVar != null ? zzlmVar : new zzlm(zzllVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzA(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i5 += 8;
            }
            zzllVar.zzr(i5);
            while (i3 < list.size()) {
                zzllVar.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z2) {
            while (i3 < zzmzVar.size()) {
                this.zza.zzf(i2, zzmzVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmzVar.size(); i9++) {
            zzmzVar.zzc(i9);
            i8 += 8;
        }
        zzllVar2.zzr(i8);
        while (i3 < zzmzVar.size()) {
            zzllVar2.zzu(zzmzVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzB(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzlx)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzd(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Float) list.get(i7)).getClass();
                i5 += 4;
            }
            zzllVar.zzr(i5);
            while (i3 < list.size()) {
                zzllVar.zzs(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        zzlx zzlxVar = (zzlx) list;
        if (!z2) {
            while (i3 < zzlxVar.size()) {
                this.zza.zzd(i2, Float.floatToRawIntBits(zzlxVar.zze(i3)));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzlxVar.size(); i9++) {
            zzlxVar.zze(i9);
            i8 += 4;
        }
        zzllVar2.zzr(i8);
        while (i3 < zzlxVar.size()) {
            zzllVar2.zzs(Float.floatToRawIntBits(zzlxVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzC(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzln)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Double) list.get(i7)).getClass();
                i5 += 8;
            }
            zzllVar.zzr(i5);
            while (i3 < list.size()) {
                zzllVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        zzln zzlnVar = (zzln) list;
        if (!z2) {
            while (i3 < zzlnVar.size()) {
                this.zza.zzf(i2, Double.doubleToRawLongBits(zzlnVar.zze(i3)));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzlnVar.size(); i9++) {
            zzlnVar.zze(i9);
            i8 += 8;
        }
        zzllVar2.zzr(i8);
        while (i3 < zzlnVar.size()) {
            zzllVar2.zzu(Double.doubleToRawLongBits(zzlnVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzD(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zzll.zzA(((Integer) list.get(i5)).intValue());
            }
            zzllVar.zzr(iZzA);
            while (i3 < list.size()) {
                zzllVar.zzq(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z2) {
            while (i3 < zzmfVar.size()) {
                this.zza.zzb(i2, zzmfVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzmfVar.size(); i7++) {
            iZzA2 += zzll.zzA(zzmfVar.zzf(i7));
        }
        zzllVar2.zzr(iZzA2);
        while (i3 < zzmfVar.size()) {
            zzllVar2.zzq(zzmfVar.zzf(i3));
            i3++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzE(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkx)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzg(i2, ((Boolean) list.get(i3)).booleanValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Boolean) list.get(i7)).getClass();
                i5++;
            }
            zzllVar.zzr(i5);
            while (i3 < list.size()) {
                zzllVar.zzp(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        zzkx zzkxVar = (zzkx) list;
        if (!z2) {
            while (i3 < zzkxVar.size()) {
                this.zza.zzg(i2, zzkxVar.zze(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzkxVar.size(); i9++) {
            zzkxVar.zze(i9);
            i8++;
        }
        zzllVar2.zzr(i8);
        while (i3 < zzkxVar.size()) {
            zzllVar2.zzp(zzkxVar.zze(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzF(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmw)) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        while (i3 < list.size()) {
            Object objZzc = zzmwVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzh(i2, (String) objZzc);
            } else {
                this.zza.zzi(i2, (zzlg) objZzc);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzH(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzc(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int iZzz = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzz += zzll.zzz(((Integer) list.get(i5)).intValue());
            }
            zzllVar.zzr(iZzz);
            while (i3 < list.size()) {
                zzllVar.zzr(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z2) {
            while (i3 < zzmfVar.size()) {
                this.zza.zzc(i2, zzmfVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int iZzz2 = 0;
        for (int i7 = 0; i7 < zzmfVar.size(); i7++) {
            iZzz2 += zzll.zzz(zzmfVar.zzf(i7));
        }
        zzllVar2.zzr(iZzz2);
        while (i3 < zzmfVar.size()) {
            zzllVar2.zzr(zzmfVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzI(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzd(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i5 += 4;
            }
            zzllVar.zzr(i5);
            while (i3 < list.size()) {
                zzllVar.zzs(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z2) {
            while (i3 < zzmfVar.size()) {
                this.zza.zzd(i2, zzmfVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmfVar.size(); i9++) {
            zzmfVar.zzf(i9);
            i8 += 4;
        }
        zzllVar2.zzr(i8);
        while (i3 < zzmfVar.size()) {
            zzllVar2.zzs(zzmfVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzJ(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i5 += 8;
            }
            zzllVar.zzr(i5);
            while (i3 < list.size()) {
                zzllVar.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z2) {
            while (i3 < zzmzVar.size()) {
                this.zza.zzf(i2, zzmzVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmzVar.size(); i9++) {
            zzmzVar.zzc(i9);
            i8 += 8;
        }
        zzllVar2.zzr(i8);
        while (i3 < zzmzVar.size()) {
            zzllVar2.zzu(zzmzVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzK(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzll zzllVar = this.zza;
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    zzllVar.zzc(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3++;
                }
                return;
            }
            zzll zzllVar2 = this.zza;
            zzllVar2.zza(i2, 2);
            int iZzz = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                int iIntValue2 = ((Integer) list.get(i5)).intValue();
                iZzz += zzll.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzllVar2.zzr(iZzz);
            while (i3 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i3)).intValue();
                zzllVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i3++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z2) {
            while (i3 < zzmfVar.size()) {
                zzll zzllVar3 = this.zza;
                int iZzf = zzmfVar.zzf(i3);
                zzllVar3.zzc(i2, (iZzf >> 31) ^ (iZzf + iZzf));
                i3++;
            }
            return;
        }
        zzll zzllVar4 = this.zza;
        zzllVar4.zza(i2, 2);
        int iZzz2 = 0;
        for (int i7 = 0; i7 < zzmfVar.size(); i7++) {
            int iZzf2 = zzmfVar.zzf(i7);
            iZzz2 += zzll.zzz((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzllVar4.zzr(iZzz2);
        while (i3 < zzmfVar.size()) {
            int iZzf3 = zzmfVar.zzf(i3);
            zzllVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzL(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzll zzllVar = this.zza;
                    long jLongValue = ((Long) list.get(i3)).longValue();
                    zzllVar.zze(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i3++;
                }
                return;
            }
            zzll zzllVar2 = this.zza;
            zzllVar2.zza(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                long jLongValue2 = ((Long) list.get(i5)).longValue();
                iZzA += zzll.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzllVar2.zzr(iZzA);
            while (i3 < list.size()) {
                long jLongValue3 = ((Long) list.get(i3)).longValue();
                zzllVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i3++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z2) {
            while (i3 < zzmzVar.size()) {
                zzll zzllVar3 = this.zza;
                long jZzc = zzmzVar.zzc(i3);
                zzllVar3.zze(i2, (jZzc >> 63) ^ (jZzc + jZzc));
                i3++;
            }
            return;
        }
        zzll zzllVar4 = this.zza;
        zzllVar4.zza(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzmzVar.size(); i7++) {
            long jZzc2 = zzmzVar.zzc(i7);
            iZzA2 += zzll.zzA((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzllVar4.zzr(iZzA2);
        while (i3 < zzmzVar.size()) {
            long jZzc3 = zzmzVar.zzc(i3);
            zzllVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zzd(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzc(int i2, long j2) throws IOException {
        this.zza.zze(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzd(int i2, long j2) throws IOException {
        this.zza.zzf(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zze(int i2, float f3) throws IOException {
        this.zza.zzd(i2, Float.floatToRawIntBits(f3));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzf(int i2, double d2) throws IOException {
        this.zza.zzf(i2, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzg(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzh(int i2, long j2) throws IOException {
        this.zza.zze(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzj(int i2, long j2) throws IOException {
        this.zza.zzf(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzd(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzl(int i2, boolean z2) throws IOException {
        this.zza.zzg(i2, z2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzm(int i2, String str) throws IOException {
        this.zza.zzh(i2, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzn(int i2, zzlg zzlgVar) throws IOException {
        this.zza.zzi(i2, zzlgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzo(int i2, int i3) throws IOException {
        this.zza.zzc(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzp(int i2, int i3) throws IOException {
        this.zza.zzc(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzq(int i2, long j2) throws IOException {
        this.zza.zze(i2, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzr(int i2, Object obj, zznw zznwVar) throws IOException {
        this.zza.zzl(i2, (zznl) obj, zznwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzs(int i2, Object obj, zznw zznwVar) throws IOException {
        zzll zzllVar = this.zza;
        zzllVar.zza(i2, 3);
        zznwVar.zzf((zznl) obj, zzllVar.zza);
        zzllVar.zza(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    @Deprecated
    public final void zzt(int i2) throws IOException {
        this.zza.zza(i2, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    @Deprecated
    public final void zzu(int i2) throws IOException {
        this.zza.zza(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzv(int i2, Object obj) throws IOException {
        if (obj instanceof zzlg) {
            this.zza.zzn(i2, (zzlg) obj);
        } else {
            this.zza.zzm(i2, (zznl) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzw(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zzll.zzA(((Integer) list.get(i5)).intValue());
            }
            zzllVar.zzr(iZzA);
            while (i3 < list.size()) {
                zzllVar.zzq(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z2) {
            while (i3 < zzmfVar.size()) {
                this.zza.zzb(i2, zzmfVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzmfVar.size(); i7++) {
            iZzA2 += zzll.zzA(zzmfVar.zzf(i7));
        }
        zzllVar2.zzr(iZzA2);
        while (i3 < zzmfVar.size()) {
            zzllVar2.zzq(zzmfVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzx(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzd(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i5 += 4;
            }
            zzllVar.zzr(i5);
            while (i3 < list.size()) {
                zzllVar.zzs(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z2) {
            while (i3 < zzmfVar.size()) {
                this.zza.zzd(i2, zzmfVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmfVar.size(); i9++) {
            zzmfVar.zzf(i9);
            i8 += 4;
        }
        zzllVar2.zzr(i8);
        while (i3 < zzmfVar.size()) {
            zzllVar2.zzs(zzmfVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzy(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zze(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zzll.zzA(((Long) list.get(i5)).longValue());
            }
            zzllVar.zzr(iZzA);
            while (i3 < list.size()) {
                zzllVar.zzt(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z2) {
            while (i3 < zzmzVar.size()) {
                this.zza.zze(i2, zzmzVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzmzVar.size(); i7++) {
            iZzA2 += zzll.zzA(zzmzVar.zzc(i7));
        }
        zzllVar2.zzr(iZzA2);
        while (i3 < zzmzVar.size()) {
            zzllVar2.zzt(zzmzVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzz(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zze(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zzll.zzA(((Long) list.get(i5)).longValue());
            }
            zzllVar.zzr(iZzA);
            while (i3 < list.size()) {
                zzllVar.zzt(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z2) {
            while (i3 < zzmzVar.size()) {
                this.zza.zze(i2, zzmzVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzmzVar.size(); i7++) {
            iZzA2 += zzll.zzA(zzmzVar.zzc(i7));
        }
        zzllVar2.zzr(iZzA2);
        while (i3 < zzmzVar.size()) {
            zzllVar2.zzt(zzmzVar.zzc(i3));
            i3++;
        }
    }

    private zzlm(zzll zzllVar) {
        byte[] bArr = zzmo.zzb;
        this.zza = zzllVar;
        zzllVar.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzM(int i2, zznd zzndVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzll zzllVar = this.zza;
            zzllVar.zza(i2, 2);
            zzllVar.zzr(zzne.zzc(zzndVar, entry.getKey(), entry.getValue()));
            zzne.zzb(zzllVar, zzndVar, entry.getKey(), entry.getValue());
        }
    }
}
