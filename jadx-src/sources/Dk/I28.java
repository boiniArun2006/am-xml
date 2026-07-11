package Dk;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class I28 extends g9s implements pO {
    public static final int AAID_FIELD_NUMBER = 1;
    public static final int APPSETID_FIELD_NUMBER = 2;
    private static final I28 DEFAULT_INSTANCE;
    private static volatile KH PARSER;
    private w6 aaid_;
    private w6 appsetid_;
    private int bitField0_;

    public static final class n extends g9s.n implements pO {
        private n() {
            super(I28.DEFAULT_INSTANCE);
        }

        public n gh(w6 w6Var) {
            copyOnWrite();
            ((I28) this.instance).XQ(w6Var);
            return this;
        }

        public n mUb() {
            copyOnWrite();
            ((I28) this.instance).ty();
            return this;
        }

        public n qie(w6 w6Var) {
            copyOnWrite();
            ((I28) this.instance).S(w6Var);
            return this;
        }

        public n xMQ() {
            copyOnWrite();
            ((I28) this.instance).az();
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az() {
        this.aaid_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ty() {
        this.appsetid_ = null;
        this.bitField0_ &= -3;
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f1916n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f1916n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1916n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1916n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1916n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1916n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1916n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1916n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        I28 i28 = new I28();
        DEFAULT_INSTANCE = i28;
        g9s.registerDefaultInstance(I28.class, i28);
    }

    public static I28 Ik() {
        return DEFAULT_INSTANCE;
    }

    public static I28 Z(InputStream inputStream) {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public w6 HI() {
        w6 w6Var = this.aaid_;
        return w6Var == null ? w6.qie() : w6Var;
    }

    public w6 ck() {
        w6 w6Var = this.appsetid_;
        return w6Var == null ? w6.qie() : w6Var;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        switch (j.f1916n[fux.ordinal()]) {
            case 1:
                return new I28();
            case 2:
                return new n();
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aaid_", "appsetid_"});
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

    public boolean o() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    private I28() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(w6 w6Var) {
        w6Var.getClass();
        this.appsetid_ = w6Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ(w6 w6Var) {
        w6Var.getClass();
        this.aaid_ = w6Var;
        this.bitField0_ |= 1;
    }
}
