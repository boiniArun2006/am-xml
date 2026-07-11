package com.google.protobuf;

import com.google.protobuf.CM;
import com.google.protobuf.lej;
import com.google.protobuf.nKK;
import com.google.protobuf.yg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class Q {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final Q DEFAULT_INSTANCE = new Q(true);
    private final kO4 fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    static final class n {
        private kO4 fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        /* synthetic */ n(j jVar) {
            this();
        }

        private static <T extends w6> void replaceBuilders(kO4 ko4, boolean z2) {
            for (int i2 = 0; i2 < ko4.getNumArrayEntries(); i2++) {
                replaceBuilders(ko4.getArrayEntryAt(i2), z2);
            }
            Iterator<Map.Entry<Comparable<Object>, Object>> it = ko4.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders(it.next(), z2);
            }
        }

        public Q build() {
            return buildImpl(false);
        }

        public Q buildPartial() {
            return buildImpl(true);
        }

        public boolean isInitialized() {
            for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
                if (!Q.isInitialized(this.fields.getArrayEntryAt(i2))) {
                    return false;
                }
            }
            Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!Q.isInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }

        private n() {
            this(kO4.newFieldMap(16));
        }

        private Q buildImpl(boolean z2) {
            if (this.fields.isEmpty()) {
                return Q.emptySet();
            }
            this.isMutable = false;
            kO4 ko4CloneAllFieldsMap = this.fields;
            if (this.hasNestedBuilders) {
                ko4CloneAllFieldsMap = Q.cloneAllFieldsMap(ko4CloneAllFieldsMap, false);
                replaceBuilders(ko4CloneAllFieldsMap, z2);
            }
            Q q2 = new Q(ko4CloneAllFieldsMap, null);
            q2.hasLazyField = this.hasLazyField;
            return q2;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = Q.cloneAllFieldsMap(this.fields, true);
            this.isMutable = true;
        }

        public static <T extends w6> n fromFieldSet(Q q2) {
            n nVar = new n(Q.cloneAllFieldsMap(q2.fields, true));
            nVar.hasLazyField = q2.hasLazyField;
            return nVar;
        }

        private static Object replaceBuilder(Object obj, boolean z2) {
            if (!(obj instanceof yg.j)) {
                return obj;
            }
            yg.j jVar = (yg.j) obj;
            return z2 ? jVar.buildPartial() : jVar.build();
        }

        public Map<w6, Object> getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
            }
            kO4 ko4CloneAllFieldsMap = Q.cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                ko4CloneAllFieldsMap.makeImmutable();
                return ko4CloneAllFieldsMap;
            }
            replaceBuilders(ko4CloneAllFieldsMap, true);
            return ko4CloneAllFieldsMap;
        }

        Object getFieldAllowBuilders(w6 w6Var) {
            Object obj = this.fields.get(w6Var);
            return obj instanceof lej ? ((lej) obj).getValue() : obj;
        }

        public Object getRepeatedField(w6 w6Var, int i2) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(w6Var, i2), true);
        }

        private n(kO4 ko4) {
            this.fields = ko4;
            this.isMutable = true;
        }

        private void mergeFromField(Map.Entry<w6, Object> entry) {
            w6 key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof lej) {
                value = ((lej) value).getValue();
            }
            if (key.isRepeated()) {
                List arrayList = (List) getFieldAllowBuilders(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.fields.put((Comparable<Object>) key, (Object) arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(Q.cloneIfMutable(it.next()));
                }
                return;
            }
            if (key.getLiteJavaType() == CM.w6.MESSAGE) {
                Object fieldAllowBuilders = getFieldAllowBuilders(key);
                if (fieldAllowBuilders == null) {
                    this.fields.put((Comparable<Object>) key, Q.cloneIfMutable(value));
                    return;
                } else if (fieldAllowBuilders instanceof yg.j) {
                    key.internalMergeFrom((yg.j) fieldAllowBuilders, (yg) value);
                    return;
                } else {
                    this.fields.put((Comparable<Object>) key, (Object) key.internalMergeFrom(((yg) fieldAllowBuilders).toBuilder(), (yg) value).build());
                    return;
                }
            }
            this.fields.put((Comparable<Object>) key, Q.cloneIfMutable(value));
        }

        private void verifyType(w6 w6Var, Object obj) {
            if (!Q.isValidType(w6Var.getLiteType(), obj)) {
                if (w6Var.getLiteType().getJavaType() == CM.w6.MESSAGE && (obj instanceof yg.j)) {
                } else {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(w6Var.getNumber()), w6Var.getLiteType().getJavaType(), obj.getClass().getName()));
                }
            }
        }

        public void addRepeatedField(w6 w6Var, Object obj) {
            boolean z2;
            List arrayList;
            ensureIsMutable();
            if (w6Var.isRepeated()) {
                if (!this.hasNestedBuilders && !(obj instanceof yg.j)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.hasNestedBuilders = z2;
                verifyType(w6Var, obj);
                Object fieldAllowBuilders = getFieldAllowBuilders(w6Var);
                if (fieldAllowBuilders == null) {
                    arrayList = new ArrayList();
                    this.fields.put((Comparable<Object>) w6Var, (Object) arrayList);
                } else {
                    arrayList = (List) fieldAllowBuilders;
                }
                arrayList.add(obj);
                return;
            }
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }

        public void clearField(w6 w6Var) {
            ensureIsMutable();
            this.fields.remove(w6Var);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Object getField(w6 w6Var) {
            return replaceBuilders(w6Var, getFieldAllowBuilders(w6Var), true);
        }

        Object getRepeatedFieldAllowBuilders(w6 w6Var, int i2) {
            if (w6Var.isRepeated()) {
                Object fieldAllowBuilders = getFieldAllowBuilders(w6Var);
                if (fieldAllowBuilders != null) {
                    return ((List) fieldAllowBuilders).get(i2);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public int getRepeatedFieldCount(w6 w6Var) {
            if (w6Var.isRepeated()) {
                Object fieldAllowBuilders = getFieldAllowBuilders(w6Var);
                if (fieldAllowBuilders == null) {
                    return 0;
                }
                return ((List) fieldAllowBuilders).size();
            }
            throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
        }

        public boolean hasField(w6 w6Var) {
            if (!w6Var.isRepeated()) {
                if (this.fields.get(w6Var) != null) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFrom(Q q2) {
            ensureIsMutable();
            for (int i2 = 0; i2 < q2.fields.getNumArrayEntries(); i2++) {
                mergeFromField(q2.fields.getArrayEntryAt(i2));
            }
            Iterator<Map.Entry<Comparable<Object>, Object>> it = q2.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField(it.next());
            }
        }

        public void setField(w6 w6Var, Object obj) {
            boolean z2;
            ensureIsMutable();
            boolean z3 = false;
            if (w6Var.isRepeated()) {
                if (obj instanceof List) {
                    ArrayList arrayList = new ArrayList((List) obj);
                    for (Object obj2 : arrayList) {
                        verifyType(w6Var, obj2);
                        if (!this.hasNestedBuilders && !(obj2 instanceof yg.j)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        this.hasNestedBuilders = z2;
                    }
                    obj = arrayList;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            } else {
                verifyType(w6Var, obj);
            }
            if (obj instanceof lej) {
                this.hasLazyField = true;
            }
            if (this.hasNestedBuilders || (obj instanceof yg.j)) {
                z3 = true;
            }
            this.hasNestedBuilders = z3;
            this.fields.put((Comparable<Object>) w6Var, obj);
        }

        public void setRepeatedField(w6 w6Var, int i2, Object obj) {
            boolean z2;
            ensureIsMutable();
            if (w6Var.isRepeated()) {
                if (!this.hasNestedBuilders && !(obj instanceof yg.j)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.hasNestedBuilders = z2;
                Object fieldAllowBuilders = getFieldAllowBuilders(w6Var);
                if (fieldAllowBuilders != null) {
                    verifyType(w6Var, obj);
                    ((List) fieldAllowBuilders).set(i2, obj);
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        private static <T extends w6> void replaceBuilders(Map.Entry<T, Object> entry, boolean z2) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z2));
        }

        private static <T extends w6> Object replaceBuilders(T t3, Object obj, boolean z2) {
            if (obj == null || t3.getLiteJavaType() != CM.w6.MESSAGE) {
                return obj;
            }
            if (t3.isRepeated()) {
                if (obj instanceof List) {
                    List arrayList = (List) obj;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Object obj2 = arrayList.get(i2);
                        Object objReplaceBuilder = replaceBuilder(obj2, z2);
                        if (objReplaceBuilder != obj2) {
                            if (arrayList == obj) {
                                arrayList = new ArrayList(arrayList);
                            }
                            arrayList.set(i2, objReplaceBuilder);
                        }
                    }
                    return arrayList;
                }
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            return replaceBuilder(obj, z2);
        }
    }

    public interface w6 extends Comparable {
        nKK.Ml getEnumType();

        CM.w6 getLiteJavaType();

        CM.n getLiteType();

        int getNumber();

        yg.j internalMergeFrom(yg.j jVar, yg ygVar);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ Q(kO4 ko4, j jVar) {
        this(ko4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getMessageSetSerializedSize() {
        int messageSetSerializedSize = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i2));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize(it.next());
        }
        return messageSetSerializedSize;
    }

    public int getSerializedSize() {
        int iComputeFieldSize = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i2);
            iComputeFieldSize += computeFieldSize((w6) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            iComputeFieldSize += computeFieldSize((w6) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean isInitialized() {
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i2))) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFrom(Q q2) {
        for (int i2 = 0; i2 < q2.fields.getNumArrayEntries(); i2++) {
            mergeFromField(q2.fields.getArrayEntryAt(i2));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = q2.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i2), codedOutputStream);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), codedOutputStream);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i2);
            writeField((w6) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            writeField((w6) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    static /* synthetic */ class j {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[CM.n.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[CM.n.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[CM.w6.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[CM.w6.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[CM.w6.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[CM.w6.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[CM.w6.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[CM.w6.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[CM.w6.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[CM.w6.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[CM.w6.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[CM.w6.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    private Q() {
        this.fields = kO4.newFieldMap(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends w6> kO4 cloneAllFieldsMap(kO4 ko4, boolean z2) {
        kO4 ko4NewFieldMap = kO4.newFieldMap(16);
        for (int i2 = 0; i2 < ko4.getNumArrayEntries(); i2++) {
            cloneFieldEntry(ko4NewFieldMap, ko4.getArrayEntryAt(i2), z2);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = ko4.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(ko4NewFieldMap, it.next(), z2);
        }
        return ko4NewFieldMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int computeElementSizeNoTag(CM.n nVar, Object obj) {
        switch (j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[nVar.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((yg) obj);
            case 10:
                return obj instanceof lej ? CodedOutputStream.computeLazyFieldSizeNoTag((lej) obj) : CodedOutputStream.computeMessageSizeNoTag((yg) obj);
            case 11:
                return obj instanceof C ? CodedOutputStream.computeBytesSizeNoTag((C) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof C ? CodedOutputStream.computeBytesSizeNoTag((C) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof nKK.w6 ? CodedOutputStream.computeEnumSizeNoTag(((nKK.w6) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends w6> Q emptySet() {
        return DEFAULT_INSTANCE;
    }

    static int getWireFormatForFieldType(CM.n nVar, boolean z2) {
        if (z2) {
            return 2;
        }
        return nVar.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof pO) {
            return ((pO) obj).isInitialized();
        }
        if (obj instanceof lej) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static <T extends w6> n newBuilder() {
        return new n((j) null);
    }

    public static <T extends w6> Q newFieldSet() {
        return new Q();
    }

    public static Object readPrimitiveField(AbstractC1923o abstractC1923o, CM.n nVar, boolean z2) throws IOException {
        return z2 ? CM.readPrimitiveField(abstractC1923o, nVar, CM.Ml.STRICT) : CM.readPrimitiveField(abstractC1923o, nVar, CM.Ml.LOOSE);
    }

    static void writeElement(CodedOutputStream codedOutputStream, CM.n nVar, int i2, Object obj) throws IOException {
        if (nVar == CM.n.GROUP) {
            codedOutputStream.writeGroup(i2, (yg) obj);
        } else {
            codedOutputStream.writeTag(i2, getWireFormatForFieldType(nVar, false));
            writeElementNoTag(codedOutputStream, nVar, obj);
        }
    }

    static void writeElementNoTag(CodedOutputStream codedOutputStream, CM.n nVar, Object obj) throws IOException {
        switch (j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[nVar.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((yg) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((yg) obj);
                break;
            case 11:
                if (!(obj instanceof C)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((C) obj);
                }
                break;
            case 12:
                if (!(obj instanceof C)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((C) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof nKK.w6)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((nKK.w6) obj).getNumber());
                }
                break;
        }
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(w6 w6Var) {
        this.fields.remove(w6Var);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Q m186clone() {
        Q qNewFieldSet = newFieldSet();
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i2);
            qNewFieldSet.setField((w6) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            qNewFieldSet.setField((w6) entry.getKey(), entry.getValue());
        }
        qNewFieldSet.hasLazyField = this.hasLazyField;
        return qNewFieldSet;
    }

    Iterator<Map.Entry<w6, Object>> descendingIterator() {
        return this.hasLazyField ? new lej.w6(this.fields.descendingEntrySet().iterator()) : this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return this.fields.equals(((Q) obj).fields);
        }
        return false;
    }

    public Map<w6, Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
        }
        kO4 ko4CloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
        if (this.fields.isImmutable()) {
            ko4CloneAllFieldsMap.makeImmutable();
        }
        return ko4CloneAllFieldsMap;
    }

    public Object getField(w6 w6Var) {
        Object obj = this.fields.get(w6Var);
        return obj instanceof lej ? ((lej) obj).getValue() : obj;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public Iterator<Map.Entry<w6, Object>> iterator() {
        return this.hasLazyField ? new lej.w6(this.fields.entrySet().iterator()) : this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i2);
            if (arrayEntryAt.getValue() instanceof g9s) {
                ((g9s) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    private static <T extends w6> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z2) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof lej) {
            map.put(key, ((lej) value).getValue());
        } else if (z2 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    static int computeElementSize(CM.n nVar, int i2, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i2);
        if (nVar == CM.n.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + computeElementSizeNoTag(nVar, obj);
    }

    public static int computeFieldSize(w6 w6Var, Object obj) {
        CM.n liteType = w6Var.getLiteType();
        int number = w6Var.getNumber();
        if (w6Var.isRepeated()) {
            List list = (List) obj;
            int iComputeElementSize = 0;
            if (w6Var.isPacked()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iComputeElementSize += computeElementSizeNoTag(liteType, it.next());
                }
                return CodedOutputStream.computeTagSize(number) + iComputeElementSize + CodedOutputStream.computeUInt32SizeNoTag(iComputeElementSize);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                iComputeElementSize += computeElementSize(liteType, number, it2.next());
            }
            return iComputeElementSize;
        }
        return computeElementSize(liteType, number, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(CM.n nVar, Object obj) {
        nKK.checkNotNull(obj);
        switch (j.$SwitchMap$com$google$protobuf$WireFormat$JavaType[nVar.getJavaType().ordinal()]) {
            case 7:
                if ((obj instanceof C) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof nKK.w6)) {
                }
                break;
            case 9:
                if ((obj instanceof yg) || (obj instanceof lej)) {
                }
                break;
        }
        return false;
    }

    private void mergeFromField(Map.Entry<w6, Object> entry) {
        w6 key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof lej) {
            value = ((lej) value).getValue();
        }
        if (key.isRepeated()) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((Comparable<Object>) key, field);
            return;
        }
        if (key.getLiteJavaType() == CM.w6.MESSAGE) {
            Object field2 = getField(key);
            if (field2 == null) {
                this.fields.put((Comparable<Object>) key, cloneIfMutable(value));
                return;
            } else {
                this.fields.put((Comparable<Object>) key, (Object) key.internalMergeFrom(((yg) field2).toBuilder(), (yg) value).build());
                return;
            }
        }
        this.fields.put((Comparable<Object>) key, cloneIfMutable(value));
    }

    private void verifyType(w6 w6Var, Object obj) {
        if (isValidType(w6Var.getLiteType(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(w6Var.getNumber()), w6Var.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void writeField(w6 w6Var, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        CM.n liteType = w6Var.getLiteType();
        int number = w6Var.getNumber();
        if (w6Var.isRepeated()) {
            List list = (List) obj;
            if (w6Var.isPacked()) {
                if (!list.isEmpty()) {
                    codedOutputStream.writeTag(number, 2);
                    Iterator it = list.iterator();
                    int iComputeElementSizeNoTag = 0;
                    while (it.hasNext()) {
                        iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, it.next());
                    }
                    codedOutputStream.writeUInt32NoTag(iComputeElementSizeNoTag);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        writeElementNoTag(codedOutputStream, liteType, it2.next());
                    }
                    return;
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElement(codedOutputStream, liteType, number, it3.next());
            }
            return;
        }
        if (obj instanceof lej) {
            writeElement(codedOutputStream, liteType, number, ((lej) obj).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj);
        }
    }

    public void addRepeatedField(w6 w6Var, Object obj) {
        List arrayList;
        if (w6Var.isRepeated()) {
            verifyType(w6Var, obj);
            Object field = getField(w6Var);
            if (field == null) {
                arrayList = new ArrayList();
                this.fields.put((Comparable<Object>) w6Var, (Object) arrayList);
            } else {
                arrayList = (List) field;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public Object getRepeatedField(w6 w6Var, int i2) {
        if (w6Var.isRepeated()) {
            Object field = getField(w6Var);
            if (field != null) {
                return ((List) field).get(i2);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getRepeatedFieldCount(w6 w6Var) {
        if (w6Var.isRepeated()) {
            Object field = getField(w6Var);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public boolean hasField(w6 w6Var) {
        if (!w6Var.isRepeated()) {
            if (this.fields.get(w6Var) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public void setField(w6 w6Var, Object obj) {
        if (w6Var.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    verifyType(w6Var, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            verifyType(w6Var, obj);
        }
        if (obj instanceof lej) {
            this.hasLazyField = true;
        }
        this.fields.put((Comparable<Object>) w6Var, obj);
    }

    public void setRepeatedField(w6 w6Var, int i2, Object obj) {
        if (w6Var.isRepeated()) {
            Object field = getField(w6Var);
            if (field != null) {
                verifyType(w6Var, obj);
                ((List) field).set(i2, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    private Q(boolean z2) {
        this(kO4.newFieldMap(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<w6, Object> entry) {
        w6 key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == CM.w6.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof lej) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (lej) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (yg) value);
        }
        return computeFieldSize(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends w6> boolean isInitialized(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != CM.w6.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(Map.Entry<w6, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        w6 key = entry.getKey();
        if (key.getLiteJavaType() == CM.w6.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof lej) {
                codedOutputStream.writeRawMessageSetExtension(entry.getKey().getNumber(), ((lej) value).toByteString());
                return;
            } else {
                codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (yg) value);
                return;
            }
        }
        writeField(key, entry.getValue(), codedOutputStream);
    }

    private Q(kO4 ko4) {
        this.fields = ko4;
        makeImmutable();
    }
}
