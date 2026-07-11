package uB;

import com.google.protobuf.CM;
import com.google.protobuf.K;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import com.google.protobuf.psW;
import d8q.jqQ.QTafcm;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class eO extends g9s implements pO {
    private static final eO DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile KH PARSER;
    private psW fields_ = psW.emptyMapField();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(eO.DEFAULT_INSTANCE);
        }

        public n gh(String str, s4 s4Var) {
            str.getClass();
            s4Var.getClass();
            copyOnWrite();
            ((eO) this.instance).HI().put(str, s4Var);
            return this;
        }

        public n mUb(Map map) {
            copyOnWrite();
            ((eO) this.instance).HI().putAll(map);
            return this;
        }

        public n qie(String str) {
            str.getClass();
            copyOnWrite();
            ((eO) this.instance).HI().remove(str);
            return this;
        }

        public boolean xMQ(String str) {
            str.getClass();
            return ((eO) this.instance).qie().containsKey(str);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final K f74233n = K.newDefaultInstance(CM.n.STRING, "", CM.n.MESSAGE, s4.WPU());
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74232n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74232n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74232n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74232n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74232n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74232n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74232n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74232n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        eO eOVar = new eO();
        DEFAULT_INSTANCE = eOVar;
        g9s.registerDefaultInstance(eO.class, eOVar);
    }

    private psW Ik() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    private psW ck() {
        return this.fields_;
    }

    public static eO mUb() {
        return DEFAULT_INSTANCE;
    }

    public static n r() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74232n[fux.ordinal()]) {
            case 1:
                return new eO();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{QTafcm.AQPzgRpvyvsAVF, w6.f74233n});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (eO.class) {
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

    private eO() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map HI() {
        return Ik();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s4 az(String str, s4 s4Var) {
        str.getClass();
        psW pswCk = ck();
        if (pswCk.containsKey(str)) {
            return (s4) pswCk.get(str);
        }
        return s4Var;
    }

    public int gh() {
        return ck().size();
    }

    public Map qie() {
        return Collections.unmodifiableMap(ck());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s4 ty(String str) {
        str.getClass();
        psW pswCk = ck();
        if (pswCk.containsKey(str)) {
            return (s4) pswCk.get(str);
        }
        throw new IllegalArgumentException();
    }
}
