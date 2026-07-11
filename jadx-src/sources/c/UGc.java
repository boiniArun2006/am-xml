package c;

import Rc.w6;
import android.graphics.Color;
import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import gL.I28;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43416n = w6.j.n("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", "t", "ef", "sr", CmcdConfiguration.KEY_STREAM_TYPE, "w", CmcdData.STREAMING_FORMAT_HLS, "ip", "op", "tm", "cl", "hd", "ao", "bm");
    private static final w6.j rl = w6.j.n("d", CmcdData.OBJECT_TYPE_AUDIO_ONLY);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final w6.j f43417t = w6.j.n("ty", "nm");

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f43418n;

        static {
            int[] iArr = new int[I28.n.values().length];
            f43418n = iArr;
            try {
                iArr[I28.n.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43418n[I28.n.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static gL.I28 rl(Rc.w6 w6Var, FQq.Dsr dsr) {
        Float f3;
        ArrayList arrayList;
        boolean z2;
        float f4;
        ArrayList arrayList2;
        float f5;
        float f6;
        I28.n nVar = I28.n.NONE;
        QJ.fuX fux = QJ.fuX.NORMAL;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        w6Var.Uo();
        boolean z3 = false;
        float f7 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        float fM7 = 1.0f;
        Float fValueOf2 = Float.valueOf(1.0f);
        QJ.fuX fux2 = fux;
        GO.aC aCVarNr = null;
        GO.C cN = null;
        GO.n nVarJ2 = null;
        QJ.j jVarRl = null;
        aC aCVarRl = null;
        boolean z4 = false;
        int iP5 = 0;
        int iP52 = 0;
        int color = 0;
        boolean zU = false;
        long jP5 = 0;
        float fM72 = 0.0f;
        float fJ2 = 0.0f;
        float fM73 = 0.0f;
        float fM74 = 0.0f;
        I28.n nVar2 = nVar;
        long jP52 = -1;
        String strM = "UNSET";
        String strM2 = null;
        GO.Pl pl = null;
        I28.j jVar = null;
        String strM3 = null;
        float fM75 = 0.0f;
        while (w6Var.jB()) {
            switch (w6Var.Mx(f43416n)) {
                case 0:
                    strM = w6Var.M();
                    z3 = false;
                    break;
                case 1:
                    jP5 = w6Var.p5();
                    z3 = false;
                    break;
                case 2:
                    strM3 = w6Var.M();
                    z3 = false;
                    break;
                case 3:
                    f4 = f7;
                    int iP53 = w6Var.p5();
                    jVar = I28.j.UNKNOWN;
                    if (iP53 < jVar.ordinal()) {
                        jVar = I28.j.values()[iP53];
                    }
                    f7 = f4;
                    z3 = false;
                    break;
                case 4:
                    jP52 = w6Var.p5();
                    z3 = false;
                    break;
                case 5:
                    iP5 = (int) (w6Var.p5() * x0.eO.O());
                    z3 = false;
                    break;
                case 6:
                    iP52 = (int) (w6Var.p5() * x0.eO.O());
                    z3 = false;
                    break;
                case 7:
                    color = Color.parseColor(w6Var.M());
                    z3 = false;
                    break;
                case 8:
                    pl = AbstractC1674w6.Uo(w6Var, dsr);
                    z3 = false;
                    break;
                case 9:
                    f4 = f7;
                    int iP54 = w6Var.p5();
                    if (iP54 >= I28.n.values().length) {
                        dsr.n("Unsupported matte type: " + iP54);
                    } else {
                        nVar2 = I28.n.values()[iP54];
                        int i2 = j.f43418n[nVar2.ordinal()];
                        if (i2 == 1) {
                            dsr.n("Unsupported matte type: Luma");
                        } else if (i2 == 2) {
                            dsr.n("Unsupported matte type: Luma Inverted");
                        }
                        dsr.o(1);
                    }
                    f7 = f4;
                    z3 = false;
                    break;
                case 10:
                    f4 = f7;
                    w6Var.rl();
                    while (w6Var.jB()) {
                        arrayList3.add(r.n(w6Var, dsr));
                    }
                    dsr.o(arrayList3.size());
                    w6Var.Z();
                    f7 = f4;
                    z3 = false;
                    break;
                case 11:
                    ArrayList arrayList5 = arrayList4;
                    f4 = f7;
                    w6Var.rl();
                    while (w6Var.jB()) {
                        QJ.w6 w6VarN = fuX.n(w6Var, dsr);
                        ArrayList arrayList6 = arrayList5;
                        if (w6VarN != null) {
                            arrayList6.add(w6VarN);
                        }
                        arrayList5 = arrayList6;
                    }
                    arrayList4 = arrayList5;
                    w6Var.Z();
                    f7 = f4;
                    z3 = false;
                    break;
                case 12:
                    arrayList2 = arrayList4;
                    f5 = f7;
                    w6Var.Uo();
                    while (w6Var.jB()) {
                        int iMx = w6Var.Mx(rl);
                        if (iMx == 0) {
                            aCVarNr = AbstractC1669Ml.nr(w6Var, dsr);
                        } else if (iMx != 1) {
                            w6Var.fcU();
                            w6Var.n1();
                        } else {
                            w6Var.rl();
                            if (w6Var.jB()) {
                                cN = AbstractC1673n.n(w6Var, dsr);
                            }
                            while (w6Var.jB()) {
                                w6Var.n1();
                            }
                            w6Var.Z();
                        }
                    }
                    w6Var.T();
                    f7 = f5;
                    arrayList4 = arrayList2;
                    z3 = false;
                    break;
                case 13:
                    arrayList2 = arrayList4;
                    f5 = f7;
                    w6Var.rl();
                    ArrayList arrayList7 = new ArrayList();
                    while (w6Var.jB()) {
                        w6Var.Uo();
                        while (w6Var.jB()) {
                            int iMx2 = w6Var.Mx(f43417t);
                            if (iMx2 == 0) {
                                int iP55 = w6Var.p5();
                                if (iP55 == 29) {
                                    jVarRl = AbstractC1668I28.rl(w6Var, dsr);
                                } else if (iP55 == 25) {
                                    aCVarRl = new C().rl(w6Var, dsr);
                                }
                            } else if (iMx2 != 1) {
                                w6Var.fcU();
                                w6Var.n1();
                            } else {
                                arrayList7.add(w6Var.M());
                            }
                        }
                        w6Var.T();
                    }
                    w6Var.Z();
                    dsr.n("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList7);
                    f7 = f5;
                    arrayList4 = arrayList2;
                    z3 = false;
                    break;
                case 14:
                    fM7 = (float) w6Var.M7();
                    z3 = false;
                    break;
                case 15:
                    fM75 = (float) w6Var.M7();
                    z3 = false;
                    break;
                case 16:
                    arrayList2 = arrayList4;
                    fM73 = (float) (w6Var.M7() * ((double) x0.eO.O()));
                    arrayList4 = arrayList2;
                    z3 = false;
                    break;
                case 17:
                    f5 = f7;
                    arrayList2 = arrayList4;
                    fM74 = (float) (w6Var.M7() * ((double) x0.eO.O()));
                    f7 = f5;
                    arrayList4 = arrayList2;
                    z3 = false;
                    break;
                case 18:
                    fM72 = (float) w6Var.M7();
                    break;
                case 19:
                    fJ2 = (float) w6Var.M7();
                    break;
                case 20:
                    nVarJ2 = AbstractC1669Ml.J2(w6Var, dsr, z3);
                    break;
                case 21:
                    strM2 = w6Var.M();
                    break;
                case 22:
                    zU = w6Var.U();
                    break;
                case 23:
                    f6 = f7;
                    z4 = w6Var.p5() == 1 ? true : z3;
                    f7 = f6;
                    break;
                case 24:
                    int iP56 = w6Var.p5();
                    if (iP56 < QJ.fuX.values().length) {
                        fux2 = QJ.fuX.values()[iP56];
                    } else {
                        StringBuilder sb = new StringBuilder();
                        f6 = f7;
                        sb.append("Unsupported Blend Mode: ");
                        sb.append(iP56);
                        dsr.n(sb.toString());
                        fux2 = QJ.fuX.NORMAL;
                        f7 = f6;
                    }
                    break;
                default:
                    w6Var.fcU();
                    w6Var.n1();
                    f4 = f7;
                    f7 = f4;
                    z3 = false;
                    break;
            }
        }
        float f8 = f7;
        w6Var.T();
        ArrayList arrayList8 = new ArrayList();
        if (fM72 > f8) {
            arrayList = arrayList4;
            z2 = z4;
            f3 = fValueOf;
            arrayList8.add(new Ect.j(dsr, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fM72)));
        } else {
            f3 = fValueOf;
            arrayList = arrayList4;
            z2 = z4;
        }
        if (fJ2 <= f8) {
            fJ2 = dsr.J2();
        }
        arrayList8.add(new Ect.j(dsr, fValueOf2, fValueOf2, null, fM72, Float.valueOf(fJ2)));
        arrayList8.add(new Ect.j(dsr, f3, f3, null, fJ2, Float.valueOf(Float.MAX_VALUE)));
        if (strM.endsWith(".ai") || "ai".equals(strM2)) {
            dsr.n("Convert your Illustrator layers to shape layers.");
        }
        if (z2) {
            if (pl == null) {
                pl = new GO.Pl();
            }
            pl.az(z2);
        }
        return new gL.I28(arrayList, dsr, strM, jP5, jVar, jP52, strM3, arrayList3, pl, iP5, iP52, color, fM7, fM75, fM73, fM74, aCVarNr, cN, arrayList8, nVar2, nVarJ2, zU, jVarRl, aCVarRl, fux2);
    }

    public static gL.I28 n(FQq.Dsr dsr) {
        Rect rectRl = dsr.rl();
        List list = Collections.EMPTY_LIST;
        return new gL.I28(list, dsr, "__container", -1L, I28.j.PRE_COMP, -1L, null, list, new GO.Pl(), 0, 0, 0, 0.0f, 0.0f, rectRl.width(), rectRl.height(), null, null, list, I28.n.NONE, null, false, null, null, QJ.fuX.NORMAL);
    }
}
