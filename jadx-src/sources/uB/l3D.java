package uB;

import com.google.protobuf.KH;
import com.google.protobuf.RGN;
import com.google.protobuf.afx;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import uB.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class l3D extends g9s implements pO {
    private static final l3D DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile KH PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private afx expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    public static final class Ml extends g9s implements pO {
        private static final Ml DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile KH PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(Ml.DEFAULT_INSTANCE);
            }

            public j mUb(QJ.n nVar) {
                copyOnWrite();
                ((Ml) this.instance).ck((QJ) nVar.build());
                return this;
            }

            public j xMQ(String str) {
                copyOnWrite();
                ((Ml) this.instance).HI(str);
                return this;
            }
        }

        static {
            Ml ml = new Ml();
            DEFAULT_INSTANCE = ml;
            g9s.registerDefaultInstance(Ml.class, ml);
        }

        public static Ml gh() {
            return DEFAULT_INSTANCE;
        }

        public static j ty() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        public QJ az() {
            return this.queryTypeCase_ == 2 ? (QJ) this.queryType_ : QJ.o();
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74236n[fux.ordinal()]) {
                case 1:
                    return new Ml();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", QJ.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    KH kh = PARSER;
                    if (kh != null) {
                        return kh;
                    }
                    synchronized (Ml.class) {
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

        public String qie() {
            return this.parent_;
        }

        private Ml() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void HI(String str) {
            str.getClass();
            this.parent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ck(QJ qj) {
            qj.getClass();
            this.queryType_ = qj;
            this.queryTypeCase_ = 2;
        }
    }

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(l3D.DEFAULT_INSTANCE);
        }

        public n az(com.google.protobuf.C c2) {
            copyOnWrite();
            ((l3D) this.instance).Z(c2);
            return this;
        }

        public n gh(Ml ml) {
            copyOnWrite();
            ((l3D) this.instance).r(ml);
            return this;
        }

        public n mUb(afx.n nVar) {
            copyOnWrite();
            ((l3D) this.instance).Ik((afx) nVar.build());
            return this;
        }

        public n qie(RGN rgn) {
            copyOnWrite();
            ((l3D) this.instance).o(rgn);
            return this;
        }

        public n ty(int i2) {
            copyOnWrite();
            ((l3D) this.instance).XQ(i2);
            return this;
        }

        public n xMQ(w6 w6Var) {
            copyOnWrite();
            ((l3D) this.instance).ck(w6Var);
            return this;
        }
    }

    public static final class w6 extends g9s implements pO {
        private static final w6 DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile KH PARSER;
        private nKK.Dsr documents_ = g9s.emptyProtobufList();

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(w6.DEFAULT_INSTANCE);
            }

            public j xMQ(String str) {
                copyOnWrite();
                ((w6) this.instance).mUb(str);
                return this;
            }
        }

        static {
            w6 w6Var = new w6();
            DEFAULT_INSTANCE = w6Var;
            g9s.registerDefaultInstance(w6.class, w6Var);
        }

        public static j HI() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        private void gh() {
            nKK.Dsr dsr = this.documents_;
            if (dsr.isModifiable()) {
                return;
            }
            this.documents_ = g9s.mutableCopy(dsr);
        }

        public static w6 qie() {
            return DEFAULT_INSTANCE;
        }

        public String az(int i2) {
            return (String) this.documents_.get(i2);
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74236n[fux.ordinal()]) {
                case 1:
                    return new w6();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
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

        public int ty() {
            return this.documents_.size();
        }

        private w6() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mUb(String str) {
            str.getClass();
            gh();
            this.documents_.add(str);
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74236n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74236n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74236n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74236n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74236n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74236n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74236n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74236n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        l3D l3d = new l3D();
        DEFAULT_INSTANCE = l3d;
        g9s.registerDefaultInstance(l3D.class, l3d);
    }

    public static n HI() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ(int i2) {
        this.targetId_ = i2;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74236n[fux.ordinal()]) {
            case 1:
                return new l3D();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", Ml.class, w6.class, "targetId_", "once_", RGN.class, "expectedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (l3D.class) {
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

    private l3D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(afx afxVar) {
        afxVar.getClass();
        this.expectedCount_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(com.google.protobuf.C c2) {
        c2.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(w6 w6Var) {
        w6Var.getClass();
        this.targetType_ = w6Var;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(RGN rgn) {
        rgn.getClass();
        this.resumeType_ = rgn;
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Ml ml) {
        ml.getClass();
        this.targetType_ = ml;
        this.targetTypeCase_ = 2;
    }
}
