package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.InvalidProtocolBufferException;
import androidx.content.preferences.protobuf.MapEntryLite;
import androidx.content.preferences.protobuf.WireFormat;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
abstract class BinaryReader implements Reader {

    private static final class SafeHeapReader extends BinaryReader {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f37723O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f37724n;
        private int nr;
        private final byte[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f37725t;

        private int qie() throws InvalidProtocolBufferException {
            S(4);
            return az();
        }

        private void te() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (xMQ() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        public String Ik(boolean z2) throws InvalidProtocolBufferException {
            aYN(2);
            int iO = o();
            if (iO == 0) {
                return "";
            }
            S(iO);
            if (z2) {
                byte[] bArr = this.rl;
                int i2 = this.f37725t;
                if (!Utf8.XQ(bArr, i2, i2 + iO)) {
                    throw InvalidProtocolBufferException.nr();
                }
            }
            String str = new String(this.rl, this.f37725t, iO, Internal.rl);
            this.f37725t += iO;
            return str;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void O(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            aYN(2);
            int iO = o();
            S(iO);
            int i2 = this.nr;
            this.nr = this.f37725t + iO;
            try {
                Object objMUb = metadata.rl;
                Object objMUb2 = metadata.nr;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(objMUb, objMUb2);
                        return;
                    }
                    if (fieldNumber == 1) {
                        objMUb = mUb(metadata.f38084n, null, null);
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
                        objMUb2 = mUb(metadata.f38085t, metadata.nr.getClass(), extensionRegistryLite);
                    }
                }
            } finally {
                this.nr = i2;
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public Object nr(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(3);
            return gh(Protobuf.n().t(cls), extensionRegistryLite);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(0);
            return o() != 0;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public ByteString readBytes() throws InvalidProtocolBufferException {
            aYN(2);
            int iO = o();
            if (iO == 0) {
                return ByteString.f37740t;
            }
            S(iO);
            ByteString byteStringWTp = this.f37724n ? ByteString.wTp(this.rl, this.f37725t, iO) : ByteString.az(this.rl, this.f37725t, iO);
            this.f37725t += iO;
            return byteStringWTp;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(1);
            return Double.longBitsToDouble(ty());
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(0);
            return o();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(5);
            return qie();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(1);
            return ty();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(5);
            return Float.intBitsToFloat(qie());
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(0);
            return o();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(0);
            return Z();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(5);
            return qie();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(1);
            return ty();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(0);
            return CodedInputStream.t(o());
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(0);
            return CodedInputStream.nr(Z());
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public String readString() {
            return Ik(false);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            r(list, false);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            r(list, true);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public String readStringRequireUtf8() {
            return Ik(true);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(0);
            return o();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(0);
            return Z();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public Object t(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            aYN(2);
            return ck(Protobuf.n().t(cls), extensionRegistryLite);
        }

        private long HI() {
            int i2 = this.f37725t;
            byte[] bArr = this.rl;
            this.f37725t = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        private boolean KN() {
            return this.f37725t == this.nr;
        }

        private void S(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0 || i2 > this.nr - this.f37725t) {
                throw InvalidProtocolBufferException.az();
            }
        }

        private void WPU(int i2) throws InvalidProtocolBufferException {
            if (this.f37725t != i2) {
                throw InvalidProtocolBufferException.az();
            }
        }

        private long XQ() throws InvalidProtocolBufferException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte bXMQ = xMQ();
                j2 |= ((long) (bXMQ & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((bXMQ & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private void aYN(int i2) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (WireFormat.rl(this.f37723O) != i2) {
                throw InvalidProtocolBufferException.O();
            }
        }

        private int az() {
            int i2 = this.f37725t;
            byte[] bArr = this.rl;
            this.f37725t = i2 + 4;
            return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
        }

        private void g() throws InvalidProtocolBufferException {
            int i2 = this.nr;
            int i3 = this.f37725t;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.rl;
                int i5 = 0;
                while (i5 < 10) {
                    int i7 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.f37725t = i7;
                        return;
                    } else {
                        i5++;
                        i3 = i7;
                    }
                }
            }
            te();
        }

        private Object mUb(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
            switch (AnonymousClass1.f37722n[fieldType.ordinal()]) {
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
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private void nY() throws InvalidProtocolBufferException {
            int i2 = this.J2;
            this.J2 = WireFormat.t(WireFormat.n(this.f37723O), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.f37723O != this.J2) {
                throw InvalidProtocolBufferException.KN();
            }
            this.J2 = i2;
        }

        private int o() throws InvalidProtocolBufferException {
            int i2;
            int i3 = this.f37725t;
            int i5 = this.nr;
            if (i5 == i3) {
                throw InvalidProtocolBufferException.az();
            }
            byte[] bArr = this.rl;
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f37725t = i7;
                return b2;
            }
            if (i5 - i7 < 9) {
                return (int) XQ();
            }
            int i8 = i3 + 2;
            int i9 = (bArr[i7] << 7) ^ b2;
            if (i9 < 0) {
                i2 = i9 ^ (-128);
            } else {
                int i10 = i3 + 3;
                int i11 = (bArr[i8] << 14) ^ i9;
                if (i11 >= 0) {
                    i2 = i11 ^ 16256;
                } else {
                    int i12 = i3 + 4;
                    int i13 = i11 ^ (bArr[i10] << 21);
                    if (i13 < 0) {
                        i2 = (-2080896) ^ i13;
                    } else {
                        i10 = i3 + 5;
                        byte b4 = bArr[i12];
                        int i14 = (i13 ^ (b4 << 28)) ^ 266354560;
                        if (b4 < 0) {
                            i12 = i3 + 6;
                            if (bArr[i10] < 0) {
                                i10 = i3 + 7;
                                if (bArr[i12] < 0) {
                                    i12 = i3 + 8;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 9;
                                        if (bArr[i12] < 0) {
                                            int i15 = i3 + 10;
                                            if (bArr[i10] < 0) {
                                                throw InvalidProtocolBufferException.J2();
                                            }
                                            i8 = i15;
                                            i2 = i14;
                                        }
                                    }
                                }
                            }
                            i2 = i14;
                        }
                        i2 = i14;
                    }
                    i8 = i12;
                }
                i8 = i10;
            }
            this.f37725t = i8;
            return i2;
        }

        private long ty() throws InvalidProtocolBufferException {
            S(8);
            return HI();
        }

        private byte xMQ() throws InvalidProtocolBufferException {
            int i2 = this.f37725t;
            if (i2 == this.nr) {
                throw InvalidProtocolBufferException.az();
            }
            byte[] bArr = this.rl;
            this.f37725t = i2 + 1;
            return bArr[i2];
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void J2(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.J2;
            this.J2 = WireFormat.t(WireFormat.n(this.f37723O), 4);
            try {
                schema.n(obj, this, extensionRegistryLite);
                if (this.f37723O == this.J2) {
                } else {
                    throw InvalidProtocolBufferException.KN();
                }
            } finally {
                this.J2 = i2;
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void Uo(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i2;
            if (WireFormat.rl(this.f37723O) != 3) {
                throw InvalidProtocolBufferException.O();
            }
            int i3 = this.f37723O;
            do {
                list.add(gh(schema, extensionRegistryLite));
                if (KN()) {
                    return;
                } else {
                    i2 = this.f37725t;
                }
            } while (o() == i3);
            this.f37725t = i2;
        }

        public long Z() throws InvalidProtocolBufferException {
            long j2;
            long j3;
            long j4;
            int i2 = this.f37725t;
            int i3 = this.nr;
            if (i3 == i2) {
                throw InvalidProtocolBufferException.az();
            }
            byte[] bArr = this.rl;
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f37725t = i5;
                return b2;
            }
            if (i3 - i5 < 9) {
                return XQ();
            }
            int i7 = i2 + 2;
            int i8 = (bArr[i5] << 7) ^ b2;
            if (i8 < 0) {
                j2 = i8 ^ (-128);
            } else {
                int i9 = i2 + 3;
                int i10 = (bArr[i7] << 14) ^ i8;
                if (i10 >= 0) {
                    j2 = i10 ^ 16256;
                    i7 = i9;
                } else {
                    int i11 = i2 + 4;
                    int i12 = i10 ^ (bArr[i9] << 21);
                    if (i12 < 0) {
                        long j5 = (-2080896) ^ i12;
                        i7 = i11;
                        j2 = j5;
                    } else {
                        long j6 = i12;
                        i7 = i2 + 5;
                        long j7 = j6 ^ (((long) bArr[i11]) << 28);
                        if (j7 >= 0) {
                            j4 = 266354560;
                        } else {
                            int i13 = i2 + 6;
                            long j9 = j7 ^ (((long) bArr[i7]) << 35);
                            if (j9 < 0) {
                                j3 = -34093383808L;
                            } else {
                                i7 = i2 + 7;
                                j7 = j9 ^ (((long) bArr[i13]) << 42);
                                if (j7 >= 0) {
                                    j4 = 4363953127296L;
                                } else {
                                    i13 = i2 + 8;
                                    j9 = j7 ^ (((long) bArr[i7]) << 49);
                                    if (j9 < 0) {
                                        j3 = -558586000294016L;
                                    } else {
                                        i7 = i2 + 9;
                                        long j10 = (j9 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                        if (j10 < 0) {
                                            int i14 = i2 + 10;
                                            if (bArr[i7] < 0) {
                                                throw InvalidProtocolBufferException.J2();
                                            }
                                            i7 = i14;
                                        }
                                        j2 = j10;
                                    }
                                }
                            }
                            j2 = j9 ^ j3;
                            i7 = i13;
                        }
                        j2 = j7 ^ j4;
                    }
                }
            }
            this.f37725t = i7;
            return j2;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public int getTag() {
            return this.f37723O;
        }

        public void r(List list, boolean z2) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i2;
            int i3;
            if (WireFormat.rl(this.f37723O) != 2) {
                throw InvalidProtocolBufferException.O();
            }
            if (!(list instanceof LazyStringList) || z2) {
                do {
                    list.add(Ik(z2));
                    if (KN()) {
                        return;
                    } else {
                        i2 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i2;
                return;
            }
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.a(readBytes());
                if (KN()) {
                    return;
                } else {
                    i3 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i3;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readBoolList(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof BooleanArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl != 0) {
                    if (iRl != 2) {
                        throw InvalidProtocolBufferException.O();
                    }
                    int iO = this.f37725t + o();
                    while (this.f37725t < iO) {
                        list.add(Boolean.valueOf(o() != 0));
                    }
                    WPU(iO);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(readBool()));
                    if (KN()) {
                        return;
                    } else {
                        i2 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i2;
                return;
            }
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 != 0) {
                if (iRl2 != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO2 = this.f37725t + o();
                while (this.f37725t < iO2) {
                    booleanArrayList.addBoolean(o() != 0);
                }
                WPU(iO2);
                return;
            }
            do {
                booleanArrayList.addBoolean(readBool());
                if (KN()) {
                    return;
                } else {
                    i3 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i3;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i2;
            if (WireFormat.rl(this.f37723O) != 2) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                list.add(readBytes());
                if (KN()) {
                    return;
                } else {
                    i2 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i2;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readDoubleList(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof DoubleArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (KN()) {
                            return;
                        } else {
                            i2 = this.f37725t;
                        }
                    } while (o() == this.f37723O);
                    this.f37725t = i2;
                    return;
                }
                if (iRl != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO = o();
                fD(iO);
                int i5 = this.f37725t + iO;
                while (this.f37725t < i5) {
                    list.add(Double.valueOf(Double.longBitsToDouble(HI())));
                }
                return;
            }
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 == 1) {
                do {
                    doubleArrayList.addDouble(readDouble());
                    if (KN()) {
                        return;
                    } else {
                        i3 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i3;
                return;
            }
            if (iRl2 != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO2 = o();
            fD(iO2);
            int i7 = this.f37725t + iO2;
            while (this.f37725t < i7) {
                doubleArrayList.addDouble(Double.longBitsToDouble(HI()));
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readEnumList(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl != 0) {
                    if (iRl != 2) {
                        throw InvalidProtocolBufferException.O();
                    }
                    int iO = this.f37725t + o();
                    while (this.f37725t < iO) {
                        list.add(Integer.valueOf(o()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readEnum()));
                    if (KN()) {
                        return;
                    } else {
                        i2 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 != 0) {
                if (iRl2 != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO2 = this.f37725t + o();
                while (this.f37725t < iO2) {
                    intArrayList.addInt(o());
                }
                return;
            }
            do {
                intArrayList.addInt(readEnum());
                if (KN()) {
                    return;
                } else {
                    i3 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i3;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readFixed32List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl == 2) {
                    int iO = o();
                    iF(iO);
                    int i5 = this.f37725t + iO;
                    while (this.f37725t < i5) {
                        list.add(Integer.valueOf(az()));
                    }
                    return;
                }
                if (iRl != 5) {
                    throw InvalidProtocolBufferException.O();
                }
                do {
                    list.add(Integer.valueOf(readFixed32()));
                    if (KN()) {
                        return;
                    } else {
                        i2 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 == 2) {
                int iO2 = o();
                iF(iO2);
                int i7 = this.f37725t + iO2;
                while (this.f37725t < i7) {
                    intArrayList.addInt(az());
                }
                return;
            }
            if (iRl2 != 5) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                intArrayList.addInt(readFixed32());
                if (KN()) {
                    return;
                } else {
                    i3 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i3;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readFixed64List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl == 1) {
                    do {
                        list.add(Long.valueOf(readFixed64()));
                        if (KN()) {
                            return;
                        } else {
                            i2 = this.f37725t;
                        }
                    } while (o() == this.f37723O);
                    this.f37725t = i2;
                    return;
                }
                if (iRl != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO = o();
                fD(iO);
                int i5 = this.f37725t + iO;
                while (this.f37725t < i5) {
                    list.add(Long.valueOf(HI()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 == 1) {
                do {
                    longArrayList.addLong(readFixed64());
                    if (KN()) {
                        return;
                    } else {
                        i3 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i3;
                return;
            }
            if (iRl2 != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO2 = o();
            fD(iO2);
            int i7 = this.f37725t + iO2;
            while (this.f37725t < i7) {
                longArrayList.addLong(HI());
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readFloatList(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof FloatArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl == 2) {
                    int iO = o();
                    iF(iO);
                    int i5 = this.f37725t + iO;
                    while (this.f37725t < i5) {
                        list.add(Float.valueOf(Float.intBitsToFloat(az())));
                    }
                    return;
                }
                if (iRl != 5) {
                    throw InvalidProtocolBufferException.O();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (KN()) {
                        return;
                    } else {
                        i2 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i2;
                return;
            }
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 == 2) {
                int iO2 = o();
                iF(iO2);
                int i7 = this.f37725t + iO2;
                while (this.f37725t < i7) {
                    floatArrayList.addFloat(Float.intBitsToFloat(az()));
                }
                return;
            }
            if (iRl2 != 5) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                floatArrayList.addFloat(readFloat());
                if (KN()) {
                    return;
                } else {
                    i3 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i3;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readInt32List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl == 0) {
                    do {
                        list.add(Integer.valueOf(readInt32()));
                        if (KN()) {
                            return;
                        } else {
                            i2 = this.f37725t;
                        }
                    } while (o() == this.f37723O);
                    this.f37725t = i2;
                    return;
                }
                if (iRl != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO = this.f37725t + o();
                while (this.f37725t < iO) {
                    list.add(Integer.valueOf(o()));
                }
                WPU(iO);
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 == 0) {
                do {
                    intArrayList.addInt(readInt32());
                    if (KN()) {
                        return;
                    } else {
                        i3 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i3;
                return;
            }
            if (iRl2 != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO2 = this.f37725t + o();
            while (this.f37725t < iO2) {
                intArrayList.addInt(o());
            }
            WPU(iO2);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readInt64List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl == 0) {
                    do {
                        list.add(Long.valueOf(readInt64()));
                        if (KN()) {
                            return;
                        } else {
                            i2 = this.f37725t;
                        }
                    } while (o() == this.f37723O);
                    this.f37725t = i2;
                    return;
                }
                if (iRl != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO = this.f37725t + o();
                while (this.f37725t < iO) {
                    list.add(Long.valueOf(Z()));
                }
                WPU(iO);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 == 0) {
                do {
                    longArrayList.addLong(readInt64());
                    if (KN()) {
                        return;
                    } else {
                        i3 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i3;
                return;
            }
            if (iRl2 != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO2 = this.f37725t + o();
            while (this.f37725t < iO2) {
                longArrayList.addLong(Z());
            }
            WPU(iO2);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readSFixed32List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl == 2) {
                    int iO = o();
                    iF(iO);
                    int i5 = this.f37725t + iO;
                    while (this.f37725t < i5) {
                        list.add(Integer.valueOf(az()));
                    }
                    return;
                }
                if (iRl != 5) {
                    throw InvalidProtocolBufferException.O();
                }
                do {
                    list.add(Integer.valueOf(readSFixed32()));
                    if (KN()) {
                        return;
                    } else {
                        i2 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 == 2) {
                int iO2 = o();
                iF(iO2);
                int i7 = this.f37725t + iO2;
                while (this.f37725t < i7) {
                    intArrayList.addInt(az());
                }
                return;
            }
            if (iRl2 != 5) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                intArrayList.addInt(readSFixed32());
                if (KN()) {
                    return;
                } else {
                    i3 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i3;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readSFixed64List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl == 1) {
                    do {
                        list.add(Long.valueOf(readSFixed64()));
                        if (KN()) {
                            return;
                        } else {
                            i2 = this.f37725t;
                        }
                    } while (o() == this.f37723O);
                    this.f37725t = i2;
                    return;
                }
                if (iRl != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO = o();
                fD(iO);
                int i5 = this.f37725t + iO;
                while (this.f37725t < i5) {
                    list.add(Long.valueOf(HI()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 == 1) {
                do {
                    longArrayList.addLong(readSFixed64());
                    if (KN()) {
                        return;
                    } else {
                        i3 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i3;
                return;
            }
            if (iRl2 != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO2 = o();
            fD(iO2);
            int i7 = this.f37725t + iO2;
            while (this.f37725t < i7) {
                longArrayList.addLong(HI());
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readSInt32List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl != 0) {
                    if (iRl != 2) {
                        throw InvalidProtocolBufferException.O();
                    }
                    int iO = this.f37725t + o();
                    while (this.f37725t < iO) {
                        list.add(Integer.valueOf(CodedInputStream.t(o())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readSInt32()));
                    if (KN()) {
                        return;
                    } else {
                        i2 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 != 0) {
                if (iRl2 != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO2 = this.f37725t + o();
                while (this.f37725t < iO2) {
                    intArrayList.addInt(CodedInputStream.t(o()));
                }
                return;
            }
            do {
                intArrayList.addInt(readSInt32());
                if (KN()) {
                    return;
                } else {
                    i3 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i3;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readSInt64List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl != 0) {
                    if (iRl != 2) {
                        throw InvalidProtocolBufferException.O();
                    }
                    int iO = this.f37725t + o();
                    while (this.f37725t < iO) {
                        list.add(Long.valueOf(CodedInputStream.nr(Z())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(readSInt64()));
                    if (KN()) {
                        return;
                    } else {
                        i2 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i2;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 != 0) {
                if (iRl2 != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO2 = this.f37725t + o();
                while (this.f37725t < iO2) {
                    longArrayList.addLong(CodedInputStream.nr(Z()));
                }
                return;
            }
            do {
                longArrayList.addLong(readSInt64());
                if (KN()) {
                    return;
                } else {
                    i3 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i3;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readUInt32List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl != 0) {
                    if (iRl != 2) {
                        throw InvalidProtocolBufferException.O();
                    }
                    int iO = this.f37725t + o();
                    while (this.f37725t < iO) {
                        list.add(Integer.valueOf(o()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readUInt32()));
                    if (KN()) {
                        return;
                    } else {
                        i2 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 != 0) {
                if (iRl2 != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO2 = this.f37725t + o();
                while (this.f37725t < iO2) {
                    intArrayList.addInt(o());
                }
                return;
            }
            do {
                intArrayList.addInt(readUInt32());
                if (KN()) {
                    return;
                } else {
                    i3 = this.f37725t;
                }
            } while (o() == this.f37723O);
            this.f37725t = i3;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void readUInt64List(List list) throws InvalidProtocolBufferException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int iRl = WireFormat.rl(this.f37723O);
                if (iRl == 0) {
                    do {
                        list.add(Long.valueOf(readUInt64()));
                        if (KN()) {
                            return;
                        } else {
                            i2 = this.f37725t;
                        }
                    } while (o() == this.f37723O);
                    this.f37725t = i2;
                    return;
                }
                if (iRl != 2) {
                    throw InvalidProtocolBufferException.O();
                }
                int iO = this.f37725t + o();
                while (this.f37725t < iO) {
                    list.add(Long.valueOf(Z()));
                }
                WPU(iO);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int iRl2 = WireFormat.rl(this.f37723O);
            if (iRl2 == 0) {
                do {
                    longArrayList.addLong(readUInt64());
                    if (KN()) {
                        return;
                    } else {
                        i3 = this.f37725t;
                    }
                } while (o() == this.f37723O);
                this.f37725t = i3;
                return;
            }
            if (iRl2 != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iO2 = this.f37725t + o();
            while (this.f37725t < iO2) {
                longArrayList.addLong(Z());
            }
            WPU(iO2);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void rl(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i2;
            if (WireFormat.rl(this.f37723O) != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int i3 = this.f37723O;
            do {
                list.add(ck(schema, extensionRegistryLite));
                if (KN()) {
                    return;
                } else {
                    i2 = this.f37725t;
                }
            } while (o() == i3);
            this.f37725t = i2;
        }

        private void ViF(int i2) throws InvalidProtocolBufferException {
            S(i2);
            this.f37725t += i2;
        }

        private Object ck(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Object objNewInstance = schema.newInstance();
            n(objNewInstance, schema, extensionRegistryLite);
            schema.makeImmutable(objNewInstance);
            return objNewInstance;
        }

        private void fD(int i2) throws InvalidProtocolBufferException {
            S(i2);
            if ((i2 & 7) == 0) {
            } else {
                throw InvalidProtocolBufferException.KN();
            }
        }

        private Object gh(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            Object objNewInstance = schema.newInstance();
            J2(objNewInstance, schema, extensionRegistryLite);
            schema.makeImmutable(objNewInstance);
            return objNewInstance;
        }

        private void iF(int i2) throws InvalidProtocolBufferException {
            S(i2);
            if ((i2 & 3) == 0) {
            } else {
                throw InvalidProtocolBufferException.KN();
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public int getFieldNumber() throws InvalidProtocolBufferException {
            if (KN()) {
                return Integer.MAX_VALUE;
            }
            int iO = o();
            this.f37723O = iO;
            if (iO == this.J2) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.n(iO);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public void n(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int iO = o();
            S(iO);
            int i2 = this.nr;
            int i3 = this.f37725t + iO;
            this.nr = i3;
            try {
                schema.n(obj, this, extensionRegistryLite);
                if (this.f37725t == i3) {
                } else {
                    throw InvalidProtocolBufferException.KN();
                }
            } finally {
                this.nr = i2;
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public boolean skipField() throws InvalidProtocolBufferException {
            int i2;
            if (!KN() && (i2 = this.f37723O) != this.J2) {
                int iRl = WireFormat.rl(i2);
                if (iRl != 0) {
                    if (iRl != 1) {
                        if (iRl != 2) {
                            if (iRl != 3) {
                                if (iRl == 5) {
                                    ViF(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.O();
                            }
                            nY();
                            return true;
                        }
                        ViF(o());
                        return true;
                    }
                    ViF(8);
                    return true;
                }
                g();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.BinaryReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37722n;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f37722n = iArr;
            try {
                iArr[WireFormat.FieldType.E2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37722n[WireFormat.FieldType.f38209N.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37722n[WireFormat.FieldType.f38210O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37722n[WireFormat.FieldType.Xw.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37722n[WireFormat.FieldType.f38217g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37722n[WireFormat.FieldType.f38211S.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37722n[WireFormat.FieldType.J2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37722n[WireFormat.FieldType.f38215Z.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37722n[WireFormat.FieldType.f38219r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37722n[WireFormat.FieldType.f38212T.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37722n[WireFormat.FieldType.jB.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37722n[WireFormat.FieldType.f38213U.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37722n[WireFormat.FieldType.P5.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37722n[WireFormat.FieldType.M7.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37722n[WireFormat.FieldType.f38216e.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37722n[WireFormat.FieldType.f38220v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37722n[WireFormat.FieldType.f38218o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }
}
