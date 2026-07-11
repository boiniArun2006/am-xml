package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006'"}, d2 = {"Landroidx/compose/material3/tokens/ShapeTokens;", "", "<init>", "()V", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "rl", "Landroidx/compose/foundation/shape/RoundedCornerShape;", c.f62177j, "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CornerExtraLarge", "t", "getCornerExtraLargeTop", "CornerExtraLargeTop", "nr", "CornerExtraSmall", "O", "getCornerExtraSmallTop", "CornerExtraSmallTop", "J2", "getCornerFull", "CornerFull", "Uo", "CornerLarge", "KN", "getCornerLargeEnd", "CornerLargeEnd", "xMQ", "getCornerLargeTop", "CornerLargeTop", "mUb", "CornerMedium", "Landroidx/compose/ui/graphics/Shape;", "gh", "Landroidx/compose/ui/graphics/Shape;", "getCornerNone", "()Landroidx/compose/ui/graphics/Shape;", "CornerNone", "qie", "CornerSmall", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShapeTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeTokens.kt\nandroidx/compose/material3/tokens/ShapeTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,63:1\n158#2:64\n158#2:65\n158#2:66\n158#2:67\n158#2:68\n158#2:69\n158#2:70\n158#2:71\n158#2:72\n158#2:73\n158#2:74\n158#2:75\n158#2:76\n158#2:77\n158#2:78\n158#2:79\n158#2:80\n158#2:81\n158#2:82\n158#2:83\n158#2:84\n*S KotlinDebug\n*F\n+ 1 ShapeTokens.kt\nandroidx/compose/material3/tokens/ShapeTokens\n*L\n27#1:64\n30#1:65\n31#1:66\n32#1:67\n33#1:68\n35#1:69\n38#1:70\n39#1:71\n40#1:72\n41#1:73\n44#1:74\n47#1:75\n48#1:76\n49#1:77\n50#1:78\n54#1:79\n55#1:80\n56#1:81\n57#1:82\n59#1:83\n61#1:84\n*E\n"})
public final class ShapeTokens {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final RoundedCornerShape CornerLargeEnd;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraSmallTop;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final RoundedCornerShape CornerLarge;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final RoundedCornerShape CornerExtraSmall;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final RoundedCornerShape CornerExtraLarge;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape CornerExtraLargeTop;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final RoundedCornerShape CornerLargeTop;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ShapeTokens f29874n = new ShapeTokens();

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final RoundedCornerShape CornerFull = RoundedCornerShapeKt.J2();

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final RoundedCornerShape CornerMedium = RoundedCornerShapeKt.t(Dp.KN((float) 12.0d));

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final Shape CornerNone = RectangleShapeKt.n();

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final RoundedCornerShape CornerSmall = RoundedCornerShapeKt.t(Dp.KN((float) 8.0d));

    static {
        float f3 = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShapeKt.t(Dp.KN(f3));
        float f4 = (float) 0.0d;
        CornerExtraLargeTop = RoundedCornerShapeKt.nr(Dp.KN(f3), Dp.KN(f3), Dp.KN(f4), Dp.KN(f4));
        float f5 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShapeKt.t(Dp.KN(f5));
        CornerExtraSmallTop = RoundedCornerShapeKt.nr(Dp.KN(f5), Dp.KN(f5), Dp.KN(f4), Dp.KN(f4));
        float f6 = (float) 16.0d;
        CornerLarge = RoundedCornerShapeKt.t(Dp.KN(f6));
        CornerLargeEnd = RoundedCornerShapeKt.nr(Dp.KN(f4), Dp.KN(f6), Dp.KN(f6), Dp.KN(f4));
        CornerLargeTop = RoundedCornerShapeKt.nr(Dp.KN(f6), Dp.KN(f6), Dp.KN(f4), Dp.KN(f4));
    }

    public final RoundedCornerShape O() {
        return CornerSmall;
    }

    public final RoundedCornerShape n() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape nr() {
        return CornerMedium;
    }

    public final RoundedCornerShape rl() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape t() {
        return CornerLarge;
    }

    private ShapeTokens() {
    }
}
