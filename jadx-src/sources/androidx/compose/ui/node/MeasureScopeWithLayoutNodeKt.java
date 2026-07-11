package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.node.LayoutNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "scope", "", "Landroidx/compose/ui/layout/Measurable;", c.f62177j, "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;)Ljava/util/List;", "Landroidx/compose/ui/node/LayoutNode;", "", "rl", "(Landroidx/compose/ui/node/LayoutNode;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n150#2,3:50\n34#2,6:53\n153#2:59\n1#3:60\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:50,3\n32#1:53,6\n32#1:59\n*E\n"})
public final class MeasureScopeWithLayoutNodeKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.f32463t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.f32460n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.f32458O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.f32462r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List n(IntrinsicMeasureScope intrinsicMeasureScope) {
        Intrinsics.checkNotNull(intrinsicMeasureScope, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNode = ((MeasureScopeWithLayoutNode) intrinsicMeasureScope).getLayoutNode();
        boolean zRl = rl(layoutNode);
        List listM7 = layoutNode.M7();
        ArrayList arrayList = new ArrayList(listM7.size());
        int size = listM7.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) listM7.get(i2);
            arrayList.add(zRl ? layoutNode2.v() : layoutNode2.rV9());
        }
        return arrayList;
    }

    private static final boolean rl(LayoutNode layoutNode) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.k().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        if (i2 != 3 && i2 != 4) {
            if (i2 == 5) {
                LayoutNode layoutNodeMYa = layoutNode.mYa();
                if (layoutNodeMYa != null) {
                    return rl(layoutNodeMYa);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }
}
