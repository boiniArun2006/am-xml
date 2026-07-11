package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.time.Kw.znsSxz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/constraintlayout/compose/SwipeTouchUp;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;)V", c.f62177j, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "rl", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwipeTouchUp {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SwipeTouchUp f34842t = new SwipeTouchUp("autocomplete");
    private static final SwipeTouchUp nr = new SwipeTouchUp("toStart");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final SwipeTouchUp f34841O = new SwipeTouchUp("toEnd");
    private static final SwipeTouchUp J2 = new SwipeTouchUp("stop");
    private static final SwipeTouchUp Uo = new SwipeTouchUp(znsSxz.symaWfTsgAAIk);
    private static final SwipeTouchUp KN = new SwipeTouchUp("neverCompleteStart");
    private static final SwipeTouchUp xMQ = new SwipeTouchUp("neverCompleteEnd");

    public SwipeTouchUp(String str) {
        this.name = str;
    }
}
