package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/material/SwipeableState;", c.f62177j, "()Landroidx/compose/material/SwipeableState;"}, k = 3, mv = {1, 9, 0})
final class SwipeableKt$rememberSwipeableState$2$1 extends Lambda implements Function0<SwipeableState<Object>> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function1 f23211O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f23212n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f23213t;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final SwipeableState invoke() {
        return new SwipeableState(this.f23212n, this.f23213t, this.f23211O);
    }
}
