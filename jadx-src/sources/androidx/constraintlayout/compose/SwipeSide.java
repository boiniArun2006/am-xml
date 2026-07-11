package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/constraintlayout/compose/SwipeSide;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;)V", c.f62177j, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "rl", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwipeSide {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SwipeSide f34839t = new SwipeSide("top");
    private static final SwipeSide nr = new SwipeSide(TtmlNode.LEFT);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final SwipeSide f34838O = new SwipeSide(TtmlNode.RIGHT);
    private static final SwipeSide J2 = new SwipeSide("bottom");
    private static final SwipeSide Uo = new SwipeSide("middle");
    private static final SwipeSide KN = new SwipeSide(TtmlNode.START);
    private static final SwipeSide xMQ = new SwipeSide(TtmlNode.END);

    public SwipeSide(String str) {
        this.name = str;
    }
}
