package uB;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import java.util.List;
import uB.C2398j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C extends g9s implements pO {
    private static final C DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile KH PARSER;
    private String document_ = "";
    private nKK.Dsr fieldTransforms_ = g9s.emptyProtobufList();

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(C.DEFAULT_INSTANCE);
        }
    }

    public static final class w6 extends g9s implements pO {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final w6 DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile KH PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(w6.DEFAULT_INSTANCE);
            }

            public j az(n nVar) {
                copyOnWrite();
                ((w6) this.instance).ViF(nVar);
                return this;
            }

            public j gh(s4 s4Var) {
                copyOnWrite();
                ((w6) this.instance).WPU(s4Var);
                return this;
            }

            public j mUb(String str) {
                copyOnWrite();
                ((w6) this.instance).S(str);
                return this;
            }

            public j qie(C2398j.n nVar) {
                copyOnWrite();
                ((w6) this.instance).aYN((C2398j) nVar.build());
                return this;
            }

            public j xMQ(C2398j.n nVar) {
                copyOnWrite();
                ((w6) this.instance).XQ((C2398j) nVar.build());
                return this;
            }
        }

        public enum n implements nKK.w6 {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final nKK.Ml f74146r = new j();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f74148n;

            class j implements nKK.Ml {
                j() {
                }

                @Override // com.google.protobuf.nKK.Ml
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public n findValueByNumber(int i2) {
                    return n.rl(i2);
                }
            }

            public static n rl(int i2) {
                if (i2 == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i2 != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            @Override // com.google.protobuf.nKK.w6
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f74148n;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            n(int i2) {
                this.f74148n = i2;
            }
        }

        /* JADX INFO: renamed from: uB.C$w6$w6, reason: collision with other inner class name */
        public enum EnumC1216w6 {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f74156n;

            public static EnumC1216w6 rl(int i2) {
                if (i2 == 0) {
                    return TRANSFORMTYPE_NOT_SET;
                }
                switch (i2) {
                    case 2:
                        return SET_TO_SERVER_VALUE;
                    case 3:
                        return INCREMENT;
                    case 4:
                        return MAXIMUM;
                    case 5:
                        return MINIMUM;
                    case 6:
                        return APPEND_MISSING_ELEMENTS;
                    case 7:
                        return REMOVE_ALL_FROM_ARRAY;
                    default:
                        return null;
                }
            }

            EnumC1216w6(int i2) {
                this.f74156n = i2;
            }
        }

        static {
            w6 w6Var = new w6();
            DEFAULT_INSTANCE = w6Var;
            g9s.registerDefaultInstance(w6.class, w6Var);
        }

        public static j Z() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        public String HI() {
            return this.fieldPath_;
        }

        public C2398j Ik() {
            return this.transformTypeCase_ == 7 ? (C2398j) this.transformType_ : C2398j.HI();
        }

        public s4 ck() {
            return this.transformTypeCase_ == 3 ? (s4) this.transformType_ : s4.WPU();
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74143n[fux.ordinal()]) {
                case 1:
                    return new w6();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", s4.class, s4.class, s4.class, C2398j.class, C2398j.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    KH kh = PARSER;
                    if (kh != null) {
                        return kh;
                    }
                    synchronized (w6.class) {
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

        public EnumC1216w6 o() {
            return EnumC1216w6.rl(this.transformTypeCase_);
        }

        public n r() {
            if (this.transformTypeCase_ != 2) {
                return n.SERVER_VALUE_UNSPECIFIED;
            }
            n nVarRl = n.rl(((Integer) this.transformType_).intValue());
            return nVarRl == null ? n.UNRECOGNIZED : nVarRl;
        }

        public C2398j ty() {
            return this.transformTypeCase_ == 6 ? (C2398j) this.transformType_ : C2398j.HI();
        }

        private w6() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ViF(n nVar) {
            this.transformType_ = Integer.valueOf(nVar.getNumber());
            this.transformTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void WPU(s4 s4Var) {
            s4Var.getClass();
            this.transformType_ = s4Var;
            this.transformTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void XQ(C2398j c2398j) {
            c2398j.getClass();
            this.transformType_ = c2398j;
            this.transformTypeCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void aYN(C2398j c2398j) {
            c2398j.getClass();
            this.transformType_ = c2398j;
            this.transformTypeCase_ = 7;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74143n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74143n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74143n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74143n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74143n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74143n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74143n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74143n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C c2 = new C();
        DEFAULT_INSTANCE = c2;
        g9s.registerDefaultInstance(C.class, c2);
    }

    public static C xMQ() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74143n[fux.ordinal()]) {
            case 1:
                return new C();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", w6.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (C.class) {
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

    public List mUb() {
        return this.fieldTransforms_;
    }

    private C() {
    }
}
