package uB;

import com.google.protobuf.KH;
import com.google.protobuf.RGN;
import com.google.protobuf.g9s;
import com.google.protobuf.gnv;
import com.google.protobuf.pO;
import oFA.j;
import uB.C2398j;
import uB.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class s4 extends g9s implements pO {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final s4 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile KH PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(s4.DEFAULT_INSTANCE);
        }

        public n HI(long j2) {
            copyOnWrite();
            ((s4) this.instance).v(j2);
            return this;
        }

        public n Ik(eO eOVar) {
            copyOnWrite();
            ((s4) this.instance).rV9(eOVar);
            return this;
        }

        public n XQ(RGN.n nVar) {
            copyOnWrite();
            ((s4) this.instance).U((RGN) nVar.build());
            return this;
        }

        public n Z(String str) {
            copyOnWrite();
            ((s4) this.instance).jB(str);
            return this;
        }

        public n az(double d2) {
            copyOnWrite();
            ((s4) this.instance).s7N(d2);
            return this;
        }

        public n ck(eO.n nVar) {
            copyOnWrite();
            ((s4) this.instance).rV9((eO) nVar.build());
            return this;
        }

        public n gh(boolean z2) {
            copyOnWrite();
            ((s4) this.instance).N(z2);
            return this;
        }

        public n mUb(C2398j c2398j) {
            copyOnWrite();
            ((s4) this.instance).T(c2398j);
            return this;
        }

        public n o(String str) {
            copyOnWrite();
            ((s4) this.instance).Xw(str);
            return this;
        }

        public n qie(com.google.protobuf.C c2) {
            copyOnWrite();
            ((s4) this.instance).nHg(c2);
            return this;
        }

        public n r(gnv gnvVar) {
            copyOnWrite();
            ((s4) this.instance).bzg(gnvVar);
            return this;
        }

        public n ty(j.n nVar) {
            copyOnWrite();
            ((s4) this.instance).wTp((oFA.j) nVar.build());
            return this;
        }

        public n xMQ(C2398j.n nVar) {
            copyOnWrite();
            ((s4) this.instance).T((C2398j) nVar.build());
            return this;
        }
    }

    public enum w6 {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74252n;

        public static w6 rl(int i2) {
            if (i2 == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (i2 == 1) {
                return BOOLEAN_VALUE;
            }
            if (i2 == 2) {
                return INTEGER_VALUE;
            }
            if (i2 == 3) {
                return DOUBLE_VALUE;
            }
            if (i2 == 5) {
                return REFERENCE_VALUE;
            }
            if (i2 == 6) {
                return MAP_VALUE;
            }
            if (i2 == 17) {
                return STRING_VALUE;
            }
            if (i2 == 18) {
                return BYTES_VALUE;
            }
            switch (i2) {
                case 8:
                    return GEO_POINT_VALUE;
                case 9:
                    return ARRAY_VALUE;
                case 10:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    return null;
            }
        }

        w6(int i2) {
            this.f74252n = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z2) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s7N(double d2) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j2) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j2);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74240n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74240n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74240n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74240n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74240n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74240n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74240n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74240n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        s4 s4Var = new s4();
        DEFAULT_INSTANCE = s4Var;
        g9s.registerDefaultInstance(s4.class, s4Var);
    }

    public static s4 WPU() {
        return DEFAULT_INSTANCE;
    }

    public static n X() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public w6 E2() {
        return w6.rl(this.valueTypeCase_);
    }

    public com.google.protobuf.C S() {
        return this.valueTypeCase_ == 18 ? (com.google.protobuf.C) this.valueType_ : com.google.protobuf.C.EMPTY;
    }

    public oFA.j ViF() {
        return this.valueTypeCase_ == 8 ? (oFA.j) this.valueType_ : oFA.j.gh();
    }

    public boolean XQ() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public C2398j Z() {
        return this.valueTypeCase_ == 9 ? (C2398j) this.valueType_ : C2398j.HI();
    }

    public double aYN() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74240n[fux.ordinal()]) {
            case 1:
                return new s4();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", eO.class, oFA.j.class, C2398j.class, RGN.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (s4.class) {
                    try {
                        w6Var = PARSER;
                        if (w6Var == null) {
                            w6Var = new g9s.w6(DEFAULT_INSTANCE);
                            PARSER = w6Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return w6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public boolean e() {
        return this.valueTypeCase_ == 11;
    }

    public RGN fD() {
        return this.valueTypeCase_ == 10 ? (RGN) this.valueType_ : RGN.getDefaultInstance();
    }

    public eO g() {
        return this.valueTypeCase_ == 6 ? (eO) this.valueType_ : eO.mUb();
    }

    public String iF() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public long nY() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public String te() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    private s4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(C2398j c2398j) {
        c2398j.getClass();
        this.valueType_ = c2398j;
        this.valueTypeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(RGN rgn) {
        rgn.getClass();
        this.valueType_ = rgn;
        this.valueTypeCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xw(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bzg(gnv gnvVar) {
        this.valueType_ = Integer.valueOf(gnvVar.getNumber());
        this.valueTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jB(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nHg(com.google.protobuf.C c2) {
        c2.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rV9(eO eOVar) {
        eOVar.getClass();
        this.valueType_ = eOVar;
        this.valueTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wTp(oFA.j jVar) {
        jVar.getClass();
        this.valueType_ = jVar;
        this.valueTypeCase_ = 8;
    }
}
