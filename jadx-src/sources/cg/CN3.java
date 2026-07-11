package cg;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 extends g9s implements pO {
    private static final CN3 DEFAULT_INSTANCE;
    public static final int DELAYEDCOUNTTIMESTAMP_FIELD_NUMBER = 5;
    public static final int DOWNLOADCOUNT_FIELD_NUMBER = 1;
    public static final int DOWNLOADDELAYEDCOUNT_FIELD_NUMBER = 2;
    private static volatile KH PARSER = null;
    public static final int TOKENCOUNT_FIELD_NUMBER = 3;
    public static final int TOKENDELAYEDCOUNT_FIELD_NUMBER = 4;
    private long delayedCountTimestamp_;
    private long downloadCount_;
    private long downloadDelayedCount_;
    private long tokenCount_;
    private long tokenDelayedCount_;

    public static final class n extends g9s.n implements pO {
        private n() {
            super(CN3.DEFAULT_INSTANCE);
        }

        public n az(long j2) {
            copyOnWrite();
            ((CN3) this.instance).ViF(j2);
            return this;
        }

        public n gh(long j2) {
            copyOnWrite();
            ((CN3) this.instance).WPU(j2);
            return this;
        }

        public n mUb(long j2) {
            copyOnWrite();
            ((CN3) this.instance).S(j2);
            return this;
        }

        public n qie(long j2) {
            copyOnWrite();
            ((CN3) this.instance).aYN(j2);
            return this;
        }

        public n xMQ(long j2) {
            copyOnWrite();
            ((CN3) this.instance).XQ(j2);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f43762n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f43762n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43762n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43762n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43762n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43762n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43762n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43762n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CN3 cn3 = new CN3();
        DEFAULT_INSTANCE = cn3;
        g9s.registerDefaultInstance(CN3.class, cn3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(long j2) {
        this.downloadCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ViF(long j2) {
        this.tokenDelayedCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void WPU(long j2) {
        this.downloadDelayedCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ(long j2) {
        this.delayedCountTimestamp_ = j2;
    }

    public static n Z() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aYN(long j2) {
        this.tokenCount_ = j2;
    }

    public static CN3 ty() {
        return DEFAULT_INSTANCE;
    }

    public long HI() {
        return this.delayedCountTimestamp_;
    }

    public long Ik() {
        return this.downloadDelayedCount_;
    }

    public long ck() {
        return this.downloadCount_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        switch (j.f43762n[fux.ordinal()]) {
            case 1:
                return new CN3();
            case 2:
                return new n();
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002", new Object[]{"downloadCount_", "downloadDelayedCount_", "tokenCount_", "tokenDelayedCount_", "delayedCountTimestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (CN3.class) {
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

    public long o() {
        return this.tokenDelayedCount_;
    }

    public long r() {
        return this.tokenCount_;
    }

    private CN3() {
    }
}
