package androidx.view;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003 \u0001*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/navigation/NavDestination;", "D", "Landroidx/navigation/NavDeepLinkDslBuilder;", "", c.f62177j, "(Landroidx/navigation/NavDeepLinkDslBuilder;)V"}, k = 3, mv = {1, 8, 0})
public final class NavDestinationBuilder$deepLink$1 extends Lambda implements Function1<NavDeepLinkDslBuilder, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final NavDestinationBuilder$deepLink$1 f40104n = new NavDestinationBuilder$deepLink$1();

    public NavDestinationBuilder$deepLink$1() {
        super(1);
    }

    public final void n(NavDeepLinkDslBuilder deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "$this$deepLink");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
        n(navDeepLinkDslBuilder);
        return Unit.INSTANCE;
    }
}
