package Mms;

import EJn.Pl;
import EJn.Xo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class LEl {
    public static final EJn.Wre n(EJn.Wre wre, DGv.Ml module) {
        EJn.Wre wreN;
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(wre.getKind(), Pl.j.f2280n)) {
            return wre.isInline() ? n(wre.Uo(0), module) : wre;
        }
        EJn.Wre wreRl = EJn.n.rl(module, wre);
        return (wreRl == null || (wreN = n(wreRl, module)) == null) ? wre : wreN;
    }

    public static final O rl(kotlinx.serialization.json.n nVar, EJn.Wre desc) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        EJn.Pl kind = desc.getKind();
        if (kind instanceof EJn.Ml) {
            return O.f6706o;
        }
        if (Intrinsics.areEqual(kind, Xo.n.f2284n)) {
            return O.J2;
        }
        if (!Intrinsics.areEqual(kind, Xo.w6.f2285n)) {
            return O.f6703O;
        }
        EJn.Wre wreN = n(desc.Uo(0), nVar.n());
        EJn.Pl kind2 = wreN.getKind();
        if ((kind2 instanceof EJn.I28) || Intrinsics.areEqual(kind2, Pl.n.f2281n)) {
            return O.f6707r;
        }
        if (nVar.O().t()) {
            return O.J2;
        }
        throw Ew.nr(wreN);
    }
}
