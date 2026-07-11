package androidx.compose.material3;

import GJW.C;
import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u00020\f*\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "LGJW/vd;", "scope", "<init>", "(LGJW/vd;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", c.f62177j, "LGJW/vd;", "getScope", "()LGJW/vd;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/Animatable;", "()Landroidx/compose/animation/core/Animatable;", "setAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "animatable", "t", "Ljava/lang/Integer;", "initialOffset", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,774:1\n151#2,3:775\n33#2,4:778\n154#2,2:782\n38#2:784\n156#2:785\n171#2,13:786\n151#2,3:799\n33#2,4:802\n154#2,2:806\n38#2:808\n156#2:809\n171#2,13:810\n171#2,13:823\n1#3:836\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n*L\n354#1:775,3\n354#1:778,4\n354#1:782,2\n354#1:784\n354#1:785\n355#1:786,13\n356#1:799,3\n356#1:802,4\n356#1:806,2\n356#1:808\n356#1:809\n357#1:810,13\n358#1:823,13\n*E\n"})
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final vd scope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Animatable animatable;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Integer initialOffset;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Animatable getAnimatable() {
        return this.animatable;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public MeasureResult rl(final MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        List list2 = (List) list.get(0);
        int i2 = 1;
        List list3 = (List) list.get(1);
        final ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Measurable) list2.get(i3)).dR0(j2));
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i5 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i5);
                    int width2 = ((Placeable) obj4).getWidth();
                    if (width < width2) {
                        obj = obj4;
                        width = width2;
                    }
                    if (i5 == lastIndex) {
                        break;
                    }
                    i5++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        final ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i7 = 0; i7 < size2; i7++) {
            arrayList2.add(((Measurable) list3.get(i7)).dR0(j2));
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int width4 = ((Placeable) obj2).getWidth();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex2) {
                int i8 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i8);
                    int width5 = ((Placeable) obj5).getWidth();
                    if (width4 < width5) {
                        obj2 = obj5;
                        width4 = width5;
                    }
                    if (i8 == lastIndex2) {
                        break;
                    }
                    i8++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer numValueOf = placeable2 != null ? Integer.valueOf(placeable2.getWidth()) : null;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int height = ((Placeable) obj3).getHeight();
            int lastIndex3 = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex3) {
                while (true) {
                    Object obj6 = arrayList2.get(i2);
                    int height2 = ((Placeable) obj6).getHeight();
                    if (height < height2) {
                        obj3 = obj6;
                        height = height2;
                    }
                    if (i2 == lastIndex3) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        int height3 = placeable3 != null ? placeable3.getHeight() : 0;
        SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.f27433n;
        int iMax = Math.max(measureScope.How(segmentedButtonDefaults.KN()), width3) + measureScope.How(SegmentedButtonKt.f27445n) + (numValueOf != null ? numValueOf.intValue() : 0);
        int i9 = width3 == 0 ? (-(measureScope.How(segmentedButtonDefaults.KN()) + measureScope.How(SegmentedButtonKt.f27445n))) / 2 : 0;
        if (this.initialOffset == null) {
            this.initialOffset = Integer.valueOf(i9);
        } else {
            Animatable animatable = this.animatable;
            if (animatable == null) {
                Integer num = this.initialOffset;
                Intrinsics.checkNotNull(num);
                Animatable animatable2 = new Animatable(num, VectorConvertersKt.mUb(IntCompanionObject.INSTANCE), null, null, 12, null);
                this.animatable = animatable2;
                animatable = animatable2;
            }
            if (((Number) animatable.qie()).intValue() != i9) {
                C.nr(this.scope, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i9, null), 3, null);
            }
        }
        final int i10 = height3;
        final int i11 = i9;
        return MeasureScope.ER(measureScope, iMax, i10, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                List list4 = arrayList;
                int i12 = i10;
                int size3 = list4.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    Placeable placeable4 = (Placeable) list4.get(i13);
                    Placeable.PlacementScope.xMQ(placementScope, placeable4, 0, (i12 - placeable4.getHeight()) / 2, 0.0f, 4, null);
                }
                int iHow = measureScope.How(SegmentedButtonDefaults.f27433n.KN()) + measureScope.How(SegmentedButtonKt.f27445n);
                Animatable animatable3 = this.getAnimatable();
                int iIntValue = iHow + (animatable3 != null ? ((Number) animatable3.ty()).intValue() : i11);
                List list5 = arrayList2;
                int i14 = i10;
                int size4 = list5.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    Placeable placeable5 = (Placeable) list5.get(i15);
                    Placeable.PlacementScope.xMQ(placementScope, placeable5, iIntValue, (i14 - placeable5.getHeight()) / 2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public SegmentedButtonContentMeasurePolicy(vd vdVar) {
        this.scope = vdVar;
    }
}
