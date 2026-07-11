package uB;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;

/* JADX INFO: renamed from: uB.Dsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2392Dsr extends g9s implements pO {
    private static final C2392Dsr DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile KH PARSER;
    private nKK.Dsr fieldPaths_ = g9s.emptyProtobufList();

    /* JADX INFO: renamed from: uB.Dsr$n */
    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(C2392Dsr.DEFAULT_INSTANCE);
        }

        public n xMQ(String str) {
            copyOnWrite();
            ((C2392Dsr) this.instance).mUb(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: uB.Dsr$j */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74158n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74158n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74158n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74158n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74158n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74158n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74158n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74158n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C2392Dsr c2392Dsr = new C2392Dsr();
        DEFAULT_INSTANCE = c2392Dsr;
        g9s.registerDefaultInstance(C2392Dsr.class, c2392Dsr);
    }

    public static n HI() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    private void gh() {
        nKK.Dsr dsr = this.fieldPaths_;
        if (dsr.isModifiable()) {
            return;
        }
        this.fieldPaths_ = g9s.mutableCopy(dsr);
    }

    public static C2392Dsr qie() {
        return DEFAULT_INSTANCE;
    }

    public String az(int i2) {
        return (String) this.fieldPaths_.get(i2);
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74158n[fux.ordinal()]) {
            case 1:
                return new C2392Dsr();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (C2392Dsr.class) {
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

    public int ty() {
        return this.fieldPaths_.size();
    }

    private C2392Dsr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mUb(String str) {
        str.getClass();
        gh();
        this.fieldPaths_.add(str);
    }
}
