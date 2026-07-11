package Dk;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 extends g9s implements pO {
    private static final w6 DEFAULT_INSTANCE;
    public static final int EXPIRATIONTIMESTAMP_FIELD_NUMBER = 2;
    private static volatile KH PARSER = null;
    public static final int SCOPE_FIELD_NUMBER = 3;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long expirationTimestamp_;
    private int scope_;
    private String value_ = "";

    public static final class n extends g9s.n implements pO {
        private n() {
            super(w6.DEFAULT_INSTANCE);
        }

        public n gh(String str) {
            copyOnWrite();
            ((w6) this.instance).o(str);
            return this;
        }

        public n mUb(int i2) {
            copyOnWrite();
            ((w6) this.instance).r(i2);
            return this;
        }

        public n xMQ(long j2) {
            copyOnWrite();
            ((w6) this.instance).Ik(j2);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f1922n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f1922n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1922n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1922n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1922n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1922n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1922n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1922n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        w6 w6Var = new w6();
        DEFAULT_INSTANCE = w6Var;
        g9s.registerDefaultInstance(w6.class, w6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(long j2) {
        this.expirationTimestamp_ = j2;
    }

    public static n ck() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static w6 qie() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i2) {
        this.bitField0_ |= 1;
        this.scope_ = i2;
    }

    public String HI() {
        return this.value_;
    }

    public long az() {
        return this.expirationTimestamp_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        switch (j.f1922n[fux.ordinal()]) {
            case 1:
                return new w6();
            case 2:
                return new n();
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003င\u0000", new Object[]{"bitField0_", "value_", "expirationTimestamp_", "scope_"});
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

    public int ty() {
        return this.scope_;
    }

    private w6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        str.getClass();
        this.value_ = str;
    }
}
