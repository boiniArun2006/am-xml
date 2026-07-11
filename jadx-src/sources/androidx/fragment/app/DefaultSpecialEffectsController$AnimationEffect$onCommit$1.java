package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect$onCommit$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController$AnimationEffect$onCommit$1 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ SpecialEffectsController.Operation f38487n;
    final /* synthetic */ DefaultSpecialEffectsController.AnimationEffect nr;
    final /* synthetic */ ViewGroup rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ View f38488t;

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    DefaultSpecialEffectsController$AnimationEffect$onCommit$1(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, DefaultSpecialEffectsController.AnimationEffect animationEffect) {
        this.f38487n = operation;
        this.rl = viewGroup;
        this.f38488t = view;
        this.nr = animationEffect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(ViewGroup container, View view, DefaultSpecialEffectsController.AnimationEffect this$0) {
        Intrinsics.checkNotNullParameter(container, "$container");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        container.endViewTransition(view);
        this$0.getAnimationInfo().getOperation().O(this$0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        final ViewGroup viewGroup = this.rl;
        final View view = this.f38488t;
        final DefaultSpecialEffectsController.AnimationEffect animationEffect = this.nr;
        viewGroup.post(new Runnable() { // from class: androidx.fragment.app.n
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSpecialEffectsController$AnimationEffect$onCommit$1.rl(viewGroup, view, animationEffect);
            }
        });
        if (FragmentManager.F(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f38487n + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (FragmentManager.F(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f38487n + " has reached onAnimationStart.");
        }
    }
}
