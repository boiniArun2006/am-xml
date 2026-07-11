package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@LayoutScopeMarker
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002'(B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0007R\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J4\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0018\u00010\u0007R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00040#j\b\u0012\u0004\u0012\u00020\u0004`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006)"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "<init>", "()V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "mUb", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "gh", "()Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "Uo", "Landroidx/compose/ui/Modifier;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "Lkotlin/ExtensionFunctionType;", "constrainBlock", "xMQ", "(Landroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "", "J2", "Z", "isAnimateChanges", "()Z", "setAnimateChanges", "(Z)V", "isAnimateChanges$annotations", "Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "referencesObject", "", "KN", "I", "ChildrenStartIndex", "childId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "childrenRefs", "ConstrainAsModifier", "ConstrainedLayoutReferences", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2303:1\n1#2:2304\n*E\n"})
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean isAnimateChanges;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int ChildrenStartIndex;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private ConstrainedLayoutReferences referencesObject;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final ArrayList childrenRefs;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int childId;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "", "Lkotlin/ExtensionFunctionType;", "constrainBlock", "<init>", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "t", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "O", "Lkotlin/jvm/functions/Function1;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,2303:1\n135#2:2304\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier\n*L\n995#1:2304\n*E\n"})
    private static final class ConstrainAsModifier extends InspectorValueInfo implements ParentDataModifier {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final Function1 constrainBlock;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final ConstrainedLayoutReference ref;

        public boolean equals(Object other) {
            Function1 function1 = this.constrainBlock;
            ConstrainAsModifier constrainAsModifier = other instanceof ConstrainAsModifier ? (ConstrainAsModifier) other : null;
            return function1 == (constrainAsModifier != null ? constrainAsModifier.constrainBlock : null);
        }

        public int hashCode() {
            return this.constrainBlock.hashCode();
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public ConstraintLayoutParentData Xw(Density density, Object obj) {
            return new ConstraintLayoutParentData(this.ref, this.constrainBlock);
        }

        public ConstrainAsModifier(final ConstrainedLayoutReference constrainedLayoutReference, final Function1 function1) {
            Function1<InspectorInfo, Unit> function1N;
            if (InspectableValueKt.rl()) {
                function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                        n(inspectorInfo);
                        return Unit.INSTANCE;
                    }

                    public final void n(InspectorInfo inspectorInfo) {
                        inspectorInfo.rl("constrainAs");
                        inspectorInfo.getProperties().n("ref", constrainedLayoutReference);
                        inspectorInfo.getProperties().n("constrainBlock", function1);
                    }
                };
            } else {
                function1N = InspectableValueKt.n();
            }
            super(function1N);
            this.ref = constrainedLayoutReference;
            this.constrainBlock = function1;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "<init>", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", c.f62177j, "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "rl", "t", "nr", "O", "J2", "Uo", "KN", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ConstrainedLayoutReferences {
        public ConstrainedLayoutReferences() {
        }

        public final ConstrainedLayoutReference J2() {
            return ConstraintLayoutScope.this.mUb();
        }

        public final ConstrainedLayoutReference KN() {
            return ConstraintLayoutScope.this.mUb();
        }

        public final ConstrainedLayoutReference O() {
            return ConstraintLayoutScope.this.mUb();
        }

        public final ConstrainedLayoutReference Uo() {
            return ConstraintLayoutScope.this.mUb();
        }

        public final ConstrainedLayoutReference n() {
            return ConstraintLayoutScope.this.mUb();
        }

        public final ConstrainedLayoutReference nr() {
            return ConstraintLayoutScope.this.mUb();
        }

        public final ConstrainedLayoutReference rl() {
            return ConstraintLayoutScope.this.mUb();
        }

        public final ConstrainedLayoutReference t() {
            return ConstraintLayoutScope.this.mUb();
        }
    }

    public ConstraintLayoutScope() {
        super(null);
        this.childId = this.ChildrenStartIndex;
        this.childrenRefs = new ArrayList();
    }

    public final ConstrainedLayoutReferences gh() {
        ConstrainedLayoutReferences constrainedLayoutReferences = this.referencesObject;
        if (constrainedLayoutReferences != null) {
            return constrainedLayoutReferences;
        }
        ConstrainedLayoutReferences constrainedLayoutReferences2 = new ConstrainedLayoutReferences();
        this.referencesObject = constrainedLayoutReferences2;
        return constrainedLayoutReferences2;
    }

    public final ConstrainedLayoutReference mUb() {
        ArrayList arrayList = this.childrenRefs;
        int i2 = this.childId;
        this.childId = i2 + 1;
        ConstrainedLayoutReference constrainedLayoutReference = (ConstrainedLayoutReference) CollectionsKt.getOrNull(arrayList, i2);
        if (constrainedLayoutReference != null) {
            return constrainedLayoutReference;
        }
        ConstrainedLayoutReference constrainedLayoutReference2 = new ConstrainedLayoutReference(Integer.valueOf(this.childId));
        this.childrenRefs.add(constrainedLayoutReference2);
        return constrainedLayoutReference2;
    }

    public final Modifier xMQ(Modifier modifier, ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
        if (this.isAnimateChanges) {
            function1.invoke(new ConstrainScope(constrainedLayoutReference.getId(), rl(constrainedLayoutReference)));
        }
        return modifier.Zmq(new ConstrainAsModifier(constrainedLayoutReference, function1));
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutBaseScope
    public void Uo() {
        super.Uo();
        this.childId = this.ChildrenStartIndex;
    }
}
