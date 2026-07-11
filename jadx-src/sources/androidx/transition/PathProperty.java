package androidx.transition;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class PathProperty<T> extends Property<T, Float> {
    private float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final PointF f42193O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Property f42194n;
    private final float[] nr;
    private final PathMeasure rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f42195t;

    @Override // android.util.Property
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float get(Object obj) {
        return Float.valueOf(this.J2);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void set(Object obj, Float f3) {
        this.J2 = f3.floatValue();
        this.rl.getPosTan(this.f42195t * f3.floatValue(), this.nr, null);
        PointF pointF = this.f42193O;
        float[] fArr = this.nr;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f42194n.set(obj, pointF);
    }
}
