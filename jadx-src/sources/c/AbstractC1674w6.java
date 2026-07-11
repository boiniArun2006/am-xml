package c;

import Rc.w6;
import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: renamed from: c.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1674w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43445n = w6.j.n(CmcdData.OBJECT_TYPE_AUDIO_ONLY, TtmlNode.TAG_P, CmcdData.STREAMING_FORMAT_SS, "rz", "r", "o", "so", "eo", "sk", "sa");
    private static final w6.j rl = w6.j.n("k");

    private static boolean J2(GO.n nVar) {
        if (nVar != null) {
            return nVar.isStatic() && ((Float) ((Ect.j) nVar.getKeyframes().get(0)).rl).floatValue() == 0.0f;
        }
        return true;
    }

    private static boolean O(GO.n nVar) {
        if (nVar != null) {
            return nVar.isStatic() && ((Float) ((Ect.j) nVar.getKeyframes().get(0)).rl).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static GO.Pl Uo(Rc.w6 w6Var, FQq.Dsr dsr) {
        GO.n nVarJ2;
        FQq.Dsr dsr2 = dsr;
        boolean z2 = w6Var.a() == w6.n.BEGIN_OBJECT;
        if (z2) {
            w6Var.Uo();
        }
        GO.n nVar = null;
        GO.I28 i28N = null;
        GO.Xo xoRl = null;
        GO.CN3 cn3MUb = null;
        GO.n nVarJ22 = null;
        GO.n nVarJ23 = null;
        GO.Ml mlKN = null;
        GO.n nVarJ24 = null;
        GO.n nVarJ25 = null;
        while (w6Var.jB()) {
            switch (w6Var.Mx(f43445n)) {
                case 0:
                    w6Var.Uo();
                    while (w6Var.jB()) {
                        if (w6Var.Mx(rl) != 0) {
                            w6Var.fcU();
                            w6Var.n1();
                        } else {
                            i28N = AbstractC1672j.n(w6Var, dsr);
                        }
                    }
                    w6Var.T();
                    dsr2 = dsr;
                    break;
                case 1:
                    xoRl = AbstractC1672j.rl(w6Var, dsr);
                    dsr2 = dsr;
                    break;
                case 2:
                    cn3MUb = AbstractC1669Ml.mUb(w6Var, dsr);
                    dsr2 = dsr;
                    break;
                case 3:
                    dsr2.n("Lottie doesn't support 3D layers.");
                    nVarJ2 = AbstractC1669Ml.J2(w6Var, dsr2, false);
                    if (!nVarJ2.getKeyframes().isEmpty()) {
                        nVarJ2.getKeyframes().add(new Ect.j(dsr2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(dsr2.J2())));
                    } else if (((Ect.j) nVarJ2.getKeyframes().get(0)).rl == null) {
                        nVarJ2.getKeyframes().set(0, new Ect.j(dsr, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(dsr.J2())));
                    }
                    dsr2 = dsr;
                    nVar = nVarJ2;
                    break;
                case 4:
                    nVarJ2 = AbstractC1669Ml.J2(w6Var, dsr2, false);
                    if (!nVarJ2.getKeyframes().isEmpty()) {
                    }
                    dsr2 = dsr;
                    nVar = nVarJ2;
                    break;
                case 5:
                    mlKN = AbstractC1669Ml.KN(w6Var, dsr);
                    break;
                case 6:
                    nVarJ24 = AbstractC1669Ml.J2(w6Var, dsr2, false);
                    break;
                case 7:
                    nVarJ25 = AbstractC1669Ml.J2(w6Var, dsr2, false);
                    break;
                case 8:
                    nVarJ22 = AbstractC1669Ml.J2(w6Var, dsr2, false);
                    break;
                case 9:
                    nVarJ23 = AbstractC1669Ml.J2(w6Var, dsr2, false);
                    break;
                default:
                    w6Var.fcU();
                    w6Var.n1();
                    break;
            }
        }
        if (z2) {
            w6Var.T();
        }
        GO.I28 i28 = n(i28N) ? null : i28N;
        if (rl(xoRl)) {
            xoRl = null;
        }
        return new GO.Pl(i28, xoRl, nr(cn3MUb) ? null : cn3MUb, t(nVar) ? null : nVar, mlKN, nVarJ24, nVarJ25, J2(nVarJ22) ? null : nVarJ22, O(nVarJ23) ? null : nVarJ23);
    }

    private static boolean n(GO.I28 i28) {
        if (i28 != null) {
            return i28.isStatic() && ((PointF) ((Ect.j) i28.getKeyframes().get(0)).rl).equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean nr(GO.CN3 cn3) {
        if (cn3 != null) {
            return cn3.isStatic() && ((Ect.Ml) ((Ect.j) cn3.getKeyframes().get(0)).rl).n(1.0f, 1.0f);
        }
        return true;
    }

    private static boolean rl(GO.Xo xo) {
        if (xo != null) {
            return !(xo instanceof GO.Dsr) && xo.isStatic() && ((PointF) ((Ect.j) xo.getKeyframes().get(0)).rl).equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean t(GO.n nVar) {
        if (nVar != null) {
            return nVar.isStatic() && ((Float) ((Ect.j) nVar.getKeyframes().get(0)).rl).floatValue() == 0.0f;
        }
        return true;
    }
}
