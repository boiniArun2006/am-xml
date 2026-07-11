package B;

import android.graphics.Path;
import ef.l3D;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class qz extends j {
    private List az;
    private Path gh;
    private final Path mUb;
    private Path qie;
    private final QJ.Xo xMQ;

    @Override // B.j
    protected boolean ck() {
        List list = this.az;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void o(List list) {
        this.az = list;
    }

    @Override // B.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Path xMQ(Ect.j jVar, float f3) {
        QJ.Xo xo = (QJ.Xo) jVar.rl;
        QJ.Xo xo2 = (QJ.Xo) jVar.f2329t;
        this.xMQ.t(xo, xo2 == null ? xo : xo2, f3);
        QJ.Xo xoNr = this.xMQ;
        List list = this.az;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                xoNr = ((l3D) this.az.get(size)).nr(xoNr);
            }
        }
        x0.o.KN(xoNr, this.mUb);
        if (this.f211O == null) {
            return this.mUb;
        }
        if (this.gh == null) {
            this.gh = new Path();
            this.qie = new Path();
        }
        x0.o.KN(xo, this.gh);
        if (xo2 != null) {
            x0.o.KN(xo2, this.qie);
        }
        Ect.w6 w6Var = this.f211O;
        float f4 = jVar.Uo;
        float fFloatValue = jVar.KN.floatValue();
        Path path = this.gh;
        return (Path) w6Var.rl(f4, fFloatValue, path, xo2 == null ? path : this.qie, f3, O(), J2());
    }

    public qz(List list) {
        super(list);
        this.xMQ = new QJ.Xo();
        this.mUb = new Path();
    }
}
