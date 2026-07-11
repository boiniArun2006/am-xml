package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'r' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class ci {
    public static final ci E2;
    public static final ci J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final /* synthetic */ ci[] f59981N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final ci f59982S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final ci f59983T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final ci f59984X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final ci f59985Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ci f59986e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ci f59987g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ci f59988o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ci f59989r;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f59990O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f59991n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Class f59992t;

    static {
        ci ciVar = new ci("VOID", 0, Void.class, Void.class, null);
        J2 = ciVar;
        Class cls = Integer.TYPE;
        ci ciVar2 = new ci("INT", 1, cls, Integer.class, 0);
        f59989r = ciVar2;
        ci ciVar3 = new ci("LONG", 2, Long.TYPE, Long.class, 0L);
        f59988o = ciVar3;
        ci ciVar4 = new ci("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f59985Z = ciVar4;
        ci ciVar5 = new ci("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f59982S = ciVar5;
        ci ciVar6 = new ci("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f59987g = ciVar6;
        ci ciVar7 = new ci("STRING", 6, String.class, String.class, "");
        E2 = ciVar7;
        ci ciVar8 = new ci("BYTE_STRING", 7, fuX.class, fuX.class, fuX.f59997t);
        f59986e = ciVar8;
        ci ciVar9 = new ci("ENUM", 8, cls, Integer.class, null);
        f59984X = ciVar9;
        ci ciVar10 = new ci("MESSAGE", 9, Object.class, Object.class, null);
        f59983T = ciVar10;
        f59981N = new ci[]{ciVar, ciVar2, ciVar3, ciVar4, ciVar5, ciVar6, ciVar7, ciVar8, ciVar9, ciVar10};
    }

    public static ci valueOf(String str) {
        return (ci) Enum.valueOf(ci.class, str);
    }

    public static ci[] values() {
        return (ci[]) f59981N.clone();
    }

    public Class n() {
        return this.f59992t;
    }

    private ci(String str, int i2, Class cls, Class cls2, Object obj) {
        this.f59991n = cls;
        this.f59992t = cls2;
        this.f59990O = obj;
    }
}
