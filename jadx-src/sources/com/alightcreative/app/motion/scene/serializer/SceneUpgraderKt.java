package com.alightcreative.app.motion.scene.serializer;

import XoT.qz;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.PrecomposeType;
import com.alightcreative.app.motion.scene.ReTimingMethod;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneElementTypeKt;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$1$lens$1;
import com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$2$lens$1;
import com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$2$lens$2;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.app.motion.scene.serializer.SceneUpgraderKt;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
import oA.C;
import oA.aC;
import oA.j;
import oA.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"upgradeIfNeeded", "Lcom/alightcreative/app/motion/scene/Scene;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneUpgrader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneUpgrader.kt\ncom/alightcreative/app/motion/scene/serializer/SceneUpgraderKt\n+ 2 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Lens.kt\ncom/alightcreative/lens/LensKt\n*L\n1#1,161:1\n820#2,2:162\n822#2:166\n823#2,5:177\n830#2,13:183\n820#2,2:196\n822#2:200\n823#2,5:211\n830#2,4:217\n834#2,6:223\n841#2,2:230\n820#2,2:232\n822#2:236\n823#2,5:247\n830#2,4:253\n834#2,6:259\n841#2,2:266\n797#2,2:268\n799#2,5:271\n806#2,4:277\n810#2,5:282\n816#2,2:288\n1872#3,2:164\n1874#3:182\n1872#3,2:198\n1874#3:216\n1872#3,2:221\n1874#3:229\n1872#3,2:234\n1874#3:252\n1872#3,2:257\n1874#3:265\n1863#3:270\n1864#3:276\n1863#3:281\n1864#3:287\n1755#3,3:290\n150#4:167\n124#4,9:168\n150#4:201\n124#4,9:202\n150#4:237\n124#4,9:238\n*S KotlinDebug\n*F\n+ 1 SceneUpgrader.kt\ncom/alightcreative/app/motion/scene/serializer/SceneUpgraderKt\n*L\n33#1:162,2\n33#1:166\n33#1:177,5\n33#1:183,13\n46#1:196,2\n46#1:200\n46#1:211,5\n46#1:217,4\n46#1:223,6\n46#1:230,2\n116#1:232,2\n116#1:236\n116#1:247,5\n116#1:253,4\n116#1:259,6\n116#1:266,2\n129#1:268,2\n129#1:271,5\n129#1:277,4\n129#1:282,5\n129#1:288,2\n33#1:164,2\n33#1:182\n46#1:198,2\n46#1:216\n46#1:221,2\n46#1:229\n116#1:234,2\n116#1:252\n116#1:257,2\n116#1:265\n129#1:270\n129#1:276\n129#1:281\n129#1:287\n108#1:290,3\n33#1:167\n33#1:168,9\n46#1:201\n46#1:202,9\n116#1:237\n116#1:238,9\n*E\n"})
public final class SceneUpgraderKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SceneType.values().length];
            try {
                iArr[SceneType.SCENE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SceneType.ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Scene upgradeIfNeeded(Scene scene) {
        int i2;
        int i3;
        Scene sceneCopy$default;
        Scene sceneCopy$default2;
        Pair pair;
        Pair pair2;
        char c2;
        char c4;
        Object objT;
        Object obj;
        Object obj2;
        Pair pair3;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        if (scene.getFormatVersion() == 106) {
            return scene;
        }
        int framesPerHundredSeconds = 100000 / scene.getFramesPerHundredSeconds();
        if (scene.getFormatVersion() < 101) {
            i2 = framesPerHundredSeconds;
            i3 = 1;
            sceneCopy$default = Scene.copy$default(scene, null, 101, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048573, null);
        } else {
            i2 = framesPerHundredSeconds;
            i3 = 1;
            sceneCopy$default = scene;
        }
        int formatVersion = sceneCopy$default.getFormatVersion();
        Scene sceneCopy$default3 = sceneCopy$default;
        if (formatVersion < 102) {
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            Object obj3 = sceneCopy$default;
            for (Object obj4 : sceneCopy$default.getElements()) {
                int i7 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SceneElement sceneElement = (SceneElement) obj4;
                C c5 = new C(Reflection.getOrCreateKotlinClass(Scene.class), KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Scene.class), null, false, null, 7, null));
                SceneKt$forEachElementRecursiveWithLens$1$lens$1 sceneKt$forEachElementRecursiveWithLens$1$lens$1 = SceneKt$forEachElementRecursiveWithLens$1$lens$1.INSTANCE;
                aC aCVar = new aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$1$lens$1.getReturnType(), c5, sceneKt$forEachElementRecursiveWithLens$1$lens$1);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Scene.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                w6 w6Var = new w6(orCreateKotlinClass, type, aCVar, i5);
                SceneElement sceneElement2 = (SceneElement) w6Var.get(obj3);
                Object objT2 = obj3;
                if (SceneElementTypeKt.getSupportsIntrinsicFill(sceneElement2.getType())) {
                    objT2 = obj3;
                    if (sceneElement2.getFillType() == FillType.NONE) {
                        objT2 = w6Var.t(obj3, new Function1() { // from class: dmX.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                return SceneUpgraderKt.upgradeIfNeeded$lambda$1$lambda$0((SceneElement) obj5);
                            }
                        });
                    }
                }
                if (sceneElement.getType().getHasNestedScene()) {
                    arrayList.add(TuplesKt.to(w6Var, sceneElement.getNestedScene()));
                }
                i5 = i7;
                obj3 = objT2;
            }
            do {
                pair3 = (Pair) qz.n(arrayList);
                if (pair3 != null) {
                    j jVar = (j) pair3.component1();
                    int i8 = 0;
                    obj3 = obj3;
                    for (Object obj5 : ((Scene) pair3.component2()).getElements()) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        SceneElement sceneElement3 = (SceneElement) obj5;
                        SceneKt$forEachElementRecursiveWithLens$2$lens$1 sceneKt$forEachElementRecursiveWithLens$2$lens$1 = SceneKt$forEachElementRecursiveWithLens$2$lens$1.INSTANCE;
                        aC aCVar2 = new aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$1.getReturnType(), jVar, sceneKt$forEachElementRecursiveWithLens$2$lens$1);
                        SceneKt$forEachElementRecursiveWithLens$2$lens$2 sceneKt$forEachElementRecursiveWithLens$2$lens$2 = SceneKt$forEachElementRecursiveWithLens$2$lens$2.INSTANCE;
                        aC aCVar3 = new aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$2.getReturnType(), aCVar2, sceneKt$forEachElementRecursiveWithLens$2$lens$2);
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Scene.class);
                        KType type2 = aCVar3.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type2);
                        w6 w6Var2 = new w6(orCreateKotlinClass2, type2, aCVar3, i8);
                        SceneElement sceneElement4 = (SceneElement) w6Var2.get(obj3);
                        Object objT3 = obj3;
                        if (SceneElementTypeKt.getSupportsIntrinsicFill(sceneElement4.getType())) {
                            objT3 = obj3;
                            if (sceneElement4.getFillType() == FillType.NONE) {
                                objT3 = w6Var2.t(obj3, new Function1() { // from class: dmX.n
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj52) {
                                        return SceneUpgraderKt.upgradeIfNeeded$lambda$1$lambda$0((SceneElement) obj52);
                                    }
                                });
                            }
                        }
                        if (sceneElement3.getType().getHasNestedScene()) {
                            arrayList.add(TuplesKt.to(w6Var2, sceneElement3.getNestedScene()));
                        }
                        i8 = i9;
                        obj3 = objT3;
                    }
                }
            } while (pair3 != null);
            sceneCopy$default3 = Scene.copy$default((Scene) obj3, null, 102, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048573, null);
        }
        int formatVersion2 = sceneCopy$default3.getFormatVersion();
        Scene sceneCopy$default4 = sceneCopy$default3;
        if (formatVersion2 < 103) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = sceneCopy$default3.getElements().iterator();
            int i10 = 0;
            Object obj6 = sceneCopy$default3;
            while (true) {
                c2 = 2;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SceneElement sceneElement5 = (SceneElement) next;
                C c6 = new C(Reflection.getOrCreateKotlinClass(Scene.class), KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Scene.class), null, false, null, 7, null));
                SceneKt$forEachElementRecursiveWithLens$1$lens$1 sceneKt$forEachElementRecursiveWithLens$1$lens$12 = SceneKt$forEachElementRecursiveWithLens$1$lens$1.INSTANCE;
                aC aCVar4 = new aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$1$lens$12.getReturnType(), c6, sceneKt$forEachElementRecursiveWithLens$1$lens$12);
                KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Scene.class);
                KType type3 = aCVar4.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type3);
                w6 w6Var3 = new w6(orCreateKotlinClass3, type3, aCVar4, i10);
                final SceneElement sceneElement6 = (SceneElement) w6Var3.get(obj6);
                int i12 = Math.abs(SceneKt.getDuration(sceneElement6.getNestedScene()) - (sceneElement6.getEndTime() - sceneElement6.getStartTime())) < i2 ? i3 : 0;
                Object objT4 = obj6;
                if (sceneElement6.getType() == SceneElementType.Scene) {
                    int i13 = WhenMappings.$EnumSwitchMapping$0[sceneElement6.getNestedScene().getType().ordinal()];
                    Object objT5 = obj6;
                    if (i13 != i3) {
                        if (i13 == 2) {
                            objT5 = obj6;
                            if (sceneElement6.getLinkedSceneUUID() == null) {
                                objT5 = obj6;
                                objT5 = obj6;
                                if (sceneElement6.getNestedScene().getReTimingMethod() == ReTimingMethod.FREEZE && i12 != 0) {
                                    objT5 = w6Var3.t(obj6, new Function1() { // from class: dmX.Wre
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            return SceneUpgraderKt.upgradeIfNeeded$lambda$6$lambda$4((SceneElement) obj7);
                                        }
                                    });
                                }
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        obj2 = objT5;
                    } else {
                        Object objT6 = (sceneElement6.getLinkedSceneUUID() != null || i12 == 0) ? w6Var3.t(obj6, new Function1() { // from class: dmX.I28
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                return SceneUpgraderKt.upgradeIfNeeded$lambda$6$lambda$3(sceneElement6, (SceneElement) obj7);
                            }
                        }) : w6Var3.t(obj6, new Function1() { // from class: dmX.Ml
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                return SceneUpgraderKt.upgradeIfNeeded$lambda$6$lambda$2((SceneElement) obj7);
                            }
                        });
                        Unit unit2 = Unit.INSTANCE;
                        obj2 = objT6;
                    }
                    objT4 = w6Var3.t(obj2, new Function1() { // from class: dmX.CN3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            return SceneUpgraderKt.upgradeIfNeeded$lambda$6$lambda$5((SceneElement) obj7);
                        }
                    });
                }
                if (sceneElement5.getType().getHasNestedScene()) {
                    arrayList2.add(TuplesKt.to(w6Var3, sceneElement5.getNestedScene()));
                }
                i10 = i11;
                i3 = 1;
                obj6 = objT4;
            }
            while (true) {
                Pair pair4 = (Pair) qz.n(arrayList2);
                if (pair4 != null) {
                    j jVar2 = (j) pair4.component1();
                    int i14 = 0;
                    obj6 = obj6;
                    for (Object obj7 : ((Scene) pair4.component2()).getElements()) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        SceneElement sceneElement7 = (SceneElement) obj7;
                        SceneKt$forEachElementRecursiveWithLens$2$lens$1 sceneKt$forEachElementRecursiveWithLens$2$lens$12 = SceneKt$forEachElementRecursiveWithLens$2$lens$1.INSTANCE;
                        aC aCVar5 = new aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$12.getReturnType(), jVar2, sceneKt$forEachElementRecursiveWithLens$2$lens$12);
                        SceneKt$forEachElementRecursiveWithLens$2$lens$2 sceneKt$forEachElementRecursiveWithLens$2$lens$22 = SceneKt$forEachElementRecursiveWithLens$2$lens$2.INSTANCE;
                        aC aCVar6 = new aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$22.getReturnType(), aCVar5, sceneKt$forEachElementRecursiveWithLens$2$lens$22);
                        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Scene.class);
                        KType type4 = aCVar6.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type4);
                        w6 w6Var4 = new w6(orCreateKotlinClass4, type4, aCVar6, i14);
                        final SceneElement sceneElement8 = (SceneElement) w6Var4.get(obj6);
                        boolean z2 = Math.abs(SceneKt.getDuration(sceneElement8.getNestedScene()) - (sceneElement8.getEndTime() - sceneElement8.getStartTime())) < i2;
                        if (sceneElement8.getType() == SceneElementType.Scene) {
                            int i16 = WhenMappings.$EnumSwitchMapping$0[sceneElement8.getNestedScene().getType().ordinal()];
                            if (i16 != 1) {
                                c4 = 2;
                                Object objT7 = obj6;
                                if (i16 == 2) {
                                    objT7 = obj6;
                                    if (sceneElement8.getLinkedSceneUUID() == null) {
                                        objT7 = obj6;
                                        objT7 = obj6;
                                        if (sceneElement8.getNestedScene().getReTimingMethod() == ReTimingMethod.FREEZE && z2) {
                                            objT7 = w6Var4.t(obj6, new Function1() { // from class: dmX.Wre
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj72) {
                                                    return SceneUpgraderKt.upgradeIfNeeded$lambda$6$lambda$4((SceneElement) obj72);
                                                }
                                            });
                                        }
                                    }
                                }
                                Unit unit3 = Unit.INSTANCE;
                                obj = objT7;
                            } else {
                                c4 = 2;
                                Object objT8 = (sceneElement8.getLinkedSceneUUID() == null && z2) ? w6Var4.t(obj6, new Function1() { // from class: dmX.Ml
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj72) {
                                        return SceneUpgraderKt.upgradeIfNeeded$lambda$6$lambda$2((SceneElement) obj72);
                                    }
                                }) : w6Var4.t(obj6, new Function1() { // from class: dmX.I28
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj72) {
                                        return SceneUpgraderKt.upgradeIfNeeded$lambda$6$lambda$3(sceneElement8, (SceneElement) obj72);
                                    }
                                });
                                Unit unit4 = Unit.INSTANCE;
                                obj = objT8;
                            }
                            objT = w6Var4.t(obj, new Function1() { // from class: dmX.CN3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj72) {
                                    return SceneUpgraderKt.upgradeIfNeeded$lambda$6$lambda$5((SceneElement) obj72);
                                }
                            });
                        } else {
                            c4 = 2;
                            objT = obj6;
                        }
                        if (sceneElement7.getType().getHasNestedScene()) {
                            arrayList2.add(TuplesKt.to(w6Var4, sceneElement7.getNestedScene()));
                        }
                        i14 = i15;
                        c2 = c4;
                        obj6 = objT;
                    }
                }
                char c7 = c2;
                if (pair4 == null) {
                    break;
                }
                c2 = c7;
            }
            sceneCopy$default4 = Scene.copy$default((Scene) obj6, null, 103, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048573, null);
        }
        Scene scene2 = sceneCopy$default4;
        int formatVersion3 = scene2.getFormatVersion();
        Scene sceneCopy$default5 = scene2;
        if (formatVersion3 < 104) {
            sceneCopy$default5 = Scene.copy$default(scene2, null, 104, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048573, null);
        }
        Scene scene3 = sceneCopy$default5;
        int formatVersion4 = scene3.getFormatVersion();
        Scene sceneCopy$default6 = scene3;
        if (formatVersion4 < 105) {
            Scene sceneCopy$default7 = scene3.getType() == SceneType.ELEMENT ? Scene.copy$default(scene3, null, 0, 0, 0, 0, 0, null, 0, null, upgradeIfNeeded$shouldUsedFixedRes(scene3) ? PrecomposeType.FIXED : PrecomposeType.DYNAMIC, null, null, null, 0, 0, 0, false, 0L, null, null, 1048063, null) : Scene.copy$default(scene3, null, 0, 0, 0, 0, 0, null, 0, null, PrecomposeType.DYNAMIC, null, null, null, 0, 0, 0, false, 0L, null, null, 1048063, null);
            ArrayList arrayList3 = new ArrayList();
            int i17 = 0;
            Object obj8 = sceneCopy$default7;
            for (Object obj9 : sceneCopy$default7.getElements()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SceneElement sceneElement9 = (SceneElement) obj9;
                C c8 = new C(Reflection.getOrCreateKotlinClass(Scene.class), KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Scene.class), null, false, null, 7, null));
                SceneKt$forEachElementRecursiveWithLens$1$lens$1 sceneKt$forEachElementRecursiveWithLens$1$lens$13 = SceneKt$forEachElementRecursiveWithLens$1$lens$1.INSTANCE;
                aC aCVar7 = new aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$1$lens$13.getReturnType(), c8, sceneKt$forEachElementRecursiveWithLens$1$lens$13);
                KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Scene.class);
                KType type5 = aCVar7.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type5);
                w6 w6Var5 = new w6(orCreateKotlinClass5, type5, aCVar7, i17);
                SceneElement sceneElement10 = (SceneElement) w6Var5.get(obj8);
                Object objT9 = obj8;
                if (sceneElement10.getType() == SceneElementType.Scene) {
                    final PrecomposeType precomposeType = upgradeIfNeeded$shouldUsedFixedRes(sceneElement10.getNestedScene()) ? PrecomposeType.FIXED : PrecomposeType.DYNAMIC;
                    objT9 = w6Var5.t(obj8, new Function1() { // from class: dmX.w6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj10) {
                            return SceneUpgraderKt.upgradeIfNeeded$lambda$10$lambda$9(precomposeType, (SceneElement) obj10);
                        }
                    });
                }
                if (sceneElement9.getType().getHasNestedScene()) {
                    arrayList3.add(TuplesKt.to(w6Var5, sceneElement9.getNestedScene()));
                }
                i17 = i18;
                obj8 = objT9;
            }
            do {
                pair2 = (Pair) qz.n(arrayList3);
                if (pair2 != null) {
                    j jVar3 = (j) pair2.component1();
                    int i19 = 0;
                    obj8 = obj8;
                    for (Object obj10 : ((Scene) pair2.component2()).getElements()) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        SceneElement sceneElement11 = (SceneElement) obj10;
                        SceneKt$forEachElementRecursiveWithLens$2$lens$1 sceneKt$forEachElementRecursiveWithLens$2$lens$13 = SceneKt$forEachElementRecursiveWithLens$2$lens$1.INSTANCE;
                        aC aCVar8 = new aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$13.getReturnType(), jVar3, sceneKt$forEachElementRecursiveWithLens$2$lens$13);
                        SceneKt$forEachElementRecursiveWithLens$2$lens$2 sceneKt$forEachElementRecursiveWithLens$2$lens$23 = SceneKt$forEachElementRecursiveWithLens$2$lens$2.INSTANCE;
                        aC aCVar9 = new aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$23.getReturnType(), aCVar8, sceneKt$forEachElementRecursiveWithLens$2$lens$23);
                        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Scene.class);
                        KType type6 = aCVar9.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type6);
                        w6 w6Var6 = new w6(orCreateKotlinClass6, type6, aCVar9, i19);
                        SceneElement sceneElement12 = (SceneElement) w6Var6.get(obj8);
                        Object objT10 = obj8;
                        if (sceneElement12.getType() == SceneElementType.Scene) {
                            final PrecomposeType precomposeType2 = upgradeIfNeeded$shouldUsedFixedRes(sceneElement12.getNestedScene()) ? PrecomposeType.FIXED : PrecomposeType.DYNAMIC;
                            objT10 = w6Var6.t(obj8, new Function1() { // from class: dmX.w6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj102) {
                                    return SceneUpgraderKt.upgradeIfNeeded$lambda$10$lambda$9(precomposeType2, (SceneElement) obj102);
                                }
                            });
                        }
                        if (sceneElement11.getType().getHasNestedScene()) {
                            arrayList3.add(TuplesKt.to(w6Var6, sceneElement11.getNestedScene()));
                        }
                        i19 = i20;
                        obj8 = objT10;
                    }
                }
            } while (pair2 != null);
            sceneCopy$default6 = Scene.copy$default((Scene) obj8, null, 105, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048573, null);
        }
        Scene scene4 = sceneCopy$default6;
        if (scene4.getFormatVersion() < 106) {
            ArrayList arrayList4 = new ArrayList();
            for (SceneElement sceneElement13 : scene4.getElements()) {
                CollectionsKt.emptyList();
                SceneKt.copyUpdatingElement(scene4, SceneElement.copy$default(sceneElement13, null, 0, 0, 0L, null, null, null, null, null, null, null, null, TextureCropMode.STRETCH, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -4097, 127, null));
                if (sceneElement13.getType().getHasNestedScene()) {
                    arrayList4.add(TuplesKt.to(CollectionsKt.listOf(sceneElement13), sceneElement13.getNestedScene()));
                }
            }
            do {
                pair = (Pair) qz.n(arrayList4);
                if (pair != null) {
                    List list = (List) pair.component1();
                    for (SceneElement sceneElement14 : ((Scene) pair.component2()).getElements()) {
                        SceneKt.copyUpdatingElement(scene4, SceneElement.copy$default(sceneElement14, null, 0, 0, 0L, null, null, null, null, null, null, null, null, TextureCropMode.STRETCH, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -4097, 127, null));
                        if (sceneElement14.getType().getHasNestedScene()) {
                            arrayList4.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement14), sceneElement14.getNestedScene()));
                        }
                    }
                }
            } while (pair != null);
            sceneCopy$default2 = Scene.copy$default(scene4, null, 106, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048573, null);
        } else {
            sceneCopy$default2 = scene4;
        }
        if (sceneCopy$default2.getFormatVersion() == 106) {
            return sceneCopy$default2;
        }
        throw new IllegalStateException("Project upgrade failed; expected 106 but got " + sceneCopy$default2.getFormatVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement upgradeIfNeeded$lambda$1$lambda$0(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, null, null, FillType.INTRINSIC, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2049, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement upgradeIfNeeded$lambda$10$lambda$9(PrecomposeType precomposeType, SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, Scene.copy$default(it.getNestedScene(), null, 0, 0, 0, 0, 0, null, 0, null, precomposeType, null, null, null, 0, 0, 0, false, 0L, null, null, 1048063, null), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement upgradeIfNeeded$lambda$6$lambda$2(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, Scene.copy$default(it.getNestedScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, ReTimingMethod.OFF, 0, 0, 0, false, 0L, null, null, 1019903, null), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement upgradeIfNeeded$lambda$6$lambda$3(SceneElement sceneElement, SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, Scene.copy$default(it.getNestedScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, ReTimingMethod.FREEZE, 0, SceneKt.getDuration(sceneElement.getNestedScene()), 0, false, 0L, null, null, 1019903, null), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement upgradeIfNeeded$lambda$6$lambda$4(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, Scene.copy$default(it.getNestedScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, ReTimingMethod.OFF, 0, 0, 0, false, 0L, null, null, 1019903, null), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement upgradeIfNeeded$lambda$6$lambda$5(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, it.getEndTime() - it.getStartTime(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -393217, 127, null);
    }

    private static final boolean upgradeIfNeeded$shouldUsedFixedRes(Scene scene) {
        if (scene.getWidth() <= 2048 && scene.getHeight() <= 2048) {
            List<SceneElement> elements = scene.getElements();
            if (elements == null || !elements.isEmpty()) {
                Iterator<T> it = elements.iterator();
                while (it.hasNext()) {
                    Collection<KeyableVisualEffectRef> collectionValues = ((SceneElement) it.next()).getVisualEffects().values();
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        Iterator<T> it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(((KeyableVisualEffectRef) it2.next()).getId());
                            if (visualEffectVisualEffectById != null && VisualEffectKt.getHasWarpEffects(visualEffectVisualEffectById)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
