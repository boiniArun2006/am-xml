package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0010\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "J2", "(Landroid/view/View;Landroidx/compose/ui/node/LayoutNode;)V", "", "", "Uo", "(I)F", "KN", "(F)F", "type", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "xMQ", "(I)I", "androidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1", c.f62177j, "Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1;", "NoOpScrollConnection", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,737:1\n65#2:738\n69#2:745\n60#3:739\n70#3:746\n22#4,5:740\n22#4,5:747\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt\n*L\n715#1:738\n716#1:745\n715#1:739\n716#1:746\n715#1:740,5\n716#1:747,5\n*E\n"})
public final class AndroidViewHolder_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 f34226n = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float KN(float f3) {
        return f3 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Uo(int i2) {
        return i2 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int xMQ(int i2) {
        return i2 == 0 ? NestedScrollSource.INSTANCE.rl() : NestedScrollSource.INSTANCE.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(View view, LayoutNode layoutNode) {
        long jJ2 = LayoutCoordinatesKt.J2(layoutNode.r());
        int iRound = Math.round(Float.intBitsToFloat((int) (jJ2 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jJ2 & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }
}
