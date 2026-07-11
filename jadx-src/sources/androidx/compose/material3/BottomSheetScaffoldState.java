package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/BottomSheetScaffoldState;", "", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V", c.f62177j, "Landroidx/compose/material3/SheetState;", "()Landroidx/compose/material3/SheetState;", "rl", "Landroidx/compose/material3/SnackbarHostState;", "()Landroidx/compose/material3/SnackbarHostState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BottomSheetScaffoldState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SheetState bottomSheetState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SnackbarHostState snackbarHostState;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final SheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    public BottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState) {
        this.bottomSheetState = sheetState;
        this.snackbarHostState = snackbarHostState;
    }
}
