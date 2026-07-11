package uB;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import java.util.List;

/* JADX INFO: renamed from: uB.I28, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2393I28 extends g9s implements pO {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final C2393I28 DEFAULT_INSTANCE;
    private static volatile KH PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private nKK.Dsr values_ = g9s.emptyProtobufList();

    /* JADX INFO: renamed from: uB.I28$n */
    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(C2393I28.DEFAULT_INSTANCE);
        }

        public n mUb(boolean z2) {
            copyOnWrite();
            ((C2393I28) this.instance).ck(z2);
            return this;
        }

        public n xMQ(Iterable iterable) {
            copyOnWrite();
            ((C2393I28) this.instance).gh(iterable);
            return this;
        }
    }

    /* JADX INFO: renamed from: uB.I28$j */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74159n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74159n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74159n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74159n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74159n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74159n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74159n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74159n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C2393I28 c2393i28 = new C2393I28();
        DEFAULT_INSTANCE = c2393i28;
        g9s.registerDefaultInstance(C2393I28.class, c2393i28);
    }

    public static n HI() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(boolean z2) {
        this.before_ = z2;
    }

    private void qie() {
        nKK.Dsr dsr = this.values_;
        if (dsr.isModifiable()) {
            return;
        }
        this.values_ = g9s.mutableCopy(dsr);
    }

    public static C2393I28 ty() {
        return DEFAULT_INSTANCE;
    }

    public List KN() {
        return this.values_;
    }

    public boolean az() {
        return this.before_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74159n[fux.ordinal()]) {
            case 1:
                return new C2393I28();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", s4.class, "before_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (C2393I28.class) {
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

    private C2393I28() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gh(Iterable iterable) {
        qie();
        com.google.protobuf.j.addAll(iterable, (List) this.values_);
    }
}
