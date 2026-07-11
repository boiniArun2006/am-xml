package oK9;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Wre extends g9s implements pO {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final Wre DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile KH PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Wre.DEFAULT_INSTANCE);
        }

        public n gh(int i2) {
            copyOnWrite();
            ((Wre) this.instance).Ik(i2);
            return this;
        }

        public n mUb(int i2) {
            copyOnWrite();
            ((Wre) this.instance).ck(i2);
            return this;
        }

        public n xMQ(int i2) {
            copyOnWrite();
            ((Wre) this.instance).HI(i2);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71389n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71389n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71389n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71389n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71389n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71389n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71389n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71389n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Wre wre = new Wre();
        DEFAULT_INSTANCE = wre;
        g9s.registerDefaultInstance(Wre.class, wre);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HI(int i2) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(int i2) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(int i2) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i2;
    }

    public static Wre qie() {
        return DEFAULT_INSTANCE;
    }

    public static n ty() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public boolean az() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f71389n[fux.ordinal()]) {
            case 1:
                return new Wre();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
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

    private Wre() {
    }
}
