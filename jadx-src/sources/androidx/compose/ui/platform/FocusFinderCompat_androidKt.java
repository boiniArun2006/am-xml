package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.MutableObjectList;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005\u001a1\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0017\u001a\u00020\u0013*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroid/view/View;", "root", "", "direction", "J2", "(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;", TtmlNode.START, "id", "xMQ", "Lkotlin/Function1;", "", "predicate", "Uo", "(Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "childToSkip", "KN", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;", "Landroidx/collection/MutableObjectList;", "views", "", "nr", "(Landroid/view/View;Landroidx/collection/MutableObjectList;I)V", "inTouchMode", "O", "(Landroid/view/View;Landroidx/collection/MutableObjectList;IZ)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat_androidKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,463:1\n260#2:464\n919#3,2:465\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat_androidKt\n*L\n448#1:464\n455#1:465,2\n*E\n"})
public final class FocusFinderCompat_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View J2(final View view, final View view2, int i2) {
        int nextFocusForwardId;
        if (i2 == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return Uo(view2, view, new Function1<View, Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findUserSetNextFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(View view3) {
                    return Boolean.valueOf(FocusFinderCompat_androidKt.xMQ(view2, view3, view3.getNextFocusForwardId()) == view);
                }
            });
        }
        if (i2 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return xMQ(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final View Uo(View view, View view2, Function1 function1) {
        View view3 = null;
        while (true) {
            View viewKN = KN(view2, function1, view3);
            if (viewKN != null || view2 == view) {
                break;
            }
            Object parent = view2.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            View view4 = (View) parent;
            view3 = view2;
            view2 = view4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View xMQ(View view, View view2, final int i2) {
        return Uo(view, view2, new Function1<View, Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(View view3) {
                boolean z2;
                if (view3.getId() == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    private static final View KN(View view, Function1 function1, View view2) {
        View viewKN;
        if (((Boolean) function1.invoke(view)).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != view2 && (viewKN = KN(childAt, function1, view2)) != null) {
                    return viewKN;
                }
            }
            return null;
        }
        return null;
    }

    private static final void O(View view, MutableObjectList mutableObjectList, int i2, boolean z2) {
        if (view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z2 || view.isFocusableInTouchMode())) {
            mutableObjectList.ty(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                O(viewGroup.getChildAt(i3), mutableObjectList, i2, z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(View view, MutableObjectList mutableObjectList, int i2) {
        O(view, mutableObjectList, i2, view.isInTouchMode());
    }
}
