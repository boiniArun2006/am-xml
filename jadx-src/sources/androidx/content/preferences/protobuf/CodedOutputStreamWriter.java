package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.MapEntryLite;
import androidx.content.preferences.protobuf.WireFormat;
import androidx.content.preferences.protobuf.Writer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@CheckReturnValue
final class CodedOutputStreamWriter implements Writer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CodedOutputStream f37774n;

    private void E2(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeSFixed32(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iM7 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iM7 += CodedOutputStream.M7(((Integer) list.get(i5)).intValue());
        }
        this.f37774n.RQ(iM7);
        while (i3 < list.size()) {
            this.f37774n.How(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    private void HI(int i2, DoubleArrayList doubleArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < doubleArrayList.size()) {
                this.f37774n.writeDouble(i2, doubleArrayList.getDouble(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iR = 0;
        for (int i5 = 0; i5 < doubleArrayList.size(); i5++) {
            iR += CodedOutputStream.r(doubleArrayList.getDouble(i5));
        }
        this.f37774n.RQ(iR);
        while (i3 < doubleArrayList.size()) {
            this.f37774n.eWT(doubleArrayList.getDouble(i3));
            i3++;
        }
    }

    private void Ik(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < intArrayList.size()) {
                this.f37774n.writeEnum(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iZ = 0;
        for (int i5 = 0; i5 < intArrayList.size(); i5++) {
            iZ += CodedOutputStream.Z(intArrayList.getInt(i5));
        }
        this.f37774n.RQ(iZ);
        while (i3 < intArrayList.size()) {
            this.f37774n.ul(intArrayList.getInt(i3));
            i3++;
        }
    }

    private void KN(int i2, BooleanArrayList booleanArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < booleanArrayList.size()) {
                this.f37774n.writeBool(i2, booleanArrayList.getBoolean(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iAz = 0;
        for (int i5 = 0; i5 < booleanArrayList.size(); i5++) {
            iAz += CodedOutputStream.az(booleanArrayList.getBoolean(i5));
        }
        this.f37774n.RQ(iAz);
        while (i3 < booleanArrayList.size()) {
            this.f37774n.C(booleanArrayList.getBoolean(i3));
            i3++;
        }
    }

    private void S(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeFixed64(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iAYN = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iAYN += CodedOutputStream.aYN(((Long) list.get(i5)).longValue());
        }
        this.f37774n.RQ(iAYN);
        while (i3 < list.size()) {
            this.f37774n.Jk(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    private void T(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < intArrayList.size()) {
                this.f37774n.writeSInt32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iM = 0;
        for (int i5 = 0; i5 < intArrayList.size(); i5++) {
            iM += CodedOutputStream.M(intArrayList.getInt(i5));
        }
        this.f37774n.RQ(iM);
        while (i3 < intArrayList.size()) {
            this.f37774n.ER(intArrayList.getInt(i3));
            i3++;
        }
    }

    private void ViF(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < intArrayList.size()) {
                this.f37774n.writeInt32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iE2 = 0;
        for (int i5 = 0; i5 < intArrayList.size(); i5++) {
            iE2 += CodedOutputStream.E2(intArrayList.getInt(i5));
        }
        this.f37774n.RQ(iE2);
        while (i3 < intArrayList.size()) {
            this.f37774n.GD(intArrayList.getInt(i3));
            i3++;
        }
    }

    private void WPU(int i2, FloatArrayList floatArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < floatArrayList.size()) {
                this.f37774n.writeFloat(i2, floatArrayList.getFloat(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iNY = 0;
        for (int i5 = 0; i5 < floatArrayList.size(); i5++) {
            iNY += CodedOutputStream.nY(floatArrayList.getFloat(i5));
        }
        this.f37774n.RQ(iNY);
        while (i3 < floatArrayList.size()) {
            this.f37774n.Rl(floatArrayList.getFloat(i3));
            i3++;
        }
    }

    private void X(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeSFixed64(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iEF = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iEF += CodedOutputStream.eF(((Long) list.get(i5)).longValue());
        }
        this.f37774n.RQ(iEF);
        while (i3 < list.size()) {
            this.f37774n.tUK(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    private void XQ(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < longArrayList.size()) {
                this.f37774n.writeFixed64(i2, longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iAYN = 0;
        for (int i5 = 0; i5 < longArrayList.size(); i5++) {
            iAYN += CodedOutputStream.aYN(longArrayList.getLong(i5));
        }
        this.f37774n.RQ(iAYN);
        while (i3 < longArrayList.size()) {
            this.f37774n.Jk(longArrayList.getLong(i3));
            i3++;
        }
    }

    private void Z(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeFixed32(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iS = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iS += CodedOutputStream.S(((Integer) list.get(i5)).intValue());
        }
        this.f37774n.RQ(iS);
        while (i3 < list.size()) {
            this.f37774n.n1(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    private void aYN(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeFloat(i2, ((Float) list.get(i3)).floatValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iNY = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iNY += CodedOutputStream.nY(((Float) list.get(i5)).floatValue());
        }
        this.f37774n.RQ(iNY);
        while (i3 < list.size()) {
            this.f37774n.Rl(((Float) list.get(i3)).floatValue());
            i3++;
        }
    }

    private void bzg(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeUInt64(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iY = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iY += CodedOutputStream.Y(((Long) list.get(i5)).longValue());
        }
        this.f37774n.RQ(iY);
        while (i3 < list.size()) {
            this.f37774n.a63(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    private void ck(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeDouble(i2, ((Double) list.get(i3)).doubleValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iR = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iR += CodedOutputStream.r(((Double) list.get(i5)).doubleValue());
        }
        this.f37774n.RQ(iR);
        while (i3 < list.size()) {
            this.f37774n.eWT(((Double) list.get(i3)).doubleValue());
            i3++;
        }
    }

    private void e(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < longArrayList.size()) {
                this.f37774n.writeSFixed64(i2, longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iEF = 0;
        for (int i5 = 0; i5 < longArrayList.size(); i5++) {
            iEF += CodedOutputStream.eF(longArrayList.getLong(i5));
        }
        this.f37774n.RQ(iEF);
        while (i3 < longArrayList.size()) {
            this.f37774n.tUK(longArrayList.getLong(i3));
            i3++;
        }
    }

    private void fD(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < intArrayList.size()) {
                this.f37774n.writeSFixed32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iM7 = 0;
        for (int i5 = 0; i5 < intArrayList.size(); i5++) {
            iM7 += CodedOutputStream.M7(intArrayList.getInt(i5));
        }
        this.f37774n.RQ(iM7);
        while (i3 < intArrayList.size()) {
            this.f37774n.How(intArrayList.getInt(i3));
            i3++;
        }
    }

    private void g(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < longArrayList.size()) {
                this.f37774n.writeInt64(i2, longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iX = 0;
        for (int i5 = 0; i5 < longArrayList.size(); i5++) {
            iX += CodedOutputStream.X(longArrayList.getLong(i5));
        }
        this.f37774n.RQ(iX);
        while (i3 < longArrayList.size()) {
            this.f37774n.Po6(longArrayList.getLong(i3));
            i3++;
        }
    }

    private void nHg(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < longArrayList.size()) {
                this.f37774n.writeSInt64(i2, longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iB = 0;
        for (int i5 = 0; i5 < longArrayList.size(); i5++) {
            iB += CodedOutputStream.B(longArrayList.getLong(i5));
        }
        this.f37774n.RQ(iB);
        while (i3 < longArrayList.size()) {
            this.f37774n.lLA(longArrayList.getLong(i3));
            i3++;
        }
    }

    private void nY(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeInt32(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iE2 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iE2 += CodedOutputStream.E2(((Integer) list.get(i5)).intValue());
        }
        this.f37774n.RQ(iE2);
        while (i3 < list.size()) {
            this.f37774n.GD(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    private void o(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < intArrayList.size()) {
                this.f37774n.writeFixed32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iS = 0;
        for (int i5 = 0; i5 < intArrayList.size(); i5++) {
            iS += CodedOutputStream.S(intArrayList.getInt(i5));
        }
        this.f37774n.RQ(iS);
        while (i3 < intArrayList.size()) {
            this.f37774n.n1(intArrayList.getInt(i3));
            i3++;
        }
    }

    private void r(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeEnum(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iZ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iZ += CodedOutputStream.Z(((Integer) list.get(i5)).intValue());
        }
        this.f37774n.RQ(iZ);
        while (i3 < list.size()) {
            this.f37774n.ul(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    private void rV9(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < longArrayList.size()) {
                this.f37774n.writeUInt64(i2, longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iY = 0;
        for (int i5 = 0; i5 < longArrayList.size(); i5++) {
            iY += CodedOutputStream.Y(longArrayList.getLong(i5));
        }
        this.f37774n.RQ(iY);
        while (i3 < longArrayList.size()) {
            this.f37774n.a63(longArrayList.getLong(i3));
            i3++;
        }
    }

    private void s7N(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeSInt64(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iB = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iB += CodedOutputStream.B(((Long) list.get(i5)).longValue());
        }
        this.f37774n.RQ(iB);
        while (i3 < list.size()) {
            this.f37774n.lLA(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    private void te(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeInt64(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iX = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iX += CodedOutputStream.X(((Long) list.get(i5)).longValue());
        }
        this.f37774n.RQ(iX);
        while (i3 < list.size()) {
            this.f37774n.Po6(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    private void wTp(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < intArrayList.size()) {
                this.f37774n.writeUInt32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iGR = 0;
        for (int i5 = 0; i5 < intArrayList.size(); i5++) {
            iGR += CodedOutputStream.GR(intArrayList.getInt(i5));
        }
        this.f37774n.RQ(iGR);
        while (i3 < intArrayList.size()) {
            this.f37774n.RQ(intArrayList.getInt(i3));
            i3++;
        }
    }

    private void xMQ(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeBool(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iAz = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iAz += CodedOutputStream.az(((Boolean) list.get(i5)).booleanValue());
        }
        this.f37774n.RQ(iAz);
        while (i3 < list.size()) {
            this.f37774n.C(((Boolean) list.get(i3)).booleanValue());
            i3++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void J2(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            t(i2, list.get(i3), schema);
        }
    }

    public void N(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeSInt32(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iM = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iM += CodedOutputStream.M(((Integer) list.get(i5)).intValue());
        }
        this.f37774n.RQ(iM);
        while (i3 < list.size()) {
            this.f37774n.ER(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void n(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            O(i2, list.get(i3), schema);
        }
    }

    public void v(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f37774n.writeUInt32(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f37774n.W(i2, 2);
        int iGR = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iGR += CodedOutputStream.GR(((Integer) list.get(i5)).intValue());
        }
        this.f37774n.RQ(iGR);
        while (i3 < list.size()) {
            this.f37774n.RQ(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeBytesList(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f37774n.rl(i2, (ByteString) list.get(i3));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37775n;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f37775n = iArr;
            try {
                iArr[WireFormat.FieldType.E2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37775n[WireFormat.FieldType.f38217g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37775n[WireFormat.FieldType.f38215Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37775n[WireFormat.FieldType.jB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37775n[WireFormat.FieldType.P5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37775n[WireFormat.FieldType.f38220v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37775n[WireFormat.FieldType.f38211S.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37775n[WireFormat.FieldType.f38219r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37775n[WireFormat.FieldType.f38213U.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37775n[WireFormat.FieldType.M7.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37775n[WireFormat.FieldType.f38218o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37775n[WireFormat.FieldType.f38216e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static CodedOutputStreamWriter Uo(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f37769n;
        return codedOutputStreamWriter != null ? codedOutputStreamWriter : new CodedOutputStreamWriter(codedOutputStream);
    }

    private void az(int i2, MapEntryLite.Metadata metadata, Map map) {
        switch (AnonymousClass1.f37775n[metadata.f38084n.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    mUb(i2, false, obj, metadata);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    mUb(i2, true, obj2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                gh(i2, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                qie(i2, metadata, map);
                return;
            case 12:
                ty(i2, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.f38084n);
        }
    }

    private void iF(int i2, Object obj) {
        if (obj instanceof String) {
            this.f37774n.writeString(i2, (String) obj);
        } else {
            this.f37774n.rl(i2, (ByteString) obj);
        }
    }

    private void mUb(int i2, boolean z2, Object obj, MapEntryLite.Metadata metadata) {
        this.f37774n.W(i2, 2);
        this.f37774n.RQ(MapEntryLite.rl(metadata, Boolean.valueOf(z2), obj));
        MapEntryLite.O(this.f37774n, metadata, Boolean.valueOf(z2), obj);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void O(int i2, Object obj, Schema schema) {
        this.f37774n.mYa(i2, (MessageLite) obj, schema);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void nr(int i2, MapEntryLite.Metadata metadata, Map map) {
        if (this.f37774n.ijL()) {
            az(i2, metadata, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f37774n.W(i2, 2);
            this.f37774n.RQ(MapEntryLite.rl(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.O(this.f37774n, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void rl(int i2, ByteString byteString) {
        this.f37774n.rl(i2, byteString);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void t(int i2, Object obj, Schema schema) {
        this.f37774n.hRu(i2, (MessageLite) obj, schema);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeBool(int i2, boolean z2) {
        this.f37774n.writeBool(i2, z2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeBoolList(int i2, List list, boolean z2) {
        if (list instanceof BooleanArrayList) {
            KN(i2, (BooleanArrayList) list, z2);
        } else {
            xMQ(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeDouble(int i2, double d2) {
        this.f37774n.writeDouble(i2, d2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeDoubleList(int i2, List list, boolean z2) {
        if (list instanceof DoubleArrayList) {
            HI(i2, (DoubleArrayList) list, z2);
        } else {
            ck(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeEndGroup(int i2) {
        this.f37774n.W(i2, 4);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeEnum(int i2, int i3) {
        this.f37774n.writeEnum(i2, i3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeEnumList(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            Ik(i2, (IntArrayList) list, z2);
        } else {
            r(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeFixed32(int i2, int i3) {
        this.f37774n.writeFixed32(i2, i3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeFixed32List(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            o(i2, (IntArrayList) list, z2);
        } else {
            Z(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeFixed64(int i2, long j2) {
        this.f37774n.writeFixed64(i2, j2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeFixed64List(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            XQ(i2, (LongArrayList) list, z2);
        } else {
            S(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeFloat(int i2, float f3) {
        this.f37774n.writeFloat(i2, f3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeFloatList(int i2, List list, boolean z2) {
        if (list instanceof FloatArrayList) {
            WPU(i2, (FloatArrayList) list, z2);
        } else {
            aYN(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeInt32(int i2, int i3) {
        this.f37774n.writeInt32(i2, i3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeInt32List(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            ViF(i2, (IntArrayList) list, z2);
        } else {
            nY(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeInt64(int i2, long j2) {
        this.f37774n.writeInt64(i2, j2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeInt64List(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            g(i2, (LongArrayList) list, z2);
        } else {
            te(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeMessage(int i2, Object obj) {
        this.f37774n.EWS(i2, (MessageLite) obj);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i2, Object obj) {
        if (obj instanceof ByteString) {
            this.f37774n.K(i2, (ByteString) obj);
        } else {
            this.f37774n.i(i2, (MessageLite) obj);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeSFixed32(int i2, int i3) {
        this.f37774n.writeSFixed32(i2, i3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeSFixed32List(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            fD(i2, (IntArrayList) list, z2);
        } else {
            E2(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeSFixed64(int i2, long j2) {
        this.f37774n.writeSFixed64(i2, j2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeSFixed64List(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            e(i2, (LongArrayList) list, z2);
        } else {
            X(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeSInt32(int i2, int i3) {
        this.f37774n.writeSInt32(i2, i3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeSInt32List(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            T(i2, (IntArrayList) list, z2);
        } else {
            N(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeSInt64(int i2, long j2) {
        this.f37774n.writeSInt64(i2, j2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeSInt64List(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            nHg(i2, (LongArrayList) list, z2);
        } else {
            s7N(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeStartGroup(int i2) {
        this.f37774n.W(i2, 3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeString(int i2, String str) {
        this.f37774n.writeString(i2, str);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeStringList(int i2, List list) {
        int i3 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i3 < list.size()) {
                this.f37774n.writeString(i2, (String) list.get(i3));
                i3++;
            }
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i3 < list.size()) {
                iF(i2, lazyStringList.getRaw(i3));
                i3++;
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeUInt32(int i2, int i3) {
        this.f37774n.writeUInt32(i2, i3);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeUInt32List(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            wTp(i2, (IntArrayList) list, z2);
        } else {
            v(i2, list, z2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeUInt64(int i2, long j2) {
        this.f37774n.writeUInt64(i2, j2);
    }

    @Override // androidx.content.preferences.protobuf.Writer
    public void writeUInt64List(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            rV9(i2, (LongArrayList) list, z2);
        } else {
            bzg(i2, list, z2);
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.rl(codedOutputStream, "output");
        this.f37774n = codedOutputStream2;
        codedOutputStream2.f37769n = this;
    }

    private void gh(int i2, MapEntryLite.Metadata metadata, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((Integer) it.next()).intValue();
            i3++;
        }
        Arrays.sort(iArr);
        for (int i5 = 0; i5 < size; i5++) {
            int i7 = iArr[i5];
            Object obj = map.get(Integer.valueOf(i7));
            this.f37774n.W(i2, 2);
            this.f37774n.RQ(MapEntryLite.rl(metadata, Integer.valueOf(i7), obj));
            MapEntryLite.O(this.f37774n, metadata, Integer.valueOf(i7), obj);
        }
    }

    private void qie(int i2, MapEntryLite.Metadata metadata, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        Arrays.sort(jArr);
        for (int i5 = 0; i5 < size; i5++) {
            long j2 = jArr[i5];
            Object obj = map.get(Long.valueOf(j2));
            this.f37774n.W(i2, 2);
            this.f37774n.RQ(MapEntryLite.rl(metadata, Long.valueOf(j2), obj));
            MapEntryLite.O(this.f37774n, metadata, Long.valueOf(j2), obj);
        }
    }

    private void ty(int i2, MapEntryLite.Metadata metadata, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            strArr[i3] = (String) it.next();
            i3++;
        }
        Arrays.sort(strArr);
        for (int i5 = 0; i5 < size; i5++) {
            String str = strArr[i5];
            Object obj = map.get(str);
            this.f37774n.W(i2, 2);
            this.f37774n.RQ(MapEntryLite.rl(metadata, str, obj));
            MapEntryLite.O(this.f37774n, metadata, str, obj);
        }
    }
}
