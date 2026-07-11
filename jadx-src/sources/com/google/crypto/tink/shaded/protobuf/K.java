package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.I28;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class K implements mz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rv6 f59880n;
    private final eO nr;
    private final gnv rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f59881t;

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public void n(Object obj, byte[] bArr, int i2, int i3, I28.j jVar) {
        Q q2 = (Q) obj;
        if (q2.unknownFields == fg.t()) {
            q2.unknownFields = fg.gh();
        }
        android.support.v4.media.j.n(obj);
        throw null;
    }

    static K J2(gnv gnvVar, eO eOVar, rv6 rv6Var) {
        return new K(gnvVar, eOVar, rv6Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public boolean equals(Object obj, Object obj2) {
        if (!this.rl.Uo(obj).equals(this.rl.Uo(obj2))) {
            return false;
        }
        if (this.f59881t) {
            return this.nr.t(obj).equals(this.nr.t(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public int getSerializedSize(Object obj) {
        int iNr = nr(this.rl, obj);
        return this.f59881t ? iNr + this.nr.t(obj).rl() : iNr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public int hashCode(Object obj) {
        int iHashCode = this.rl.Uo(obj).hashCode();
        return this.f59881t ? (iHashCode * 53) + this.nr.t(obj).hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public final boolean isInitialized(Object obj) {
        return this.nr.t(obj).O();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public void makeImmutable(Object obj) {
        this.rl.mUb(obj);
        this.nr.J2(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public void mergeFrom(Object obj, Object obj2) {
        AbstractC1905p.e(this.rl, obj, obj2);
        if (this.f59881t) {
            AbstractC1905p.fD(this.nr, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public Object newInstance() {
        rv6 rv6Var = this.f59880n;
        return rv6Var instanceof Q ? ((Q) rv6Var).fD() : rv6Var.newBuilderForType().buildPartial();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public void rl(Object obj, l4Z l4z, Xo xo) throws Throwable {
        O(this.rl, this.nr, obj, l4z, xo);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.mz
    public void t(Object obj, YzO yzO) {
        Iterator itJ2 = this.nr.t(obj).J2();
        if (itJ2.hasNext()) {
            android.support.v4.media.j.n(((Map.Entry) itJ2.next()).getKey());
            throw null;
        }
        KN(this.rl, obj, yzO);
    }

    private K(gnv gnvVar, eO eOVar, rv6 rv6Var) {
        this.rl = gnvVar;
        this.f59881t = eOVar.O(rv6Var);
        this.nr = eOVar;
        this.f59880n = rv6Var;
    }

    private void KN(gnv gnvVar, Object obj, YzO yzO) {
        gnvVar.o(gnvVar.Uo(obj), yzO);
    }

    private void O(gnv gnvVar, eO eOVar, Object obj, l4Z l4z, Xo xo) throws Throwable {
        gnv gnvVar2;
        Object objJ2 = gnvVar.J2(obj);
        l3D l3dNr = eOVar.nr(obj);
        while (l4z.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                gnvVar2 = gnvVar;
                eO eOVar2 = eOVar;
                l4Z l4z2 = l4z;
                Xo xo2 = xo;
                try {
                    if (Uo(l4z2, xo2, eOVar2, l3dNr, gnvVar2, objJ2)) {
                        l4z = l4z2;
                        xo = xo2;
                        eOVar = eOVar2;
                        gnvVar = gnvVar2;
                    } else {
                        gnvVar2.HI(obj, objJ2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    gnvVar2.HI(obj, objJ2);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gnvVar2 = gnvVar;
            }
        }
        gnvVar.HI(obj, objJ2);
    }

    private boolean Uo(l4Z l4z, Xo xo, eO eOVar, l3D l3d, gnv gnvVar, Object obj) throws InvalidProtocolBufferException {
        int tag = l4z.getTag();
        if (tag != M5.f59884n) {
            if (M5.rl(tag) == 2) {
                Object objRl = eOVar.rl(xo, this.f59880n, M5.n(tag));
                if (objRl != null) {
                    eOVar.KN(l4z, objRl, xo, l3d);
                    return true;
                }
                return gnvVar.az(obj, l4z);
            }
            return l4z.skipField();
        }
        Object objRl2 = null;
        int uInt32 = 0;
        fuX bytes = null;
        while (l4z.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = l4z.getTag();
            if (tag2 == M5.f59885t) {
                uInt32 = l4z.readUInt32();
                objRl2 = eOVar.rl(xo, this.f59880n, uInt32);
            } else if (tag2 == M5.nr) {
                if (objRl2 != null) {
                    eOVar.KN(l4z, objRl2, xo, l3d);
                } else {
                    bytes = l4z.readBytes();
                }
            } else if (!l4z.skipField()) {
                break;
            }
        }
        if (l4z.getTag() == M5.rl) {
            if (bytes != null) {
                if (objRl2 != null) {
                    eOVar.xMQ(bytes, objRl2, xo, l3d);
                } else {
                    gnvVar.nr(obj, uInt32, bytes);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.rl();
    }

    private int nr(gnv gnvVar, Object obj) {
        return gnvVar.xMQ(gnvVar.Uo(obj));
    }
}
