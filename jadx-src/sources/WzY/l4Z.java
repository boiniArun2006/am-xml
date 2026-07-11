package WzY;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Vector2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class l4Z {
    private static final Vector2D n(PathMeasure pathMeasure, float f3) {
        float[] fArr = new float[2];
        pathMeasure.getPosTan(f3, fArr, null);
        return new Vector2D(fArr[0], fArr[1]);
    }

    public static /* synthetic */ C1487z nr(Path path, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f5 = Float.MAX_VALUE;
        }
        return t(path, f3, f4, f5);
    }

    public static final C1487z t(Path path, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        PathMeasure pathMeasure = new PathMeasure();
        int i2 = 0;
        pathMeasure.setPath(path, false);
        C1487z c1487z = new C1487z();
        float f6 = 0.0f;
        while (true) {
            i2++;
            if (i2 > 1) {
                c1487z.m(true);
            }
            float length = pathMeasure.getLength();
            float f7 = f6 + length;
            if (f7 >= f4 && f6 <= f5) {
                float fCoerceAtLeast = RangesKt.coerceAtLeast(f4 - f6, 0.0f);
                float fCoerceAtMost = RangesKt.coerceAtMost(f5 - f6, length);
                List listRl = rl(pathMeasure, fCoerceAtLeast, fCoerceAtMost, f3);
                c1487z.k((Vector2D) CollectionsKt.first(listRl));
                Iterator it = CollectionsKt.drop(listRl, 1).iterator();
                while (it.hasNext()) {
                    c1487z.D((Vector2D) it.next());
                }
                c1487z.D(n(pathMeasure, fCoerceAtMost));
                if (pathMeasure.isClosed() && f4 <= f6 && f5 >= f7) {
                    c1487z.ViF();
                }
            }
            if (!pathMeasure.nextContour()) {
                return c1487z;
            }
            f6 = f7;
        }
    }

    private static final List rl(PathMeasure pathMeasure, float f3, float f4, float f5) {
        List listEmptyList = CollectionsKt.emptyList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(Float.valueOf(f3), Float.valueOf(f4)));
        while (!arrayList.isEmpty()) {
            Object objRemove = arrayList.remove(0);
            Intrinsics.checkNotNullExpressionValue(objRemove, "removeAt(...)");
            Pair pair = (Pair) objRemove;
            float fFloatValue = ((Number) pair.getFirst()).floatValue();
            float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
            float f6 = ((fFloatValue2 - fFloatValue) / 2.0f) + fFloatValue;
            Vector2D vector2DN = n(pathMeasure, fFloatValue);
            Vector2D vector2DN2 = n(pathMeasure, fFloatValue2);
            if (GeometryKt.getLength(GeometryKt.minus(GeometryKt.plus(vector2DN, GeometryKt.div(GeometryKt.minus(vector2DN2, vector2DN), 2.0f)), n(pathMeasure, f6))) < f5) {
                listEmptyList = CollectionsKt.plus((Collection) listEmptyList, (Iterable) CollectionsKt.listOf(vector2DN));
            } else {
                arrayList.add(0, new Pair(Float.valueOf(f6), Float.valueOf(fFloatValue2)));
                arrayList.add(0, new Pair(Float.valueOf(fFloatValue), Float.valueOf(f6)));
            }
        }
        return listEmptyList;
    }
}
