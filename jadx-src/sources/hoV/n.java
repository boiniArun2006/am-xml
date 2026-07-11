package hoV;

import com.google.protobuf.KH;
import com.google.protobuf.RGN;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n extends g9s implements pO {
    private static final n DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile KH PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private RGN readTime_;

    /* JADX INFO: renamed from: hoV.n$n, reason: collision with other inner class name */
    public static final class C0959n extends g9s.n implements pO {
        /* synthetic */ C0959n(j jVar) {
            this();
        }

        private C0959n() {
            super(n.DEFAULT_INSTANCE);
        }

        public C0959n mUb(RGN rgn) {
            copyOnWrite();
            ((n) this.instance).ck(rgn);
            return this;
        }

        public C0959n xMQ(String str) {
            copyOnWrite();
            ((n) this.instance).HI(str);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67992n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f67992n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67992n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67992n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67992n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67992n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67992n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67992n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        g9s.registerDefaultInstance(n.class, nVar);
    }

    public static n gh() {
        return DEFAULT_INSTANCE;
    }

    public static C0959n ty() {
        return (C0959n) DEFAULT_INSTANCE.createBuilder();
    }

    public RGN az() {
        RGN rgn = this.readTime_;
        return rgn == null ? RGN.getDefaultInstance() : rgn;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f67992n[fux.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new C0959n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (n.class) {
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

    public String qie() {
        return this.name_;
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HI(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(RGN rgn) {
        rgn.getClass();
        this.readTime_ = rgn;
        this.bitField0_ |= 1;
    }
}
