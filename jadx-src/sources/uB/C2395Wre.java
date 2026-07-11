package uB;

import com.google.protobuf.CM;
import com.google.protobuf.K;
import com.google.protobuf.KH;
import com.google.protobuf.RGN;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import com.google.protobuf.psW;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: uB.Wre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2395Wre extends g9s implements pO {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final C2395Wre DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile KH PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private RGN createTime_;
    private psW fields_ = psW.emptyMapField();
    private String name_ = "";
    private RGN updateTime_;

    /* JADX INFO: renamed from: uB.Wre$n */
    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(C2395Wre.DEFAULT_INSTANCE);
        }

        public n gh(RGN rgn) {
            copyOnWrite();
            ((C2395Wre) this.instance).XQ(rgn);
            return this;
        }

        public n mUb(String str) {
            copyOnWrite();
            ((C2395Wre) this.instance).Z(str);
            return this;
        }

        public n xMQ(Map map) {
            copyOnWrite();
            ((C2395Wre) this.instance).ty().putAll(map);
            return this;
        }
    }

    /* JADX INFO: renamed from: uB.Wre$w6 */
    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final K f74213n = K.newDefaultInstance(CM.n.STRING, "", CM.n.MESSAGE, s4.WPU());
    }

    /* JADX INFO: renamed from: uB.Wre$j */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74212n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74212n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74212n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74212n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74212n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74212n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74212n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74212n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C2395Wre c2395Wre = new C2395Wre();
        DEFAULT_INSTANCE = c2395Wre;
        g9s.registerDefaultInstance(C2395Wre.class, c2395Wre);
    }

    private psW Ik() {
        return this.fields_;
    }

    public static n o() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static C2395Wre qie() {
        return DEFAULT_INSTANCE;
    }

    private psW r() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public String HI() {
        return this.name_;
    }

    public RGN ck() {
        RGN rgn = this.updateTime_;
        return rgn == null ? RGN.getDefaultInstance() : rgn;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74212n[fux.ordinal()]) {
            case 1:
                return new C2395Wre();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", w6.f74213n, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (C2395Wre.class) {
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

    private C2395Wre() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ(RGN rgn) {
        rgn.getClass();
        this.updateTime_ = rgn;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map ty() {
        return r();
    }

    public Map az() {
        return Collections.unmodifiableMap(Ik());
    }
}
