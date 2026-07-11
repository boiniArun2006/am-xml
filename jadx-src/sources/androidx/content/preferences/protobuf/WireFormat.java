package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class WireFormat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f38206n = t(1, 3);
    static final int rl = t(1, 4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f38207t = t(2, 0);
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
    public static class FieldType {
        public static final FieldType E2;
        public static final FieldType J2;
        public static final FieldType M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final FieldType f38209N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final FieldType f38210O;
        public static final FieldType P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final FieldType f38211S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final FieldType f38212T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final FieldType f38213U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final FieldType f38214X;
        public static final FieldType Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final FieldType f38215Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldType f38216e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldType f38217g;
        public static final FieldType jB;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final FieldType f38218o;
        private static final /* synthetic */ FieldType[] p5;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final FieldType f38219r;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final FieldType f38220v;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final JavaType f38221n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f38222t;

        /* synthetic */ FieldType(String str, int i2, JavaType javaType, int i3, AnonymousClass1 anonymousClass1) {
            this(str, i2, javaType, i3);
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f38210O = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            J2 = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f38219r = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f38218o = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            f38215Z = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            f38211S = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            f38217g = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            E2 = fieldType8;
            FieldType fieldType9 = new FieldType("STRING", 8, JavaType.STRING, 2) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.1
                {
                    AnonymousClass1 anonymousClass1 = null;
                }
            };
            f38216e = fieldType9;
            JavaType javaType3 = JavaType.MESSAGE;
            FieldType fieldType10 = new FieldType("GROUP", 9, javaType3, 3) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.2
                {
                    AnonymousClass1 anonymousClass1 = null;
                }
            };
            f38214X = fieldType10;
            int i2 = 2;
            FieldType fieldType11 = new FieldType("MESSAGE", 10, javaType3, i2) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.3
                {
                    AnonymousClass1 anonymousClass1 = null;
                }
            };
            f38212T = fieldType11;
            FieldType fieldType12 = new FieldType("BYTES", 11, JavaType.BYTE_STRING, i2) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.4
                {
                    AnonymousClass1 anonymousClass1 = null;
                }
            };
            f38209N = fieldType12;
            FieldType fieldType13 = new FieldType("UINT32", 12, javaType2, 0);
            f38220v = fieldType13;
            FieldType fieldType14 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            Xw = fieldType14;
            FieldType fieldType15 = new FieldType("SFIXED32", 14, javaType2, 5);
            jB = fieldType15;
            FieldType fieldType16 = new FieldType("SFIXED64", 15, javaType, 1);
            f38213U = fieldType16;
            FieldType fieldType17 = new FieldType("SINT32", 16, javaType2, 0);
            P5 = fieldType17;
            FieldType fieldType18 = new FieldType("SINT64", 17, javaType, 0);
            M7 = fieldType18;
            p5 = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18};
        }

        private FieldType(String str, int i2, JavaType javaType, int i3) {
            this.f38221n = javaType;
            this.f38222t = i3;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) p5.clone();
        }

        public JavaType n() {
            return this.f38221n;
        }

        public int rl() {
            return this.f38222t;
        }
    }

    enum Utf8Validation {
        LOOSE { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.1
        },
        STRICT { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.2
        },
        LAZY { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.3
        };

        /* synthetic */ Utf8Validation(AnonymousClass1 anonymousClass1) {
            this();
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f38208n;

        static {
            int[] iArr = new int[FieldType.values().length];
            f38208n = iArr;
            try {
                iArr[FieldType.f38210O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38208n[FieldType.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38208n[FieldType.f38219r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38208n[FieldType.f38218o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38208n[FieldType.f38215Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38208n[FieldType.f38211S.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38208n[FieldType.f38217g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38208n[FieldType.E2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38208n[FieldType.f38209N.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38208n[FieldType.f38220v.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38208n[FieldType.jB.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38208n[FieldType.f38213U.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f38208n[FieldType.P5.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f38208n[FieldType.M7.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f38208n[FieldType.f38216e.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f38208n[FieldType.f38214X.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f38208n[FieldType.f38212T.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f38208n[FieldType.Xw.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.f37740t),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f38231n;

        JavaType(Object obj) {
            this.f38231n = obj;
        }
    }
}
