package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgs implements zzjw {
    private final zzgr zza;

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zze(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zze(i2, (zzgk) list.get(i3));
        }
    }

    public static zzgs zza(zzgr zzgrVar) {
        zzgs zzgsVar = zzgrVar.zza;
        return zzgsVar != null ? zzgsVar : new zzgs(zzgrVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzA(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzib)) {
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
        zzib zzibVar = (zzib) list;
        if (!z2) {
            while (i3 < zzibVar.size()) {
                this.zza.zzh(i2, zzibVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzibVar.size(); i9++) {
            zzibVar.zze(i9);
            i8 += 8;
        }
        this.zza.zzt(i8);
        while (i3 < zzibVar.size()) {
            this.zza.zzi(zzibVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzB(int i2, int i3) throws IOException {
        this.zza.zzs(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzC(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhl)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzgr zzgrVar = this.zza;
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    zzgrVar.zzs(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzz = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                int iIntValue2 = ((Integer) list.get(i5)).intValue();
                iZzz += zzgr.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzz);
            while (i3 < list.size()) {
                zzgr zzgrVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i3)).intValue();
                zzgrVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i3++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z2) {
            while (i3 < zzhlVar.size()) {
                zzgr zzgrVar3 = this.zza;
                int iZze = zzhlVar.zze(i3);
                zzgrVar3.zzs(i2, (iZze >> 31) ^ (iZze + iZze));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzz2 = 0;
        for (int i7 = 0; i7 < zzhlVar.size(); i7++) {
            int iZze2 = zzhlVar.zze(i7);
            iZzz2 += zzgr.zzz((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzz2);
        while (i3 < zzhlVar.size()) {
            zzgr zzgrVar4 = this.zza;
            int iZze3 = zzhlVar.zze(i3);
            zzgrVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzD(int i2, long j2) throws IOException {
        this.zza.zzu(i2, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzE(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzib)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzgr zzgrVar = this.zza;
                    long jLongValue = ((Long) list.get(i3)).longValue();
                    zzgrVar.zzu(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                long jLongValue2 = ((Long) list.get(i5)).longValue();
                iZzA += zzgr.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzA);
            while (i3 < list.size()) {
                zzgr zzgrVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i3)).longValue();
                zzgrVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i3++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z2) {
            while (i3 < zzibVar.size()) {
                zzgr zzgrVar3 = this.zza;
                long jZze = zzibVar.zze(i3);
                zzgrVar3.zzu(i2, (jZze >> 63) ^ (jZze + jZze));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzibVar.size(); i7++) {
            long jZze2 = zzibVar.zze(i7);
            iZzA2 += zzgr.zzA((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzA2);
        while (i3 < zzibVar.size()) {
            zzgr zzgrVar4 = this.zza;
            long jZze3 = zzibVar.zze(i3);
            zzgrVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    @Deprecated
    public final void zzF(int i2) throws IOException {
        this.zza.zzr(i2, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzG(int i2, String str) throws IOException {
        this.zza.zzp(i2, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzH(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhy)) {
            while (i3 < list.size()) {
                this.zza.zzp(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzhy zzhyVar = (zzhy) list;
        while (i3 < list.size()) {
            Object objZzc = zzhyVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzp(i2, (String) objZzc);
            } else {
                this.zza.zze(i2, (zzgk) objZzc);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzI(int i2, int i3) throws IOException {
        this.zza.zzs(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzJ(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhl)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzs(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzz = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzz += zzgr.zzz(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzt(iZzz);
            while (i3 < list.size()) {
                this.zza.zzt(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z2) {
            while (i3 < zzhlVar.size()) {
                this.zza.zzs(i2, zzhlVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzz2 = 0;
        for (int i7 = 0; i7 < zzhlVar.size(); i7++) {
            iZzz2 += zzgr.zzz(zzhlVar.zze(i7));
        }
        this.zza.zzt(iZzz2);
        while (i3 < zzhlVar.size()) {
            this.zza.zzt(zzhlVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzK(int i2, long j2) throws IOException {
        this.zza.zzu(i2, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzL(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzib)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzu(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zzgr.zzA(((Long) list.get(i5)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i3 < list.size()) {
                this.zza.zzv(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z2) {
            while (i3 < zzibVar.size()) {
                this.zza.zzu(i2, zzibVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzibVar.size(); i7++) {
            iZzA2 += zzgr.zzA(zzibVar.zze(i7));
        }
        this.zza.zzt(iZzA2);
        while (i3 < zzibVar.size()) {
            this.zza.zzv(zzibVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
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
    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzc(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzgb)) {
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
        zzgb zzgbVar = (zzgb) list;
        if (!z2) {
            while (i3 < zzgbVar.size()) {
                this.zza.zzd(i2, zzgbVar.zzf(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzgbVar.size(); i9++) {
            zzgbVar.zzf(i9);
            i8++;
        }
        this.zza.zzt(i8);
        while (i3 < zzgbVar.size()) {
            this.zza.zzb(zzgbVar.zzf(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzd(int i2, zzgk zzgkVar) throws IOException {
        this.zza.zze(i2, zzgkVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzf(int i2, double d2) throws IOException {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzg(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzgt)) {
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
        zzgt zzgtVar = (zzgt) list;
        if (!z2) {
            while (i3 < zzgtVar.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(zzgtVar.zze(i3)));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzgtVar.size(); i9++) {
            zzgtVar.zze(i9);
            i8 += 8;
        }
        this.zza.zzt(i8);
        while (i3 < zzgtVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzgtVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    @Deprecated
    public final void zzh(int i2) throws IOException {
        this.zza.zzr(i2, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzj(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhl)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zzgr.zzA(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i3 < list.size()) {
                this.zza.zzk(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z2) {
            while (i3 < zzhlVar.size()) {
                this.zza.zzj(i2, zzhlVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzhlVar.size(); i7++) {
            iZzA2 += zzgr.zzA(zzhlVar.zze(i7));
        }
        this.zza.zzt(iZzA2);
        while (i3 < zzhlVar.size()) {
            this.zza.zzk(zzhlVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzl(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhl)) {
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
        zzhl zzhlVar = (zzhl) list;
        if (!z2) {
            while (i3 < zzhlVar.size()) {
                this.zza.zzf(i2, zzhlVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzhlVar.size(); i9++) {
            zzhlVar.zze(i9);
            i8 += 4;
        }
        this.zza.zzt(i8);
        while (i3 < zzhlVar.size()) {
            this.zza.zzg(zzhlVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzm(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzn(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzib)) {
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
        zzib zzibVar = (zzib) list;
        if (!z2) {
            while (i3 < zzibVar.size()) {
                this.zza.zzh(i2, zzibVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzibVar.size(); i9++) {
            zzibVar.zze(i9);
            i8 += 8;
        }
        this.zza.zzt(i8);
        while (i3 < zzibVar.size()) {
            this.zza.zzi(zzibVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzo(int i2, float f3) throws IOException {
        this.zza.zzf(i2, Float.floatToRawIntBits(f3));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzp(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhd)) {
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
        zzhd zzhdVar = (zzhd) list;
        if (!z2) {
            while (i3 < zzhdVar.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(zzhdVar.zze(i3)));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzhdVar.size(); i9++) {
            zzhdVar.zze(i9);
            i8 += 4;
        }
        this.zza.zzt(i8);
        while (i3 < zzhdVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzhdVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzq(int i2, Object obj, zzix zzixVar) throws IOException {
        zzgr zzgrVar = this.zza;
        zzgrVar.zzr(i2, 3);
        zzixVar.zzi((zzim) obj, zzgrVar.zza);
        zzgrVar.zzr(i2, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzr(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzs(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhl)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zzgr.zzA(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i3 < list.size()) {
                this.zza.zzk(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z2) {
            while (i3 < zzhlVar.size()) {
                this.zza.zzj(i2, zzhlVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzhlVar.size(); i7++) {
            iZzA2 += zzgr.zzA(zzhlVar.zze(i7));
        }
        this.zza.zzt(iZzA2);
        while (i3 < zzhlVar.size()) {
            this.zza.zzk(zzhlVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzt(int i2, long j2) throws IOException {
        this.zza.zzu(i2, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzu(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzib)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzu(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzr(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zzgr.zzA(((Long) list.get(i5)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i3 < list.size()) {
                this.zza.zzv(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z2) {
            while (i3 < zzibVar.size()) {
                this.zza.zzu(i2, zzibVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzibVar.size(); i7++) {
            iZzA2 += zzgr.zzA(zzibVar.zze(i7));
        }
        this.zza.zzt(iZzA2);
        while (i3 < zzibVar.size()) {
            this.zza.zzv(zzibVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzv(int i2, Object obj, zzix zzixVar) throws IOException {
        this.zza.zzm(i2, (zzim) obj, zzixVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzw(int i2, Object obj) throws IOException {
        if (obj instanceof zzgk) {
            this.zza.zzo(i2, (zzgk) obj);
        } else {
            this.zza.zzn(i2, (zzim) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzx(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzy(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhl)) {
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
        zzhl zzhlVar = (zzhl) list;
        if (!z2) {
            while (i3 < zzhlVar.size()) {
                this.zza.zzf(i2, zzhlVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzr(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzhlVar.size(); i9++) {
            zzhlVar.zze(i9);
            i8 += 4;
        }
        this.zza.zzt(i8);
        while (i3 < zzhlVar.size()) {
            this.zza.zzg(zzhlVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzz(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    private zzgs(zzgr zzgrVar) {
        byte[] bArr = zzhp.zzb;
        this.zza = zzgrVar;
        zzgrVar.zza = this;
    }
}
