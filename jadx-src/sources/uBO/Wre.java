package uBO;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.rv6;
import com.google.crypto.tink.shaded.protobuf.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
    private static final Wre DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile P PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.fuX keyValue_ = com.google.crypto.tink.shaded.protobuf.fuX.f59997t;
    private fuX params_;
    private int version_;

    public static final class n extends Q.j implements vd {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Wre.DEFAULT_INSTANCE);
        }

        public n HI(int i2) {
            J2();
            ((Wre) this.f59926t).J(i2);
            return this;
        }

        public n az(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            J2();
            ((Wre) this.f59926t).FX(fux);
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

        public n ty(fuX fux) {
            J2();
            ((Wre) this.f59926t).B(fux);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74288n;

        static {
            int[] iArr = new int[Q.Ml.values().length];
            f74288n = iArr;
            try {
                iArr[Q.Ml.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74288n[Q.Ml.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74288n[Q.Ml.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74288n[Q.Ml.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74288n[Q.Ml.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74288n[Q.Ml.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74288n[Q.Ml.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Wre wre = new Wre();
        DEFAULT_INSTANCE = wre;
        com.google.crypto.tink.shaded.protobuf.Q.s7N(Wre.class, wre);
    }

    public static n E() {
        return (n) DEFAULT_INSTANCE.gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i2) {
        this.version_ = i2;
    }

    public static Wre M(com.google.crypto.tink.shaded.protobuf.fuX fux, com.google.crypto.tink.shaded.protobuf.Xo xo) {
        return (Wre) com.google.crypto.tink.shaded.protobuf.Q.E2(DEFAULT_INSTANCE, fux, xo);
    }

    public static Wre P5() {
        return DEFAULT_INSTANCE;
    }

    public com.google.crypto.tink.shaded.protobuf.fuX M7() {
        return this.keyValue_;
    }

    public int eF() {
        return this.version_;
    }

    public fuX p5() {
        fuX fux = this.params_;
        return fux == null ? fuX.jB() : fux;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
        P nVar;
        j jVar = null;
        switch (j.f74288n[ml.ordinal()]) {
            case 1:
                return new Wre();
            case 2:
                return new n(jVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                P p2 = PARSER;
                if (p2 != null) {
                    return p2;
                }
                synchronized (Wre.class) {
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

    private Wre() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(fuX fux) {
        fux.getClass();
        this.params_ = fux;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FX(com.google.crypto.tink.shaded.protobuf.fuX fux) {
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
