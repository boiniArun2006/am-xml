package hoV;

import com.google.protobuf.KH;
import com.google.protobuf.RGN;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml extends g9s implements pO {
    private static final Ml DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile KH PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private RGN version_;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Ml.DEFAULT_INSTANCE);
        }

        public n mUb(RGN rgn) {
            copyOnWrite();
            ((Ml) this.instance).ck(rgn);
            return this;
        }

        public n xMQ(String str) {
            copyOnWrite();
            ((Ml) this.instance).HI(str);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67985n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f67985n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67985n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67985n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67985n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67985n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67985n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67985n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Ml ml = new Ml();
        DEFAULT_INSTANCE = ml;
        g9s.registerDefaultInstance(Ml.class, ml);
    }

    public static Ml gh() {
        return DEFAULT_INSTANCE;
    }

    public static n ty() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public RGN az() {
        RGN rgn = this.version_;
        return rgn == null ? RGN.getDefaultInstance() : rgn;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f67985n[fux.ordinal()]) {
            case 1:
                return new Ml();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (Ml.class) {
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

    private Ml() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HI(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(RGN rgn) {
        rgn.getClass();
        this.version_ = rgn;
        this.bitField0_ |= 1;
    }
}
