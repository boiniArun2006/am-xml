package d;

import android.graphics.Path;
import com.alightcreative.app.motion.scene.Vector2D;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC1951j {
    public static final Pair J2(float f3, float f4, int i2, int i3) {
        float f5 = i2;
        float f6 = (f4 * f5) / f3;
        float f7 = i3;
        return f6 <= f7 ? new Pair(Float.valueOf(f5), Float.valueOf(f6)) : new Pair(Float.valueOf((f3 * f7) / f4), Float.valueOf(f7));
    }

    public static final Pair rl(float f3, float f4, int i2, int i3) {
        float f5 = i2;
        float f6 = (f4 * f5) / f3;
        float f7 = i3;
        return f6 >= f7 ? new Pair(Float.valueOf(f5), Float.valueOf(f6)) : new Pair(Float.valueOf((f3 * f7) / f4), Float.valueOf(f7));
    }

    public static final Pair KN(int i2, int i3, int i5, int i7) {
        if (i2 == 0 || i3 == 0) {
            return new Pair(1, 1);
        }
        if (i2 <= i5 && i3 <= i7) {
            return new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
        }
        int i8 = (i3 * i5) / i2;
        return i8 <= i7 ? new Pair(Integer.valueOf(i5), Integer.valueOf(i8)) : new Pair(Integer.valueOf((i2 * i7) / i3), Integer.valueOf(i7));
    }

    public static final Pair O(float f3, float f4, float f5, float f6) {
        float f7 = (f4 * f5) / f3;
        return f7 <= f6 ? new Pair(Float.valueOf(f5), Float.valueOf(f7)) : new Pair(Float.valueOf((f3 * f6) / f4), Float.valueOf(f6));
    }

    public static final Pair Uo(int i2, int i3, int i5, int i7) {
        if (i2 == 0 || i3 == 0) {
            return new Pair(Integer.valueOf(i5), Integer.valueOf(i7));
        }
        int i8 = (i3 * i5) / i2;
        return i8 <= i7 ? new Pair(Integer.valueOf(i5), Integer.valueOf(i8)) : new Pair(Integer.valueOf((i2 * i7) / i3), Integer.valueOf(i7));
    }

    public static final void gh(Path path, Vector2D v1, Vector2D v2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(v2, "v2");
        path.quadTo(v1.getX(), v1.getY(), v2.getX(), v2.getY());
    }

    public static final void mUb(Path path, Vector2D v2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(v2, "v");
        path.moveTo(v2.getX(), v2.getY());
    }

    public static final Pair n(float f3, float f4, float f5, float f6) {
        float f7 = (f4 * f5) / f3;
        return f7 >= f6 ? new Pair(Float.valueOf(f5), Float.valueOf(f7)) : new Pair(Float.valueOf((f3 * f6) / f4), Float.valueOf(f6));
    }

    public static final Vector2D nr(Vector2D target, Vector2D to) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(to, "to");
        Pair pairO = O(target.getX(), target.getY(), to.getX(), to.getY());
        return new Vector2D(((Number) pairO.getFirst()).floatValue(), ((Number) pairO.getSecond()).floatValue());
    }

    public static final Pair t(int i2, int i3, int i5, int i7) {
        int i8 = (i3 * i5) / i2;
        return i8 >= i7 ? new Pair(Integer.valueOf(i5), Integer.valueOf(i8)) : new Pair(Integer.valueOf((i2 * i7) / i3), Integer.valueOf(i7));
    }

    public static final void xMQ(Path path, Vector2D v2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(v2, "v");
        path.lineTo(v2.getX(), v2.getY());
    }
}
