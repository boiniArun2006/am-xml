package com.google.android.gms.internal.measurement;

import ScC.FuwU.XIvb;

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
public final class zzos {
    public static final zzos zza;
    public static final zzos zzb;
    public static final zzos zzc;
    public static final zzos zzd;
    public static final zzos zze;
    public static final zzos zzf;
    public static final zzos zzg;
    public static final zzos zzh;
    public static final zzos zzi;
    public static final zzos zzj;
    public static final zzos zzk;
    public static final zzos zzl;
    public static final zzos zzm;
    public static final zzos zzn;
    public static final zzos zzo;
    public static final zzos zzp;
    public static final zzos zzq;
    public static final zzos zzr;
    private static final /* synthetic */ zzos[] zzu;
    private final zzot zzs;
    private final int zzt;

    public final zzot zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    static {
        zzos zzosVar = new zzos("DOUBLE", 0, zzot.DOUBLE, 1);
        zza = zzosVar;
        zzos zzosVar2 = new zzos(XIvb.xSZQ, 1, zzot.FLOAT, 5);
        zzb = zzosVar2;
        zzot zzotVar = zzot.LONG;
        zzos zzosVar3 = new zzos("INT64", 2, zzotVar, 0);
        zzc = zzosVar3;
        zzos zzosVar4 = new zzos("UINT64", 3, zzotVar, 0);
        zzd = zzosVar4;
        zzot zzotVar2 = zzot.INT;
        zzos zzosVar5 = new zzos("INT32", 4, zzotVar2, 0);
        zze = zzosVar5;
        zzos zzosVar6 = new zzos("FIXED64", 5, zzotVar, 1);
        zzf = zzosVar6;
        zzos zzosVar7 = new zzos("FIXED32", 6, zzotVar2, 5);
        zzg = zzosVar7;
        zzos zzosVar8 = new zzos("BOOL", 7, zzot.BOOLEAN, 0);
        zzh = zzosVar8;
        zzos zzosVar9 = new zzos("STRING", 8, zzot.STRING, 2);
        zzi = zzosVar9;
        zzot zzotVar3 = zzot.MESSAGE;
        zzos zzosVar10 = new zzos("GROUP", 9, zzotVar3, 3);
        zzj = zzosVar10;
        zzos zzosVar11 = new zzos("MESSAGE", 10, zzotVar3, 2);
        zzk = zzosVar11;
        zzos zzosVar12 = new zzos("BYTES", 11, zzot.BYTE_STRING, 2);
        zzl = zzosVar12;
        zzos zzosVar13 = new zzos("UINT32", 12, zzotVar2, 0);
        zzm = zzosVar13;
        zzos zzosVar14 = new zzos("ENUM", 13, zzot.ENUM, 0);
        zzn = zzosVar14;
        zzos zzosVar15 = new zzos("SFIXED32", 14, zzotVar2, 5);
        zzo = zzosVar15;
        zzos zzosVar16 = new zzos("SFIXED64", 15, zzotVar, 1);
        zzp = zzosVar16;
        zzos zzosVar17 = new zzos("SINT32", 16, zzotVar2, 0);
        zzq = zzosVar17;
        zzos zzosVar18 = new zzos("SINT64", 17, zzotVar, 0);
        zzr = zzosVar18;
        zzu = new zzos[]{zzosVar, zzosVar2, zzosVar3, zzosVar4, zzosVar5, zzosVar6, zzosVar7, zzosVar8, zzosVar9, zzosVar10, zzosVar11, zzosVar12, zzosVar13, zzosVar14, zzosVar15, zzosVar16, zzosVar17, zzosVar18};
    }

    public static zzos[] values() {
        return (zzos[]) zzu.clone();
    }

    private zzos(String str, int i2, zzot zzotVar, int i3) {
        this.zzs = zzotVar;
        this.zzt = i3;
    }
}
