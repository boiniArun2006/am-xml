package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/constraintlayout/compose/DslConstraintSet;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/State;", "state", "", "qie", "(Landroidx/constraintlayout/compose/State;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/constraintlayout/compose/ConstraintSetScope;", c.f62177j, "Landroidx/constraintlayout/compose/ConstraintSetScope;", "getScope$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/ConstraintSetScope;", "scope", "Landroidx/constraintlayout/compose/ConstraintSet;", "t", "Landroidx/constraintlayout/compose/ConstraintSet;", "J2", "()Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DslConstraintSet implements DerivedConstraintSet {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ConstraintSetScope scope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ConstraintSet extendFrom;

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    /* JADX INFO: renamed from: J2, reason: from getter */
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    public boolean equals(Object other) {
        if (other instanceof DslConstraintSet) {
            return Intrinsics.areEqual(this.scope, ((DslConstraintSet) other).scope);
        }
        return false;
    }

    public int hashCode() {
        return this.scope.hashCode();
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void qie(State state) {
        this.scope.n(state);
    }
}
