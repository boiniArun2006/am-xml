package androidx.content.preferences.protobuf;

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
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class JavaType {
    public static final JavaType E2;
    public static final JavaType J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final /* synthetic */ JavaType[] f38053N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final JavaType f38054S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final JavaType f38055T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final JavaType f38056X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final JavaType f38057Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final JavaType f38058e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final JavaType f38059g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final JavaType f38060o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final JavaType f38061r;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f38062O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f38063n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Class f38064t;

    static {
        JavaType javaType = new JavaType("VOID", 0, Void.class, Void.class, null);
        J2 = javaType;
        Class cls = Integer.TYPE;
        JavaType javaType2 = new JavaType("INT", 1, cls, Integer.class, 0);
        f38061r = javaType2;
        JavaType javaType3 = new JavaType("LONG", 2, Long.TYPE, Long.class, 0L);
        f38060o = javaType3;
        JavaType javaType4 = new JavaType("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f38057Z = javaType4;
        JavaType javaType5 = new JavaType("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f38054S = javaType5;
        JavaType javaType6 = new JavaType("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f38059g = javaType6;
        JavaType javaType7 = new JavaType("STRING", 6, String.class, String.class, "");
        E2 = javaType7;
        JavaType javaType8 = new JavaType("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.f37740t);
        f38058e = javaType8;
        JavaType javaType9 = new JavaType("ENUM", 8, cls, Integer.class, null);
        f38056X = javaType9;
        JavaType javaType10 = new JavaType("MESSAGE", 9, Object.class, Object.class, null);
        f38055T = javaType10;
        f38053N = new JavaType[]{javaType, javaType2, javaType3, javaType4, javaType5, javaType6, javaType7, javaType8, javaType9, javaType10};
    }

    public static JavaType valueOf(String str) {
        return (JavaType) Enum.valueOf(JavaType.class, str);
    }

    public static JavaType[] values() {
        return (JavaType[]) f38053N.clone();
    }

    public Class n() {
        return this.f38064t;
    }

    private JavaType(String str, int i2, Class cls, Class cls2, Object obj) {
        this.f38063n = cls;
        this.f38064t = cls2;
        this.f38062O = obj;
    }
}
