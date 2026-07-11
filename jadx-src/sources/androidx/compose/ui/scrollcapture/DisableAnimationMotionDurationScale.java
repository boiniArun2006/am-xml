package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.MotionDurationScale;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/scrollcapture/DisableAnimationMotionDurationScale;", "Landroidx/compose/ui/MotionDurationScale;", "<init>", "()V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()F", "scaleFactor", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DisableAnimationMotionDurationScale implements MotionDurationScale {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DisableAnimationMotionDurationScale f33215n = new DisableAnimationMotionDurationScale();

    @Override // androidx.compose.ui.MotionDurationScale
    public float T() {
        return 0.0f;
    }

    private DisableAnimationMotionDurationScale() {
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return MotionDurationScale.DefaultImpls.n(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return MotionDurationScale.DefaultImpls.rl(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return MotionDurationScale.DefaultImpls.t(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return MotionDurationScale.DefaultImpls.nr(this, coroutineContext);
    }
}
