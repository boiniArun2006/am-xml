package g0;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j extends g9s implements pO {
    private static final j DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile KH PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private nKK.Dsr fields_ = g9s.emptyProtobufList();

    public enum Ml implements nKK.w6 {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final nKK.Ml f67015o = new C0929j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f67018n;

        /* JADX INFO: renamed from: g0.j$Ml$j, reason: collision with other inner class name */
        class C0929j implements nKK.Ml {
            C0929j() {
            }

            @Override // com.google.protobuf.nKK.Ml
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Ml findValueByNumber(int i2) {
                return Ml.rl(i2);
            }
        }

        public static Ml rl(int i2) {
            if (i2 == 0) {
                return QUERY_SCOPE_UNSPECIFIED;
            }
            if (i2 == 1) {
                return COLLECTION;
            }
            if (i2 != 2) {
                return null;
            }
            return COLLECTION_GROUP;
        }

        @Override // com.google.protobuf.nKK.w6
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f67018n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        Ml(int i2) {
            this.f67018n = i2;
        }
    }

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(C0930j c0930j) {
            this();
        }

        private n() {
            super(j.DEFAULT_INSTANCE);
        }

        public n mUb(Ml ml) {
            copyOnWrite();
            ((j) this.instance).ck(ml);
            return this;
        }

        public n xMQ(w6.n nVar) {
            copyOnWrite();
            ((j) this.instance).gh((w6) nVar.build());
            return this;
        }
    }

    public static final class w6 extends g9s implements pO {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final w6 DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile KH PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        public enum Ml {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);


            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f67023n;

            public static Ml rl(int i2) {
                if (i2 == 0) {
                    return VALUEMODE_NOT_SET;
                }
                if (i2 == 2) {
                    return ORDER;
                }
                if (i2 != 3) {
                    return null;
                }
                return ARRAY_CONFIG;
            }

            Ml(int i2) {
                this.f67023n = i2;
            }
        }

        /* JADX INFO: renamed from: g0.j$w6$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public enum EnumC0931j implements nKK.w6 {
            ARRAY_CONFIG_UNSPECIFIED(0),
            f67024O(1),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final nKK.Ml f67026r = new C0932j();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f67028n;

            /* JADX INFO: renamed from: g0.j$w6$j$j, reason: collision with other inner class name */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
            class C0932j implements nKK.Ml {
                C0932j() {
                }

                @Override // com.google.protobuf.nKK.Ml
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public EnumC0931j findValueByNumber(int i2) {
                    return EnumC0931j.rl(i2);
                }
            }

            public static EnumC0931j rl(int i2) {
                if (i2 == 0) {
                    return ARRAY_CONFIG_UNSPECIFIED;
                }
                if (i2 != 1) {
                    return null;
                }
                return f67024O;
            }

            @Override // com.google.protobuf.nKK.w6
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f67028n;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            EnumC0931j(int i2) {
                this.f67028n = i2;
            }
        }

        public static final class n extends g9s.n implements pO {
            /* synthetic */ n(C0930j c0930j) {
                this();
            }

            private n() {
                super(w6.DEFAULT_INSTANCE);
            }

            public n gh(EnumC0933w6 enumC0933w6) {
                copyOnWrite();
                ((w6) this.instance).r(enumC0933w6);
                return this;
            }

            public n mUb(String str) {
                copyOnWrite();
                ((w6) this.instance).Ik(str);
                return this;
            }

            public n xMQ(EnumC0931j enumC0931j) {
                copyOnWrite();
                ((w6) this.instance).ck(enumC0931j);
                return this;
            }
        }

        /* JADX INFO: renamed from: g0.j$w6$w6, reason: collision with other inner class name */
        public enum EnumC0933w6 implements nKK.w6 {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static final nKK.Ml f67031o = new C0934j();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f67034n;

            /* JADX INFO: renamed from: g0.j$w6$w6$j, reason: collision with other inner class name */
            class C0934j implements nKK.Ml {
                C0934j() {
                }

                @Override // com.google.protobuf.nKK.Ml
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public EnumC0933w6 findValueByNumber(int i2) {
                    return EnumC0933w6.rl(i2);
                }
            }

            public static EnumC0933w6 rl(int i2) {
                if (i2 == 0) {
                    return ORDER_UNSPECIFIED;
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
                    return this.f67034n;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            EnumC0933w6(int i2) {
                this.f67034n = i2;
            }
        }

        static {
            w6 w6Var = new w6();
            DEFAULT_INSTANCE = w6Var;
            g9s.registerDefaultInstance(w6.class, w6Var);
        }

        public static n HI() {
            return (n) DEFAULT_INSTANCE.createBuilder();
        }

        public EnumC0933w6 az() {
            if (this.valueModeCase_ != 2) {
                return EnumC0933w6.ORDER_UNSPECIFIED;
            }
            EnumC0933w6 enumC0933w6Rl = EnumC0933w6.rl(((Integer) this.valueMode_).intValue());
            return enumC0933w6Rl == null ? EnumC0933w6.UNRECOGNIZED : enumC0933w6Rl;
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            C0930j c0930j = null;
            switch (C0930j.f67019n[fux.ordinal()]) {
                case 1:
                    return new w6();
                case 2:
                    return new n(c0930j);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
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

        public String qie() {
            return this.fieldPath_;
        }

        public Ml ty() {
            return Ml.rl(this.valueModeCase_);
        }

        private w6() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ik(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ck(EnumC0931j enumC0931j) {
            this.valueMode_ = Integer.valueOf(enumC0931j.getNumber());
            this.valueModeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(EnumC0933w6 enumC0933w6) {
            this.valueMode_ = Integer.valueOf(enumC0933w6.getNumber());
            this.valueModeCase_ = 2;
        }
    }

    /* JADX INFO: renamed from: g0.j$j, reason: collision with other inner class name */
    static /* synthetic */ class C0930j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67019n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f67019n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67019n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67019n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67019n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67019n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67019n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67019n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        g9s.registerDefaultInstance(j.class, jVar);
    }

    public static j HI(byte[] bArr) {
        return (j) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    private void qie() {
        nKK.Dsr dsr = this.fields_;
        if (dsr.isModifiable()) {
            return;
        }
        this.fields_ = g9s.mutableCopy(dsr);
    }

    public static n ty() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public List az() {
        return this.fields_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        C0930j c0930j = null;
        switch (C0930j.f67019n[fux.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new n(c0930j);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", w6.class, "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (j.class) {
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

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck(Ml ml) {
        this.queryScope_ = ml.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gh(w6 w6Var) {
        w6Var.getClass();
        qie();
        this.fields_.add(w6Var);
    }
}
