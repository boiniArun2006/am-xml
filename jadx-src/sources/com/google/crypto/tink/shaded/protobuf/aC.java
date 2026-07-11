package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.DAz;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class aC implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr f59944n;
    private int nr = 0;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f59945t;

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void n(Object obj, mz mzVar, Xo xo) throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(3);
        Uo(obj, mzVar, xo);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(0);
        return this.f59944n.az();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public fuX readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(2);
        return this.f59944n.ty();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(1);
        return this.f59944n.HI();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(0);
        return this.f59944n.ck();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(5);
        return this.f59944n.Ik();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(1);
        return this.f59944n.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(5);
        return this.f59944n.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(0);
        return this.f59944n.Z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(0);
        return this.f59944n.XQ();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(5);
        return this.f59944n.S();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(1);
        return this.f59944n.WPU();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(0);
        return this.f59944n.aYN();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(0);
        return this.f59944n.ViF();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(2);
        return this.f59944n.nY();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        gh(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        gh(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(2);
        return this.f59944n.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(0);
        return this.f59944n.iF();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(0);
        return this.f59944n.fD();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void rl(Map map, DAz.j jVar, Xo xo) throws InvalidProtocolBufferException.InvalidWireTypeException {
        az(2);
        this.f59944n.qie(this.f59944n.iF());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void t(Object obj, mz mzVar, Xo xo) throws InvalidProtocolBufferException {
        az(2);
        KN(obj, mzVar, xo);
    }

    private void HI(int i2) throws InvalidProtocolBufferException {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.KN();
        }
    }

    public static aC J2(Dsr dsr) {
        aC aCVar = dsr.nr;
        return aCVar != null ? aCVar : new aC(dsr);
    }

    private void KN(Object obj, mz mzVar, Xo xo) throws InvalidProtocolBufferException {
        int iIF = this.f59944n.iF();
        Dsr dsr = this.f59944n;
        if (dsr.f59874n >= dsr.rl) {
            throw InvalidProtocolBufferException.xMQ();
        }
        int iQie = dsr.qie(iIF);
        this.f59944n.f59874n++;
        mzVar.rl(obj, this, xo);
        this.f59944n.n(0);
        r5.f59874n--;
        this.f59944n.gh(iQie);
    }

    private void Uo(Object obj, mz mzVar, Xo xo) {
        int i2 = this.f59945t;
        this.f59945t = M5.t(M5.n(this.rl), 4);
        try {
            mzVar.rl(obj, this, xo);
            if (this.rl == this.f59945t) {
            } else {
                throw InvalidProtocolBufferException.KN();
            }
        } finally {
            this.f59945t = i2;
        }
    }

    private void az(int i2) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (M5.rl(this.rl) != i2) {
            throw InvalidProtocolBufferException.O();
        }
    }

    private void qie(int i2) throws InvalidProtocolBufferException {
        if (this.f59944n.nr() != i2) {
            throw InvalidProtocolBufferException.az();
        }
    }

    private void ty(int i2) throws InvalidProtocolBufferException {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.KN();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void O(List list, mz mzVar, Xo xo) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iTe;
        if (M5.rl(this.rl) != 3) {
            throw InvalidProtocolBufferException.O();
        }
        int i2 = this.rl;
        do {
            list.add(xMQ(mzVar, xo));
            if (this.f59944n.O() || this.nr != 0) {
                return;
            } else {
                iTe = this.f59944n.te();
            }
        } while (iTe == i2);
        this.nr = iTe;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public int getFieldNumber() {
        int i2 = this.nr;
        if (i2 != 0) {
            this.rl = i2;
            this.nr = 0;
        } else {
            this.rl = this.f59944n.te();
        }
        int i3 = this.rl;
        if (i3 == 0 || i3 == this.f59945t) {
            return Integer.MAX_VALUE;
        }
        return M5.n(i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public int getTag() {
        return this.rl;
    }

    public void gh(List list, boolean z2) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iTe;
        int iTe2;
        if (M5.rl(this.rl) != 2) {
            throw InvalidProtocolBufferException.O();
        }
        if (!(list instanceof afx) || z2) {
            do {
                list.add(z2 ? readStringRequireUtf8() : readString());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe = this.f59944n.te();
                }
            } while (iTe == this.rl);
            this.nr = iTe;
            return;
        }
        afx afxVar = (afx) list;
        do {
            afxVar.K(readBytes());
            if (this.f59944n.O()) {
                return;
            } else {
                iTe2 = this.f59944n.te();
            }
        } while (iTe2 == this.rl);
        this.nr = iTe2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void nr(List list, mz mzVar, Xo xo) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iTe;
        if (M5.rl(this.rl) != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int i2 = this.rl;
        do {
            list.add(mUb(mzVar, xo));
            if (this.f59944n.O() || this.nr != 0) {
                return;
            } else {
                iTe = this.f59944n.te();
            }
        } while (iTe == i2);
        this.nr = iTe;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readBoolList(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof Wre)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Boolean.valueOf(this.f59944n.az()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iNr = this.f59944n.nr() + this.f59944n.iF();
            do {
                list.add(Boolean.valueOf(this.f59944n.az()));
            } while (this.f59944n.nr() < iNr);
            qie(iNr);
            return;
        }
        Wre wre = (Wre) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 0) {
            do {
                wre.addBoolean(this.f59944n.az());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iNr2 = this.f59944n.nr() + this.f59944n.iF();
        do {
            wre.addBoolean(this.f59944n.az());
        } while (this.f59944n.nr() < iNr2);
        qie(iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iTe;
        if (M5.rl(this.rl) != 2) {
            throw InvalidProtocolBufferException.O();
        }
        do {
            list.add(readBytes());
            if (this.f59944n.O()) {
                return;
            } else {
                iTe = this.f59944n.te();
            }
        } while (iTe == this.rl);
        this.nr = iTe;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readDoubleList(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof AbstractC1904o)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 1) {
                do {
                    list.add(Double.valueOf(this.f59944n.HI()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iIF = this.f59944n.iF();
            HI(iIF);
            int iNr = this.f59944n.nr() + iIF;
            do {
                list.add(Double.valueOf(this.f59944n.HI()));
            } while (this.f59944n.nr() < iNr);
            return;
        }
        AbstractC1904o abstractC1904o = (AbstractC1904o) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 1) {
            do {
                abstractC1904o.addDouble(this.f59944n.HI());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iIF2 = this.f59944n.iF();
        HI(iIF2);
        int iNr2 = this.f59944n.nr() + iIF2;
        do {
            abstractC1904o.addDouble(this.f59944n.HI());
        } while (this.f59944n.nr() < iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readEnumList(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof r)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Integer.valueOf(this.f59944n.ck()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iNr = this.f59944n.nr() + this.f59944n.iF();
            do {
                list.add(Integer.valueOf(this.f59944n.ck()));
            } while (this.f59944n.nr() < iNr);
            qie(iNr);
            return;
        }
        r rVar = (r) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 0) {
            do {
                rVar.addInt(this.f59944n.ck());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iNr2 = this.f59944n.nr() + this.f59944n.iF();
        do {
            rVar.addInt(this.f59944n.ck());
        } while (this.f59944n.nr() < iNr2);
        qie(iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readFixed32List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof r)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 2) {
                int iIF = this.f59944n.iF();
                ty(iIF);
                int iNr = this.f59944n.nr() + iIF;
                do {
                    list.add(Integer.valueOf(this.f59944n.Ik()));
                } while (this.f59944n.nr() < iNr);
                return;
            }
            if (iRl != 5) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                list.add(Integer.valueOf(this.f59944n.Ik()));
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe = this.f59944n.te();
                }
            } while (iTe == this.rl);
            this.nr = iTe;
            return;
        }
        r rVar = (r) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 2) {
            int iIF2 = this.f59944n.iF();
            ty(iIF2);
            int iNr2 = this.f59944n.nr() + iIF2;
            do {
                rVar.addInt(this.f59944n.Ik());
            } while (this.f59944n.nr() < iNr2);
            return;
        }
        if (iRl2 != 5) {
            throw InvalidProtocolBufferException.O();
        }
        do {
            rVar.addInt(this.f59944n.Ik());
            if (this.f59944n.O()) {
                return;
            } else {
                iTe2 = this.f59944n.te();
            }
        } while (iTe2 == this.rl);
        this.nr = iTe2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readFixed64List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof Ew)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 1) {
                do {
                    list.add(Long.valueOf(this.f59944n.r()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iIF = this.f59944n.iF();
            HI(iIF);
            int iNr = this.f59944n.nr() + iIF;
            do {
                list.add(Long.valueOf(this.f59944n.r()));
            } while (this.f59944n.nr() < iNr);
            return;
        }
        Ew ew = (Ew) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 1) {
            do {
                ew.addLong(this.f59944n.r());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iIF2 = this.f59944n.iF();
        HI(iIF2);
        int iNr2 = this.f59944n.nr() + iIF2;
        do {
            ew.addLong(this.f59944n.r());
        } while (this.f59944n.nr() < iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readFloatList(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof s4)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 2) {
                int iIF = this.f59944n.iF();
                ty(iIF);
                int iNr = this.f59944n.nr() + iIF;
                do {
                    list.add(Float.valueOf(this.f59944n.o()));
                } while (this.f59944n.nr() < iNr);
                return;
            }
            if (iRl != 5) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                list.add(Float.valueOf(this.f59944n.o()));
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe = this.f59944n.te();
                }
            } while (iTe == this.rl);
            this.nr = iTe;
            return;
        }
        s4 s4Var = (s4) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 2) {
            int iIF2 = this.f59944n.iF();
            ty(iIF2);
            int iNr2 = this.f59944n.nr() + iIF2;
            do {
                s4Var.addFloat(this.f59944n.o());
            } while (this.f59944n.nr() < iNr2);
            return;
        }
        if (iRl2 != 5) {
            throw InvalidProtocolBufferException.O();
        }
        do {
            s4Var.addFloat(this.f59944n.o());
            if (this.f59944n.O()) {
                return;
            } else {
                iTe2 = this.f59944n.te();
            }
        } while (iTe2 == this.rl);
        this.nr = iTe2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readInt32List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof r)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Integer.valueOf(this.f59944n.Z()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iNr = this.f59944n.nr() + this.f59944n.iF();
            do {
                list.add(Integer.valueOf(this.f59944n.Z()));
            } while (this.f59944n.nr() < iNr);
            qie(iNr);
            return;
        }
        r rVar = (r) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 0) {
            do {
                rVar.addInt(this.f59944n.Z());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iNr2 = this.f59944n.nr() + this.f59944n.iF();
        do {
            rVar.addInt(this.f59944n.Z());
        } while (this.f59944n.nr() < iNr2);
        qie(iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readInt64List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof Ew)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Long.valueOf(this.f59944n.XQ()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iNr = this.f59944n.nr() + this.f59944n.iF();
            do {
                list.add(Long.valueOf(this.f59944n.XQ()));
            } while (this.f59944n.nr() < iNr);
            qie(iNr);
            return;
        }
        Ew ew = (Ew) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 0) {
            do {
                ew.addLong(this.f59944n.XQ());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iNr2 = this.f59944n.nr() + this.f59944n.iF();
        do {
            ew.addLong(this.f59944n.XQ());
        } while (this.f59944n.nr() < iNr2);
        qie(iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readSFixed32List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof r)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 2) {
                int iIF = this.f59944n.iF();
                ty(iIF);
                int iNr = this.f59944n.nr() + iIF;
                do {
                    list.add(Integer.valueOf(this.f59944n.S()));
                } while (this.f59944n.nr() < iNr);
                return;
            }
            if (iRl != 5) {
                throw InvalidProtocolBufferException.O();
            }
            do {
                list.add(Integer.valueOf(this.f59944n.S()));
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe = this.f59944n.te();
                }
            } while (iTe == this.rl);
            this.nr = iTe;
            return;
        }
        r rVar = (r) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 2) {
            int iIF2 = this.f59944n.iF();
            ty(iIF2);
            int iNr2 = this.f59944n.nr() + iIF2;
            do {
                rVar.addInt(this.f59944n.S());
            } while (this.f59944n.nr() < iNr2);
            return;
        }
        if (iRl2 != 5) {
            throw InvalidProtocolBufferException.O();
        }
        do {
            rVar.addInt(this.f59944n.S());
            if (this.f59944n.O()) {
                return;
            } else {
                iTe2 = this.f59944n.te();
            }
        } while (iTe2 == this.rl);
        this.nr = iTe2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readSFixed64List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof Ew)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 1) {
                do {
                    list.add(Long.valueOf(this.f59944n.WPU()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iIF = this.f59944n.iF();
            HI(iIF);
            int iNr = this.f59944n.nr() + iIF;
            do {
                list.add(Long.valueOf(this.f59944n.WPU()));
            } while (this.f59944n.nr() < iNr);
            return;
        }
        Ew ew = (Ew) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 1) {
            do {
                ew.addLong(this.f59944n.WPU());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iIF2 = this.f59944n.iF();
        HI(iIF2);
        int iNr2 = this.f59944n.nr() + iIF2;
        do {
            ew.addLong(this.f59944n.WPU());
        } while (this.f59944n.nr() < iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readSInt32List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof r)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Integer.valueOf(this.f59944n.aYN()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iNr = this.f59944n.nr() + this.f59944n.iF();
            do {
                list.add(Integer.valueOf(this.f59944n.aYN()));
            } while (this.f59944n.nr() < iNr);
            qie(iNr);
            return;
        }
        r rVar = (r) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 0) {
            do {
                rVar.addInt(this.f59944n.aYN());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iNr2 = this.f59944n.nr() + this.f59944n.iF();
        do {
            rVar.addInt(this.f59944n.aYN());
        } while (this.f59944n.nr() < iNr2);
        qie(iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readSInt64List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof Ew)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Long.valueOf(this.f59944n.ViF()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iNr = this.f59944n.nr() + this.f59944n.iF();
            do {
                list.add(Long.valueOf(this.f59944n.ViF()));
            } while (this.f59944n.nr() < iNr);
            qie(iNr);
            return;
        }
        Ew ew = (Ew) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 0) {
            do {
                ew.addLong(this.f59944n.ViF());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iNr2 = this.f59944n.nr() + this.f59944n.iF();
        do {
            ew.addLong(this.f59944n.ViF());
        } while (this.f59944n.nr() < iNr2);
        qie(iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readUInt32List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof r)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Integer.valueOf(this.f59944n.iF()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iNr = this.f59944n.nr() + this.f59944n.iF();
            do {
                list.add(Integer.valueOf(this.f59944n.iF()));
            } while (this.f59944n.nr() < iNr);
            qie(iNr);
            return;
        }
        r rVar = (r) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 0) {
            do {
                rVar.addInt(this.f59944n.iF());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iNr2 = this.f59944n.nr() + this.f59944n.iF();
        do {
            rVar.addInt(this.f59944n.iF());
        } while (this.f59944n.nr() < iNr2);
        qie(iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public void readUInt64List(List list) throws InvalidProtocolBufferException {
        int iTe;
        int iTe2;
        if (!(list instanceof Ew)) {
            int iRl = M5.rl(this.rl);
            if (iRl == 0) {
                do {
                    list.add(Long.valueOf(this.f59944n.fD()));
                    if (this.f59944n.O()) {
                        return;
                    } else {
                        iTe = this.f59944n.te();
                    }
                } while (iTe == this.rl);
                this.nr = iTe;
                return;
            }
            if (iRl != 2) {
                throw InvalidProtocolBufferException.O();
            }
            int iNr = this.f59944n.nr() + this.f59944n.iF();
            do {
                list.add(Long.valueOf(this.f59944n.fD()));
            } while (this.f59944n.nr() < iNr);
            qie(iNr);
            return;
        }
        Ew ew = (Ew) list;
        int iRl2 = M5.rl(this.rl);
        if (iRl2 == 0) {
            do {
                ew.addLong(this.f59944n.fD());
                if (this.f59944n.O()) {
                    return;
                } else {
                    iTe2 = this.f59944n.te();
                }
            } while (iTe2 == this.rl);
            this.nr = iTe2;
            return;
        }
        if (iRl2 != 2) {
            throw InvalidProtocolBufferException.O();
        }
        int iNr2 = this.f59944n.nr() + this.f59944n.iF();
        do {
            ew.addLong(this.f59944n.fD());
        } while (this.f59944n.nr() < iNr2);
        qie(iNr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l4Z
    public boolean skipField() {
        int i2;
        if (this.f59944n.O() || (i2 = this.rl) == this.f59945t) {
            return false;
        }
        return this.f59944n.E2(i2);
    }

    private aC(Dsr dsr) {
        Dsr dsr2 = (Dsr) SPz.rl(dsr, "input");
        this.f59944n = dsr2;
        dsr2.nr = this;
    }

    private Object mUb(mz mzVar, Xo xo) throws InvalidProtocolBufferException {
        Object objNewInstance = mzVar.newInstance();
        KN(objNewInstance, mzVar, xo);
        mzVar.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    private Object xMQ(mz mzVar, Xo xo) {
        Object objNewInstance = mzVar.newInstance();
        Uo(objNewInstance, mzVar, xo);
        mzVar.makeImmutable(objNewInstance);
        return objNewInstance;
    }
}
