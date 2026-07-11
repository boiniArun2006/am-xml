package com.google.android.gms.internal.ads;

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
public final class zzici {
    public static final zzici zza;
    public static final zzici zzb;
    public static final zzici zzc;
    public static final zzici zzd;
    public static final zzici zze;
    public static final zzici zzf;
    public static final zzici zzg;
    public static final zzici zzh;
    public static final zzici zzi;
    public static final zzici zzj;
    private static final /* synthetic */ zzici[] zzl;
    private final Class zzk;

    public final Class zza() {
        return this.zzk;
    }

    static {
        zzici zziciVar = new zzici("VOID", 0, Void.class, Void.class, null);
        zza = zziciVar;
        Class cls = Integer.TYPE;
        zzici zziciVar2 = new zzici("INT", 1, cls, Integer.class, 0);
        zzb = zziciVar2;
        zzici zziciVar3 = new zzici("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zziciVar3;
        zzici zziciVar4 = new zzici("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zziciVar4;
        zzici zziciVar5 = new zzici("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zziciVar5;
        zzici zziciVar6 = new zzici("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zziciVar6;
        zzici zziciVar7 = new zzici("STRING", 6, String.class, String.class, "");
        zzg = zziciVar7;
        zzici zziciVar8 = new zzici("BYTE_STRING", 7, zzian.class, zzian.class, zzian.zza);
        zzh = zziciVar8;
        zzici zziciVar9 = new zzici("ENUM", 8, cls, Integer.class, null);
        zzi = zziciVar9;
        zzici zziciVar10 = new zzici("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zziciVar10;
        zzl = new zzici[]{zziciVar, zziciVar2, zziciVar3, zziciVar4, zziciVar5, zziciVar6, zziciVar7, zziciVar8, zziciVar9, zziciVar10};
    }

    public static zzici[] values() {
        return (zzici[]) zzl.clone();
    }

    private zzici(String str, int i2, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }
}
