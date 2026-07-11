package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/core/KeyframeBaseEntity;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "value", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", c.f62177j, "Ljava/lang/Object;", "rl", "()Ljava/lang/Object;", "Landroidx/compose/animation/core/Easing;", "()Landroidx/compose/animation/core/Easing;", "t", "(Landroidx/compose/animation/core/Easing;)V", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class KeyframeBaseEntity<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Easing easing;

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, easing);
    }

    private KeyframeBaseEntity(Object obj, Easing easing) {
        this.value = obj;
        this.easing = easing;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Easing getEasing() {
        return this.easing;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final void t(Easing easing) {
        this.easing = easing;
    }
}
