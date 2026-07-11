package ef;

import B.j;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class z implements l3D, j.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.airbnb.lottie.Xo f63838n;
    private QJ.Xo nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final B.j f63839t;

    @Override // ef.w6
    public void rl(List list, List list2) {
    }

    private static int O(int i2, int i3) {
        int i5 = i2 / i3;
        return ((i2 ^ i3) >= 0 || i3 * i5 == i2) ? i5 : i5 - 1;
    }

    @Override // B.j.n
    public void n() {
        this.f63838n.invalidateSelf();
    }

    @Override // ef.l3D
    public void t(j.n nVar) {
        this.f63839t.n(nVar);
    }

    public B.j xMQ() {
        return this.f63839t;
    }

    public z(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.Pl pl) {
        this.f63838n = xo;
        this.rl = pl.t();
        B.j jVarN = pl.rl().n();
        this.f63839t = jVarN;
        nVar.mUb(jVarN);
        jVarN.n(this);
    }

    private static int J2(int i2, int i3) {
        return i2 - (O(i2, i3) * i3);
    }

    private QJ.Xo mUb(QJ.Xo xo) {
        PointF pointFT;
        PointF pointFRl;
        boolean z2;
        List listN = xo.n();
        boolean zNr = xo.nr();
        int i2 = 0;
        for (int size = listN.size() - 1; size >= 0; size--) {
            ES.j jVar = (ES.j) listN.get(size);
            ES.j jVar2 = (ES.j) listN.get(J2(size - 1, listN.size()));
            if (size == 0 && !zNr) {
                pointFT = xo.rl();
            } else {
                pointFT = jVar2.t();
            }
            if (size == 0 && !zNr) {
                pointFRl = pointFT;
            } else {
                pointFRl = jVar2.rl();
            }
            PointF pointFN = jVar.n();
            if (!xo.nr() && (size == 0 || size == listN.size() - 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (pointFRl.equals(pointFT) && pointFN.equals(pointFT) && !z2) {
                i2 += 2;
            } else {
                i2++;
            }
        }
        QJ.Xo xo2 = this.nr;
        if (xo2 == null || xo2.n().size() != i2) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(new ES.j());
            }
            this.nr = new QJ.Xo(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.nr.O(zNr);
        return this.nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    @Override // ef.l3D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QJ.Xo nr(QJ.Xo xo) {
        PointF pointFT;
        PointF pointFRl;
        boolean z2;
        List list;
        List listN = xo.n();
        if (listN.size() > 2) {
            float fFloatValue = ((Float) this.f63839t.KN()).floatValue();
            if (fFloatValue != 0.0f) {
                QJ.Xo xoMUb = mUb(xo);
                xoMUb.J2(xo.rl().x, xo.rl().y);
                List listN2 = xoMUb.n();
                boolean zNr = xo.nr();
                int i2 = 0;
                int i3 = 0;
                while (i2 < listN.size()) {
                    ES.j jVar = (ES.j) listN.get(i2);
                    ES.j jVar2 = (ES.j) listN.get(J2(i2 - 1, listN.size()));
                    ES.j jVar3 = (ES.j) listN.get(J2(i2 - 2, listN.size()));
                    if (i2 == 0 && !zNr) {
                        pointFT = xo.rl();
                    } else {
                        pointFT = jVar2.t();
                    }
                    if (i2 == 0 && !zNr) {
                        pointFRl = pointFT;
                    } else {
                        pointFRl = jVar2.rl();
                    }
                    PointF pointFN = jVar.n();
                    PointF pointFT2 = jVar3.t();
                    PointF pointFT3 = jVar.t();
                    if (!xo.nr()) {
                        z2 = true;
                        if (i2 != 0 && i2 != listN.size() - 1) {
                            z2 = false;
                        }
                    }
                    if (pointFRl.equals(pointFT) && pointFN.equals(pointFT) && !z2) {
                        float f3 = pointFT.x;
                        float f4 = f3 - pointFT2.x;
                        float f5 = pointFT.y;
                        float f6 = f5 - pointFT2.y;
                        float f7 = pointFT3.x - f3;
                        float f8 = pointFT3.y - f5;
                        list = listN;
                        float fHypot = (float) Math.hypot(f4, f6);
                        float fHypot2 = (float) Math.hypot(f7, f8);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f9 = pointFT.x;
                        float f10 = ((pointFT2.x - f9) * fMin) + f9;
                        float f11 = pointFT.y;
                        float f12 = ((pointFT2.y - f11) * fMin) + f11;
                        float f13 = ((pointFT3.x - f9) * fMin2) + f9;
                        float f14 = ((pointFT3.y - f11) * fMin2) + f11;
                        float f15 = f10 - ((f10 - f9) * 0.5519f);
                        float f16 = f12 - ((f12 - f11) * 0.5519f);
                        float f17 = f13 - ((f13 - f9) * 0.5519f);
                        float f18 = f14 - ((f14 - f11) * 0.5519f);
                        ES.j jVar4 = (ES.j) listN2.get(J2(i3 - 1, listN2.size()));
                        ES.j jVar5 = (ES.j) listN2.get(i3);
                        jVar4.O(f10, f12);
                        jVar4.J2(f10, f12);
                        if (i2 == 0) {
                            xoMUb.J2(f10, f12);
                        }
                        jVar5.nr(f15, f16);
                        ES.j jVar6 = (ES.j) listN2.get(i3 + 1);
                        jVar5.O(f17, f18);
                        jVar5.J2(f13, f14);
                        jVar6.nr(f13, f14);
                        i3 += 2;
                    } else {
                        list = listN;
                        ES.j jVar7 = (ES.j) listN2.get(J2(i3 - 1, listN2.size()));
                        ES.j jVar8 = (ES.j) listN2.get(i3);
                        jVar7.O(jVar2.rl().x, jVar2.rl().y);
                        jVar7.J2(jVar2.t().x, jVar2.t().y);
                        jVar8.nr(jVar.n().x, jVar.n().y);
                        i3++;
                    }
                    i2++;
                    listN = list;
                }
                return xoMUb;
            }
        }
        return xo;
    }
}
