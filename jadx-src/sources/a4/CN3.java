package a4;

import androidx.compose.foundation.pager.PagerState;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f12653n;
    private final PagerState rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return Intrinsics.areEqual(this.f12653n, cn3.f12653n) && Intrinsics.areEqual(this.rl, cn3.rl);
    }

    public CN3(List onboardingCards, PagerState indicatorState) {
        Intrinsics.checkNotNullParameter(onboardingCards, "onboardingCards");
        Intrinsics.checkNotNullParameter(indicatorState, "indicatorState");
        this.f12653n = onboardingCards;
        this.rl = indicatorState;
    }

    public int hashCode() {
        return (this.f12653n.hashCode() * 31) + this.rl.hashCode();
    }

    public final PagerState n() {
        return this.rl;
    }

    public final List rl() {
        return this.f12653n;
    }

    public final boolean t() {
        return !this.rl.J2();
    }

    public String toString() {
        return "OnboardingPagerState(onboardingCards=" + this.f12653n + ", indicatorState=" + this.rl + ")";
    }

    public final Object nr(Continuation continuation) {
        if (t()) {
            return Unit.INSTANCE;
        }
        PagerState pagerState = this.rl;
        Object objTy = PagerState.ty(pagerState, pagerState.S() + 1, 0.0f, null, continuation, 6, null);
        if (objTy == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objTy;
        }
        return Unit.INSTANCE;
    }
}
