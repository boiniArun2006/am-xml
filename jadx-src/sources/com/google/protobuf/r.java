package com.google.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r BOOL;
    public static final r BOOL_LIST;
    public static final r BOOL_LIST_PACKED;
    public static final r BYTES;
    public static final r BYTES_LIST;
    public static final r DOUBLE;
    public static final r DOUBLE_LIST;
    public static final r DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final r ENUM;
    public static final r ENUM_LIST;
    public static final r ENUM_LIST_PACKED;
    public static final r FIXED32;
    public static final r FIXED32_LIST;
    public static final r FIXED32_LIST_PACKED;
    public static final r FIXED64;
    public static final r FIXED64_LIST;
    public static final r FIXED64_LIST_PACKED;
    public static final r FLOAT;
    public static final r FLOAT_LIST;
    public static final r FLOAT_LIST_PACKED;
    public static final r GROUP;
    public static final r GROUP_LIST;
    public static final r INT32;
    public static final r INT32_LIST;
    public static final r INT32_LIST_PACKED;
    public static final r INT64;
    public static final r INT64_LIST;
    public static final r INT64_LIST_PACKED;
    public static final r MAP;
    public static final r MESSAGE;
    public static final r MESSAGE_LIST;
    public static final r SFIXED32;
    public static final r SFIXED32_LIST;
    public static final r SFIXED32_LIST_PACKED;
    public static final r SFIXED64;
    public static final r SFIXED64_LIST;
    public static final r SFIXED64_LIST_PACKED;
    public static final r SINT32;
    public static final r SINT32_LIST;
    public static final r SINT32_LIST_PACKED;
    public static final r SINT64;
    public static final r SINT64_LIST;
    public static final r SINT64_LIST_PACKED;
    public static final r STRING;
    public static final r STRING_LIST;
    public static final r UINT32;
    public static final r UINT32_LIST;
    public static final r UINT32_LIST_PACKED;
    public static final r UINT64;
    public static final r UINT64_LIST;
    public static final r UINT64_LIST_PACKED;
    private static final r[] VALUES;
    private final n collection;
    private final Class<?> elementType;
    private final int id;
    private final Ln javaType;
    private final boolean primitiveScalar;

    enum n {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        public boolean isList() {
            return this.isList;
        }

        n(boolean z2) {
            this.isList = z2;
        }
    }

    static /* synthetic */ class j {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

        static {
            int[] iArr = new int[Ln.values().length];
            $SwitchMap$com$google$protobuf$JavaType = iArr;
            try {
                iArr[Ln.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[Ln.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[Ln.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[n.values().length];
            $SwitchMap$com$google$protobuf$FieldType$Collection = iArr2;
            try {
                iArr2[n.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[n.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[n.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        n nVar = n.SCALAR;
        Ln ln2 = Ln.DOUBLE;
        r rVar = new r("DOUBLE", 0, 0, nVar, ln2);
        DOUBLE = rVar;
        Ln ln3 = Ln.FLOAT;
        r rVar2 = new r("FLOAT", 1, 1, nVar, ln3);
        FLOAT = rVar2;
        Ln ln4 = Ln.LONG;
        r rVar3 = new r("INT64", 2, 2, nVar, ln4);
        INT64 = rVar3;
        r rVar4 = new r("UINT64", 3, 3, nVar, ln4);
        UINT64 = rVar4;
        Ln ln5 = Ln.INT;
        r rVar5 = new r("INT32", 4, 4, nVar, ln5);
        INT32 = rVar5;
        r rVar6 = new r("FIXED64", 5, 5, nVar, ln4);
        FIXED64 = rVar6;
        r rVar7 = new r("FIXED32", 6, 6, nVar, ln5);
        FIXED32 = rVar7;
        Ln ln6 = Ln.BOOLEAN;
        r rVar8 = new r("BOOL", 7, 7, nVar, ln6);
        BOOL = rVar8;
        Ln ln7 = Ln.STRING;
        r rVar9 = new r("STRING", 8, 8, nVar, ln7);
        STRING = rVar9;
        Ln ln8 = Ln.MESSAGE;
        r rVar10 = new r("MESSAGE", 9, 9, nVar, ln8);
        MESSAGE = rVar10;
        Ln ln9 = Ln.BYTE_STRING;
        r rVar11 = new r("BYTES", 10, 10, nVar, ln9);
        BYTES = rVar11;
        r rVar12 = new r("UINT32", 11, 11, nVar, ln5);
        UINT32 = rVar12;
        Ln ln10 = Ln.ENUM;
        r rVar13 = new r("ENUM", 12, 12, nVar, ln10);
        ENUM = rVar13;
        r rVar14 = new r("SFIXED32", 13, 13, nVar, ln5);
        SFIXED32 = rVar14;
        r rVar15 = new r("SFIXED64", 14, 14, nVar, ln4);
        SFIXED64 = rVar15;
        r rVar16 = new r("SINT32", 15, 15, nVar, ln5);
        SINT32 = rVar16;
        r rVar17 = new r("SINT64", 16, 16, nVar, ln4);
        SINT64 = rVar17;
        r rVar18 = new r("GROUP", 17, 17, nVar, ln8);
        GROUP = rVar18;
        n nVar2 = n.VECTOR;
        r rVar19 = new r("DOUBLE_LIST", 18, 18, nVar2, ln2);
        DOUBLE_LIST = rVar19;
        r rVar20 = new r("FLOAT_LIST", 19, 19, nVar2, ln3);
        FLOAT_LIST = rVar20;
        r rVar21 = new r("INT64_LIST", 20, 20, nVar2, ln4);
        INT64_LIST = rVar21;
        r rVar22 = new r("UINT64_LIST", 21, 21, nVar2, ln4);
        UINT64_LIST = rVar22;
        r rVar23 = new r("INT32_LIST", 22, 22, nVar2, ln5);
        INT32_LIST = rVar23;
        r rVar24 = new r("FIXED64_LIST", 23, 23, nVar2, ln4);
        FIXED64_LIST = rVar24;
        r rVar25 = new r("FIXED32_LIST", 24, 24, nVar2, ln5);
        FIXED32_LIST = rVar25;
        r rVar26 = new r("BOOL_LIST", 25, 25, nVar2, ln6);
        BOOL_LIST = rVar26;
        r rVar27 = new r("STRING_LIST", 26, 26, nVar2, ln7);
        STRING_LIST = rVar27;
        r rVar28 = new r("MESSAGE_LIST", 27, 27, nVar2, ln8);
        MESSAGE_LIST = rVar28;
        r rVar29 = new r("BYTES_LIST", 28, 28, nVar2, ln9);
        BYTES_LIST = rVar29;
        r rVar30 = new r("UINT32_LIST", 29, 29, nVar2, ln5);
        UINT32_LIST = rVar30;
        r rVar31 = new r("ENUM_LIST", 30, 30, nVar2, ln10);
        ENUM_LIST = rVar31;
        r rVar32 = new r("SFIXED32_LIST", 31, 31, nVar2, ln5);
        SFIXED32_LIST = rVar32;
        r rVar33 = new r("SFIXED64_LIST", 32, 32, nVar2, ln4);
        SFIXED64_LIST = rVar33;
        r rVar34 = new r("SINT32_LIST", 33, 33, nVar2, ln5);
        SINT32_LIST = rVar34;
        r rVar35 = new r("SINT64_LIST", 34, 34, nVar2, ln4);
        SINT64_LIST = rVar35;
        n nVar3 = n.PACKED_VECTOR;
        r rVar36 = new r("DOUBLE_LIST_PACKED", 35, 35, nVar3, ln2);
        DOUBLE_LIST_PACKED = rVar36;
        r rVar37 = new r("FLOAT_LIST_PACKED", 36, 36, nVar3, ln3);
        FLOAT_LIST_PACKED = rVar37;
        r rVar38 = new r("INT64_LIST_PACKED", 37, 37, nVar3, ln4);
        INT64_LIST_PACKED = rVar38;
        r rVar39 = new r("UINT64_LIST_PACKED", 38, 38, nVar3, ln4);
        UINT64_LIST_PACKED = rVar39;
        r rVar40 = new r("INT32_LIST_PACKED", 39, 39, nVar3, ln5);
        INT32_LIST_PACKED = rVar40;
        r rVar41 = new r("FIXED64_LIST_PACKED", 40, 40, nVar3, ln4);
        FIXED64_LIST_PACKED = rVar41;
        r rVar42 = new r("FIXED32_LIST_PACKED", 41, 41, nVar3, ln5);
        FIXED32_LIST_PACKED = rVar42;
        r rVar43 = new r("BOOL_LIST_PACKED", 42, 42, nVar3, ln6);
        BOOL_LIST_PACKED = rVar43;
        r rVar44 = new r("UINT32_LIST_PACKED", 43, 43, nVar3, ln5);
        UINT32_LIST_PACKED = rVar44;
        r rVar45 = new r("ENUM_LIST_PACKED", 44, 44, nVar3, ln10);
        ENUM_LIST_PACKED = rVar45;
        r rVar46 = new r("SFIXED32_LIST_PACKED", 45, 45, nVar3, ln5);
        SFIXED32_LIST_PACKED = rVar46;
        r rVar47 = new r("SFIXED64_LIST_PACKED", 46, 46, nVar3, ln4);
        SFIXED64_LIST_PACKED = rVar47;
        r rVar48 = new r("SINT32_LIST_PACKED", 47, 47, nVar3, ln5);
        SINT32_LIST_PACKED = rVar48;
        r rVar49 = new r("SINT64_LIST_PACKED", 48, 48, nVar3, ln4);
        SINT64_LIST_PACKED = rVar49;
        r rVar50 = new r("GROUP_LIST", 49, 49, nVar2, ln8);
        GROUP_LIST = rVar50;
        r rVar51 = new r("MAP", 50, 50, n.MAP, Ln.VOID);
        MAP = rVar51;
        $VALUES = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, rVar15, rVar16, rVar17, rVar18, rVar19, rVar20, rVar21, rVar22, rVar23, rVar24, rVar25, rVar26, rVar27, rVar28, rVar29, rVar30, rVar31, rVar32, rVar33, rVar34, rVar35, rVar36, rVar37, rVar38, rVar39, rVar40, rVar41, rVar42, rVar43, rVar44, rVar45, rVar46, rVar47, rVar48, rVar49, rVar50, rVar51};
        EMPTY_TYPES = new Type[0];
        r[] rVarArrValues = values();
        VALUES = new r[rVarArrValues.length];
        for (r rVar52 : rVarArrValues) {
            VALUES[rVar52.id] = rVar52;
        }
    }

    public static r forId(int i2) {
        if (i2 < 0) {
            return null;
        }
        r[] rVarArr = VALUES;
        if (i2 >= rVarArr.length) {
            return null;
        }
        return rVarArr[i2];
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i2 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i2 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i2];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i2++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i3 = 0; i3 < actualTypeArguments.length; i3++) {
                    Type type = actualTypeArguments[i3];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        for (int i5 = 0; i5 < typeParameters.length; i5++) {
                            if (type == typeParameters[i5]) {
                                actualTypeArguments[i3] = typeArr[i5];
                            }
                        }
                        throw new RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public Ln getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == n.MAP;
    }

    public boolean isPacked() {
        return n.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == n.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return n.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }

    private r(String str, int i2, int i3, n nVar, Ln ln2) {
        int i5;
        this.id = i3;
        this.collection = nVar;
        this.javaType = ln2;
        int i7 = j.$SwitchMap$com$google$protobuf$FieldType$Collection[nVar.ordinal()];
        if (i7 != 1 && i7 != 2) {
            this.elementType = null;
        } else {
            this.elementType = ln2.getBoxedType();
        }
        this.primitiveScalar = (nVar != n.SCALAR || (i5 = j.$SwitchMap$com$google$protobuf$JavaType[ln2.ordinal()]) == 1 || i5 == 2 || i5 == 3) ? false : true;
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (!(listParameter instanceof Class)) {
            return true;
        }
        return this.elementType.isAssignableFrom((Class) listParameter);
    }
}
