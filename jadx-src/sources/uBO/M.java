package uBO;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.rv6;
import com.google.crypto.tink.shaded.protobuf.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class M extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
    private static final M DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    public static final class n extends Q.j implements vd {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(M.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.rv6.j
        public /* bridge */ /* synthetic */ rv6 buildPartial() {
            return super.nr();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.vd
        public /* bridge */ /* synthetic */ rv6 getDefaultInstanceForType() {
            return super.xMQ();
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74273n;

        static {
            int[] iArr = new int[Q.Ml.values().length];
            f74273n = iArr;
            try {
                iArr[Q.Ml.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74273n[Q.Ml.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74273n[Q.Ml.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74273n[Q.Ml.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74273n[Q.Ml.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74273n[Q.Ml.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74273n[Q.Ml.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        M m2 = new M();
        DEFAULT_INSTANCE = m2;
        com.google.crypto.tink.shaded.protobuf.Q.s7N(M.class, m2);
    }

    public static M Xw() {
        return DEFAULT_INSTANCE;
    }

    public static M jB(com.google.crypto.tink.shaded.protobuf.fuX fux, com.google.crypto.tink.shaded.protobuf.Xo xo) {
        return (M) com.google.crypto.tink.shaded.protobuf.Q.E2(DEFAULT_INSTANCE, fux, xo);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
        P nVar;
        j jVar = null;
        switch (j.f74273n[ml.ordinal()]) {
            case 1:
                return new M();
            case 2:
                return new n(jVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                P p2 = PARSER;
                if (p2 != null) {
                    return p2;
                }
                synchronized (M.class) {
                    try {
                        nVar = PARSER;
                        if (nVar == null) {
                            nVar = new Q.n(DEFAULT_INSTANCE);
                            PARSER = nVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return nVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private M() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vd
    public /* bridge */ /* synthetic */ rv6 getDefaultInstanceForType() {
        return super.Ik();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rv6
    public /* bridge */ /* synthetic */ rv6.j newBuilderForType() {
        return super.te();
    }
}
