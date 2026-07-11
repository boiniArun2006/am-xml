package com.alightcreative.app.motion.scene.animators;

import android.content.Context;
import com.alightcreative.app.motion.scene.animators.AnimatorKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a*\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\u0014\u0010\u001f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00070\b0\u0016H\u0002\u001a)\u0010 \u001a\u00020\u000f\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\b*\u00020!2\u0006\u0010\"\u001a\u0002H\u0007¢\u0006\u0002\u0010#\u001a)\u0010$\u001a\u00020\u0001\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\b*\u00020!2\u0006\u0010\"\u001a\u0002H\u0007¢\u0006\u0002\u0010%\u001a)\u0010&\u001a\u00020'\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\b*\u00020!2\u0006\u0010\"\u001a\u0002H\u0007¢\u0006\u0002\u0010(\u001a)\u0010)\u001a\u00020\u001a\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\b*\u00020!2\u0006\u0010\"\u001a\u0002H\u0007¢\u0006\u0002\u0010*\u001a)\u0010+\u001a\u00020,\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\b*\u00020!2\u0006\u0010\"\u001a\u0002H\u0007¢\u0006\u0002\u0010-\u001a)\u0010.\u001a\u00020/\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\b*\u00020!2\u0006\u0010\"\u001a\u0002H\u0007¢\u0006\u0002\u00100\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"-\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b8F¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"'\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, d2 = {"nextFrameTime", "", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "getNextFrameTime", "(Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;)F", "info", "Lcom/alightcreative/app/motion/scene/animators/AnimatorInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/alightcreative/app/motion/scene/animators/Animator;", "getInfo$annotations", "(Lcom/alightcreative/app/motion/scene/animators/Animator;)V", "getInfo", "(Lcom/alightcreative/app/motion/scene/animators/Animator;)Lcom/alightcreative/app/motion/scene/animators/AnimatorInfo;", "ALL_ANIMATORS", "", "", "getALL_ANIMATORS$annotations", "()V", "getALL_ANIMATORS", "()Ljava/util/List;", "ANIMATORS_BY_CLASS", "", "Lkotlin/reflect/KClass;", "getANIMATORS_BY_CLASS", "()Ljava/util/Map;", "iconResource", "", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOf;", "getIconResource", "(Lcom/alightcreative/app/motion/scene/animators/AnimatorOf;)I", "buildAnimatorInfo", "animatorClass", "getParamValue", "Lcom/alightcreative/app/motion/scene/animators/AnimatorParamInfo;", "animator", "(Lcom/alightcreative/app/motion/scene/animators/AnimatorParamInfo;Lcom/alightcreative/app/motion/scene/animators/Animator;)Ljava/lang/Object;", "getFloatParam", "(Lcom/alightcreative/app/motion/scene/animators/AnimatorParamInfo;Lcom/alightcreative/app/motion/scene/animators/Animator;)F", "getDoubleParam", "", "(Lcom/alightcreative/app/motion/scene/animators/AnimatorParamInfo;Lcom/alightcreative/app/motion/scene/animators/Animator;)D", "getIntParam", "(Lcom/alightcreative/app/motion/scene/animators/AnimatorParamInfo;Lcom/alightcreative/app/motion/scene/animators/Animator;)I", "getLongParam", "", "(Lcom/alightcreative/app/motion/scene/animators/AnimatorParamInfo;Lcom/alightcreative/app/motion/scene/animators/Animator;)J", "getBooleanParam", "", "(Lcom/alightcreative/app/motion/scene/animators/AnimatorParamInfo;Lcom/alightcreative/app/motion/scene/animators/Animator;)Z", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\ncom/alightcreative/app/motion/scene/animators/AnimatorKt\n+ 2 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n20#2:269\n20#2:272\n20#2:275\n20#2:278\n20#2:281\n20#2:284\n20#2:287\n20#2:290\n20#2:293\n20#2:296\n295#3,2:270\n295#3,2:273\n295#3,2:276\n295#3,2:279\n295#3,2:282\n295#3,2:285\n295#3,2:288\n295#3,2:291\n295#3,2:294\n295#3,2:297\n626#3,12:300\n1557#3:312\n1628#3,3:313\n1202#3,2:316\n1230#3,4:318\n1#4:299\n*S KotlinDebug\n*F\n+ 1 Animator.kt\ncom/alightcreative/app/motion/scene/animators/AnimatorKt\n*L\n172#1:269\n173#1:272\n176#1:275\n177#1:278\n178#1:281\n179#1:284\n180#1:287\n181#1:290\n182#1:293\n183#1:296\n172#1:270,2\n173#1:273,2\n176#1:276,2\n177#1:279,2\n178#1:282,2\n179#1:285,2\n180#1:288,2\n181#1:291,2\n182#1:294,2\n183#1:297,2\n225#1:300,12\n50#1:312\n50#1:313,3\n51#1:316,2\n51#1:318,4\n*E\n"})
public final class AnimatorKt {
    private static final List<AnimatorInfo<Object>> ALL_ANIMATORS;
    private static final Map<KClass<?>, AnimatorInfo<Object>> ANIMATORS_BY_CLASS;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimatorOf.values().length];
            try {
                iArr[AnimatorOf.Location.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimatorOf.Rotate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimatorOf.Orientation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnimatorOf.Scale.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnimatorOf.Skew.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnimatorOf.Color.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AnimatorOf.Gain.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AnimatorOf.Thickness.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AnimatorOf.Opacity.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AnimatorOf.Float.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AnimatorOf.Pivot.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String buildAnimatorInfo$lambda$4(String str, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return str;
    }

    public static /* synthetic */ void getALL_ANIMATORS$annotations() {
    }

    public static /* synthetic */ void getInfo$annotations(Animator animator) {
    }

    static {
        List<KClass> listPlus = CollectionsKt.plus((Collection) Reflection.getOrCreateKotlinClass(WaveAnimators.class).getNestedClasses(), (Iterable) Reflection.getOrCreateKotlinClass(ColorAnimators.class).getNestedClasses());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (KClass kClass : listPlus) {
            Intrinsics.checkNotNull(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<out com.alightcreative.app.motion.scene.animators.Animator<kotlin.Any>>");
            arrayList.add(buildAnimatorInfo(kClass));
        }
        ALL_ANIMATORS = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            KClass animatorClass = ((AnimatorInfo) obj).getAnimatorClass();
            Intrinsics.checkNotNull(animatorClass, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            linkedHashMap.put(animatorClass, obj);
        }
        ANIMATORS_BY_CLASS = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String buildAnimatorInfo$lambda$3(UILabel uILabel, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(uILabel.resourceId());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final List<AnimatorInfo<Object>> getALL_ANIMATORS() {
        return ALL_ANIMATORS;
    }

    public static final Map<KClass<?>, AnimatorInfo<Object>> getANIMATORS_BY_CLASS() {
        return ANIMATORS_BY_CLASS;
    }

    public static final <T extends Animator<? extends Object>> boolean getBooleanParam(AnimatorParamInfo animatorParamInfo, T animator) {
        Intrinsics.checkNotNullParameter(animatorParamInfo, "<this>");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object paramValue = getParamValue(animatorParamInfo, animator);
        if (paramValue instanceof Boolean) {
            return ((Boolean) paramValue).booleanValue();
        }
        throw new ClassCastException("Parameter '" + animatorParamInfo.getId() + "' is '" + paramValue.getClass().getSimpleName() + "'; don't know how to convert to Boolean");
    }

    public static final <T extends Animator<? extends Object>> double getDoubleParam(AnimatorParamInfo animatorParamInfo, T animator) {
        Intrinsics.checkNotNullParameter(animatorParamInfo, "<this>");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object paramValue = getParamValue(animatorParamInfo, animator);
        if (paramValue instanceof Float) {
            return ((Number) paramValue).floatValue();
        }
        if (paramValue instanceof Integer) {
            return ((Number) paramValue).intValue();
        }
        if (paramValue instanceof Double) {
            return ((Number) paramValue).doubleValue();
        }
        throw new ClassCastException("Parameter '" + animatorParamInfo.getId() + "' is '" + paramValue.getClass().getSimpleName() + "'; don't know how to convert to Double");
    }

    public static final <T extends Animator<? extends Object>> float getFloatParam(AnimatorParamInfo animatorParamInfo, T animator) {
        Intrinsics.checkNotNullParameter(animatorParamInfo, "<this>");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object paramValue = getParamValue(animatorParamInfo, animator);
        if (paramValue instanceof Float) {
            return ((Number) paramValue).floatValue();
        }
        if (paramValue instanceof Double) {
            return (float) ((Number) paramValue).doubleValue();
        }
        if (paramValue instanceof Integer) {
            return ((Number) paramValue).intValue();
        }
        throw new ClassCastException("Parameter '" + animatorParamInfo.getId() + "' is '" + paramValue.getClass().getSimpleName() + "'; don't know how to convert to Float");
    }

    public static final int getIconResource(AnimatorOf animatorOf) {
        Intrinsics.checkNotNullParameter(animatorOf, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[animatorOf.ordinal()]) {
            case 1:
                return 2131231043;
            case 2:
            case 3:
                return 2131231056;
            case 4:
                return 2131231057;
            case 5:
                return 2131231061;
            case 6:
                return 2131231017;
            case 7:
                return 2131231003;
            case 8:
                return 2131231555;
            case 9:
                return 2131231048;
            case 10:
                return 2131231027;
            case 11:
                return 2131231044;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final <T> AnimatorInfo<T> getInfo(Animator<T> animator) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Object obj = ANIMATORS_BY_CLASS.get(Reflection.getOrCreateKotlinClass(animator.getClass()));
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.animators.AnimatorInfo<T of com.alightcreative.app.motion.scene.animators.AnimatorKt.<get-info>>");
        return (AnimatorInfo) obj;
    }

    public static final <T extends Animator<? extends Object>> int getIntParam(AnimatorParamInfo animatorParamInfo, T animator) {
        Intrinsics.checkNotNullParameter(animatorParamInfo, "<this>");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object paramValue = getParamValue(animatorParamInfo, animator);
        if (paramValue instanceof Integer) {
            return ((Number) paramValue).intValue();
        }
        throw new ClassCastException("Parameter '" + animatorParamInfo.getId() + "' is '" + paramValue.getClass().getSimpleName() + "'; don't know how to convert to Int");
    }

    public static final <T extends Animator<? extends Object>> long getLongParam(AnimatorParamInfo animatorParamInfo, T animator) {
        Intrinsics.checkNotNullParameter(animatorParamInfo, "<this>");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object paramValue = getParamValue(animatorParamInfo, animator);
        if (paramValue instanceof Long) {
            return ((Number) paramValue).longValue();
        }
        if (paramValue instanceof Integer) {
            return ((Number) paramValue).intValue();
        }
        throw new ClassCastException("Parameter '" + animatorParamInfo.getId() + "' is '" + paramValue.getClass().getSimpleName() + "'; don't know how to convert to Long");
    }

    public static final float getNextFrameTime(AnimatorEnvironment animatorEnvironment) {
        Intrinsics.checkNotNullParameter(animatorEnvironment, "<this>");
        return animatorEnvironment.getTime() + (animatorEnvironment.getTime() - animatorEnvironment.getPreviousFrameTime());
    }

    public static final <T extends Animator<? extends Object>> Object getParamValue(AnimatorParamInfo animatorParamInfo, T animator) {
        Intrinsics.checkNotNullParameter(animatorParamInfo, "<this>");
        Intrinsics.checkNotNullParameter(animator, "animator");
        if (!animatorParamInfo.getParentAnimatorInfo().getAnimatorClass().isInstance(animator)) {
            throw new IllegalArgumentException(("Parameter is '" + animator.getClass().getSimpleName() + "' but expected '" + animatorParamInfo.getParentAnimatorInfo().getAnimatorClass().getSimpleName() + "'").toString());
        }
        Object obj = null;
        boolean z2 = false;
        for (Object obj2 : KClasses.getDeclaredMemberProperties(animatorParamInfo.getParentAnimatorInfo().getAnimatorClass())) {
            if (Intrinsics.areEqual(((KProperty1) obj2).getName(), animatorParamInfo.getId())) {
                if (z2) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z2 = true;
                obj = obj2;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.reflect.KProperty1<T of com.alightcreative.app.motion.scene.animators.AnimatorKt.getParamValue, kotlin.Any>");
        return ((KProperty1) obj).get(animator);
    }

    private static final <T> AnimatorInfo<T> buildAnimatorInfo(KClass<? extends Animator<T>> kClass) {
        T t3;
        T next;
        final String strId;
        T next2;
        T next3;
        T next4;
        T next5;
        T next6;
        T next7;
        T next8;
        T next9;
        Function1 function1;
        Iterator<T> it = kClass.getAnnotations().iterator();
        while (true) {
            t3 = null;
            if (it.hasNext()) {
                next = it.next();
                if (((Annotation) next) instanceof Id) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Id id = (Id) next;
        if (id != null && (strId = id.id()) != null) {
            Iterator<T> it2 = kClass.getAnnotations().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (((Annotation) next2) instanceof UILabel) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            final UILabel uILabel = (UILabel) next2;
            EnumSet enumSetNoneOf = EnumSet.noneOf(AnimatorOf.class);
            Iterator<T> it3 = kClass.getAnnotations().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next3 = it3.next();
                    if (((Annotation) next3) instanceof AnimatorOfRotate) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            if (((AnimatorOfRotate) next3) != null) {
                enumSetNoneOf.add(AnimatorOf.Rotate);
            }
            Iterator<T> it4 = kClass.getAnnotations().iterator();
            while (true) {
                if (it4.hasNext()) {
                    next4 = it4.next();
                    if (((Annotation) next4) instanceof AnimatorOfScale) {
                        break;
                    }
                } else {
                    next4 = null;
                    break;
                }
            }
            if (((AnimatorOfScale) next4) != null) {
                enumSetNoneOf.add(AnimatorOf.Scale);
            }
            Iterator<T> it5 = kClass.getAnnotations().iterator();
            while (true) {
                if (it5.hasNext()) {
                    next5 = it5.next();
                    if (((Annotation) next5) instanceof AnimatorOfSkew) {
                        break;
                    }
                } else {
                    next5 = null;
                    break;
                }
            }
            if (((AnimatorOfSkew) next5) != null) {
                enumSetNoneOf.add(AnimatorOf.Skew);
            }
            Iterator<T> it6 = kClass.getAnnotations().iterator();
            while (true) {
                if (it6.hasNext()) {
                    next6 = it6.next();
                    if (((Annotation) next6) instanceof AnimatorOfLocation) {
                        break;
                    }
                } else {
                    next6 = null;
                    break;
                }
            }
            if (((AnimatorOfLocation) next6) != null) {
                enumSetNoneOf.add(AnimatorOf.Location);
            }
            Iterator<T> it7 = kClass.getAnnotations().iterator();
            while (true) {
                if (it7.hasNext()) {
                    next7 = it7.next();
                    if (((Annotation) next7) instanceof AnimatorOfColor) {
                        break;
                    }
                } else {
                    next7 = null;
                    break;
                }
            }
            if (((AnimatorOfColor) next7) != null) {
                enumSetNoneOf.add(AnimatorOf.Color);
            }
            Iterator<T> it8 = kClass.getAnnotations().iterator();
            while (true) {
                if (it8.hasNext()) {
                    next8 = it8.next();
                    if (((Annotation) next8) instanceof AnimatorOfThickness) {
                        break;
                    }
                } else {
                    next8 = null;
                    break;
                }
            }
            if (((AnimatorOfThickness) next8) != null) {
                enumSetNoneOf.add(AnimatorOf.Thickness);
            }
            Iterator<T> it9 = kClass.getAnnotations().iterator();
            while (true) {
                if (it9.hasNext()) {
                    next9 = it9.next();
                    if (((Annotation) next9) instanceof AnimatorOfOpacity) {
                        break;
                    }
                } else {
                    next9 = null;
                    break;
                }
            }
            if (((AnimatorOfOpacity) next9) != null) {
                enumSetNoneOf.add(AnimatorOf.Opacity);
            }
            Iterator<T> it10 = kClass.getAnnotations().iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                T next10 = it10.next();
                if (((Annotation) next10) instanceof AnimatorOfGain) {
                    t3 = next10;
                    break;
                }
            }
            if (((AnimatorOfGain) t3) != null) {
                enumSetNoneOf.add(AnimatorOf.Gain);
            }
            if (uILabel != null) {
                function1 = new Function1() { // from class: VKY.Wre
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnimatorKt.buildAnimatorInfo$lambda$3(uILabel, (Context) obj);
                    }
                };
            } else {
                function1 = new Function1() { // from class: VKY.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnimatorKt.buildAnimatorInfo$lambda$4(strId, (Context) obj);
                    }
                };
            }
            Intrinsics.checkNotNull(enumSetNoneOf);
            return new AnimatorInfo<>(strId, kClass, function1, enumSetNoneOf);
        }
        throw new IllegalArgumentException();
    }
}
