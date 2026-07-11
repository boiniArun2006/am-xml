package com.alightcreative.app.motion.scene.bugfix;

import HI0.Q;
import android.net.Uri;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableCBKnot;
import com.alightcreative.app.motion.scene.KeyableCubicBSpline;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.MediaUriInfoKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import oA.aC;
import tu.Ew;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a1\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\t\u001a\u00020\u0000*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000f\u001aG\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001a\u001a#\u0010\u001e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0018\u0010#\u001a\u00020\"*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0018\u0010%\u001a\u00020\"*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0018\u0010(\u001a\u00020\"*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&¨\u0006)"}, d2 = {"Lcom/alightcreative/app/motion/scene/Scene;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "sceneElement", "Landroid/net/Uri;", "uri", "Ltu/Ew;", "mediaType", "LHI0/Q;", "contentResolver", "withUpdatedMediaFillOf", "(Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneElement;Landroid/net/Uri;Ltu/Ew;LHI0/Q;)Lcom/alightcreative/app/motion/scene/Scene;", "", "toReplace", "newUri", "contentResolverExt", "(Lcom/alightcreative/app/motion/scene/Scene;Ljava/util/List;Landroid/net/Uri;Ltu/Ew;LHI0/Q;)Lcom/alightcreative/app/motion/scene/Scene;", "K", "V", "", "key", "newValue", "replacing", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "", "rotationDelta", "withUpdatedRotationAndPivot", "(Lcom/alightcreative/app/motion/scene/SceneElement;I)Lcom/alightcreative/app/motion/scene/SceneElement;", "withUpdatedSkewIfNeeded", "withUpdatedOutlineIfNeeded", "withUpdatedLiveShapeIfNeeded", "withUpdatedMediaFill", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ltu/Ew;Landroid/net/Uri;)Lcom/alightcreative/app/motion/scene/SceneElement;", "VALID_MEDIA_ORIENTATIONS", "Ljava/util/List;", "", "isValidOrientation", "(I)Z", "isOutline", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Z", "getHasLiveShapeWithSizeParam", "hasLiveShapeWithSizeParam", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaOrientationUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaOrientationUpdater.kt\ncom/alightcreative/app/motion/scene/bugfix/MediaOrientationUpdaterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Lens.kt\ncom/alightcreative/lens/LensKt\n*L\n1#1,177:1\n1#2:178\n774#3:179\n865#3,2:180\n1557#3:182\n1628#3,3:183\n1557#3:186\n1628#3,3:187\n1557#3:190\n1628#3,3:191\n1797#3,3:194\n1557#3:200\n1628#3,2:201\n1557#3:203\n1628#3,3:204\n1630#3:207\n148#4:197\n143#4:198\n124#4:199\n148#4:208\n143#4:209\n124#4:210\n*S KotlinDebug\n*F\n+ 1 MediaOrientationUpdater.kt\ncom/alightcreative/app/motion/scene/bugfix/MediaOrientationUpdaterKt\n*L\n46#1:179\n46#1:180,2\n46#1:182\n46#1:183,3\n47#1:186\n47#1:187,3\n65#1:190\n65#1:191,3\n86#1:194,3\n129#1:200\n129#1:201,2\n131#1:203\n131#1:204,3\n129#1:207\n113#1:197\n113#1:198\n113#1:199\n158#1:208\n158#1:209\n158#1:210\n*E\n"})
public final class MediaOrientationUpdaterKt {
    private static final List<Integer> VALID_MEDIA_ORIENTATIONS = CollectionsKt.listOf((Object[]) new Integer[]{0, 90, 180, 270});

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ew.values().length];
            try {
                iArr[Ew.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ew.f73884r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Scene withUpdatedMediaFillOf(Scene scene, SceneElement sceneElement, Uri uri, Ew mediaType, Q contentResolver) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(sceneElement, "sceneElement");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        if (!Ew.f73882n.rl().contains(mediaType)) {
            throw new IllegalArgumentException(("Cannot replace fill uri of " + sceneElement + " with, " + uri + ", since it has media type " + mediaType).toString());
        }
        MediaUriInfo mediaUriInfoMediaUriInfoOf = MediaUriInfoKt.mediaUriInfoOf(contentResolver, uri, scene);
        int iIntValue2 = 0;
        if (mediaUriInfoMediaUriInfoOf != null) {
            Integer numValueOf = Integer.valueOf(mediaUriInfoMediaUriInfoOf.getOrientation());
            if (!isValidOrientation(numValueOf.intValue())) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        }
        Uri fillImage = sceneElement.getFillImage();
        if (fillImage == null) {
            fillImage = sceneElement.getFillVideo();
        }
        if (fillImage != null) {
            MediaUriInfo mediaUriInfoMediaUriInfoOf2 = MediaUriInfoKt.mediaUriInfoOf(contentResolver, fillImage, scene);
            Integer numValueOf2 = mediaUriInfoMediaUriInfoOf2 != null ? Integer.valueOf(mediaUriInfoMediaUriInfoOf2.getOrientation()) : null;
            if (numValueOf2 != null) {
                if (!isValidOrientation(numValueOf2.intValue())) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                }
            }
        }
        int i2 = iIntValue2 - iIntValue;
        if (i2 == 0) {
            return SceneKt.copyUpdatingElement(scene, withUpdatedMediaFill(sceneElement, mediaType, uri));
        }
        List<SceneElement> elements = scene.getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            Long parent = ((SceneElement) obj).getParent();
            long id = sceneElement.getId();
            if (parent != null && parent.longValue() == id) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((SceneElement) it.next()).getId()));
        }
        List<SceneElement> elements2 = scene.getElements();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements2, 10));
        for (SceneElement sceneElementUpdateParent : elements2) {
            Long parent2 = sceneElementUpdateParent.getParent();
            long id2 = sceneElement.getId();
            if (parent2 != null && parent2.longValue() == id2) {
                sceneElementUpdateParent = LayerParentingKt.updateParent(sceneElementUpdateParent, scene, null, 0.0f);
            }
            arrayList3.add(sceneElementUpdateParent);
        }
        SceneElement sceneElementWithUpdatedMediaFill = withUpdatedMediaFill(withUpdatedOutlineIfNeeded(withUpdatedLiveShapeIfNeeded(withUpdatedSkewIfNeeded(withUpdatedRotationAndPivot(sceneElement, i2), i2), i2), i2), mediaType, uri);
        ArrayList arrayList4 = arrayList2;
        Scene sceneCopyUpdatingElement = SceneKt.copyUpdatingElement(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, arrayList3, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null), sceneElementWithUpdatedMediaFill);
        List<SceneElement> elements3 = sceneCopyUpdatingElement.getElements();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements3, 10));
        for (SceneElement sceneElementUpdateParent2 : elements3) {
            ArrayList arrayList6 = arrayList4;
            if (arrayList6.contains(Long.valueOf(sceneElementUpdateParent2.getId()))) {
                sceneElementUpdateParent2 = LayerParentingKt.updateParent(sceneElementUpdateParent2, sceneCopyUpdatingElement, Long.valueOf(sceneElementWithUpdatedMediaFill.getId()), 0.0f);
            }
            arrayList5.add(sceneElementUpdateParent2);
            arrayList4 = arrayList6;
        }
        return Scene.copy$default(sceneCopyUpdatingElement, null, 0, 0, 0, 0, 0, arrayList5, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null);
    }

    private static final boolean isValidOrientation(int i2) {
        return VALID_MEDIA_ORIENTATIONS.contains(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map withUpdatedLiveShapeIfNeeded$lambda$13(KeyableUserParameterValue keyableUserParameterValue, Keyable keyable, Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return replacing(it, "size", KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, null, keyable, null, null, null, false, null, null, 2031, null));
    }

    private static final SceneElement withUpdatedMediaFill(SceneElement sceneElement, Ew ew, Uri uri) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ew.ordinal()];
        if (i2 == 1) {
            return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, uri, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -769, 127, null);
        }
        if (i2 == 2) {
            return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, uri, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -769, 127, null);
        }
        throw new IllegalStateException("Unexpected fill type");
    }

    private static final SceneElement withUpdatedSkewIfNeeded(SceneElement sceneElement, int i2) {
        if (i2 % 180 == 0) {
            return sceneElement;
        }
        MediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$1 mediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.bugfix.MediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getTransform();
            }
        };
        MediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$2 mediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$2 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.bugfix.MediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getSkew();
            }
        };
        return (SceneElement) new aC(Reflection.getOrCreateKotlinClass(SceneElement.class), mediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$2.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), mediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$1.getReturnType(), mediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$1), mediaOrientationUpdaterKt$withUpdatedSkewIfNeeded$skewLens$2).t(sceneElement, new Function1() { // from class: com.alightcreative.app.motion.scene.bugfix.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaOrientationUpdaterKt.withUpdatedSkewIfNeeded$lambda$10((Keyable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable withUpdatedSkewIfNeeded$lambda$10(Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.mirrored(KeyableKt.flipped(it));
    }

    private static final boolean getHasLiveShapeWithSizeParam(SceneElement sceneElement) {
        return sceneElement.getLiveShape().getParamValues().containsKey("size");
    }

    private static final boolean isOutline(SceneElement sceneElement) {
        if (sceneElement.getLiveShape().getId() == null && !sceneElement.getOutline().getContours().isEmpty()) {
            return true;
        }
        return false;
    }

    private static final <K, V> Map<K, V> replacing(Map<K, ? extends V> map, K k2, V v2) {
        Map<K, V> mutableMap = MapsKt.toMutableMap(map);
        mutableMap.replace(k2, v2);
        return mutableMap;
    }

    private static final SceneElement withUpdatedLiveShapeIfNeeded(SceneElement sceneElement, int i2) {
        if (getHasLiveShapeWithSizeParam(sceneElement) && i2 != 180) {
            final KeyableUserParameterValue keyableUserParameterValue = (KeyableUserParameterValue) MapsKt.getValue(sceneElement.getLiveShape().getParamValues(), "size");
            final Keyable<Vector2D> keyableFlipped = KeyableKt.flipped(keyableUserParameterValue.getVec2DValue());
            MediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$1 mediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.bugfix.MediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getLiveShape();
                }
            };
            MediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$2 mediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$2 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.bugfix.MediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$2
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((LiveShapeRef) obj).getParamValues();
                }
            };
            return (SceneElement) new aC(Reflection.getOrCreateKotlinClass(SceneElement.class), mediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$2.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), mediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$1.getReturnType(), mediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$1), mediaOrientationUpdaterKt$withUpdatedLiveShapeIfNeeded$liveShapeLens$2).t(sceneElement, new Function1() { // from class: com.alightcreative.app.motion.scene.bugfix.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MediaOrientationUpdaterKt.withUpdatedLiveShapeIfNeeded$lambda$13(keyableUserParameterValue, keyableFlipped, (Map) obj);
                }
            });
        }
        return sceneElement;
    }

    private static final SceneElement withUpdatedOutlineIfNeeded(SceneElement sceneElement, int i2) {
        if (isOutline(sceneElement)) {
            List<KeyableCubicBSpline> contours = sceneElement.getOutline().getContours();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
            for (KeyableCubicBSpline keyableCubicBSpline : contours) {
                List<KeyableCBKnot> knots = keyableCubicBSpline.getKnots();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
                for (KeyableCBKnot keyableCBKnot : knots) {
                    float f3 = i2;
                    arrayList2.add(keyableCBKnot.copy(KeyableKt.rotatedBy(keyableCBKnot.getP(), f3), KeyableKt.optionalRotatedBy(keyableCBKnot.getCurveIn(), f3), KeyableKt.optionalRotatedBy(keyableCBKnot.getCurveOut(), f3)));
                }
                arrayList.add(KeyableCubicBSpline.copy$default(keyableCubicBSpline, arrayList2, false, false, 6, null));
            }
            return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, sceneElement.getOutline().copy(arrayList), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
        }
        return sceneElement;
    }

    private static final SceneElement withUpdatedRotationAndPivot(SceneElement sceneElement, int i2) {
        return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.rotatedWithPivotBy(sceneElement.getTransform(), i2), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    public static final Scene withUpdatedMediaFillOf(Scene scene, List<SceneElement> toReplace, Uri newUri, Ew mediaType, Q contentResolverExt) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(toReplace, "toReplace");
        Intrinsics.checkNotNullParameter(newUri, "newUri");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(contentResolverExt, "contentResolverExt");
        Iterator<T> it = toReplace.iterator();
        while (it.hasNext()) {
            scene = withUpdatedMediaFillOf(scene, (SceneElement) it.next(), newUri, mediaType, contentResolverExt);
        }
        return scene;
    }
}
