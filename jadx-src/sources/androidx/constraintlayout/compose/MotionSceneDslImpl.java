package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.interop.proxy.IJavetProxyHandler;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0007J\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 ¨\u0006#"}, d2 = {"Landroidx/constraintlayout/compose/MotionSceneDslImpl;", "Landroidx/constraintlayout/compose/MotionScene;", "", "elementName", IJavetProxyHandler.FUNCTION_NAME_TO_JSON, "", "HI", "(Ljava/lang/String;Ljava/lang/String;)V", "ext", "az", "(Ljava/lang/String;)Ljava/lang/String;", "csName", "Ik", AppMeasurementSdk.ConditionalUserProperty.NAME, "r", "(Ljava/lang/String;)V", "Landroidx/constraintlayout/compose/ConstraintSet;", "t", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/constraintlayout/compose/Transition;", "gh", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/Transition;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", c.f62177j, "Ljava/util/Map;", "constraintSetsByName", "transitionsByName", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MotionSceneDslImpl implements MotionScene {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Map constraintSetsByName;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Map transitionsByName;

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void HI(String elementName, String toJSON) {
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void Ik(String csName, String toJSON) {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MotionSceneDslImpl.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.constraintlayout.compose.MotionSceneDslImpl");
        MotionSceneDslImpl motionSceneDslImpl = (MotionSceneDslImpl) other;
        return Intrinsics.areEqual(this.constraintSetsByName, motionSceneDslImpl.constraintSetsByName) && Intrinsics.areEqual(this.transitionsByName, motionSceneDslImpl.transitionsByName);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void r(String name) {
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public String az(String ext) {
        return "";
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public Transition gh(String name) {
        return (Transition) this.transitionsByName.get(name);
    }

    public int hashCode() {
        return (this.constraintSetsByName.hashCode() * 31) + this.transitionsByName.hashCode();
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public ConstraintSet t(String name) {
        return (ConstraintSet) this.constraintSetsByName.get(name);
    }
}
