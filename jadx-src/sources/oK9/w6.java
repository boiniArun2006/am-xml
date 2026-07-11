package oK9;

import com.google.protobuf.CM;
import com.google.protobuf.K;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import com.google.protobuf.psW;
import java.util.Map;
import oK9.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 extends g9s implements pO {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final w6 DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile KH PARSER;
    private oK9.j androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private psW customAttributes_ = psW.emptyMapField();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(w6.DEFAULT_INSTANCE);
        }

        public boolean xMQ() {
            return ((w6) this.instance).r();
        }

        public n az(Ml ml) {
            copyOnWrite();
            ((w6) this.instance).ViF(ml);
            return this;
        }

        public n gh(j.n nVar) {
            copyOnWrite();
            ((w6) this.instance).WPU((oK9.j) nVar.build());
            return this;
        }

        public n mUb(Map map) {
            copyOnWrite();
            ((w6) this.instance).ck().putAll(map);
            return this;
        }

        public n qie(String str) {
            copyOnWrite();
            ((w6) this.instance).aYN(str);
            return this;
        }

        public n ty(String str) {
            copyOnWrite();
            ((w6) this.instance).nY(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: oK9.w6$w6, reason: collision with other inner class name */
    private static final class C1082w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final K f71420n;

        static {
            CM.n nVar = CM.n.STRING;
            f71420n = K.newDefaultInstance(nVar, "", nVar, "");
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71419n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71419n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71419n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71419n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71419n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71419n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71419n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71419n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        w6 w6Var = new w6();
        DEFAULT_INSTANCE = w6Var;
        g9s.registerDefaultInstance(w6.class, w6Var);
    }

    public static w6 HI() {
        return DEFAULT_INSTANCE;
    }

    public static n S() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    private psW XQ() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public boolean Ik() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean Z() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f71419n[fux.ordinal()]) {
            case 1:
                return new w6();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", Ml.t(), "customAttributes_", C1082w6.f71420n});
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

    public boolean o() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public oK9.j ty() {
        oK9.j jVar = this.androidAppInfo_;
        return jVar == null ? oK9.j.qie() : jVar;
    }

    private w6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ViF(Ml ml) {
        this.applicationProcessState_ = ml.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void WPU(oK9.j jVar) {
        jVar.getClass();
        this.androidAppInfo_ = jVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aYN(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map ck() {
        return XQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nY(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }
}
