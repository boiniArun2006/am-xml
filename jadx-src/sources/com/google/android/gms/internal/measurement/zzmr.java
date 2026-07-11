package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzmr {
    public static final zzmr zza;
    public static final zzmr zzb;
    public static final zzmr zzc;
    public static final zzmr zzd;
    public static final zzmr zze;
    public static final zzmr zzf;
    public static final zzmr zzg;
    public static final zzmr zzh;
    public static final zzmr zzi;
    public static final zzmr zzj;
    private static final /* synthetic */ zzmr[] zzl;
    private final Class zzk;

    public final Class zza() {
        return this.zzk;
    }

    static {
        zzmr zzmrVar = new zzmr("VOID", 0, Void.class, Void.class, null);
        zza = zzmrVar;
        Class cls = Integer.TYPE;
        zzmr zzmrVar2 = new zzmr("INT", 1, cls, Integer.class, 0);
        zzb = zzmrVar2;
        zzmr zzmrVar3 = new zzmr("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzmrVar3;
        zzmr zzmrVar4 = new zzmr("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzmrVar4;
        zzmr zzmrVar5 = new zzmr("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzmrVar5;
        zzmr zzmrVar6 = new zzmr("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzmrVar6;
        zzmr zzmrVar7 = new zzmr("STRING", 6, String.class, String.class, "");
        zzg = zzmrVar7;
        zzmr zzmrVar8 = new zzmr("BYTE_STRING", 7, zzlg.class, zzlg.class, zzlg.zzb);
        zzh = zzmrVar8;
        zzmr zzmrVar9 = new zzmr("ENUM", 8, cls, Integer.class, null);
        zzi = zzmrVar9;
        zzmr zzmrVar10 = new zzmr("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzmrVar10;
        zzl = new zzmr[]{zzmrVar, zzmrVar2, zzmrVar3, zzmrVar4, zzmrVar5, zzmrVar6, zzmrVar7, zzmrVar8, zzmrVar9, zzmrVar10};
    }

    public static zzmr[] values() {
        return (zzmr[]) zzl.clone();
    }

    private zzmr(String str, int i2, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }
}
