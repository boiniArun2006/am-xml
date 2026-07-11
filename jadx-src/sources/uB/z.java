package uB;

import com.google.protobuf.KH;
import com.google.protobuf.RGN;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class z extends g9s implements pO {
    private static final z DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile KH PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(z.DEFAULT_INSTANCE);
        }

        public n mUb(RGN rgn) {
            copyOnWrite();
            ((z) this.instance).Ik(rgn);
            return this;
        }

        public n xMQ(boolean z2) {
            copyOnWrite();
            ((z) this.instance).ck(z2);
            return this;
        }
    }

    public enum w6 {
        EXISTS(1),
        UPDATE_TIME(2),
        CONDITIONTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74258n;

        public static w6 rl(int i2) {
            if (i2 == 0) {
                return CONDITIONTYPE_NOT_SET;
            }
            if (i2 == 1) {
                return EXISTS;
            }
            if (i2 != 2) {
                return null;
            }
            return UPDATE_TIME;
        }

        w6(int i2) {
            this.f74258n = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(boolean z2) {
        this.conditionTypeCase_ = 1;
        this.conditionType_ = Boolean.valueOf(z2);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74254n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74254n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74254n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74254n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74254n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74254n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74254n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74254n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        g9s.registerDefaultInstance(z.class, zVar);
    }

    public static n HI() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static z qie() {
        return DEFAULT_INSTANCE;
    }

    public boolean az() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74254n[fux.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", RGN.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (z.class) {
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

    public w6 gh() {
        return w6.rl(this.conditionTypeCase_);
    }

    public RGN ty() {
        return this.conditionTypeCase_ == 2 ? (RGN) this.conditionType_ : RGN.getDefaultInstance();
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(RGN rgn) {
        rgn.getClass();
        this.conditionType_ = rgn;
        this.conditionTypeCase_ = 2;
    }
}
