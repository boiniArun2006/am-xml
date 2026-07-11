package androidx.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/navigation/NamedNavArgument;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/navigation/NavArgument;", "argument", "<init>", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", c.f62177j, "Ljava/lang/String;", "rl", "()Ljava/lang/String;", "Landroidx/navigation/NavArgument;", "()Landroidx/navigation/NavArgument;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NamedNavArgument {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final NavArgument argument;

    public NamedNavArgument(String name, NavArgument argument) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.name = name;
        this.argument = argument;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final NavArgument getArgument() {
        return this.argument;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
