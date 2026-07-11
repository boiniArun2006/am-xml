package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutIdParentData;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "", "Lkotlin/ExtensionFunctionType;", "constrain", "<init>", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", c.f62177j, "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "rl", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "t", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "O", "Ljava/lang/Object;", "uG", "()Ljava/lang/Object;", "layoutId", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ConstraintLayoutParentData implements LayoutIdParentData {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Object layoutId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ConstrainedLayoutReference ref;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function1 constrain;

    public boolean equals(Object other) {
        if (!(other instanceof ConstraintLayoutParentData)) {
            return false;
        }
        ConstraintLayoutParentData constraintLayoutParentData = (ConstraintLayoutParentData) other;
        return Intrinsics.areEqual(this.ref.getId(), constraintLayoutParentData.ref.getId()) && this.constrain == constraintLayoutParentData.constrain;
    }

    public int hashCode() {
        return (this.ref.getId().hashCode() * 31) + this.constrain.hashCode();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Function1 getConstrain() {
        return this.constrain;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final ConstrainedLayoutReference getRef() {
        return this.ref;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    /* JADX INFO: renamed from: uG, reason: from getter */
    public Object getLayoutId() {
        return this.layoutId;
    }

    public ConstraintLayoutParentData(ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
        this.ref = constrainedLayoutReference;
        this.constrain = function1;
        this.layoutId = constrainedLayoutReference.getId();
    }
}
