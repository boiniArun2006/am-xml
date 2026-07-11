package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.data.CallGroup;
import androidx.compose.ui.tooling.data.Group;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001:\f+,-./0123456B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\tH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u001b\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\"\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'R\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'¨\u00067"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "clock", "", "onSeek", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "t", "()Ljava/util/Collection;", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "O", "()Ljava/util/Set;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Uo", "KN", "Landroidx/compose/ui/tooling/data/Group;", "slotTrees", "", "J2", "(Ljava/util/Collection;)Z", "nr", "(Ljava/util/Collection;)V", c.f62177j, "Lkotlin/jvm/functions/Function0;", "rl", "Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "transitionSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "animatedContentSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "animatedVisibilitySearch", "Ljava/util/Set;", "supportedSearch", "setToTrack", "setToSearch", "AnimateContentSizeSearch", "AnimateXAsStateSearch", "AnimateXAsStateSearchInfo", "AnimatedContentSearch", "AnimatedVisibilitySearch", "DecaySearch", "InfiniteTransitionSearch", "InfiniteTransitionSearchInfo", "RememberSearch", "Search", "TargetBasedSearch", "TransitionSearch", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,455:1\n1747#2,2:456\n1747#2,3:458\n1749#2:461\n1855#2:462\n1855#2,2:463\n1856#2:465\n1855#2,2:466\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n*L\n132#1:456,2\n134#1:458,3\n132#1:461\n147#1:462\n149#1:463,2\n147#1:465\n159#1:466,2\n*E\n"})
public final class AnimationSearch {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Set supportedSearch;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Set setToSearch;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AnimatedVisibilitySearch animatedVisibilitySearch;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Set setToTrack;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function0 clock;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final AnimatedContentSearch animatedContentSearch;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 onSeek;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final TransitionSearch transitionSearch = new TransitionSearch(new Function1<Transition<?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$transitionSearch$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition<?> transition) {
            n(transition);
            return Unit.INSTANCE;
        }

        public final void n(Transition transition) {
            ((PreviewAnimationClock) this.f34059n.clock.invoke()).o(transition);
        }
    });

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "t", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", c.f62177j, "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,455:1\n1747#2,3:456\n766#2:459\n857#2,2:460\n1855#2:462\n1855#2,2:463\n1856#2:465\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n*L\n363#1:456,3\n372#1:459\n372#1:460,2\n373#1:462\n374#1:463,2\n373#1:465\n*E\n"})
    public static final class AnimateContentSizeSearch extends Search<Object> {
        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void n(Collection groups) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : groups) {
                if (!((Group) obj).getModifierInfo().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((Group) it.next()).getModifierInfo().iterator();
                while (it2.hasNext()) {
                    ((ModifierInfo) it2.next()).getModifier().E(new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$addAnimations$2$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke(Modifier.Element element) {
                            boolean z2;
                            if (Intrinsics.areEqual(element.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement")) {
                                this.f34045n.getAnimations().add(element);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                    });
                }
            }
        }

        public AnimateContentSizeSearch(Function1 function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean t(Group group) {
            if (!group.getModifierInfo().isEmpty()) {
                List modifierInfo = group.getModifierInfo();
                if (modifierInfo == null || !modifierInfo.isEmpty()) {
                    Iterator it = modifierInfo.iterator();
                    while (it.hasNext()) {
                        if (((ModifierInfo) it.next()).getModifier().E(new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$hasAnimation$1$1
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(Modifier.Element element) {
                                return Boolean.valueOf(Intrinsics.areEqual(element.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement"));
                            }
                        })) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u00020\u0010\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\u0018\u00010\u0014\"\u0004\b\u0000\u0010\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018\"\u0004\b\u0000\u0010\r2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b\"\u0004\b\u0000\u0010\r2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "Landroidx/compose/ui/tooling/data/CallGroup;", "mUb", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/data/CallGroup;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "groups", "", "Landroidx/compose/animation/core/AnimationVector;", "KN", "(Ljava/util/Collection;)Ljava/util/List;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "xMQ", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/AnimationSpec;", "Uo", "(Landroidx/compose/ui/tooling/data/CallGroup;)Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/Animatable;", "J2", "(Landroidx/compose/ui/tooling/data/CallGroup;)Landroidx/compose/animation/core/Animatable;", "", "t", "(Landroidx/compose/ui/tooling/data/Group;)Z", c.f62177j, "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,455:1\n1#2:456\n1#2:467\n1#2:480\n1#2:487\n1#2:572\n1603#3,9:457\n1855#3:466\n1856#3:468\n1612#3:469\n1603#3,9:470\n1855#3:479\n1856#3:481\n1612#3:482\n288#3,2:484\n1603#3,9:489\n1855#3,2:498\n1612#3:500\n1603#3,9:502\n1855#3,2:511\n1612#3:513\n1603#3,9:515\n1855#3,2:524\n1612#3:526\n766#3:527\n857#3,2:528\n1360#3:530\n1446#3,5:531\n1360#3:536\n1446#3,5:537\n800#3,11:542\n1549#3:553\n1620#3,3:554\n800#3,11:557\n288#3,2:569\n1603#3,9:574\n1855#3,2:583\n1612#3:585\n1603#3,9:587\n1855#3,2:596\n1612#3:598\n1603#3,9:600\n1855#3,2:609\n1612#3:611\n56#4:483\n57#4:486\n49#4:488\n50#4:501\n51#4:514\n56#4:568\n57#4:571\n49#4:573\n50#4:586\n51#4:599\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n*L\n313#1:467\n314#1:480\n339#1:487\n354#1:572\n313#1:457,9\n313#1:466\n313#1:468\n313#1:469\n314#1:470,9\n314#1:479\n314#1:481\n314#1:482\n339#1:484,2\n339#1:489,9\n339#1:498,2\n339#1:500\n339#1:502,9\n339#1:511,2\n339#1:513\n339#1:515,9\n339#1:524,2\n339#1:526\n344#1:527\n344#1:528,2\n345#1:530\n345#1:531,5\n346#1:536\n346#1:537,5\n347#1:542,11\n348#1:553\n348#1:554,3\n349#1:557,11\n354#1:569,2\n354#1:574,9\n354#1:583,2\n354#1:585\n354#1:587,9\n354#1:596,2\n354#1:598\n354#1:600,9\n354#1:609,2\n354#1:611\n339#1:483\n339#1:486\n339#1:488\n339#1:501\n339#1:514\n354#1:568\n354#1:571\n354#1:573\n354#1:586\n354#1:599\n*E\n"})
    public static final class AnimateXAsStateSearch extends Search<AnimateXAsStateSearchInfo<?, ?>> {
        private final List KN(Collection groups) {
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator it = groups.iterator();
            while (it.hasNext()) {
                CallGroup callGroupMUb = mUb((Group) it.next());
                if (callGroupMUb != null) {
                    arrayList.add(callGroupMUb);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Animatable animatableJ2 = J2(callGroup);
                AnimationSpec animationSpecUo = Uo(callGroup);
                MutableState mutableStateXMQ = xMQ(callGroup);
                AnimateXAsStateSearchInfo animateXAsStateSearchInfo = null;
                animateXAsStateSearchInfo = null;
                animateXAsStateSearchInfo = null;
                if (animatableJ2 != null && animationSpecUo != null && mutableStateXMQ != null) {
                    if (mutableStateXMQ.getValue() == null) {
                        mutableStateXMQ.setValue(new ToolingState(animatableJ2.ty()));
                    }
                    Object value = mutableStateXMQ.getValue();
                    ToolingState toolingState = value instanceof ToolingState ? (ToolingState) value : null;
                    if (toolingState == null) {
                        toolingState = new ToolingState(animatableJ2.ty());
                    }
                    animateXAsStateSearchInfo = new AnimateXAsStateSearchInfo(animatableJ2, animationSpecUo, toolingState);
                }
                if (animateXAsStateSearchInfo != null) {
                    arrayList2.add(animateXAsStateSearchInfo);
                }
            }
            return arrayList2;
        }

        public AnimateXAsStateSearch(Function1 function1) {
            super(function1);
        }

        private final Animatable J2(CallGroup group) {
            Object next;
            List listEmptyList;
            Object next2;
            Object next3;
            Iterator it = group.getData().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next instanceof Animatable) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (!(next instanceof Animatable)) {
                next = null;
            }
            Animatable animatable = (Animatable) next;
            if (animatable == null || (listEmptyList = CollectionsKt.listOf(animatable)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            Collection children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = children.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next3 = it3.next();
                        if (next3 instanceof Animatable) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                if (!(next3 instanceof Animatable)) {
                    next3 = null;
                }
                Animatable animatable2 = (Animatable) next3;
                if (animatable2 != null) {
                    arrayList.add(animatable2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = children.iterator();
            while (it4.hasNext()) {
                Group groupO = PreviewUtils_androidKt.O((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.f34063n);
                if (groupO != null) {
                    arrayList2.add(groupO);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next2 = it6.next();
                        if (next2 instanceof Animatable) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (!(next2 instanceof Animatable)) {
                    next2 = null;
                }
                Animatable animatable3 = (Animatable) next2;
                if (animatable3 != null) {
                    arrayList3.add(animatable3);
                }
            }
            return (Animatable) CollectionsKt.firstOrNull(CollectionsKt.plus((Collection) listEmptyList, (Iterable) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList3)));
        }

        private final AnimationSpec Uo(CallGroup group) {
            Collection children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            for (Object obj : children) {
                if (Intrinsics.areEqual(((Group) obj).getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "rememberUpdatedState")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((Group) it.next()).getChildren());
            }
            List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = listPlus.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList3, ((Group) it2.next()).getData());
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (obj2 instanceof State) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((State) it3.next()).getValue());
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (obj3 instanceof AnimationSpec) {
                    arrayList6.add(obj3);
                }
            }
            return (AnimationSpec) CollectionsKt.firstOrNull((List) arrayList6);
        }

        private final CallGroup mUb(Group group) {
            if (group.getLocation() == null || !Intrinsics.areEqual(group.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "animateValueAsState")) {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }

        private final MutableState xMQ(Group group) {
            Object next;
            List listEmptyList;
            Object next2;
            Object next3;
            Iterator it = group.getData().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next instanceof MutableState) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (!(next instanceof MutableState)) {
                next = null;
            }
            MutableState mutableState = (MutableState) next;
            if (mutableState == null || (listEmptyList = CollectionsKt.listOf(mutableState)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            Collection children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = children.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next3 = it3.next();
                        if (next3 instanceof MutableState) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                if (!(next3 instanceof MutableState)) {
                    next3 = null;
                }
                MutableState mutableState2 = (MutableState) next3;
                if (mutableState2 != null) {
                    arrayList.add(mutableState2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = children.iterator();
            while (it4.hasNext()) {
                Group groupO = PreviewUtils_androidKt.O((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.f34063n);
                if (groupO != null) {
                    arrayList2.add(groupO);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next2 = it6.next();
                        if (next2 instanceof MutableState) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (!(next2 instanceof MutableState)) {
                    next2 = null;
                }
                MutableState mutableState3 = (MutableState) next2;
                if (mutableState3 != null) {
                    arrayList3.add(mutableState3);
                }
            }
            return (MutableState) CollectionsKt.firstOrNull(CollectionsKt.plus((Collection) listEmptyList, (Iterable) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList3)));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void n(Collection groups) {
            getAnimations().addAll(KN(groups));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean t(Group group) {
            CallGroup callGroupMUb = mUb(group);
            if (callGroupMUb == null || J2(callGroupMUb) == null || Uo(callGroupMUb) == null || xMQ(callGroupMUb) == null) {
                return false;
            }
            return true;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/Animatable;", "animatable", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/ui/tooling/animation/ToolingState;", "toolingState", "<init>", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Landroidx/compose/animation/core/Animatable;", "()Landroidx/compose/animation/core/Animatable;", "rl", "Landroidx/compose/animation/core/AnimationSpec;", "()Landroidx/compose/animation/core/AnimationSpec;", "t", "Landroidx/compose/ui/tooling/animation/ToolingState;", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnimateXAsStateSearchInfo<T, V extends AnimationVector> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Animatable animatable;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final AnimationSpec animationSpec;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final ToolingState toolingState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimateXAsStateSearchInfo)) {
                return false;
            }
            AnimateXAsStateSearchInfo animateXAsStateSearchInfo = (AnimateXAsStateSearchInfo) other;
            return Intrinsics.areEqual(this.animatable, animateXAsStateSearchInfo.animatable) && Intrinsics.areEqual(this.animationSpec, animateXAsStateSearchInfo.animationSpec) && Intrinsics.areEqual(this.toolingState, animateXAsStateSearchInfo.toolingState);
        }

        public int hashCode() {
            return (((this.animatable.hashCode() * 31) + this.animationSpec.hashCode()) * 31) + this.toolingState.hashCode();
        }

        public String toString() {
            return "AnimateXAsStateSearchInfo(animatable=" + this.animatable + ", animationSpec=" + this.animationSpec + ", toolingState=" + this.toolingState + ')';
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Animatable getAnimatable() {
            return this.animatable;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final AnimationSpec getAnimationSpec() {
            return this.animationSpec;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final ToolingState getToolingState() {
            return this.toolingState;
        }

        public AnimateXAsStateSearchInfo(Animatable animatable, AnimationSpec animationSpec, ToolingState toolingState) {
            this.animatable = animatable;
            this.animationSpec = animationSpec;
            this.toolingState = toolingState;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$DecaySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/DecayAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DecaySearch extends RememberSearch<DecayAnimation<?, ?>> {
        public DecaySearch(Function1 function1) {
            super(Reflection.getOrCreateKotlinClass(DecayAnimation.class), function1);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "Landroidx/compose/ui/tooling/data/CallGroup;", "KN", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/data/CallGroup;", "", "groups", "", "J2", "(Ljava/util/Collection;)Ljava/util/List;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "", "Uo", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/runtime/MutableState;", "", "t", "(Landroidx/compose/ui/tooling/data/Group;)Z", c.f62177j, "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n+ 2 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n61#2,7:456\n69#2,2:469\n61#2,7:497\n69#2:510\n63#2,8:511\n64#2,4:524\n69#2:534\n63#2,8:535\n1360#3:463\n1446#3,5:464\n288#3,2:471\n1603#3,9:474\n1855#3:483\n1856#3:485\n1612#3:486\n1603#3,9:487\n1855#3:496\n1360#3:504\n1446#3,5:505\n288#3,2:519\n1856#3:522\n1612#3:523\n1360#3:528\n1446#3,5:529\n288#3,2:543\n1#4:473\n1#4:484\n1#4:521\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n*L\n227#1:456,7\n227#1:469,2\n246#1:497,7\n246#1:510\n246#1:511,8\n267#1:524,4\n267#1:534\n267#1:535,8\n227#1:463\n227#1:464,5\n227#1:471,2\n244#1:474,9\n244#1:483\n244#1:485\n244#1:486\n245#1:487,9\n245#1:496\n246#1:504\n246#1:505,5\n246#1:519,2\n245#1:522\n245#1:523\n267#1:528\n267#1:529,5\n267#1:543,2\n244#1:484\n245#1:521\n*E\n"})
    public static final class InfiniteTransitionSearch extends Search<InfiniteTransitionSearchInfo> {
        private final List J2(Collection groups) {
            InfiniteTransitionSearchInfo infiniteTransitionSearchInfo;
            Object next;
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator it = groups.iterator();
            while (it.hasNext()) {
                CallGroup callGroupKN = KN((Group) it.next());
                if (callGroupKN != null) {
                    arrayList.add(callGroupKN);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Collection data = callGroup.getData();
                Collection children = callGroup.getChildren();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = children.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.addAll(arrayList3, ((Group) it2.next()).getData());
                }
                Iterator it3 = CollectionsKt.plus(data, (Iterable) arrayList3).iterator();
                while (true) {
                    infiniteTransitionSearchInfo = null;
                    infiniteTransitionSearchInfo = null;
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (next instanceof InfiniteTransition) {
                        break;
                    }
                }
                if (!(next instanceof InfiniteTransition)) {
                    next = null;
                }
                InfiniteTransition infiniteTransition = (InfiniteTransition) next;
                MutableState mutableStateUo = Uo(callGroup);
                if (infiniteTransition != null && mutableStateUo != null) {
                    if (mutableStateUo.getValue() == null) {
                        mutableStateUo.setValue(new ToolingState(0L));
                    }
                    Object value = mutableStateUo.getValue();
                    ToolingState toolingState = value instanceof ToolingState ? (ToolingState) value : null;
                    if (toolingState == null) {
                        toolingState = new ToolingState(0L);
                    }
                    infiniteTransitionSearchInfo = new InfiniteTransitionSearchInfo(infiniteTransition, toolingState);
                }
                if (infiniteTransitionSearchInfo != null) {
                    arrayList2.add(infiniteTransitionSearchInfo);
                }
            }
            return arrayList2;
        }

        public InfiniteTransitionSearch(Function1 function1) {
            super(function1);
        }

        private final CallGroup KN(Group group) {
            if (group.getLocation() == null || !Intrinsics.areEqual(group.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "rememberInfiniteTransition")) {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }

        private final MutableState Uo(Group group) {
            Object obj;
            Object next;
            Collection data = group.getData();
            Collection children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator it = children.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((Group) it.next()).getChildren());
            }
            List listPlus = CollectionsKt.plus(children, (Iterable) arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listPlus.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((Group) it2.next()).getData());
            }
            Iterator it3 = CollectionsKt.plus(data, (Iterable) arrayList2).iterator();
            while (true) {
                obj = null;
                if (it3.hasNext()) {
                    next = it3.next();
                    if (next instanceof MutableState) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next instanceof MutableState) {
                obj = next;
            }
            return (MutableState) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void n(Collection groups) {
            getAnimations().addAll(J2(groups));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean t(Group group) {
            Object obj;
            Object next;
            if (KN(group) != null) {
                Collection data = group.getData();
                Collection children = group.getChildren();
                ArrayList arrayList = new ArrayList();
                Iterator it = children.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((Group) it.next()).getData());
                }
                Iterator it2 = CollectionsKt.plus(data, (Iterable) arrayList).iterator();
                while (true) {
                    obj = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof InfiniteTransition) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next instanceof InfiniteTransition) {
                    obj = next;
                }
                if (((InfiniteTransition) obj) != null && Uo(group) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "", "Landroidx/compose/animation/core/InfiniteTransition;", "infiniteTransition", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "toolingState", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Landroidx/compose/animation/core/InfiniteTransition;", "()Landroidx/compose/animation/core/InfiniteTransition;", "rl", "Landroidx/compose/ui/tooling/animation/ToolingState;", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InfiniteTransitionSearchInfo {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f34049t = InfiniteTransition.J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfiniteTransition infiniteTransition;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final ToolingState toolingState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfiniteTransitionSearchInfo)) {
                return false;
            }
            InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (InfiniteTransitionSearchInfo) other;
            return Intrinsics.areEqual(this.infiniteTransition, infiniteTransitionSearchInfo.infiniteTransition) && Intrinsics.areEqual(this.toolingState, infiniteTransitionSearchInfo.toolingState);
        }

        public int hashCode() {
            return (this.infiniteTransition.hashCode() * 31) + this.toolingState.hashCode();
        }

        public String toString() {
            return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.infiniteTransition + ", toolingState=" + this.toolingState + ')';
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final InfiniteTransition getInfiniteTransition() {
            return this.infiniteTransition;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final ToolingState getToolingState() {
            return this.toolingState;
        }

        public InfiniteTransitionSearchInfo(InfiniteTransition infiniteTransition, ToolingState toolingState) {
            this.infiniteTransition = infiniteTransition;
            this.toolingState = toolingState;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "", "Uo", "(Ljava/util/Collection;Lkotlin/reflect/KClass;)Ljava/util/List;", "J2", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "groups", c.f62177j, "(Ljava/util/Collection;)V", "group", "", "t", "(Landroidx/compose/ui/tooling/data/Group;)Z", "Lkotlin/reflect/KClass;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n766#2:456\n857#2,2:457\n1603#2,9:459\n1855#2:468\n1856#2:470\n1612#2:471\n288#2,2:472\n1#3:469\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n*L\n191#1:456\n191#1:457,2\n200#1:459,9\n200#1:468\n200#1:470\n200#1:471\n206#1:472,2\n200#1:469\n*E\n"})
    public static class RememberSearch<T> extends Search<T> {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final KClass clazz;

        private final List Uo(Collection collection, KClass kClass) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Object objJ2 = J2((Group) it.next(), kClass);
                if (objJ2 != null) {
                    arrayList.add(objJ2);
                }
            }
            return arrayList;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void n(Collection groups) {
            ArrayList arrayList = new ArrayList();
            for (T t3 : groups) {
                if (((Group) t3).getLocation() != null) {
                    arrayList.add(t3);
                }
            }
            getAnimations().addAll(CollectionsKt.toSet(Uo(arrayList, this.clazz)));
        }

        public RememberSearch(KClass kClass, Function1 function1) {
            super(function1);
            this.clazz = kClass;
        }

        private final Object J2(Group group, KClass kClass) {
            Object kotlinClass;
            Iterator<T> it = group.getData().iterator();
            while (true) {
                kotlinClass = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next != null) {
                    kotlinClass = JvmClassMappingKt.getKotlinClass(next.getClass());
                }
                if (Intrinsics.areEqual(kotlinClass, kClass)) {
                    kotlinClass = next;
                    break;
                }
            }
            return KClasses.safeCast(kClass, kotlinClass);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean t(Group group) {
            if (group.getLocation() != null && J2(group, this.clazz) != null) {
                return true;
            }
            return false;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "groups", "", "nr", "(Ljava/util/Collection;)Z", "group", "t", "(Landroidx/compose/ui/tooling/data/Group;)Z", c.f62177j, "(Ljava/util/Collection;)V", "O", "()V", "Lkotlin/jvm/functions/Function1;", "", "rl", "Ljava/util/Set;", "()Ljava/util/Set;", "animations", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,455:1\n1747#2,3:456\n1855#2,2:459\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n*L\n166#1:456,3\n183#1:459,2\n*E\n"})
    public static abstract class Search<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Function1 trackAnimation;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Set animations = new LinkedHashSet();

        public void n(Collection groups) {
        }

        public abstract boolean t(Group group);

        public final void O() {
            List listReversed = CollectionsKt.reversed(this.animations);
            Function1 function1 = this.trackAnimation;
            Iterator<T> it = listReversed.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
        }

        public final boolean nr(Collection groups) {
            Collection collection = groups;
            if ((collection instanceof Collection) && collection.isEmpty()) {
                return false;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (t((Group) it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final Set getAnimations() {
            return this.animations;
        }

        public Search(Function1 function1) {
            this.trackAnimation = function1;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TargetBasedSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TargetBasedSearch extends RememberSearch<TargetBasedAnimation<?, ?>> {
        public TargetBasedSearch(Function1 function1) {
            super(Reflection.getOrCreateKotlinClass(TargetBasedAnimation.class), function1);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "J2", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/data/Group;", "", "t", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", c.f62177j, "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,455:1\n1603#2,9:456\n1855#2:465\n1856#2:467\n1612#2:468\n1855#2:470\n288#2,2:471\n1856#2:473\n1612#2:474\n1855#2,2:476\n1612#2:478\n1855#2:480\n288#2,2:481\n1856#2:483\n1612#2:484\n288#2,2:486\n1#3:466\n1#3:485\n49#4:469\n50#4:475\n51#4:479\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n*L\n440#1:456,9\n440#1:465\n440#1:467\n440#1:468\n440#1:470\n440#1:471,2\n440#1:473\n440#1:474\n440#1:476,2\n440#1:478\n440#1:480\n440#1:481,2\n440#1:483\n440#1:484\n448#1:486,2\n440#1:466\n440#1:469\n440#1:475\n440#1:479\n*E\n"})
    public static final class AnimatedContentSearch extends Search<Transition<?>> {
        public AnimatedContentSearch(Function1 function1) {
            super(function1);
        }

        private final Group J2(Group group) {
            Object obj = null;
            if (group.getLocation() == null || !Intrinsics.areEqual(group.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "AnimatedContent")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator it = group.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((Group) next).getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void n(Collection groups) {
            Object next;
            Object next2;
            Set animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator it = groups.iterator();
            while (it.hasNext()) {
                Group groupJ2 = J2((Group) it.next());
                if (groupJ2 != null) {
                    arrayList.add(groupJ2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                Object obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                Iterator it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2 instanceof Transition) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (next2 instanceof Transition) {
                    obj = next2;
                }
                Transition transition = (Transition) obj;
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group groupO = PreviewUtils_androidKt.O((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.f34063n);
                if (groupO != null) {
                    arrayList3.add(groupO);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next = it6.next();
                        if (next instanceof Transition) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (!(next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            animations.addAll(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean t(Group group) {
            if (J2(group) != null) {
                return true;
            }
            return false;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "J2", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/data/Group;", "", "t", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", c.f62177j, "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,455:1\n1603#2,9:456\n1855#2:465\n1856#2:467\n1612#2:468\n1855#2:470\n288#2,2:471\n1856#2:473\n1612#2:474\n1855#2,2:476\n1612#2:478\n1855#2:480\n288#2,2:481\n1856#2:483\n1612#2:484\n288#2,2:486\n1#3:466\n1#3:485\n49#4:469\n50#4:475\n51#4:479\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n*L\n414#1:456,9\n414#1:465\n414#1:467\n414#1:468\n414#1:470\n414#1:471,2\n414#1:473\n414#1:474\n414#1:476,2\n414#1:478\n414#1:480\n414#1:481,2\n414#1:483\n414#1:484\n424#1:486,2\n414#1:466\n414#1:469\n414#1:475\n414#1:479\n*E\n"})
    public static final class AnimatedVisibilitySearch extends Search<Transition<?>> {
        public AnimatedVisibilitySearch(Function1 function1) {
            super(function1);
        }

        private final Group J2(Group group) {
            Object obj = null;
            if (group.getLocation() == null || !Intrinsics.areEqual(group.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "AnimatedVisibility")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator it = group.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((Group) next).getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void n(Collection groups) {
            Object next;
            Object next2;
            Set animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator it = groups.iterator();
            while (it.hasNext()) {
                Group groupJ2 = J2((Group) it.next());
                if (groupJ2 != null) {
                    arrayList.add(groupJ2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                Object obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                Iterator it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2 instanceof Transition) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (next2 instanceof Transition) {
                    obj = next2;
                }
                Transition transition = (Transition) obj;
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group groupO = PreviewUtils_androidKt.O((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.f34063n);
                if (groupO != null) {
                    arrayList3.add(groupO);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next = it6.next();
                        if (next instanceof Transition) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (!(next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            animations.addAll(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean t(Group group) {
            if (J2(group) != null) {
                return true;
            }
            return false;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "J2", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/data/Group;", "", "t", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", c.f62177j, "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,455:1\n1603#2,9:456\n1855#2:465\n1856#2:467\n1612#2:468\n1855#2:470\n288#2,2:471\n1856#2:473\n1612#2:474\n1855#2,2:476\n1612#2:478\n1855#2:480\n288#2,2:481\n1856#2:483\n1612#2:484\n1#3:466\n1#3:485\n49#4:469\n50#4:475\n51#4:479\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n*L\n395#1:456,9\n395#1:465\n395#1:467\n395#1:468\n395#1:470\n395#1:471,2\n395#1:473\n395#1:474\n395#1:476,2\n395#1:478\n395#1:480\n395#1:481,2\n395#1:483\n395#1:484\n395#1:466\n395#1:469\n395#1:475\n395#1:479\n*E\n"})
    public static final class TransitionSearch extends Search<Transition<?>> {
        public TransitionSearch(Function1 function1) {
            super(function1);
        }

        private final Group J2(Group group) {
            if (group.getLocation() != null && Intrinsics.areEqual(group.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "updateTransition")) {
                return group;
            }
            return null;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void n(Collection groups) {
            Object next;
            Object next2;
            Set animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator it = groups.iterator();
            while (it.hasNext()) {
                Group groupJ2 = J2((Group) it.next());
                if (groupJ2 != null) {
                    arrayList.add(groupJ2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                Object obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                Iterator it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2 instanceof Transition) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (next2 instanceof Transition) {
                    obj = next2;
                }
                Transition transition = (Transition) obj;
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group groupO = PreviewUtils_androidKt.O((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.f34063n);
                if (groupO != null) {
                    arrayList3.add(groupO);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next = it6.next();
                        if (next instanceof Transition) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (!(next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            animations.addAll(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean t(Group group) {
            if (J2(group) != null) {
                return true;
            }
            return false;
        }
    }

    private final Collection KN() {
        return UnsupportedComposeAnimation.INSTANCE.rl() ? SetsKt.setOf((Object[]) new Search[]{new AnimateContentSizeSearch(new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$1
            {
                super(1);
            }

            public final void n(Object obj) {
                ((PreviewAnimationClock) this.f34060n.clock.invoke()).gh(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        }), new TargetBasedSearch(new Function1<TargetBasedAnimation<?, ?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TargetBasedAnimation<?, ?> targetBasedAnimation) {
                n(targetBasedAnimation);
                return Unit.INSTANCE;
            }

            public final void n(TargetBasedAnimation targetBasedAnimation) {
                ((PreviewAnimationClock) this.f34061n.clock.invoke()).r(targetBasedAnimation);
            }
        }), new DecaySearch(new Function1<DecayAnimation<?, ?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DecayAnimation<?, ?> decayAnimation) {
                n(decayAnimation);
                return Unit.INSTANCE;
            }

            public final void n(DecayAnimation decayAnimation) {
                ((PreviewAnimationClock) this.f34062n.clock.invoke()).ck(decayAnimation);
            }
        })}) : CollectionsKt.emptyList();
    }

    private final Set O() {
        return InfiniteTransitionComposeAnimation.INSTANCE.n() ? SetsKt.setOf(new InfiniteTransitionSearch(new Function1<InfiniteTransitionSearchInfo, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$infiniteTransitionSearch$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
                n(infiniteTransitionSearchInfo);
                return Unit.INSTANCE;
            }

            public final void n(AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
                ((PreviewAnimationClock) this.f34057n.clock.invoke()).Ik(infiniteTransitionSearchInfo);
            }
        })) : SetsKt.emptySet();
    }

    private final Set Uo() {
        return SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.setOf((Object[]) new Search[]{this.transitionSearch, this.animatedVisibilitySearch}), (Iterable) t()), (Iterable) O()), (Iterable) (AnimatedContentComposeAnimation.INSTANCE.n() ? SetsKt.setOf(this.animatedContentSearch) : SetsKt.emptySet()));
    }

    private final Collection t() {
        return AnimateXAsStateComposeAnimation.INSTANCE.n() ? SetsKt.setOf(new AnimateXAsStateSearch(new Function1<AnimateXAsStateSearchInfo<?, ?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animateXAsStateSearch$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationSearch.AnimateXAsStateSearchInfo<?, ?> animateXAsStateSearchInfo) {
                n(animateXAsStateSearchInfo);
                return Unit.INSTANCE;
            }

            public final void n(AnimationSearch.AnimateXAsStateSearchInfo animateXAsStateSearchInfo) {
                ((PreviewAnimationClock) this.f34053n.clock.invoke()).qie(animateXAsStateSearchInfo);
            }
        })) : CollectionsKt.emptyList();
    }

    public final boolean J2(Collection slotTrees) {
        Collection collection = slotTrees;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            List listRl = PreviewUtils_androidKt.rl((Group) it.next(), new Function1<Group, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$searchAny$1$groups$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Group group) {
                    return Boolean.TRUE;
                }
            });
            Set set = this.supportedSearch;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((Search) it2.next()).nr(listRl)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void nr(Collection slotTrees) {
        Iterator it = slotTrees.iterator();
        while (it.hasNext()) {
            List listRl = PreviewUtils_androidKt.rl((Group) it.next(), new Function1<Group, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$attachAllAnimations$1$groups$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Group group) {
                    return Boolean.TRUE;
                }
            });
            Iterator it2 = this.setToSearch.iterator();
            while (it2.hasNext()) {
                ((Search) it2.next()).n(listRl);
            }
            this.transitionSearch.getAnimations().removeAll(this.animatedVisibilitySearch.getAnimations());
            this.transitionSearch.getAnimations().removeAll(this.animatedContentSearch.getAnimations());
        }
        Iterator it3 = this.setToTrack.iterator();
        while (it3.hasNext()) {
            ((Search) it3.next()).O();
        }
    }

    public AnimationSearch(Function0 function0, Function0 function02) {
        this.clock = function0;
        this.onSeek = function02;
        AnimatedContentSearch animatedContentSearch = new AnimatedContentSearch(new Function1<Transition<?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animatedContentSearch$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Transition<?> transition) {
                n(transition);
                return Unit.INSTANCE;
            }

            public final void n(Transition transition) {
                ((PreviewAnimationClock) this.f34054n.clock.invoke()).az(transition);
            }
        });
        this.animatedContentSearch = animatedContentSearch;
        this.animatedVisibilitySearch = new AnimatedVisibilitySearch(new Function1<Transition<?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animatedVisibilitySearch$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Transition<?> transition) {
                n(transition);
                return Unit.INSTANCE;
            }

            public final void n(Transition transition) {
                ((PreviewAnimationClock) this.f34055n.clock.invoke()).ty(transition, this.f34055n.onSeek);
            }
        });
        Set setUo = Uo();
        this.supportedSearch = setUo;
        Set setPlus = SetsKt.plus(setUo, (Iterable) KN());
        this.setToTrack = setPlus;
        this.setToSearch = SetsKt.plus(setPlus, (Iterable) SetsKt.setOf(animatedContentSearch));
    }
}
