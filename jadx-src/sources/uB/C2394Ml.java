package uB;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: renamed from: uB.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C2394Ml extends g9s implements pO {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final C2394Ml DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile KH PARSER;
    private int bitField0_;
    private C2400w6 bits_;
    private int hashCount_;

    /* JADX INFO: renamed from: uB.Ml$n */
    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(C2394Ml.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: uB.Ml$j */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74160n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74160n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74160n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74160n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74160n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74160n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74160n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74160n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C2394Ml c2394Ml = new C2394Ml();
        DEFAULT_INSTANCE = c2394Ml;
        g9s.registerDefaultInstance(C2394Ml.class, c2394Ml);
    }

    public static C2394Ml mUb() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74160n[fux.ordinal()]) {
            case 1:
                return new C2394Ml();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (C2394Ml.class) {
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

    public int gh() {
        return this.hashCount_;
    }

    public boolean qie() {
        return (this.bitField0_ & 1) != 0;
    }

    public C2400w6 xMQ() {
        C2400w6 c2400w6 = this.bits_;
        return c2400w6 == null ? C2400w6.mUb() : c2400w6;
    }

    private C2394Ml() {
    }
}
