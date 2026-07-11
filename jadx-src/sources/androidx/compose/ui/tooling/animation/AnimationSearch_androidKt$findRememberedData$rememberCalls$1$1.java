package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.data.Group;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/tooling/data/Group;", "call", "", c.f62177j, "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
public final class AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 extends Lambda implements Function1<Group, Boolean> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 f34063n = new AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1();

    public AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(Group group) {
        return Boolean.valueOf(Intrinsics.areEqual(group.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "remember"));
    }
}
