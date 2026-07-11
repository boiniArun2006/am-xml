package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "xMQ", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "Uo", "O", "mUb", c.f62177j, "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "getScope", "()Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "", "Z", "getHasLookaheadOccurred", "()Z", "setHasLookaheadOccurred", "(Z)V", "hasLookaheadOccurred", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,865:1\n150#2,3:866\n34#2,6:869\n153#2:875\n344#2,8:880\n344#2,8:888\n344#2,8:896\n344#2,8:904\n30#3:876\n30#3:878\n80#4:877\n80#4:879\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n793#1:866,3\n793#1:869,6\n793#1:875\n813#1:880,8\n818#1:888,8\n823#1:896,8\n828#1:904,8\n802#1:876\n805#1:878\n802#1:877\n805#1:879\n*E\n"})
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnimatedVisibilityScopeImpl scope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean hasLookaheadOccurred;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeableDR0 = ((Measurable) list.get(i2)).dR0(j2);
            iMax = Math.max(iMax, placeableDR0.getWidth());
            iMax2 = Math.max(iMax2, placeableDR0.getHeight());
            arrayList.add(placeableDR0);
        }
        if (measureScope.Org()) {
            this.hasLookaheadOccurred = true;
            this.scope.getTargetSize().setValue(IntSize.rl(IntSize.t((4294967295L & ((long) iMax2)) | (((long) iMax) << 32))));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.getTargetSize().setValue(IntSize.rl(IntSize.t((4294967295L & ((long) iMax2)) | (((long) iMax) << 32))));
        }
        return MeasureScope.ER(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
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
                List list2 = arrayList;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list2.get(i3), 0, 0, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.scope = animatedVisibilityScopeImpl;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iNxk = ((IntrinsicMeasurable) list.get(0)).Nxk(i2);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iNxk2 = ((IntrinsicMeasurable) list.get(i3)).Nxk(i2);
                if (iNxk2 > iNxk) {
                    iNxk = iNxk2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return iNxk;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int Uo(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iFX = ((IntrinsicMeasurable) list.get(0)).FX(i2);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iFX2 = ((IntrinsicMeasurable) list.get(i3)).FX(i2);
                if (iFX2 > iFX) {
                    iFX = iFX2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return iFX;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int mUb(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iG = ((IntrinsicMeasurable) list.get(0)).g(i2);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iG2 = ((IntrinsicMeasurable) list.get(i3)).g(i2);
                if (iG2 > iG) {
                    iG = iG2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return iG;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int xMQ(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iGR = ((IntrinsicMeasurable) list.get(0)).GR(i2);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iGR2 = ((IntrinsicMeasurable) list.get(i3)).GR(i2);
                if (iGR2 > iGR) {
                    iGR = iGR2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return iGR;
    }
}
