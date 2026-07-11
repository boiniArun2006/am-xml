package com.alightcreative.app.motion.scene.liveshape;

import android.content.Context;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.userparam.ChoiceInfo;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002\u001a\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u001a\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017\u001a\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006\u001a\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0015\u0010\b\u001a\u00020\t*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0007*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"liveShapesLoaded", "Ljava/util/concurrent/CountDownLatch;", "liveShapesInitState", "Ljava/util/concurrent/atomic/AtomicBoolean;", "loadedLiveShapes", "", "", "Lcom/alightcreative/app/motion/scene/liveshape/LiveShape;", "isDirectional", "", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;", "(Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;)Z", "times", "Lcom/alightcreative/app/motion/scene/liveshape/PositionedShapeHandle;", "transform", "Lcom/alightcreative/app/motion/scene/Transform;", "shape", "Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;", "getShape", "(Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;)Lcom/alightcreative/app/motion/scene/liveshape/LiveShape;", "liveShapeById", "id", "liveShapeSortOrder", "", "getLiveShapes", "initLiveShapes", "", "context", "Landroid/content/Context;", "assetPath", "APP_STRING_PREFIX", "loadLiveShapes", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveShape.kt\ncom/alightcreative/app/motion/scene/liveshape/LiveShapeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1053#2:197\n1611#2,9:200\n1863#2:209\n1864#2:211\n1620#2:212\n1557#2:213\n1628#2,3:214\n1368#2:217\n1454#2,2:218\n1557#2:220\n1628#2,3:221\n1456#2,3:224\n774#2:227\n865#2,2:228\n774#2:230\n865#2,2:231\n1863#2,2:234\n13402#3:198\n13403#3:233\n1#4:199\n1#4:210\n*S KotlinDebug\n*F\n+ 1 LiveShape.kt\ncom/alightcreative/app/motion/scene/liveshape/LiveShapeKt\n*L\n150#1:197\n181#1:200,9\n181#1:209\n181#1:211\n181#1:212\n182#1:213\n182#1:214,3\n183#1:217\n183#1:218,2\n183#1:220\n183#1:221,3\n183#1:224,3\n185#1:227\n185#1:228,2\n186#1:230\n186#1:231,2\n162#1:234,2\n171#1:198\n171#1:233\n181#1:210\n*E\n"})
public final class LiveShapeKt {
    private static final String APP_STRING_PREFIX = "@am:string/";
    private static final CountDownLatch liveShapesLoaded = new CountDownLatch(1);
    private static final AtomicBoolean liveShapesInitState = new AtomicBoolean();
    private static final Map<String, LiveShape> loadedLiveShapes = new LinkedHashMap();
    private static final List<String> liveShapeSortOrder = CollectionsKt.listOf((Object[]) new String[]{"com.alightcreative.shapes.circle", "com.alightcreative.shapes.pie", "com.alightcreative.shapes.rect", "com.alightcreative.shapes.roundrect", "com.alightcreative.shapes.poly", "com.alightcreative.shapes.star", "com.alightcreative.shapes.plus", "com.alightcreative.shapes.multifoil", qfEYuUHwj.BbvAgDv, "com.alightcreative.shapes.arc", "com.alightcreative.shapes.arrow", "com.alightcreative.shapes.wideline", "com.alightcreative.shapes.triangle", "com.alightcreative.shapes.quad", "com.alightcreative.shapes.penta", "com.alightcreative.shapes.callout.roundrect"});

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeHandleType.values().length];
            try {
                iArr[ShapeHandleType.f46106X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeHandleType.f46107Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeHandleType.XY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<LiveShape> getLiveShapes() {
        if (!liveShapesInitState.get()) {
            Context applicationContext = IvA.n.rl().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            initLiveShapes(applicationContext, "shapes");
        }
        liveShapesLoaded.await();
        return CollectionsKt.toList(CollectionsKt.sortedWith(loadedLiveShapes.values(), new Comparator() { // from class: com.alightcreative.app.motion.scene.liveshape.LiveShapeKt$getLiveShapes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t3, T t4) {
                int iIndexOf = LiveShapeKt.liveShapeSortOrder.indexOf(((LiveShape) t3).getId());
                if (iIndexOf < 0) {
                    iIndexOf = 1000;
                }
                Integer numValueOf = Integer.valueOf(iIndexOf);
                int iIndexOf2 = LiveShapeKt.liveShapeSortOrder.indexOf(((LiveShape) t4).getId());
                return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(iIndexOf2 >= 0 ? iIndexOf2 : 1000));
            }
        }));
    }

    public static final LiveShape getShape(LiveShapeRef liveShapeRef) {
        Intrinsics.checkNotNullParameter(liveShapeRef, "<this>");
        return liveShapeById(liveShapeRef.getId());
    }

    public static final void initLiveShapes(Context context, final String assetPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        final Context applicationContext = context.getApplicationContext();
        ThreadsKt.thread$default(false, false, null, "liveShapesLoader", 0, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeKt.initLiveShapes$lambda$3(applicationContext, assetPath);
            }
        }, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLiveShapes$lambda$3(Context context, String str) {
        if (liveShapesInitState.getAndSet(true)) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(context);
        for (LiveShape liveShape : loadLiveShapes(context, str)) {
            loadedLiveShapes.put(liveShape.getId(), liveShape);
        }
        liveShapesLoaded.countDown();
        Iterator it = CollectionsKt.toList(loadedLiveShapes.values()).iterator();
        while (it.hasNext()) {
            LiveShapeScriptKt.getShapeOutline((LiveShape) it.next());
        }
        return Unit.INSTANCE;
    }

    public static final boolean isDirectional(ShapeHandleType shapeHandleType) {
        Intrinsics.checkNotNullParameter(shapeHandleType, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[shapeHandleType.ordinal()];
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public static final LiveShape liveShapeById(String str) {
        if (str == null) {
            return null;
        }
        liveShapesLoaded.await();
        return loadedLiveShapes.get(str);
    }

    private static final List<LiveShape> loadLiveShapes(Context context, String str) throws IOException {
        boolean z2;
        Collection collectionEmptyList;
        List<ChoiceInfo> choices;
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String[] list = context.getAssets().list(str);
        if (list != null) {
            int length = list.length;
            boolean z3 = false;
            int i2 = 0;
            while (i2 < length) {
                String str2 = list[i2];
                Intrinsics.checkNotNull(str2);
                UserParameter.Selector selector = null;
                if (StringsKt.endsWith$default(str2, ".xml", z3, 2, (Object) null)) {
                    InputStream inputStreamOpen = context.getAssets().open(new File(new File(str), str2).getPath());
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
                    try {
                        String text = TextStreamsKt.readText(inputStreamReader);
                        CloseableKt.closeFinally(inputStreamReader, null);
                        LiveShape liveShapeLiveShapeFromXml = LiveShapeParserKt.liveShapeFromXml(text);
                        if (linkedHashSet.contains(liveShapeLiveShapeFromXml.getId())) {
                            throw new IllegalStateException("Duplicate LiveShape id: '" + liveShapeLiveShapeFromXml.getId() + "'");
                        }
                        linkedHashSet.add(liveShapeLiveShapeFromXml.getId());
                        List listListOf = CollectionsKt.listOf(liveShapeLiveShapeFromXml.getName());
                        List<UserParameter> parameters = liveShapeLiveShapeFromXml.getParameters();
                        ArrayList arrayList2 = new ArrayList();
                        for (UserParameter userParameter : parameters) {
                            UserParameter.StaticText staticText = userParameter instanceof UserParameter.StaticText ? (UserParameter.StaticText) userParameter : null;
                            String text2 = staticText != null ? staticText.getText() : null;
                            if (text2 != null) {
                                arrayList2.add(text2);
                            }
                        }
                        List<UserParameter> parameters2 = liveShapeLiveShapeFromXml.getParameters();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters2, 10));
                        Iterator<T> it = parameters2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((UserParameter) it.next()).getLabel());
                        }
                        List<UserParameter> parameters3 = liveShapeLiveShapeFromXml.getParameters();
                        ArrayList arrayList4 = new ArrayList();
                        for (UserParameter userParameter2 : parameters3) {
                            UserParameter.Selector selector2 = userParameter2 instanceof UserParameter.Selector ? (UserParameter.Selector) userParameter2 : selector;
                            if (selector2 == null || (choices = selector2.getChoices()) == null) {
                                collectionEmptyList = CollectionsKt.emptyList();
                            } else {
                                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(choices, 10));
                                Iterator<T> it2 = choices.iterator();
                                while (it2.hasNext()) {
                                    collectionEmptyList.add(((ChoiceInfo) it2.next()).getLabel());
                                }
                            }
                            CollectionsKt.addAll(arrayList4, collectionEmptyList);
                            selector = null;
                        }
                        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList2), (Iterable) arrayList3), (Iterable) arrayList4);
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj : listPlus) {
                            if (StringsKt.startsWith$default((String) obj, APP_STRING_PREFIX, false, 2, (Object) null)) {
                                arrayList5.add(obj);
                            }
                        }
                        z2 = false;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : arrayList5) {
                            if (context.getResources().getIdentifier(StringsKt.drop((String) obj2, 11), "string", context.getPackageName()) == 0) {
                                arrayList6.add(obj2);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            throw new IllegalStateException("Missing strings in shape '" + liveShapeLiveShapeFromXml.getId() + "': " + CollectionsKt.joinToString$default(arrayList6, ",", null, null, 0, null, null, 62, null) + ".");
                        }
                        arrayList.add(liveShapeLiveShapeFromXml);
                    } finally {
                    }
                } else {
                    z2 = z3;
                }
                i2++;
                z3 = z2;
            }
        }
        return arrayList;
    }

    public static final PositionedShapeHandle times(PositionedShapeHandle positionedShapeHandle, Transform transform) {
        Intrinsics.checkNotNullParameter(positionedShapeHandle, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return positionedShapeHandle.copy(positionedShapeHandle.getShapeHandle(), GeometryKt.times(positionedShapeHandle.getPosition(), transform.getMatrix()), GeometryKt.rot(positionedShapeHandle.getAxis(), transform.getRotation()));
    }
}
