package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.tokens.ShapeTokens;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/ShapeDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/shape/CornerBasedShape;", "rl", "Landroidx/compose/foundation/shape/CornerBasedShape;", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "ExtraSmall", "t", "O", "Small", "nr", "Medium", "Large", "J2", c.f62177j, "ExtraLarge", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShapeDefaults {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final CornerBasedShape ExtraLarge;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final CornerBasedShape Large;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ShapeDefaults f27518n = new ShapeDefaults();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final CornerBasedShape Medium;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final CornerBasedShape ExtraSmall;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final CornerBasedShape Small;

    static {
        ShapeTokens shapeTokens = ShapeTokens.f29874n;
        ExtraSmall = shapeTokens.rl();
        Small = shapeTokens.O();
        Medium = shapeTokens.nr();
        Large = shapeTokens.t();
        ExtraLarge = shapeTokens.n();
    }

    public final CornerBasedShape O() {
        return Small;
    }

    public final CornerBasedShape n() {
        return ExtraLarge;
    }

    public final CornerBasedShape nr() {
        return Medium;
    }

    public final CornerBasedShape rl() {
        return ExtraSmall;
    }

    public final CornerBasedShape t() {
        return Large;
    }

    private ShapeDefaults() {
    }
}
