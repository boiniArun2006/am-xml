package B;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class C extends CN3 {
    private final PointF xMQ;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // B.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public PointF mUb(Ect.j jVar, float f3, float f4, float f5) {
        Object obj;
        PointF pointF;
        Object obj2 = jVar.rl;
        if (obj2 == null || (obj = jVar.f2329t) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        Ect.w6 w6Var = this.f211O;
        if (w6Var != null && (pointF = (PointF) w6Var.rl(jVar.Uo, jVar.KN.floatValue(), pointF2, pointF3, f3, O(), J2())) != null) {
            return pointF;
        }
        PointF pointF4 = this.xMQ;
        float f6 = pointF2.x;
        float f7 = f6 + (f4 * (pointF3.x - f6));
        float f8 = pointF2.y;
        pointF4.set(f7, f8 + (f5 * (pointF3.y - f8)));
        return this.xMQ;
    }

    public C(List list) {
        super(list);
        this.xMQ = new PointF();
    }

    @Override // B.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF xMQ(Ect.j jVar, float f3) {
        return mUb(jVar, f3, f3, f3);
    }
}
