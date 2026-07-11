package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@InternalComposeApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R7\u0010\f\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/MovableContent;", "P", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "", "Landroidx/compose/runtime/Composable;", c.f62177j, "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", AppLovinEventTypes.USER_VIEWED_CONTENT, "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MovableContent<P> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function3 content;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Function3 getContent() {
        return this.content;
    }
}
