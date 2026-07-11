package oK9;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import oK9.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr extends g9s implements aC {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final Dsr DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile KH PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private w6 applicationInfo_;
    private int bitField0_;
    private CN3 gaugeMetric_;
    private fuX networkRequestMetric_;
    private qz traceMetric_;
    private Pl transportInfo_;

    public static final class n extends g9s.n implements aC {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(Dsr.DEFAULT_INSTANCE);
        }

        @Override // oK9.aC
        public CN3 J2() {
            return ((Dsr) this.instance).J2();
        }

        @Override // oK9.aC
        public qz O() {
            return ((Dsr) this.instance).O();
        }

        @Override // oK9.aC
        public boolean n() {
            return ((Dsr) this.instance).n();
        }

        @Override // oK9.aC
        public boolean nr() {
            return ((Dsr) this.instance).nr();
        }

        @Override // oK9.aC
        public boolean rl() {
            return ((Dsr) this.instance).rl();
        }

        @Override // oK9.aC
        public fuX t() {
            return ((Dsr) this.instance).t();
        }

        public n gh(fuX fux) {
            copyOnWrite();
            ((Dsr) this.instance).r(fux);
            return this;
        }

        public n mUb(CN3 cn3) {
            copyOnWrite();
            ((Dsr) this.instance).Ik(cn3);
            return this;
        }

        public n qie(qz qzVar) {
            copyOnWrite();
            ((Dsr) this.instance).o(qzVar);
            return this;
        }

        public n xMQ(w6.n nVar) {
            copyOnWrite();
            ((Dsr) this.instance).ck((w6) nVar.build());
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71374n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71374n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71374n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71374n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71374n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71374n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71374n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71374n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Dsr dsr = new Dsr();
        DEFAULT_INSTANCE = dsr;
        g9s.registerDefaultInstance(Dsr.class, dsr);
    }

    public static n HI() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // oK9.aC
    public CN3 J2() {
        CN3 cn3 = this.gaugeMetric_;
        return cn3 == null ? CN3.o() : cn3;
    }

    @Override // oK9.aC
    public qz O() {
        qz qzVar = this.traceMetric_;
        return qzVar == null ? qz.te() : qzVar;
    }

    public w6 az() {
        w6 w6Var = this.applicationInfo_;
        return w6Var == null ? w6.HI() : w6Var;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f71374n[fux.ordinal()]) {
            case 1:
                return new Dsr();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (Dsr.class) {
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

    @Override // oK9.aC
    public boolean n() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // oK9.aC
    public boolean nr() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // oK9.aC
    public boolean rl() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // oK9.aC
    public fuX t() {
        fuX fux = this.networkRequestMetric_;
        return fux == null ? fuX.nY() : fux;
    }

    public boolean ty() {
        return (this.bitField0_ & 1) != 0;
    }

    private Dsr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(CN3 cn3) {
        cn3.getClass();
        this.gaugeMetric_ = cn3;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(w6 w6Var) {
        w6Var.getClass();
        this.applicationInfo_ = w6Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(qz qzVar) {
        qzVar.getClass();
        this.traceMetric_ = qzVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(fuX fux) {
        fux.getClass();
        this.networkRequestMetric_ = fux;
        this.bitField0_ |= 4;
    }
}
