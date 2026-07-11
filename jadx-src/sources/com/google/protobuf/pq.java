package com.google.protobuf;

import com.google.protobuf.Q;
import com.google.protobuf.nKK;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class pq {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final xuv UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final xuv UNKNOWN_FIELD_SET_LITE_SCHEMA = new t();

    static int computeSizeGroupList(int i2, List<yg> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i2, list.get(i3));
        }
        return iComputeGroupSize;
    }

    static int computeSizeMessageList(int i2, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iComputeTagSize += obj instanceof iwV ? CodedOutputStream.computeLazyFieldSizeNoTag((iwV) obj) : CodedOutputStream.computeMessageSizeNoTag((yg) obj);
        }
        return iComputeTagSize;
    }

    static <UT, UB> UB filterUnknownEnumList(Object obj, int i2, List<Integer> list, nKK.Ml ml, UB ub, xuv xuvVar) {
        if (ml == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (ml.findValueByNumber(iIntValue) == null) {
                    ub = (UB) storeUnknownEnum(obj, i2, iIntValue, ub, xuvVar);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i3 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Integer num = list.get(i5);
            int iIntValue2 = num.intValue();
            if (ml.findValueByNumber(iIntValue2) != null) {
                if (i5 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                ub = (UB) storeUnknownEnum(obj, i2, iIntValue2, ub, xuvVar);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return ub;
    }

    private static xuv getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (xuv) unknownFieldSetSchemaClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean shouldUseTableSwitch(int i2, int i3, int i5) {
        if (i3 < 40) {
            return true;
        }
        long j2 = ((long) i3) - ((long) i2);
        long j3 = i5;
        return j2 + 10 <= ((2 * j3) + 3) + ((j3 + 3) * 3);
    }

    public static void writeGroupList(int i2, List<?> list, crp crpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeGroupList(i2, list);
    }

    public static void writeMessageList(int i2, List<?> list, crp crpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeMessageList(i2, list);
    }

    static int computeSizeMessage(int i2, Object obj, R6 r6) {
        return obj instanceof iwV ? CodedOutputStream.computeLazyFieldSize(i2, (iwV) obj) : CodedOutputStream.computeMessageSize(i2, (yg) obj, r6);
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return g9.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!g9s.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(UGc[] uGcArr) {
        if (uGcArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(uGcArr[0].getFieldNumber(), uGcArr[uGcArr.length - 1].getFieldNumber(), uGcArr.length);
    }

    static <UT, UB> UB storeUnknownEnum(Object obj, int i2, int i3, UB ub, xuv xuvVar) {
        if (ub == null) {
            ub = (UB) xuvVar.getBuilderFromMessage(obj);
        }
        xuvVar.addVarint(ub, i2, i3);
        return ub;
    }

    static String toCamelCase(String str, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    z2 = true;
                } else if (i2 != 0 || z2) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt + ' '));
                }
            } else if (z2) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            z2 = false;
        }
        return sb.toString();
    }

    public static xuv unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static xuv unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i2, boolean z2, crp crpVar) throws IOException {
        if (z2) {
            crpVar.writeBool(i2, true);
        }
    }

    public static void writeBoolList(int i2, List<Boolean> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeBoolList(i2, list, z2);
    }

    public static void writeBytes(int i2, C c2, crp crpVar) throws IOException {
        if (c2 == null || c2.isEmpty()) {
            return;
        }
        crpVar.writeBytes(i2, c2);
    }

    public static void writeBytesList(int i2, List<C> list, crp crpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeBytesList(i2, list);
    }

    public static void writeDoubleList(int i2, List<Double> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeDoubleList(i2, list, z2);
    }

    public static void writeEnum(int i2, int i3, crp crpVar) throws IOException {
        if (i3 != 0) {
            crpVar.writeEnum(i2, i3);
        }
    }

    public static void writeEnumList(int i2, List<Integer> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeEnumList(i2, list, z2);
    }

    public static void writeFixed32(int i2, int i3, crp crpVar) throws IOException {
        if (i3 != 0) {
            crpVar.writeFixed32(i2, i3);
        }
    }

    public static void writeFixed32List(int i2, List<Integer> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeFixed32List(i2, list, z2);
    }

    public static void writeFixed64(int i2, long j2, crp crpVar) throws IOException {
        if (j2 != 0) {
            crpVar.writeFixed64(i2, j2);
        }
    }

    public static void writeFixed64List(int i2, List<Long> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeFixed64List(i2, list, z2);
    }

    public static void writeFloatList(int i2, List<Float> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeFloatList(i2, list, z2);
    }

    public static void writeInt32(int i2, int i3, crp crpVar) throws IOException {
        if (i3 != 0) {
            crpVar.writeInt32(i2, i3);
        }
    }

    public static void writeInt32List(int i2, List<Integer> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeInt32List(i2, list, z2);
    }

    public static void writeInt64(int i2, long j2, crp crpVar) throws IOException {
        if (j2 != 0) {
            crpVar.writeInt64(i2, j2);
        }
    }

    public static void writeInt64List(int i2, List<Long> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeInt64List(i2, list, z2);
    }

    public static void writeLazyFieldList(int i2, List<?> list, crp crpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((iwV) it.next()).writeTo(crpVar, i2);
        }
    }

    public static void writeMessage(int i2, Object obj, crp crpVar) throws IOException {
        if (obj != null) {
            crpVar.writeMessage(i2, obj);
        }
    }

    public static void writeSFixed32(int i2, int i3, crp crpVar) throws IOException {
        if (i3 != 0) {
            crpVar.writeSFixed32(i2, i3);
        }
    }

    public static void writeSFixed32List(int i2, List<Integer> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeSFixed32List(i2, list, z2);
    }

    public static void writeSFixed64(int i2, long j2, crp crpVar) throws IOException {
        if (j2 != 0) {
            crpVar.writeSFixed64(i2, j2);
        }
    }

    public static void writeSFixed64List(int i2, List<Long> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeSFixed64List(i2, list, z2);
    }

    public static void writeSInt32(int i2, int i3, crp crpVar) throws IOException {
        if (i3 != 0) {
            crpVar.writeSInt32(i2, i3);
        }
    }

    public static void writeSInt32List(int i2, List<Integer> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeSInt32List(i2, list, z2);
    }

    public static void writeSInt64(int i2, long j2, crp crpVar) throws IOException {
        if (j2 != 0) {
            crpVar.writeSInt64(i2, j2);
        }
    }

    public static void writeSInt64List(int i2, List<Long> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeSInt64List(i2, list, z2);
    }

    public static void writeString(int i2, Object obj, crp crpVar) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i2, (String) obj, crpVar);
        } else {
            writeBytes(i2, (C) obj, crpVar);
        }
    }

    private static void writeStringInternal(int i2, String str, crp crpVar) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        crpVar.writeString(i2, str);
    }

    public static void writeStringList(int i2, List<String> list, crp crpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeStringList(i2, list);
    }

    public static void writeUInt32(int i2, int i3, crp crpVar) throws IOException {
        if (i3 != 0) {
            crpVar.writeUInt32(i2, i3);
        }
    }

    public static void writeUInt32List(int i2, List<Integer> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeUInt32List(i2, list, z2);
    }

    public static void writeUInt64(int i2, long j2, crp crpVar) throws IOException {
        if (j2 != 0) {
            crpVar.writeUInt64(i2, j2);
        }
    }

    public static void writeUInt64List(int i2, List<Long> list, crp crpVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeUInt64List(i2, list, z2);
    }

    private pq() {
    }

    static int computeSizeBoolList(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(size);
        }
        return size * CodedOutputStream.computeBoolSize(i2, true);
    }

    static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    static int computeSizeByteStringList(int i2, List<C> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * CodedOutputStream.computeTagSize(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i3));
        }
        return iComputeTagSize;
    }

    static int computeSizeEnumList(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag);
        }
        return iComputeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(i2));
    }

    static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ew) {
            Ew ew = (Ew) list;
            int iComputeEnumSizeNoTag = 0;
            while (i2 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(ew.getInt(i2));
                i2++;
            }
            return iComputeEnumSizeNoTag;
        }
        int iComputeEnumSizeNoTag2 = 0;
        while (i2 < size) {
            iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(list.get(i2).intValue());
            i2++;
        }
        return iComputeEnumSizeNoTag2;
    }

    static int computeSizeFixed32List(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4);
        }
        return size * CodedOutputStream.computeFixed32Size(i2, 0);
    }

    static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    static int computeSizeFixed64List(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8);
        }
        return size * CodedOutputStream.computeFixed64Size(i2, 0L);
    }

    static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    static int computeSizeGroupList(int i2, List<yg> list, R6 r6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i2, list.get(i3), r6);
        }
        return iComputeGroupSize;
    }

    static int computeSizeInt32List(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag);
        }
        return iComputeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i2));
    }

    static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ew) {
            Ew ew = (Ew) list;
            int iComputeInt32SizeNoTag = 0;
            while (i2 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(ew.getInt(i2));
                i2++;
            }
            return iComputeInt32SizeNoTag;
        }
        int iComputeInt32SizeNoTag2 = 0;
        while (i2 < size) {
            iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(list.get(i2).intValue());
            i2++;
        }
        return iComputeInt32SizeNoTag2;
    }

    static int computeSizeInt64List(int i2, List<Long> list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag);
        }
        return iComputeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(i2));
    }

    static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Lu) {
            Lu lu = (Lu) list;
            int iComputeInt64SizeNoTag = 0;
            while (i2 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(lu.getLong(i2));
                i2++;
            }
            return iComputeInt64SizeNoTag;
        }
        int iComputeInt64SizeNoTag2 = 0;
        while (i2 < size) {
            iComputeInt64SizeNoTag2 += CodedOutputStream.computeInt64SizeNoTag(list.get(i2).longValue());
            i2++;
        }
        return iComputeInt64SizeNoTag2;
    }

    static int computeSizeSInt32List(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag);
        }
        return iComputeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i2));
    }

    static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ew) {
            Ew ew = (Ew) list;
            int iComputeSInt32SizeNoTag = 0;
            while (i2 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(ew.getInt(i2));
                i2++;
            }
            return iComputeSInt32SizeNoTag;
        }
        int iComputeSInt32SizeNoTag2 = 0;
        while (i2 < size) {
            iComputeSInt32SizeNoTag2 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i2).intValue());
            i2++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    static int computeSizeSInt64List(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag);
        }
        return iComputeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i2));
    }

    static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Lu) {
            Lu lu = (Lu) list;
            int iComputeSInt64SizeNoTag = 0;
            while (i2 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(lu.getLong(i2));
                i2++;
            }
            return iComputeSInt64SizeNoTag;
        }
        int iComputeSInt64SizeNoTag2 = 0;
        while (i2 < size) {
            iComputeSInt64SizeNoTag2 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i2).longValue());
            i2++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    static int computeSizeStringList(int i2, List<?> list) {
        int iComputeStringSizeNoTag;
        int iComputeStringSizeNoTag2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i2) * size;
        if (list instanceof rv6) {
            rv6 rv6Var = (rv6) list;
            while (i3 < size) {
                Object raw = rv6Var.getRaw(i3);
                if (raw instanceof C) {
                    iComputeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((C) raw);
                } else {
                    iComputeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                }
                iComputeTagSize += iComputeStringSizeNoTag2;
                i3++;
            }
            return iComputeTagSize;
        }
        while (i3 < size) {
            Object obj = list.get(i3);
            if (obj instanceof C) {
                iComputeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((C) obj);
            } else {
                iComputeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
            }
            iComputeTagSize += iComputeStringSizeNoTag;
            i3++;
        }
        return iComputeTagSize;
    }

    static int computeSizeUInt32List(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag);
        }
        return iComputeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i2));
    }

    static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ew) {
            Ew ew = (Ew) list;
            int iComputeUInt32SizeNoTag = 0;
            while (i2 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(ew.getInt(i2));
                i2++;
            }
            return iComputeUInt32SizeNoTag;
        }
        int iComputeUInt32SizeNoTag2 = 0;
        while (i2 < size) {
            iComputeUInt32SizeNoTag2 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i2).intValue());
            i2++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    static int computeSizeUInt64List(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (z2) {
            return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag);
        }
        return iComputeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i2));
    }

    static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Lu) {
            Lu lu = (Lu) list;
            int iComputeUInt64SizeNoTag = 0;
            while (i2 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(lu.getLong(i2));
                i2++;
            }
            return iComputeUInt64SizeNoTag;
        }
        int iComputeUInt64SizeNoTag2 = 0;
        while (i2 < size) {
            iComputeUInt64SizeNoTag2 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i2).longValue());
            i2++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    static <T, FT extends Q.w6> void mergeExtensions(l3D l3d, T t3, T t4) {
        Q extensions = l3d.getExtensions(t4);
        if (!extensions.isEmpty()) {
            l3d.getMutableExtensions(t3).mergeFrom(extensions);
        }
    }

    static <T> void mergeMap(Md md, T t3, T t4, long j2) {
        g9.putObject(t3, j2, md.mergeFrom(g9.getObject(t3, j2), g9.getObject(t4, j2)));
    }

    static <T, UT, UB> void mergeUnknownFields(xuv xuvVar, T t3, T t4) {
        xuvVar.setToMessage(t3, xuvVar.merge(xuvVar.getFromMessage(t3), xuvVar.getFromMessage(t4)));
    }

    public static void writeDouble(int i2, double d2, crp crpVar) throws IOException {
        if (Double.doubleToRawLongBits(d2) != 0) {
            crpVar.writeDouble(i2, d2);
        }
    }

    public static void writeFloat(int i2, float f3, crp crpVar) throws IOException {
        if (Float.floatToRawIntBits(f3) != 0) {
            crpVar.writeFloat(i2, f3);
        }
    }

    public static void writeGroupList(int i2, List<?> list, crp crpVar, R6 r6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeGroupList(i2, list, r6);
    }

    public static void writeMessageList(int i2, List<?> list, crp crpVar, R6 r6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        crpVar.writeMessageList(i2, list, r6);
    }

    static int computeSizeMessageList(int i2, List<?> list, R6 r6) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof iwV) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((iwV) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((yg) obj, r6);
            }
            iComputeTagSize += iComputeMessageSizeNoTag;
        }
        return iComputeTagSize;
    }

    static <UT, UB> UB filterUnknownEnumList(Object obj, int i2, List<Integer> list, nKK.I28 i28, UB ub, xuv xuvVar) {
        if (i28 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Integer num = list.get(i5);
                int iIntValue = num.intValue();
                if (i28.isInRange(iIntValue)) {
                    if (i5 != i3) {
                        list.set(i3, num);
                    }
                    i3++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i2, iIntValue, ub, xuvVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!i28.isInRange(iIntValue2)) {
                ub = (UB) storeUnknownEnum(obj, i2, iIntValue2, ub, xuvVar);
                it.remove();
            }
        }
        return ub;
    }
}
