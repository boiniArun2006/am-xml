package oK9;

import com.google.protobuf.DAz;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C extends g9s implements pO {
    private static final C DEFAULT_INSTANCE;
    private static volatile KH PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final DAz sessionVerbosity_converter_ = new j();
    private int bitField0_;
    private String sessionId_ = "";
    private nKK.CN3 sessionVerbosity_ = g9s.emptyIntList();

    public static final class w6 extends g9s.n implements pO {
        /* synthetic */ w6(j jVar) {
            this();
        }

        private w6() {
            super(C.DEFAULT_INSTANCE);
        }

        public w6 mUb(String str) {
            copyOnWrite();
            ((C) this.instance).setSessionId(str);
            return this;
        }

        public w6 xMQ(o oVar) {
            copyOnWrite();
            ((C) this.instance).gh(oVar);
            return this;
        }
    }

    class j implements DAz {
        j() {
        }

        @Override // com.google.protobuf.DAz
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public o convert(Integer num) {
            o oVarRl = o.rl(num.intValue());
            if (oVarRl == null) {
                return o.SESSION_VERBOSITY_NONE;
            }
            return oVarRl;
        }
    }

    static /* synthetic */ class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71372n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71372n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71372n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71372n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71372n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71372n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71372n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71372n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C c2 = new C();
        DEFAULT_INSTANCE = c2;
        g9s.registerDefaultInstance(C.class, c2);
    }

    public static w6 HI() {
        return (w6) DEFAULT_INSTANCE.createBuilder();
    }

    private void qie() {
        nKK.CN3 cn3 = this.sessionVerbosity_;
        if (cn3.isModifiable()) {
            return;
        }
        this.sessionVerbosity_ = g9s.mutableCopy(cn3);
    }

    public o az(int i2) {
        o oVarRl = o.rl(this.sessionVerbosity_.getInt(i2));
        return oVarRl == null ? o.SESSION_VERBOSITY_NONE : oVarRl;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (n.f71372n[fux.ordinal()]) {
            case 1:
                return new C();
            case 2:
                return new w6(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", o.t()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (C.class) {
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

    public int ty() {
        return this.sessionVerbosity_.size();
    }

    private C() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gh(o oVar) {
        oVar.getClass();
        qie();
        this.sessionVerbosity_.addInt(oVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
