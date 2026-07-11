package bAP;

import Hh.C;
import Hh.Pl;
import Hh.qz;
import android.graphics.ColorSpace;
import bA.C1653C;
import bA.InterfaceC1656I28;
import bA.InterfaceC1658Wre;
import bA.Xo;
import bA.eO;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class j implements n {
    private final n J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final qz f43210O;
    private final Map Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f43211n;
    private final dF.Ml nr;
    private final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f43212t;

    /* JADX INFO: renamed from: bAP.j$j, reason: collision with other inner class name */
    class C0570j implements n {
        C0570j() {
        }

        @Override // bAP.n
        public InterfaceC1656I28 n(C1653C c1653c, int i2, eO eOVar, dX.Ml ml) {
            ColorSpace colorSpaceU;
            com.facebook.imageformat.w6 w6VarP5 = c1653c.p5();
            if (((Boolean) j.this.f43210O.get()).booleanValue()) {
                colorSpaceU = ml.gh;
                if (colorSpaceU == null) {
                    colorSpaceU = c1653c.U();
                }
            } else {
                colorSpaceU = ml.gh;
            }
            ColorSpace colorSpace = colorSpaceU;
            if (w6VarP5 == com.facebook.imageformat.n.rl) {
                return j.this.J2(c1653c, i2, eOVar, ml, colorSpace);
            }
            if (w6VarP5 == com.facebook.imageformat.n.nr) {
                return j.this.O(c1653c, i2, eOVar, ml);
            }
            if (w6VarP5 == com.facebook.imageformat.n.gh) {
                return j.this.nr(c1653c, i2, eOVar, ml);
            }
            if (w6VarP5 == com.facebook.imageformat.n.ty) {
                return j.this.KN(c1653c, i2, eOVar, ml);
            }
            if (w6VarP5 != com.facebook.imageformat.w6.nr) {
                return j.this.Uo(c1653c, ml);
            }
            throw new DecodeException("unknown image format", c1653c);
        }
    }

    public j(n nVar, n nVar2, n nVar3, dF.Ml ml) {
        this(nVar, nVar2, nVar3, ml, null);
    }

    public j(n nVar, n nVar2, n nVar3, dF.Ml ml, Map map) {
        this(nVar, nVar2, nVar3, ml, map, Pl.rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1656I28 KN(C1653C c1653c, int i2, eO eOVar, dX.Ml ml) {
        n nVar = this.f43212t;
        if (nVar != null) {
            return nVar.n(c1653c, i2, eOVar, ml);
        }
        return null;
    }

    public InterfaceC1658Wre J2(C1653C c1653c, int i2, eO eOVar, dX.Ml ml, ColorSpace colorSpace) {
        Pj0.j jVarRl = this.nr.rl(c1653c, ml.KN, null, i2, colorSpace);
        try {
            NP.n.n(null, jVarRl);
            C.Uo(jVarRl);
            InterfaceC1658Wre interfaceC1658WreDR0 = InterfaceC1658Wre.dR0(jVarRl, eOVar, c1653c.m(), c1653c.Nxk());
            interfaceC1658WreDR0.jB("is_rounded", false);
            return interfaceC1658WreDR0;
        } finally {
            Pj0.j.M7(jVarRl);
        }
    }

    public InterfaceC1658Wre Uo(C1653C c1653c, dX.Ml ml) {
        Pj0.j jVarN = this.nr.n(c1653c, ml.KN, null, ml.gh);
        try {
            NP.n.n(null, jVarN);
            C.Uo(jVarN);
            InterfaceC1658Wre interfaceC1658WreDR0 = InterfaceC1658Wre.dR0(jVarN, Xo.nr, c1653c.m(), c1653c.Nxk());
            interfaceC1658WreDR0.jB("is_rounded", false);
            return interfaceC1658WreDR0;
        } finally {
            Pj0.j.M7(jVarN);
        }
    }

    @Override // bAP.n
    public InterfaceC1656I28 n(C1653C c1653c, int i2, eO eOVar, dX.Ml ml) {
        InputStream inputStreamEF;
        n nVar;
        n nVar2 = ml.mUb;
        if (nVar2 != null) {
            return nVar2.n(c1653c, i2, eOVar, ml);
        }
        com.facebook.imageformat.w6 w6VarP5 = c1653c.p5();
        if ((w6VarP5 == null || w6VarP5 == com.facebook.imageformat.w6.nr) && (inputStreamEF = c1653c.eF()) != null) {
            w6VarP5 = com.facebook.imageformat.I28.nr(inputStreamEF);
            c1653c.Uf(w6VarP5);
        }
        Map map = this.Uo;
        return (map == null || (nVar = (n) map.get(w6VarP5)) == null) ? this.J2.n(c1653c, i2, eOVar, ml) : nVar.n(c1653c, i2, eOVar, ml);
    }

    public InterfaceC1656I28 nr(C1653C c1653c, int i2, eO eOVar, dX.Ml ml) {
        n nVar;
        return (ml.Uo || (nVar = this.rl) == null) ? Uo(c1653c, ml) : nVar.n(c1653c, i2, eOVar, ml);
    }

    public j(n nVar, n nVar2, n nVar3, dF.Ml ml, Map map, qz qzVar) {
        this.J2 = new C0570j();
        this.f43211n = nVar;
        this.rl = nVar2;
        this.f43212t = nVar3;
        this.nr = ml;
        this.Uo = map;
        this.f43210O = qzVar;
    }

    public InterfaceC1656I28 O(C1653C c1653c, int i2, eO eOVar, dX.Ml ml) {
        n nVar;
        if (c1653c.getWidth() != -1 && c1653c.getHeight() != -1) {
            if (!ml.Uo && (nVar = this.f43211n) != null) {
                return nVar.n(c1653c, i2, eOVar, ml);
            }
            return Uo(c1653c, ml);
        }
        throw new DecodeException("image width or height is incorrect", c1653c);
    }
}
