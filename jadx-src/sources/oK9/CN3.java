package oK9;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class CN3 extends g9s implements pO {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final CN3 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile KH PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Wre gaugeMetadata_;
    private String sessionId_ = "";
    private nKK.Dsr cpuMetricReadings_ = g9s.emptyProtobufList();
    private nKK.Dsr androidMemoryReadings_ = g9s.emptyProtobufList();

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(CN3.DEFAULT_INSTANCE);
        }

        public n gh(Wre wre) {
            copyOnWrite();
            ((CN3) this.instance).aYN(wre);
            return this;
        }

        public n mUb(I28 i28) {
            copyOnWrite();
            ((CN3) this.instance).ty(i28);
            return this;
        }

        public n qie(String str) {
            copyOnWrite();
            ((CN3) this.instance).setSessionId(str);
            return this;
        }

        public n xMQ(oK9.n nVar) {
            copyOnWrite();
            ((CN3) this.instance).az(nVar);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71373n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71373n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71373n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71373n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71373n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71373n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71373n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71373n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CN3 cn3 = new CN3();
        DEFAULT_INSTANCE = cn3;
        g9s.registerDefaultInstance(CN3.class, cn3);
    }

    private void HI() {
        nKK.Dsr dsr = this.androidMemoryReadings_;
        if (dsr.isModifiable()) {
            return;
        }
        this.androidMemoryReadings_ = g9s.mutableCopy(dsr);
    }

    public static n WPU() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    private void ck() {
        nKK.Dsr dsr = this.cpuMetricReadings_;
        if (dsr.isModifiable()) {
            return;
        }
        this.cpuMetricReadings_ = g9s.mutableCopy(dsr);
    }

    public static CN3 o() {
        return DEFAULT_INSTANCE;
    }

    public int Ik() {
        return this.androidMemoryReadings_.size();
    }

    public boolean S() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean XQ() {
        return (this.bitField0_ & 2) != 0;
    }

    public Wre Z() {
        Wre wre = this.gaugeMetadata_;
        return wre == null ? Wre.qie() : wre;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f71373n[fux.ordinal()]) {
            case 1:
                return new CN3();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", I28.class, "gaugeMetadata_", "androidMemoryReadings_", oK9.n.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (CN3.class) {
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

    public int r() {
        return this.cpuMetricReadings_.size();
    }

    private CN3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aYN(Wre wre) {
        wre.getClass();
        this.gaugeMetadata_ = wre;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az(oK9.n nVar) {
        nVar.getClass();
        HI();
        this.androidMemoryReadings_.add(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ty(I28 i28) {
        i28.getClass();
        ck();
        this.cpuMetricReadings_.add(i28);
    }
}
