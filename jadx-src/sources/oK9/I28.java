package oK9;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 extends g9s implements pO {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final I28 DEFAULT_INSTANCE;
    private static volatile KH PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(I28.DEFAULT_INSTANCE);
        }

        public n gh(long j2) {
            copyOnWrite();
            ((I28) this.instance).HI(j2);
            return this;
        }

        public n mUb(long j2) {
            copyOnWrite();
            ((I28) this.instance).ty(j2);
            return this;
        }

        public n xMQ(long j2) {
            copyOnWrite();
            ((I28) this.instance).az(j2);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71375n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71375n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71375n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71375n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71375n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71375n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71375n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71375n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        I28 i28 = new I28();
        DEFAULT_INSTANCE = i28;
        g9s.registerDefaultInstance(I28.class, i28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HI(long j2) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az(long j2) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j2;
    }

    public static n qie() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ty(long j2) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j2;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f71375n[fux.ordinal()]) {
            case 1:
                return new I28();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (I28.class) {
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

    private I28() {
    }
}
