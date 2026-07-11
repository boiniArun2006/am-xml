package androidx.view;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/navigation/Navigation;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/navigation/NavController;", "rl", "(Landroid/view/View;)Landroidx/navigation/NavController;", "controller", "", "O", "(Landroid/view/View;Landroidx/navigation/NavController;)V", "t", "nr", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Navigation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Navigation f40163n = new Navigation();

    public static final void O(View view, NavController controller) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(C1623R.id.f40177n, controller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController nr(View view) {
        Object tag = view.getTag(C1623R.id.f40177n);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    public static final NavController rl(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavController navControllerT = f40163n.t(view);
        if (navControllerT != null) {
            return navControllerT;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final NavController t(View view) {
        return (NavController) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(view, new Function1<View, View>() { // from class: androidx.navigation.Navigation$findViewNavController$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final View invoke(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new Function1<View, NavController>() { // from class: androidx.navigation.Navigation$findViewNavController$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final NavController invoke(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Navigation.f40163n.nr(it);
            }
        }));
    }

    private Navigation() {
    }
}
