package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/MenuDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/PaddingValues;", "rl", "Landroidx/compose/foundation/layout/PaddingValues;", c.f62177j, "()Landroidx/compose/foundation/layout/PaddingValues;", "DropdownMenuItemContentPadding", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,388:1\n149#2:389\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuDefaults\n*L\n264#1:389\n*E\n"})
public final class MenuDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MenuDefaults f22180n = new MenuDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final PaddingValues DropdownMenuItemContentPadding = PaddingKt.rl(MenuKt.f22183t, Dp.KN(0));

    public final PaddingValues n() {
        return DropdownMenuItemContentPadding;
    }

    private MenuDefaults() {
    }
}
