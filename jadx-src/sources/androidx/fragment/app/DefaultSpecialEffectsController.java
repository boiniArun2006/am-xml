package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import androidx.media3.database.Kr.FlTC;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.BackEventCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\b%&'()*+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ9\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$¨\u0006-"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operations", "", "s7N", "(Ljava/util/List;)V", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animationInfos", "e", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "transitionInfos", "", "isPop", "firstOut", "lastIn", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Ljava/util/List;ZLandroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "Landroidx/collection/ArrayMap;", "", "Landroid/view/View;", "", "names", "nHg", "(Landroidx/collection/ArrayMap;Ljava/util/Collection;)V", "", "namedViews", "view", "N", "(Ljava/util/Map;Landroid/view/View;)V", "nr", "(Ljava/util/List;Z)V", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1176:1\n288#2,2:1177\n533#2,6:1179\n1360#2:1185\n1446#2,5:1186\n819#2:1191\n847#2,2:1192\n766#2:1194\n857#2,2:1195\n1789#2,3:1197\n1726#2,3:1200\n1855#2,2:1203\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n55#1:1177,2\n61#1:1179,6\n120#1:1185\n120#1:1186,5\n193#1:1191\n193#1:1192,2\n196#1:1194\n196#1:1195,2\n200#1:1197,3\n358#1:1200,3\n369#1:1203,2\n*E\n"})
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animationInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "", "nr", "(Landroid/view/ViewGroup;)V", "t", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "KN", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class AnimationEffect extends SpecialEffectsController.Effect {

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final AnimationInfo animationInfo;

        public AnimationEffect(AnimationInfo animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        /* JADX INFO: renamed from: KN, reason: from getter */
        public final AnimationInfo getAnimationInfo() {
            return this.animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void nr(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animationInfo.rl()) {
                this.animationInfo.getOperation().O(this);
                return;
            }
            Context context = container.getContext();
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            AnimationInfo animationInfo = this.animationInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animationOrAnimatorT = animationInfo.t(context);
            if (animationOrAnimatorT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = animationOrAnimatorT.f38542n;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                view.startAnimation(animation);
                this.animationInfo.getOperation().O(this);
                return;
            }
            container.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation, container, view);
            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$AnimationEffect$onCommit$1(operation, container, view, this));
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void t(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().O(this);
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", FlTC.EcX + operation + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "t", "(Landroid/content/Context;)Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "rl", "Z", "isAnimLoaded", "nr", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "animation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class AnimationInfo extends SpecialEffectsInfo {

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private FragmentAnim.AnimationOrAnimator animation;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final boolean isPop;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean isAnimLoaded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, boolean z2) {
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.isPop = z2;
        }

        public final FragmentAnim.AnimationOrAnimator t(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorRl = FragmentAnim.rl(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorRl;
            this.isAnimLoaded = true;
            return animationOrAnimatorRl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animatorInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "", "J2", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/BackEventCompat;", "backEvent", "O", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "nr", "t", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "KN", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "animator", "", "rl", "()Z", "isSeekingSupported", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class AnimatorEffect extends SpecialEffectsController.Effect {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private AnimatorSet animator;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final AnimationInfo animatorInfo;

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* JADX INFO: renamed from: rl */
        public boolean getIsSeekingSupported() {
            return true;
        }

        public AnimatorEffect(AnimationInfo animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void J2(final ViewGroup container) {
            final AnimatorEffect animatorEffect;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animatorInfo.rl()) {
                return;
            }
            Context context = container.getContext();
            AnimationInfo animationInfo = this.animatorInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animationOrAnimatorT = animationInfo.t(context);
            this.animator = animationOrAnimatorT != null ? animationOrAnimatorT.rl : null;
            final SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            final boolean z2 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
            final View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator anim) {
                        Intrinsics.checkNotNullParameter(anim, "anim");
                        container.endViewTransition(view);
                        if (z2) {
                            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                            View viewToAnimate = view;
                            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                            finalState.rl(viewToAnimate, container);
                        }
                        animatorEffect.getAnimatorInfo().getOperation().O(animatorEffect);
                        if (FragmentManager.F(2)) {
                            Log.v("FragmentManager", "Animator from operation " + operation + " has ended.");
                        }
                    }
                });
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        /* JADX INFO: renamed from: KN, reason: from getter */
        public final AnimationInfo getAnimatorInfo() {
            return this.animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void O(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().O(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                return;
            }
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long jN = Api24Impl.f38494n.n(animatorSet);
            long progress = (long) (backEvent.getProgress() * jN);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == jN) {
                progress = jN - 1;
            }
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            Api26Impl.f38495n.rl(animatorSet, progress);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void nr(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().O(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void t(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().O(this);
                return;
            }
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            if (!operation.getIsSeeking()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                Api26Impl.f38495n.n(animatorSet);
            }
            if (FragmentManager.F(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(operation);
                sb.append(" has been canceled");
                sb.append(operation.getIsSeeking() ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api24Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api24Impl f38494n = new Api24Impl();

        @DoNotInline
        public final long n(AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }

        private Api24Impl() {
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/animation/AnimatorSet;)V", "", "time", "rl", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api26Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api26Impl f38495n = new Api26Impl();

        @DoNotInline
        public final void n(AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        @DoNotInline
        public final void rl(AnimatorSet animatorSet, long time) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }

        private Api26Impl() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/fragment/app/SpecialEffectsController$Operation;", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "rl", "()Z", "isVisibilityUnchanged", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SpecialEffectsInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final boolean rl() {
            View view = this.operation.getFragment().mView;
            SpecialEffectsController.Operation.State stateN = view != null ? SpecialEffectsController.Operation.State.INSTANCE.n(view) : null;
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (stateN == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateN == state || finalState == state) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bP\u0010KR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\b\u0019\u0010SR\u001d\u0010[\u001a\u00020T8\u0006¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR$\u0010`\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010?\u001a\u0004\b]\u0010A\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u00107\u001a\u0004\ba\u0010S\"\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010SR\u0011\u0010h\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bg\u0010S¨\u0006i"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "transitionInfos", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "firstOut", "lastIn", "Landroidx/fragment/app/FragmentTransitionImpl;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Landroidx/collection/ArrayMap;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/FragmentTransitionImpl;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;Z)V", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Lkotlin/Pair;", "HI", "(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)Lkotlin/Pair;", "enteringViews", "Lkotlin/Function0;", "", "executeTransition", "te", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "transitioningViews", "view", "ty", "(Ljava/util/ArrayList;Landroid/view/View;)V", "J2", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/BackEventCompat;", "backEvent", "O", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "nr", "t", "Ljava/util/List;", "WPU", "()Ljava/util/List;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "Z", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "XQ", "Uo", "Landroidx/fragment/app/FragmentTransitionImpl;", "S", "()Landroidx/fragment/app/FragmentTransitionImpl;", "KN", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "xMQ", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "mUb", "getSharedElementLastInViews", "gh", "Landroidx/collection/ArrayMap;", "getSharedElementNameMapping", "()Landroidx/collection/ArrayMap;", "qie", "getEnteringNames", "az", "getExitingNames", "getFirstOutViews", "getLastInViews", "ck", "()Z", "Landroidx/core/os/CancellationSignal;", "Ik", "Landroidx/core/os/CancellationSignal;", "getTransitionSignal", "()Landroidx/core/os/CancellationSignal;", "getTransitionSignal$annotations", "()V", "transitionSignal", "r", "o", "iF", "(Ljava/lang/Object;)V", "controller", "getNoControllerReturned", "fD", "(Z)V", "noControllerReturned", "rl", "isSeekingSupported", "aYN", "transitioning", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1176:1\n1726#2,3:1177\n1726#2,3:1180\n1855#2,2:1183\n1549#2:1185\n1620#2,3:1186\n1855#2,2:1189\n1855#2,2:1192\n1549#2:1194\n1620#2,3:1195\n1855#2,2:1198\n1#3:1191\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n*L\n726#1:1177,3\n735#1:1180,3\n743#1:1183,2\n772#1:1185\n772#1:1186,3\n772#1:1189,2\n857#1:1192,2\n889#1:1194\n889#1:1195,3\n889#1:1198,2\n*E\n"})
    static final class TransitionEffect extends SpecialEffectsController.Effect {

        /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
        private final ArrayMap lastInViews;

        /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
        private final CancellationSignal transitionSignal;

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final SpecialEffectsController.Operation lastIn;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private final Object sharedElementTransition;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final SpecialEffectsController.Operation firstOut;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private final FragmentTransitionImpl transitionImpl;

        /* JADX INFO: renamed from: az, reason: from kotlin metadata */
        private final ArrayList exitingNames;

        /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
        private final boolean isPop;

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
        private final ArrayMap sharedElementNameMapping;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private final ArrayList sharedElementLastInViews;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final List transitionInfos;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private boolean noControllerReturned;

        /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
        private final ArrayList enteringNames;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private Object controller;

        /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
        private final ArrayMap firstOutViews;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private final ArrayList sharedElementFirstOutViews;

        private final Pair HI(ViewGroup container, SpecialEffectsController.Operation lastIn, final SpecialEffectsController.Operation firstOut) {
            final SpecialEffectsController.Operation operation = lastIn;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            Iterator it = this.transitionInfos.iterator();
            boolean z2 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((TransitionInfo) it.next()).Uo() && firstOut != null && operation != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    FragmentTransition.n(operation.getFragment(), firstOut.getFragment(), this.isPop, this.firstOutViews, true);
                    OneShotPreDrawListener.n(container, new Runnable() { // from class: androidx.fragment.app.Wre
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.ck(operation, firstOut, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        Object obj = this.exitingNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(obj, "exitingNames[0]");
                        view2 = (View) this.firstOutViews.get((String) obj);
                        this.transitionImpl.S(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        Object obj2 = this.enteringNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(obj2, "enteringNames[0]");
                        final View view3 = (View) this.lastInViews.get((String) obj2);
                        if (view3 != null) {
                            final FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                            OneShotPreDrawListener.n(container, new Runnable() { // from class: androidx.fragment.app.CN3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.Ik(fragmentTransitionImpl, view3, rect);
                                }
                            });
                            z2 = true;
                        }
                    }
                    this.transitionImpl.nY(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    FragmentTransitionImpl fragmentTransitionImpl2 = this.transitionImpl;
                    Object obj3 = this.sharedElementTransition;
                    fragmentTransitionImpl2.o(obj3, null, null, null, null, obj3, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.transitionInfos.iterator();
            Object objCk = null;
            Object objCk2 = null;
            while (it2.hasNext()) {
                TransitionInfo transitionInfo = (TransitionInfo) it2.next();
                SpecialEffectsController.Operation operation2 = transitionInfo.getOperation();
                boolean z3 = z2;
                Object objKN = this.transitionImpl.KN(transitionInfo.getTransition());
                if (objKN != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = it2;
                    View view4 = operation2.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                    ty(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation2 == firstOut || operation2 == operation)) {
                        if (operation2 == firstOut) {
                            arrayList2.removeAll(CollectionsKt.toSet(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(CollectionsKt.toSet(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.n(objKN, view);
                    } else {
                        this.transitionImpl.rl(objKN, arrayList2);
                        this.transitionImpl.o(objKN, objKN, arrayList2, null, null, null, null);
                        if (operation2.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation2.Ik(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(operation2.getFragment().mView);
                            this.transitionImpl.r(objKN, operation2.getFragment().mView, arrayList3);
                            OneShotPreDrawListener.n(container, new Runnable() { // from class: androidx.fragment.app.fuX
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation2.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z3) {
                            this.transitionImpl.XQ(objKN, rect);
                        }
                        if (FragmentManager.F(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objKN);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (Object transitioningViews : arrayList2) {
                                Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                            }
                        }
                    } else {
                        this.transitionImpl.S(objKN, view2);
                        if (FragmentManager.F(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objKN);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (Object transitioningViews2 : arrayList2) {
                                Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                            }
                        }
                    }
                    if (transitionInfo.getIsOverlapAllowed()) {
                        objCk = this.transitionImpl.ck(objCk, objKN, null);
                    } else {
                        objCk2 = this.transitionImpl.ck(objCk2, objKN, null);
                    }
                    operation = lastIn;
                    z2 = z3;
                    it2 = it3;
                } else {
                    operation = lastIn;
                    z2 = z3;
                }
            }
            Object objHI = this.transitionImpl.HI(objCk, objCk2, this.sharedElementTransition);
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objHI + " for container " + container);
            }
            return new Pair(arrayList, objHI);
        }

        private final void te(ArrayList enteringViews, ViewGroup container, Function0 executeTransition) {
            FragmentTransition.O(enteringViews, 4);
            ArrayList arrayListIk = this.transitionImpl.Ik(this.sharedElementLastInViews);
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (Object sharedElementFirstOutViews : this.sharedElementFirstOutViews) {
                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = (View) sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + ViewCompat.N(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (Object sharedElementLastInViews : this.sharedElementLastInViews) {
                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = (View) sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + ViewCompat.N(view2));
                }
            }
            executeTransition.invoke();
            this.transitionImpl.ViF(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListIk, this.sharedElementNameMapping);
            FragmentTransition.O(enteringViews, 0);
            this.transitionImpl.g(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        public TransitionEffect(List transitionInfos, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, FragmentTransitionImpl transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, ArrayMap sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, ArrayMap firstOutViews, ArrayMap lastInViews, boolean z2) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = operation;
            this.lastIn = operation2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z2;
            this.transitionSignal = new CancellationSignal();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Ik(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
            Intrinsics.checkNotNullParameter(impl, "$impl");
            Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.gh(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ViF(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.O(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ck(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, TransitionEffect this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            FragmentTransition.n(operation.getFragment(), operation2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.O(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void nY(Ref.ObjectRef seekCancelLambda) {
            Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
            Function0 function0 = (Function0) seekCancelLambda.element;
            if (function0 != null) {
                function0.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList transitioningViews) {
            Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
            FragmentTransition.O(transitioningViews, 4);
        }

        private final void ty(ArrayList transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.t(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = viewGroup.getChildAt(i2);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    ty(transitioningViews, child);
                }
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void J2(final ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((TransitionInfo) it.next()).getOperation();
                    if (FragmentManager.F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (aYN() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (getIsSeekingSupported() && aYN()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Pair pairHI = HI(container, this.lastIn, this.firstOut);
                ArrayList arrayList = (ArrayList) pairHI.component1();
                final Object objComponent2 = pairHI.component2();
                List list = this.transitionInfos;
                ArrayList<SpecialEffectsController.Operation> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((TransitionInfo) it2.next()).getOperation());
                }
                for (final SpecialEffectsController.Operation operation2 : arrayList2) {
                    this.transitionImpl.aYN(operation2.getFragment(), objComponent2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.w6
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.nY(objectRef);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.Ml
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.g(operation2, this);
                        }
                    });
                }
                te(arrayList, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4

                    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1176:1\n1726#2,3:1177\n1855#2,2:1180\n1855#2,2:1182\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1\n*L\n806#1:1177,3\n811#1:1180,2\n836#1:1182,2\n*E\n"})
                    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ ViewGroup f38506O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect f38507n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ Object f38508t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj, ViewGroup viewGroup) {
                            super(0);
                            this.f38507n = transitionEffect;
                            this.f38508t = obj;
                            this.f38506O = viewGroup;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void nr(DefaultSpecialEffectsController.TransitionEffect this$0) {
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (FragmentManager.F(2)) {
                                Log.v("FragmentManager", "Transition for all operations has completed");
                            }
                            Iterator it = this$0.getTransitionInfos().iterator();
                            while (it.hasNext()) {
                                ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().O(this$0);
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void t(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(container, "$container");
                            Iterator it = this$0.getTransitionInfos().iterator();
                            while (it.hasNext()) {
                                SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation();
                                View view = operation.getFragment().getView();
                                if (view != null) {
                                    operation.getFinalState().rl(view, container);
                                }
                            }
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            List transitionInfos = this.f38507n.getTransitionInfos();
                            if (transitionInfos == null || !transitionInfos.isEmpty()) {
                                Iterator it = transitionInfos.iterator();
                                while (it.hasNext()) {
                                    if (!((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().getIsSeeking()) {
                                        if (FragmentManager.F(2)) {
                                            Log.v("FragmentManager", "Completing animating immediately");
                                        }
                                        CancellationSignal cancellationSignal = new CancellationSignal();
                                        FragmentTransitionImpl transitionImpl = this.f38507n.getTransitionImpl();
                                        Fragment fragment = ((DefaultSpecialEffectsController.TransitionInfo) this.f38507n.getTransitionInfos().get(0)).getOperation().getFragment();
                                        Object obj = this.f38508t;
                                        final DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.f38507n;
                                        transitionImpl.WPU(fragment, obj, cancellationSignal, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0060: INVOKE 
                                              (r1v2 'transitionImpl' androidx.fragment.app.FragmentTransitionImpl)
                                              (r2v6 'fragment' androidx.fragment.app.Fragment)
                                              (r3v6 'obj' java.lang.Object)
                                              (r0v4 'cancellationSignal' androidx.core.os.CancellationSignal)
                                              (wrap:java.lang.Runnable:0x005d: CONSTRUCTOR (r4v0 'transitionEffect' androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect A[DONT_INLINE]) A[MD:(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void (m), WRAPPED] call: androidx.fragment.app.aC.<init>(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void type: CONSTRUCTOR)
                                             VIRTUAL call: androidx.fragment.app.FragmentTransitionImpl.WPU(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void A[MD:(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void (m)] in method: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1.invoke():void, file: /content/repo2/apk-analysis/Alight motion /classes3.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.fragment.app.aC, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 35 more
                                            */
                                        /*
                                            this = this;
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.f38507n
                                            java.util.List r0 = r0.getTransitionInfos()
                                            java.lang.String r1 = "FragmentManager"
                                            r2 = 2
                                            if (r0 == 0) goto L12
                                            boolean r3 = r0.isEmpty()
                                            if (r3 == 0) goto L12
                                            goto L67
                                        L12:
                                            java.util.Iterator r0 = r0.iterator()
                                        L16:
                                            boolean r3 = r0.hasNext()
                                            if (r3 == 0) goto L67
                                            java.lang.Object r3 = r0.next()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r3 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r3
                                            androidx.fragment.app.SpecialEffectsController$Operation r3 = r3.getOperation()
                                            boolean r3 = r3.getIsSeeking()
                                            if (r3 != 0) goto L16
                                            boolean r0 = androidx.fragment.app.FragmentManager.F(r2)
                                            if (r0 == 0) goto L37
                                            java.lang.String r0 = "Completing animating immediately"
                                            android.util.Log.v(r1, r0)
                                        L37:
                                            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
                                            r0.<init>()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.f38507n
                                            androidx.fragment.app.FragmentTransitionImpl r1 = r1.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.f38507n
                                            java.util.List r2 = r2.getTransitionInfos()
                                            r3 = 0
                                            java.lang.Object r2 = r2.get(r3)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
                                            androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                                            androidx.fragment.app.Fragment r2 = r2.getFragment()
                                            java.lang.Object r3 = r6.f38508t
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r4 = r6.f38507n
                                            androidx.fragment.app.aC r5 = new androidx.fragment.app.aC
                                            r5.<init>(r4)
                                            r1.WPU(r2, r3, r0, r5)
                                            r0.n()
                                            return
                                        L67:
                                            boolean r0 = androidx.fragment.app.FragmentManager.F(r2)
                                            if (r0 == 0) goto L72
                                            java.lang.String r0 = "Animating to start"
                                            android.util.Log.v(r1, r0)
                                        L72:
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.f38507n
                                            androidx.fragment.app.FragmentTransitionImpl r0 = r0.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.f38507n
                                            java.lang.Object r1 = r1.getController()
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.f38507n
                                            android.view.ViewGroup r3 = r6.f38506O
                                            androidx.fragment.app.Dsr r4 = new androidx.fragment.app.Dsr
                                            r4.<init>(r2, r3)
                                            r0.nr(r1, r4)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass1.invoke2():void");
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1] */
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (FragmentManager.F(2)) {
                                        Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                                    }
                                    DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.f38504n;
                                    transitionEffect.iF(transitionEffect.getTransitionImpl().mUb(container, objComponent2));
                                    if (this.f38504n.getController() == null) {
                                        if (FragmentManager.F(2)) {
                                            Log.v("FragmentManager", "TransitionSeekController was not created.");
                                        }
                                        this.f38504n.fD(true);
                                        return;
                                    }
                                    objectRef.element = new AnonymousClass1(this.f38504n, objComponent2, container);
                                    if (FragmentManager.F(2)) {
                                        Log.v("FragmentManager", "Started executing operations from " + this.f38504n.getFirstOut() + " to " + this.f38504n.getLastIn());
                                    }
                                }
                            });
                        }
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public void O(BackEventCompat backEvent, ViewGroup container) {
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        Intrinsics.checkNotNullParameter(container, "container");
                        Object obj = this.controller;
                        if (obj != null) {
                            this.transitionImpl.Z(obj, backEvent.getProgress());
                        }
                    }

                    /* JADX INFO: renamed from: S, reason: from getter */
                    public final FragmentTransitionImpl getTransitionImpl() {
                        return this.transitionImpl;
                    }

                    /* JADX INFO: renamed from: WPU, reason: from getter */
                    public final List getTransitionInfos() {
                        return this.transitionInfos;
                    }

                    /* JADX INFO: renamed from: XQ, reason: from getter */
                    public final SpecialEffectsController.Operation getLastIn() {
                        return this.lastIn;
                    }

                    /* JADX INFO: renamed from: Z, reason: from getter */
                    public final SpecialEffectsController.Operation getFirstOut() {
                        return this.firstOut;
                    }

                    public final boolean aYN() {
                        List list = this.transitionInfos;
                        if (list != null && list.isEmpty()) {
                            return true;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!((TransitionInfo) it.next()).getOperation().getFragment().mTransitioning) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public final void fD(boolean z2) {
                        this.noControllerReturned = z2;
                    }

                    public final void iF(Object obj) {
                        this.controller = obj;
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public void nr(final ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        if (!container.isLaidOut() || this.noControllerReturned) {
                            for (TransitionInfo transitionInfo : this.transitionInfos) {
                                SpecialEffectsController.Operation operation = transitionInfo.getOperation();
                                if (FragmentManager.F(2)) {
                                    if (this.noControllerReturned) {
                                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + operation);
                                    } else {
                                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                                    }
                                }
                                transitionInfo.getOperation().O(this);
                            }
                            this.noControllerReturned = false;
                            return;
                        }
                        Object obj = this.controller;
                        if (obj != null) {
                            FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                            Intrinsics.checkNotNull(obj);
                            fragmentTransitionImpl.t(obj);
                            if (FragmentManager.F(2)) {
                                Log.v("FragmentManager", "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                                return;
                            }
                            return;
                        }
                        Pair pairHI = HI(container, this.lastIn, this.firstOut);
                        ArrayList arrayList = (ArrayList) pairHI.component1();
                        final Object objComponent2 = pairHI.component2();
                        List list = this.transitionInfos;
                        ArrayList<SpecialEffectsController.Operation> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((TransitionInfo) it.next()).getOperation());
                        }
                        for (final SpecialEffectsController.Operation operation2 : arrayList2) {
                            this.transitionImpl.WPU(operation2.getFragment(), objComponent2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.I28
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.ViF(operation2, this);
                                }
                            });
                        }
                        te(arrayList, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                this.f38501n.getTransitionImpl().O(container, objComponent2);
                            }
                        });
                        if (FragmentManager.F(2)) {
                            Log.v("FragmentManager", "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
                        }
                    }

                    /* JADX INFO: renamed from: o, reason: from getter */
                    public final Object getController() {
                        return this.controller;
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    /* JADX INFO: renamed from: rl */
                    public boolean getIsSeekingSupported() {
                        if (!this.transitionImpl.az()) {
                            return false;
                        }
                        List<TransitionInfo> list = this.transitionInfos;
                        if (list == null || !list.isEmpty()) {
                            for (TransitionInfo transitionInfo : list) {
                                if (Build.VERSION.SDK_INT < 34 || transitionInfo.getTransition() == null || !this.transitionImpl.ty(transitionInfo.getTransition())) {
                                    return false;
                                }
                            }
                        }
                        Object obj = this.sharedElementTransition;
                        return obj == null || this.transitionImpl.ty(obj);
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public void t(ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        this.transitionSignal.n();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V", "", "transition", "Landroidx/fragment/app/FragmentTransitionImpl;", "nr", "(Ljava/lang/Object;)Landroidx/fragment/app/FragmentTransitionImpl;", "Uo", "()Z", "rl", "Ljava/lang/Object;", "J2", "()Ljava/lang/Object;", "t", "Z", "KN", "isOverlapAllowed", "O", "sharedElementTransition", "()Landroidx/fragment/app/FragmentTransitionImpl;", "handlingImpl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                static final class TransitionInfo extends SpecialEffectsInfo {

                    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
                    private final Object sharedElementTransition;

                    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
                    private final Object transition;

                    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
                    private final boolean isOverlapAllowed;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public TransitionInfo(SpecialEffectsController.Operation operation, boolean z2, boolean z3) {
                        Object returnTransition;
                        super(operation);
                        Intrinsics.checkNotNullParameter(operation, "operation");
                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                        SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
                        if (finalState == state) {
                            Fragment fragment = operation.getFragment();
                            returnTransition = z2 ? fragment.getReenterTransition() : fragment.getEnterTransition();
                        } else {
                            Fragment fragment2 = operation.getFragment();
                            returnTransition = z2 ? fragment2.getReturnTransition() : fragment2.getExitTransition();
                        }
                        this.transition = returnTransition;
                        this.isOverlapAllowed = operation.getFinalState() == state ? z2 ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
                        this.sharedElementTransition = z3 ? z2 ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
                    }

                    private final FragmentTransitionImpl nr(Object transition) {
                        if (transition == null) {
                            return null;
                        }
                        FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
                        if (fragmentTransitionImpl != null && fragmentTransitionImpl.Uo(transition)) {
                            return fragmentTransitionImpl;
                        }
                        FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
                        if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.Uo(transition)) {
                            return fragmentTransitionImpl2;
                        }
                        throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
                    }

                    /* JADX INFO: renamed from: J2, reason: from getter */
                    public final Object getTransition() {
                        return this.transition;
                    }

                    /* JADX INFO: renamed from: KN, reason: from getter */
                    public final boolean getIsOverlapAllowed() {
                        return this.isOverlapAllowed;
                    }

                    /* JADX INFO: renamed from: O, reason: from getter */
                    public final Object getSharedElementTransition() {
                        return this.sharedElementTransition;
                    }

                    public final boolean Uo() {
                        return this.sharedElementTransition != null;
                    }

                    public final FragmentTransitionImpl t() {
                        FragmentTransitionImpl fragmentTransitionImplNr = nr(this.transition);
                        FragmentTransitionImpl fragmentTransitionImplNr2 = nr(this.sharedElementTransition);
                        if (fragmentTransitionImplNr == null || fragmentTransitionImplNr2 == null || fragmentTransitionImplNr == fragmentTransitionImplNr2) {
                            return fragmentTransitionImplNr == null ? fragmentTransitionImplNr2 : fragmentTransitionImplNr;
                        }
                        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DefaultSpecialEffectsController(ViewGroup container) {
                    super(container);
                    Intrinsics.checkNotNullParameter(container, "container");
                }

                private final void T(List transitionInfos, boolean isPop, SpecialEffectsController.Operation firstOut, SpecialEffectsController.Operation lastIn) {
                    Iterator it;
                    ArrayList arrayList;
                    FragmentTransitionImpl fragmentTransitionImpl;
                    ArrayList arrayList2;
                    ArrayList arrayList3;
                    Object obj;
                    int i2;
                    String strRl;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : transitionInfos) {
                        if (!((TransitionInfo) obj2).rl()) {
                            arrayList4.add(obj2);
                        }
                    }
                    ArrayList<TransitionInfo> arrayList5 = new ArrayList();
                    for (Object obj3 : arrayList4) {
                        if (((TransitionInfo) obj3).t() != null) {
                            arrayList5.add(obj3);
                        }
                    }
                    FragmentTransitionImpl fragmentTransitionImpl2 = null;
                    Object obj4 = null;
                    for (TransitionInfo transitionInfo : arrayList5) {
                        FragmentTransitionImpl fragmentTransitionImplT = transitionInfo.t();
                        if (fragmentTransitionImpl2 != null && fragmentTransitionImplT != fragmentTransitionImpl2) {
                            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
                        }
                        fragmentTransitionImpl2 = fragmentTransitionImplT;
                    }
                    if (fragmentTransitionImpl2 == null) {
                        return;
                    }
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayMap arrayMap = new ArrayMap();
                    ArrayList<String> arrayList8 = new ArrayList<>();
                    ArrayList<String> arrayList9 = new ArrayList<>();
                    ArrayMap arrayMap2 = new ArrayMap();
                    ArrayMap arrayMap3 = new ArrayMap();
                    ArrayList<String> sharedElementTargetNames = arrayList8;
                    Iterator it2 = arrayList5.iterator();
                    ArrayList<String> sharedElementSourceNames = arrayList9;
                    while (it2.hasNext()) {
                        TransitionInfo transitionInfo2 = (TransitionInfo) it2.next();
                        if (!transitionInfo2.Uo() || firstOut == null || lastIn == null) {
                            it = it2;
                            arrayList = arrayList5;
                            fragmentTransitionImpl = fragmentTransitionImpl2;
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                        } else {
                            Object objTe = fragmentTransitionImpl2.te(fragmentTransitionImpl2.KN(transitionInfo2.getSharedElementTransition()));
                            sharedElementSourceNames = lastIn.getFragment().getSharedElementSourceNames();
                            Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementSourceNames2 = firstOut.getFragment().getSharedElementSourceNames();
                            Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementTargetNames2 = firstOut.getFragment().getSharedElementTargetNames();
                            Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                            int size = sharedElementTargetNames2.size();
                            it = it2;
                            arrayList = arrayList5;
                            int i3 = 0;
                            while (i3 < size) {
                                FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
                                int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i3));
                                if (iIndexOf != -1) {
                                    sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i3));
                                }
                                i3++;
                                fragmentTransitionImpl2 = fragmentTransitionImpl3;
                            }
                            fragmentTransitionImpl = fragmentTransitionImpl2;
                            sharedElementTargetNames = lastIn.getFragment().getSharedElementTargetNames();
                            Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                            Pair pair = !isPop ? TuplesKt.to(firstOut.getFragment().getExitTransitionCallback(), lastIn.getFragment().getEnterTransitionCallback()) : TuplesKt.to(firstOut.getFragment().getEnterTransitionCallback(), lastIn.getFragment().getExitTransitionCallback());
                            SharedElementCallback sharedElementCallback = (SharedElementCallback) pair.component1();
                            SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.component2();
                            int size2 = sharedElementSourceNames.size();
                            int i5 = 0;
                            while (true) {
                                arrayList2 = arrayList6;
                                if (i5 >= size2) {
                                    break;
                                }
                                ArrayList arrayList10 = arrayList7;
                                String str = sharedElementSourceNames.get(i5);
                                Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                                String str2 = sharedElementTargetNames.get(i5);
                                Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                                arrayMap.put(str, str2);
                                i5++;
                                arrayList6 = arrayList2;
                                arrayList7 = arrayList10;
                            }
                            arrayList3 = arrayList7;
                            int i7 = 2;
                            if (FragmentManager.F(2)) {
                                Log.v("FragmentManager", ">>> entering view names <<<");
                                Iterator<String> it3 = sharedElementTargetNames.iterator();
                                while (true) {
                                    i2 = i7;
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Iterator<String> it4 = it3;
                                    Log.v("FragmentManager", "Name: " + it3.next());
                                    objTe = objTe;
                                    i7 = i2;
                                    it3 = it4;
                                }
                                obj = objTe;
                                Log.v("FragmentManager", ">>> exiting view names <<<");
                                for (Iterator<String> it5 = sharedElementSourceNames.iterator(); it5.hasNext(); it5 = it5) {
                                    Log.v("FragmentManager", "Name: " + it5.next());
                                }
                            } else {
                                obj = objTe;
                                i2 = 2;
                            }
                            View view = firstOut.getFragment().mView;
                            Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                            N(arrayMap2, view);
                            arrayMap2.Ik(sharedElementSourceNames);
                            if (sharedElementCallback != null) {
                                if (FragmentManager.F(i2)) {
                                    Log.v("FragmentManager", "Executing exit callback for operation " + firstOut);
                                }
                                sharedElementCallback.nr(sharedElementSourceNames, arrayMap2);
                                int size3 = sharedElementSourceNames.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i8 = size3 - 1;
                                        Object obj5 = sharedElementSourceNames.get(size3);
                                        Intrinsics.checkNotNullExpressionValue(obj5, "exitingNames[i]");
                                        Object obj6 = (String) obj5;
                                        View view2 = (View) arrayMap2.get(obj6);
                                        if (view2 == null) {
                                            arrayMap.remove(obj6);
                                        } else if (!Intrinsics.areEqual(obj6, ViewCompat.N(view2))) {
                                            arrayMap.put(ViewCompat.N(view2), (String) arrayMap.remove(obj6));
                                        }
                                        if (i8 < 0) {
                                            break;
                                        } else {
                                            size3 = i8;
                                        }
                                    }
                                }
                            } else {
                                arrayMap.Ik(arrayMap2.keySet());
                            }
                            View view3 = lastIn.getFragment().mView;
                            Intrinsics.checkNotNullExpressionValue(view3, "lastIn.fragment.mView");
                            N(arrayMap3, view3);
                            arrayMap3.Ik(sharedElementTargetNames);
                            arrayMap3.Ik(arrayMap.values());
                            if (sharedElementCallback2 != null) {
                                if (FragmentManager.F(i2)) {
                                    Log.v("FragmentManager", "Executing enter callback for operation " + lastIn);
                                }
                                sharedElementCallback2.nr(sharedElementTargetNames, arrayMap3);
                                int size4 = sharedElementTargetNames.size() - 1;
                                if (size4 >= 0) {
                                    while (true) {
                                        int i9 = size4 - 1;
                                        String str3 = sharedElementTargetNames.get(size4);
                                        Intrinsics.checkNotNullExpressionValue(str3, "enteringNames[i]");
                                        String str4 = str3;
                                        View view4 = (View) arrayMap3.get(str4);
                                        if (view4 == null) {
                                            String strRl2 = FragmentTransition.rl(arrayMap, str4);
                                            if (strRl2 != null) {
                                                arrayMap.remove(strRl2);
                                            }
                                        } else if (!Intrinsics.areEqual(str4, ViewCompat.N(view4)) && (strRl = FragmentTransition.rl(arrayMap, str4)) != null) {
                                            arrayMap.put(strRl, ViewCompat.N(view4));
                                        }
                                        if (i9 < 0) {
                                            break;
                                        } else {
                                            size4 = i9;
                                        }
                                    }
                                }
                            } else {
                                FragmentTransition.nr(arrayMap, arrayMap3);
                            }
                            Collection collectionKeySet = arrayMap.keySet();
                            Intrinsics.checkNotNullExpressionValue(collectionKeySet, "sharedElementNameMapping.keys");
                            nHg(arrayMap2, collectionKeySet);
                            Collection collectionValues = arrayMap.values();
                            Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                            nHg(arrayMap3, collectionValues);
                            if (arrayMap.isEmpty()) {
                                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + firstOut + " and " + lastIn + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                arrayList2.clear();
                                arrayList3.clear();
                                it2 = it;
                                arrayList5 = arrayList;
                                fragmentTransitionImpl2 = fragmentTransitionImpl;
                                arrayList6 = arrayList2;
                                arrayList7 = arrayList3;
                                obj4 = null;
                            } else {
                                obj4 = obj;
                            }
                        }
                        it2 = it;
                        arrayList5 = arrayList;
                        fragmentTransitionImpl2 = fragmentTransitionImpl;
                        arrayList6 = arrayList2;
                        arrayList7 = arrayList3;
                    }
                    ArrayList arrayList11 = arrayList5;
                    FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl2;
                    ArrayList arrayList12 = arrayList6;
                    ArrayList arrayList13 = arrayList7;
                    if (obj4 == null) {
                        if (arrayList11.isEmpty()) {
                            return;
                        }
                        Iterator it6 = arrayList11.iterator();
                        while (it6.hasNext()) {
                            if (((TransitionInfo) it6.next()).getTransition() == null) {
                            }
                        }
                        return;
                    }
                    TransitionEffect transitionEffect = new TransitionEffect(arrayList11, firstOut, lastIn, fragmentTransitionImpl4, obj4, arrayList12, arrayList13, arrayMap, sharedElementTargetNames, sharedElementSourceNames, arrayMap2, arrayMap3, isPop);
                    Iterator it7 = arrayList11.iterator();
                    while (it7.hasNext()) {
                        ((TransitionInfo) it7.next()).getOperation().rl(transitionEffect);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void X(DefaultSpecialEffectsController this$0, SpecialEffectsController.Operation operation) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(operation, "$operation");
                    this$0.t(operation);
                }

                private final void e(List animationInfos) {
                    ArrayList<AnimationInfo> arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = animationInfos.iterator();
                    while (it.hasNext()) {
                        CollectionsKt.addAll(arrayList2, ((AnimationInfo) it.next()).getOperation().getEffects());
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    Iterator it2 = animationInfos.iterator();
                    boolean z2 = false;
                    while (it2.hasNext()) {
                        AnimationInfo animationInfo = (AnimationInfo) it2.next();
                        Context context = getContainer().getContext();
                        SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        FragmentAnim.AnimationOrAnimator animationOrAnimatorT = animationInfo.t(context);
                        if (animationOrAnimatorT != null) {
                            if (animationOrAnimatorT.rl == null) {
                                arrayList.add(animationInfo);
                            } else {
                                Fragment fragment = operation.getFragment();
                                if (operation.getEffects().isEmpty()) {
                                    if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                                        operation.Ik(false);
                                    }
                                    operation.rl(new AnimatorEffect(animationInfo));
                                    z2 = true;
                                } else if (FragmentManager.F(2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                                }
                            }
                        }
                    }
                    for (AnimationInfo animationInfo2 : arrayList) {
                        SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
                        Fragment fragment2 = operation2.getFragment();
                        if (zIsEmpty) {
                            if (!z2) {
                                operation2.rl(new AnimationEffect(animationInfo2));
                            } else if (FragmentManager.F(2)) {
                                Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                            }
                        } else if (FragmentManager.F(2)) {
                            Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
                @Override // androidx.fragment.app.SpecialEffectsController
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void nr(List operations, boolean isPop) {
                    Object obj;
                    Object next;
                    Intrinsics.checkNotNullParameter(operations, "operations");
                    if (FragmentManager.F(2)) {
                        Log.v("FragmentManager", "Collecting Effects");
                    }
                    Iterator it = operations.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) next;
                        SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
                        View view = operation.getFragment().mView;
                        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                        SpecialEffectsController.Operation.State stateN = companion.n(view);
                        SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
                        if (stateN == state && operation.getFinalState() != state) {
                            break;
                        }
                    }
                    SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) next;
                    ListIterator listIterator = operations.listIterator(operations.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        Object objPrevious = listIterator.previous();
                        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) objPrevious;
                        SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.INSTANCE;
                        View view2 = operation3.getFragment().mView;
                        Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
                        SpecialEffectsController.Operation.State stateN2 = companion2.n(view2);
                        SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
                        if (stateN2 != state2 && operation3.getFinalState() == state2) {
                            obj = objPrevious;
                            break;
                        }
                    }
                    SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) obj;
                    if (FragmentManager.F(2)) {
                        Log.v("FragmentManager", "Executing operations from " + operation2 + " to " + operation4);
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    s7N(operations);
                    Iterator it2 = operations.iterator();
                    while (it2.hasNext()) {
                        final SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) it2.next();
                        arrayList.add(new AnimationInfo(operation5, isPop));
                        boolean z2 = false;
                        if (isPop) {
                            if (operation5 == operation2) {
                                z2 = true;
                            }
                        } else if (operation5 == operation4) {
                        }
                        arrayList2.add(new TransitionInfo(operation5, isPop, z2));
                        operation5.n(new Runnable() { // from class: androidx.fragment.app.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.X(this.f38740n, operation5);
                            }
                        });
                    }
                    T(arrayList2, isPop, operation2, operation4);
                    e(arrayList);
                }

                private final void N(Map namedViews, View view) {
                    String strN = ViewCompat.N(view);
                    if (strN != null) {
                        namedViews.put(strN, view);
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View child = viewGroup.getChildAt(i2);
                            if (child.getVisibility() == 0) {
                                Intrinsics.checkNotNullExpressionValue(child, "child");
                                N(namedViews, child);
                            }
                        }
                    }
                }

                private final void nHg(ArrayMap arrayMap, final Collection collection) {
                    Set entries = arrayMap.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries, "entries");
                    CollectionsKt.retainAll(entries, new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke(Map.Entry entry) {
                            Intrinsics.checkNotNullParameter(entry, "entry");
                            return Boolean.valueOf(CollectionsKt.contains(collection, ViewCompat.N((View) entry.getValue())));
                        }
                    });
                }

                private final void s7N(List operations) {
                    Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last(operations)).getFragment();
                    Iterator it = operations.iterator();
                    while (it.hasNext()) {
                        SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) it.next();
                        operation.getFragment().mAnimationInfo.f38539t = fragment.mAnimationInfo.f38539t;
                        operation.getFragment().mAnimationInfo.nr = fragment.mAnimationInfo.nr;
                        operation.getFragment().mAnimationInfo.f38533O = fragment.mAnimationInfo.f38533O;
                        operation.getFragment().mAnimationInfo.J2 = fragment.mAnimationInfo.J2;
                    }
                }
            }
