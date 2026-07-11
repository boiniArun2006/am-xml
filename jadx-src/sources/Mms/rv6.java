package Mms;

import EJn.Pl;
import WJ.phkN.HFAkacKHsU;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class rv6 extends w6 {
    private final kotlinx.serialization.json.nKK KN;
    private boolean gh;
    private int mUb;
    private final EJn.Wre xMQ;

    public /* synthetic */ rv6(kotlinx.serialization.json.n nVar, kotlinx.serialization.json.nKK nkk, String str, EJn.Wre wre, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, nkk, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : wre);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv6(kotlinx.serialization.json.n json, kotlinx.serialization.json.nKK value, String str, EJn.Wre wre) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.KN = value;
        this.xMQ = wre;
    }

    @Override // Mms.w6, gi.I28
    public boolean E2() {
        return !this.gh && super.E2();
    }

    @Override // Mms.w6
    /* JADX INFO: renamed from: Po6 */
    public kotlinx.serialization.json.nKK qm() {
        return this.KN;
    }

    @Override // Du.QaP
    protected String Y(EJn.Wre descriptor, int i2) {
        Object next;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        DAz.ty(descriptor, nr());
        String strO = descriptor.O(i2);
        if (!this.Uo.HI() || qm().keySet().contains(strO)) {
            return strO;
        }
        Map mapO = DAz.O(nr(), descriptor);
        Iterator<T> it = qm().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapO.get((String) next);
            if (num != null && num.intValue() == i2) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strO;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mms.w6
    public kotlinx.serialization.json.Dsr m(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (kotlinx.serialization.json.Dsr) MapsKt.getValue(qm(), tag);
    }

    public int nY(EJn.Wre wre) {
        Intrinsics.checkNotNullParameter(wre, HFAkacKHsU.nJlOaSGPeKOU);
        while (this.mUb < wre.nr()) {
            int i2 = this.mUb;
            this.mUb = i2 + 1;
            String strJ = J(wre, i2);
            int i3 = this.mUb - 1;
            this.gh = false;
            if (qm().containsKey(strJ) || HV(wre, i3)) {
                if (!this.Uo.Uo() || !GD(wre, i3, strJ)) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // Mms.w6, gi.I28
    public gi.w6 rl(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor != this.xMQ) {
            return super.rl(descriptor);
        }
        kotlinx.serialization.json.n nVarNr = nr();
        kotlinx.serialization.json.Dsr dsrETf = eTf();
        String strKN = this.xMQ.KN();
        if (dsrETf instanceof kotlinx.serialization.json.nKK) {
            return new rv6(nVarNr, (kotlinx.serialization.json.nKK) dsrETf, Rl(), this.xMQ);
        }
        throw Ew.J2(-1, "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.nKK.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(dsrETf.getClass()).getSimpleName() + " as the serialized body of " + strKN + " at element: " + z(), dsrETf.toString());
    }

    @Override // Mms.w6, gi.w6
    public void t(EJn.Wre descriptor) {
        Set setPlus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (DAz.az(descriptor, nr()) || (descriptor.getKind() instanceof EJn.Ml)) {
            return;
        }
        DAz.ty(descriptor, nr());
        if (this.Uo.HI()) {
            Set setN = Du.yg.n(descriptor);
            Map map = (Map) kotlinx.serialization.json.lej.n(nr()).n(descriptor, DAz.Uo());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = SetsKt.emptySet();
            }
            setPlus = SetsKt.plus(setN, (Iterable) setKeySet);
        } else {
            setPlus = Du.yg.n(descriptor);
        }
        for (String str : qm().keySet()) {
            if (!setPlus.contains(str) && !Intrinsics.areEqual(str, Rl())) {
                throw Ew.O(-1, "Encountered an unknown key '" + str + "' at element: " + z() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) Ew.mUb(qm().toString(), 0, 1, null)));
            }
        }
    }

    private final boolean GD(EJn.Wre wre, int i2, String str) {
        kotlinx.serialization.json.qf qfVar;
        boolean z2;
        kotlinx.serialization.json.n nVarNr = nr();
        boolean zXMQ = wre.xMQ(i2);
        EJn.Wre wreUo = wre.Uo(i2);
        if (zXMQ && !wreUo.rl() && (m(str) instanceof kotlinx.serialization.json.afx)) {
            return true;
        }
        if (!Intrinsics.areEqual(wreUo.getKind(), Pl.n.f2281n) || (wreUo.rl() && (m(str) instanceof kotlinx.serialization.json.afx))) {
            return false;
        }
        kotlinx.serialization.json.Dsr dsrM = m(str);
        String strJ2 = null;
        if (dsrM instanceof kotlinx.serialization.json.qf) {
            qfVar = (kotlinx.serialization.json.qf) dsrM;
        } else {
            qfVar = null;
        }
        if (qfVar != null) {
            strJ2 = kotlinx.serialization.json.C.J2(qfVar);
        }
        if (strJ2 == null) {
            return false;
        }
        int iXMQ = DAz.xMQ(wreUo, nVarNr, strJ2);
        if (!nVarNr.O().mUb() && wreUo.rl()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iXMQ == -3 && (zXMQ || z2)) {
            return true;
        }
        return false;
    }

    private final boolean HV(EJn.Wre wre, int i2) {
        boolean z2;
        if (!nr().O().mUb() && !wre.xMQ(i2) && wre.Uo(i2).rl()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.gh = z2;
        return z2;
    }
}
