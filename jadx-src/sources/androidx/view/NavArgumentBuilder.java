package androidx.view;

import androidx.view.NavArgument;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@NavDestinationDsl
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u001c\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u000b\u0010\u0014R*\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0016\u0010\u0014R,\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0010\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/navigation/NavArgumentBuilder;", "", "<init>", "()V", "Landroidx/navigation/NavArgument;", c.f62177j, "()Landroidx/navigation/NavArgument;", "Landroidx/navigation/NavArgument$Builder;", "Landroidx/navigation/NavArgument$Builder;", "builder", "Landroidx/navigation/NavType;", "rl", "Landroidx/navigation/NavType;", "_type", "", "value", "t", "Z", "getNullable", "()Z", "(Z)V", "nullable", "nr", "getUnknownDefaultValuePresent$navigation_common_release", "unknownDefaultValuePresent", "getType", "()Landroidx/navigation/NavType;", "(Landroidx/navigation/NavType;)V", "type", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavArgumentBuilder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final NavArgument.Builder builder = new NavArgument.Builder();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean unknownDefaultValuePresent;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private NavType _type;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean nullable;

    public final NavArgument n() {
        return this.builder.n();
    }

    public final void nr(boolean z2) {
        this.unknownDefaultValuePresent = z2;
        this.builder.O(z2);
    }

    public final void rl(boolean z2) {
        this.nullable = z2;
        this.builder.t(z2);
    }

    public final void t(NavType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._type = value;
        this.builder.nr(value);
    }
}
