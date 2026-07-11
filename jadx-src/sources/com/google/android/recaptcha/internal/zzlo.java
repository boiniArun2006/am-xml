package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzlo implements zzpy {
    private final zzln zza;

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zze(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zze(i2, (zzle) list.get(i3));
        }
    }

    public static zzlo zza(zzln zzlnVar) {
        zzlo zzloVar = zzlnVar.zza;
        return zzloVar != null ? zzloVar : new zzlo(zzlnVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzA(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zznx)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i5 += 8;
            }
            this.zza.zzt(i5);
            while (i3 < list.size()) {
                this.zza.zzi(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z2) {
            while (i3 < zznxVar.size()) {
                this.zza.zzh(i2, zznxVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zznxVar.size(); i9++) {
            zznxVar.zze(i9);
            i8 += 8;
        }
        this.zza.zzt(i8);
        while (i3 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzB(int i2, int i3) throws IOException {
        this.zza.zzs(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzC(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzne)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzln zzlnVar = this.zza;
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    zzlnVar.zzs(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                int iIntValue2 = ((Integer) list.get(i5)).intValue();
                iZzA += zzln.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzA);
            while (i3 < list.size()) {
                zzln zzlnVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i3)).intValue();
                zzlnVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i3++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z2) {
            while (i3 < zzneVar.size()) {
                zzln zzlnVar3 = this.zza;
                int iZze = zzneVar.zze(i3);
                zzlnVar3.zzs(i2, (iZze >> 31) ^ (iZze + iZze));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzneVar.size(); i7++) {
            int iZze2 = zzneVar.zze(i7);
            iZzA2 += zzln.zzA((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzA2);
        while (i3 < zzneVar.size()) {
            zzln zzlnVar4 = this.zza;
            int iZze3 = zzneVar.zze(i3);
            zzlnVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzD(int i2, long j2) throws IOException {
        this.zza.zzu(i2, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzE(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zznx)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzln zzlnVar = this.zza;
                    long jLongValue = ((Long) list.get(i3)).longValue();
                    zzlnVar.zzu(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                long jLongValue2 = ((Long) list.get(i5)).longValue();
                iZzB += zzln.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzB);
            while (i3 < list.size()) {
                zzln zzlnVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i3)).longValue();
                zzlnVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i3++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z2) {
            while (i3 < zznxVar.size()) {
                zzln zzlnVar3 = this.zza;
                long jZze = zznxVar.zze(i3);
                zzlnVar3.zzu(i2, (jZze >> 63) ^ (jZze + jZze));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zznxVar.size(); i7++) {
            long jZze2 = zznxVar.zze(i7);
            iZzB2 += zzln.zzB((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzB2);
        while (i3 < zznxVar.size()) {
            zzln zzlnVar4 = this.zza;
            long jZze3 = zznxVar.zze(i3);
            zzlnVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzF(int i2) throws IOException {
        this.zza.zzr(i2, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzG(int i2, String str) throws IOException {
        this.zza.zzp(i2, str);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzH(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zznu)) {
            while (i3 < list.size()) {
                this.zza.zzp(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zznu zznuVar = (zznu) list;
        while (i3 < list.size()) {
            Object objZzc = zznuVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzp(i2, (String) objZzc);
            } else {
                this.zza.zze(i2, (zzle) objZzc);
            }
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzI(int i2, int i3) throws IOException {
        this.zza.zzs(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzJ(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzne)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzs(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zzln.zzA(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i3 < list.size()) {
                this.zza.zzt(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z2) {
            while (i3 < zzneVar.size()) {
                this.zza.zzs(i2, zzneVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzneVar.size(); i7++) {
            iZzA2 += zzln.zzA(zzneVar.zze(i7));
        }
        this.zza.zzt(iZzA2);
        while (i3 < zzneVar.size()) {
            this.zza.zzt(zzneVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzK(int i2, long j2) throws IOException {
        this.zza.zzu(i2, j2);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzL(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zznx)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzu(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzB += zzln.zzB(((Long) list.get(i5)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i3 < list.size()) {
                this.zza.zzv(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z2) {
            while (i3 < zznxVar.size()) {
                this.zza.zzu(i2, zznxVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zznxVar.size(); i7++) {
            iZzB2 += zzln.zzB(zznxVar.zze(i7));
        }
        this.zza.zzt(iZzB2);
        while (i3 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzb(int i2, boolean z2) throws IOException {
        this.zza.zzd(i2, z2);
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
    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzc(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkv)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzd(i2, ((Boolean) list.get(i3)).booleanValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Boolean) list.get(i7)).getClass();
                i5++;
            }
            this.zza.zzt(i5);
            while (i3 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        zzkv zzkvVar = (zzkv) list;
        if (!z2) {
            while (i3 < zzkvVar.size()) {
                this.zza.zzd(i2, zzkvVar.zzf(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzkvVar.size(); i9++) {
            zzkvVar.zzf(i9);
            i8++;
        }
        this.zza.zzt(i8);
        while (i3 < zzkvVar.size()) {
            this.zza.zzb(zzkvVar.zzf(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzd(int i2, zzle zzleVar) throws IOException {
        this.zza.zze(i2, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzf(int i2, double d2) throws IOException {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzg(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmi)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Double) list.get(i7)).getClass();
                i5 += 8;
            }
            this.zza.zzt(i5);
            while (i3 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        zzmi zzmiVar = (zzmi) list;
        if (!z2) {
            while (i3 < zzmiVar.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(zzmiVar.zze(i3)));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmiVar.size(); i9++) {
            zzmiVar.zze(i9);
            i8 += 8;
        }
        this.zza.zzt(i8);
        while (i3 < zzmiVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzmiVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzh(int i2) throws IOException {
        this.zza.zzr(i2, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzj(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzne)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzB += zzln.zzB(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i3 < list.size()) {
                this.zza.zzk(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z2) {
            while (i3 < zzneVar.size()) {
                this.zza.zzj(i2, zzneVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zzneVar.size(); i7++) {
            iZzB2 += zzln.zzB(zzneVar.zze(i7));
        }
        this.zza.zzt(iZzB2);
        while (i3 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzl(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzne)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i5 += 4;
            }
            this.zza.zzt(i5);
            while (i3 < list.size()) {
                this.zza.zzg(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z2) {
            while (i3 < zzneVar.size()) {
                this.zza.zzf(i2, zzneVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzneVar.size(); i9++) {
            zzneVar.zze(i9);
            i8 += 4;
        }
        this.zza.zzt(i8);
        while (i3 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzm(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzn(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zznx)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i5 += 8;
            }
            this.zza.zzt(i5);
            while (i3 < list.size()) {
                this.zza.zzi(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z2) {
            while (i3 < zznxVar.size()) {
                this.zza.zzh(i2, zznxVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zznxVar.size(); i9++) {
            zznxVar.zze(i9);
            i8 += 8;
        }
        this.zza.zzt(i8);
        while (i3 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzo(int i2, float f3) throws IOException {
        this.zza.zzf(i2, Float.floatToRawIntBits(f3));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzp(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmv)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Float) list.get(i7)).getClass();
                i5 += 4;
            }
            this.zza.zzt(i5);
            while (i3 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        zzmv zzmvVar = (zzmv) list;
        if (!z2) {
            while (i3 < zzmvVar.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(zzmvVar.zze(i3)));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmvVar.size(); i9++) {
            zzmvVar.zze(i9);
            i8 += 4;
        }
        this.zza.zzt(i8);
        while (i3 < zzmvVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzmvVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzq(int i2, Object obj, zzow zzowVar) throws IOException {
        zzln zzlnVar = this.zza;
        zzlnVar.zzr(i2, 3);
        zzowVar.zzj((zzoi) obj, zzlnVar.zza);
        zzlnVar.zzr(i2, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzr(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzs(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzne)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzB += zzln.zzB(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i3 < list.size()) {
                this.zza.zzk(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z2) {
            while (i3 < zzneVar.size()) {
                this.zza.zzj(i2, zzneVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zzneVar.size(); i7++) {
            iZzB2 += zzln.zzB(zzneVar.zze(i7));
        }
        this.zza.zzt(iZzB2);
        while (i3 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzt(int i2, long j2) throws IOException {
        this.zza.zzu(i2, j2);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzu(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zznx)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzu(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzB += zzln.zzB(((Long) list.get(i5)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i3 < list.size()) {
                this.zza.zzv(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z2) {
            while (i3 < zznxVar.size()) {
                this.zza.zzu(i2, zznxVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zznxVar.size(); i7++) {
            iZzB2 += zzln.zzB(zznxVar.zze(i7));
        }
        this.zza.zzt(iZzB2);
        while (i3 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzv(int i2, Object obj, zzow zzowVar) throws IOException {
        this.zza.zzm(i2, (zzoi) obj, zzowVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzw(int i2, Object obj) throws IOException {
        if (obj instanceof zzle) {
            this.zza.zzo(i2, (zzle) obj);
        } else {
            this.zza.zzn(i2, (zzoi) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzx(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzy(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzne)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i5 += 4;
            }
            this.zza.zzt(i5);
            while (i3 < list.size()) {
                this.zza.zzg(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z2) {
            while (i3 < zzneVar.size()) {
                this.zza.zzf(i2, zzneVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzneVar.size(); i9++) {
            zzneVar.zze(i9);
            i8 += 4;
        }
        this.zza.zzt(i8);
        while (i3 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzz(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    private zzlo(zzln zzlnVar) {
        byte[] bArr = zznl.zzb;
        this.zza = zzlnVar;
        zzlnVar.zza = this;
    }
}
