package CZF;

import cS.Zv.SzFNXybiSxdx;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX extends g9s implements pO {
    private static final fuX DEFAULT_INSTANCE;
    public static final int DURATIONINSECONDS_FIELD_NUMBER = 2;
    public static final int HASBEENLOGGED_FIELD_NUMBER = 3;
    private static volatile KH PARSER = null;
    public static final int SESSIONID_FIELD_NUMBER = 1;
    private int bitField0_;
    private double durationInSeconds_;
    private boolean hasBeenLogged_;
    private String sessionId_ = SzFNXybiSxdx.UrIZwBIq;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class n extends g9s.n implements pO {
        private n() {
            super(fuX.DEFAULT_INSTANCE);
        }

        public boolean gh() {
            return ((fuX) this.instance).HI();
        }

        public boolean mUb() {
            return ((fuX) this.instance).ty();
        }

        public double xMQ() {
            return ((fuX) this.instance).az();
        }

        public n az(boolean z2) {
            copyOnWrite();
            ((fuX) this.instance).r(z2);
            return this;
        }

        public n qie(double d2) {
            copyOnWrite();
            ((fuX) this.instance).Ik(d2);
            return this;
        }

        public n ty(String str) {
            copyOnWrite();
            ((fuX) this.instance).setSessionId(str);
            return this;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f992n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f992n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f992n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f992n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f992n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f992n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f992n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f992n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        fuX fux = new fuX();
        DEFAULT_INSTANCE = fux;
        g9s.registerDefaultInstance(fuX.class, fux);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(double d2) {
        this.bitField0_ |= 2;
        this.durationInSeconds_ = d2;
    }

    public static fuX ck(InputStream inputStream) {
        return (fuX) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fuX qie() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(boolean z2) {
        this.bitField0_ |= 4;
        this.hasBeenLogged_ = z2;
    }

    public boolean HI() {
        return (this.bitField0_ & 1) != 0;
    }

    public double az() {
        return this.durationInSeconds_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        switch (j.f992n[fux.ordinal()]) {
            case 1:
                return new fuX();
            case 2:
                return new n();
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002က\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "sessionId_", "durationInSeconds_", "hasBeenLogged_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (fuX.class) {
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

    public String getSessionId() {
        return this.sessionId_;
    }

    public boolean ty() {
        return this.hasBeenLogged_;
    }

    private fuX() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
