package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.GeneratedMessageLite;
import androidx.content.preferences.protobuf.Internal;
import androidx.content.preferences.protobuf.WireFormat;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
final class ArrayDecoders {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile int f37717n = 100;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ArrayDecoders$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37718n;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f37718n = iArr;
            try {
                iArr[WireFormat.FieldType.f38210O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37718n[WireFormat.FieldType.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37718n[WireFormat.FieldType.f38219r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37718n[WireFormat.FieldType.f38218o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37718n[WireFormat.FieldType.f38215Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37718n[WireFormat.FieldType.f38220v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37718n[WireFormat.FieldType.f38211S.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37718n[WireFormat.FieldType.f38213U.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37718n[WireFormat.FieldType.f38217g.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37718n[WireFormat.FieldType.jB.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37718n[WireFormat.FieldType.E2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37718n[WireFormat.FieldType.P5.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37718n[WireFormat.FieldType.M7.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37718n[WireFormat.FieldType.Xw.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37718n[WireFormat.FieldType.f38209N.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37718n[WireFormat.FieldType.f38216e.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37718n[WireFormat.FieldType.f38214X.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37718n[WireFormat.FieldType.f38212T.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static final class Registers {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f37719O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f37720n;
        public final ExtensionRegistryLite nr;
        public long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37721t;

        Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.nr = extensionRegistryLite;
        }
    }

    static int J2(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(O(bArr, i3));
        int i7 = i3 + 8;
        while (i7 < i5) {
            int iNHg = nHg(bArr, i7, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            doubleArrayList.addDouble(O(bArr, iNHg));
            i7 = iNHg + 8;
        }
        return i7;
    }

    static int KN(int i2, byte[] bArr, int i3, int i5, Object obj, MessageLite messageLite, UnknownFieldSchema unknownFieldSchema, Registers registers) {
        GeneratedMessageLite.GeneratedExtension generatedExtensionN = registers.nr.n(messageLite, i2 >>> 3);
        if (generatedExtensionN == null) {
            return T(i2, bArr, i3, i5, MessageSchema.Ik(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.bzg();
        return Uo(i2, bArr, i3, i5, extendableMessage, generatedExtensionN, unknownFieldSchema, registers);
    }

    static int N(int i2, byte[] bArr, int i3, Registers registers) {
        int i5 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            registers.f37720n = i5 | (b2 << 7);
            return i7;
        }
        int i8 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            registers.f37720n = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            registers.f37720n = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            registers.f37720n = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                registers.f37720n = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int S(byte[] bArr, int i2, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n + iNHg;
        while (iNHg < i3) {
            longArrayList.addLong(gh(bArr, iNHg));
            iNHg += 8;
        }
        if (iNHg == i3) {
            return iNHg;
        }
        throw InvalidProtocolBufferException.az();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int Uo(int i2, byte[] bArr, int i3, int i5, GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension generatedExtension, UnknownFieldSchema unknownFieldSchema, Registers registers) throws InvalidProtocolBufferException {
        int i7;
        int i8;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i9 = i2 >>> 3;
        if (generatedExtension.nr.isRepeated() && generatedExtension.nr.isPacked()) {
            switch (AnonymousClass1.f37718n[generatedExtension.n().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int iZ = Z(bArr, i3, doubleArrayList, registers);
                    fieldSet.ViF(generatedExtension.nr, doubleArrayList);
                    return iZ;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int iWPU = WPU(bArr, i3, floatArrayList, registers);
                    fieldSet.ViF(generatedExtension.nr, floatArrayList);
                    return iWPU;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int iG = g(bArr, i3, longArrayList, registers);
                    fieldSet.ViF(generatedExtension.nr, longArrayList);
                    return iG;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int iNY = nY(bArr, i3, intArrayList, registers);
                    fieldSet.ViF(generatedExtension.nr, intArrayList);
                    return iNY;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iS = S(bArr, i3, longArrayList2, registers);
                    fieldSet.ViF(generatedExtension.nr, longArrayList2);
                    return iS;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iXQ = XQ(bArr, i3, intArrayList2, registers);
                    fieldSet.ViF(generatedExtension.nr, intArrayList2);
                    return iXQ;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int iO = o(bArr, i3, booleanArrayList, registers);
                    fieldSet.ViF(generatedExtension.nr, booleanArrayList);
                    return iO;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iAYN = aYN(bArr, i3, intArrayList3, registers);
                    fieldSet.ViF(generatedExtension.nr, intArrayList3);
                    return iAYN;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iViF = ViF(bArr, i3, longArrayList3, registers);
                    fieldSet.ViF(generatedExtension.nr, longArrayList3);
                    return iViF;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iNY2 = nY(bArr, i3, intArrayList4, registers);
                    SchemaUtil.nY(extendableMessage, i9, intArrayList4, generatedExtension.nr.rl(), null, unknownFieldSchema);
                    fieldSet.ViF(generatedExtension.nr, intArrayList4);
                    return iNY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.nr.getLiteType());
            }
        }
        Object objValueOf = null;
        if (generatedExtension.n() == WireFormat.FieldType.Xw) {
            i3 = nHg(bArr, i3, registers);
            if (generatedExtension.nr.rl().findValueByNumber(registers.f37720n) == null) {
                SchemaUtil.nHg(extendableMessage, i9, registers.f37720n, null, unknownFieldSchema);
                return i3;
            }
            objValueOf = Integer.valueOf(registers.f37720n);
        } else {
            switch (AnonymousClass1.f37718n[generatedExtension.n().ordinal()]) {
                case 1:
                    i7 = i3;
                    objValueOf = Double.valueOf(O(bArr, i7));
                    i3 = i7 + 8;
                    break;
                case 2:
                    i8 = i3;
                    objValueOf = Float.valueOf(az(bArr, i8));
                    i3 = i8 + 4;
                    break;
                case 3:
                case 4:
                    i3 = v(bArr, i3, registers);
                    objValueOf = Long.valueOf(registers.rl);
                    break;
                case 5:
                case 6:
                    i3 = nHg(bArr, i3, registers);
                    objValueOf = Integer.valueOf(registers.f37720n);
                    break;
                case 7:
                case 8:
                    i7 = i3;
                    objValueOf = Long.valueOf(gh(bArr, i7));
                    i3 = i7 + 8;
                    break;
                case 9:
                case 10:
                    i8 = i3;
                    objValueOf = Integer.valueOf(xMQ(bArr, i8));
                    i3 = i8 + 4;
                    break;
                case 11:
                    i3 = v(bArr, i3, registers);
                    objValueOf = Boolean.valueOf(registers.rl != 0);
                    break;
                case 12:
                    i3 = nHg(bArr, i3, registers);
                    objValueOf = Integer.valueOf(CodedInputStream.t(registers.f37720n));
                    break;
                case 13:
                    i3 = v(bArr, i3, registers);
                    objValueOf = Long.valueOf(CodedInputStream.nr(registers.rl));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i3 = t(bArr, i3, registers);
                    objValueOf = registers.f37721t;
                    break;
                case 16:
                    i3 = fD(bArr, i3, registers);
                    objValueOf = registers.f37721t;
                    break;
                case 17:
                    int i10 = (i9 << 3) | 4;
                    Schema schemaT = Protobuf.n().t(generatedExtension.rl().getClass());
                    if (generatedExtension.nr()) {
                        int iHI = HI(schemaT, bArr, i3, i5, i10, registers);
                        fieldSet.n(generatedExtension.nr, registers.f37721t);
                        return iHI;
                    }
                    Object objXMQ = fieldSet.xMQ(generatedExtension.nr);
                    if (objXMQ == null) {
                        objXMQ = schemaT.newInstance();
                        fieldSet.ViF(generatedExtension.nr, objXMQ);
                    }
                    return bzg(objXMQ, schemaT, bArr, i3, i5, i10, registers);
                case 18:
                    Schema schemaT2 = Protobuf.n().t(generatedExtension.rl().getClass());
                    if (generatedExtension.nr()) {
                        int iIk = Ik(schemaT2, bArr, i3, i5, registers);
                        fieldSet.n(generatedExtension.nr, registers.f37721t);
                        return iIk;
                    }
                    Object objXMQ2 = fieldSet.xMQ(generatedExtension.nr);
                    if (objXMQ2 == null) {
                        objXMQ2 = schemaT2.newInstance();
                        fieldSet.ViF(generatedExtension.nr, objXMQ2);
                    }
                    return Xw(objXMQ2, schemaT2, bArr, i3, i5, registers);
            }
        }
        if (generatedExtension.nr()) {
            fieldSet.n(generatedExtension.nr, objValueOf);
            return i3;
        }
        fieldSet.ViF(generatedExtension.nr, objValueOf);
        return i3;
    }

    static int ViF(byte[] bArr, int i2, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n + iNHg;
        while (iNHg < i3) {
            iNHg = v(bArr, iNHg, registers);
            longArrayList.addLong(CodedInputStream.nr(registers.rl));
        }
        if (iNHg == i3) {
            return iNHg;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int WPU(byte[] bArr, int i2, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n + iNHg;
        while (iNHg < i3) {
            floatArrayList.addFloat(az(bArr, iNHg));
            iNHg += 4;
        }
        if (iNHg == i3) {
            return iNHg;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int XQ(byte[] bArr, int i2, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n + iNHg;
        while (iNHg < i3) {
            intArrayList.addInt(xMQ(bArr, iNHg));
            iNHg += 4;
        }
        if (iNHg == i3) {
            return iNHg;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int Xw(Object obj, Schema schema, byte[] bArr, int i2, int i3, Registers registers) throws InvalidProtocolBufferException {
        int iN = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iN = N(i5, bArr, iN, registers);
            i5 = registers.f37720n;
        }
        int i7 = iN;
        if (i5 < 0 || i5 > i3 - i7) {
            throw InvalidProtocolBufferException.az();
        }
        int i8 = registers.f37719O + 1;
        registers.f37719O = i8;
        n(i8);
        int i9 = i7 + i5;
        schema.t(obj, bArr, i7, i9, registers);
        registers.f37719O--;
        registers.f37721t = obj;
        return i9;
    }

    static int Z(byte[] bArr, int i2, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n + iNHg;
        while (iNHg < i3) {
            doubleArrayList.addDouble(O(bArr, iNHg));
            iNHg += 8;
        }
        if (iNHg == i3) {
            return iNHg;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int aYN(byte[] bArr, int i2, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n + iNHg;
        while (iNHg < i3) {
            iNHg = nHg(bArr, iNHg, registers);
            intArrayList.addInt(CodedInputStream.t(registers.f37720n));
        }
        if (iNHg == i3) {
            return iNHg;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int bzg(Object obj, Schema schema, byte[] bArr, int i2, int i3, int i5, Registers registers) throws InvalidProtocolBufferException {
        int i7 = registers.f37719O + 1;
        registers.f37719O = i7;
        n(i7);
        int iM = ((MessageSchema) schema).M(obj, bArr, i2, i3, i5, registers);
        registers.f37719O--;
        registers.f37721t = obj;
        return iM;
    }

    static int ck(Schema schema, int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int i7 = (i2 & (-8)) | 4;
        int iHI = HI(schema, bArr, i3, i5, i7, registers);
        protobufList.add(registers.f37721t);
        while (iHI < i5) {
            int iNHg = nHg(bArr, iHI, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            iHI = HI(schema, bArr, iNHg, i5, i7, registers);
            protobufList.add(registers.f37721t);
        }
        return iHI;
    }

    static int g(byte[] bArr, int i2, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n + iNHg;
        while (iNHg < i3) {
            iNHg = v(bArr, iNHg, registers);
            longArrayList.addLong(registers.rl);
        }
        if (iNHg == i3) {
            return iNHg;
        }
        throw InvalidProtocolBufferException.az();
    }

    static long gh(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    static int iF(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iV = v(bArr, i3, registers);
        longArrayList.addLong(CodedInputStream.nr(registers.rl));
        while (iV < i5) {
            int iNHg = nHg(bArr, iV, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            iV = v(bArr, iNHg, registers);
            longArrayList.addLong(CodedInputStream.nr(registers.rl));
        }
        return iV;
    }

    static int mUb(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(xMQ(bArr, i3));
        int i7 = i3 + 4;
        while (i7 < i5) {
            int iNHg = nHg(bArr, i7, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            intArrayList.addInt(xMQ(bArr, iNHg));
            i7 = iNHg + 4;
        }
        return i7;
    }

    private static void n(int i2) throws InvalidProtocolBufferException {
        if (i2 >= f37717n) {
            throw InvalidProtocolBufferException.xMQ();
        }
    }

    static int nHg(byte[] bArr, int i2, Registers registers) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return N(b2, bArr, i3, registers);
        }
        registers.f37720n = b2;
        return i3;
    }

    static int nY(byte[] bArr, int i2, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n + iNHg;
        while (iNHg < i3) {
            iNHg = nHg(bArr, iNHg, registers);
            intArrayList.addInt(registers.f37720n);
        }
        if (iNHg == i3) {
            return iNHg;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int o(byte[] bArr, int i2, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n + iNHg;
        while (iNHg < i3) {
            iNHg = v(bArr, iNHg, registers);
            booleanArrayList.addBoolean(registers.rl != 0);
        }
        if (iNHg == i3) {
            return iNHg;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int qie(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(gh(bArr, i3));
        int i7 = i3 + 8;
        while (i7 < i5) {
            int iNHg = nHg(bArr, i7, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            longArrayList.addLong(gh(bArr, iNHg));
            i7 = iNHg + 8;
        }
        return i7;
    }

    static int rV9(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iV = v(bArr, i3, registers);
        longArrayList.addLong(registers.rl);
        while (iV < i5) {
            int iNHg = nHg(bArr, iV, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            iV = v(bArr, iNHg, registers);
            longArrayList.addLong(registers.rl);
        }
        return iV;
    }

    static int rl(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iV = v(bArr, i3, registers);
        booleanArrayList.addBoolean(registers.rl != 0);
        while (iV < i5) {
            int iNHg = nHg(bArr, iV, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            iV = v(bArr, iNHg, registers);
            booleanArrayList.addBoolean(registers.rl != 0);
        }
        return iV;
    }

    static int s7N(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iNHg = nHg(bArr, i3, registers);
        intArrayList.addInt(registers.f37720n);
        while (iNHg < i5) {
            int iNHg2 = nHg(bArr, iNHg, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            iNHg = nHg(bArr, iNHg2, registers);
            intArrayList.addInt(registers.f37720n);
        }
        return iNHg;
    }

    static int te(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iNHg = nHg(bArr, i3, registers);
        intArrayList.addInt(CodedInputStream.t(registers.f37720n));
        while (iNHg < i5) {
            int iNHg2 = nHg(bArr, iNHg, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            iNHg = nHg(bArr, iNHg2, registers);
            intArrayList.addInt(CodedInputStream.t(registers.f37720n));
        }
        return iNHg;
    }

    static int ty(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(az(bArr, i3));
        int i7 = i3 + 4;
        while (i7 < i5) {
            int iNHg = nHg(bArr, i7, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            floatArrayList.addFloat(az(bArr, iNHg));
            i7 = iNHg + 4;
        }
        return i7;
    }

    static int v(byte[] bArr, int i2, Registers registers) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 < 0) {
            return wTp(j2, bArr, i3, registers);
        }
        registers.rl = j2;
        return i3;
    }

    static int wTp(long j2, byte[] bArr, int i2, Registers registers) {
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
        registers.rl = j3;
        return i3;
    }

    static int xMQ(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    static int E2(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iNHg = nHg(bArr, i3, registers);
        int i7 = registers.f37720n;
        if (i7 >= 0) {
            if (i7 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, iNHg, i7, Internal.rl));
                iNHg += i7;
            }
            while (iNHg < i5) {
                int iNHg2 = nHg(bArr, iNHg, registers);
                if (i2 != registers.f37720n) {
                    break;
                }
                iNHg = nHg(bArr, iNHg2, registers);
                int i8 = registers.f37720n;
                if (i8 >= 0) {
                    if (i8 == 0) {
                        protobufList.add("");
                    } else {
                        protobufList.add(new String(bArr, iNHg, i8, Internal.rl));
                        iNHg += i8;
                    }
                } else {
                    throw InvalidProtocolBufferException.Uo();
                }
            }
            return iNHg;
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static int HI(Schema schema, byte[] bArr, int i2, int i3, int i5, Registers registers) throws InvalidProtocolBufferException {
        Object objNewInstance = schema.newInstance();
        int iBzg = bzg(objNewInstance, schema, bArr, i2, i3, i5, registers);
        schema.makeImmutable(objNewInstance);
        registers.f37721t = objNewInstance;
        return iBzg;
    }

    static int Ik(Schema schema, byte[] bArr, int i2, int i3, Registers registers) throws InvalidProtocolBufferException {
        Object objNewInstance = schema.newInstance();
        int iXw = Xw(objNewInstance, schema, bArr, i2, i3, registers);
        schema.makeImmutable(objNewInstance);
        registers.f37721t = objNewInstance;
        return iXw;
    }

    static double O(byte[] bArr, int i2) {
        return Double.longBitsToDouble(gh(bArr, i2));
    }

    static int T(int i2, byte[] bArr, int i3, int i5, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.n(i2) != 0) {
            int iRl = WireFormat.rl(i2);
            if (iRl != 0) {
                if (iRl != 1) {
                    if (iRl != 2) {
                        if (iRl != 3) {
                            if (iRl == 5) {
                                unknownFieldSetLite.ty(i2, Integer.valueOf(xMQ(bArr, i3)));
                                return i3 + 4;
                            }
                            throw InvalidProtocolBufferException.t();
                        }
                        UnknownFieldSetLite unknownFieldSetLiteGh = UnknownFieldSetLite.gh();
                        int i7 = (i2 & (-8)) | 4;
                        int i8 = registers.f37719O + 1;
                        registers.f37719O = i8;
                        n(i8);
                        int i9 = 0;
                        while (true) {
                            if (i3 >= i5) {
                                break;
                            }
                            int iNHg = nHg(bArr, i3, registers);
                            i9 = registers.f37720n;
                            if (i9 == i7) {
                                i3 = iNHg;
                                break;
                            }
                            i3 = T(i9, bArr, iNHg, i5, unknownFieldSetLiteGh, registers);
                        }
                        registers.f37719O--;
                        if (i3 <= i5 && i9 == i7) {
                            unknownFieldSetLite.ty(i2, unknownFieldSetLiteGh);
                            return i3;
                        }
                        throw InvalidProtocolBufferException.KN();
                    }
                    int iNHg2 = nHg(bArr, i3, registers);
                    int i10 = registers.f37720n;
                    if (i10 >= 0) {
                        if (i10 <= bArr.length - iNHg2) {
                            if (i10 == 0) {
                                unknownFieldSetLite.ty(i2, ByteString.f37740t);
                            } else {
                                unknownFieldSetLite.ty(i2, ByteString.az(bArr, iNHg2, i10));
                            }
                            return iNHg2 + i10;
                        }
                        throw InvalidProtocolBufferException.az();
                    }
                    throw InvalidProtocolBufferException.Uo();
                }
                unknownFieldSetLite.ty(i2, Long.valueOf(gh(bArr, i3)));
                return i3 + 8;
            }
            int iV = v(bArr, i3, registers);
            unknownFieldSetLite.ty(i2, Long.valueOf(registers.rl));
            return iV;
        }
        throw InvalidProtocolBufferException.t();
    }

    static int X(byte[] bArr, int i2, Registers registers) throws InvalidProtocolBufferException {
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n;
        if (i3 >= 0) {
            if (i3 == 0) {
                registers.f37721t = "";
                return iNHg;
            }
            registers.f37721t = Utf8.KN(bArr, iNHg, i3);
            return iNHg + i3;
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static float az(byte[] bArr, int i2) {
        return Float.intBitsToFloat(xMQ(bArr, i2));
    }

    static int e(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iNHg = nHg(bArr, i3, registers);
        int i7 = registers.f37720n;
        if (i7 >= 0) {
            if (i7 == 0) {
                protobufList.add("");
            } else {
                int i8 = iNHg + i7;
                if (Utf8.XQ(bArr, iNHg, i8)) {
                    protobufList.add(new String(bArr, iNHg, i7, Internal.rl));
                    iNHg = i8;
                } else {
                    throw InvalidProtocolBufferException.nr();
                }
            }
            while (iNHg < i5) {
                int iNHg2 = nHg(bArr, iNHg, registers);
                if (i2 != registers.f37720n) {
                    break;
                }
                iNHg = nHg(bArr, iNHg2, registers);
                int i9 = registers.f37720n;
                if (i9 >= 0) {
                    if (i9 == 0) {
                        protobufList.add("");
                    } else {
                        int i10 = iNHg + i9;
                        if (Utf8.XQ(bArr, iNHg, i10)) {
                            protobufList.add(new String(bArr, iNHg, i9, Internal.rl));
                            iNHg = i10;
                        } else {
                            throw InvalidProtocolBufferException.nr();
                        }
                    }
                } else {
                    throw InvalidProtocolBufferException.Uo();
                }
            }
            return iNHg;
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static int fD(byte[] bArr, int i2, Registers registers) throws InvalidProtocolBufferException {
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n;
        if (i3 >= 0) {
            if (i3 == 0) {
                registers.f37721t = "";
                return iNHg;
            }
            registers.f37721t = new String(bArr, iNHg, i3, Internal.rl);
            return iNHg + i3;
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static int jB(int i2, byte[] bArr, int i3, int i5, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.n(i2) != 0) {
            int iRl = WireFormat.rl(i2);
            if (iRl != 0) {
                if (iRl != 1) {
                    if (iRl != 2) {
                        if (iRl != 3) {
                            if (iRl == 5) {
                                return i3 + 4;
                            }
                            throw InvalidProtocolBufferException.t();
                        }
                        int i7 = (i2 & (-8)) | 4;
                        int i8 = 0;
                        while (i3 < i5) {
                            i3 = nHg(bArr, i3, registers);
                            i8 = registers.f37720n;
                            if (i8 == i7) {
                                break;
                            }
                            i3 = jB(i8, bArr, i3, i5, registers);
                        }
                        if (i3 <= i5 && i8 == i7) {
                            return i3;
                        }
                        throw InvalidProtocolBufferException.KN();
                    }
                    return nHg(bArr, i3, registers) + registers.f37720n;
                }
                return i3 + 8;
            }
            return v(bArr, i3, registers);
        }
        throw InvalidProtocolBufferException.t();
    }

    static int nr(int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iNHg = nHg(bArr, i3, registers);
        int i7 = registers.f37720n;
        if (i7 >= 0) {
            if (i7 <= bArr.length - iNHg) {
                if (i7 == 0) {
                    protobufList.add(ByteString.f37740t);
                } else {
                    protobufList.add(ByteString.az(bArr, iNHg, i7));
                    iNHg += i7;
                }
                while (iNHg < i5) {
                    int iNHg2 = nHg(bArr, iNHg, registers);
                    if (i2 != registers.f37720n) {
                        break;
                    }
                    iNHg = nHg(bArr, iNHg2, registers);
                    int i8 = registers.f37720n;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - iNHg) {
                            if (i8 == 0) {
                                protobufList.add(ByteString.f37740t);
                            } else {
                                protobufList.add(ByteString.az(bArr, iNHg, i8));
                                iNHg += i8;
                            }
                        } else {
                            throw InvalidProtocolBufferException.az();
                        }
                    } else {
                        throw InvalidProtocolBufferException.Uo();
                    }
                }
                return iNHg;
            }
            throw InvalidProtocolBufferException.az();
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static int r(Schema schema, int i2, byte[] bArr, int i3, int i5, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iIk = Ik(schema, bArr, i3, i5, registers);
        protobufList.add(registers.f37721t);
        while (iIk < i5) {
            int iNHg = nHg(bArr, iIk, registers);
            if (i2 != registers.f37720n) {
                break;
            }
            iIk = Ik(schema, bArr, iNHg, i5, registers);
            protobufList.add(registers.f37721t);
        }
        return iIk;
    }

    static int t(byte[] bArr, int i2, Registers registers) throws InvalidProtocolBufferException {
        int iNHg = nHg(bArr, i2, registers);
        int i3 = registers.f37720n;
        if (i3 >= 0) {
            if (i3 <= bArr.length - iNHg) {
                if (i3 == 0) {
                    registers.f37721t = ByteString.f37740t;
                    return iNHg;
                }
                registers.f37721t = ByteString.az(bArr, iNHg, i3);
                return iNHg + i3;
            }
            throw InvalidProtocolBufferException.az();
        }
        throw InvalidProtocolBufferException.Uo();
    }
}
