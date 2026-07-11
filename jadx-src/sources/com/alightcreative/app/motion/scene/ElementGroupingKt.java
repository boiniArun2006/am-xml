package com.alightcreative.app.motion.scene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a>\u0010\r\u001a\u00020\u0001*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\u0011"}, d2 = {"groupElementsById", "Lcom/alightcreative/app/motion/scene/Scene;", "ids", "", "", "time", "", "baseLabel", "", "boundsMode", "Lcom/alightcreative/app/motion/scene/GroupBoundsMode;", "topLayerBlendMode", "Lcom/alightcreative/app/motion/scene/BlendingMode;", "groupElements", "elementsToGroup", "", "Lcom/alightcreative/app/motion/scene/SceneElement;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElementGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementGrouping.kt\ncom/alightcreative/app/motion/scene/ElementGroupingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Geometry.kt\ncom/alightcreative/app/motion/scene/GeometryKt\n*L\n1#1,103:1\n774#2:104\n865#2,2:105\n1557#2:107\n1628#2,3:108\n1557#2:111\n1628#2,3:112\n1557#2:115\n1628#2,3:116\n1557#2:119\n1628#2,3:120\n1557#2:123\n1628#2,3:124\n1557#2:128\n1628#2,3:129\n1557#2:132\n1628#2,3:133\n360#2,7:136\n774#2:143\n865#2,2:144\n774#2:146\n865#2,2:147\n114#3:127\n*S KotlinDebug\n*F\n+ 1 ElementGrouping.kt\ncom/alightcreative/app/motion/scene/ElementGroupingKt\n*L\n12#1:104\n12#1:105,2\n25#1:107\n25#1:108,3\n32#1:111\n32#1:112,3\n57#1:115\n57#1:116,3\n65#1:119\n65#1:120,3\n66#1:123\n66#1:124,3\n90#1:128\n90#1:129,3\n91#1:132\n91#1:133,3\n96#1:136,7\n98#1:143\n98#1:144,2\n100#1:146\n100#1:147,2\n87#1:127\n*E\n"})
public final class ElementGroupingKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupBoundsMode.values().length];
            try {
                iArr[GroupBoundsMode.WRAP_ELEMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupBoundsMode.MATCH_SCENE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupBoundsMode.UNION_ELEMENTS_SCENE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupBoundsMode.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Scene groupElements(Scene scene, List<SceneElement> elementsToGroup, int i2, String baseLabel, GroupBoundsMode boundsMode, BlendingMode blendingMode) {
        ArrayList arrayList;
        List<SceneElement> listPlus;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(elementsToGroup, "elementsToGroup");
        Intrinsics.checkNotNullParameter(baseLabel, "baseLabel");
        Intrinsics.checkNotNullParameter(boundsMode, "boundsMode");
        char c2 = '\n';
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(elementsToGroup, 10));
        Iterator<T> it = elementsToGroup.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((SceneElement) it.next()).getId()));
        }
        Object obj = null;
        boolean z2 = true;
        if (blendingMode == null) {
            arrayList = arrayList2;
            listPlus = elementsToGroup;
        } else {
            SceneElement sceneElement = (SceneElement) CollectionsKt.lastOrNull((List) elementsToGroup);
            if ((sceneElement != null ? sceneElement.getBlendingMode() : null) != blendingMode) {
                List listDropLast = CollectionsKt.dropLast(elementsToGroup, 1);
                List listTakeLast = CollectionsKt.takeLast(elementsToGroup, 1);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTakeLast, 10));
                Iterator it2 = listTakeLast.iterator();
                while (it2.hasNext()) {
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(SceneElement.copy$default((SceneElement) it2.next(), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, blendingMode, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -4194305, 127, null));
                    listDropLast = listDropLast;
                    arrayList3 = arrayList4;
                    arrayList2 = arrayList2;
                    c2 = '\n';
                    obj = null;
                    z2 = true;
                }
                arrayList = arrayList2;
                listPlus = CollectionsKt.plus((Collection) listDropLast, (Iterable) arrayList3);
            }
        }
        Rectangle rectangleActualBoundsFor = SceneElementKt.actualBoundsFor(scene, listPlus);
        Rectangle frame = SceneElementKt.getFrame(scene);
        int i3 = WhenMappings.$EnumSwitchMapping$0[boundsMode.ordinal()];
        if (i3 == 1) {
            frame = rectangleActualBoundsFor;
        } else if (i3 != 2) {
            if (i3 == 3) {
                frame = GeometryKt.union(rectangleActualBoundsFor, frame);
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!Intrinsics.areEqual(GeometryKt.intersect(rectangleActualBoundsFor, frame), rectangleActualBoundsFor)) {
                }
            }
        }
        List<SceneElement> elements = scene.getElements();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
        for (SceneElement sceneElementUpdateParent : elements) {
            if (sceneElementUpdateParent.getParent() != null && arrayList.contains(sceneElementUpdateParent.getParent())) {
                sceneElementUpdateParent = LayerParentingKt.updateParent(sceneElementUpdateParent, scene, null, SceneElementKt.fractionalTime(sceneElementUpdateParent, i2));
            }
            arrayList5.add(sceneElementUpdateParent);
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        Iterator<T> it3 = listPlus.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Integer.valueOf(((SceneElement) it3.next()).getStartTime()));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList6);
        int i5 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        Iterator<T> it4 = listPlus.iterator();
        while (it4.hasNext()) {
            SceneElement sceneElementGroupElements$removeParentIfNeeded = groupElements$removeParentIfNeeded((SceneElement) it4.next(), arrayList, scene, i2);
            arrayList7.add(SceneElement.copy$default(sceneElementGroupElements$removeParentIfNeeded, null, sceneElementGroupElements$removeParentIfNeeded.getStartTime() - iIntValue, sceneElementGroupElements$removeParentIfNeeded.getEndTime() - iIntValue, 0L, null, null, sceneElementGroupElements$removeParentIfNeeded.getParent() == null ? TransformKt.translatedBy(sceneElementGroupElements$removeParentIfNeeded.getTransform(), -frame.getLeft(), -frame.getTop()) : sceneElementGroupElements$removeParentIfNeeded.getTransform(), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -71, 127, null));
        }
        String str = null;
        int i7 = 0;
        Scene scene2 = new Scene(str, i7, (int) frame.getWidth(), (int) frame.getHeight(), (int) frame.getWidth(), (int) frame.getHeight(), arrayList7, scene.getFramesPerHundredSeconds(), SolidColor.INSTANCE.getTRANSPARENT(), null, null, null, ReTimingMethod.OFF, 0, 0, 0, false, 0L, null, null, 1043971, null);
        Vector2D center = frame.getCenter();
        KeyableTransform keyableTransform = new KeyableTransform(KeyableKt.keyable(new Vector3D(center.getX(), center.getY(), 0.0f)), KeyableKt.keyable(GeometryKt.minus(rectangleActualBoundsFor.getCenter(), frame.getCenter())), null, null, 0.0f, 0.0f, null, null, false, 508, 0 == true ? 1 : 0);
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(elementsToGroup, 10));
        Iterator<T> it5 = elementsToGroup.iterator();
        while (it5.hasNext()) {
            arrayList8.add(Integer.valueOf(((SceneElement) it5.next()).getStartTime()));
        }
        Comparable comparableMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Comparable>) arrayList8);
        Intrinsics.checkNotNull(comparableMinOrNull);
        int iIntValue2 = ((Number) comparableMinOrNull).intValue();
        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(elementsToGroup, 10));
        Iterator<T> it6 = elementsToGroup.iterator();
        while (it6.hasNext()) {
            arrayList9.add(Integer.valueOf(((SceneElement) it6.next()).getEndTime()));
        }
        Comparable comparableMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Comparable>) arrayList9);
        Intrinsics.checkNotNull(comparableMaxOrNull);
        SceneElement sceneElementNestedSceneElement = NestedSceneElementKt.NestedSceneElement(keyableTransform, iIntValue2, ((Number) comparableMaxOrNull).intValue(), scene2, null, (16288 & 32) != 0 ? 0L : 0L, (16288 & 64) != 0 ? "" : SceneKt.makeNumberedLabel(scene, baseLabel), (16288 & 128) != 0 ? 0 : 0, (16288 & 256) != 0 ? Integer.MAX_VALUE : 0, (16288 & 512) != 0 ? FillType.INTRINSIC : null, (16288 & 1024) != 0 ? KeyableKt.keyable(ColorKt.SolidColor()) : null, (16288 & 2048) != 0 ? false : false, (16288 & 4096) != 0 ? BlendingMode.NORMAL : null, (16288 & 8192) != 0 ? null : null);
        Iterator it7 = arrayList5.iterator();
        while (true) {
            if (!it7.hasNext()) {
                i5 = -1;
                break;
            }
            if (arrayList.contains(Long.valueOf(((SceneElement) it7.next()).getId()))) {
                break;
            }
            i5++;
        }
        if (i5 >= 0) {
            ArrayList arrayList10 = new ArrayList();
            for (Object obj2 : arrayList5) {
                if (!arrayList.contains(Long.valueOf(((SceneElement) obj2).getId()))) {
                    arrayList10.add(obj2);
                }
            }
            return SceneKt.uniquifyIds(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, HI0.rv6.n(arrayList10, i5, SceneKt.prepElementForAdd(scene, sceneElementNestedSceneElement)), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null));
        }
        ArrayList arrayList11 = new ArrayList();
        for (Object obj3 : arrayList5) {
            if (!arrayList.contains(Long.valueOf(((SceneElement) obj3).getId()))) {
                arrayList11.add(obj3);
            }
        }
        return SceneKt.uniquifyIds(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, CollectionsKt.plus((Collection<? extends SceneElement>) arrayList11, SceneKt.prepElementForAdd(scene, sceneElementNestedSceneElement)), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null));
    }

    public static /* synthetic */ Scene groupElements$default(Scene scene, List list, int i2, String str, GroupBoundsMode groupBoundsMode, BlendingMode blendingMode, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            groupBoundsMode = GroupBoundsMode.AUTO;
        }
        GroupBoundsMode groupBoundsMode2 = groupBoundsMode;
        if ((i3 & 16) != 0) {
            blendingMode = null;
        }
        return groupElements(scene, list, i2, str, groupBoundsMode2, blendingMode);
    }

    public static final Scene groupElementsById(Scene scene, Iterable<Long> ids, int i2, String baseLabel, GroupBoundsMode boundsMode, BlendingMode blendingMode) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(baseLabel, "baseLabel");
        Intrinsics.checkNotNullParameter(boundsMode, "boundsMode");
        List<SceneElement> elements = scene.getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (CollectionsKt.contains(ids, Long.valueOf(((SceneElement) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        return groupElements(scene, arrayList, i2, baseLabel, boundsMode, blendingMode);
    }

    public static /* synthetic */ Scene groupElementsById$default(Scene scene, Iterable iterable, int i2, String str, GroupBoundsMode groupBoundsMode, BlendingMode blendingMode, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            groupBoundsMode = GroupBoundsMode.UNION_ELEMENTS_SCENE;
        }
        GroupBoundsMode groupBoundsMode2 = groupBoundsMode;
        if ((i3 & 16) != 0) {
            blendingMode = null;
        }
        return groupElementsById(scene, iterable, i2, str, groupBoundsMode2, blendingMode);
    }

    private static final SceneElement groupElements$removeParentIfNeeded(final SceneElement sceneElement, final List<Long> list, Scene scene, int i2) {
        final SceneElement sceneElementUpdateParent;
        if (sceneElement.getParent() != null && !list.contains(sceneElement.getParent())) {
            sceneElementUpdateParent = LayerParentingKt.updateParent(sceneElement, scene, null, SceneElementKt.fractionalTime(sceneElement, i2));
        } else {
            sceneElementUpdateParent = sceneElement;
        }
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.qz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ElementGroupingKt.groupElements$removeParentIfNeeded$lambda$3(sceneElement, list, sceneElementUpdateParent);
            }
        });
        return sceneElementUpdateParent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String groupElements$removeParentIfNeeded$lambda$3(SceneElement sceneElement, List list, SceneElement sceneElement2) {
        boolean z2;
        long id = sceneElement.getId();
        Long parent = sceneElement.getParent();
        if (sceneElement.getParent() != null && !list.contains(sceneElement.getParent())) {
            z2 = true;
        } else {
            z2 = false;
        }
        return "removeParentIfNeeded id=" + id + " parent=" + parent + " idsToGroup=" + list + " cond=" + z2 + " parent:" + sceneElement.getParent() + "->" + sceneElement2.getParent() + " location:" + KeyableKt.valueAtTime(sceneElement.getTransform().getLocation(), 0.0f) + "->" + KeyableKt.valueAtTime(sceneElement2.getTransform().getLocation(), 0.0f);
    }
}
