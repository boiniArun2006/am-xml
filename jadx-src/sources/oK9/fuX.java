package oK9;

import androidx.core.database.sqlite.cL.PtsLKY;
import com.google.protobuf.CM;
import com.google.protobuf.K;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import com.google.protobuf.psW;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX extends g9s implements pO {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final fuX DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile KH PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private psW customAttributes_ = psW.emptyMapField();
    private String url_ = "";
    private String responseContentType_ = "";
    private nKK.Dsr perfSessions_ = g9s.emptyProtobufList();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public enum I28 implements nKK.w6 {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        private static final nKK.Ml J2 = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f71393n;

        class j implements nKK.Ml {
            j() {
            }

            @Override // com.google.protobuf.nKK.Ml
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public I28 findValueByNumber(int i2) {
                return I28.rl(i2);
            }
        }

        private static final class n implements nKK.I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            static final nKK.I28 f71394n = new n();

            private n() {
            }

            @Override // com.google.protobuf.nKK.I28
            public boolean isInRange(int i2) {
                if (I28.rl(i2) != null) {
                    return true;
                }
                return false;
            }
        }

        public static I28 rl(int i2) {
            if (i2 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i2 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static nKK.I28 t() {
            return n.f71394n;
        }

        @Override // com.google.protobuf.nKK.w6
        public final int getNumber() {
            return this.f71393n;
        }

        I28(int i2) {
            this.f71393n = i2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public enum Ml implements nKK.w6 {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);


        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private static final nKK.Ml f71398X = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f71405n;

        class j implements nKK.Ml {
            j() {
            }

            @Override // com.google.protobuf.nKK.Ml
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Ml findValueByNumber(int i2) {
                return Ml.rl(i2);
            }
        }

        private static final class n implements nKK.I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            static final nKK.I28 f71406n = new n();

            private n() {
            }

            @Override // com.google.protobuf.nKK.I28
            public boolean isInRange(int i2) {
                if (Ml.rl(i2) != null) {
                    return true;
                }
                return false;
            }
        }

        public static nKK.I28 t() {
            return n.f71406n;
        }

        @Override // com.google.protobuf.nKK.w6
        public final int getNumber() {
            return this.f71405n;
        }

        Ml(int i2) {
            this.f71405n = i2;
        }

        public static Ml rl(int i2) {
            switch (i2) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(fuX.DEFAULT_INSTANCE);
        }

        public boolean az() {
            return ((fuX) this.instance).v();
        }

        public long gh() {
            return ((fuX) this.instance).N();
        }

        public boolean qie() {
            return ((fuX) this.instance).s7N();
        }

        public boolean ty() {
            return ((fuX) this.instance).jB();
        }

        public n HI(long j2) {
            copyOnWrite();
            ((fuX) this.instance).M7(j2);
            return this;
        }

        public n Ik(int i2) {
            copyOnWrite();
            ((fuX) this.instance).eF(i2);
            return this;
        }

        public n S(long j2) {
            copyOnWrite();
            ((fuX) this.instance).J(j2);
            return this;
        }

        public n ViF(String str) {
            copyOnWrite();
            ((fuX) this.instance).I(str);
            return this;
        }

        public n WPU(long j2) {
            copyOnWrite();
            ((fuX) this.instance).D(j2);
            return this;
        }

        public n XQ(long j2) {
            copyOnWrite();
            ((fuX) this.instance).B(j2);
            return this;
        }

        public n Z(String str) {
            copyOnWrite();
            ((fuX) this.instance).FX(str);
            return this;
        }

        public n aYN(long j2) {
            copyOnWrite();
            ((fuX) this.instance).a(j2);
            return this;
        }

        public n ck(Ml ml) {
            copyOnWrite();
            ((fuX) this.instance).p5(ml);
            return this;
        }

        public n mUb() {
            copyOnWrite();
            ((fuX) this.instance).WPU();
            return this;
        }

        public n o(long j2) {
            copyOnWrite();
            ((fuX) this.instance).M(j2);
            return this;
        }

        public n r(I28 i28) {
            copyOnWrite();
            ((fuX) this.instance).E(i28);
            return this;
        }

        public n xMQ(Iterable iterable) {
            copyOnWrite();
            ((fuX) this.instance).S(iterable);
            return this;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final K f71408n;

        static {
            CM.n nVar = CM.n.STRING;
            f71408n = K.newDefaultInstance(nVar, "", nVar, "");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71407n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71407n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71407n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71407n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71407n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71407n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71407n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71407n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        fuX fux = new fuX();
        DEFAULT_INSTANCE = fux;
        g9s.registerDefaultInstance(fuX.class, fux);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(long j2) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(long j2) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(long j2) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(long j2) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M7(long j2) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j2;
    }

    public static n P5() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void WPU() {
        this.bitField0_ &= -65;
        this.responseContentType_ = nY().E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j2;
    }

    private void aYN() {
        nKK.Dsr dsr = this.perfSessions_;
        if (dsr.isModifiable()) {
            return;
        }
        this.perfSessions_ = g9s.mutableCopy(dsr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eF(int i2) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i2;
    }

    public static fuX nY() {
        return DEFAULT_INSTANCE;
    }

    public String E2() {
        return this.responseContentType_;
    }

    public long N() {
        return this.timeToResponseInitiatedUs_;
    }

    public long T() {
        return this.timeToResponseCompletedUs_;
    }

    public boolean U() {
        return (this.bitField0_ & 512) != 0;
    }

    public long ViF() {
        return this.clientStartTimeUs_;
    }

    public long X() {
        return this.timeToRequestCompletedUs_;
    }

    public boolean Xw() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean bzg() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f71407n[fux.ordinal()]) {
            case 1:
                return new fuX();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", Ml.t(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", PtsLKY.yWyZC, "networkClientErrorReason_", I28.t(), "customAttributes_", w6.f71408n, "perfSessions_", C.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (fuX.class) {
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

    public long e() {
        return this.responsePayloadBytes_;
    }

    public long fD() {
        return this.requestPayloadBytes_;
    }

    public Ml g() {
        Ml mlRl = Ml.rl(this.httpMethod_);
        return mlRl == null ? Ml.HTTP_METHOD_UNKNOWN : mlRl;
    }

    public List iF() {
        return this.perfSessions_;
    }

    public boolean jB() {
        return (this.bitField0_ & 1024) != 0;
    }

    public String nHg() {
        return this.url_;
    }

    public boolean rV9() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean s7N() {
        return (this.bitField0_ & 128) != 0;
    }

    public int te() {
        return this.httpResponseCode_;
    }

    public boolean v() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean wTp() {
        return (this.bitField0_ & 2) != 0;
    }

    private fuX() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(I28 i28) {
        this.networkClientErrorReason_ = i28.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FX(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(Iterable iterable) {
        aYN();
        com.google.protobuf.j.addAll(iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p5(Ml ml) {
        this.httpMethod_ = ml.getNumber();
        this.bitField0_ |= 2;
    }
}
