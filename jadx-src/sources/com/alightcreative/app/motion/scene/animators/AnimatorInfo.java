package com.alightcreative.app.motion.scene.animators;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.alightcreative.app.motion.scene.animators.AnimatorInfo;
import com.alightcreative.app.motion.scene.animators.UIControl;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.ReflectJvmMapping;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JW\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/AnimatorInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "id", "", "animatorClass", "Lkotlin/reflect/KClass;", "Lcom/alightcreative/app/motion/scene/animators/Animator;", "getLabel", "Lkotlin/Function1;", "Landroid/content/Context;", "categories", "", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOf;", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Ljava/util/Set;)V", "getId", "()Ljava/lang/String;", "getAnimatorClass", "()Lkotlin/reflect/KClass;", "getGetLabel", "()Lkotlin/jvm/functions/Function1;", "getCategories", "()Ljava/util/Set;", "makeInstance", "parameters", "", "Lcom/alightcreative/app/motion/scene/animators/AnimatorParamInfo;", "getParameters", "()Ljava/util/List;", "parameters$delegate", "Lkotlin/Lazy;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\ncom/alightcreative/app/motion/scene/animators/AnimatorInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ReflectionExt.kt\ncom/alightcreative/ext/ReflectionExtKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,268:1\n1557#2:269\n1628#2,2:270\n1630#2:281\n9#3:272\n9#3:275\n9#3:278\n1310#4,2:273\n1310#4,2:276\n1310#4,2:279\n*S KotlinDebug\n*F\n+ 1 Animator.kt\ncom/alightcreative/app/motion/scene/animators/AnimatorInfo\n*L\n140#1:269\n140#1:270,2\n140#1:281\n141#1:272\n142#1:275\n143#1:278\n141#1:273,2\n142#1:276,2\n143#1:279,2\n*E\n"})
public final /* data */ class AnimatorInfo<T> {
    public static final int $stable = 8;
    private final KClass<? extends Animator<T>> animatorClass;
    private final Set<AnimatorOf> categories;
    private final Function1<Context, String> getLabel;
    private final String id;

    /* JADX INFO: renamed from: parameters$delegate, reason: from kotlin metadata */
    private final Lazy parameters;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimatorInfo copy$default(AnimatorInfo animatorInfo, String str, KClass kClass, Function1 function1, Set set, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = animatorInfo.id;
        }
        if ((i2 & 2) != 0) {
            kClass = animatorInfo.animatorClass;
        }
        if ((i2 & 4) != 0) {
            function1 = animatorInfo.getLabel;
        }
        if ((i2 & 8) != 0) {
            set = animatorInfo.categories;
        }
        return animatorInfo.copy(str, kClass, function1, set);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final KClass<? extends Animator<T>> component2() {
        return this.animatorClass;
    }

    public final Function1<Context, String> component3() {
        return this.getLabel;
    }

    public final Set<AnimatorOf> component4() {
        return this.categories;
    }

    public final AnimatorInfo<T> copy(String id, KClass<? extends Animator<T>> animatorClass, Function1<? super Context, String> getLabel, Set<? extends AnimatorOf> categories) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(animatorClass, "animatorClass");
        Intrinsics.checkNotNullParameter(getLabel, "getLabel");
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new AnimatorInfo<>(id, animatorClass, getLabel, categories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatorInfo)) {
            return false;
        }
        AnimatorInfo animatorInfo = (AnimatorInfo) other;
        return Intrinsics.areEqual(this.id, animatorInfo.id) && Intrinsics.areEqual(this.animatorClass, animatorInfo.animatorClass) && Intrinsics.areEqual(this.getLabel, animatorInfo.getLabel) && Intrinsics.areEqual(this.categories, animatorInfo.categories);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.animatorClass.hashCode()) * 31) + this.getLabel.hashCode()) * 31) + this.categories.hashCode();
    }

    public String toString() {
        return "AnimatorInfo(id=" + this.id + ", animatorClass=" + this.animatorClass + ", getLabel=" + this.getLabel + ", categories=" + this.categories + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorInfo(String id, KClass<? extends Animator<T>> animatorClass, Function1<? super Context, String> getLabel, Set<? extends AnimatorOf> categories) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(animatorClass, "animatorClass");
        Intrinsics.checkNotNullParameter(getLabel, "getLabel");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.id = id;
        this.animatorClass = animatorClass;
        this.getLabel = getLabel;
        this.categories = categories;
        this.parameters = LazyKt.lazy(new Function0() { // from class: VKY.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimatorInfo.parameters_delegate$lambda$5(this.f10869n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List parameters_delegate$lambda$5(AnimatorInfo animatorInfo) {
        Annotation annotation;
        Annotation annotation2;
        UIControl slider;
        Annotation[] annotations;
        Annotation[] annotations2;
        Annotation[] annotations3;
        Collection<KProperty1> declaredMemberProperties = KClasses.getDeclaredMemberProperties(animatorInfo.animatorClass);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(declaredMemberProperties, 10));
        for (final KProperty1 kProperty1 : declaredMemberProperties) {
            Field javaField = ReflectJvmMapping.getJavaField(kProperty1);
            int i2 = 0;
            Annotation annotation3 = null;
            if (javaField == null || (annotations3 = javaField.getAnnotations()) == null) {
                annotation = null;
            } else {
                int length = annotations3.length;
                for (int i3 = 0; i3 < length; i3++) {
                    annotation = annotations3[i3];
                    if (annotation instanceof UILabel) {
                        break;
                    }
                }
                annotation = null;
            }
            final UILabel uILabel = (UILabel) annotation;
            Field javaField2 = ReflectJvmMapping.getJavaField(kProperty1);
            if (javaField2 == null || (annotations2 = javaField2.getAnnotations()) == null) {
                annotation2 = null;
            } else {
                int length2 = annotations2.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    annotation2 = annotations2[i5];
                    if (annotation2 instanceof UIControlSlider) {
                        break;
                    }
                }
                annotation2 = null;
            }
            UIControlSlider uIControlSlider = (UIControlSlider) annotation2;
            Field javaField3 = ReflectJvmMapping.getJavaField(kProperty1);
            if (javaField3 != null && (annotations = javaField3.getAnnotations()) != null) {
                int length3 = annotations.length;
                while (true) {
                    if (i2 >= length3) {
                        break;
                    }
                    Annotation annotation4 = annotations[i2];
                    if (annotation4 instanceof UIControlSwitch) {
                        annotation3 = annotation4;
                        break;
                    }
                    i2++;
                }
            }
            final UIControlSwitch uIControlSwitch = (UIControlSwitch) annotation3;
            String name = kProperty1.getName();
            Function1 function1 = uILabel != null ? new Function1() { // from class: VKY.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnimatorInfo.parameters_delegate$lambda$5$lambda$4$lambda$0(uILabel, (Context) obj);
                }
            } : new Function1() { // from class: VKY.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnimatorInfo.parameters_delegate$lambda$5$lambda$4$lambda$1(kProperty1, (Context) obj);
                }
            };
            if (uIControlSlider != null) {
                slider = new UIControl.Slider(uIControlSlider.min(), uIControlSlider.max(), uIControlSlider.steps());
            } else if (uIControlSwitch != null) {
                slider = new UIControl.Switch(new Function2() { // from class: VKY.w6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AnimatorInfo.parameters_delegate$lambda$5$lambda$4$lambda$2(uIControlSwitch, (Context) obj, ((Boolean) obj2).booleanValue());
                    }
                });
            } else {
                KClassifier classifier = kProperty1.getReturnType().getClassifier();
                if (Intrinsics.areEqual(classifier, Reflection.getOrCreateKotlinClass(Float.TYPE)) || Intrinsics.areEqual(classifier, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    slider = new UIControl.Slider(0.0d, 100.0d, 200);
                } else if (Intrinsics.areEqual(classifier, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    slider = new UIControl.Slider(0.0d, 100.0d, 100);
                } else {
                    if (!Intrinsics.areEqual(classifier, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        throw new UnsupportedOperationException("Animator property '" + kProperty1.getName() + "' missing UI control annotation and could not infer from type.");
                    }
                    slider = new UIControl.Switch(new Function2() { // from class: VKY.Ml
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AnimatorInfo.parameters_delegate$lambda$5$lambda$4$lambda$3((Context) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
            }
            arrayList.add(new AnimatorParamInfo(name, function1, slider, animatorInfo));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parameters_delegate$lambda$5$lambda$4$lambda$0(UILabel uILabel, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(uILabel.resourceId());
        Intrinsics.checkNotNullExpressionValue(string, QiDPjiOCZHDS.uWo);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parameters_delegate$lambda$5$lambda$4$lambda$1(KProperty1 kProperty1, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kProperty1.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parameters_delegate$lambda$5$lambda$4$lambda$2(UIControlSwitch uIControlSwitch, Context context, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(z2 ? uIControlSwitch.onResourceId() : uIControlSwitch.offResourceId());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parameters_delegate$lambda$5$lambda$4$lambda$3(Context context, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        return z2 ? "On" : "Off";
    }

    public final KClass<? extends Animator<T>> getAnimatorClass() {
        return this.animatorClass;
    }

    public final Set<AnimatorOf> getCategories() {
        return this.categories;
    }

    public final Function1<Context, String> getGetLabel() {
        return this.getLabel;
    }

    public final String getId() {
        return this.id;
    }

    public final List<AnimatorParamInfo> getParameters() {
        return (List) this.parameters.getValue();
    }

    public final Animator<T> makeInstance() {
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(this.animatorClass);
        Animator<T> animator = primaryConstructor != null ? (Animator) primaryConstructor.callBy(MapsKt.emptyMap()) : null;
        Intrinsics.checkNotNull(animator, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.animators.Animator<T of com.alightcreative.app.motion.scene.animators.AnimatorInfo>");
        return animator;
    }
}
