package tTF;

import com.alightcreative.app.motion.scene.CBKnot;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.Vector2D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    public static final CubicBSpline n(float f3, float f4, float f5, float f6) {
        return CubicBSplineKt.cubicBSplineFromPoints$default(new CBKnot[]{new CBKnot(new Vector2D(f3, f4), null, null, 6, null), new CBKnot(new Vector2D(f5, f4), null, null, 6, null), new CBKnot(new Vector2D(f5, f6), null, null, 6, null), new CBKnot(new Vector2D(f3, f6), null, null, 6, null)}, false, 2, null);
    }
}
