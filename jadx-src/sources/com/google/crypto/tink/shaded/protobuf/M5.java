package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class M5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f59884n = t(1, 3);
    static final int rl = t(1, 4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f59885t = t(2, 0);
    static final int nr = t(3, 2);

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
    public static class n {
        public static final n E2;
        public static final n J2;
        public static final n M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final n f59886N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f59887O;
        public static final n P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final n f59888S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final n f59889T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final n f59890U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final n f59891X;
        public static final n Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final n f59892Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final n f59893e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final n f59894g;
        public static final n jB;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final n f59895o;
        private static final /* synthetic */ n[] p5;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f59896r;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final n f59897v;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f59898n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f59899t;

        enum Ml extends n {
            Ml(String str, int i2, w6 w6Var, int i3) {
                super(str, i2, w6Var, i3);
            }
        }

        enum j extends n {
            j(String str, int i2, w6 w6Var, int i3) {
                super(str, i2, w6Var, i3);
            }
        }

        /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.M5$n$n, reason: collision with other inner class name */
        enum C0801n extends n {
            C0801n(String str, int i2, w6 w6Var, int i3) {
                super(str, i2, w6Var, i3);
            }
        }

        enum w6 extends n {
            w6(String str, int i2, w6 w6Var, int i3) {
                super(str, i2, w6Var, i3);
            }
        }

        static {
            n nVar = new n("DOUBLE", 0, w6.DOUBLE, 1);
            f59887O = nVar;
            n nVar2 = new n("FLOAT", 1, w6.FLOAT, 5);
            J2 = nVar2;
            w6 w6Var = w6.LONG;
            n nVar3 = new n("INT64", 2, w6Var, 0);
            f59896r = nVar3;
            n nVar4 = new n("UINT64", 3, w6Var, 0);
            f59895o = nVar4;
            w6 w6Var2 = w6.INT;
            n nVar5 = new n("INT32", 4, w6Var2, 0);
            f59892Z = nVar5;
            n nVar6 = new n("FIXED64", 5, w6Var, 1);
            f59888S = nVar6;
            n nVar7 = new n("FIXED32", 6, w6Var2, 5);
            f59894g = nVar7;
            n nVar8 = new n("BOOL", 7, w6.BOOLEAN, 0);
            E2 = nVar8;
            j jVar = new j("STRING", 8, w6.STRING, 2);
            f59893e = jVar;
            w6 w6Var3 = w6.MESSAGE;
            C0801n c0801n = new C0801n("GROUP", 9, w6Var3, 3);
            f59891X = c0801n;
            w6 w6Var4 = new w6("MESSAGE", 10, w6Var3, 2);
            f59889T = w6Var4;
            Ml ml = new Ml("BYTES", 11, w6.BYTE_STRING, 2);
            f59886N = ml;
            n nVar9 = new n("UINT32", 12, w6Var2, 0);
            f59897v = nVar9;
            n nVar10 = new n("ENUM", 13, w6.ENUM, 0);
            Xw = nVar10;
            n nVar11 = new n("SFIXED32", 14, w6Var2, 5);
            jB = nVar11;
            n nVar12 = new n("SFIXED64", 15, w6Var, 1);
            f59890U = nVar12;
            n nVar13 = new n("SINT32", 16, w6Var2, 0);
            P5 = nVar13;
            n nVar14 = new n("SINT64", 17, w6Var, 0);
            M7 = nVar14;
            p5 = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, jVar, c0801n, w6Var4, ml, nVar9, nVar10, nVar11, nVar12, nVar13, nVar14};
        }

        private n(String str, int i2, w6 w6Var, int i3) {
            this.f59898n = w6Var;
            this.f59899t = i3;
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) p5.clone();
        }
    }

    public static int n(int i2) {
        return i2 >>> 3;
    }

    public static int rl(int i2) {
        return i2 & 7;
    }

    static int t(int i2, int i3) {
        return (i2 << 3) | i3;
    }

    public enum w6 {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(fuX.f59997t),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f59908n;

        w6(Object obj) {
            this.f59908n = obj;
        }
    }
}
