package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.DelegatableNodeKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "O", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier$Node;", "Landroid/view/View;", "Uo", "(Landroidx/compose/ui/Modifier$Node;)Landroid/view/View;", InneractiveMediationNameConsts.OTHER, "", "nr", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "hostView", "embeddedView", "Landroid/graphics/Rect;", "J2", "(Landroidx/compose/ui/focus/FocusOwner;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupNode_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n1#2:276\n*E\n"})
public final class FocusGroupNode_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect J2(FocusOwner focusOwner, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        androidx.compose.ui.geometry.Rect rectIk = focusOwner.Ik();
        if (rectIk == null) {
            return null;
        }
        return new Rect((((int) rectIk.getLeft()) + iArr[0]) - iArr2[0], (((int) rectIk.getTop()) + iArr[1]) - iArr2[1], (((int) rectIk.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()) + iArr[0]) - iArr2[0], (((int) rectIk.xMQ()) + iArr[1]) - iArr2[1]);
    }

    public static final Modifier O(Modifier modifier) {
        return FocusModifierKt.n(FocusModifierKt.n(modifier.Zmq(FocusGroupPropertiesElement.f34254n)).Zmq(FocusTargetPropertiesElement.f34259n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View Uo(Modifier.Node node) {
        View viewFX = DelegatableNodeKt.HI(node.getNode()).FX();
        if (viewFX != null) {
            return viewFX;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }
}
