package com.alightcreative.app.motion.scene.visualeffect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Lcom/alightcreative/app/motion/scene/visualeffect/PresetInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt$loadVisualEffectPresets$2$3", f = "VisualEffect.kt", i = {0, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {596, 597, 605, 611, 617}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "$this$sequence", "dropWords", "dropLetters", "$this$sequence", "dropWords", "dropLetters", "$this$sequence", "dropWords", "dropLetters"}, s = {"L$0", "L$0", "L$0", "I$0", "I$1", "L$0", "I$0", "I$1", "L$0", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nVisualEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisualEffect.kt\ncom/alightcreative/app/motion/scene/visualeffect/VisualEffectKt$loadVisualEffectPresets$2$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,777:1\n1557#2:778\n1628#2,2:779\n756#2,10:781\n1557#2:791\n1628#2,3:792\n1630#2:795\n1557#2:796\n1628#2,2:797\n756#2,10:799\n1557#2:809\n1628#2,3:810\n1630#2:814\n1557#2:815\n1628#2,2:816\n756#2,10:818\n1557#2:828\n1628#2,3:829\n1630#2:832\n1557#2:833\n1628#2,2:834\n756#2,10:836\n1557#2:846\n1628#2,3:847\n1630#2:850\n1#3:813\n*S KotlinDebug\n*F\n+ 1 VisualEffect.kt\ncom/alightcreative/app/motion/scene/visualeffect/VisualEffectKt$loadVisualEffectPresets$2$3\n*L\n598#1:778\n598#1:779,2\n599#1:781,10\n600#1:791\n600#1:792,3\n598#1:795\n606#1:796\n606#1:797,2\n607#1:799,10\n607#1:809\n607#1:810,3\n606#1:814\n612#1:815\n612#1:816,2\n613#1:818,10\n613#1:828\n613#1:829,3\n612#1:832\n618#1:833\n618#1:834,2\n619#1:836,10\n619#1:846\n619#1:847,3\n618#1:850\n*E\n"})
final class VisualEffectKt$loadVisualEffectPresets$2$3 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends PresetInfo>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<PresetInfo> $presetsWithWords;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VisualEffectKt$loadVisualEffectPresets$2$3(List<PresetInfo> list, Continuation<? super VisualEffectKt$loadVisualEffectPresets$2$3> continuation) {
        super(2, continuation);
        this.$presetsWithWords = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VisualEffectKt$loadVisualEffectPresets$2$3 visualEffectKt$loadVisualEffectPresets$2$3 = new VisualEffectKt$loadVisualEffectPresets$2$3(this.$presetsWithWords, continuation);
        visualEffectKt$loadVisualEffectPresets$2$3.L$0 = obj;
        return visualEffectKt$loadVisualEffectPresets$2$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super List<? extends PresetInfo>> sequenceScope, Continuation<? super Unit> continuation) {
        return invoke2((SequenceScope<? super List<PresetInfo>>) sequenceScope, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SequenceScope<? super List<PresetInfo>> sequenceScope, Continuation<? super Unit> continuation) {
        return ((VisualEffectKt$loadVisualEffectPresets$2$3) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0138, code lost:
    
        if (r2.yield(r13, r30) == r1) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fb A[PHI: r2 r12 r13
      0x02fb: PHI (r2v7 int) = (r2v8 int), (r2v19 int) binds: [B:107:0x02f7, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r12v6 int) = (r12v7 int), (r12v11 int) binds: [B:107:0x02f7, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r13v1 kotlin.sequences.SequenceScope) = (r13v2 kotlin.sequences.SequenceScope), (r13v19 kotlin.sequences.SequenceScope) binds: [B:107:0x02f7, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0235  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x03d2 -> B:10:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x013f -> B:49:0x0142). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        String strTake;
        int i2;
        int i3;
        int i5;
        SequenceScope sequenceScope2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        int i8 = 11;
        int i9 = 1;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            List listLoadVisualEffectPresets$lambda$67$updateCodes = VisualEffectKt.loadVisualEffectPresets$lambda$67$updateCodes(this.$presetsWithWords);
            this.L$0 = sequenceScope;
            this.label = 1;
            if (sequenceScope.yield(listLoadVisualEffectPresets$lambda$67$updateCodes, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i7 == 1) {
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else if (i7 == 2) {
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2 = 0;
            if (i2 < i8) {
            }
        } else {
            if (i7 == 3) {
                i5 = this.I$1;
                i3 = this.I$0;
                sequenceScope2 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                List<PresetInfo> list = this.$presetsWithWords;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                while (r4.hasNext()) {
                }
                this.L$0 = sequenceScope2;
                this.I$0 = i3;
                this.I$1 = i5;
                this.label = 4;
                if (sequenceScope2.yield(arrayList2, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i7 == 4) {
                i5 = this.I$1;
                i3 = this.I$0;
                sequenceScope2 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                List<PresetInfo> list2 = this.$presetsWithWords;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                while (r4.hasNext()) {
                }
                this.L$0 = sequenceScope2;
                this.I$0 = i3;
                this.I$1 = i5;
                this.label = 5;
                if (sequenceScope2.yield(arrayList, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i7 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i5 = this.I$1;
            i3 = this.I$0;
            sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            int i10 = 1;
            SequenceScope sequenceScope3 = sequenceScope2;
            i5++;
            i9 = i10;
            i8 = 11;
            if (i5 < i8) {
                List<PresetInfo> list3 = this.$presetsWithWords;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (PresetInfo presetInfo : list3) {
                    List<String> words = presetInfo.getWords();
                    ArrayList arrayList4 = new ArrayList();
                    int i11 = 0;
                    for (Object obj2 : words) {
                        if (i11 != 0) {
                            arrayList4.add(obj2);
                        } else if (!Intrinsics.areEqual((String) obj2, "Transition")) {
                            arrayList4.add(obj2);
                            i11 = i9;
                        }
                    }
                    List arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(StringsKt.dropLast(StringsKt.drop((String) it.next(), i5), i5));
                    }
                    if (arrayList5.size() > i3) {
                        arrayList5 = CollectionsKt.drop(arrayList5, i3);
                    }
                    arrayList3.add(PresetInfo.copy$default(presetInfo, null, arrayList5.size() >= 2 ? StringsKt.takeLast((String) CollectionsKt.first(arrayList5), i9) + StringsKt.take((String) CollectionsKt.first(CollectionsKt.drop(arrayList5, i9)), i9) : StringsKt.take((String) CollectionsKt.first(arrayList5), 2), null, 5, null));
                }
                this.L$0 = sequenceScope3;
                this.I$0 = i3;
                this.I$1 = i5;
                this.label = 3;
                if (sequenceScope3.yield(arrayList3, this) != coroutine_suspended) {
                    sequenceScope2 = sequenceScope3;
                    List<PresetInfo> list4 = this.$presetsWithWords;
                    arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    for (PresetInfo presetInfo2 : list4) {
                        List<String> words2 = presetInfo2.getWords();
                        ArrayList arrayList6 = new ArrayList();
                        boolean z2 = false;
                        for (Object obj3 : words2) {
                            if (z2) {
                                arrayList6.add(obj3);
                            } else if (!Intrinsics.areEqual((String) obj3, "Transition")) {
                                arrayList6.add(obj3);
                                z2 = true;
                            }
                        }
                        List arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                        Iterator it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            arrayList7.add(StringsKt.dropLast(StringsKt.drop((String) it2.next(), i5), i5));
                        }
                        if (arrayList7.size() > i3) {
                            arrayList7 = CollectionsKt.drop(arrayList7, i3);
                        }
                        arrayList2.add(PresetInfo.copy$default(presetInfo2, null, arrayList7.size() >= 2 ? StringsKt.take((String) CollectionsKt.first(arrayList7), 1) + StringsKt.take((String) CollectionsKt.first(CollectionsKt.drop(arrayList7, 1)), 1) : StringsKt.take((String) CollectionsKt.first(arrayList7), 2), null, 5, null));
                    }
                    this.L$0 = sequenceScope2;
                    this.I$0 = i3;
                    this.I$1 = i5;
                    this.label = 4;
                    if (sequenceScope2.yield(arrayList2, this) != coroutine_suspended) {
                        List<PresetInfo> list22 = this.$presetsWithWords;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                        for (PresetInfo presetInfo3 : list22) {
                            List<String> words3 = presetInfo3.getWords();
                            ArrayList arrayList8 = new ArrayList();
                            boolean z3 = false;
                            for (Object obj4 : words3) {
                                if (z3) {
                                    arrayList8.add(obj4);
                                } else if (!Intrinsics.areEqual((String) obj4, "Transition")) {
                                    arrayList8.add(obj4);
                                    z3 = true;
                                }
                            }
                            List arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
                            Iterator it3 = arrayList8.iterator();
                            while (it3.hasNext()) {
                                arrayList9.add(StringsKt.dropLast(StringsKt.drop((String) it3.next(), i5), i5));
                            }
                            if (arrayList9.size() > i3) {
                                arrayList9 = CollectionsKt.drop(arrayList9, i3);
                            }
                            arrayList.add(PresetInfo.copy$default(presetInfo3, null, arrayList9.size() >= 2 ? StringsKt.take((String) CollectionsKt.first(arrayList9), 1) + StringsKt.takeLast((String) CollectionsKt.first(CollectionsKt.drop(arrayList9, 1)), 1) : StringsKt.take((String) CollectionsKt.first(arrayList9), 2), null, 5, null));
                        }
                        this.L$0 = sequenceScope2;
                        this.I$0 = i3;
                        this.I$1 = i5;
                        this.label = 5;
                        if (sequenceScope2.yield(arrayList, this) != coroutine_suspended) {
                            i10 = 1;
                            SequenceScope sequenceScope32 = sequenceScope2;
                            i5++;
                            i9 = i10;
                            i8 = 11;
                            if (i5 < i8) {
                                SequenceScope sequenceScope4 = sequenceScope32;
                                i2 = i3 + 1;
                                sequenceScope = sequenceScope4;
                                i8 = 11;
                                if (i2 < i8) {
                                    return Unit.INSTANCE;
                                }
                                i3 = i2;
                                sequenceScope32 = sequenceScope;
                                i5 = 0;
                                if (i5 < i8) {
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
        List<PresetInfo> list5 = this.$presetsWithWords;
        ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
        for (PresetInfo presetInfo4 : list5) {
            List<String> words4 = presetInfo4.getWords();
            ArrayList arrayList11 = new ArrayList();
            boolean z4 = false;
            for (Object obj5 : words4) {
                if (z4) {
                    arrayList11.add(obj5);
                } else if (!Intrinsics.areEqual((String) obj5, "Transition")) {
                    arrayList11.add(obj5);
                    z4 = true;
                }
            }
            if (arrayList11.size() >= 2) {
                List listTake = CollectionsKt.take(arrayList11, 2);
                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
                Iterator it4 = listTake.iterator();
                while (it4.hasNext()) {
                    arrayList12.add(Boxing.boxChar(StringsKt.first((String) it4.next())));
                }
                strTake = CollectionsKt.joinToString$default(arrayList12, "", null, null, 0, null, null, 62, null);
            } else {
                strTake = StringsKt.take((String) CollectionsKt.first((List) arrayList11), 2);
            }
            arrayList10.add(PresetInfo.copy$default(presetInfo4, null, strTake, null, 5, null));
        }
        this.L$0 = sequenceScope;
        this.label = 2;
    }
}
