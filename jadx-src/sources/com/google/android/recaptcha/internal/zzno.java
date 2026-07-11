package com.google.android.recaptcha.internal;

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
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzno {
    public static final zzno zza;
    public static final zzno zzb;
    public static final zzno zzc;
    public static final zzno zzd;
    public static final zzno zze;
    public static final zzno zzf;
    public static final zzno zzg;
    public static final zzno zzh;
    public static final zzno zzi;
    public static final zzno zzj;
    private static final /* synthetic */ zzno[] zzk;
    private final Class zzl;

    public final Class zza() {
        return this.zzl;
    }

    static {
        zzno zznoVar = new zzno("VOID", 0, Void.class, Void.class, null);
        zza = zznoVar;
        Class cls = Integer.TYPE;
        zzno zznoVar2 = new zzno("INT", 1, cls, Integer.class, 0);
        zzb = zznoVar2;
        zzno zznoVar3 = new zzno("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zznoVar3;
        zzno zznoVar4 = new zzno("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zznoVar4;
        zzno zznoVar5 = new zzno("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zznoVar5;
        zzno zznoVar6 = new zzno("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zznoVar6;
        zzno zznoVar7 = new zzno("STRING", 6, String.class, String.class, "");
        zzg = zznoVar7;
        zzno zznoVar8 = new zzno("BYTE_STRING", 7, zzle.class, zzle.class, zzle.zzb);
        zzh = zznoVar8;
        zzno zznoVar9 = new zzno("ENUM", 8, cls, Integer.class, null);
        zzi = zznoVar9;
        zzno zznoVar10 = new zzno("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zznoVar10;
        zzk = new zzno[]{zznoVar, zznoVar2, zznoVar3, zznoVar4, zznoVar5, zznoVar6, zznoVar7, zznoVar8, zznoVar9, zznoVar10};
    }

    public static zzno[] values() {
        return (zzno[]) zzk.clone();
    }

    private zzno(String str, int i2, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }
}
