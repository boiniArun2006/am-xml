package com.alightcreative.template.importpreview.ui;

import HI0.Q;
import XoT.qz;
import android.net.Uri;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.bugfix.MediaOrientationUpdaterKt;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.template.importpreview.ui.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import tu.Ew;
import xr.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class aC {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uo(Uri uri, SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getFillType() == FillType.MEDIA) {
            return Intrinsics.areEqual(it.getFillVideo(), uri) || Intrinsics.areEqual(it.getFillImage(), uri);
        }
        return false;
    }

    private static final SceneElement gh(SceneElement sceneElement, MediaUriInfo mediaUriInfo, long j2, int i2, long j3) {
        if (zd.w6.KN(mediaUriInfo) != Ew.f73884r) {
            return sceneElement;
        }
        if (zd.w6.Uo(mediaUriInfo) >= j2) {
            return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, sceneElement.getFillImage() != null ? (int) j3 : (sceneElement.getInTime() - i2) + ((int) j3), sceneElement.getFillImage() != null ? (((int) j3) + sceneElement.getEndTime()) - sceneElement.getStartTime() : ((int) j3) + (sceneElement.getOutTime() - i2), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -917505, 127, null);
        }
        return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, sceneElement.getFillImage() != null ? 0 : RangesKt.coerceAtMost(sceneElement.getInTime() - i2, (int) zd.w6.Uo(mediaUriInfo)), sceneElement.getFillImage() != null ? RangesKt.coerceAtMost(zd.w6.qie(sceneElement), (int) zd.w6.Uo(mediaUriInfo)) : RangesKt.coerceAtMost(Math.min(sceneElement.getInTime() + zd.w6.qie(sceneElement), sceneElement.getOutTime()) - i2, (int) zd.w6.Uo(mediaUriInfo)), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -917505, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scene mUb(Scene scene, List list, Set set, TextureCropMode textureCropMode) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((j) obj).rl(), list)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((j) it.next()).n()));
        }
        Scene sceneCopyUpdatingElement = scene;
        for (SceneElement sceneElement : scene.getElements()) {
            if (arrayList2.contains(Long.valueOf(sceneElement.getId()))) {
                sceneCopyUpdatingElement = SceneKt.copyUpdatingElement(sceneCopyUpdatingElement, SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, textureCropMode, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -4097, 127, null));
            }
            if (sceneElement.getType().getHasNestedScene()) {
                sceneCopyUpdatingElement = SceneKt.copyUpdatingElement(sceneCopyUpdatingElement, SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, mUb(sceneElement.getNestedScene(), CollectionsKt.plus((Collection<? extends Long>) list, Long.valueOf(sceneElement.getId())), set, textureCropMode), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null));
            }
        }
        return sceneCopyUpdatingElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scene qie(Scene scene, List list, Set set, MediaUriInfo mediaUriInfo, long j2, int i2, long j3, Q q2) {
        Q q3;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((j) obj).rl(), list)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((j) it.next()).n()));
        }
        Scene sceneCopyUpdatingElement = scene;
        for (SceneElement sceneElement : scene.getElements()) {
            if (arrayList2.contains(Long.valueOf(sceneElement.getId()))) {
                q3 = q2;
                sceneCopyUpdatingElement = MediaOrientationUpdaterKt.withUpdatedMediaFillOf(sceneCopyUpdatingElement, SceneElement.copy$default(gh(sceneElement, mediaUriInfo, j3, i2, j2), null, 0, 0, 0L, null, null, null, null, null, null, null, null, TextureCropMode.FILL, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -4097, 127, null), mediaUriInfo.getUri(), zd.w6.KN(mediaUriInfo), q3);
            } else {
                q3 = q2;
            }
            if (sceneElement.getType().getHasNestedScene()) {
                sceneCopyUpdatingElement = SceneKt.copyUpdatingElement(sceneCopyUpdatingElement, SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, qie(sceneElement.getNestedScene(), CollectionsKt.plus((Collection<? extends Long>) list, Long.valueOf(sceneElement.getId())), set, mediaUriInfo, j2, i2, j3, q3), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null));
            }
        }
        return sceneCopyUpdatingElement;
    }

    public static final C.j xMQ(Pl pl) {
        Intrinsics.checkNotNullParameter(pl, "<this>");
        return new C.j(pl.t(), pl.nr(), pl.xMQ(), pl.KN(), pl.O(), pl.mUb(), pl.gh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J2(Scene scene, final Uri uri) {
        Iterator it = SequencesKt.filter(CollectionsKt.asSequence(SceneKt.getRecursiveElements(scene)), new Function1() { // from class: xr.qz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(com.alightcreative.template.importpreview.ui.aC.Uo(uri, (SceneElement) obj));
            }
        }).iterator();
        if (it.hasNext()) {
            int inTime = ((SceneElement) it.next()).getInTime();
            while (it.hasNext()) {
                int inTime2 = ((SceneElement) it.next()).getInTime();
                if (inTime > inTime2) {
                    inTime = inTime2;
                }
            }
            return inTime;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set KN(Scene scene, Uri uri) {
        Pair pair;
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            List listEmptyList = CollectionsKt.emptyList();
            if (sceneElement.getFillType() == FillType.MEDIA && (Intrinsics.areEqual(sceneElement.getFillVideo(), uri) || Intrinsics.areEqual(sceneElement.getFillImage(), uri))) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
                Iterator it = listEmptyList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((SceneElement) it.next()).getId()));
                }
                setCreateSetBuilder.add(new j(arrayList2, sceneElement.getId()));
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) qz.n(arrayList);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    if (sceneElement2.getFillType() == FillType.MEDIA && (Intrinsics.areEqual(sceneElement2.getFillVideo(), uri) || Intrinsics.areEqual(sceneElement2.getFillImage(), uri))) {
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(Long.valueOf(((SceneElement) it2.next()).getId()));
                        }
                        setCreateSetBuilder.add(new j(arrayList3, sceneElement2.getId()));
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
        return SetsKt.build(setCreateSetBuilder);
    }
}
