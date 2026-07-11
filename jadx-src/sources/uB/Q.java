package uB;

import com.google.protobuf.CM;
import com.google.protobuf.K;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import com.google.protobuf.psW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Q extends g9s implements pO {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final Q DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile KH PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private psW labels_ = psW.emptyMapField();
    private String database_ = "";
    private String streamId_ = "";
    private nKK.Dsr writes_ = g9s.emptyProtobufList();
    private com.google.protobuf.C streamToken_ = com.google.protobuf.C.EMPTY;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Q.DEFAULT_INSTANCE);
        }

        public n gh(com.google.protobuf.C c2) {
            copyOnWrite();
            ((Q) this.instance).Ik(c2);
            return this;
        }

        public n mUb(String str) {
            copyOnWrite();
            ((Q) this.instance).ck(str);
            return this;
        }

        public n xMQ(UGc uGc) {
            copyOnWrite();
            ((Q) this.instance).qie(uGc);
            return this;
        }
    }

    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final K f74164n;

        static {
            CM.n nVar = CM.n.STRING;
            f74164n = K.newDefaultInstance(nVar, "", nVar, "");
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74163n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74163n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74163n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74163n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74163n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74163n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74163n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74163n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Q q2 = new Q();
        DEFAULT_INSTANCE = q2;
        g9s.registerDefaultInstance(Q.class, q2);
    }

    public static n HI() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    private void az() {
        nKK.Dsr dsr = this.writes_;
        if (dsr.isModifiable()) {
            return;
        }
        this.writes_ = g9s.mutableCopy(dsr);
    }

    public static Q ty() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74163n[fux.ordinal()]) {
            case 1:
                return new Q();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", UGc.class, "streamToken_", "labels_", w6.f74164n});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (Q.class) {
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

    private Q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(com.google.protobuf.C c2) {
        c2.getClass();
        this.streamToken_ = c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qie(UGc uGc) {
        uGc.getClass();
        az();
        this.writes_.add(uGc);
    }
}
