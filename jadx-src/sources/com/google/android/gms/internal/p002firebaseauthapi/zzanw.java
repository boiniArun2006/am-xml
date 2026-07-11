package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class zzanw {
    public static final zzanw zza;
    public static final zzanw zzb;
    public static final zzanw zzc;
    public static final zzanw zzd;
    public static final zzanw zze;
    public static final zzanw zzf;
    public static final zzanw zzg;
    public static final zzanw zzh;
    public static final zzanw zzi;
    public static final zzanw zzj;
    public static final zzanw zzk;
    public static final zzanw zzl;
    public static final zzanw zzm;
    public static final zzanw zzn;
    public static final zzanw zzo;
    public static final zzanw zzp;
    public static final zzanw zzq;
    public static final zzanw zzr;
    private static final /* synthetic */ zzanw[] zzs;
    private final zzaod zzt;
    private final int zzu;

    static {
        zzanw zzanwVar = new zzanw("DOUBLE", 0, zzaod.DOUBLE, 1);
        zza = zzanwVar;
        zzanw zzanwVar2 = new zzanw(QiDPjiOCZHDS.SToUHMIaRUskeng, 1, zzaod.FLOAT, 5);
        zzb = zzanwVar2;
        zzaod zzaodVar = zzaod.LONG;
        zzanw zzanwVar3 = new zzanw("INT64", 2, zzaodVar, 0);
        zzc = zzanwVar3;
        zzanw zzanwVar4 = new zzanw("UINT64", 3, zzaodVar, 0);
        zzd = zzanwVar4;
        zzaod zzaodVar2 = zzaod.INT;
        zzanw zzanwVar5 = new zzanw("INT32", 4, zzaodVar2, 0);
        zze = zzanwVar5;
        zzanw zzanwVar6 = new zzanw("FIXED64", 5, zzaodVar, 1);
        zzf = zzanwVar6;
        zzanw zzanwVar7 = new zzanw("FIXED32", 6, zzaodVar2, 5);
        zzg = zzanwVar7;
        zzanw zzanwVar8 = new zzanw("BOOL", 7, zzaod.BOOLEAN, 0);
        zzh = zzanwVar8;
        zzanz zzanzVar = new zzanz("STRING", zzaod.STRING);
        zzi = zzanzVar;
        zzaod zzaodVar3 = zzaod.MESSAGE;
        zzany zzanyVar = new zzany("GROUP", zzaodVar3);
        zzj = zzanyVar;
        zzaob zzaobVar = new zzaob("MESSAGE", zzaodVar3);
        zzk = zzaobVar;
        zzaoa zzaoaVar = new zzaoa("BYTES", zzaod.BYTE_STRING);
        zzl = zzaoaVar;
        zzanw zzanwVar9 = new zzanw("UINT32", 12, zzaodVar2, 0);
        zzm = zzanwVar9;
        zzanw zzanwVar10 = new zzanw("ENUM", 13, zzaod.ENUM, 0);
        zzn = zzanwVar10;
        zzanw zzanwVar11 = new zzanw("SFIXED32", 14, zzaodVar2, 5);
        zzo = zzanwVar11;
        zzanw zzanwVar12 = new zzanw("SFIXED64", 15, zzaodVar, 1);
        zzp = zzanwVar12;
        zzanw zzanwVar13 = new zzanw("SINT32", 16, zzaodVar2, 0);
        zzq = zzanwVar13;
        zzanw zzanwVar14 = new zzanw("SINT64", 17, zzaodVar, 0);
        zzr = zzanwVar14;
        zzs = new zzanw[]{zzanwVar, zzanwVar2, zzanwVar3, zzanwVar4, zzanwVar5, zzanwVar6, zzanwVar7, zzanwVar8, zzanzVar, zzanyVar, zzaobVar, zzaoaVar, zzanwVar9, zzanwVar10, zzanwVar11, zzanwVar12, zzanwVar13, zzanwVar14};
    }

    private zzanw(String str, int i2, zzaod zzaodVar, int i3) {
        this.zzt = zzaodVar;
        this.zzu = i3;
    }

    public static zzanw[] values() {
        return (zzanw[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzaod zzb() {
        return this.zzt;
    }
}
