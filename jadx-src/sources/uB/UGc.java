package uB;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import java.util.List;
import uB.C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class UGc extends g9s implements pO {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final UGc DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile KH PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private z currentDocument_;
    private Object operation_;
    private C2392Dsr updateMask_;
    private int operationCase_ = 0;
    private nKK.Dsr updateTransforms_ = g9s.emptyProtobufList();

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(UGc.DEFAULT_INSTANCE);
        }

        public n az(C2392Dsr c2392Dsr) {
            copyOnWrite();
            ((UGc) this.instance).N(c2392Dsr);
            return this;
        }

        public n gh(String str) {
            copyOnWrite();
            ((UGc) this.instance).X(str);
            return this;
        }

        public n mUb(z zVar) {
            copyOnWrite();
            ((UGc) this.instance).e(zVar);
            return this;
        }

        public n qie(C2395Wre c2395Wre) {
            copyOnWrite();
            ((UGc) this.instance).T(c2395Wre);
            return this;
        }

        public n ty(String str) {
            copyOnWrite();
            ((UGc) this.instance).nHg(str);
            return this;
        }

        public n xMQ(C.w6 w6Var) {
            copyOnWrite();
            ((UGc) this.instance).HI(w6Var);
            return this;
        }
    }

    public enum w6 {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74211n;

        public static w6 rl(int i2) {
            if (i2 == 0) {
                return OPERATION_NOT_SET;
            }
            if (i2 == 1) {
                return UPDATE;
            }
            if (i2 == 2) {
                return DELETE;
            }
            if (i2 == 5) {
                return VERIFY;
            }
            if (i2 != 6) {
                return null;
            }
            return TRANSFORM;
        }

        w6(int i2) {
            this.f74211n = i2;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74205n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74205n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74205n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74205n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74205n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74205n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74205n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74205n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        UGc uGc = new UGc();
        DEFAULT_INSTANCE = uGc;
        g9s.registerDefaultInstance(UGc.class, uGc);
    }

    public static UGc E2(byte[] bArr) {
        return (UGc) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    private void ck() {
        nKK.Dsr dsr = this.updateTransforms_;
        if (dsr.isModifiable()) {
            return;
        }
        this.updateTransforms_ = g9s.mutableCopy(dsr);
    }

    public static n fD(UGc uGc) {
        return (n) DEFAULT_INSTANCE.createBuilder(uGc);
    }

    public static n iF() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public z Ik() {
        z zVar = this.currentDocument_;
        return zVar == null ? z.qie() : zVar;
    }

    public C2392Dsr S() {
        C2392Dsr c2392Dsr = this.updateMask_;
        return c2392Dsr == null ? C2392Dsr.qie() : c2392Dsr;
    }

    public boolean ViF() {
        return (this.bitField0_ & 2) != 0;
    }

    public List WPU() {
        return this.updateTransforms_;
    }

    public C2395Wre XQ() {
        return this.operationCase_ == 1 ? (C2395Wre) this.operation_ : C2395Wre.qie();
    }

    public C Z() {
        return this.operationCase_ == 6 ? (C) this.operation_ : C.xMQ();
    }

    public String aYN() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74205n[fux.ordinal()]) {
            case 1:
                return new UGc();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", C2395Wre.class, "updateMask_", "currentDocument_", C.class, "updateTransforms_", C.w6.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (UGc.class) {
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

    public boolean g() {
        return this.operationCase_ == 1;
    }

    public boolean nY() {
        return this.operationCase_ == 6;
    }

    public w6 o() {
        return w6.rl(this.operationCase_);
    }

    public String r() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public boolean te() {
        return (this.bitField0_ & 1) != 0;
    }

    private UGc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HI(C.w6 w6Var) {
        w6Var.getClass();
        ck();
        this.updateTransforms_.add(w6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(C2392Dsr c2392Dsr) {
        c2392Dsr.getClass();
        this.updateMask_ = c2392Dsr;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(C2395Wre c2395Wre) {
        c2395Wre.getClass();
        this.operation_ = c2395Wre;
        this.operationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(z zVar) {
        zVar.getClass();
        this.currentDocument_ = zVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nHg(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }
}
