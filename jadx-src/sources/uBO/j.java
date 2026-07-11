package uBO;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.rv6;
import com.google.crypto.tink.shaded.protobuf.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
    private static final j DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile P PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.fuX keyValue_ = com.google.crypto.tink.shaded.protobuf.fuX.f59997t;
    private w6 params_;
    private int version_;

    public static final class n extends Q.j implements vd {
        /* synthetic */ n(C1218j c1218j) {
            this();
        }

        private n() {
            super(j.DEFAULT_INSTANCE);
        }

        public n HI(int i2) {
            J2();
            ((j) this.f59926t).B(i2);
            return this;
        }

        public n az(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            J2();
            ((j) this.f59926t).M(fux);
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

        public n ty(w6 w6Var) {
            J2();
            ((j) this.f59926t).FX(w6Var);
            return this;
        }
    }

    /* JADX INFO: renamed from: uBO.j$j, reason: collision with other inner class name */
    static /* synthetic */ class C1218j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74305n;

        static {
            int[] iArr = new int[Q.Ml.values().length];
            f74305n = iArr;
            try {
                iArr[Q.Ml.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74305n[Q.Ml.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74305n[Q.Ml.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74305n[Q.Ml.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74305n[Q.Ml.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74305n[Q.Ml.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74305n[Q.Ml.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        com.google.crypto.tink.shaded.protobuf.Q.s7N(j.class, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i2) {
        this.version_ = i2;
    }

    public static j E(com.google.crypto.tink.shaded.protobuf.fuX fux, com.google.crypto.tink.shaded.protobuf.Xo xo) {
        return (j) com.google.crypto.tink.shaded.protobuf.Q.E2(DEFAULT_INSTANCE, fux, xo);
    }

    public static n eF() {
        return (n) DEFAULT_INSTANCE.gh();
    }

    public w6 M7() {
        w6 w6Var = this.params_;
        return w6Var == null ? w6.jB() : w6Var;
    }

    public com.google.crypto.tink.shaded.protobuf.fuX P5() {
        return this.keyValue_;
    }

    public int p5() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
        P nVar;
        C1218j c1218j = null;
        switch (C1218j.f74305n[ml.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new n(c1218j);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                P p2 = PARSER;
                if (p2 != null) {
                    return p2;
                }
                synchronized (j.class) {
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

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FX(w6 w6Var) {
        w6Var.getClass();
        this.params_ = w6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        fux.getClass();
        this.keyValue_ = fux;
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
