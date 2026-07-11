package com.google.android.gms.internal.p002firebaseauthapi;

import android.graphics.Trmy.yioUaKMByL;

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
public final class zzalh {
    public static final zzalh zza;
    public static final zzalh zzb;
    public static final zzalh zzc;
    public static final zzalh zzd;
    public static final zzalh zze;
    public static final zzalh zzf;
    public static final zzalh zzg;
    public static final zzalh zzh;
    public static final zzalh zzi;
    public static final zzalh zzj;
    private static final /* synthetic */ zzalh[] zzk;
    private final Class<?> zzl;

    static {
        zzalh zzalhVar = new zzalh(yioUaKMByL.bVgWRb, 0, Void.class, Void.class, null);
        zza = zzalhVar;
        Class cls = Integer.TYPE;
        zzalh zzalhVar2 = new zzalh("INT", 1, cls, Integer.class, 0);
        zzb = zzalhVar2;
        zzalh zzalhVar3 = new zzalh("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzalhVar3;
        zzalh zzalhVar4 = new zzalh("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzalhVar4;
        zzalh zzalhVar5 = new zzalh("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzalhVar5;
        zzalh zzalhVar6 = new zzalh("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzalhVar6;
        zzalh zzalhVar7 = new zzalh("STRING", 6, String.class, String.class, "");
        zzg = zzalhVar7;
        zzalh zzalhVar8 = new zzalh("BYTE_STRING", 7, zzajp.class, zzajp.class, zzajp.zza);
        zzh = zzalhVar8;
        zzalh zzalhVar9 = new zzalh("ENUM", 8, cls, Integer.class, null);
        zzi = zzalhVar9;
        zzalh zzalhVar10 = new zzalh("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzalhVar10;
        zzk = new zzalh[]{zzalhVar, zzalhVar2, zzalhVar3, zzalhVar4, zzalhVar5, zzalhVar6, zzalhVar7, zzalhVar8, zzalhVar9, zzalhVar10};
    }

    public static zzalh[] values() {
        return (zzalh[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }

    private zzalh(String str, int i2, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }
}
