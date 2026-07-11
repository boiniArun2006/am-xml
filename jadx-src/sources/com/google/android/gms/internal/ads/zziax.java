package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziax implements zzieu {
    private final zziaw zza;

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzG(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzk(i2, (zzian) list.get(i3));
        }
    }

    public static zziax zza(zziaw zziawVar) {
        Object obj = zziawVar.zze;
        return obj != null ? (zziax) obj : new zziax(zziawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzA(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzicq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i5 += 8;
            }
            zziawVar.zzs(i5);
            while (i3 < list.size()) {
                zziawVar.zzv(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z2) {
            while (i3 < zzicqVar.size()) {
                this.zza.zzh(i2, zzicqVar.zzc(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzicqVar.size(); i9++) {
            zzicqVar.zzc(i9);
            i8 += 8;
        }
        zziawVar2.zzs(i8);
        while (i3 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzB(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibi)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzK(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Float) list.get(i7)).getClass();
                i5 += 4;
            }
            zziawVar.zzs(i5);
            while (i3 < list.size()) {
                zziawVar.zzt(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        zzibi zzibiVar = (zzibi) list;
        if (!z2) {
            while (i3 < zzibiVar.size()) {
                this.zza.zzK(i2, Float.floatToRawIntBits(zzibiVar.zzf(i3)));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzibiVar.size(); i9++) {
            zzibiVar.zzf(i9);
            i8 += 4;
        }
        zziawVar2.zzs(i8);
        while (i3 < zzibiVar.size()) {
            zziawVar2.zzt(Float.floatToRawIntBits(zzibiVar.zzf(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzC(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zziay)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Double) list.get(i7)).getClass();
                i5 += 8;
            }
            zziawVar.zzs(i5);
            while (i3 < list.size()) {
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        zziay zziayVar = (zziay) list;
        if (!z2) {
            while (i3 < zziayVar.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(zziayVar.zzf(i3)));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zziayVar.size(); i9++) {
            zziayVar.zzf(i9);
            i8 += 8;
        }
        zziawVar2.zzs(i8);
        while (i3 < zziayVar.size()) {
            zziawVar2.zzv(Double.doubleToRawLongBits(zziayVar.zzf(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzD(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibs)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzI(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzB += zziaw.zzB(((Integer) list.get(i5)).intValue());
            }
            zziawVar.zzs(iZzB);
            while (i3 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z2) {
            while (i3 < zzibsVar.size()) {
                this.zza.zzI(i2, zzibsVar.zzf(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zzibsVar.size(); i7++) {
            iZzB2 += zziaw.zzB(zzibsVar.zzf(i7));
        }
        zziawVar2.zzs(iZzB2);
        while (i3 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i3));
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
    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzE(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zziad)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzi(i2, ((Boolean) list.get(i3)).booleanValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Boolean) list.get(i7)).getClass();
                i5++;
            }
            zziawVar.zzs(i5);
            while (i3 < list.size()) {
                zziawVar.zzq(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        zziad zziadVar = (zziad) list;
        if (!z2) {
            while (i3 < zziadVar.size()) {
                this.zza.zzi(i2, zziadVar.zzf(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zziadVar.size(); i9++) {
            zziadVar.zzf(i9);
            i8++;
        }
        zziawVar2.zzs(i8);
        while (i3 < zziadVar.size()) {
            zziawVar2.zzq(zziadVar.zzf(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzF(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzicn)) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzicn zzicnVar = (zzicn) list;
        while (i3 < list.size()) {
            Object objZzc = zzicnVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzj(i2, (String) objZzc);
            } else {
                this.zza.zzk(i2, (zzian) objZzc);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzH(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibs)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzJ(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzA += zziaw.zzA(((Integer) list.get(i5)).intValue());
            }
            zziawVar.zzs(iZzA);
            while (i3 < list.size()) {
                zziawVar.zzs(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z2) {
            while (i3 < zzibsVar.size()) {
                this.zza.zzJ(i2, zzibsVar.zzf(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzibsVar.size(); i7++) {
            iZzA2 += zziaw.zzA(zzibsVar.zzf(i7));
        }
        zziawVar2.zzs(iZzA2);
        while (i3 < zzibsVar.size()) {
            zziawVar2.zzs(zzibsVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzI(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibs)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzK(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i5 += 4;
            }
            zziawVar.zzs(i5);
            while (i3 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z2) {
            while (i3 < zzibsVar.size()) {
                this.zza.zzK(i2, zzibsVar.zzf(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzibsVar.size(); i9++) {
            zzibsVar.zzf(i9);
            i8 += 4;
        }
        zziawVar2.zzs(i8);
        while (i3 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzJ(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzicq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i5 += 8;
            }
            zziawVar.zzs(i5);
            while (i3 < list.size()) {
                zziawVar.zzv(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z2) {
            while (i3 < zzicqVar.size()) {
                this.zza.zzh(i2, zzicqVar.zzc(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzicqVar.size(); i9++) {
            zzicqVar.zzc(i9);
            i8 += 8;
        }
        zziawVar2.zzs(i8);
        while (i3 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzK(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibs)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zziaw zziawVar = this.zza;
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    zziawVar.zzJ(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i2, 2);
            int iZzA = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                int iIntValue2 = ((Integer) list.get(i5)).intValue();
                iZzA += zziaw.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zziawVar2.zzs(iZzA);
            while (i3 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i3)).intValue();
                zziawVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i3++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z2) {
            while (i3 < zzibsVar.size()) {
                zziaw zziawVar3 = this.zza;
                int iZzf = zzibsVar.zzf(i3);
                zziawVar3.zzJ(i2, (iZzf >> 31) ^ (iZzf + iZzf));
                i3++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i2, 2);
        int iZzA2 = 0;
        for (int i7 = 0; i7 < zzibsVar.size(); i7++) {
            int iZzf2 = zzibsVar.zzf(i7);
            iZzA2 += zziaw.zzA((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zziawVar4.zzs(iZzA2);
        while (i3 < zzibsVar.size()) {
            int iZzf3 = zzibsVar.zzf(i3);
            zziawVar4.zzs((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzL(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzicq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zziaw zziawVar = this.zza;
                    long jLongValue = ((Long) list.get(i3)).longValue();
                    zziawVar.zzL(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i3++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                long jLongValue2 = ((Long) list.get(i5)).longValue();
                iZzB += zziaw.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zziawVar2.zzs(iZzB);
            while (i3 < list.size()) {
                long jLongValue3 = ((Long) list.get(i3)).longValue();
                zziawVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i3++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z2) {
            while (i3 < zzicqVar.size()) {
                zziaw zziawVar3 = this.zza;
                long jZzc = zzicqVar.zzc(i3);
                zziawVar3.zzL(i2, (jZzc >> 63) ^ (jZzc + jZzc));
                i3++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zzicqVar.size(); i7++) {
            long jZzc2 = zzicqVar.zzc(i7);
            iZzB2 += zziaw.zzB((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zziawVar4.zzs(iZzB2);
        while (i3 < zzicqVar.size()) {
            long jZzc3 = zzicqVar.zzc(i3);
            zziawVar4.zzu((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zzK(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzc(int i2, long j2) throws IOException {
        this.zza.zzL(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzd(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zze(int i2, float f3) throws IOException {
        this.zza.zzK(i2, Float.floatToRawIntBits(f3));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzf(int i2, double d2) throws IOException {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzg(int i2, int i3) throws IOException {
        this.zza.zzI(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzh(int i2, long j2) throws IOException {
        this.zza.zzL(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzI(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzj(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzK(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzl(int i2, boolean z2) throws IOException {
        this.zza.zzi(i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzm(int i2, String str) throws IOException {
        this.zza.zzj(i2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzn(int i2, zzian zzianVar) throws IOException {
        this.zza.zzk(i2, zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzo(int i2, int i3) throws IOException {
        this.zza.zzJ(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzp(int i2, int i3) throws IOException {
        this.zza.zzJ(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzq(int i2, long j2) throws IOException {
        this.zza.zzL(i2, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzr(int i2, Object obj, zzidu zziduVar) throws IOException {
        zziaw zziawVar = this.zza;
        zzhzw zzhzwVar = (zzhzw) obj;
        zziawVar.zzH(i2, 2);
        zziawVar.zzs(zzhzwVar.zzaT(zziduVar));
        zziduVar.zzf(zzhzwVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzs(int i2, Object obj, zzidu zziduVar) throws IOException {
        zziaw zziawVar = this.zza;
        zziawVar.zzH(i2, 3);
        zziduVar.zzf((zzhzw) obj, this);
        zziawVar.zzH(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    @Deprecated
    public final void zzt(int i2) throws IOException {
        this.zza.zzH(i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    @Deprecated
    public final void zzu(int i2) throws IOException {
        this.zza.zzH(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzv(int i2, Object obj) throws IOException {
        if (obj instanceof zzian) {
            this.zza.zzo(i2, (zzian) obj);
        } else {
            this.zza.zzn(i2, (zzidc) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzw(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibs)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzI(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzB += zziaw.zzB(((Integer) list.get(i5)).intValue());
            }
            zziawVar.zzs(iZzB);
            while (i3 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z2) {
            while (i3 < zzibsVar.size()) {
                this.zza.zzI(i2, zzibsVar.zzf(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zzibsVar.size(); i7++) {
            iZzB2 += zziaw.zzB(zzibsVar.zzf(i7));
        }
        zziawVar2.zzs(iZzB2);
        while (i3 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzx(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibs)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzK(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int i5 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i5 += 4;
            }
            zziawVar.zzs(i5);
            while (i3 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z2) {
            while (i3 < zzibsVar.size()) {
                this.zza.zzK(i2, zzibsVar.zzf(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzibsVar.size(); i9++) {
            zzibsVar.zzf(i9);
            i8 += 4;
        }
        zziawVar2.zzs(i8);
        while (i3 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzy(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzicq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzL(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzB += zziaw.zzB(((Long) list.get(i5)).longValue());
            }
            zziawVar.zzs(iZzB);
            while (i3 < list.size()) {
                zziawVar.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z2) {
            while (i3 < zzicqVar.size()) {
                this.zza.zzL(i2, zzicqVar.zzc(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zzicqVar.size(); i7++) {
            iZzB2 += zziaw.zzB(zzicqVar.zzc(i7));
        }
        zziawVar2.zzs(iZzB2);
        while (i3 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzz(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzicq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzL(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            int iZzB = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzB += zziaw.zzB(((Long) list.get(i5)).longValue());
            }
            zziawVar.zzs(iZzB);
            while (i3 < list.size()) {
                zziawVar.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z2) {
            while (i3 < zzicqVar.size()) {
                this.zza.zzL(i2, zzicqVar.zzc(i3));
                i3++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i2, 2);
        int iZzB2 = 0;
        for (int i7 = 0; i7 < zzicqVar.size(); i7++) {
            iZzB2 += zziaw.zzB(zzicqVar.zzc(i7));
        }
        zziawVar2.zzs(iZzB2);
        while (i3 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i3));
            i3++;
        }
    }

    private zziax(zziaw zziawVar) {
        zzice.zza(zziawVar, "output");
        this.zza = zziawVar;
        zziawVar.zze = this;
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzM(int i2, zzicu zzicuVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i2, 2);
            zziawVar.zzs(zzicv.zzc(zzicuVar, entry.getKey(), entry.getValue()));
            zzicv.zzb(zziawVar, zzicuVar, entry.getKey(), entry.getValue());
        }
    }
}
