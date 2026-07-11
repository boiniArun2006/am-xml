package androidx.view.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.NavDestinationBuilder;
import androidx.view.NavDestinationDsl;
import androidx.view.compose.ComposeNavigator;
import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@NavDestinationDsl
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R0\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "nr", "()Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/compose/ComposeNavigator;", "xMQ", "Landroidx/navigation/compose/ComposeNavigator;", "composeNavigator", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "mUb", "Lkotlin/jvm/functions/Function4;", AppLovinEventTypes.USER_VIEWED_CONTENT, "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder<ComposeNavigator.Destination> {

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final Function4 content;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final ComposeNavigator composeNavigator;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.NavDestinationBuilder
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public ComposeNavigator.Destination t() {
        return new ComposeNavigator.Destination(this.composeNavigator, this.content);
    }
}
