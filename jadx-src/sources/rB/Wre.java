package rB;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre extends g9s implements pO {
    private static final Wre DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile KH PARSER;
    private int bitField0_;
    private String id_ = "";

    public static final class n extends g9s.n implements pO {
        private n() {
            super(Wre.DEFAULT_INSTANCE);
        }

        public n xMQ(String str) {
            copyOnWrite();
            ((Wre) this.instance).ty(str);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f72879n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f72879n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72879n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72879n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72879n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72879n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72879n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72879n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Wre wre = new Wre();
        DEFAULT_INSTANCE = wre;
        g9s.registerDefaultInstance(Wre.class, wre);
    }

    public static Wre az(InputStream inputStream) {
        return (Wre) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Wre mUb() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        switch (j.f72879n[fux.ordinal()]) {
            case 1:
                return new Wre();
            case 2:
                return new n();
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (Wre.class) {
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

    public String gh() {
        return this.id_;
    }

    public boolean qie() {
        return (this.bitField0_ & 1) != 0;
    }

    private Wre() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ty(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.id_ = str;
    }
}
