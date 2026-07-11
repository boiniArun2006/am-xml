package uB;

import com.google.protobuf.CM;
import com.google.protobuf.K;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import com.google.protobuf.psW;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Pl extends g9s implements pO {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final Pl DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile KH PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private psW labels_ = psW.emptyMapField();
    private String database_ = "";

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Pl.DEFAULT_INSTANCE);
        }

        public n gh(String str) {
            copyOnWrite();
            ((Pl) this.instance).r(str);
            return this;
        }

        public n mUb(l3D l3d) {
            copyOnWrite();
            ((Pl) this.instance).Ik(l3d);
            return this;
        }

        public n qie(int i2) {
            copyOnWrite();
            ((Pl) this.instance).o(i2);
            return this;
        }

        public n xMQ(Map map) {
            copyOnWrite();
            ((Pl) this.instance).ty().putAll(map);
            return this;
        }
    }

    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final K f74162n;

        static {
            CM.n nVar = CM.n.STRING;
            f74162n = K.newDefaultInstance(nVar, "", nVar, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i2) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i2);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74161n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74161n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74161n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74161n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74161n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74161n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74161n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74161n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Pl pl = new Pl();
        DEFAULT_INSTANCE = pl;
        g9s.registerDefaultInstance(Pl.class, pl);
    }

    private psW HI() {
        if (!this.labels_.isMutable()) {
            this.labels_ = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    public static Pl az() {
        return DEFAULT_INSTANCE;
    }

    public static n ck() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74161n[fux.ordinal()]) {
            case 1:
                return new Pl();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", l3D.class, "labels_", w6.f74162n});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (Pl.class) {
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

    private Pl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(l3D l3d) {
        l3d.getClass();
        this.targetChange_ = l3d;
        this.targetChangeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map ty() {
        return HI();
    }
}
