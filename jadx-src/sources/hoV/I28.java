package hoV;

import com.google.protobuf.C;
import com.google.protobuf.KH;
import com.google.protobuf.RGN;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import uB.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 extends g9s implements pO {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final I28 DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile KH PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private int bitField0_;
    private RGN localWriteTime_;
    private nKK.Dsr writes_ = g9s.emptyProtobufList();
    private nKK.Dsr baseWrites_ = g9s.emptyProtobufList();

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(I28.DEFAULT_INSTANCE);
        }

        public n gh(int i2) {
            copyOnWrite();
            ((I28) this.instance).nY(i2);
            return this;
        }

        public n mUb(UGc uGc) {
            copyOnWrite();
            ((I28) this.instance).ty(uGc);
            return this;
        }

        public n qie(RGN rgn) {
            copyOnWrite();
            ((I28) this.instance).g(rgn);
            return this;
        }

        public n xMQ(UGc uGc) {
            copyOnWrite();
            ((I28) this.instance).az(uGc);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67984n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f67984n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67984n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67984n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67984n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67984n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67984n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67984n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        I28 i28 = new I28();
        DEFAULT_INSTANCE = i28;
        g9s.registerDefaultInstance(I28.class, i28);
    }

    private void HI() {
        nKK.Dsr dsr = this.baseWrites_;
        if (dsr.isModifiable()) {
            return;
        }
        this.baseWrites_ = g9s.mutableCopy(dsr);
    }

    public static I28 ViF(byte[] bArr) {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n WPU() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static I28 aYN(C c2) {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, c2);
    }

    private void ck() {
        nKK.Dsr dsr = this.writes_;
        if (dsr.isModifiable()) {
            return;
        }
        this.writes_ = g9s.mutableCopy(dsr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nY(int i2) {
        this.batchId_ = i2;
    }

    public UGc Ik(int i2) {
        return (UGc) this.baseWrites_.get(i2);
    }

    public int S() {
        return this.writes_.size();
    }

    public UGc XQ(int i2) {
        return (UGc) this.writes_.get(i2);
    }

    public RGN Z() {
        RGN rgn = this.localWriteTime_;
        return rgn == null ? RGN.getDefaultInstance() : rgn;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f67984n[fux.ordinal()]) {
            case 1:
                return new I28();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", UGc.class, "localWriteTime_", "baseWrites_", UGc.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (I28.class) {
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

    public int o() {
        return this.batchId_;
    }

    public int r() {
        return this.baseWrites_.size();
    }

    private I28() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az(UGc uGc) {
        uGc.getClass();
        HI();
        this.baseWrites_.add(uGc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(RGN rgn) {
        rgn.getClass();
        this.localWriteTime_ = rgn;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ty(UGc uGc) {
        uGc.getClass();
        ck();
        this.writes_.add(uGc);
    }
}
