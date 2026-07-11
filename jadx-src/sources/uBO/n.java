package uBO;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.rv6;
import com.google.crypto.tink.shaded.protobuf.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
    private static final n DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile P PARSER;
    private int keySize_;
    private w6 params_;

    /* JADX INFO: renamed from: uBO.n$n, reason: collision with other inner class name */
    public static final class C1219n extends Q.j implements vd {
        /* synthetic */ C1219n(j jVar) {
            this();
        }

        private C1219n() {
            super(n.DEFAULT_INSTANCE);
        }

        public C1219n az(int i2) {
            J2();
            ((n) this.f59926t).eF(i2);
            return this;
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

        public C1219n ty(w6 w6Var) {
            J2();
            ((n) this.f59926t).E(w6Var);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74308n;

        static {
            int[] iArr = new int[Q.Ml.values().length];
            f74308n = iArr;
            try {
                iArr[Q.Ml.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74308n[Q.Ml.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74308n[Q.Ml.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74308n[Q.Ml.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74308n[Q.Ml.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74308n[Q.Ml.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74308n[Q.Ml.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        com.google.crypto.tink.shaded.protobuf.Q.s7N(n.class, nVar);
    }

    public static C1219n M7() {
        return (C1219n) DEFAULT_INSTANCE.gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eF(int i2) {
        this.keySize_ = i2;
    }

    public static n p5(com.google.crypto.tink.shaded.protobuf.fuX fux, com.google.crypto.tink.shaded.protobuf.Xo xo) {
        return (n) com.google.crypto.tink.shaded.protobuf.Q.E2(DEFAULT_INSTANCE, fux, xo);
    }

    public w6 P5() {
        w6 w6Var = this.params_;
        return w6Var == null ? w6.jB() : w6Var;
    }

    public int U() {
        return this.keySize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
        P nVar;
        j jVar = null;
        switch (j.f74308n[ml.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new C1219n(jVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                P p2 = PARSER;
                if (p2 != null) {
                    return p2;
                }
                synchronized (n.class) {
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

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(w6 w6Var) {
        w6Var.getClass();
        this.params_ = w6Var;
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
