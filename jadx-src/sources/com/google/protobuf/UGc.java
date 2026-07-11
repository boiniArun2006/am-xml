package com.google.protobuf;

import com.google.protobuf.nKK;
import java.lang.reflect.Field;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class UGc implements Comparable {
    private final Field cachedSizeField;
    private final boolean enforceUtf8;
    private final nKK.I28 enumVerifier;
    private final Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final fg oneof;
    private final Class<?> oneofStoredType;
    private final Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final r type;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    public static final class n {
        private Field cachedSizeField;
        private boolean enforceUtf8;
        private nKK.I28 enumVerifier;
        private Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private fg oneof;
        private Class<?> oneofStoredType;
        private Field presenceField;
        private int presenceMask;
        private boolean required;
        private r type;

        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
        }

        public UGc build() {
            fg fgVar = this.oneof;
            if (fgVar != null) {
                return UGc.forOneofMemberField(this.fieldNumber, this.type, fgVar, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return UGc.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            Field field = this.presenceField;
            if (field != null) {
                return this.required ? UGc.forLegacyRequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : UGc.forExplicitPresenceField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            nKK.I28 i28 = this.enumVerifier;
            if (i28 != null) {
                Field field2 = this.cachedSizeField;
                return field2 == null ? UGc.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, i28) : UGc.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, i28, field2);
            }
            Field field3 = this.cachedSizeField;
            return field3 == null ? UGc.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8) : UGc.forPackedField(this.field, this.fieldNumber, this.type, field3);
        }

        public n withCachedSizeField(Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public n withEnforceUtf8(boolean z2) {
            this.enforceUtf8 = z2;
            return this;
        }

        public n withEnumVerifier(nKK.I28 i28) {
            this.enumVerifier = i28;
            return this;
        }

        public n withField(Field field) {
            if (this.oneof != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.field = field;
            return this;
        }

        public n withFieldNumber(int i2) {
            this.fieldNumber = i2;
            return this;
        }

        public n withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public n withOneof(fg fgVar, Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneof = fgVar;
            this.oneofStoredType = cls;
            return this;
        }

        public n withPresence(Field field, int i2) {
            this.presenceField = (Field) nKK.checkNotNull(field, "presenceField");
            this.presenceMask = i2;
            return this;
        }

        public n withRequired(boolean z2) {
            this.required = z2;
            return this;
        }

        public n withType(r rVar) {
            this.type = rVar;
            return this;
        }
    }

    private static boolean isExactlyOneBitSet(int i2) {
        return i2 != 0 && (i2 & (i2 + (-1))) == 0;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static /* synthetic */ class j {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

        static {
            int[] iArr = new int[r.values().length];
            $SwitchMap$com$google$protobuf$FieldType = iArr;
            try {
                iArr[r.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[r.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[r.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[r.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void checkFieldNumber(int i2) {
        if (i2 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i2);
    }

    public static UGc forExplicitPresenceField(Field field, int i2, r rVar, Field field2, int i3, boolean z2, nKK.I28 i28) {
        checkFieldNumber(i2);
        nKK.checkNotNull(field, "field");
        nKK.checkNotNull(rVar, "fieldType");
        nKK.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i3)) {
            return new UGc(field, i2, rVar, null, field2, i3, false, z2, null, null, null, i28, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i3);
    }

    public static UGc forField(Field field, int i2, r rVar, boolean z2) {
        checkFieldNumber(i2);
        nKK.checkNotNull(field, "field");
        nKK.checkNotNull(rVar, "fieldType");
        if (rVar == r.MESSAGE_LIST || rVar == r.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new UGc(field, i2, rVar, null, null, 0, false, z2, null, null, null, null, null);
    }

    public static UGc forLegacyRequiredField(Field field, int i2, r rVar, Field field2, int i3, boolean z2, nKK.I28 i28) {
        checkFieldNumber(i2);
        nKK.checkNotNull(field, "field");
        nKK.checkNotNull(rVar, Apsps.abrCa);
        nKK.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i3)) {
            return new UGc(field, i2, rVar, null, field2, i3, true, z2, null, null, null, i28, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i3);
    }

    public static UGc forMapField(Field field, int i2, Object obj, nKK.I28 i28) {
        nKK.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i2);
        nKK.checkNotNull(field, "field");
        return new UGc(field, i2, r.MAP, null, null, 0, false, true, null, null, obj, i28, null);
    }

    public static UGc forPackedField(Field field, int i2, r rVar, Field field2) {
        checkFieldNumber(i2);
        nKK.checkNotNull(field, "field");
        nKK.checkNotNull(rVar, "fieldType");
        if (rVar == r.MESSAGE_LIST || rVar == r.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new UGc(field, i2, rVar, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static n newBuilder() {
        return new n(null);
    }

    @Override // java.lang.Comparable
    public int compareTo(UGc uGc) {
        return this.fieldNumber - uGc.fieldNumber;
    }

    public Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public nKK.I28 getEnumVerifier() {
        return this.enumVerifier;
    }

    public Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i2 = j.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i2 == 3 || i2 == 4) {
            return this.messageClass;
        }
        return null;
    }

    public fg getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public r getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    private UGc(Field field, int i2, r rVar, Class<?> cls, Field field2, int i3, boolean z2, boolean z3, fg fgVar, Class<?> cls2, Object obj, nKK.I28 i28, Field field3) {
        this.field = field;
        this.type = rVar;
        this.messageClass = cls;
        this.fieldNumber = i2;
        this.presenceField = field2;
        this.presenceMask = i3;
        this.required = z2;
        this.enforceUtf8 = z3;
        this.oneof = fgVar;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = i28;
        this.cachedSizeField = field3;
    }

    public static UGc forFieldWithEnumVerifier(Field field, int i2, r rVar, nKK.I28 i28) {
        checkFieldNumber(i2);
        nKK.checkNotNull(field, "field");
        return new UGc(field, i2, rVar, null, null, 0, false, false, null, null, null, i28, null);
    }

    public static UGc forOneofMemberField(int i2, r rVar, fg fgVar, Class<?> cls, boolean z2, nKK.I28 i28) {
        checkFieldNumber(i2);
        nKK.checkNotNull(rVar, "fieldType");
        nKK.checkNotNull(fgVar, "oneof");
        nKK.checkNotNull(cls, "oneofStoredType");
        if (rVar.isScalar()) {
            return new UGc(null, i2, rVar, null, null, 0, false, z2, fgVar, cls, null, i28, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i2 + " is of type " + rVar);
    }

    public static UGc forPackedFieldWithEnumVerifier(Field field, int i2, r rVar, nKK.I28 i28, Field field2) {
        checkFieldNumber(i2);
        nKK.checkNotNull(field, "field");
        return new UGc(field, i2, rVar, null, null, 0, false, false, null, null, null, i28, field2);
    }

    public static UGc forRepeatedMessageField(Field field, int i2, r rVar, Class<?> cls) {
        checkFieldNumber(i2);
        nKK.checkNotNull(field, "field");
        nKK.checkNotNull(rVar, "fieldType");
        nKK.checkNotNull(cls, "messageClass");
        return new UGc(field, i2, rVar, cls, null, 0, false, false, null, null, null, null, null);
    }
}
