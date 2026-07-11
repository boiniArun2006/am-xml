package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.DAz;
import com.google.crypto.tink.shaded.protobuf.M5;
import com.google.crypto.tink.shaded.protobuf.YzO;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class C implements YzO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CodedOutputStream f59868n;

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void J2(int i2, List list, mz mzVar) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            rl(i2, list.get(i3), mzVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void t(int i2, List list, mz mzVar) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            O(i2, list.get(i3), mzVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeBoolList(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.FX(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iO = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iO += CodedOutputStream.O(((Boolean) list.get(i5)).booleanValue());
        }
        this.f59868n.Po6(iO);
        while (i3 < list.size()) {
            this.f59868n.B(((Boolean) list.get(i3)).booleanValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeBytesList(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f59868n.J(i2, (fuX) list.get(i3));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeDoubleList(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.D(i2, ((Double) list.get(i3)).doubleValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iXMQ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iXMQ += CodedOutputStream.xMQ(((Double) list.get(i5)).doubleValue());
        }
        this.f59868n.Po6(iXMQ);
        while (i3 < list.size()) {
            this.f59868n.a(((Double) list.get(i3)).doubleValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeEnumList(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.I(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iGh = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iGh += CodedOutputStream.gh(((Integer) list.get(i5)).intValue());
        }
        this.f59868n.Po6(iGh);
        while (i3 < list.size()) {
            this.f59868n.GR(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeFixed32List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.Nxk(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iAz = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iAz += CodedOutputStream.az(((Integer) list.get(i5)).intValue());
        }
        this.f59868n.Po6(iAz);
        while (i3 < list.size()) {
            this.f59868n.Y(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeFixed64List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.k(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iHI = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iHI += CodedOutputStream.HI(((Long) list.get(i5)).longValue());
        }
        this.f59868n.Po6(iHI);
        while (i3 < list.size()) {
            this.f59868n.dR0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeFloatList(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.z(i2, ((Float) list.get(i3)).floatValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iIk = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iIk += CodedOutputStream.Ik(((Float) list.get(i5)).floatValue());
        }
        this.f59868n.Po6(iIk);
        while (i3 < list.size()) {
            this.f59868n.piY(((Float) list.get(i3)).floatValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeInt32List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.eTf(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iXQ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iXQ += CodedOutputStream.XQ(((Integer) list.get(i5)).intValue());
        }
        this.f59868n.Po6(iXQ);
        while (i3 < list.size()) {
            this.f59868n.xg(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeInt64List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.pJg(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iWPU = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iWPU += CodedOutputStream.WPU(((Long) list.get(i5)).longValue());
        }
        this.f59868n.Po6(iWPU);
        while (i3 < list.size()) {
            this.f59868n.ofS(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeSFixed32List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.fcU(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iIF = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iIF += CodedOutputStream.iF(((Integer) list.get(i5)).intValue());
        }
        this.f59868n.Po6(iIF);
        while (i3 < list.size()) {
            this.f59868n.eWT(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeSFixed64List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.ul(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iE2 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iE2 += CodedOutputStream.E2(((Long) list.get(i5)).longValue());
        }
        this.f59868n.Po6(iE2);
        while (i3 < list.size()) {
            this.f59868n.n1(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeSInt32List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.Jk(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iX = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iX += CodedOutputStream.X(((Integer) list.get(i5)).intValue());
        }
        this.f59868n.Po6(iX);
        while (i3 < list.size()) {
            this.f59868n.Rl(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeSInt64List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.qm(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iN = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iN += CodedOutputStream.N(((Long) list.get(i5)).longValue());
        }
        this.f59868n.Po6(iN);
        while (i3 < list.size()) {
            this.f59868n.mYa(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeUInt32List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.GD(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iRV9 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iRV9 += CodedOutputStream.rV9(((Integer) list.get(i5)).intValue());
        }
        this.f59868n.Po6(iRV9);
        while (i3 < list.size()) {
            this.f59868n.Po6(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeUInt64List(int i2, List list, boolean z2) {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.f59868n.EWS(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.f59868n.HV(i2, 2);
        int iXw = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iXw += CodedOutputStream.Xw(((Long) list.get(i5)).longValue());
        }
        this.f59868n.Po6(iXw);
        while (i3 < list.size()) {
            this.f59868n.hRu(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f59869n;

        static {
            int[] iArr = new int[M5.n.values().length];
            f59869n = iArr;
            try {
                iArr[M5.n.E2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59869n[M5.n.f59894g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59869n[M5.n.f59892Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59869n[M5.n.jB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59869n[M5.n.P5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59869n[M5.n.f59897v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59869n[M5.n.f59888S.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f59869n[M5.n.f59896r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f59869n[M5.n.f59890U.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f59869n[M5.n.M7.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f59869n[M5.n.f59895o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f59869n[M5.n.f59893e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private void KN(int i2, DAz.j jVar, Map map) {
        int[] iArr = j.f59869n;
        throw null;
    }

    public static C Uo(CodedOutputStream codedOutputStream) {
        C c2 = codedOutputStream.f59871n;
        return c2 != null ? c2 : new C(codedOutputStream);
    }

    private void xMQ(int i2, Object obj) {
        if (obj instanceof String) {
            this.f59868n.Org(i2, (String) obj);
        } else {
            this.f59868n.J(i2, (fuX) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void O(int i2, Object obj, mz mzVar) {
        this.f59868n.C(i2, (rv6) obj, mzVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public YzO.j fieldOrder() {
        return YzO.j.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void n(int i2, DAz.j jVar, Map map) {
        if (this.f59868n.M7()) {
            KN(i2, jVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f59868n.HV(i2, 2);
            this.f59868n.Po6(DAz.n(jVar, entry.getKey(), entry.getValue()));
            DAz.rl(this.f59868n, jVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void nr(int i2, fuX fux) {
        this.f59868n.J(i2, fux);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void rl(int i2, Object obj, mz mzVar) {
        this.f59868n.ijL(i2, (rv6) obj, mzVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeBool(int i2, boolean z2) {
        this.f59868n.FX(i2, z2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeDouble(int i2, double d2) {
        this.f59868n.D(i2, d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeEndGroup(int i2) {
        this.f59868n.HV(i2, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeEnum(int i2, int i3) {
        this.f59868n.I(i2, i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeFixed32(int i2, int i3) {
        this.f59868n.Nxk(i2, i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeFixed64(int i2, long j2) {
        this.f59868n.k(i2, j2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeFloat(int i2, float f3) {
        this.f59868n.z(i2, f3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeInt32(int i2, int i3) {
        this.f59868n.eTf(i2, i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeInt64(int i2, long j2) {
        this.f59868n.pJg(i2, j2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public final void writeMessageSetItem(int i2, Object obj) {
        if (obj instanceof fuX) {
            this.f59868n.G7(i2, (fuX) obj);
        } else {
            this.f59868n.Mx(i2, (rv6) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeSFixed32(int i2, int i3) {
        this.f59868n.fcU(i2, i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeSFixed64(int i2, long j2) {
        this.f59868n.ul(i2, j2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeSInt32(int i2, int i3) {
        this.f59868n.Jk(i2, i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeSInt64(int i2, long j2) {
        this.f59868n.qm(i2, j2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeStartGroup(int i2) {
        this.f59868n.HV(i2, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeString(int i2, String str) {
        this.f59868n.Org(i2, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeStringList(int i2, List list) {
        int i3 = 0;
        if (!(list instanceof afx)) {
            while (i3 < list.size()) {
                this.f59868n.Org(i2, (String) list.get(i3));
                i3++;
            }
        } else {
            afx afxVar = (afx) list;
            while (i3 < list.size()) {
                xMQ(i2, afxVar.getRaw(i3));
                i3++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeUInt32(int i2, int i3) {
        this.f59868n.GD(i2, i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.YzO
    public void writeUInt64(int i2, long j2) {
        this.f59868n.EWS(i2, j2);
    }

    private C(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) SPz.rl(codedOutputStream, "output");
        this.f59868n = codedOutputStream2;
        codedOutputStream2.f59871n = this;
    }
}
