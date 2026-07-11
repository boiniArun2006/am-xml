package B;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Dsr extends Ect.j {
    private Path Ik;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Ect.j f204r;

    public Dsr(FQq.Dsr dsr, Ect.j jVar) {
        super(dsr, (PointF) jVar.rl, (PointF) jVar.f2329t, jVar.nr, jVar.f2327O, jVar.J2, jVar.Uo, jVar.KN);
        this.f204r = jVar;
        mUb();
    }

    Path gh() {
        return this.Ik;
    }

    public void mUb() {
        Object obj;
        Object obj2;
        Object obj3 = this.f2329t;
        boolean z2 = (obj3 == null || (obj2 = this.rl) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.rl;
        if (obj4 == null || (obj = this.f2329t) == null || z2) {
            return;
        }
        Ect.j jVar = this.f204r;
        this.Ik = x0.eO.nr((PointF) obj4, (PointF) obj, jVar.HI, jVar.ck);
    }
}
