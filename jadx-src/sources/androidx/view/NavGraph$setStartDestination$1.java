package androidx.view;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/navigation/NavDestination;", "startDestination", "", c.f62177j, "(Landroidx/navigation/NavDestination;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
public final class NavGraph$setStartDestination$1 extends Lambda implements Function1<NavDestination, String> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final NavGraph$setStartDestination$1 f40112n = new NavGraph$setStartDestination$1();

    public NavGraph$setStartDestination$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final String invoke(NavDestination startDestination) {
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        String route = startDestination.getRoute();
        Intrinsics.checkNotNull(route);
        return route;
    }
}
