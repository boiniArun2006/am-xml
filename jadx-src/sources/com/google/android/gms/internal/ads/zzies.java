package com.google.android.gms.internal.ads;

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
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzies {
    public static final zzies zza;
    public static final zzies zzb;
    public static final zzies zzc;
    public static final zzies zzd;
    public static final zzies zze;
    public static final zzies zzf;
    public static final zzies zzg;
    public static final zzies zzh;
    public static final zzies zzi;
    public static final zzies zzj;
    public static final zzies zzk;
    public static final zzies zzl;
    public static final zzies zzm;
    public static final zzies zzn;
    public static final zzies zzo;
    public static final zzies zzp;
    public static final zzies zzq;
    public static final zzies zzr;
    private static final /* synthetic */ zzies[] zzu;
    private final zziet zzs;
    private final int zzt;

    public final zziet zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    static {
        zzies zziesVar = new zzies("DOUBLE", 0, zziet.DOUBLE, 1);
        zza = zziesVar;
        zzies zziesVar2 = new zzies("FLOAT", 1, zziet.FLOAT, 5);
        zzb = zziesVar2;
        zziet zzietVar = zziet.LONG;
        zzies zziesVar3 = new zzies("INT64", 2, zzietVar, 0);
        zzc = zziesVar3;
        zzies zziesVar4 = new zzies("UINT64", 3, zzietVar, 0);
        zzd = zziesVar4;
        zziet zzietVar2 = zziet.INT;
        zzies zziesVar5 = new zzies("INT32", 4, zzietVar2, 0);
        zze = zziesVar5;
        zzies zziesVar6 = new zzies("FIXED64", 5, zzietVar, 1);
        zzf = zziesVar6;
        zzies zziesVar7 = new zzies("FIXED32", 6, zzietVar2, 5);
        zzg = zziesVar7;
        zzies zziesVar8 = new zzies("BOOL", 7, zziet.BOOLEAN, 0);
        zzh = zziesVar8;
        zzies zziesVar9 = new zzies("STRING", 8, zziet.STRING, 2);
        zzi = zziesVar9;
        zziet zzietVar3 = zziet.MESSAGE;
        zzies zziesVar10 = new zzies("GROUP", 9, zzietVar3, 3);
        zzj = zziesVar10;
        zzies zziesVar11 = new zzies("MESSAGE", 10, zzietVar3, 2);
        zzk = zziesVar11;
        zzies zziesVar12 = new zzies("BYTES", 11, zziet.BYTE_STRING, 2);
        zzl = zziesVar12;
        zzies zziesVar13 = new zzies("UINT32", 12, zzietVar2, 0);
        zzm = zziesVar13;
        zzies zziesVar14 = new zzies("ENUM", 13, zziet.ENUM, 0);
        zzn = zziesVar14;
        zzies zziesVar15 = new zzies("SFIXED32", 14, zzietVar2, 5);
        zzo = zziesVar15;
        zzies zziesVar16 = new zzies("SFIXED64", 15, zzietVar, 1);
        zzp = zziesVar16;
        zzies zziesVar17 = new zzies("SINT32", 16, zzietVar2, 0);
        zzq = zziesVar17;
        zzies zziesVar18 = new zzies("SINT64", 17, zzietVar, 0);
        zzr = zziesVar18;
        zzu = new zzies[]{zziesVar, zziesVar2, zziesVar3, zziesVar4, zziesVar5, zziesVar6, zziesVar7, zziesVar8, zziesVar9, zziesVar10, zziesVar11, zziesVar12, zziesVar13, zziesVar14, zziesVar15, zziesVar16, zziesVar17, zziesVar18};
    }

    public static zzies[] values() {
        return (zzies[]) zzu.clone();
    }

    private zzies(String str, int i2, zziet zzietVar, int i3) {
        this.zzs = zzietVar;
        this.zzt = i3;
    }
}
