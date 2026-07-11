package hoV;

import com.google.protobuf.C;
import com.google.protobuf.KH;
import com.google.protobuf.RGN;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import uB.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 extends g9s implements pO {
    private static final w6 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile KH PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private RGN lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private RGN snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private C resumeToken_ = C.EMPTY;

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(w6.DEFAULT_INSTANCE);
        }

        public n HI(RGN rgn) {
            copyOnWrite();
            ((w6) this.instance).X(rgn);
            return this;
        }

        public n az(l3D.Ml ml) {
            copyOnWrite();
            ((w6) this.instance).E2(ml);
            return this;
        }

        public n ck(int i2) {
            copyOnWrite();
            ((w6) this.instance).T(i2);
            return this;
        }

        public n gh(RGN rgn) {
            copyOnWrite();
            ((w6) this.instance).iF(rgn);
            return this;
        }

        public n mUb(l3D.w6 w6Var) {
            copyOnWrite();
            ((w6) this.instance).te(w6Var);
            return this;
        }

        public n qie(long j2) {
            copyOnWrite();
            ((w6) this.instance).fD(j2);
            return this;
        }

        public n ty(C c2) {
            copyOnWrite();
            ((w6) this.instance).e(c2);
            return this;
        }

        public n xMQ() {
            copyOnWrite();
            ((w6) this.instance).Ik();
            return this;
        }
    }

    /* JADX INFO: renamed from: hoV.w6$w6, reason: collision with other inner class name */
    public enum EnumC0960w6 {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f67997n;

        public static EnumC0960w6 rl(int i2) {
            if (i2 == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i2 == 5) {
                return QUERY;
            }
            if (i2 != 6) {
                return null;
            }
            return DOCUMENTS;
        }

        EnumC0960w6(int i2) {
            this.f67997n = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik() {
        this.lastLimboFreeSnapshotVersion_ = null;
        this.bitField0_ &= -3;
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67993n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f67993n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67993n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67993n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67993n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67993n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67993n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67993n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        w6 w6Var = new w6();
        DEFAULT_INSTANCE = w6Var;
        g9s.registerDefaultInstance(w6.class, w6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i2) {
        this.targetId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fD(long j2) {
        this.lastListenSequenceNumber_ = j2;
    }

    public static w6 g(byte[] bArr) {
        return (w6) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n nY() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public C S() {
        return this.resumeToken_;
    }

    public EnumC0960w6 ViF() {
        return EnumC0960w6.rl(this.targetTypeCase_);
    }

    public RGN WPU() {
        RGN rgn = this.snapshotVersion_;
        return rgn == null ? RGN.getDefaultInstance() : rgn;
    }

    public l3D.Ml XQ() {
        return this.targetTypeCase_ == 5 ? (l3D.Ml) this.targetType_ : l3D.Ml.gh();
    }

    public long Z() {
        return this.lastListenSequenceNumber_;
    }

    public int aYN() {
        return this.targetId_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f67993n[fux.ordinal()]) {
            case 1:
                return new w6();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", l3D.Ml.class, l3D.w6.class, "lastLimboFreeSnapshotVersion_"});
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

    public RGN o() {
        RGN rgn = this.lastLimboFreeSnapshotVersion_;
        return rgn == null ? RGN.getDefaultInstance() : rgn;
    }

    public l3D.w6 r() {
        return this.targetTypeCase_ == 6 ? (l3D.w6) this.targetType_ : l3D.w6.qie();
    }

    private w6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E2(l3D.Ml ml) {
        ml.getClass();
        this.targetType_ = ml;
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(RGN rgn) {
        rgn.getClass();
        this.snapshotVersion_ = rgn;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(C c2) {
        c2.getClass();
        this.resumeToken_ = c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iF(RGN rgn) {
        rgn.getClass();
        this.lastLimboFreeSnapshotVersion_ = rgn;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void te(l3D.w6 w6Var) {
        w6Var.getClass();
        this.targetType_ = w6Var;
        this.targetTypeCase_ = 6;
    }
}
