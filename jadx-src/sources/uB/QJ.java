package uB;

import com.google.protobuf.KH;
import com.google.protobuf.afx;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import java.util.List;
import uB.C2393I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class QJ extends g9s implements pO {
    private static final QJ DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile KH PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C2393I28 endAt_;
    private afx limit_;
    private int offset_;
    private aC select_;
    private C2393I28 startAt_;
    private fuX where_;
    private nKK.Dsr from_ = g9s.emptyProtobufList();
    private nKK.Dsr orderBy_ = g9s.emptyProtobufList();

    public static final class C extends g9s implements pO {
        private static final C DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile KH PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(C.DEFAULT_INSTANCE);
            }

            public j mUb(n nVar) {
                copyOnWrite();
                ((C) this.instance).ck(nVar);
                return this;
            }

            public j xMQ(CN3 cn3) {
                copyOnWrite();
                ((C) this.instance).HI(cn3);
                return this;
            }
        }

        public enum n implements nKK.w6 {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: S, reason: collision with root package name */
            private static final nKK.Ml f74166S = new j();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f74172n;

            class j implements nKK.Ml {
                j() {
                }

                @Override // com.google.protobuf.nKK.Ml
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public n findValueByNumber(int i2) {
                    return n.rl(i2);
                }
            }

            public static n rl(int i2) {
                if (i2 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i2 == 2) {
                    return IS_NAN;
                }
                if (i2 == 3) {
                    return IS_NULL;
                }
                if (i2 == 4) {
                    return IS_NOT_NAN;
                }
                if (i2 != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            @Override // com.google.protobuf.nKK.w6
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f74172n;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            n(int i2) {
                this.f74172n = i2;
            }
        }

        static {
            C c2 = new C();
            DEFAULT_INSTANCE = c2;
            g9s.registerDefaultInstance(C.class, c2);
        }

        public static C gh() {
            return DEFAULT_INSTANCE;
        }

        public static j ty() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        public n az() {
            n nVarRl = n.rl(this.op_);
            return nVarRl == null ? n.UNRECOGNIZED : nVarRl;
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74203n[fux.ordinal()]) {
                case 1:
                    return new C();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", CN3.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    KH kh = PARSER;
                    if (kh != null) {
                        return kh;
                    }
                    synchronized (C.class) {
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

        public CN3 qie() {
            return this.operandTypeCase_ == 2 ? (CN3) this.operandType_ : CN3.mUb();
        }

        private C() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void HI(CN3 cn3) {
            cn3.getClass();
            this.operandType_ = cn3;
            this.operandTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ck(n nVar) {
            this.op_ = nVar.getNumber();
        }
    }

    public static final class CN3 extends g9s implements pO {
        private static final CN3 DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile KH PARSER;
        private String fieldPath_ = "";

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(CN3.DEFAULT_INSTANCE);
            }

            public j xMQ(String str) {
                copyOnWrite();
                ((CN3) this.instance).az(str);
                return this;
            }
        }

        static {
            CN3 cn3 = new CN3();
            DEFAULT_INSTANCE = cn3;
            g9s.registerDefaultInstance(CN3.class, cn3);
        }

        public static CN3 mUb() {
            return DEFAULT_INSTANCE;
        }

        public static j qie() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74203n[fux.ordinal()]) {
                case 1:
                    return new CN3();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
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

        public String gh() {
            return this.fieldPath_;
        }

        private CN3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void az(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }
    }

    public static final class Dsr extends g9s implements pO {
        private static final Dsr DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile KH PARSER;
        private int bitField0_;
        private int direction_;
        private CN3 field_;

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(Dsr.DEFAULT_INSTANCE);
            }

            public j mUb(CN3 cn3) {
                copyOnWrite();
                ((Dsr) this.instance).HI(cn3);
                return this;
            }

            public j xMQ(I28 i28) {
                copyOnWrite();
                ((Dsr) this.instance).ty(i28);
                return this;
            }
        }

        static {
            Dsr dsr = new Dsr();
            DEFAULT_INSTANCE = dsr;
            g9s.registerDefaultInstance(Dsr.class, dsr);
        }

        public static j az() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74203n[fux.ordinal()]) {
                case 1:
                    return new Dsr();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
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

        public I28 gh() {
            I28 i28Rl = I28.rl(this.direction_);
            return i28Rl == null ? I28.UNRECOGNIZED : i28Rl;
        }

        public CN3 qie() {
            CN3 cn3 = this.field_;
            return cn3 == null ? CN3.mUb() : cn3;
        }

        private Dsr() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void HI(CN3 cn3) {
            cn3.getClass();
            this.field_ = cn3;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ty(I28 i28) {
            this.direction_ = i28.getNumber();
        }
    }

    public enum I28 implements nKK.w6 {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final nKK.Ml f74175o = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74178n;

        class j implements nKK.Ml {
            j() {
            }

            @Override // com.google.protobuf.nKK.Ml
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public I28 findValueByNumber(int i2) {
                return I28.rl(i2);
            }
        }

        public static I28 rl(int i2) {
            if (i2 == 0) {
                return DIRECTION_UNSPECIFIED;
            }
            if (i2 == 1) {
                return ASCENDING;
            }
            if (i2 != 2) {
                return null;
            }
            return DESCENDING;
        }

        @Override // com.google.protobuf.nKK.w6
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f74178n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        I28(int i2) {
            this.f74178n = i2;
        }
    }

    public static final class Ml extends g9s implements pO {
        private static final Ml DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile KH PARSER;
        private nKK.Dsr filters_ = g9s.emptyProtobufList();
        private int op_;

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(Ml.DEFAULT_INSTANCE);
            }

            public j mUb(n nVar) {
                copyOnWrite();
                ((Ml) this.instance).Ik(nVar);
                return this;
            }

            public j xMQ(Iterable iterable) {
                copyOnWrite();
                ((Ml) this.instance).gh(iterable);
                return this;
            }
        }

        public enum n implements nKK.w6 {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static final nKK.Ml f74181o = new j();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f74184n;

            class j implements nKK.Ml {
                j() {
                }

                @Override // com.google.protobuf.nKK.Ml
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public n findValueByNumber(int i2) {
                    return n.rl(i2);
                }
            }

            public static n rl(int i2) {
                if (i2 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return AND;
                }
                if (i2 != 2) {
                    return null;
                }
                return OR;
            }

            @Override // com.google.protobuf.nKK.w6
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f74184n;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            n(int i2) {
                this.f74184n = i2;
            }
        }

        static {
            Ml ml = new Ml();
            DEFAULT_INSTANCE = ml;
            g9s.registerDefaultInstance(Ml.class, ml);
        }

        public static Ml az() {
            return DEFAULT_INSTANCE;
        }

        public static j ck() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        private void qie() {
            nKK.Dsr dsr = this.filters_;
            if (dsr.isModifiable()) {
                return;
            }
            this.filters_ = g9s.mutableCopy(dsr);
        }

        public n HI() {
            n nVarRl = n.rl(this.op_);
            return nVarRl == null ? n.UNRECOGNIZED : nVarRl;
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74203n[fux.ordinal()]) {
                case 1:
                    return new Ml();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", fuX.class});
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

        public List ty() {
            return this.filters_;
        }

        private Ml() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ik(n nVar) {
            this.op_ = nVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gh(Iterable iterable) {
            qie();
            com.google.protobuf.j.addAll(iterable, (List) this.filters_);
        }
    }

    public static final class Wre extends g9s implements pO {
        private static final Wre DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile KH PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private CN3 field_;
        private int op_;
        private s4 value_;

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(Wre.DEFAULT_INSTANCE);
            }

            public j gh(s4 s4Var) {
                copyOnWrite();
                ((Wre) this.instance).o(s4Var);
                return this;
            }

            public j mUb(n nVar) {
                copyOnWrite();
                ((Wre) this.instance).r(nVar);
                return this;
            }

            public j xMQ(CN3 cn3) {
                copyOnWrite();
                ((Wre) this.instance).Ik(cn3);
                return this;
            }
        }

        public enum n implements nKK.w6 {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: N, reason: collision with root package name */
            private static final nKK.Ml f74185N = new j();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f74197n;

            class j implements nKK.Ml {
                j() {
                }

                @Override // com.google.protobuf.nKK.Ml
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public n findValueByNumber(int i2) {
                    return n.rl(i2);
                }
            }

            @Override // com.google.protobuf.nKK.w6
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f74197n;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            n(int i2) {
                this.f74197n = i2;
            }

            public static n rl(int i2) {
                switch (i2) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }
        }

        static {
            Wre wre = new Wre();
            DEFAULT_INSTANCE = wre;
            g9s.registerDefaultInstance(Wre.class, wre);
        }

        public static j ck() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        public static Wre qie() {
            return DEFAULT_INSTANCE;
        }

        public s4 HI() {
            s4 s4Var = this.value_;
            return s4Var == null ? s4.WPU() : s4Var;
        }

        public CN3 az() {
            CN3 cn3 = this.field_;
            return cn3 == null ? CN3.mUb() : cn3;
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74203n[fux.ordinal()]) {
                case 1:
                    return new Wre();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    KH kh = PARSER;
                    if (kh != null) {
                        return kh;
                    }
                    synchronized (Wre.class) {
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

        public n ty() {
            n nVarRl = n.rl(this.op_);
            return nVarRl == null ? n.UNRECOGNIZED : nVarRl;
        }

        private Wre() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ik(CN3 cn3) {
            cn3.getClass();
            this.field_ = cn3;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(s4 s4Var) {
            s4Var.getClass();
            this.value_ = s4Var;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(n nVar) {
            this.op_ = nVar.getNumber();
        }
    }

    public static final class aC extends g9s implements pO {
        private static final aC DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile KH PARSER;
        private nKK.Dsr fields_ = g9s.emptyProtobufList();

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(aC.DEFAULT_INSTANCE);
            }
        }

        static {
            aC aCVar = new aC();
            DEFAULT_INSTANCE = aCVar;
            g9s.registerDefaultInstance(aC.class, aCVar);
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74203n[fux.ordinal()]) {
                case 1:
                    return new aC();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", CN3.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    KH kh = PARSER;
                    if (kh != null) {
                        return kh;
                    }
                    synchronized (aC.class) {
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

        private aC() {
        }
    }

    public static final class fuX extends g9s implements pO {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final fuX DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile KH PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(fuX.DEFAULT_INSTANCE);
            }

            public j gh(C.j jVar) {
                copyOnWrite();
                ((fuX) this.instance).Z((C) jVar.build());
                return this;
            }

            public j mUb(Wre.j jVar) {
                copyOnWrite();
                ((fuX) this.instance).o((Wre) jVar.build());
                return this;
            }

            public j xMQ(Ml.j jVar) {
                copyOnWrite();
                ((fuX) this.instance).r((Ml) jVar.build());
                return this;
            }
        }

        public enum n {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f74202n;

            public static n rl(int i2) {
                if (i2 == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (i2 == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i2 == 2) {
                    return FIELD_FILTER;
                }
                if (i2 != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }

            n(int i2) {
                this.f74202n = i2;
            }
        }

        static {
            fuX fux = new fuX();
            DEFAULT_INSTANCE = fux;
            g9s.registerDefaultInstance(fuX.class, fux);
        }

        public static j Ik() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        public static fuX az() {
            return DEFAULT_INSTANCE;
        }

        public n HI() {
            return n.rl(this.filterTypeCase_);
        }

        public C ck() {
            return this.filterTypeCase_ == 3 ? (C) this.filterType_ : C.gh();
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74203n[fux.ordinal()]) {
                case 1:
                    return new fuX();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", Ml.class, Wre.class, C.class});
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

        public Ml qie() {
            return this.filterTypeCase_ == 1 ? (Ml) this.filterType_ : Ml.az();
        }

        public Wre ty() {
            return this.filterTypeCase_ == 2 ? (Wre) this.filterType_ : Wre.qie();
        }

        private fuX() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z(C c2) {
            c2.getClass();
            this.filterType_ = c2;
            this.filterTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(Wre wre) {
            wre.getClass();
            this.filterType_ = wre;
            this.filterTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(Ml ml) {
            ml.getClass();
            this.filterType_ = ml;
            this.filterTypeCase_ = 1;
        }
    }

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(QJ.DEFAULT_INSTANCE);
        }

        public n az(C2393I28.n nVar) {
            copyOnWrite();
            ((QJ) this.instance).N((C2393I28) nVar.build());
            return this;
        }

        public n gh(C2393I28.n nVar) {
            copyOnWrite();
            ((QJ) this.instance).X((C2393I28) nVar.build());
            return this;
        }

        public n mUb(Dsr dsr) {
            copyOnWrite();
            ((QJ) this.instance).ck(dsr);
            return this;
        }

        public n qie(afx.n nVar) {
            copyOnWrite();
            ((QJ) this.instance).T((afx) nVar.build());
            return this;
        }

        public n ty(fuX fux) {
            copyOnWrite();
            ((QJ) this.instance).nHg(fux);
            return this;
        }

        public n xMQ(w6.j jVar) {
            copyOnWrite();
            ((QJ) this.instance).HI((w6) jVar.build());
            return this;
        }
    }

    public static final class w6 extends g9s implements pO {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final w6 DEFAULT_INSTANCE;
        private static volatile KH PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        public static final class j extends g9s.n implements pO {
            /* synthetic */ j(j jVar) {
                this();
            }

            private j() {
                super(w6.DEFAULT_INSTANCE);
            }

            public j mUb(String str) {
                copyOnWrite();
                ((w6) this.instance).HI(str);
                return this;
            }

            public j xMQ(boolean z2) {
                copyOnWrite();
                ((w6) this.instance).ty(z2);
                return this;
            }
        }

        static {
            w6 w6Var = new w6();
            DEFAULT_INSTANCE = w6Var;
            g9s.registerDefaultInstance(w6.class, w6Var);
        }

        public static j az() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ty(boolean z2) {
            this.allDescendants_ = z2;
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            j jVar = null;
            switch (j.f74203n[fux.ordinal()]) {
                case 1:
                    return new w6();
                case 2:
                    return new j(jVar);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
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

        public boolean gh() {
            return this.allDescendants_;
        }

        public String qie() {
            return this.collectionId_;
        }

        private w6() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void HI(String str) {
            str.getClass();
            this.collectionId_ = str;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74203n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f74203n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74203n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74203n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74203n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74203n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74203n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74203n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        QJ qj = new QJ();
        DEFAULT_INSTANCE = qj;
        g9s.registerDefaultInstance(QJ.class, qj);
    }

    private void Ik() {
        nKK.Dsr dsr = this.from_;
        if (dsr.isModifiable()) {
            return;
        }
        this.from_ = g9s.mutableCopy(dsr);
    }

    public static n e() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static QJ o() {
        return DEFAULT_INSTANCE;
    }

    private void r() {
        nKK.Dsr dsr = this.orderBy_;
        if (dsr.isModifiable()) {
            return;
        }
        this.orderBy_ = g9s.mutableCopy(dsr);
    }

    public boolean E2() {
        return (this.bitField0_ & 2) != 0;
    }

    public int S() {
        return this.from_.size();
    }

    public int ViF() {
        return this.orderBy_.size();
    }

    public afx WPU() {
        afx afxVar = this.limit_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public w6 XQ(int i2) {
        return (w6) this.from_.get(i2);
    }

    public C2393I28 Z() {
        C2393I28 c2393i28 = this.endAt_;
        return c2393i28 == null ? C2393I28.ty() : c2393i28;
    }

    public Dsr aYN(int i2) {
        return (Dsr) this.orderBy_.get(i2);
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f74203n[fux.ordinal()]) {
            case 1:
                return new QJ();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", w6.class, "where_", "orderBy_", Dsr.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (QJ.class) {
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

    public boolean fD() {
        return (this.bitField0_ & 4) != 0;
    }

    public fuX g() {
        fuX fux = this.where_;
        return fux == null ? fuX.az() : fux;
    }

    public boolean iF() {
        return (this.bitField0_ & 16) != 0;
    }

    public C2393I28 nY() {
        C2393I28 c2393i28 = this.startAt_;
        return c2393i28 == null ? C2393I28.ty() : c2393i28;
    }

    public boolean te() {
        return (this.bitField0_ & 8) != 0;
    }

    private QJ() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HI(w6 w6Var) {
        w6Var.getClass();
        Ik();
        this.from_.add(w6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(C2393I28 c2393i28) {
        c2393i28.getClass();
        this.startAt_ = c2393i28;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(afx afxVar) {
        afxVar.getClass();
        this.limit_ = afxVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(C2393I28 c2393i28) {
        c2393i28.getClass();
        this.endAt_ = c2393i28;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(Dsr dsr) {
        dsr.getClass();
        r();
        this.orderBy_.add(dsr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nHg(fuX fux) {
        fux.getClass();
        this.where_ = fux;
        this.bitField0_ |= 2;
    }
}
