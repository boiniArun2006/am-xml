package c;

import Rc.w6;
import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class qf implements vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qf f43440n = new qf();
    private static final w6.j rl = w6.j.n("c", "v", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "o");

    private qf() {
    }

    @Override // c.vd
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public QJ.Xo n(Rc.w6 w6Var, float f3) {
        if (w6Var.a() == w6.n.BEGIN_ARRAY) {
            w6Var.rl();
        }
        w6Var.Uo();
        List listJ2 = null;
        List listJ22 = null;
        List listJ23 = null;
        boolean zU = false;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(rl);
            if (iMx != 0) {
                if (iMx != 1) {
                    if (iMx != 2) {
                        if (iMx != 3) {
                            w6Var.fcU();
                            w6Var.n1();
                        } else {
                            listJ23 = l3D.J2(w6Var, f3);
                        }
                    } else {
                        listJ22 = l3D.J2(w6Var, f3);
                    }
                } else {
                    listJ2 = l3D.J2(w6Var, f3);
                }
            } else {
                zU = w6Var.U();
            }
        }
        w6Var.T();
        if (w6Var.a() == w6.n.END_ARRAY) {
            w6Var.Z();
        }
        if (listJ2 != null && listJ22 != null && listJ23 != null) {
            if (listJ2.isEmpty()) {
                return new QJ.Xo(new PointF(), false, Collections.EMPTY_LIST);
            }
            int size = listJ2.size();
            PointF pointF = (PointF) listJ2.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 1; i2 < size; i2++) {
                PointF pointF2 = (PointF) listJ2.get(i2);
                int i3 = i2 - 1;
                arrayList.add(new ES.j(x0.o.n((PointF) listJ2.get(i3), (PointF) listJ23.get(i3)), x0.o.n(pointF2, (PointF) listJ22.get(i2)), pointF2));
            }
            if (zU) {
                PointF pointF3 = (PointF) listJ2.get(0);
                int i5 = size - 1;
                arrayList.add(new ES.j(x0.o.n((PointF) listJ2.get(i5), (PointF) listJ23.get(i5)), x0.o.n(pointF3, (PointF) listJ22.get(0)), pointF3));
            }
            return new QJ.Xo(pointF, zU, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
