package zd;

import HI0.afx;
import HI0.rv6;
import XoT.qz;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import tu.Ew;
import zd.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w6 {
    public static final Ew KN(MediaUriInfo mediaUriInfo) {
        Intrinsics.checkNotNullParameter(mediaUriInfo, "<this>");
        String mime = mediaUriInfo.getMime();
        if (mime == null) {
            throw new IllegalStateException(("Unexpected null mime type for " + mediaUriInfo).toString());
        }
        if (StringsKt.startsWith$default(mime, "audio/", false, 2, (Object) null)) {
            return Ew.f73883o;
        }
        if (StringsKt.startsWith$default(mime, "video/", false, 2, (Object) null)) {
            return Ew.f73884r;
        }
        if (StringsKt.startsWith$default(mime, "image/", false, 2, (Object) null)) {
            return Ew.J2;
        }
        throw new IllegalStateException(("Unknown mime type " + mime + " for " + mediaUriInfo).toString());
    }

    public static final int O(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        List<SceneElement> recursiveElements = SceneKt.getRecursiveElements(scene);
        int i2 = 0;
        if (recursiveElements != null && recursiveElements.isEmpty()) {
            return 0;
        }
        for (SceneElement sceneElement : recursiveElements) {
            if (sceneElement.getFillType() == FillType.MEDIA && (sceneElement.getFillImage() != null || sceneElement.getFillVideo() != null)) {
                i2++;
                if (i2 < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i2;
    }

    public static final long Uo(MediaUriInfo mediaUriInfo) {
        Intrinsics.checkNotNullParameter(mediaUriInfo, "<this>");
        return mediaUriInfo.getDuration() / ((long) 1000);
    }

    public static final List az(List list, Scene scene, Scene initialScene) {
        Ml nVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(initialScene, "initialScene");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ml ml = (Ml) it.next();
            if (ml instanceof Ml.j) {
                Ml.j jVar = (Ml.j) ml;
                nVar = new Ml.j(J2(jVar.t(), scene, initialScene), jVar.n(), jVar.t(), TextureCropMode.FILL);
            } else {
                if (!(ml instanceof Ml.n)) {
                    throw new NoWhenBranchMatchedException();
                }
                Ml.n nVar2 = (Ml.n) ml;
                nVar = new Ml.n(J2(nVar2.t(), scene, initialScene), nVar2.n(), nVar2.t(), TextureCropMode.FILL);
            }
            arrayList.add(nVar);
        }
        return arrayList;
    }

    public static final long ck(Scene scene, Uri uri) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(uri, "uri");
        long jIk = Ik(scene, uri);
        return jIk > 0 ? jIk : HI(scene, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable gh(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getEndTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable mUb(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getStartTime());
    }

    public static final int nr(Activity activity, String projectId) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        File fileO = afx.o(activity, projectId);
        if (fileO.exists()) {
            return O(SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(fileO, null, 1, null), false, false, false, 14, null));
        }
        return 0;
    }

    public static final int qie(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return sceneElement.getEndTime() - sceneElement.getStartTime();
    }

    public static final Uri t(Context context, Uri amUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(amUri, "amUri");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        File fileGh = afx.gh(applicationContext);
        String schemeSpecificPart = amUri.getSchemeSpecificPart();
        Intrinsics.checkNotNullExpressionValue(schemeSpecificPart, "getSchemeSpecificPart(...)");
        String absolutePath = FilesKt.resolve(fileGh, schemeSpecificPart).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return Uri.parse(absolutePath);
    }

    public static final List ty(List list, int i2, TextureCropMode textureCropMode) {
        Object nVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(textureCropMode, "textureCropMode");
        Ml ml = (Ml) list.get(i2);
        if (ml instanceof Ml.j) {
            Ml.j jVar = (Ml.j) ml;
            nVar = new Ml.j(jVar.O(), jVar.n(), jVar.t(), textureCropMode);
        } else {
            if (!(ml instanceof Ml.n)) {
                throw new NoWhenBranchMatchedException();
            }
            Ml.n nVar2 = (Ml.n) ml;
            nVar = new Ml.n(nVar2.O(), nVar2.n(), nVar2.t(), textureCropMode);
        }
        return rv6.t(list, i2, nVar);
    }

    public static final List xMQ(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        List<SceneElement> recursiveElements = SceneKt.getRecursiveElements(scene);
        ArrayList arrayList = new ArrayList();
        for (Object obj : recursiveElements) {
            if (((SceneElement) obj).getFillType() == FillType.MEDIA) {
                arrayList.add(obj);
            }
        }
        List<SceneElement> listSortedWith = CollectionsKt.sortedWith(arrayList, ComparisonsKt.compareBy(new Function1() { // from class: zd.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return w6.mUb((SceneElement) obj2);
            }
        }, new Function1() { // from class: zd.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return w6.gh((SceneElement) obj2);
            }
        }));
        ArrayList arrayList2 = new ArrayList();
        for (SceneElement sceneElement : listSortedWith) {
            Ml jVar = sceneElement.getFillImage() != null ? new Ml.j(sceneElement.getFillImage(), HI(scene, sceneElement.getFillImage()), sceneElement.getFillImage(), null, 8, null) : sceneElement.getFillVideo() != null ? new Ml.n(sceneElement.getFillVideo(), Ik(scene, sceneElement.getFillVideo()), sceneElement.getFillVideo(), null, 8, null) : null;
            if (jVar != null) {
                arrayList2.add(jVar);
            }
        }
        return CollectionsKt.distinct(arrayList2);
    }

    private static final long HI(Scene scene, Uri uri) {
        List<SceneElement> recursiveElements = SceneKt.getRecursiveElements(scene);
        ArrayList arrayList = new ArrayList();
        for (Object obj : recursiveElements) {
            SceneElement sceneElement = (SceneElement) obj;
            if (sceneElement.getFillType() == FillType.MEDIA && Intrinsics.areEqual(sceneElement.getFillImage(), uri)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return 0L;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            int iQie = qie((SceneElement) it.next());
            while (it.hasNext()) {
                int iQie2 = qie((SceneElement) it.next());
                if (iQie < iQie2) {
                    iQie = iQie2;
                }
            }
            return iQie;
        }
        throw new NoSuchElementException();
    }

    private static final long Ik(Scene scene, Uri uri) {
        List<SceneElement> recursiveElements = SceneKt.getRecursiveElements(scene);
        ArrayList arrayList = new ArrayList();
        for (Object obj : recursiveElements) {
            SceneElement sceneElement = (SceneElement) obj;
            if (sceneElement.getFillType() == FillType.MEDIA && Intrinsics.areEqual(sceneElement.getFillVideo(), uri)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return 0L;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            SceneElement sceneElement2 = (SceneElement) it.next();
            int iCoerceAtMost = RangesKt.coerceAtMost(sceneElement2.getOutTime(), sceneElement2.getInTime() + qie(sceneElement2));
            while (it.hasNext()) {
                SceneElement sceneElement3 = (SceneElement) it.next();
                int iCoerceAtMost2 = RangesKt.coerceAtMost(sceneElement3.getOutTime(), sceneElement3.getInTime() + qie(sceneElement3));
                if (iCoerceAtMost < iCoerceAtMost2) {
                    iCoerceAtMost = iCoerceAtMost2;
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                int inTime = ((SceneElement) it2.next()).getInTime();
                while (it2.hasNext()) {
                    int inTime2 = ((SceneElement) it2.next()).getInTime();
                    if (inTime > inTime2) {
                        inTime = inTime2;
                    }
                }
                return iCoerceAtMost - inTime;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    private static final Uri J2(Uri uri, Scene scene, Scene scene2) {
        Object next;
        Iterator<T> it = SceneKt.getRecursiveElements(scene2).iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                SceneElement sceneElement = (SceneElement) next;
                if (sceneElement.getFillType() == FillType.MEDIA && (Intrinsics.areEqual(sceneElement.getFillImage(), uri) || Intrinsics.areEqual(sceneElement.getFillVideo(), uri))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SceneElement sceneElement2 = (SceneElement) next;
        if (sceneElement2 != null) {
            List<SceneElement> listPathToElement = SceneKt.pathToElement(scene2, sceneElement2);
            Intrinsics.checkNotNull(listPathToElement);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPathToElement, 10));
            Iterator<T> it2 = listPathToElement.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((SceneElement) it2.next()).getId()));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = scene.getElements().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    while (true) {
                        Pair pair = (Pair) qz.n(arrayList2);
                        if (pair != null) {
                            List list = (List) pair.component1();
                            for (SceneElement sceneElement3 : ((Scene) pair.component2()).getElements()) {
                                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    arrayList3.add(Long.valueOf(((SceneElement) it4.next()).getId()));
                                }
                                if (Intrinsics.areEqual(CollectionsKt.plus((Collection<? extends Long>) arrayList3, Long.valueOf(sceneElement3.getId())), arrayList)) {
                                    Uri fillVideo = sceneElement3.getFillVideo();
                                    if (fillVideo != null || (fillVideo = sceneElement3.getFillImage()) != null) {
                                        return fillVideo;
                                    }
                                } else if (sceneElement3.getType().getHasNestedScene()) {
                                    arrayList2.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement3), sceneElement3.getNestedScene()));
                                }
                            }
                        }
                        if (pair == null) {
                            break;
                        }
                    }
                } else {
                    SceneElement sceneElement4 = (SceneElement) it3.next();
                    List listEmptyList = CollectionsKt.emptyList();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
                    Iterator it5 = listEmptyList.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(Long.valueOf(((SceneElement) it5.next()).getId()));
                    }
                    if (Intrinsics.areEqual(CollectionsKt.plus((Collection<? extends Long>) arrayList4, Long.valueOf(sceneElement4.getId())), arrayList)) {
                        Uri fillVideo2 = sceneElement4.getFillVideo();
                        if (fillVideo2 != null || (fillVideo2 = sceneElement4.getFillImage()) != null) {
                            return fillVideo2;
                        }
                    } else if (sceneElement4.getType().getHasNestedScene()) {
                        arrayList2.add(TuplesKt.to(CollectionsKt.listOf(sceneElement4), sceneElement4.getNestedScene()));
                    }
                }
            }
        }
        return uri;
    }
}
