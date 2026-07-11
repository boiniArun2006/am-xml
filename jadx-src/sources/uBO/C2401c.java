package uBO;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.rv6;
import com.google.crypto.tink.shaded.protobuf.vd;
import java.io.InputStream;

/* JADX INFO: renamed from: uBO.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2401c extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
    private static final C2401c DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile P PARSER;
    private com.google.crypto.tink.shaded.protobuf.fuX encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.fuX.f59997t;
    private Ew keysetInfo_;

    /* JADX INFO: renamed from: uBO.c$n */
    public static final class n extends Q.j implements vd {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(C2401c.DEFAULT_INSTANCE);
        }

        public n az(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            J2();
            ((C2401c) this.f59926t).p5(fux);
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

        public n ty(Ew ew) {
            J2();
            ((C2401c) this.f59926t).eF(ew);
            return this;
        }
    }

    /* JADX INFO: renamed from: uBO.c$j */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74293n;

        static {
            int[] iArr = new int[Q.Ml.values().length];
            f74293n = iArr;
            try {
                iArr[Q.Ml.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74293n[Q.Ml.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74293n[Q.Ml.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74293n[Q.Ml.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74293n[Q.Ml.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74293n[Q.Ml.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74293n[Q.Ml.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C2401c c2401c = new C2401c();
        DEFAULT_INSTANCE = c2401c;
        com.google.crypto.tink.shaded.protobuf.Q.s7N(C2401c.class, c2401c);
    }

    public static C2401c M7(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.Xo xo) {
        return (C2401c) com.google.crypto.tink.shaded.protobuf.Q.e(DEFAULT_INSTANCE, inputStream, xo);
    }

    public static n P5() {
        return (n) DEFAULT_INSTANCE.gh();
    }

    public com.google.crypto.tink.shaded.protobuf.fuX U() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
        P nVar;
        j jVar = null;
        switch (j.f74293n[ml.ordinal()]) {
            case 1:
                return new C2401c();
            case 2:
                return new n(jVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                P p2 = PARSER;
                if (p2 != null) {
                    return p2;
                }
                synchronized (C2401c.class) {
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

    private C2401c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eF(Ew ew) {
        ew.getClass();
        this.keysetInfo_ = ew;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p5(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        fux.getClass();
        this.encryptedKeyset_ = fux;
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
