package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.InvalidProtocolBufferException;
import androidx.content.preferences.protobuf.MapEntryLite;
import androidx.content.preferences.protobuf.WireFormat;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@CheckReturnValue
final class CodedInputStreamReader implements Reader {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CodedInputStream f37765n;
    private int nr = 0;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37766t;

    @Override // androidx.content.preferences.protobuf.Reader
    public void J2(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(3);
        xMQ(obj, schema, extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f37765n.ty(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.content.preferences.protobuf.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(2);
        int iHI = this.f37765n.HI(this.f37765n.e());
        Object objGh = metadata.rl;
        Object objGh2 = metadata.nr;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.f37765n.J2()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objGh = gh(metadata.f38084n, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objGh2 = gh(metadata.f38085t, metadata.nr.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th) {
                this.f37765n.ty(iHI);
                throw th;
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void n(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ck(2);
        mUb(obj, schema, extensionRegistryLite);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public Object nr(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(3);
        return qie(Protobuf.n().t(cls), extensionRegistryLite);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(0);
        return this.f37765n.ck();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public ByteString readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(2);
        return this.f37765n.Ik();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(1);
        return this.f37765n.r();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(0);
        return this.f37765n.o();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(5);
        return this.f37765n.Z();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(1);
        return this.f37765n.XQ();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(5);
        return this.f37765n.S();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(0);
        return this.f37765n.WPU();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(0);
        return this.f37765n.aYN();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(5);
        return this.f37765n.ViF();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(1);
        return this.f37765n.nY();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(0);
        return this.f37765n.g();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(0);
        return this.f37765n.te();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(2);
        return this.f37765n.iF();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        ty(list, false);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        ty(list, true);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(2);
        return this.f37765n.fD();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(0);
        return this.f37765n.e();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(0);
        return this.f37765n.X();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public Object t(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        ck(2);
        return az(Protobuf.n().t(cls), extensionRegistryLite);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37767n;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f37767n = iArr;
            try {
                iArr[WireFormat.FieldType.E2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37767n[WireFormat.FieldType.f38209N.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37767n[WireFormat.FieldType.f38210O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37767n[WireFormat.FieldType.Xw.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37767n[WireFormat.FieldType.f38217g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37767n[WireFormat.FieldType.f38211S.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37767n[WireFormat.FieldType.J2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37767n[WireFormat.FieldType.f38215Z.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37767n[WireFormat.FieldType.f38219r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37767n[WireFormat.FieldType.f38212T.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37767n[WireFormat.FieldType.jB.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37767n[WireFormat.FieldType.f38213U.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37767n[WireFormat.FieldType.P5.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37767n[WireFormat.FieldType.M7.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37767n[WireFormat.FieldType.f38216e.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37767n[WireFormat.FieldType.f38220v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37767n[WireFormat.FieldType.f38218o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private void HI(int i2) throws InvalidProtocolBufferException {
        if (this.f37765n.O() != i2) {
            throw InvalidProtocolBufferException.az();
        }
    }

    private void Ik(int i2) throws InvalidProtocolBufferException {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.KN();
        }
    }

    public static CodedInputStreamReader KN(CodedInputStream codedInputStream) {
        CodedInputStreamReader codedInputStreamReader = codedInputStream.nr;
        return codedInputStreamReader != null ? codedInputStreamReader : new CodedInputStreamReader(codedInputStream);
    }

    private void ck(int i2) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (WireFormat.rl(this.rl) != i2) {
            throw InvalidProtocolBufferException.O();
        }
    }

    private Object gh(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (AnonymousClass1.f37767n[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return t(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private void mUb(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int iE = this.f37765n.e();
        CodedInputStream codedInputStream = this.f37765n;
        if (codedInputStream.f37758n >= codedInputStream.rl) {
            throw InvalidProtocolBufferException.xMQ();
        }
        int iHI = codedInputStream.HI(iE);
        this.f37765n.f37758n++;
        schema.n(obj, this, extensionRegistryLite);
        this.f37765n.n(0);
        r5.f37758n--;
        this.f37765n.ty(iHI);
    }

    private void r(int i2) throws InvalidProtocolBufferException {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.KN();
        }
    }

    private void xMQ(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i2 = this.f37766t;
        this.f37766t = WireFormat.t(WireFormat.n(this.rl), 4);
        try {
            schema.n(obj, this, extensionRegistryLite);
            if (this.rl == this.f37766t) {
            } else {
                throw InvalidProtocolBufferException.KN();
            }
        } finally {
            this.f37766t = i2;
        }
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void Uo(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iE2;
        if (WireFormat.rl(this.rl) != 3) {
            throw InvalidProtocolBufferException.O();
        }
        int i2 = this.rl;
        do {
            list.add(qie(schema, extensionRegistryLite));
            if (this.f37765n.J2() || this.nr != 0) {
                return;
            } else {
                iE2 = this.f37765n.E2();
            }
        } while (iE2 == i2);
        this.nr = iE2;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public int getFieldNumber() {
        int i2 = this.nr;
        if (i2 != 0) {
            this.rl = i2;
            this.nr = 0;
        } else {
            this.rl = this.f37765n.E2();
        }
        int i3 = this.rl;
        if (i3 == 0 || i3 == this.f37766t) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.n(i3);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public int getTag() {
        return this.rl;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readBoolList(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof BooleanArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Boolean.valueOf(this.f37765n.ck()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO = this.f37765n.O() + this.f37765n.e();
            do {
                list.add(Boolean.valueOf(this.f37765n.ck()));
            } while (this.f37765n.O() < iO);
            HI(iO);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 0) {
            do {
                booleanArrayList.addBoolean(this.f37765n.ck());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iO2 = this.f37765n.O() + this.f37765n.e();
        do {
            booleanArrayList.addBoolean(this.f37765n.ck());
        } while (this.f37765n.O() < iO2);
        HI(iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iE2;
        if (WireFormat.rl(this.rl) != 2) {
            throw InvalidProtocolBufferException.O();
        }
        do {
            list.add(readBytes());
            if (this.f37765n.J2()) {
                return;
            } else {
                iE2 = this.f37765n.E2();
            }
        } while (iE2 == this.rl);
        this.nr = iE2;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readDoubleList(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof DoubleArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 1) {
                do {
                    list.add(Double.valueOf(this.f37765n.r()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iE = this.f37765n.e();
            r(iE);
            int iO = this.f37765n.O() + iE;
            do {
                list.add(Double.valueOf(this.f37765n.r()));
            } while (this.f37765n.O() < iO);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 1) {
            do {
                doubleArrayList.addDouble(this.f37765n.r());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iE3 = this.f37765n.e();
        r(iE3);
        int iO2 = this.f37765n.O() + iE3;
        do {
            doubleArrayList.addDouble(this.f37765n.r());
        } while (this.f37765n.O() < iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readEnumList(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof IntArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Integer.valueOf(this.f37765n.o()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO = this.f37765n.O() + this.f37765n.e();
            do {
                list.add(Integer.valueOf(this.f37765n.o()));
            } while (this.f37765n.O() < iO);
            HI(iO);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 0) {
            do {
                intArrayList.addInt(this.f37765n.o());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iO2 = this.f37765n.O() + this.f37765n.e();
        do {
            intArrayList.addInt(this.f37765n.o());
        } while (this.f37765n.O() < iO2);
        HI(iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readFixed32List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof IntArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 2) {
                int iE = this.f37765n.e();
                Ik(iE);
                int iO = this.f37765n.O() + iE;
                do {
                    list.add(Integer.valueOf(this.f37765n.Z()));
                } while (this.f37765n.O() < iO);
                return;
            }
            if (iRl != 5) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                list.add(Integer.valueOf(this.f37765n.Z()));
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE2 = this.f37765n.E2();
                }
            } while (iE2 == this.rl);
            this.nr = iE2;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 2) {
            int iE3 = this.f37765n.e();
            Ik(iE3);
            int iO2 = this.f37765n.O() + iE3;
            do {
                intArrayList.addInt(this.f37765n.Z());
            } while (this.f37765n.O() < iO2);
            return;
        }
        if (iRl2 != 5) {
            throw InvalidProtocolBufferException.O();
        }
        do {
            intArrayList.addInt(this.f37765n.Z());
            if (this.f37765n.J2()) {
                return;
            } else {
                iE22 = this.f37765n.E2();
            }
        } while (iE22 == this.rl);
        this.nr = iE22;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readFixed64List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof LongArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 1) {
                do {
                    list.add(Long.valueOf(this.f37765n.XQ()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iE = this.f37765n.e();
            r(iE);
            int iO = this.f37765n.O() + iE;
            do {
                list.add(Long.valueOf(this.f37765n.XQ()));
            } while (this.f37765n.O() < iO);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 1) {
            do {
                longArrayList.addLong(this.f37765n.XQ());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iE3 = this.f37765n.e();
        r(iE3);
        int iO2 = this.f37765n.O() + iE3;
        do {
            longArrayList.addLong(this.f37765n.XQ());
        } while (this.f37765n.O() < iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readFloatList(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof FloatArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 2) {
                int iE = this.f37765n.e();
                Ik(iE);
                int iO = this.f37765n.O() + iE;
                do {
                    list.add(Float.valueOf(this.f37765n.S()));
                } while (this.f37765n.O() < iO);
                return;
            }
            if (iRl != 5) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                list.add(Float.valueOf(this.f37765n.S()));
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE2 = this.f37765n.E2();
                }
            } while (iE2 == this.rl);
            this.nr = iE2;
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 2) {
            int iE3 = this.f37765n.e();
            Ik(iE3);
            int iO2 = this.f37765n.O() + iE3;
            do {
                floatArrayList.addFloat(this.f37765n.S());
            } while (this.f37765n.O() < iO2);
            return;
        }
        if (iRl2 != 5) {
            throw InvalidProtocolBufferException.O();
        }
        do {
            floatArrayList.addFloat(this.f37765n.S());
            if (this.f37765n.J2()) {
                return;
            } else {
                iE22 = this.f37765n.E2();
            }
        } while (iE22 == this.rl);
        this.nr = iE22;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readInt32List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof IntArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Integer.valueOf(this.f37765n.WPU()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO = this.f37765n.O() + this.f37765n.e();
            do {
                list.add(Integer.valueOf(this.f37765n.WPU()));
            } while (this.f37765n.O() < iO);
            HI(iO);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 0) {
            do {
                intArrayList.addInt(this.f37765n.WPU());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iO2 = this.f37765n.O() + this.f37765n.e();
        do {
            intArrayList.addInt(this.f37765n.WPU());
        } while (this.f37765n.O() < iO2);
        HI(iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readInt64List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof LongArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Long.valueOf(this.f37765n.aYN()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO = this.f37765n.O() + this.f37765n.e();
            do {
                list.add(Long.valueOf(this.f37765n.aYN()));
            } while (this.f37765n.O() < iO);
            HI(iO);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 0) {
            do {
                longArrayList.addLong(this.f37765n.aYN());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iO2 = this.f37765n.O() + this.f37765n.e();
        do {
            longArrayList.addLong(this.f37765n.aYN());
        } while (this.f37765n.O() < iO2);
        HI(iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readSFixed32List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof IntArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 2) {
                int iE = this.f37765n.e();
                Ik(iE);
                int iO = this.f37765n.O() + iE;
                do {
                    list.add(Integer.valueOf(this.f37765n.ViF()));
                } while (this.f37765n.O() < iO);
                return;
            }
            if (iRl != 5) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                list.add(Integer.valueOf(this.f37765n.ViF()));
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE2 = this.f37765n.E2();
                }
            } while (iE2 == this.rl);
            this.nr = iE2;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 2) {
            int iE3 = this.f37765n.e();
            Ik(iE3);
            int iO2 = this.f37765n.O() + iE3;
            do {
                intArrayList.addInt(this.f37765n.ViF());
            } while (this.f37765n.O() < iO2);
            return;
        }
        if (iRl2 != 5) {
            throw InvalidProtocolBufferException.O();
        }
        do {
            intArrayList.addInt(this.f37765n.ViF());
            if (this.f37765n.J2()) {
                return;
            } else {
                iE22 = this.f37765n.E2();
            }
        } while (iE22 == this.rl);
        this.nr = iE22;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readSFixed64List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof LongArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 1) {
                do {
                    list.add(Long.valueOf(this.f37765n.nY()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iE = this.f37765n.e();
            r(iE);
            int iO = this.f37765n.O() + iE;
            do {
                list.add(Long.valueOf(this.f37765n.nY()));
            } while (this.f37765n.O() < iO);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 1) {
            do {
                longArrayList.addLong(this.f37765n.nY());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iE3 = this.f37765n.e();
        r(iE3);
        int iO2 = this.f37765n.O() + iE3;
        do {
            longArrayList.addLong(this.f37765n.nY());
        } while (this.f37765n.O() < iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readSInt32List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof IntArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Integer.valueOf(this.f37765n.g()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO = this.f37765n.O() + this.f37765n.e();
            do {
                list.add(Integer.valueOf(this.f37765n.g()));
            } while (this.f37765n.O() < iO);
            HI(iO);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 0) {
            do {
                intArrayList.addInt(this.f37765n.g());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iO2 = this.f37765n.O() + this.f37765n.e();
        do {
            intArrayList.addInt(this.f37765n.g());
        } while (this.f37765n.O() < iO2);
        HI(iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readSInt64List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof LongArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Long.valueOf(this.f37765n.te()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO = this.f37765n.O() + this.f37765n.e();
            do {
                list.add(Long.valueOf(this.f37765n.te()));
            } while (this.f37765n.O() < iO);
            HI(iO);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 0) {
            do {
                longArrayList.addLong(this.f37765n.te());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iO2 = this.f37765n.O() + this.f37765n.e();
        do {
            longArrayList.addLong(this.f37765n.te());
        } while (this.f37765n.O() < iO2);
        HI(iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readUInt32List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof IntArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Integer.valueOf(this.f37765n.e()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO = this.f37765n.O() + this.f37765n.e();
            do {
                list.add(Integer.valueOf(this.f37765n.e()));
            } while (this.f37765n.O() < iO);
            HI(iO);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 0) {
            do {
                intArrayList.addInt(this.f37765n.e());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iO2 = this.f37765n.O() + this.f37765n.e();
        do {
            intArrayList.addInt(this.f37765n.e());
        } while (this.f37765n.O() < iO2);
        HI(iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void readUInt64List(List list) throws InvalidProtocolBufferException {
        int iE2;
        int iE22;
        if (!(list instanceof LongArrayList)) {
            int iRl = WireFormat.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Long.valueOf(this.f37765n.X()));
                    if (this.f37765n.J2()) {
                        return;
                    } else {
                        iE2 = this.f37765n.E2();
                    }
                } while (iE2 == this.rl);
                this.nr = iE2;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO = this.f37765n.O() + this.f37765n.e();
            do {
                list.add(Long.valueOf(this.f37765n.X()));
            } while (this.f37765n.O() < iO);
            HI(iO);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iRl2 = WireFormat.rl(this.rl);
        if (iRl2 == 0) {
            do {
                longArrayList.addLong(this.f37765n.X());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE22 = this.f37765n.E2();
                }
            } while (iE22 == this.rl);
            this.nr = iE22;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iO2 = this.f37765n.O() + this.f37765n.e();
        do {
            longArrayList.addLong(this.f37765n.X());
        } while (this.f37765n.O() < iO2);
        HI(iO2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public void rl(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iE2;
        if (WireFormat.rl(this.rl) != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int i2 = this.rl;
        do {
            list.add(az(schema, extensionRegistryLite));
            if (this.f37765n.J2() || this.nr != 0) {
                return;
            } else {
                iE2 = this.f37765n.E2();
            }
        } while (iE2 == i2);
        this.nr = iE2;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public boolean skipField() {
        int i2;
        if (this.f37765n.J2() || (i2 = this.rl) == this.f37766t) {
            return false;
        }
        return this.f37765n.T(i2);
    }

    public void ty(List list, boolean z2) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iE2;
        int iE22;
        if (WireFormat.rl(this.rl) != 2) {
            throw InvalidProtocolBufferException.O();
        }
        if (!(list instanceof LazyStringList) || z2) {
            do {
                list.add(z2 ? readStringRequireUtf8() : readString());
                if (this.f37765n.J2()) {
                    return;
                } else {
                    iE2 = this.f37765n.E2();
                }
            } while (iE2 == this.rl);
            this.nr = iE2;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.a(readBytes());
            if (this.f37765n.J2()) {
                return;
            } else {
                iE22 = this.f37765n.E2();
            }
        } while (iE22 == this.rl);
        this.nr = iE22;
    }

    private CodedInputStreamReader(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.rl(codedInputStream, "input");
        this.f37765n = codedInputStream2;
        codedInputStream2.nr = this;
    }

    private Object az(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object objNewInstance = schema.newInstance();
        mUb(objNewInstance, schema, extensionRegistryLite);
        schema.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    private Object qie(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Object objNewInstance = schema.newInstance();
        xMQ(objNewInstance, schema, extensionRegistryLite);
        schema.makeImmutable(objNewInstance);
        return objNewInstance;
    }
}
