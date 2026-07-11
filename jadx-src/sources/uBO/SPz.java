package uBO;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.SPz;
import com.google.crypto.tink.shaded.protobuf.rv6;
import com.google.crypto.tink.shaded.protobuf.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class SPz extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
    private static final SPz DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile P PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.fuX value_ = com.google.crypto.tink.shaded.protobuf.fuX.f59997t;

    public static final class n extends Q.j implements vd {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(SPz.DEFAULT_INSTANCE);
        }

        public n HI(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            J2();
            ((SPz) this.f59926t).B(fux);
            return this;
        }

        public n az(w6 w6Var) {
            J2();
            ((SPz) this.f59926t).M(w6Var);
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

        public n ty(String str) {
            J2();
            ((SPz) this.f59926t).FX(str);
            return this;
        }
    }

    public enum w6 implements SPz.j {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final SPz.n f74280S = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74286n;

        class j implements SPz.n {
            j() {
            }
        }

        public static w6 n(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f74286n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        w6(int i2) {
            this.f74286n = i2;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74278n;

        static {
            int[] iArr = new int[Q.Ml.values().length];
            f74278n = iArr;
            try {
                iArr[Q.Ml.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74278n[Q.Ml.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74278n[Q.Ml.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74278n[Q.Ml.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74278n[Q.Ml.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74278n[Q.Ml.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74278n[Q.Ml.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        SPz sPz = new SPz();
        DEFAULT_INSTANCE = sPz;
        com.google.crypto.tink.shaded.protobuf.Q.s7N(SPz.class, sPz);
    }

    public static n E() {
        return (n) DEFAULT_INSTANCE.gh();
    }

    public static SPz P5() {
        return DEFAULT_INSTANCE;
    }

    public w6 M7() {
        w6 w6VarN = w6.n(this.keyMaterialType_);
        return w6VarN == null ? w6.UNRECOGNIZED : w6VarN;
    }

    public com.google.crypto.tink.shaded.protobuf.fuX eF() {
        return this.value_;
    }

    public String p5() {
        return this.typeUrl_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
        P nVar;
        j jVar = null;
        switch (j.f74278n[ml.ordinal()]) {
            case 1:
                return new SPz();
            case 2:
                return new n(jVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                P p2 = PARSER;
                if (p2 != null) {
                    return p2;
                }
                synchronized (SPz.class) {
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

    private SPz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        fux.getClass();
        this.value_ = fux;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FX(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(w6 w6Var) {
        this.keyMaterialType_ = w6Var.getNumber();
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
