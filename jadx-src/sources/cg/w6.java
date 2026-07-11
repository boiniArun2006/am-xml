package cg;

import com.google.protobuf.CM;
import com.google.protobuf.K;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import com.google.protobuf.psW;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 extends g9s implements pO {
    public static final int ALLDATA_FIELD_NUMBER = 1;
    private static final w6 DEFAULT_INSTANCE;
    private static volatile KH PARSER;
    private psW allData_ = psW.emptyMapField();

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final K f43835n = K.newDefaultInstance(CM.n.STRING, "", CM.n.MESSAGE, CN3.ty());
    }

    /* JADX INFO: renamed from: cg.w6$w6, reason: collision with other inner class name */
    public static final class C0601w6 extends g9s.n implements pO {
        private C0601w6() {
            super(w6.DEFAULT_INSTANCE);
        }

        public C0601w6 xMQ(String str, CN3 cn3) {
            str.getClass();
            cn3.getClass();
            copyOnWrite();
            ((w6) this.instance).qie().put(str, cn3);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f43834n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f43834n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43834n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43834n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43834n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43834n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43834n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43834n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        w6 w6Var = new w6();
        DEFAULT_INSTANCE = w6Var;
        g9s.registerDefaultInstance(w6.class, w6Var);
    }

    public static w6 HI(InputStream inputStream) {
        return (w6) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    private psW az() {
        return this.allData_;
    }

    public static w6 gh() {
        return DEFAULT_INSTANCE;
    }

    private psW ty() {
        if (!this.allData_.isMutable()) {
            this.allData_ = this.allData_.mutableCopy();
        }
        return this.allData_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        switch (j.f43834n[fux.ordinal()]) {
            case 1:
                return new w6();
            case 2:
                return new C0601w6();
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"allData_", n.f43835n});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (w6.class) {
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

    private w6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map qie() {
        return ty();
    }

    public Map mUb() {
        return Collections.unmodifiableMap(az());
    }
}
