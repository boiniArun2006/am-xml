package com.alightcreative.app.motion.scene;

import com.alightcreative.app.motion.scene.EditCategory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"performAssociatedEdit", "Lcom/alightcreative/app/motion/scene/Scene;", "category", "Lcom/alightcreative/app/motion/scene/EditCategory;", "editClippingMask", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AssociatedEditKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c A[PHI: r7
      0x010c: PHI (r7v9 java.lang.Integer) = 
      (r7v8 java.lang.Integer)
      (r7v8 java.lang.Integer)
      (r7v8 java.lang.Integer)
      (r7v14 java.lang.Integer)
      (r7v14 java.lang.Integer)
      (r7v17 java.lang.Integer)
     binds: [B:54:0x01cd, B:56:0x01dd, B:58:0x01ed, B:44:0x0144, B:46:0x014a, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Scene editClippingMask(Scene scene, EditCategory editCategory) {
        Scene sceneCopyUpdatingElement;
        int iIntValue;
        boolean z2 = true;
        if (editCategory instanceof EditCategory.Reorder) {
            EditCategory.Reorder reorder = (EditCategory.Reorder) editCategory;
            int from = reorder.getFrom();
            int to = reorder.getTo();
            SceneElement sceneElement = scene.getElements().get(to);
            boolean clippingMask = false;
            if (!sceneElement.getClippingMask()) {
                boolean z3 = from < to;
                if (z3) {
                    clippingMask = scene.getElements().get(from).getClippingMask();
                } else {
                    int i2 = from + 1;
                    if (CollectionsKt.getIndices(scene.getElements()).contains(i2) && scene.getElements().get(i2).getClippingMask()) {
                        clippingMask = true;
                    }
                }
                Integer numValueOf = null;
                if (clippingMask) {
                    if (!z3) {
                        int i3 = from + 1;
                        int size = scene.getElements().size();
                        for (int i5 = i3; i5 < size; i5++) {
                            if (!scene.getElements().get(i5).getClippingMask()) {
                                if (!scene.getElements().get(i5).getClippingMask()) {
                                    break;
                                }
                            } else {
                                numValueOf = Integer.valueOf(i5);
                            }
                        }
                        if (numValueOf != null && i3 <= (iIntValue = numValueOf.intValue())) {
                            sceneCopyUpdatingElement = scene;
                            while (true) {
                                if (scene.getElements().get(i3).getClippingMask()) {
                                    sceneCopyUpdatingElement = SceneKt.copyUpdatingElement(sceneCopyUpdatingElement, SceneElement.copy$default(scene.getElements().get(i3), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1, 111, null));
                                }
                                if (i3 == iIntValue) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        int size2 = scene.getElements().size();
                        for (int i7 = from; i7 < size2; i7++) {
                            if (i7 == to || !scene.getElements().get(i7).getClippingMask()) {
                                if (i7 != to && !scene.getElements().get(i7).getClippingMask()) {
                                    break;
                                }
                            } else {
                                numValueOf = Integer.valueOf(i7);
                            }
                        }
                        if (numValueOf != null) {
                            int iMin = Integer.min(to, numValueOf.intValue() + 1);
                            sceneCopyUpdatingElement = scene;
                            while (from < iMin) {
                                sceneCopyUpdatingElement = SceneKt.copyUpdatingElement(sceneCopyUpdatingElement, SceneElement.copy$default(scene.getElements().get(from), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1, 111, null));
                                from++;
                            }
                        } else {
                            sceneCopyUpdatingElement = scene;
                        }
                    }
                } else if (!SceneElementTypeKt.getCanBecomeClippingMaskChild(sceneElement.getType())) {
                    int i8 = to + 1;
                    if (CollectionsKt.getIndices(scene.getElements()).contains(i8) && scene.getElements().get(i8).getClippingMask()) {
                        int size3 = scene.getElements().size();
                        sceneCopyUpdatingElement = scene;
                        while (i8 < size3 && scene.getElements().get(i8).getClippingMask()) {
                            sceneCopyUpdatingElement = SceneKt.copyUpdatingElement(sceneCopyUpdatingElement, SceneElement.copy$default(scene.getElements().get(i8), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1, 111, null));
                            i8++;
                        }
                    }
                }
                int i9 = to + 1;
                if (CollectionsKt.getIndices(scene.getElements()).contains(i9) && scene.getElements().get(i9).getClippingMask()) {
                    if (!clippingMask) {
                        return SceneKt.copyUpdatingElement(sceneCopyUpdatingElement, SceneElement.copy$default(scene.getElements().get(to), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, true, null, null, -1, 111, null));
                    }
                    if (!z3) {
                        return SceneKt.copyUpdatingElement(sceneCopyUpdatingElement, SceneElement.copy$default(scene.getElements().get(to), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, true, null, null, -1, 111, null));
                    }
                    if (numValueOf != null && numValueOf.intValue() < to) {
                        return SceneKt.copyUpdatingElement(sceneCopyUpdatingElement, SceneElement.copy$default(scene.getElements().get(to), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, true, null, null, -1, 111, null));
                    }
                }
                return sceneCopyUpdatingElement;
            }
            int i10 = to + 1;
            if (!CollectionsKt.getIndices(scene.getElements()).contains(i10) || !scene.getElements().get(i10).getClippingMask()) {
                int i11 = to - 1;
                if (!CollectionsKt.getIndices(scene.getElements()).contains(i11) || !scene.getElements().get(i11).getClippingMask()) {
                    z2 = false;
                }
            }
            if (to == 0 || !z2) {
                return SceneKt.copyUpdatingElement(scene, SceneElement.copy$default(scene.getElements().get(to), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1, 111, null));
            }
        } else {
            if (!(editCategory instanceof EditCategory.ClippingMask)) {
                throw new NoWhenBranchMatchedException();
            }
            int index = ((EditCategory.ClippingMask) editCategory).getIndex();
            if (!scene.getElements().get(index).getClippingMask() && scene.getElements().size() - 1 > index) {
                int size4 = scene.getElements().size();
                Scene sceneCopyUpdatingElement2 = scene;
                for (int i12 = index + 1; i12 < size4 && scene.getElements().get(i12).getClippingMask(); i12++) {
                    sceneCopyUpdatingElement2 = SceneKt.copyUpdatingElement(sceneCopyUpdatingElement2, SceneElement.copy$default(scene.getElements().get(i12), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1, 111, null));
                }
                return sceneCopyUpdatingElement2;
            }
        }
        return scene;
    }

    public static final Scene performAssociatedEdit(Scene scene, EditCategory editCategory) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return editCategory == null ? scene : editClippingMask(scene, editCategory);
    }

    public static /* synthetic */ Scene performAssociatedEdit$default(Scene scene, EditCategory editCategory, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            editCategory = null;
        }
        return performAssociatedEdit(scene, editCategory);
    }
}
