package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ln {
    private static final /* synthetic */ Ln[] $VALUES;
    public static final Ln BOOLEAN;
    public static final Ln BYTE_STRING;
    public static final Ln DOUBLE;
    public static final Ln ENUM;
    public static final Ln FLOAT;
    public static final Ln INT;
    public static final Ln LONG;
    public static final Ln MESSAGE;
    public static final Ln STRING;
    public static final Ln VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        Ln ln2 = new Ln("VOID", 0, Void.class, Void.class, null);
        VOID = ln2;
        Class cls = Integer.TYPE;
        Ln ln3 = new Ln("INT", 1, cls, Integer.class, 0);
        INT = ln3;
        Ln ln4 = new Ln("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = ln4;
        Ln ln5 = new Ln("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = ln5;
        Ln ln6 = new Ln("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = ln6;
        Ln ln7 = new Ln("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = ln7;
        Ln ln8 = new Ln("STRING", 6, String.class, String.class, "");
        STRING = ln8;
        Ln ln9 = new Ln("BYTE_STRING", 7, C.class, C.class, C.EMPTY);
        BYTE_STRING = ln9;
        Ln ln10 = new Ln("ENUM", 8, cls, Integer.class, null);
        ENUM = ln10;
        Ln ln11 = new Ln("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = ln11;
        $VALUES = new Ln[]{ln2, ln3, ln4, ln5, ln6, ln7, ln8, ln9, ln10, ln11};
    }

    public static Ln valueOf(String str) {
        return (Ln) Enum.valueOf(Ln.class, str);
    }

    public static Ln[] values() {
        return (Ln[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }

    private Ln(String str, int i2, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }
}
