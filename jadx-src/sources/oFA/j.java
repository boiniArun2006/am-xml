package oFA;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j extends g9s implements pO {
    private static final j DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile KH PARSER;
    private double latitude_;
    private double longitude_;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(C1079j c1079j) {
            this();
        }

        private n() {
            super(j.DEFAULT_INSTANCE);
        }

        public n mUb(double d2) {
            copyOnWrite();
            ((j) this.instance).ck(d2);
            return this;
        }

        public n xMQ(double d2) {
            copyOnWrite();
            ((j) this.instance).HI(d2);
            return this;
        }
    }

    /* JADX INFO: renamed from: oFA.j$j, reason: collision with other inner class name */
    static /* synthetic */ class C1079j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71371n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71371n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71371n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71371n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71371n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71371n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71371n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71371n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
    public void HI(double d2) {
        this.latitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(double d2) {
        this.longitude_ = d2;
    }

    public static j gh() {
        return DEFAULT_INSTANCE;
    }

    public static n ty() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public double az() {
        return this.longitude_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        C1079j c1079j = null;
        switch (C1079j.f71371n[fux.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new n(c1079j);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
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

    public double qie() {
        return this.latitude_;
    }

    private j() {
    }
}
