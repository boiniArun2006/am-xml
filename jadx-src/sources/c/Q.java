package c;

import Rc.w6;
import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import gL.I28;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43412n = w6.j.n("w", CmcdData.STREAMING_FORMAT_HLS, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static w6.j rl = w6.j.n("id", "layers", "w", CmcdData.STREAMING_FORMAT_HLS, TtmlNode.TAG_P, "u");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final w6.j f43413t = w6.j.n("list");
    private static final w6.j nr = w6.j.n("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static FQq.Dsr n(Rc.w6 w6Var) {
        float f3;
        Rc.w6 w6Var2 = w6Var;
        float fO = x0.eO.O();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        FQq.Dsr dsr = new FQq.Dsr();
        w6Var2.Uo();
        float fM7 = 0.0f;
        float fM72 = 0.0f;
        float fM73 = 0.0f;
        int iP5 = 0;
        int iP52 = 0;
        while (w6Var2.jB()) {
            switch (w6Var2.Mx(f43412n)) {
                case 0:
                    iP52 = w6Var.p5();
                    w6Var2 = w6Var;
                    break;
                case 1:
                    iP5 = w6Var.p5();
                    w6Var2 = w6Var;
                    break;
                case 2:
                    f3 = fO;
                    fM7 = (float) w6Var.M7();
                    w6Var2 = w6Var;
                    fO = f3;
                    break;
                case 3:
                    f3 = fO;
                    fM72 = ((float) w6Var.M7()) - 0.01f;
                    w6Var2 = w6Var;
                    fO = f3;
                    break;
                case 4:
                    f3 = fO;
                    fM73 = (float) w6Var.M7();
                    w6Var2 = w6Var;
                    fO = f3;
                    break;
                case 5:
                    String[] strArrSplit = w6Var2.M().split("\\.");
                    if (!x0.eO.mUb(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        dsr.n("Lottie only supports bodymovin >= 4.4.0");
                    }
                    w6Var2 = w6Var;
                    break;
                case 6:
                    O(w6Var2, dsr, arrayList, longSparseArray);
                    w6Var2 = w6Var;
                    break;
                case 7:
                    rl(w6Var2, dsr, map, map2);
                    w6Var2 = w6Var;
                    break;
                case 8:
                    nr(w6Var2, map3);
                    w6Var2 = w6Var;
                    break;
                case 9:
                    t(w6Var2, dsr, sparseArrayCompat);
                    w6Var2 = w6Var;
                    break;
                case 10:
                    J2(w6Var2, arrayList2);
                    w6Var2 = w6Var;
                    break;
                default:
                    w6Var2.fcU();
                    w6Var2.n1();
                    w6Var2 = w6Var;
                    break;
            }
        }
        float f4 = fO;
        dsr.Z(new Rect(0, 0, (int) (iP52 * f4), (int) (iP5 * f4)), fM7, fM72, fM73, arrayList, longSparseArray, map, map2, x0.eO.O(), sparseArrayCompat, map3, arrayList2, iP52, iP5);
        return dsr;
    }

    private static void J2(Rc.w6 w6Var, List list) {
        w6Var.rl();
        while (w6Var.jB()) {
            w6Var.Uo();
            float fM7 = 0.0f;
            String strM = null;
            float fM72 = 0.0f;
            while (w6Var.jB()) {
                int iMx = w6Var.Mx(nr);
                if (iMx != 0) {
                    if (iMx != 1) {
                        if (iMx != 2) {
                            w6Var.fcU();
                            w6Var.n1();
                        } else {
                            fM72 = (float) w6Var.M7();
                        }
                    } else {
                        fM7 = (float) w6Var.M7();
                    }
                } else {
                    strM = w6Var.M();
                }
            }
            w6Var.T();
            list.add(new ES.fuX(strM, fM7, fM72));
        }
        w6Var.Z();
    }

    private static void O(Rc.w6 w6Var, FQq.Dsr dsr, List list, LongSparseArray longSparseArray) {
        w6Var.rl();
        int i2 = 0;
        while (w6Var.jB()) {
            gL.I28 i28Rl = UGc.rl(w6Var, dsr);
            if (i28Rl.Uo() == I28.j.IMAGE) {
                i2++;
            }
            list.add(i28Rl);
            longSparseArray.gh(i28Rl.O(), i28Rl);
            if (i2 > 4) {
                x0.CN3.t("You have " + i2 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        w6Var.Z();
    }

    private static void nr(Rc.w6 w6Var, Map map) {
        w6Var.Uo();
        while (w6Var.jB()) {
            if (w6Var.Mx(f43413t) != 0) {
                w6Var.fcU();
                w6Var.n1();
            } else {
                w6Var.rl();
                while (w6Var.jB()) {
                    ES.w6 w6VarN = Pl.n(w6Var);
                    map.put(w6VarN.rl(), w6VarN);
                }
                w6Var.Z();
            }
        }
        w6Var.T();
    }

    private static void rl(Rc.w6 w6Var, FQq.Dsr dsr, Map map, Map map2) {
        w6Var.rl();
        while (w6Var.jB()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            w6Var.Uo();
            int iP5 = 0;
            int iP52 = 0;
            String strM = null;
            String strM2 = null;
            String strM3 = null;
            while (w6Var.jB()) {
                int iMx = w6Var.Mx(rl);
                if (iMx != 0) {
                    if (iMx != 1) {
                        if (iMx != 2) {
                            if (iMx != 3) {
                                if (iMx != 4) {
                                    if (iMx != 5) {
                                        w6Var.fcU();
                                        w6Var.n1();
                                    } else {
                                        strM3 = w6Var.M();
                                    }
                                } else {
                                    strM2 = w6Var.M();
                                }
                            } else {
                                iP52 = w6Var.p5();
                            }
                        } else {
                            iP5 = w6Var.p5();
                        }
                    } else {
                        w6Var.rl();
                        while (w6Var.jB()) {
                            gL.I28 i28Rl = UGc.rl(w6Var, dsr);
                            longSparseArray.gh(i28Rl.O(), i28Rl);
                            arrayList.add(i28Rl);
                        }
                        w6Var.Z();
                    }
                } else {
                    strM = w6Var.M();
                }
            }
            w6Var.T();
            if (strM2 != null) {
                FQq.UGc uGc = new FQq.UGc(iP5, iP52, strM, strM2, strM3);
                map2.put(uGc.O(), uGc);
            } else {
                map.put(strM, arrayList);
            }
        }
        w6Var.Z();
    }

    private static void t(Rc.w6 w6Var, FQq.Dsr dsr, SparseArrayCompat sparseArrayCompat) {
        w6Var.rl();
        while (w6Var.jB()) {
            ES.Ml mlN = qz.n(w6Var, dsr);
            sparseArrayCompat.az(mlN.hashCode(), mlN);
        }
        w6Var.Z();
    }
}
