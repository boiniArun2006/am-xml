package uBO;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.SPz;
import com.google.crypto.tink.shaded.protobuf.rv6;
import com.google.crypto.tink.shaded.protobuf.vd;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Z extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
    private static final Z DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile P PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private SPz.Ml key_ = com.google.crypto.tink.shaded.protobuf.Q.HI();
    private int primaryKeyId_;

    public static final class n extends Q.j implements vd {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Z.DEFAULT_INSTANCE);
        }

        public int HI() {
            return ((Z) this.f59926t).p5();
        }

        public List ck() {
            return Collections.unmodifiableList(((Z) this.f59926t).eF());
        }

        public w6 ty(int i2) {
            return ((Z) this.f59926t).M7(i2);
        }

        public n Ik(int i2) {
            J2();
            ((Z) this.f59926t).J(i2);
            return this;
        }

        public n az(w6 w6Var) {
            J2();
            ((Z) this.f59926t).U(w6Var);
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
    }

    public static final class w6 extends com.google.crypto.tink.shaded.protobuf.Q implements vd {
        private static final w6 DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile P PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private SPz keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class j extends Q.j implements vd {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(w6.DEFAULT_INSTANCE);
            }

            public j HI(Ln ln2) {
                J2();
                ((w6) this.f59926t).D(ln2);
                return this;
            }

            public j az(SPz sPz) {
                J2();
                ((w6) this.f59926t).B(sPz);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.rv6.j
            public /* bridge */ /* synthetic */ rv6 buildPartial() {
                return super.nr();
            }

            public j ck(ci ciVar) {
                J2();
                ((w6) this.f59926t).a(ciVar);
                return this;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.O();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.vd
            public /* bridge */ /* synthetic */ rv6 getDefaultInstanceForType() {
                return super.xMQ();
            }

            public j ty(int i2) {
                J2();
                ((w6) this.f59926t).J(i2);
                return this;
            }
        }

        static {
            w6 w6Var = new w6();
            DEFAULT_INSTANCE = w6Var;
            com.google.crypto.tink.shaded.protobuf.Q.s7N(w6.class, w6Var);
        }

        public static j FX() {
            return (j) DEFAULT_INSTANCE.gh();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(int i2) {
            this.keyId_ = i2;
        }

        public ci E() {
            ci ciVarN = ci.n(this.status_);
            return ciVarN == null ? ci.UNRECOGNIZED : ciVarN;
        }

        public boolean M() {
            return this.keyData_ != null;
        }

        public SPz M7() {
            SPz sPz = this.keyData_;
            return sPz == null ? SPz.P5() : sPz;
        }

        public Ln eF() {
            Ln lnN = Ln.n(this.outputPrefixType_);
            return lnN == null ? Ln.UNRECOGNIZED : lnN;
        }

        public int p5() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q
        protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
            P nVar;
            j jVar = null;
            switch (j.f74290n[ml.ordinal()]) {
                case 1:
                    return new w6();
                case 2:
                    return new j(jVar);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        public void B(SPz sPz) {
            sPz.getClass();
            this.keyData_ = sPz;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D(Ln ln2) {
            this.outputPrefixType_ = ln2.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(ci ciVar) {
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
        static final /* synthetic */ int[] f74290n;

        static {
            int[] iArr = new int[Q.Ml.values().length];
            f74290n = iArr;
            try {
                iArr[Q.Ml.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74290n[Q.Ml.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74290n[Q.Ml.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74290n[Q.Ml.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74290n[Q.Ml.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74290n[Q.Ml.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74290n[Q.Ml.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Z z2 = new Z();
        DEFAULT_INSTANCE = z2;
        com.google.crypto.tink.shaded.protobuf.Q.s7N(Z.class, z2);
    }

    public static Z B(byte[] bArr, com.google.crypto.tink.shaded.protobuf.Xo xo) {
        return (Z) com.google.crypto.tink.shaded.protobuf.Q.X(DEFAULT_INSTANCE, bArr, xo);
    }

    public static Z FX(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.Xo xo) {
        return (Z) com.google.crypto.tink.shaded.protobuf.Q.e(DEFAULT_INSTANCE, inputStream, xo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i2) {
        this.primaryKeyId_ = i2;
    }

    public static n M() {
        return (n) DEFAULT_INSTANCE.gh();
    }

    private void P5() {
        SPz.Ml ml = this.key_;
        if (ml.isModifiable()) {
            return;
        }
        this.key_ = com.google.crypto.tink.shaded.protobuf.Q.g(ml);
    }

    public int E() {
        return this.primaryKeyId_;
    }

    public w6 M7(int i2) {
        return (w6) this.key_.get(i2);
    }

    public List eF() {
        return this.key_;
    }

    public int p5() {
        return this.key_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    protected final Object ty(Q.Ml ml, Object obj, Object obj2) {
        P nVar;
        j jVar = null;
        switch (j.f74290n[ml.ordinal()]) {
            case 1:
                return new Z();
            case 2:
                return new n(jVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.Q.iF(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", w6.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                P p2 = PARSER;
                if (p2 != null) {
                    return p2;
                }
                synchronized (Z.class) {
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

    private Z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(w6 w6Var) {
        w6Var.getClass();
        P5();
        this.key_.add(w6Var);
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
