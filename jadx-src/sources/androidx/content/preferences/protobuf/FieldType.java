package androidx.content.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'o' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class FieldType {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final FieldType f37957B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final FieldType f37958C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final FieldType f37959D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final FieldType f37960E;
    public static final FieldType E2;
    private static final /* synthetic */ FieldType[] EWS;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    public static final FieldType f37961FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    public static final FieldType f37962G7;
    private static final FieldType[] GD;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    public static final FieldType f37963GR;
    public static final FieldType HV;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final FieldType f37964I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final FieldType f37965J;
    public static final FieldType Jk;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final FieldType f37966M;
    public static final FieldType M7;
    public static final FieldType Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final FieldType f37967N;
    public static final FieldType Nxk;
    public static final FieldType Org;
    public static final FieldType P5;
    private static final Type[] Po6;
    public static final FieldType Rl;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final FieldType f37968S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final FieldType f37969T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final FieldType f37970U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final FieldType f37971X;
    public static final FieldType Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final FieldType f37972Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final FieldType f37973Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FieldType f37974a;
    public static final FieldType dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FieldType f37975e;
    public static final FieldType eF;
    public static final FieldType eTf;
    public static final FieldType eWT;
    public static final FieldType fcU;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FieldType f37976g;
    public static final FieldType ijL;
    public static final FieldType jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FieldType f37977k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final FieldType f37978m;
    public static final FieldType mYa;
    public static final FieldType n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final FieldType f37979o;
    public static final FieldType ofS;
    public static final FieldType p5;
    public static final FieldType pJg;
    public static final FieldType piY;
    public static final FieldType qm;
    public static final FieldType ul;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final FieldType f37980v;
    public static final FieldType xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final FieldType f37981z;
    private final Class J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Collection f37982O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JavaType f37983n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f37984r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f37985t;

    enum Collection {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f37991n;

        public boolean n() {
            return this.f37991n;
        }

        Collection(boolean z2) {
            this.f37991n = z2;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37986n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[JavaType.values().length];
            rl = iArr;
            try {
                iArr[JavaType.f38058e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[JavaType.f38055T.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rl[JavaType.E2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Collection.values().length];
            f37986n = iArr2;
            try {
                iArr2[Collection.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37986n[Collection.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37986n[Collection.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        Collection collection = Collection.SCALAR;
        JavaType javaType = JavaType.f38054S;
        FieldType fieldType = new FieldType("DOUBLE", 0, 0, collection, javaType);
        f37979o = fieldType;
        JavaType javaType2 = JavaType.f38057Z;
        FieldType fieldType2 = new FieldType("FLOAT", 1, 1, collection, javaType2);
        f37973Z = fieldType2;
        JavaType javaType3 = JavaType.f38060o;
        FieldType fieldType3 = new FieldType("INT64", 2, 2, collection, javaType3);
        f37968S = fieldType3;
        FieldType fieldType4 = new FieldType("UINT64", 3, 3, collection, javaType3);
        f37976g = fieldType4;
        JavaType javaType4 = JavaType.f38061r;
        FieldType fieldType5 = new FieldType("INT32", 4, 4, collection, javaType4);
        E2 = fieldType5;
        FieldType fieldType6 = new FieldType("FIXED64", 5, 5, collection, javaType3);
        f37975e = fieldType6;
        FieldType fieldType7 = new FieldType("FIXED32", 6, 6, collection, javaType4);
        f37971X = fieldType7;
        JavaType javaType5 = JavaType.f38059g;
        FieldType fieldType8 = new FieldType("BOOL", 7, 7, collection, javaType5);
        f37969T = fieldType8;
        JavaType javaType6 = JavaType.E2;
        FieldType fieldType9 = new FieldType("STRING", 8, 8, collection, javaType6);
        f37967N = fieldType9;
        JavaType javaType7 = JavaType.f38055T;
        FieldType fieldType10 = new FieldType("MESSAGE", 9, 9, collection, javaType7);
        f37980v = fieldType10;
        JavaType javaType8 = JavaType.f38058e;
        FieldType fieldType11 = new FieldType("BYTES", 10, 10, collection, javaType8);
        Xw = fieldType11;
        FieldType fieldType12 = new FieldType("UINT32", 11, 11, collection, javaType4);
        jB = fieldType12;
        JavaType javaType9 = JavaType.f38056X;
        FieldType fieldType13 = new FieldType("ENUM", 12, 12, collection, javaType9);
        f37970U = fieldType13;
        FieldType fieldType14 = new FieldType("SFIXED32", 13, 13, collection, javaType4);
        P5 = fieldType14;
        FieldType fieldType15 = new FieldType("SFIXED64", 14, 14, collection, javaType3);
        M7 = fieldType15;
        FieldType fieldType16 = new FieldType("SINT32", 15, 15, collection, javaType4);
        p5 = fieldType16;
        FieldType fieldType17 = new FieldType("SINT64", 16, 16, collection, javaType3);
        eF = fieldType17;
        FieldType fieldType18 = new FieldType("GROUP", 17, 17, collection, javaType7);
        f37960E = fieldType18;
        Collection collection2 = Collection.VECTOR;
        FieldType fieldType19 = new FieldType("DOUBLE_LIST", 18, 18, collection2, javaType);
        f37966M = fieldType19;
        FieldType fieldType20 = new FieldType("FLOAT_LIST", 19, 19, collection2, javaType2);
        f37961FX = fieldType20;
        FieldType fieldType21 = new FieldType("INT64_LIST", 20, 20, collection2, javaType3);
        f37957B = fieldType21;
        FieldType fieldType22 = new FieldType("UINT64_LIST", 21, 21, collection2, javaType3);
        f37965J = fieldType22;
        FieldType fieldType23 = new FieldType("INT32_LIST", 22, 22, collection2, javaType4);
        f37959D = fieldType23;
        FieldType fieldType24 = new FieldType("FIXED64_LIST", 23, 23, collection2, javaType3);
        f37974a = fieldType24;
        FieldType fieldType25 = new FieldType("FIXED32_LIST", 24, 24, collection2, javaType4);
        f37964I = fieldType25;
        FieldType fieldType26 = new FieldType("BOOL_LIST", 25, 25, collection2, javaType5);
        f37963GR = fieldType26;
        FieldType fieldType27 = new FieldType("STRING_LIST", 26, 26, collection2, javaType6);
        Nxk = fieldType27;
        FieldType fieldType28 = new FieldType("MESSAGE_LIST", 27, 27, collection2, javaType7);
        f37972Y = fieldType28;
        FieldType fieldType29 = new FieldType("BYTES_LIST", 28, 28, collection2, javaType8);
        f37977k = fieldType29;
        FieldType fieldType30 = new FieldType("UINT32_LIST", 29, 29, collection2, javaType4);
        dR0 = fieldType30;
        FieldType fieldType31 = new FieldType("ENUM_LIST", 30, 30, collection2, javaType9);
        f37981z = fieldType31;
        FieldType fieldType32 = new FieldType("SFIXED32_LIST", 31, 31, collection2, javaType4);
        piY = fieldType32;
        FieldType fieldType33 = new FieldType("SFIXED64_LIST", 32, 32, collection2, javaType3);
        ijL = fieldType33;
        FieldType fieldType34 = new FieldType("SINT32_LIST", 33, 33, collection2, javaType4);
        f37978m = fieldType34;
        FieldType fieldType35 = new FieldType("SINT64_LIST", 34, 34, collection2, javaType3);
        eTf = fieldType35;
        Collection collection3 = Collection.PACKED_VECTOR;
        FieldType fieldType36 = new FieldType("DOUBLE_LIST_PACKED", 35, 35, collection3, javaType);
        xg = fieldType36;
        FieldType fieldType37 = new FieldType("FLOAT_LIST_PACKED", 36, 36, collection3, javaType2);
        pJg = fieldType37;
        FieldType fieldType38 = new FieldType("INT64_LIST_PACKED", 37, 37, collection3, javaType3);
        ofS = fieldType38;
        FieldType fieldType39 = new FieldType("UINT64_LIST_PACKED", 38, 38, collection3, javaType3);
        f37958C = fieldType39;
        FieldType fieldType40 = new FieldType("INT32_LIST_PACKED", 39, 39, collection3, javaType4);
        Mx = fieldType40;
        FieldType fieldType41 = new FieldType("FIXED64_LIST_PACKED", 40, 40, collection3, javaType3);
        f37962G7 = fieldType41;
        FieldType fieldType42 = new FieldType("FIXED32_LIST_PACKED", 41, 41, collection3, javaType4);
        fcU = fieldType42;
        FieldType fieldType43 = new FieldType("BOOL_LIST_PACKED", 42, 42, collection3, javaType5);
        eWT = fieldType43;
        FieldType fieldType44 = new FieldType("UINT32_LIST_PACKED", 43, 43, collection3, javaType4);
        ul = fieldType44;
        FieldType fieldType45 = new FieldType("ENUM_LIST_PACKED", 44, 44, collection3, javaType9);
        n1 = fieldType45;
        FieldType fieldType46 = new FieldType("SFIXED32_LIST_PACKED", 45, 45, collection3, javaType4);
        Jk = fieldType46;
        FieldType fieldType47 = new FieldType("SFIXED64_LIST_PACKED", 46, 46, collection3, javaType3);
        Rl = fieldType47;
        FieldType fieldType48 = new FieldType("SINT32_LIST_PACKED", 47, 47, collection3, javaType4);
        qm = fieldType48;
        FieldType fieldType49 = new FieldType("SINT64_LIST_PACKED", 48, 48, collection3, javaType3);
        mYa = fieldType49;
        FieldType fieldType50 = new FieldType("GROUP_LIST", 49, 49, collection2, javaType7);
        Org = fieldType50;
        FieldType fieldType51 = new FieldType("MAP", 50, 50, Collection.MAP, JavaType.J2);
        HV = fieldType51;
        EWS = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18, fieldType19, fieldType20, fieldType21, fieldType22, fieldType23, fieldType24, fieldType25, fieldType26, fieldType27, fieldType28, fieldType29, fieldType30, fieldType31, fieldType32, fieldType33, fieldType34, fieldType35, fieldType36, fieldType37, fieldType38, fieldType39, fieldType40, fieldType41, fieldType42, fieldType43, fieldType44, fieldType45, fieldType46, fieldType47, fieldType48, fieldType49, fieldType50, fieldType51};
        Po6 = new Type[0];
        FieldType[] fieldTypeArrValues = values();
        GD = new FieldType[fieldTypeArrValues.length];
        for (FieldType fieldType52 : fieldTypeArrValues) {
            GD[fieldType52.f37985t] = fieldType52;
        }
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) EWS.clone();
    }

    public int n() {
        return this.f37985t;
    }

    public boolean rl() {
        return this.f37982O.n();
    }

    public boolean t() {
        return this.f37982O == Collection.MAP;
    }

    private FieldType(String str, int i2, int i3, Collection collection, JavaType javaType) {
        int i5;
        this.f37985t = i3;
        this.f37982O = collection;
        this.f37983n = javaType;
        int i7 = AnonymousClass1.f37986n[collection.ordinal()];
        if (i7 != 1 && i7 != 2) {
            this.J2 = null;
        } else {
            this.J2 = javaType.n();
        }
        this.f37984r = (collection != Collection.SCALAR || (i5 = AnonymousClass1.rl[javaType.ordinal()]) == 1 || i5 == 2 || i5 == 3) ? false : true;
    }
}
