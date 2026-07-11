package oK9;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n extends g9s implements pO {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final n DEFAULT_INSTANCE;
    private static volatile KH PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* JADX INFO: renamed from: oK9.n$n, reason: collision with other inner class name */
    public static final class C1081n extends g9s.n implements pO {
        /* synthetic */ C1081n(j jVar) {
            this();
        }

        private C1081n() {
            super(n.DEFAULT_INSTANCE);
        }

        public C1081n mUb(int i2) {
            copyOnWrite();
            ((n) this.instance).az(i2);
            return this;
        }

        public C1081n xMQ(long j2) {
            copyOnWrite();
            ((n) this.instance).qie(j2);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71410n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71410n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71410n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71410n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71410n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71410n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71410n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71410n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        g9s.registerDefaultInstance(n.class, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az(int i2) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i2;
    }

    public static C1081n gh() {
        return (C1081n) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qie(long j2) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j2;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f71410n[fux.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new C1081n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
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

    private n() {
    }
}
