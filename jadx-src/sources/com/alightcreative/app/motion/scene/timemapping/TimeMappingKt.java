package com.alightcreative.app.motion.scene.timemapping;

import com.alightcreative.app.motion.easing.LinearEasing;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.vungle.ads.internal.protos.Sdk;
import d2n.Ml;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import w9.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\u0010\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00042\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\u00072\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\u0007*\f\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$\"$\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\"0\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020(*\b\u0012\u0004\u0012\u00020\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/alightcreative/app/motion/scene/Keyable;", "", "Ld2n/Ml;", "", "Lcom/bendingspoons/fellini/fmfoundation/domain/time/FMSourceTime;", "inTime", "Ld2n/j;", "Lcom/bendingspoons/fellini/fmfoundation/domain/time/FMItemDuration;", "itemDuration", "Lcom/bendingspoons/fellini/fmfoundation/domain/time/FMSourceDuration;", "maxSamplingIntervalDuration", "", "maxSamplingIntervals", "Lcom/alightcreative/app/motion/scene/timemapping/TimeMapping;", "toTimeMapping-Uq-o2Ic", "(Lcom/alightcreative/app/motion/scene/Keyable;JJJI)Lcom/alightcreative/app/motion/scene/timemapping/TimeMapping;", "toTimeMapping", "Lcom/alightcreative/app/motion/scene/Keyframe;", "prev", "next", "itemDurationBetween", "(Lcom/alightcreative/app/motion/scene/Keyframe;Lcom/alightcreative/app/motion/scene/Keyframe;)J", "", "Lcom/alightcreative/app/motion/scene/timemapping/InterpolatedKeyframe;", "interpolatedKeyframes", "(Lcom/alightcreative/app/motion/scene/Keyable;FI)Ljava/util/List;", "", "startSpeed", "endSpeed", "toItemDuration-NRlSrfw", "(JDD)J", "toItemDuration", "", "EASYING_SAMPLING_INTERVAL_MILLIS", "J", "EASYING_SAMPLING_MAX_INTERVALS", "I", "getCoercedAtLeastToMinSpeed", "(Lcom/alightcreative/app/motion/scene/Keyframe;)Lcom/alightcreative/app/motion/scene/Keyframe;", "coercedAtLeastToMinSpeed", "Lkotlin/Pair;", "getSpeedTimePair", "(Lcom/alightcreative/app/motion/scene/Keyframe;)Lkotlin/Pair;", "speedTimePair", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimeMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeMapping.kt\ncom/alightcreative/app/motion/scene/timemapping/TimeMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,147:1\n1#2:148\n1317#3,2:149\n*S KotlinDebug\n*F\n+ 1 TimeMapping.kt\ncom/alightcreative/app/motion/scene/timemapping/TimeMappingKt\n*L\n73#1:149,2\n*E\n"})
public final class TimeMappingKt {
    private static final long EASYING_SAMPLING_INTERVAL_MILLIS = 50;
    private static final int EASYING_SAMPLING_MAX_INTERVALS = 250;

    /* JADX INFO: renamed from: com.alightcreative.app.motion.scene.timemapping.TimeMappingKt$interpolatedKeyframes$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lcom/alightcreative/app/motion/scene/timemapping/InterpolatedKeyframe;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.alightcreative.app.motion.scene.timemapping.TimeMappingKt$interpolatedKeyframes$1", f = "TimeMapping.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2}, l = {116, 128, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$sequence", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "currentKeyframe", "$this$sequence", "currentKeyframe", "nextKeyframe", "newKeyframeTime", "actualSubIntervalDuration", "$this$sequence", "currentKeyframe", "nextKeyframe"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$4", "L$5", "F$1", "L$0", "L$1", "L$4"})
    @SourceDebugExtension({"SMAP\nTimeMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeMapping.kt\ncom/alightcreative/app/motion/scene/timemapping/TimeMappingKt$interpolatedKeyframes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,147:1\n1053#2:148\n32#3,2:149\n*S KotlinDebug\n*F\n+ 1 TimeMapping.kt\ncom/alightcreative/app/motion/scene/timemapping/TimeMappingKt$interpolatedKeyframes$1\n*L\n113#1:148\n118#1:149,2\n*E\n"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super InterpolatedKeyframe>, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $maxSamplingIntervalDuration;
        final /* synthetic */ int $maxSamplingIntervals;
        final /* synthetic */ Keyable<Float> $this_interpolatedKeyframes;
        float F$0;
        float F$1;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Keyable<Float> keyable, float f3, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_interpolatedKeyframes = keyable;
            this.$maxSamplingIntervalDuration = f3;
            this.$maxSamplingIntervals = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_interpolatedKeyframes, this.$maxSamplingIntervalDuration, this.$maxSamplingIntervals, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super InterpolatedKeyframe> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00c4, code lost:
        
            if (r7.yield(r9, r24) == r1) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01b8  */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01a8 -> B:8:0x0037). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            Iterator it;
            Ref.ObjectRef objectRef;
            float f3;
            int i2;
            Keyable<Float> keyable;
            SequenceScope sequenceScope2;
            Ref.ObjectRef objectRef2;
            Iterator it2;
            Keyframe keyframe;
            float f4;
            int i3;
            char c2;
            InterpolatedKeyframe interpolatedKeyframe;
            boolean z2;
            Ref.ObjectRef objectRef3;
            Keyable<Float> keyable2;
            Iterator it3;
            Keyframe keyframe2;
            Ref.FloatRef floatRef;
            float f5;
            float f6;
            int i5;
            SequenceScope sequenceScope3;
            int i7;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i8 = this.label;
            char c4 = 2;
            boolean z3 = true;
            if (i8 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.L$0;
                it = CollectionsKt.sortedWith(this.$this_interpolatedKeyframes.getKeyframes(), new Comparator() { // from class: com.alightcreative.app.motion.scene.timemapping.TimeMappingKt$interpolatedKeyframes$1$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t3, T t4) {
                        return ComparisonsKt.compareValues(Float.valueOf(((Keyframe) t3).getTime()), Float.valueOf(((Keyframe) t4).getTime()));
                    }
                }).iterator();
                if (!it.hasNext()) {
                    return Unit.INSTANCE;
                }
                objectRef = new Ref.ObjectRef();
                ?? next = it.next();
                objectRef.element = next;
                InterpolatedKeyframe interpolatedKeyframe2 = new InterpolatedKeyframe(TimeMappingKt.getCoercedAtLeastToMinSpeed((Keyframe) next), true);
                this.L$0 = sequenceScope;
                this.L$1 = it;
                this.L$2 = objectRef;
                this.label = 1;
            } else if (i8 == 1) {
                objectRef = (Ref.ObjectRef) this.L$2;
                it = (Iterator) this.L$1;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i8 == 2) {
                    int i9 = this.I$2;
                    i5 = this.I$1;
                    f6 = this.F$1;
                    i2 = this.I$0;
                    f5 = this.F$0;
                    floatRef = (Ref.FloatRef) this.L$5;
                    keyframe2 = (Keyframe) this.L$4;
                    it3 = (Iterator) this.L$3;
                    keyable2 = (Keyable) this.L$2;
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    sequenceScope3 = (SequenceScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    floatRef.element += f6;
                    i7 = i9 + 1;
                    c4 = 2;
                    z3 = true;
                    while (i7 < i5) {
                    }
                    i3 = i2;
                    f4 = f5;
                    keyframe = keyframe2;
                    it2 = it3;
                    keyable = keyable2;
                    objectRef2 = objectRef3;
                    sequenceScope2 = sequenceScope3;
                    boolean z4 = z3;
                    c2 = c4;
                    z2 = z4 ? 1 : 0;
                    interpolatedKeyframe = new InterpolatedKeyframe(keyframe, z2);
                    this.L$0 = sequenceScope2;
                    this.L$1 = objectRef2;
                    this.L$2 = keyable;
                    this.L$3 = it2;
                    this.L$4 = keyframe;
                    this.L$5 = null;
                    this.F$0 = f4;
                    this.I$0 = i3;
                    this.label = 3;
                    if (sequenceScope2.yield(interpolatedKeyframe, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = this.I$0;
                f4 = this.F$0;
                Keyframe keyframe3 = (Keyframe) this.L$4;
                it2 = (Iterator) this.L$3;
                Keyable<Float> keyable3 = (Keyable) this.L$2;
                Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.L$1;
                sequenceScope2 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                int i11 = i10;
                objectRef = objectRef4;
                Keyable<Float> keyable4 = keyable3;
                c2 = 2;
                z2 = true;
                T t3 = keyframe3;
                it = it2;
                float f7 = f4;
                sequenceScope = sequenceScope2;
                objectRef.element = t3;
                char c5 = c2;
                z3 = z2;
                c4 = c5;
                f3 = f7;
                i2 = i11;
                keyable = keyable4;
                if (it.hasNext()) {
                    Keyframe keyframe4 = (Keyframe) it.next();
                    if (keyframe4.getEasing() instanceof LinearEasing) {
                        sequenceScope2 = sequenceScope;
                        f4 = f3;
                        keyframe = keyframe4;
                        objectRef2 = objectRef;
                        i3 = i2;
                        it2 = it;
                        boolean z42 = z3;
                        c2 = c4;
                        z2 = z42 ? 1 : 0;
                        interpolatedKeyframe = new InterpolatedKeyframe(keyframe, z2);
                        this.L$0 = sequenceScope2;
                        this.L$1 = objectRef2;
                        this.L$2 = keyable;
                        this.L$3 = it2;
                        this.L$4 = keyframe;
                        this.L$5 = null;
                        this.F$0 = f4;
                        this.I$0 = i3;
                        this.label = 3;
                        if (sequenceScope2.yield(interpolatedKeyframe, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    float time = keyframe4.getTime() - ((Keyframe) objectRef.element).getTime();
                    int iCoerceAtMost = RangesKt.coerceAtMost((int) Math.ceil(time / f3), i2);
                    float f8 = time / iCoerceAtMost;
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = ((Keyframe) objectRef.element).getTime() + f8;
                    int i12 = iCoerceAtMost - (z3 ? 1 : 0);
                    it3 = it;
                    sequenceScope3 = sequenceScope;
                    i5 = i12;
                    Keyable<Float> keyable5 = keyable;
                    f5 = f3;
                    f6 = f8;
                    keyframe2 = keyframe4;
                    floatRef = floatRef2;
                    keyable2 = keyable5;
                    objectRef3 = objectRef;
                    i7 = 0;
                    while (i7 < i5) {
                        boolean z5 = z3;
                        InterpolatedKeyframe interpolatedKeyframe3 = new InterpolatedKeyframe(TimeMappingKt.getCoercedAtLeastToMinSpeed(new Keyframe(Boxing.boxFloat(((Number) KeyableKt.valueAtTime(keyable2, floatRef.element)).floatValue()), floatRef.element, null, null, 12, null)), false);
                        this.L$0 = sequenceScope3;
                        this.L$1 = objectRef3;
                        this.L$2 = keyable2;
                        this.L$3 = it3;
                        this.L$4 = keyframe2;
                        this.L$5 = floatRef;
                        this.F$0 = f5;
                        this.I$0 = i2;
                        this.F$1 = f6;
                        this.I$1 = i5;
                        this.I$2 = i7;
                        this.label = 2;
                        if (sequenceScope3.yield(interpolatedKeyframe3, this) == coroutine_suspended) {
                            break;
                        }
                        floatRef.element += f6;
                        i7++;
                        c4 = 2;
                        z3 = z5 ? 1 : 0;
                    }
                    i3 = i2;
                    f4 = f5;
                    keyframe = keyframe2;
                    it2 = it3;
                    keyable = keyable2;
                    objectRef2 = objectRef3;
                    sequenceScope2 = sequenceScope3;
                    boolean z422 = z3;
                    c2 = c4;
                    z2 = z422 ? 1 : 0;
                    interpolatedKeyframe = new InterpolatedKeyframe(keyframe, z2);
                    this.L$0 = sequenceScope2;
                    this.L$1 = objectRef2;
                    this.L$2 = keyable;
                    this.L$3 = it2;
                    this.L$4 = keyframe;
                    this.L$5 = null;
                    this.F$0 = f4;
                    this.I$0 = i3;
                    this.label = 3;
                    if (sequenceScope2.yield(interpolatedKeyframe, this) != coroutine_suspended) {
                        Keyable<Float> keyable6 = keyable;
                        i11 = i3;
                        objectRef = objectRef2;
                        keyable4 = keyable6;
                        t3 = keyframe;
                        it = it2;
                        float f72 = f4;
                        sequenceScope = sequenceScope2;
                        objectRef.element = t3;
                        char c52 = c2;
                        z3 = z2;
                        c4 = c52;
                        f3 = f72;
                        i2 = i11;
                        keyable = keyable4;
                        if (it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
            }
            f3 = this.$maxSamplingIntervalDuration;
            i2 = this.$maxSamplingIntervals;
            keyable = this.$this_interpolatedKeyframes;
            if (it.hasNext()) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyframe _get_coercedAtLeastToMinSpeed_$lambda$6(Keyframe keyframe, Keyframe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Keyframe.copy$default(keyframe, Float.valueOf(0.001f), 0.0f, null, null, 14, null);
    }

    private static final List<InterpolatedKeyframe> interpolatedKeyframes(Keyable<Float> keyable, float f3, int i2) {
        return SequencesKt.toList(SequencesKt.sequence(new AnonymousClass1(keyable, f3, i2, null)));
    }

    /* JADX INFO: renamed from: toItemDuration-NRlSrfw, reason: not valid java name */
    private static final long m16toItemDurationNRlSrfw(long j2, double d2, double d4) {
        return d2n.j.f63374t.O((((double) 2) * d2n.j.HI(j2)) / (d2 + d4));
    }

    /* JADX INFO: renamed from: toTimeMapping-Uq-o2Ic, reason: not valid java name */
    public static final TimeMapping m17toTimeMappingUqo2Ic(Keyable<Float> toTimeMapping, final long j2, long j3, long j4, int i2) {
        long jHI;
        Intrinsics.checkNotNullParameter(toTimeMapping, "$this$toTimeMapping");
        if (d2n.j.nr(j3, d2n.j.f63374t.t(1L)) < 0) {
            throw new IllegalStateException(("Cannot apply time mapping to an element with duration less than 1ms! Duration: " + d2n.j.S(j3)).toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<InterpolatedKeyframe> listInterpolatedKeyframes = interpolatedKeyframes(toTimeMapping, j4, i2);
        float f3 = j2;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(SpeedComputationKt.speedValueAtTime(toTimeMapping, f3), 0.001f);
        if (((InterpolatedKeyframe) CollectionsKt.first((List) listInterpolatedKeyframes)).getKeyframe().getTime() < f3) {
            long jItemDurationBetween = 0;
            for (Pair pair : SequencesKt.zipWithNext(SequencesKt.plus((Sequence<? extends Keyframe>) SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(listInterpolatedKeyframes), new Function1() { // from class: com.alightcreative.app.motion.scene.timemapping.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TimeMappingKt.toTimeMapping_Uq_o2Ic$lambda$1(j2, (InterpolatedKeyframe) obj));
                }
            }), new Function1() { // from class: com.alightcreative.app.motion.scene.timemapping.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TimeMappingKt.toTimeMapping_Uq_o2Ic$lambda$2((InterpolatedKeyframe) obj);
                }
            }), new Keyframe(Float.valueOf(fCoerceAtLeast), f3, null, null, 12, null)))) {
                jItemDurationBetween += itemDurationBetween((Keyframe) pair.component1(), (Keyframe) pair.component2());
            }
            jHI = Ml.f63370t.t(-jItemDurationBetween);
        } else {
            jHI = Ml.HI(Ml.f63370t.J2(), itemDurationBetween(new Keyframe(Float.valueOf(fCoerceAtLeast), f3, null, null, 12, null), ((InterpolatedKeyframe) CollectionsKt.first((List) listInterpolatedKeyframes)).getKeyframe()));
        }
        for (Pair pair2 : SequencesKt.zipWithNext(SequencesKt.plus((Sequence<? extends Object>) CollectionsKt.asSequence(listInterpolatedKeyframes), CollectionsKt.last((List) listInterpolatedKeyframes)))) {
            InterpolatedKeyframe interpolatedKeyframe = (InterpolatedKeyframe) pair2.component1();
            InterpolatedKeyframe interpolatedKeyframe2 = (InterpolatedKeyframe) pair2.component2();
            arrayList2.add(TuplesKt.to(Ml.rl(jHI), Double.valueOf(interpolatedKeyframe.getKeyframe().getValue().floatValue())));
            if (interpolatedKeyframe.isOriginal()) {
                arrayList.add(Keyframe.copy$default(interpolatedKeyframe.getKeyframe(), null, jHI / j3, null, null, 13, null));
            }
            jHI = Ml.HI(jHI, itemDurationBetween(interpolatedKeyframe.getKeyframe(), interpolatedKeyframe2.getKeyframe()));
        }
        return new TimeMapping(new KeyableFloat(toTimeMapping.getKeyed(), arrayList, CollectionsKt.emptyList()), new H7v.j(new H7v.Ml(MapsKt.toMap(arrayList2)), H7v.w6.LINEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toTimeMapping_Uq_o2Ic$lambda$1(long j2, InterpolatedKeyframe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKeyframe().getTime() < ((float) j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyframe toTimeMapping_Uq_o2Ic$lambda$2(InterpolatedKeyframe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKeyframe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyframe<Float> getCoercedAtLeastToMinSpeed(final Keyframe<Float> keyframe) {
        boolean z2;
        if (keyframe.getValue().floatValue() < 0.001f) {
            z2 = true;
        } else {
            z2 = false;
        }
        return (Keyframe) Wre.n(keyframe, z2, new Function1() { // from class: com.alightcreative.app.motion.scene.timemapping.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TimeMappingKt._get_coercedAtLeastToMinSpeed_$lambda$6(keyframe, (Keyframe) obj);
            }
        });
    }

    private static final Pair<Double, Ml> getSpeedTimePair(Keyframe<Float> keyframe) {
        return TuplesKt.to(Double.valueOf(keyframe.getValue().floatValue()), Ml.rl(Ml.f63370t.t((long) keyframe.getTime())));
    }

    private static final long itemDurationBetween(Keyframe<Float> keyframe, Keyframe<Float> keyframe2) {
        Pair<Double, Ml> speedTimePair = getSpeedTimePair(keyframe);
        double dDoubleValue = speedTimePair.component1().doubleValue();
        long jIk = speedTimePair.component2().Ik();
        Pair<Double, Ml> speedTimePair2 = getSpeedTimePair(keyframe2);
        return m16toItemDurationNRlSrfw(Ml.az(speedTimePair2.component2().Ik(), jIk), dDoubleValue, speedTimePair2.component1().doubleValue());
    }
}
