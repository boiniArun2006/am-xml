package androidx.view;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder;", "", "DeepLinkDestination", "PermissiveNavigatorProvider", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavDeepLinkBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkBuilder.kt\nandroidx/navigation/NavDeepLinkBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1#2:399\n*E\n"})
public final class NavDeepLinkBuilder {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DeepLinkDestination {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0004*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider;", "Landroidx/navigation/NavigatorProvider;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "O", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "nr", "Landroidx/navigation/Navigator;", "mDestNavigator", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class PermissiveNavigatorProvider extends NavigatorProvider {

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final Navigator mDestNavigator;

        @Override // androidx.view.NavigatorProvider
        public Navigator O(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            try {
                return super.O(name);
            } catch (IllegalStateException unused) {
                Navigator navigator = this.mDestNavigator;
                Intrinsics.checkNotNull(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }
}
