package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.core.view.DragAndDropPermissionsCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", a.f62811a, "", "rl", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V", "Landroid/content/ClipData;", "", c.f62177j, "(Landroid/content/ClipData;)Z", "Landroid/view/View;", "view", "Landroid/app/Activity;", "t", "(Landroid/view/View;)Landroid/app/Activity;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DragAndDropRequestPermission_androidKt {
    private static final boolean n(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            Uri uri = clipData.getItemAt(i2).getUri();
            if (uri != null && Intrinsics.areEqual(uri.getScheme(), AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                return true;
            }
        }
        return false;
    }

    public static final void rl(DelegatableNode delegatableNode, DragAndDropEvent dragAndDropEvent) {
        Activity activityT;
        if (n(DragAndDrop_androidKt.rl(dragAndDropEvent).getClipData()) && delegatableNode.getNode().getIsAttached() && (activityT = t(DelegatableNode_androidKt.n(delegatableNode))) != null) {
            DragAndDropPermissionsCompat.n(activityT, DragAndDrop_androidKt.rl(dragAndDropEvent));
        }
    }

    private static final Activity t(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
