package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/AppBarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "t", "()F", "TopAppBarElevation", c.f62177j, "BottomAppBarElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "nr", "Landroidx/compose/foundation/layout/PaddingValues;", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,741:1\n149#2:742\n149#2:743\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n*L\n437#1:742\n440#1:743\n*E\n"})
public final class AppBarDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AppBarDefaults f21182n = new AppBarDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float TopAppBarElevation = Dp.KN(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float BottomAppBarElevation = Dp.KN(8);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final PaddingValues ContentPadding = PaddingKt.O(AppBarKt.rl, 0.0f, AppBarKt.rl, 0.0f, 10, null);

    public final float n() {
        return BottomAppBarElevation;
    }

    public final PaddingValues rl() {
        return ContentPadding;
    }

    public final float t() {
        return TopAppBarElevation;
    }

    private AppBarDefaults() {
    }
}
