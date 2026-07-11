package uBO;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.SPz;
import com.google.crypto.tink.shaded.protobuf.rv6;
import com.google.crypto.tink.shaded.protobuf.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ew extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
    private static final Ew DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile P PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private SPz.Ml keyInfo_ = com.google.crypto.tink.shaded.protobuf.Q.HI();
    private int primaryKeyId_;

    public static final class n extends Q.j implements vd {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Ew.DEFAULT_INSTANCE);
        }

        public n az(w6 w6Var) {
            J2();
            ((Ew) this.f59926t).U(w6Var);
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

        public n ty(int i2) {
            J2();
            ((Ew) this.f59926t).eF(i2);
            return this;
        }
    }

    public static final class w6 extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
        private static final w6 DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile P PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static final class j extends Q.j implements vd {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(w6.DEFAULT_INSTANCE);
            }

            public j HI(ci ciVar) {
                J2();
                ((w6) this.f59926t).M(ciVar);
                return this;
            }

            public j az(int i2) {
                J2();
                ((w6) this.f59926t).eF(i2);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.rv6.j
            public /* bridge */ /* synthetic */ rv6 buildPartial() {
                return super.nr();
            }

            public j ck(String str) {
                J2();
                ((w6) this.f59926t).FX(str);
                return this;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.O();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.vd
            public /* bridge */ /* synthetic */ rv6 getDefaultInstanceForType() {
                return super.xMQ();
            }

            public j ty(Ln ln2) {
                J2();
                ((w6) this.f59926t).E(ln2);
                return this;
            }
        }

        static {
            w6 w6Var = new w6();
            DEFAULT_INSTANCE = w6Var;
            com.google.crypto.tink.shaded.protobuf.Q.s7N(w6.class, w6Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void eF(int i2) {
            this.keyId_ = i2;
        }

        public static j p5() {
            return (j) DEFAULT_INSTANCE.gh();
        }

        public int M7() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q
        protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
            P nVar;
            j jVar = null;
            switch (j.f74263n[ml.ordinal()]) {
                case 1:
                    return new w6();
                case 2:
                    return new j(jVar);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    P p2 = PARSER;
                    if (p2 != null) {
                        return p2;
                    }
                    synchronized (w6.class) {
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

        private w6() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(Ln ln2) {
            this.outputPrefixType_ = ln2.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void FX(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M(ci ciVar) {
            this.status_ = ciVar.getNumber();
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

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74263n;

        static {
            int[] iArr = new int[Q.Ml.values().length];
            f74263n = iArr;
            try {
                iArr[Q.Ml.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74263n[Q.Ml.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74263n[Q.Ml.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74263n[Q.Ml.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74263n[Q.Ml.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74263n[Q.Ml.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74263n[Q.Ml.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Ew ew = new Ew();
        DEFAULT_INSTANCE = ew;
        com.google.crypto.tink.shaded.protobuf.Q.s7N(Ew.class, ew);
    }

    private void P5() {
        SPz.Ml ml = this.keyInfo_;
        if (ml.isModifiable()) {
            return;
        }
        this.keyInfo_ = com.google.crypto.tink.shaded.protobuf.Q.g(ml);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eF(int i2) {
        this.primaryKeyId_ = i2;
    }

    public static n p5() {
        return (n) DEFAULT_INSTANCE.gh();
    }

    public w6 M7(int i2) {
        return (w6) this.keyInfo_.get(i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
        P nVar;
        j jVar = null;
        switch (j.f74263n[ml.ordinal()]) {
            case 1:
                return new Ew();
            case 2:
                return new n(jVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", w6.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                P p2 = PARSER;
                if (p2 != null) {
                    return p2;
                }
                synchronized (Ew.class) {
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

    private Ew() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(w6 w6Var) {
        w6Var.getClass();
        P5();
        this.keyInfo_.add(w6Var);
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
