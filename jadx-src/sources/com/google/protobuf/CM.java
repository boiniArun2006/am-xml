package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class CM {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class Ml {
        private static final /* synthetic */ Ml[] $VALUES;
        public static final Ml LAZY;
        public static final Ml LOOSE;
        public static final Ml STRICT;

        private Ml(String str, int i2) {
        }

        abstract Object readString(AbstractC1923o abstractC1923o) throws IOException;

        enum j extends Ml {
            j(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.protobuf.CM.Ml
            Object readString(AbstractC1923o abstractC1923o) throws IOException {
                return abstractC1923o.readString();
            }
        }

        enum n extends Ml {
            n(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.protobuf.CM.Ml
            Object readString(AbstractC1923o abstractC1923o) throws IOException {
                return abstractC1923o.readStringRequireUtf8();
            }
        }

        enum w6 extends Ml {
            w6(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.protobuf.CM.Ml
            Object readString(AbstractC1923o abstractC1923o) throws IOException {
                return abstractC1923o.readBytes();
            }
        }

        static {
            j jVar = new j("LOOSE", 0);
            LOOSE = jVar;
            n nVar = new n("STRICT", 1);
            STRICT = nVar;
            w6 w6Var = new w6("LAZY", 2);
            LAZY = w6Var;
            $VALUES = new Ml[]{jVar, nVar, w6Var};
        }

        /* synthetic */ Ml(String str, int i2, j jVar) {
            this(str, i2);
        }

        public static Ml valueOf(String str) {
            return (Ml) Enum.valueOf(Ml.class, str);
        }

        public static Ml[] values() {
            return (Ml[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class n {
        private static final /* synthetic */ n[] $VALUES;
        public static final n BOOL;
        public static final n BYTES;
        public static final n DOUBLE;
        public static final n ENUM;
        public static final n FIXED32;
        public static final n FIXED64;
        public static final n FLOAT;
        public static final n GROUP;
        public static final n INT32;
        public static final n INT64;
        public static final n MESSAGE;
        public static final n SFIXED32;
        public static final n SFIXED64;
        public static final n SINT32;
        public static final n SINT64;
        public static final n STRING;
        public static final n UINT32;
        public static final n UINT64;
        private final w6 javaType;
        private final int wireType;

        enum Ml extends n {
            Ml(String str, int i2, w6 w6Var, int i3) {
                super(str, i2, w6Var, i3, null);
            }

            @Override // com.google.protobuf.CM.n
            public boolean isPackable() {
                return false;
            }
        }

        enum j extends n {
            j(String str, int i2, w6 w6Var, int i3) {
                super(str, i2, w6Var, i3, null);
            }

            @Override // com.google.protobuf.CM.n
            public boolean isPackable() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.CM$n$n, reason: collision with other inner class name */
        enum C0821n extends n {
            C0821n(String str, int i2, w6 w6Var, int i3) {
                super(str, i2, w6Var, i3, null);
            }

            @Override // com.google.protobuf.CM.n
            public boolean isPackable() {
                return false;
            }
        }

        enum w6 extends n {
            w6(String str, int i2, w6 w6Var, int i3) {
                super(str, i2, w6Var, i3, null);
            }

            @Override // com.google.protobuf.CM.n
            public boolean isPackable() {
                return false;
            }
        }

        /* synthetic */ n(String str, int i2, w6 w6Var, int i3, j jVar) {
            this(str, i2, w6Var, i3);
        }

        public boolean isPackable() {
            return true;
        }

        static {
            n nVar = new n("DOUBLE", 0, w6.DOUBLE, 1);
            DOUBLE = nVar;
            n nVar2 = new n("FLOAT", 1, w6.FLOAT, 5);
            FLOAT = nVar2;
            w6 w6Var = w6.LONG;
            n nVar3 = new n("INT64", 2, w6Var, 0);
            INT64 = nVar3;
            n nVar4 = new n("UINT64", 3, w6Var, 0);
            UINT64 = nVar4;
            w6 w6Var2 = w6.INT;
            n nVar5 = new n("INT32", 4, w6Var2, 0);
            INT32 = nVar5;
            n nVar6 = new n("FIXED64", 5, w6Var, 1);
            FIXED64 = nVar6;
            n nVar7 = new n("FIXED32", 6, w6Var2, 5);
            FIXED32 = nVar7;
            n nVar8 = new n("BOOL", 7, w6.BOOLEAN, 0);
            BOOL = nVar8;
            j jVar = new j("STRING", 8, w6.STRING, 2);
            STRING = jVar;
            w6 w6Var3 = w6.MESSAGE;
            C0821n c0821n = new C0821n("GROUP", 9, w6Var3, 3);
            GROUP = c0821n;
            w6 w6Var4 = new w6("MESSAGE", 10, w6Var3, 2);
            MESSAGE = w6Var4;
            Ml ml = new Ml("BYTES", 11, w6.BYTE_STRING, 2);
            BYTES = ml;
            n nVar9 = new n("UINT32", 12, w6Var2, 0);
            UINT32 = nVar9;
            n nVar10 = new n("ENUM", 13, w6.ENUM, 0);
            ENUM = nVar10;
            n nVar11 = new n("SFIXED32", 14, w6Var2, 5);
            SFIXED32 = nVar11;
            n nVar12 = new n("SFIXED64", 15, w6Var, 1);
            SFIXED64 = nVar12;
            n nVar13 = new n("SINT32", 16, w6Var2, 0);
            SINT32 = nVar13;
            n nVar14 = new n("SINT64", 17, w6Var, 0);
            SINT64 = nVar14;
            $VALUES = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, jVar, c0821n, w6Var4, ml, nVar9, nVar10, nVar11, nVar12, nVar13, nVar14};
        }

        private n(String str, int i2, w6 w6Var, int i3) {
            this.javaType = w6Var;
            this.wireType = i3;
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) $VALUES.clone();
        }

        public w6 getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }
    }

    public enum w6 {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        Object getDefaultDefault() {
            return this.defaultDefault;
        }

        w6(Object obj) {
            this.defaultDefault = obj;
        }
    }

    public static int getTagFieldNumber(int i2) {
        return i2 >>> 3;
    }

    public static int getTagWireType(int i2) {
        return i2 & 7;
    }

    static int makeTag(int i2, int i3) {
        return (i2 << 3) | i3;
    }

    static /* synthetic */ class j {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[n.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[n.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[n.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static Object readPrimitiveField(AbstractC1923o abstractC1923o, n nVar, Ml ml) throws IOException {
        switch (j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[nVar.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC1923o.readDouble());
            case 2:
                return Float.valueOf(abstractC1923o.readFloat());
            case 3:
                return Long.valueOf(abstractC1923o.readInt64());
            case 4:
                return Long.valueOf(abstractC1923o.readUInt64());
            case 5:
                return Integer.valueOf(abstractC1923o.readInt32());
            case 6:
                return Long.valueOf(abstractC1923o.readFixed64());
            case 7:
                return Integer.valueOf(abstractC1923o.readFixed32());
            case 8:
                return Boolean.valueOf(abstractC1923o.readBool());
            case 9:
                return abstractC1923o.readBytes();
            case 10:
                return Integer.valueOf(abstractC1923o.readUInt32());
            case 11:
                return Integer.valueOf(abstractC1923o.readSFixed32());
            case 12:
                return Long.valueOf(abstractC1923o.readSFixed64());
            case 13:
                return Integer.valueOf(abstractC1923o.readSInt32());
            case 14:
                return Long.valueOf(abstractC1923o.readSInt64());
            case 15:
                return ml.readString(abstractC1923o);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private CM() {
    }
}
