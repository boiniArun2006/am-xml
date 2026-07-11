package uB;

import com.google.protobuf.KH;
import com.google.protobuf.RGN;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import java.util.List;
import wk.C2417j;

/* JADX INFO: renamed from: uB.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C2396c extends g9s implements pO {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final C2396c DEFAULT_INSTANCE;
    private static volatile KH PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private C2417j cause_;
    private RGN readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private nKK.CN3 targetIds_ = g9s.emptyIntList();
    private com.google.protobuf.C resumeToken_ = com.google.protobuf.C.EMPTY;

    /* JADX INFO: renamed from: uB.c$n */
    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(C2396c.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: uB.c$w6 */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public enum w6 implements nKK.w6 {
        f74230t(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final nKK.Ml f74225S = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74231n;

        /* JADX INFO: renamed from: uB.c$w6$j */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
        class j implements nKK.Ml {
            j() {
            }

            @Override // com.google.protobuf.nKK.Ml
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public w6 findValueByNumber(int i2) {
                return w6.rl(i2);
            }
        }

        public static w6 rl(int i2) {
            if (i2 == 0) {
                return f74230t;
            }
            if (i2 == 1) {
                return ADD;
            }
            if (i2 == 2) {
                return REMOVE;
            }
            if (i2 == 3) {
                return CURRENT;
            }
            if (i2 != 4) {
                return null;
            }
            return RESET;
        }

        @Override // com.google.protobuf.nKK.w6
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f74231n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        w6(int i2) {
            this.f74231n = i2;
        }
    }

    /* JADX INFO: renamed from: uB.c$j */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74223n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74223n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74223n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74223n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74223n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74223n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74223n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74223n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C2396c c2396c = new C2396c();
        DEFAULT_INSTANCE = c2396c;
        g9s.registerDefaultInstance(C2396c.class, c2396c);
    }

    public static C2396c mUb() {
        return DEFAULT_INSTANCE;
    }

    public List HI() {
        return this.targetIds_;
    }

    public w6 az() {
        w6 w6VarRl = w6.rl(this.targetChangeType_);
        return w6VarRl == null ? w6.UNRECOGNIZED : w6VarRl;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74223n[fux.ordinal()]) {
            case 1:
                return new C2396c();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (C2396c.class) {
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

    public RGN gh() {
        RGN rgn = this.readTime_;
        return rgn == null ? RGN.getDefaultInstance() : rgn;
    }

    public com.google.protobuf.C qie() {
        return this.resumeToken_;
    }

    public int ty() {
        return this.targetIds_.size();
    }

    public C2417j xMQ() {
        C2417j c2417j = this.cause_;
        return c2417j == null ? C2417j.mUb() : c2417j;
    }

    private C2396c() {
    }
}
