package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\" \u0010\u0006\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/Shape;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/graphics/Shape;", "()Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V", "RectangleShape", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RectangleShapeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Shape f31534n = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @Override // androidx.compose.ui.graphics.Shape
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Outline.Rectangle n(long size, LayoutDirection layoutDirection, Density density) {
            return new Outline.Rectangle(SizeKt.t(size));
        }

        public String toString() {
            return "RectangleShape";
        }
    };

    public static final Shape n() {
        return f31534n;
    }
}
