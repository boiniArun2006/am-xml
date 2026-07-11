package androidx.view.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.view.NavDestinationBuilder;
import androidx.view.NavDestinationDsl;
import androidx.view.compose.DialogNavigator;
import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@NavDestinationDsl
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR%\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "nr", "()Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/compose/DialogNavigator;", "xMQ", "Landroidx/navigation/compose/DialogNavigator;", "dialogNavigator", "Landroidx/compose/ui/window/DialogProperties;", "mUb", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "gh", "Lkotlin/jvm/functions/Function3;", AppLovinEventTypes.USER_VIEWED_CONTENT, "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DialogNavigatorDestinationBuilder extends NavDestinationBuilder<DialogNavigator.Destination> {

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Function3 content;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final DialogProperties dialogProperties;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final DialogNavigator dialogNavigator;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.NavDestinationBuilder
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public DialogNavigator.Destination t() {
        return new DialogNavigator.Destination(this.dialogNavigator, this.dialogProperties, this.content);
    }
}
