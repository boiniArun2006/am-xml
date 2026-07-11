package uB;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Xo extends g9s implements pO {
    private static final Xo DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile KH PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Xo.DEFAULT_INSTANCE);
        }
    }

    public enum w6 {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74221n;

        public static w6 rl(int i2) {
            if (i2 == 0) {
                return RESPONSETYPE_NOT_SET;
            }
            if (i2 == 2) {
                return TARGET_CHANGE;
            }
            if (i2 == 3) {
                return DOCUMENT_CHANGE;
            }
            if (i2 == 4) {
                return DOCUMENT_DELETE;
            }
            if (i2 == 5) {
                return FILTER;
            }
            if (i2 != 6) {
                return null;
            }
            return DOCUMENT_REMOVE;
        }

        w6(int i2) {
            this.f74221n = i2;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74214n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74214n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74214n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74214n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74214n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74214n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74214n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74214n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Xo xo = new Xo();
        DEFAULT_INSTANCE = xo;
        g9s.registerDefaultInstance(Xo.class, xo);
    }

    public static Xo xMQ() {
        return DEFAULT_INSTANCE;
    }

    public C2396c HI() {
        return this.responseTypeCase_ == 2 ? (C2396c) this.responseType_ : C2396c.mUb();
    }

    public o az() {
        return this.responseTypeCase_ == 5 ? (o) this.responseType_ : o.mUb();
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74214n[fux.ordinal()]) {
            case 1:
                return new Xo();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", C2396c.class, C2391CN3.class, C2397fuX.class, o.class, aC.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (Xo.class) {
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

    public C2397fuX gh() {
        return this.responseTypeCase_ == 4 ? (C2397fuX) this.responseType_ : C2397fuX.xMQ();
    }

    public C2391CN3 mUb() {
        return this.responseTypeCase_ == 3 ? (C2391CN3) this.responseType_ : C2391CN3.xMQ();
    }

    public aC qie() {
        return this.responseTypeCase_ == 6 ? (aC) this.responseType_ : aC.xMQ();
    }

    public w6 ty() {
        return w6.rl(this.responseTypeCase_);
    }

    private Xo() {
    }
}
