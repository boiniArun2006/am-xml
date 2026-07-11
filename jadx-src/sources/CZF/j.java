package CZF;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j extends g9s implements pO {
    private static final j DEFAULT_INSTANCE;
    public static final int HASCRASHED_FIELD_NUMBER = 1;
    private static volatile KH PARSER;
    private int bitField0_;
    private boolean hasCrashed_;

    public static final class n extends g9s.n implements pO {
        private n() {
            super(j.DEFAULT_INSTANCE);
        }

        public n xMQ(boolean z2) {
            copyOnWrite();
            ((j) this.instance).az(z2);
            return this;
        }
    }

    /* JADX INFO: renamed from: CZF.j$j, reason: collision with other inner class name */
    static /* synthetic */ class C0033j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f993n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f993n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f993n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f993n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f993n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f993n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f993n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f993n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        g9s.registerDefaultInstance(j.class, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az(boolean z2) {
        this.bitField0_ |= 1;
        this.hasCrashed_ = z2;
    }

    public static j mUb() {
        return DEFAULT_INSTANCE;
    }

    public static j qie(InputStream inputStream) {
        return (j) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        switch (C0033j.f993n[fux.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new n();
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "hasCrashed_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (j.class) {
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

    public boolean gh() {
        return this.hasCrashed_;
    }

    private j() {
    }
}
