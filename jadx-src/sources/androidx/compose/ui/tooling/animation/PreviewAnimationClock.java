package androidx.compose.ui.tooling.animation;

import android.util.Log;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0013¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001e¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030!¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0013¢\u0006\u0004\b$\u0010\u0015J\u0015\u0010&\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020(H\u0015¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\nR4\u0010:\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000302\u0012\b\u0012\u0006\u0012\u0002\b\u000303018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R,\u0010@\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b=\u00105\u0012\u0004\b?\u00109\u001a\u0004\b>\u00107R<\u0010E\u001a\u001e\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030A\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030B018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bC\u00105\u0012\u0004\bD\u00109\u001a\u0004\b=\u00107R,\u0010J\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b>\u00105\u0012\u0004\bI\u00109\u001a\u0004\bH\u00107R4\u0010M\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030K\u0012\b\u0012\u0006\u0012\u0002\b\u000303018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bH\u00105\u0012\u0004\bL\u00109\u001a\u0004\bC\u00107R0\u0010U\u001a\u0012\u0012\u0004\u0012\u00020O0Nj\b\u0012\u0004\u0012\u00020O`P8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010Q\u0012\u0004\bT\u00109\u001a\u0004\bR\u0010SR$\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u00010Nj\b\u0012\u0004\u0012\u00020\u0001`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010QR\u0014\u0010X\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010WR\"\u0010\\\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030Z0Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010[¨\u0006]"}, d2 = {"Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "", "Lkotlin/Function0;", "", "setAnimationsTimeCallback", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "animation", "", "label", "Z", "(Ljava/lang/Object;Ljava/lang/String;)V", "t", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "createClockAndSubscribe", "", "HI", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/animation/core/Transition;", "o", "(Landroidx/compose/animation/core/Transition;)V", "onSeek", "ty", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "qie", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;)V", "gh", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "r", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "Landroidx/compose/animation/core/DecayAnimation;", "ck", "(Landroidx/compose/animation/core/DecayAnimation;)V", "az", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "Ik", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;)V", "Landroidx/compose/animation/tooling/ComposeAnimation;", "mUb", "(Landroidx/compose/animation/tooling/ComposeAnimation;)V", c.f62177j, "Lkotlin/jvm/functions/Function0;", "rl", "Ljava/lang/String;", "TAG", "DEBUG", "", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "nr", "Ljava/util/Map;", "xMQ", "()Ljava/util/Map;", "getTransitionClocks$ui_tooling_release$annotations", "()V", "transitionClocks", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "O", "Uo", "getAnimatedVisibilityClocks$ui_tooling_release$annotations", "animatedVisibilityClocks", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", "J2", "getAnimateXAsStateClocks$ui_tooling_release$annotations", "animateXAsStateClocks", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "KN", "getInfiniteTransitionClocks$ui_tooling_release$annotations", "infiniteTransitionClocks", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "getAnimatedContentClocks$ui_tooling_release$annotations", "animatedContentClocks", "Ljava/util/LinkedHashSet;", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "getTrackedUnsupportedAnimations", "()Ljava/util/LinkedHashSet;", "getTrackedUnsupportedAnimations$annotations", "trackedUnsupportedAnimations", "trackedAnimations", "Ljava/lang/Object;", "lock", "", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "()Ljava/util/List;", "allClocksExceptInfinite", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreviewAnimationClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewAnimationClock.android.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,360:1\n1#2:361\n1855#3,2:362\n1855#3,2:366\n1855#3,2:368\n215#4,2:364\n*S KotlinDebug\n*F\n+ 1 PreviewAnimationClock.android.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n*L\n334#1:362,2\n352#1:366,2\n353#1:368,2\n344#1:364,2\n*E\n"})
public class PreviewAnimationClock {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function0 setAnimationsTimeCallback;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean DEBUG;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String TAG = "PreviewAnimationClock";

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Map transitionClocks = new LinkedHashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Map animatedVisibilityClocks = new LinkedHashMap();

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Map animateXAsStateClocks = new LinkedHashMap();

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Map infiniteTransitionClocks = new LinkedHashMap();

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Map animatedContentClocks = new LinkedHashMap();

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final LinkedHashSet trackedUnsupportedAnimations = new LinkedHashSet();

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final LinkedHashSet trackedAnimations = new LinkedHashSet();

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: androidx.compose.ui.tooling.animation.PreviewAnimationClock$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class AnonymousClass1 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f34070n = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    protected void mUb(ComposeAnimation animation) {
    }

    private final boolean HI(Object animation, Function1 createClockAndSubscribe) {
        synchronized (this.lock) {
            if (this.trackedAnimations.contains(animation)) {
                if (this.DEBUG) {
                    Log.d(this.TAG, "Animation " + animation + " is already being tracked");
                }
                return false;
            }
            this.trackedAnimations.add(animation);
            createClockAndSubscribe.invoke(animation);
            if (!this.DEBUG) {
                return true;
            }
            Log.d(this.TAG, "Animation " + animation + " is now tracked");
            return true;
        }
    }

    private final void Z(Object animation, final String label) {
        HI(animation, new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackUnsupported$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void n(Object obj) {
                this.f34084n.t(label);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List nr() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus(this.transitionClocks.values(), (Iterable) this.animatedVisibilityClocks.values()), (Iterable) this.animateXAsStateClocks.values()), (Iterable) this.animatedContentClocks.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String label) {
        UnsupportedComposeAnimation unsupportedComposeAnimationN = UnsupportedComposeAnimation.INSTANCE.n(label);
        if (unsupportedComposeAnimationN != null) {
            this.trackedUnsupportedAnimations.add(unsupportedComposeAnimationN);
            mUb(unsupportedComposeAnimationN);
        }
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final Map getAnimatedContentClocks() {
        return this.animatedContentClocks;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final Map getInfiniteTransitionClocks() {
        return this.infiniteTransitionClocks;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Map getAnimateXAsStateClocks() {
        return this.animateXAsStateClocks;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Map getAnimatedVisibilityClocks() {
        return this.animatedVisibilityClocks;
    }

    public final void az(final Transition animation) {
        HI(animation, new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimatedContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void n(Object obj) {
                AnimatedContentComposeAnimation animatedContentComposeAnimationRl = AnimatedContentComposeAnimation.f34037O.rl(animation);
                if (animatedContentComposeAnimationRl == null) {
                    this.t(animation.getLabel());
                    return;
                }
                PreviewAnimationClock previewAnimationClock = this;
                previewAnimationClock.getAnimatedContentClocks().put(animatedContentComposeAnimationRl, new TransitionClock(animatedContentComposeAnimationRl));
                previewAnimationClock.mUb(animatedContentComposeAnimationRl);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        });
    }

    public final void ck(DecayAnimation animation) {
        Z(animation, "DecayAnimation");
    }

    public final void gh(Object animation) {
        Z(animation, "animateContentSize");
    }

    public final void o(final Transition animation) {
        HI(animation, new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void n(Object obj) {
                TransitionComposeAnimation transitionComposeAnimationN = TransitionComposeAnimation_androidKt.n(animation);
                if (transitionComposeAnimationN == null) {
                    this.t(animation.getLabel());
                    return;
                }
                PreviewAnimationClock previewAnimationClock = this;
                previewAnimationClock.getTransitionClocks().put(transitionComposeAnimationN, new TransitionClock(transitionComposeAnimationN));
                previewAnimationClock.mUb(transitionComposeAnimationN);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        });
    }

    public final void r(TargetBasedAnimation animation) {
        Z(animation, "TargetBasedAnimation");
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Map getTransitionClocks() {
        return this.transitionClocks;
    }

    public PreviewAnimationClock(Function0 function0) {
        this.setAnimationsTimeCallback = function0;
    }

    public final void Ik(final AnimationSearch.InfiniteTransitionSearchInfo animation) {
        HI(animation.getInfiniteTransition(), new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackInfiniteTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void n(Object obj) {
                InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimationRl = InfiniteTransitionComposeAnimation.INSTANCE.rl(animation);
                if (infiniteTransitionComposeAnimationRl != null) {
                    final PreviewAnimationClock previewAnimationClock = this;
                    previewAnimationClock.getInfiniteTransitionClocks().put(infiniteTransitionComposeAnimationRl, new InfiniteTransitionClock(infiniteTransitionComposeAnimationRl, new Function0<Long>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackInfiniteTransition$1$1$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            Long lValueOf;
                            Iterator it = previewAnimationClock.nr().iterator();
                            Long lValueOf2 = null;
                            if (it.hasNext()) {
                                lValueOf = Long.valueOf(((ComposeAnimationClock) it.next()).n());
                                while (it.hasNext()) {
                                    Long lValueOf3 = Long.valueOf(((ComposeAnimationClock) it.next()).n());
                                    if (lValueOf.compareTo(lValueOf3) < 0) {
                                        lValueOf = lValueOf3;
                                    }
                                }
                            } else {
                                lValueOf = null;
                            }
                            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
                            Iterator it2 = previewAnimationClock.getInfiniteTransitionClocks().values().iterator();
                            if (it2.hasNext()) {
                                lValueOf2 = Long.valueOf(((InfiniteTransitionClock) it2.next()).nr());
                                while (it2.hasNext()) {
                                    Long lValueOf4 = Long.valueOf(((InfiniteTransitionClock) it2.next()).nr());
                                    if (lValueOf2.compareTo(lValueOf4) < 0) {
                                        lValueOf2 = lValueOf4;
                                    }
                                }
                            }
                            return Long.valueOf(Math.max(jLongValue, lValueOf2 != null ? lValueOf2.longValue() : 0L));
                        }
                    }));
                    previewAnimationClock.mUb(infiniteTransitionComposeAnimationRl);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        });
    }

    public final void qie(final AnimationSearch.AnimateXAsStateSearchInfo animation) {
        HI(animation.getAnimatable(), new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimateXAsState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void n(Object obj) {
                AnimateXAsStateComposeAnimation animateXAsStateComposeAnimationRl = AnimateXAsStateComposeAnimation.INSTANCE.rl(animation);
                if (animateXAsStateComposeAnimationRl == null) {
                    this.t(animation.getAnimatable().getLabel());
                    return;
                }
                PreviewAnimationClock previewAnimationClock = this;
                previewAnimationClock.getAnimateXAsStateClocks().put(animateXAsStateComposeAnimationRl, new AnimateXAsStateClock(animateXAsStateComposeAnimationRl));
                previewAnimationClock.mUb(animateXAsStateComposeAnimationRl);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        });
    }

    public final void ty(final Transition animation, final Function0 onSeek) {
        if (!(animation.xMQ() instanceof Boolean)) {
            return;
        }
        HI(animation, new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimatedVisibility$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void n(Object obj) {
                Intrinsics.checkNotNull(animation, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Boolean>");
                AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimationN = AnimatedVisibilityComposeAnimation_androidKt.n(animation);
                onSeek.invoke();
                Map animatedVisibilityClocks = this.getAnimatedVisibilityClocks();
                AnimatedVisibilityClock animatedVisibilityClock = new AnimatedVisibilityClock(animatedVisibilityComposeAnimationN);
                animatedVisibilityClock.nr(0L);
                animatedVisibilityClocks.put(animatedVisibilityComposeAnimationN, animatedVisibilityClock);
                this.mUb(animatedVisibilityComposeAnimationN);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        });
    }
}
