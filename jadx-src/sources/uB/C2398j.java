package uB;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: uB.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2398j extends g9s implements InterfaceC2399n {
    private static final C2398j DEFAULT_INSTANCE;
    private static volatile KH PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private nKK.Dsr values_ = g9s.emptyProtobufList();

    /* JADX INFO: renamed from: uB.j$n */
    public static final class n extends g9s.n implements InterfaceC2399n {
        /* synthetic */ n(C1217j c1217j) {
            this();
        }

        private n() {
            super(C2398j.DEFAULT_INSTANCE);
        }

        @Override // uB.InterfaceC2399n
        public List KN() {
            return Collections.unmodifiableList(((C2398j) this.instance).KN());
        }

        public s4 gh(int i2) {
            return ((C2398j) this.instance).ck(i2);
        }

        public int qie() {
            return ((C2398j) this.instance).Ik();
        }

        public n az(int i2) {
            copyOnWrite();
            ((C2398j) this.instance).o(i2);
            return this;
        }

        public n mUb(s4 s4Var) {
            copyOnWrite();
            ((C2398j) this.instance).az(s4Var);
            return this;
        }

        public n xMQ(Iterable iterable) {
            copyOnWrite();
            ((C2398j) this.instance).qie(iterable);
            return this;
        }
    }

    /* JADX INFO: renamed from: uB.j$j, reason: collision with other inner class name */
    static /* synthetic */ class C1217j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74235n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74235n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74235n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74235n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74235n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74235n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74235n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74235n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C2398j c2398j = new C2398j();
        DEFAULT_INSTANCE = c2398j;
        g9s.registerDefaultInstance(C2398j.class, c2398j);
    }

    public static C2398j HI() {
        return DEFAULT_INSTANCE;
    }

    public static n r() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    private void ty() {
        nKK.Dsr dsr = this.values_;
        if (dsr.isModifiable()) {
            return;
        }
        this.values_ = g9s.mutableCopy(dsr);
    }

    public int Ik() {
        return this.values_.size();
    }

    @Override // uB.InterfaceC2399n
    public List KN() {
        return this.values_;
    }

    public s4 ck(int i2) {
        return (s4) this.values_.get(i2);
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        C1217j c1217j = null;
        switch (C1217j.f74235n[fux.ordinal()]) {
            case 1:
                return new C2398j();
            case 2:
                return new n(c1217j);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", s4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (C2398j.class) {
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

    private C2398j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az(s4 s4Var) {
        s4Var.getClass();
        ty();
        this.values_.add(s4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i2) {
        ty();
        this.values_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qie(Iterable iterable) {
        ty();
        com.google.protobuf.j.addAll(iterable, (List) this.values_);
    }
}
