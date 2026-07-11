package wk;

import com.google.protobuf.I28;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;

/* JADX INFO: renamed from: wk.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C2417j extends g9s implements pO {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final C2417j DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile KH PARSER;
    private int code_;
    private String message_ = "";
    private nKK.Dsr details_ = g9s.emptyProtobufList();

    /* JADX INFO: renamed from: wk.j$n */
    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(C1265j c1265j) {
            this();
        }

        private n() {
            super(C2417j.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: wk.j$j, reason: collision with other inner class name */
    static /* synthetic */ class C1265j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f75080n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f75080n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75080n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75080n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75080n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f75080n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f75080n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f75080n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C2417j c2417j = new C2417j();
        DEFAULT_INSTANCE = c2417j;
        g9s.registerDefaultInstance(C2417j.class, c2417j);
    }

    public static C2417j mUb() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        C1265j c1265j = null;
        switch (C1265j.f75080n[fux.ordinal()]) {
            case 1:
                return new C2417j();
            case 2:
                return new n(c1265j);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", I28.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (C2417j.class) {
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

    public String getMessage() {
        return this.message_;
    }

    public int xMQ() {
        return this.code_;
    }

    private C2417j() {
    }
}
