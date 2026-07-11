package com.google.protobuf;

import com.google.protobuf.CM;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class CN3 {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    static int decodeVarint32(byte[] bArr, int i2, n nVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return decodeVarint32(b2, bArr, i3, nVar);
        }
        nVar.int1 = b2;
        return i3;
    }

    static int decodeVarint64(byte[] bArr, int i2, n nVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 < 0) {
            return decodeVarint64(j2, bArr, i3, nVar);
        }
        nVar.long1 = j2;
        return i3;
    }

    static /* synthetic */ class j {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static final class n {
        public final QJ extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        n() {
            this.extensionRegistry = QJ.getEmptyRegistry();
        }

        n(QJ qj) {
            qj.getClass();
            this.extensionRegistry = qj;
        }
    }

    private static void checkRecursionLimit(int i2) throws InvalidProtocolBufferException {
        if (i2 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    static int decodeBoolList(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) {
        fuX fux = (fuX) dsr;
        int iDecodeVarint64 = decodeVarint64(bArr, i3, nVar);
        fux.addBoolean(nVar.long1 != 0);
        while (iDecodeVarint64 < i5) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, nVar);
            fux.addBoolean(nVar.long1 != 0);
        }
        return iDecodeVarint64;
    }

    static int decodeDoubleList(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) {
        Xo xo = (Xo) dsr;
        xo.addDouble(decodeDouble(bArr, i3));
        int i7 = i3 + 8;
        while (i7 < i5) {
            int iDecodeVarint32 = decodeVarint32(bArr, i7, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            xo.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i7 = iDecodeVarint32 + 8;
        }
        return i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int decodeExtension(int i2, byte[] bArr, int i3, int i5, g9s.Ml ml, g9s.CN3 cn3, xuv xuvVar, n nVar) throws IOException {
        int i7;
        int i8;
        Q q2 = ml.extensions;
        int i9 = i2 >>> 3;
        if (cn3.descriptor.isRepeated() && cn3.descriptor.isPacked()) {
            switch (j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[cn3.getLiteType().ordinal()]) {
                case 1:
                    Xo xo = new Xo();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i3, xo, nVar);
                    q2.setField(cn3.descriptor, xo);
                    return iDecodePackedDoubleList;
                case 2:
                    SPz sPz = new SPz();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i3, sPz, nVar);
                    q2.setField(cn3.descriptor, sPz);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    Lu lu = new Lu();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i3, lu, nVar);
                    q2.setField(cn3.descriptor, lu);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    Ew ew = new Ew();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i3, ew, nVar);
                    q2.setField(cn3.descriptor, ew);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    Lu lu2 = new Lu();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i3, lu2, nVar);
                    q2.setField(cn3.descriptor, lu2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    Ew ew2 = new Ew();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i3, ew2, nVar);
                    q2.setField(cn3.descriptor, ew2);
                    return iDecodePackedFixed32List;
                case 11:
                    fuX fux = new fuX();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i3, fux, nVar);
                    q2.setField(cn3.descriptor, fux);
                    return iDecodePackedBoolList;
                case 12:
                    Ew ew3 = new Ew();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i3, ew3, nVar);
                    q2.setField(cn3.descriptor, ew3);
                    return iDecodePackedSInt32List;
                case 13:
                    Lu lu3 = new Lu();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i3, lu3, nVar);
                    q2.setField(cn3.descriptor, lu3);
                    return iDecodePackedSInt64List;
                case 14:
                    Ew ew4 = new Ew();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i3, ew4, nVar);
                    pq.filterUnknownEnumList(ml, i9, ew4, cn3.descriptor.getEnumType(), (Object) null, xuvVar);
                    q2.setField(cn3.descriptor, ew4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + cn3.descriptor.getLiteType());
            }
        }
        Object objValueOf = null;
        if (cn3.getLiteType() == CM.n.ENUM) {
            i3 = decodeVarint32(bArr, i3, nVar);
            if (cn3.descriptor.getEnumType().findValueByNumber(nVar.int1) == null) {
                pq.storeUnknownEnum(ml, i9, nVar.int1, null, xuvVar);
                return i3;
            }
            objValueOf = Integer.valueOf(nVar.int1);
        } else {
            switch (j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[cn3.getLiteType().ordinal()]) {
                case 1:
                    i7 = i3;
                    objValueOf = Double.valueOf(decodeDouble(bArr, i7));
                    i3 = i7 + 8;
                    break;
                case 2:
                    i8 = i3;
                    objValueOf = Float.valueOf(decodeFloat(bArr, i8));
                    i3 = i8 + 4;
                    break;
                case 3:
                case 4:
                    i3 = decodeVarint64(bArr, i3, nVar);
                    objValueOf = Long.valueOf(nVar.long1);
                    break;
                case 5:
                case 6:
                    i3 = decodeVarint32(bArr, i3, nVar);
                    objValueOf = Integer.valueOf(nVar.int1);
                    break;
                case 7:
                case 8:
                    i7 = i3;
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i7));
                    i3 = i7 + 8;
                    break;
                case 9:
                case 10:
                    i8 = i3;
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i8));
                    i3 = i8 + 4;
                    break;
                case 11:
                    i3 = decodeVarint64(bArr, i3, nVar);
                    objValueOf = Boolean.valueOf(nVar.long1 != 0);
                    break;
                case 12:
                    i3 = decodeVarint32(bArr, i3, nVar);
                    objValueOf = Integer.valueOf(AbstractC1923o.decodeZigZag32(nVar.int1));
                    break;
                case 13:
                    i3 = decodeVarint64(bArr, i3, nVar);
                    objValueOf = Long.valueOf(AbstractC1923o.decodeZigZag64(nVar.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i3 = decodeBytes(bArr, i3, nVar);
                    objValueOf = nVar.object1;
                    break;
                case 16:
                    i3 = decodeString(bArr, i3, nVar);
                    objValueOf = nVar.object1;
                    break;
                case 17:
                    int i10 = (i9 << 3) | 4;
                    R6 r6SchemaFor = xZD.getInstance().schemaFor((Class) cn3.getMessageDefaultInstance().getClass());
                    if (cn3.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(r6SchemaFor, bArr, i3, i5, i10, nVar);
                        q2.addRepeatedField(cn3.descriptor, nVar.object1);
                        return iDecodeGroupField;
                    }
                    Object field = q2.getField(cn3.descriptor);
                    if (field == null) {
                        field = r6SchemaFor.newInstance();
                        q2.setField(cn3.descriptor, field);
                    }
                    return mergeGroupField(field, r6SchemaFor, bArr, i3, i5, i10, nVar);
                case 18:
                    R6 r6SchemaFor2 = xZD.getInstance().schemaFor((Class) cn3.getMessageDefaultInstance().getClass());
                    if (cn3.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(r6SchemaFor2, bArr, i3, i5, nVar);
                        q2.addRepeatedField(cn3.descriptor, nVar.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = q2.getField(cn3.descriptor);
                    if (field2 == null) {
                        field2 = r6SchemaFor2.newInstance();
                        q2.setField(cn3.descriptor, field2);
                    }
                    return mergeMessageField(field2, r6SchemaFor2, bArr, i3, i5, nVar);
            }
        }
        if (cn3.isRepeated()) {
            q2.addRepeatedField(cn3.descriptor, objValueOf);
            return i3;
        }
        q2.setField(cn3.descriptor, objValueOf);
        return i3;
    }

    static int decodeExtensionOrUnknownField(int i2, byte[] bArr, int i3, int i5, Object obj, yg ygVar, xuv xuvVar, n nVar) throws IOException {
        g9s.CN3 cn3FindLiteExtensionByNumber = nVar.extensionRegistry.findLiteExtensionByNumber(ygVar, i2 >>> 3);
        if (cn3FindLiteExtensionByNumber == null) {
            return decodeUnknownField(i2, bArr, i3, i5, l4Z.getMutableUnknownFields(obj), nVar);
        }
        g9s.Ml ml = (g9s.Ml) obj;
        ml.ensureExtensionsAreMutable();
        return decodeExtension(i2, bArr, i3, i5, ml, cn3FindLiteExtensionByNumber, xuvVar, nVar);
    }

    static int decodeFixed32(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    static int decodeFixed32List(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) {
        Ew ew = (Ew) dsr;
        ew.addInt(decodeFixed32(bArr, i3));
        int i7 = i3 + 4;
        while (i7 < i5) {
            int iDecodeVarint32 = decodeVarint32(bArr, i7, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            ew.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i7 = iDecodeVarint32 + 4;
        }
        return i7;
    }

    static long decodeFixed64(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    static int decodeFixed64List(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) {
        Lu lu = (Lu) dsr;
        lu.addLong(decodeFixed64(bArr, i3));
        int i7 = i3 + 8;
        while (i7 < i5) {
            int iDecodeVarint32 = decodeVarint32(bArr, i7, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            lu.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i7 = iDecodeVarint32 + 8;
        }
        return i7;
    }

    static int decodeFloatList(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) {
        SPz sPz = (SPz) dsr;
        sPz.addFloat(decodeFloat(bArr, i3));
        int i7 = i3 + 4;
        while (i7 < i5) {
            int iDecodeVarint32 = decodeVarint32(bArr, i7, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            sPz.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i7 = iDecodeVarint32 + 4;
        }
        return i7;
    }

    static int decodeGroupList(R6 r6, int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) throws IOException {
        int i7 = (i2 & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(r6, bArr, i3, i5, i7, nVar);
        dsr.add(nVar.object1);
        while (iDecodeGroupField < i5) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(r6, bArr, iDecodeVarint32, i5, i7, nVar);
            dsr.add(nVar.object1);
        }
        return iDecodeGroupField;
    }

    static int decodePackedBoolList(byte[] bArr, int i2, nKK.Dsr dsr, n nVar) throws IOException {
        fuX fux = (fuX) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, nVar);
            fux.addBoolean(nVar.long1 != 0);
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedDoubleList(byte[] bArr, int i2, nKK.Dsr dsr, n nVar) throws IOException {
        Xo xo = (Xo) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            xo.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed32List(byte[] bArr, int i2, nKK.Dsr dsr, n nVar) throws IOException {
        Ew ew = (Ew) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            ew.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed64List(byte[] bArr, int i2, nKK.Dsr dsr, n nVar) throws IOException {
        Lu lu = (Lu) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            lu.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFloatList(byte[] bArr, int i2, nKK.Dsr dsr, n nVar) throws IOException {
        SPz sPz = (SPz) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            sPz.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt32List(byte[] bArr, int i2, nKK.Dsr dsr, n nVar) throws IOException {
        Ew ew = (Ew) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, nVar);
            ew.addInt(AbstractC1923o.decodeZigZag32(nVar.int1));
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt64List(byte[] bArr, int i2, nKK.Dsr dsr, n nVar) throws IOException {
        Lu lu = (Lu) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, nVar);
            lu.addLong(AbstractC1923o.decodeZigZag64(nVar.long1));
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint32List(byte[] bArr, int i2, nKK.Dsr dsr, n nVar) throws IOException {
        Ew ew = (Ew) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, nVar);
            ew.addInt(nVar.int1);
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint64List(byte[] bArr, int i2, nKK.Dsr dsr, n nVar) throws IOException {
        Lu lu = (Lu) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i3) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, nVar);
            lu.addLong(nVar.long1);
        }
        if (iDecodeVarint32 == i3) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodeSInt32List(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) {
        Ew ew = (Ew) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i3, nVar);
        ew.addInt(AbstractC1923o.decodeZigZag32(nVar.int1));
        while (iDecodeVarint32 < i5) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, nVar);
            ew.addInt(AbstractC1923o.decodeZigZag32(nVar.int1));
        }
        return iDecodeVarint32;
    }

    static int decodeSInt64List(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) {
        Lu lu = (Lu) dsr;
        int iDecodeVarint64 = decodeVarint64(bArr, i3, nVar);
        lu.addLong(AbstractC1923o.decodeZigZag64(nVar.long1));
        while (iDecodeVarint64 < i5) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, nVar);
            lu.addLong(AbstractC1923o.decodeZigZag64(nVar.long1));
        }
        return iDecodeVarint64;
    }

    static int decodeVarint32List(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) {
        Ew ew = (Ew) dsr;
        int iDecodeVarint32 = decodeVarint32(bArr, i3, nVar);
        ew.addInt(nVar.int1);
        while (iDecodeVarint32 < i5) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, nVar);
            ew.addInt(nVar.int1);
        }
        return iDecodeVarint32;
    }

    static int decodeVarint64List(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) {
        Lu lu = (Lu) dsr;
        int iDecodeVarint64 = decodeVarint64(bArr, i3, nVar);
        lu.addLong(nVar.long1);
        while (iDecodeVarint64 < i5) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, nVar);
            lu.addLong(nVar.long1);
        }
        return iDecodeVarint64;
    }

    static int mergeGroupField(Object obj, R6 r6, byte[] bArr, int i2, int i3, int i5, n nVar) throws IOException {
        int i7 = nVar.recursionDepth + 1;
        nVar.recursionDepth = i7;
        checkRecursionLimit(i7);
        int message = ((l4Z) r6).parseMessage(obj, bArr, i2, i3, i5, nVar);
        nVar.recursionDepth--;
        nVar.object1 = obj;
        return message;
    }

    static int mergeMessageField(Object obj, R6 r6, byte[] bArr, int i2, int i3, n nVar) throws IOException {
        int iDecodeVarint32 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iDecodeVarint32 = decodeVarint32(i5, bArr, iDecodeVarint32, nVar);
            i5 = nVar.int1;
        }
        int i7 = iDecodeVarint32;
        if (i5 < 0 || i5 > i3 - i7) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i8 = nVar.recursionDepth + 1;
        nVar.recursionDepth = i8;
        checkRecursionLimit(i8);
        int i9 = i7 + i5;
        r6.mergeFrom(obj, bArr, i7, i9, nVar);
        nVar.recursionDepth--;
        nVar.object1 = obj;
        return i9;
    }

    public static void setRecursionLimit(int i2) {
        recursionLimit = i2;
    }

    private CN3() {
    }

    static int decodeBytes(byte[] bArr, int i2, n nVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1;
        if (i3 >= 0) {
            if (i3 <= bArr.length - iDecodeVarint32) {
                if (i3 == 0) {
                    nVar.object1 = C.EMPTY;
                    return iDecodeVarint32;
                }
                nVar.object1 = C.copyFrom(bArr, iDecodeVarint32, i3);
                return iDecodeVarint32 + i3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    static int decodeBytesList(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i3, nVar);
        int i7 = nVar.int1;
        if (i7 >= 0) {
            if (i7 <= bArr.length - iDecodeVarint32) {
                if (i7 == 0) {
                    dsr.add(C.EMPTY);
                } else {
                    dsr.add(C.copyFrom(bArr, iDecodeVarint32, i7));
                    iDecodeVarint32 += i7;
                }
                while (iDecodeVarint32 < i5) {
                    int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, nVar);
                    if (i2 != nVar.int1) {
                        break;
                    }
                    iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, nVar);
                    int i8 = nVar.int1;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - iDecodeVarint32) {
                            if (i8 == 0) {
                                dsr.add(C.EMPTY);
                            } else {
                                dsr.add(C.copyFrom(bArr, iDecodeVarint32, i8));
                                iDecodeVarint32 += i8;
                            }
                        } else {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                    } else {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                }
                return iDecodeVarint32;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    static double decodeDouble(byte[] bArr, int i2) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i2));
    }

    static float decodeFloat(byte[] bArr, int i2) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i2));
    }

    static int decodeGroupField(R6 r6, byte[] bArr, int i2, int i3, int i5, n nVar) throws IOException {
        Object objNewInstance = r6.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, r6, bArr, i2, i3, i5, nVar);
        r6.makeImmutable(objNewInstance);
        nVar.object1 = objNewInstance;
        return iMergeGroupField;
    }

    static int decodeMessageField(R6 r6, byte[] bArr, int i2, int i3, n nVar) throws IOException {
        Object objNewInstance = r6.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, r6, bArr, i2, i3, nVar);
        r6.makeImmutable(objNewInstance);
        nVar.object1 = objNewInstance;
        return iMergeMessageField;
    }

    static int decodeMessageList(R6 r6, int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) throws IOException {
        int iDecodeMessageField = decodeMessageField(r6, bArr, i3, i5, nVar);
        dsr.add(nVar.object1);
        while (iDecodeMessageField < i5) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, nVar);
            if (i2 != nVar.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(r6, bArr, iDecodeVarint32, i5, nVar);
            dsr.add(nVar.object1);
        }
        return iDecodeMessageField;
    }

    static int decodeString(byte[] bArr, int i2, n nVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1;
        if (i3 >= 0) {
            if (i3 == 0) {
                nVar.object1 = "";
                return iDecodeVarint32;
            }
            nVar.object1 = new String(bArr, iDecodeVarint32, i3, nKK.UTF_8);
            return iDecodeVarint32 + i3;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    static int decodeStringList(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i3, nVar);
        int i7 = nVar.int1;
        if (i7 >= 0) {
            if (i7 == 0) {
                dsr.add("");
            } else {
                dsr.add(new String(bArr, iDecodeVarint32, i7, nKK.UTF_8));
                iDecodeVarint32 += i7;
            }
            while (iDecodeVarint32 < i5) {
                int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, nVar);
                if (i2 != nVar.int1) {
                    break;
                }
                iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, nVar);
                int i8 = nVar.int1;
                if (i8 >= 0) {
                    if (i8 == 0) {
                        dsr.add("");
                    } else {
                        dsr.add(new String(bArr, iDecodeVarint32, i8, nKK.UTF_8));
                        iDecodeVarint32 += i8;
                    }
                } else {
                    throw InvalidProtocolBufferException.negativeSize();
                }
            }
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    static int decodeStringListRequireUtf8(int i2, byte[] bArr, int i3, int i5, nKK.Dsr dsr, n nVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i3, nVar);
        int i7 = nVar.int1;
        if (i7 >= 0) {
            if (i7 == 0) {
                dsr.add("");
            } else {
                int i8 = iDecodeVarint32 + i7;
                if (L0y.isValidUtf8(bArr, iDecodeVarint32, i8)) {
                    dsr.add(new String(bArr, iDecodeVarint32, i7, nKK.UTF_8));
                    iDecodeVarint32 = i8;
                } else {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            while (iDecodeVarint32 < i5) {
                int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, nVar);
                if (i2 != nVar.int1) {
                    break;
                }
                iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, nVar);
                int i9 = nVar.int1;
                if (i9 >= 0) {
                    if (i9 == 0) {
                        dsr.add("");
                    } else {
                        int i10 = iDecodeVarint32 + i9;
                        if (L0y.isValidUtf8(bArr, iDecodeVarint32, i10)) {
                            dsr.add(new String(bArr, iDecodeVarint32, i9, nKK.UTF_8));
                            iDecodeVarint32 = i10;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                } else {
                    throw InvalidProtocolBufferException.negativeSize();
                }
            }
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    static int decodeStringRequireUtf8(byte[] bArr, int i2, n nVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, nVar);
        int i3 = nVar.int1;
        if (i3 >= 0) {
            if (i3 == 0) {
                nVar.object1 = "";
                return iDecodeVarint32;
            }
            nVar.object1 = L0y.decodeUtf8(bArr, iDecodeVarint32, i3);
            return iDecodeVarint32 + i3;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    static int decodeUnknownField(int i2, byte[] bArr, int i3, int i5, c7r c7rVar, n nVar) throws InvalidProtocolBufferException {
        if (CM.getTagFieldNumber(i2) != 0) {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                c7rVar.storeField(i2, Integer.valueOf(decodeFixed32(bArr, i3)));
                                return i3 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        c7r c7rVarNewInstance = c7r.newInstance();
                        int i7 = (i2 & (-8)) | 4;
                        int i8 = nVar.recursionDepth + 1;
                        nVar.recursionDepth = i8;
                        checkRecursionLimit(i8);
                        int i9 = 0;
                        while (true) {
                            if (i3 >= i5) {
                                break;
                            }
                            int iDecodeVarint32 = decodeVarint32(bArr, i3, nVar);
                            i9 = nVar.int1;
                            if (i9 == i7) {
                                i3 = iDecodeVarint32;
                                break;
                            }
                            i3 = decodeUnknownField(i9, bArr, iDecodeVarint32, i5, c7rVarNewInstance, nVar);
                        }
                        nVar.recursionDepth--;
                        if (i3 <= i5 && i9 == i7) {
                            c7rVar.storeField(i2, c7rVarNewInstance);
                            return i3;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    int iDecodeVarint322 = decodeVarint32(bArr, i3, nVar);
                    int i10 = nVar.int1;
                    if (i10 >= 0) {
                        if (i10 <= bArr.length - iDecodeVarint322) {
                            if (i10 == 0) {
                                c7rVar.storeField(i2, C.EMPTY);
                            } else {
                                c7rVar.storeField(i2, C.copyFrom(bArr, iDecodeVarint322, i10));
                            }
                            return iDecodeVarint322 + i10;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                c7rVar.storeField(i2, Long.valueOf(decodeFixed64(bArr, i3)));
                return i3 + 8;
            }
            int iDecodeVarint64 = decodeVarint64(bArr, i3, nVar);
            c7rVar.storeField(i2, Long.valueOf(nVar.long1));
            return iDecodeVarint64;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    static int skipField(int i2, byte[] bArr, int i3, int i5, n nVar) throws InvalidProtocolBufferException {
        if (CM.getTagFieldNumber(i2) != 0) {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i3 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        int i7 = (i2 & (-8)) | 4;
                        int i8 = 0;
                        while (i3 < i5) {
                            i3 = decodeVarint32(bArr, i3, nVar);
                            i8 = nVar.int1;
                            if (i8 == i7) {
                                break;
                            }
                            i3 = skipField(i8, bArr, i3, i5, nVar);
                        }
                        if (i3 <= i5 && i8 == i7) {
                            return i3;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    return decodeVarint32(bArr, i3, nVar) + nVar.int1;
                }
                return i3 + 8;
            }
            return decodeVarint64(bArr, i3, nVar);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    static int decodeVarint32(int i2, byte[] bArr, int i3, n nVar) {
        int i5 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            nVar.int1 = i5 | (b2 << 7);
            return i7;
        }
        int i8 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            nVar.int1 = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            nVar.int1 = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            nVar.int1 = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                nVar.int1 = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int decodeVarint64(long j2, byte[] bArr, int i2, n nVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j3 = (j2 & 127) | (((long) (b2 & ByteCompanionObject.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i7 = i3 + 1;
            byte b4 = bArr[i3];
            i5 += 7;
            j3 |= ((long) (b4 & ByteCompanionObject.MAX_VALUE)) << i5;
            i3 = i7;
            b2 = b4;
        }
        nVar.long1 = j3;
        return i3;
    }
}
