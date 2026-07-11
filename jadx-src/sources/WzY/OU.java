package WzY;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Vector2D;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class OU {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f11588n = false;
    private static final Map rl = MapsKt.mapOf(TuplesKt.to(1, 2), TuplesKt.to(2, 2), TuplesKt.to(3, 6), TuplesKt.to(4, 4), TuplesKt.to(20, 3), TuplesKt.to(21, 4), TuplesKt.to(22, 4), TuplesKt.to(23, 12), TuplesKt.to(50, 0), TuplesKt.to(51, 0), TuplesKt.to(52, 0));

    public static final Sis J2(Sis sis) {
        Intrinsics.checkNotNullParameter(sis, "<this>");
        Path pathT = sis.t();
        RectF rectF = new RectF();
        pathT.computeBounds(rectF, true);
        final float fMin = 1.0f / Math.min(rectF.width(), rectF.height());
        final Vector2D vector2D = new Vector2D(-rectF.centerX(), -rectF.centerY());
        return nr(sis, new Function1() { // from class: WzY.mz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OU.Uo(vector2D, fMin, (Vector2D) obj);
            }
        });
    }

    public static final void O(Sis sis, QJ vg, yg paint, Matrix matrix, float f3) {
        Intrinsics.checkNotNullParameter(sis, "<this>");
        Intrinsics.checkNotNullParameter(vg, "vg");
        Intrinsics.checkNotNullParameter(paint, "paint");
        sis.rl(vg, paint, matrix, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D Uo(Vector2D vector2D, float f3, Vector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GeometryKt.times(GeometryKt.plus(it, vector2D), f3);
    }

    public static final C1487z nr(Sis sis, Function1 mapper) {
        Intrinsics.checkNotNullParameter(sis, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        C1487z c1487zN = sis.n();
        c1487zN.I(mapper);
        return c1487zN;
    }
}
