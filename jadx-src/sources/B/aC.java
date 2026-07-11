package B;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class aC extends CN3 {
    private Dsr az;
    private final float[] gh;
    private final float[] mUb;
    private final PathMeasure qie;
    private final PointF xMQ;

    @Override // B.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF xMQ(Ect.j jVar, float f3) {
        float f4;
        Dsr dsr = (Dsr) jVar;
        Path pathGh = dsr.gh();
        Ect.w6 w6Var = this.f211O;
        if (w6Var == null || jVar.KN == null) {
            f4 = f3;
        } else {
            f4 = f3;
            PointF pointF = (PointF) w6Var.rl(dsr.Uo, dsr.KN.floatValue(), (PointF) dsr.rl, (PointF) dsr.f2329t, O(), f4, J2());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathGh == null) {
            return (PointF) jVar.rl;
        }
        if (this.az != dsr) {
            this.qie.setPath(pathGh, false);
            this.az = dsr;
        }
        float length = this.qie.getLength();
        float f5 = f4 * length;
        this.qie.getPosTan(f5, this.mUb, this.gh);
        PointF pointF2 = this.xMQ;
        float[] fArr = this.mUb;
        pointF2.set(fArr[0], fArr[1]);
        if (f5 < 0.0f) {
            PointF pointF3 = this.xMQ;
            float[] fArr2 = this.gh;
            pointF3.offset(fArr2[0] * f5, fArr2[1] * f5);
        } else if (f5 > length) {
            PointF pointF4 = this.xMQ;
            float[] fArr3 = this.gh;
            float f6 = f5 - length;
            pointF4.offset(fArr3[0] * f6, fArr3[1] * f6);
        }
        return this.xMQ;
    }

    public aC(List list) {
        super(list);
        this.xMQ = new PointF();
        this.mUb = new float[2];
        this.gh = new float[2];
        this.qie = new PathMeasure();
    }
}
