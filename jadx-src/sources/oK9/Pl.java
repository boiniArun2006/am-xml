package oK9;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Pl extends g9s implements pO {
    private static final Pl DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile KH PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Pl.DEFAULT_INSTANCE);
        }
    }

    public enum w6 implements nKK.w6 {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);

        private static final nKK.Ml J2 = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f71387n;

        class j implements nKK.Ml {
            j() {
            }

            @Override // com.google.protobuf.nKK.Ml
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public w6 findValueByNumber(int i2) {
                return w6.rl(i2);
            }
        }

        private static final class n implements nKK.I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            static final nKK.I28 f71388n = new n();

            private n() {
            }

            @Override // com.google.protobuf.nKK.I28
            public boolean isInRange(int i2) {
                if (w6.rl(i2) != null) {
                    return true;
                }
                return false;
            }
        }

        public static w6 rl(int i2) {
            if (i2 == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i2 != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        public static nKK.I28 t() {
            return n.f71388n;
        }

        @Override // com.google.protobuf.nKK.w6
        public final int getNumber() {
            return this.f71387n;
        }

        w6(int i2) {
            this.f71387n = i2;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71383n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71383n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71383n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71383n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71383n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71383n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71383n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71383n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Pl pl = new Pl();
        DEFAULT_INSTANCE = pl;
        g9s.registerDefaultInstance(Pl.class, pl);
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f71383n[fux.ordinal()]) {
            case 1:
                return new Pl();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", w6.t()});
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
}
