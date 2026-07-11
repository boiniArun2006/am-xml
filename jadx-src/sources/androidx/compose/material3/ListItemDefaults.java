package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jl\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/ListItemDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "headlineColor", "leadingIconColor", "overlineColor", "supportingColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "Landroidx/compose/material3/ListItemColors;", c.f62177j, "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ListItemColors;", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "()F", "Elevation", "Landroidx/compose/ui/graphics/Shape;", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ListItemDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ListItemDefaults f26110n = new ListItemDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float Elevation = ListTokens.f29685n.rl();

    public final ListItemColors n(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, Composer composer, int i2, int i3) {
        long jAz;
        long jAz2;
        long jAz3;
        long j12;
        long jXMQ = (i3 & 1) != 0 ? ColorSchemeKt.xMQ(ListTokens.f29685n.n(), composer, 6) : j2;
        long jXMQ2 = (i3 & 2) != 0 ? ColorSchemeKt.xMQ(ListTokens.f29685n.mUb(), composer, 6) : j3;
        long jXMQ3 = (i3 & 4) != 0 ? ColorSchemeKt.xMQ(ListTokens.f29685n.qie(), composer, 6) : j4;
        long jXMQ4 = (i3 & 8) != 0 ? ColorSchemeKt.xMQ(ListTokens.f29685n.HI(), composer, 6) : j5;
        long jXMQ5 = (i3 & 16) != 0 ? ColorSchemeKt.xMQ(ListTokens.f29685n.Ik(), composer, 6) : j6;
        long jXMQ6 = (i3 & 32) != 0 ? ColorSchemeKt.xMQ(ListTokens.f29685n.Z(), composer, 6) : j7;
        if ((i3 & 64) != 0) {
            ListTokens listTokens = ListTokens.f29685n;
            jAz = Color.az(ColorSchemeKt.xMQ(listTokens.nr(), composer, 6), listTokens.O(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz = j9;
        }
        if ((i3 & 128) != 0) {
            ListTokens listTokens2 = ListTokens.f29685n;
            jAz2 = Color.az(ColorSchemeKt.xMQ(listTokens2.J2(), composer, 6), listTokens2.Uo(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz2 = j10;
        }
        if ((i3 & 256) != 0) {
            ListTokens listTokens3 = ListTokens.f29685n;
            jAz3 = Color.az(ColorSchemeKt.xMQ(listTokens3.KN(), composer, 6), listTokens3.xMQ(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz3 = j11;
        }
        if (ComposerKt.v()) {
            j12 = jAz3;
            ComposerKt.p5(-352515689, i2, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:583)");
        } else {
            j12 = jAz3;
        }
        ListItemColors listItemColors = new ListItemColors(jXMQ, jXMQ2, jXMQ3, jXMQ4, jXMQ5, jXMQ6, jAz, jAz2, j12, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return listItemColors;
    }

    public final float rl() {
        return Elevation;
    }

    private ListItemDefaults() {
    }

    public final Shape t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-496871597, i2, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:536)");
        }
        Shape shapeO = ShapesKt.O(ListTokens.f29685n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
