package uBO;

import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.rv6;
import com.google.crypto.tink.shaded.protobuf.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class CN3 extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
    private static final CN3 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile P PARSER;
    private int keySize_;
    private fuX params_;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class n extends Q.j implements vd {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(CN3.DEFAULT_INSTANCE);
        }

        public n az(int i2) {
            J2();
            ((CN3) this.f59926t).E(i2);
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
            ((CN3) this.f59926t).M(fux);
            return this;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74260n;

        static {
            int[] iArr = new int[Q.Ml.values().length];
            f74260n = iArr;
            try {
                iArr[Q.Ml.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74260n[Q.Ml.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74260n[Q.Ml.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74260n[Q.Ml.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74260n[Q.Ml.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74260n[Q.Ml.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74260n[Q.Ml.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CN3 cn3 = new CN3();
        DEFAULT_INSTANCE = cn3;
        com.google.crypto.tink.shaded.protobuf.Q.s7N(CN3.class, cn3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(int i2) {
        this.keySize_ = i2;
    }

    public static CN3 U() {
        return DEFAULT_INSTANCE;
    }

    public static CN3 eF(com.google.crypto.tink.shaded.protobuf.fuX fux, com.google.crypto.tink.shaded.protobuf.Xo xo) {
        return (CN3) com.google.crypto.tink.shaded.protobuf.Q.E2(DEFAULT_INSTANCE, fux, xo);
    }

    public static n p5() {
        return (n) DEFAULT_INSTANCE.gh();
    }

    public fuX M7() {
        fuX fux = this.params_;
        return fux == null ? fuX.jB() : fux;
    }

    public int P5() {
        return this.keySize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
        P nVar;
        j jVar = null;
        switch (j.f74260n[ml.ordinal()]) {
            case 1:
                return new CN3();
            case 2:
                return new n(jVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", GDEJgAYrPQHfw.oZjO});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                P p2 = PARSER;
                if (p2 != null) {
                    return p2;
                }
                synchronized (CN3.class) {
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

    private CN3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(fuX fux) {
        fux.getClass();
        this.params_ = fux;
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
