package hoV;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import uB.C2395Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j extends g9s implements pO {
    private static final j DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile KH PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(C0958j c0958j) {
            this();
        }

        private n() {
            super(j.DEFAULT_INSTANCE);
        }

        public n gh(hoV.n nVar) {
            copyOnWrite();
            ((j) this.instance).S(nVar);
            return this;
        }

        public n mUb(boolean z2) {
            copyOnWrite();
            ((j) this.instance).XQ(z2);
            return this;
        }

        public n qie(Ml ml) {
            copyOnWrite();
            ((j) this.instance).WPU(ml);
            return this;
        }

        public n xMQ(C2395Wre c2395Wre) {
            copyOnWrite();
            ((j) this.instance).Z(c2395Wre);
            return this;
        }
    }

    public enum w6 {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f67991n;

        public static w6 rl(int i2) {
            if (i2 == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i2 == 1) {
                return NO_DOCUMENT;
            }
            if (i2 == 2) {
                return DOCUMENT;
            }
            if (i2 != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }

        w6(int i2) {
            this.f67991n = i2;
        }
    }

    /* JADX INFO: renamed from: hoV.j$j, reason: collision with other inner class name */
    static /* synthetic */ class C0958j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67986n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f67986n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67986n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67986n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67986n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67986n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67986n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67986n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        g9s.registerDefaultInstance(j.class, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ(boolean z2) {
        this.hasCommittedMutations_ = z2;
    }

    public static j o(byte[] bArr) {
        return (j) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n r() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public boolean HI() {
        return this.hasCommittedMutations_;
    }

    public Ml Ik() {
        return this.documentTypeCase_ == 3 ? (Ml) this.documentType_ : Ml.gh();
    }

    public C2395Wre az() {
        return this.documentTypeCase_ == 2 ? (C2395Wre) this.documentType_ : C2395Wre.qie();
    }

    public hoV.n ck() {
        return this.documentTypeCase_ == 1 ? (hoV.n) this.documentType_ : hoV.n.gh();
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        C0958j c0958j = null;
        switch (C0958j.f67986n[fux.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new n(c0958j);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", hoV.n.class, C2395Wre.class, Ml.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (j.class) {
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

    public w6 ty() {
        return w6.rl(this.documentTypeCase_);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(hoV.n nVar) {
        nVar.getClass();
        this.documentType_ = nVar;
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void WPU(Ml ml) {
        ml.getClass();
        this.documentType_ = ml;
        this.documentTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(C2395Wre c2395Wre) {
        c2395Wre.getClass();
        this.documentType_ = c2395Wre;
        this.documentTypeCase_ = 2;
    }
}
