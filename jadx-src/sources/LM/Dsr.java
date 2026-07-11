package LM;

import GJW.DC;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Dsr {

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f5947O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5948n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SceneHolder f5949t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(SceneHolder sceneHolder, Context context, Continuation continuation) {
            super(2, continuation);
            this.f5949t = sceneHolder;
            this.f5947O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I28(this.f5949t, this.f5947O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5948n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Scene rootScene = this.f5949t.getRootScene();
            Context context = this.f5947O;
            this.f5948n = 1;
            Object objNr = Dsr.nr(rootScene, context, this);
            if (objNr == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objNr;
        }
    }

    static final class Ml extends ContinuationImpl {
        Object E2;
        Object J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        /* synthetic */ Object f5950N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f5951O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f5952S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        Object f5953T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        Object f5954X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f5955Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5956e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5957g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5958n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f5959o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f5960r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f5961t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f5962v;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5950N = obj;
            this.f5962v |= Integer.MIN_VALUE;
            return Dsr.nr(null, null, this);
        }

        Ml(Continuation continuation) {
            super(continuation);
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f5963O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5964n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5965t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5965t = obj;
            this.f5963O |= Integer.MIN_VALUE;
            return Dsr.O(null, null, this);
        }

        n(Continuation continuation) {
            super(continuation);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Scene f5966O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5967n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SceneHolder f5968t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(SceneHolder sceneHolder, Scene scene, Continuation continuation) {
            super(2, continuation);
            this.f5968t = sceneHolder;
            this.f5966O = scene;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f5968t, this.f5966O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5967n == 0) {
                ResultKt.throwOnFailure(obj);
                this.f5968t.setRootScene(this.f5966O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:243:0x040e, B:111:0x0429], limit reached: 256 */
    /* JADX WARN: Path cross not found for [B:247:0x0631, B:163:0x0649], limit reached: 256 */
    /* JADX WARN: Path cross not found for [B:249:0x0823, B:214:0x083b], limit reached: 256 */
    /* JADX WARN: Path cross not found for [B:251:0x0248, B:63:0x0263], limit reached: 256 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0554 -> B:129:0x056c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x0759 -> B:233:0x0960). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x07b6 -> B:15:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x07d7 -> B:194:0x07d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:232:0x0953 -> B:233:0x0960). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x098e -> B:239:0x0996). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0217 -> B:50:0x0223). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x021a -> B:50:0x0223). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0270 -> B:75:0x036a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0360 -> B:75:0x036a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0379 -> B:123:0x0531). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0381 -> B:123:0x0531). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0387 -> B:123:0x0531). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x03b8 -> B:88:0x03c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x03ce -> B:90:0x03d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(Scene scene, Context context, Continuation continuation) {
        Ml ml;
        Map linkedHashMap;
        HI0.Q q2;
        List list;
        List arrayList;
        Iterator it;
        Scene scene2;
        HI0.Q q3;
        List list2;
        Iterator it2;
        SceneElement sceneElement;
        Object obj;
        final SceneElement sceneElement2;
        List listEmptyList;
        int i2;
        Cursor cursorJ2;
        final Long lBoxLong;
        Scene scene3;
        HI0.Q q4;
        List list3;
        Map map;
        Uri fillVideo;
        Object obj2;
        final Long lBoxLong2;
        Pair pair;
        List list4;
        Iterator it3;
        List list5;
        Pair pair2;
        HI0.Q q5;
        List list6;
        Object obj3;
        SceneElement sceneElement3;
        final SceneElement sceneElement4;
        int i3;
        HI0.Q q6;
        Map map2;
        final Long lBoxLong3;
        SceneElement sceneElement5;
        Object obj4;
        Ml ml2;
        List list7;
        Map map3;
        List list8;
        Pair pair3;
        List list9;
        SceneElement sceneElement6;
        Map map4;
        Uri uri;
        Ml ml3;
        Scene scene4;
        Object obj5;
        HI0.Q q7;
        final Long lBoxLong4;
        Ml ml4;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i5 = ml.f5962v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ml.f5962v = i5 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj6 = ml.f5950N;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = ml.f5962v;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj6);
            HI0.Q q8 = new HI0.Q(context);
            ArrayList arrayList2 = new ArrayList();
            if (!XoT.fuX.ck(context)) {
                return scene;
            }
            linkedHashMap = new LinkedHashMap();
            q2 = q8;
            list = arrayList2;
            arrayList = new ArrayList();
            it = scene.getElements().iterator();
            scene2 = scene;
            if (it.hasNext()) {
            }
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair == null) {
            }
        } else if (i7 == 1) {
            Uri uri2 = (Uri) ml.f5956e;
            linkedHashMap = (Map) ml.E2;
            listEmptyList = (List) ml.f5957g;
            sceneElement2 = (SceneElement) ml.f5952S;
            SceneElement sceneElement7 = (SceneElement) ml.f5955Z;
            Iterator it4 = (Iterator) ml.f5959o;
            List list10 = (List) ml.f5960r;
            Map map5 = (Map) ml.J2;
            List list11 = (List) ml.f5951O;
            HI0.Q q9 = (HI0.Q) ml.f5961t;
            Scene scene5 = (Scene) ml.f5958n;
            ResultKt.throwOnFailure(obj6);
            fillVideo = uri2;
            obj2 = obj6;
            scene3 = scene5;
            q4 = q9;
            list3 = list11;
            map = map5;
            list2 = list10;
            it2 = it4;
            sceneElement = sceneElement7;
            HI0.UGc uGc = (HI0.UGc) obj2;
            linkedHashMap.put(fillVideo, uGc);
            obj = uGc;
            linkedHashMap = map;
            list = list3;
            scene2 = scene3;
            q3 = q4;
            i2 = j.$EnumSwitchMapping$0[((HI0.UGc) obj).ordinal()];
            if (i2 == 1) {
            }
        } else if (i7 == 2) {
            Uri uri3 = (Uri) ml.f5956e;
            linkedHashMap = (Map) ml.E2;
            listEmptyList = (List) ml.f5957g;
            sceneElement2 = (SceneElement) ml.f5952S;
            SceneElement sceneElement8 = (SceneElement) ml.f5955Z;
            Iterator it5 = (Iterator) ml.f5959o;
            List list12 = (List) ml.f5960r;
            Map map6 = (Map) ml.J2;
            List list13 = (List) ml.f5951O;
            HI0.Q q10 = (HI0.Q) ml.f5961t;
            Scene scene6 = (Scene) ml.f5958n;
            ResultKt.throwOnFailure(obj6);
            Uri fillImage = uri3;
            Object obj7 = obj6;
            Scene scene7 = scene6;
            HI0.Q q11 = q10;
            List list14 = list13;
            Map map7 = map6;
            list2 = list12;
            it2 = it5;
            sceneElement = sceneElement8;
            HI0.UGc uGc2 = (HI0.UGc) obj7;
            linkedHashMap.put(fillImage, uGc2);
            Object obj8 = uGc2;
            linkedHashMap = map7;
            list = list14;
            scene2 = scene7;
            q3 = q11;
            int i8 = j.$EnumSwitchMapping$0[((HI0.UGc) obj8).ordinal()];
            if (i8 != 1) {
                Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                cursorJ2 = q3.J2(EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_display_name=?", new String[]{sceneElement2.getLabel()}, null);
                q2 = q3;
                if (cursorJ2 != null) {
                    try {
                        lBoxLong2 = cursorJ2.moveToFirst() ? Boxing.boxLong(cursorJ2.getLong(0)) : null;
                        Ml ml5 = ml;
                        CloseableKt.closeFinally(cursorJ2, null);
                        XoT.C.qie(scene2, new Function0() { // from class: LM.fuX
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Dsr.Uo(sceneElement2, lBoxLong2);
                            }
                        });
                        if (lBoxLong2 != null) {
                            List listPlus = CollectionsKt.plus((Collection<? extends SceneElement>) listEmptyList, SceneElement.copy$default(sceneElement2, null, 0, 0, 0L, null, null, null, null, EXTERNAL_CONTENT_URI.buildUpon().appendPath(lBoxLong2.toString()).build(), null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -257, 127, null));
                            ListIterator listIterator = listPlus.listIterator(listPlus.size());
                            if (!listIterator.hasPrevious()) {
                                throw new UnsupportedOperationException("Empty list can't be reduced.");
                            }
                            Object objPrevious = listIterator.previous();
                            while (listIterator.hasPrevious()) {
                                SceneElement sceneElement9 = (SceneElement) listIterator.previous();
                                objPrevious = SceneElement.copy$default(sceneElement9, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, SceneKt.copyUpdatingElement(sceneElement9.getNestedScene(), (SceneElement) objPrevious), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
                            }
                            list.add(objPrevious);
                        }
                        ml = ml5;
                        sceneElement2 = sceneElement;
                        it = it2;
                        arrayList = list2;
                        if (sceneElement2.getType().getHasNestedScene()) {
                            arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement2), sceneElement2.getNestedScene()));
                        }
                        if (it.hasNext()) {
                            sceneElement2 = (SceneElement) it.next();
                            listEmptyList = CollectionsKt.emptyList();
                            if (sceneElement2.getType().getHasFillVideo() && sceneElement2.getFillType() == FillType.MEDIA && sceneElement2.getFillVideo() != null) {
                                fillVideo = sceneElement2.getFillVideo();
                                Object obj9 = linkedHashMap.get(fillVideo);
                                if (obj9 == null) {
                                    Uri fillVideo2 = sceneElement2.getFillVideo();
                                    ml.f5958n = scene2;
                                    ml.f5961t = q2;
                                    ml.f5951O = list;
                                    ml.J2 = linkedHashMap;
                                    ml.f5960r = arrayList;
                                    ml.f5959o = it;
                                    ml.f5955Z = sceneElement2;
                                    ml.f5952S = sceneElement2;
                                    ml.f5957g = listEmptyList;
                                    ml.E2 = linkedHashMap;
                                    ml.f5956e = fillVideo;
                                    ml.f5962v = 1;
                                    Object objN = HI0.r.n(q2, fillVideo2, ml);
                                    if (objN != coroutine_suspended) {
                                        scene3 = scene2;
                                        obj2 = objN;
                                        q4 = q2;
                                        list2 = arrayList;
                                        list3 = list;
                                        map = linkedHashMap;
                                        it2 = it;
                                        sceneElement = sceneElement2;
                                        HI0.UGc uGc3 = (HI0.UGc) obj2;
                                        linkedHashMap.put(fillVideo, uGc3);
                                        obj = uGc3;
                                        linkedHashMap = map;
                                        list = list3;
                                        scene2 = scene3;
                                        q3 = q4;
                                        i2 = j.$EnumSwitchMapping$0[((HI0.UGc) obj).ordinal()];
                                        if (i2 == 1) {
                                            Uri EXTERNAL_CONTENT_URI2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI2, "EXTERNAL_CONTENT_URI");
                                            cursorJ2 = q3.J2(EXTERNAL_CONTENT_URI2, new String[]{"_id"}, "_display_name=?", new String[]{sceneElement2.getLabel()}, null);
                                            q2 = q3;
                                            if (cursorJ2 != null) {
                                                try {
                                                    lBoxLong = cursorJ2.moveToFirst() ? Boxing.boxLong(cursorJ2.getLong(0)) : null;
                                                    ml5 = ml;
                                                    CloseableKt.closeFinally(cursorJ2, null);
                                                    XoT.C.qie(scene2, new Function0() { // from class: LM.CN3
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return Dsr.J2(sceneElement2, lBoxLong);
                                                        }
                                                    });
                                                    if (lBoxLong != null) {
                                                        List listPlus2 = CollectionsKt.plus((Collection<? extends SceneElement>) listEmptyList, SceneElement.copy$default(sceneElement2, null, 0, 0, 0L, null, null, null, null, null, EXTERNAL_CONTENT_URI2.buildUpon().appendPath(lBoxLong.toString()).build(), null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -513, 127, null));
                                                        ListIterator listIterator2 = listPlus2.listIterator(listPlus2.size());
                                                        if (!listIterator2.hasPrevious()) {
                                                            throw new UnsupportedOperationException("Empty list can't be reduced.");
                                                        }
                                                        Object objPrevious2 = listIterator2.previous();
                                                        while (listIterator2.hasPrevious()) {
                                                            SceneElement sceneElement10 = (SceneElement) listIterator2.previous();
                                                            objPrevious2 = SceneElement.copy$default(sceneElement10, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, SceneKt.copyUpdatingElement(sceneElement10.getNestedScene(), (SceneElement) objPrevious2), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
                                                        }
                                                        list.add(objPrevious2);
                                                    }
                                                    ml = ml5;
                                                    sceneElement2 = sceneElement;
                                                    it = it2;
                                                    arrayList = list2;
                                                    if (sceneElement2.getType().getHasNestedScene()) {
                                                    }
                                                    if (it.hasNext()) {
                                                    }
                                                } finally {
                                                }
                                            }
                                            ml5 = ml;
                                            CloseableKt.closeFinally(cursorJ2, null);
                                            XoT.C.qie(scene2, new Function0() { // from class: LM.CN3
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Dsr.J2(sceneElement2, lBoxLong);
                                                }
                                            });
                                            if (lBoxLong != null) {
                                            }
                                            ml = ml5;
                                            sceneElement2 = sceneElement;
                                            it = it2;
                                            arrayList = list2;
                                            if (sceneElement2.getType().getHasNestedScene()) {
                                            }
                                            if (it.hasNext()) {
                                            }
                                        } else {
                                            if (i2 != 2 && i2 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            ml5 = ml;
                                            q2 = q3;
                                            ml = ml5;
                                            sceneElement2 = sceneElement;
                                            it = it2;
                                            arrayList = list2;
                                            if (sceneElement2.getType().getHasNestedScene()) {
                                            }
                                            if (it.hasNext()) {
                                            }
                                        }
                                    }
                                } else {
                                    obj = obj9;
                                    q3 = q2;
                                    list2 = arrayList;
                                    it2 = it;
                                    sceneElement = sceneElement2;
                                    i2 = j.$EnumSwitchMapping$0[((HI0.UGc) obj).ordinal()];
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                if (sceneElement2.getType().getHasFillImage() && sceneElement2.getFillType() == FillType.MEDIA && sceneElement2.getFillImage() != null) {
                                    fillImage = sceneElement2.getFillImage();
                                    Object obj10 = linkedHashMap.get(fillImage);
                                    if (obj10 == null) {
                                        Uri fillImage2 = sceneElement2.getFillImage();
                                        ml.f5958n = scene2;
                                        ml.f5961t = q2;
                                        ml.f5951O = list;
                                        ml.J2 = linkedHashMap;
                                        ml.f5960r = arrayList;
                                        ml.f5959o = it;
                                        ml.f5955Z = sceneElement2;
                                        ml.f5952S = sceneElement2;
                                        ml.f5957g = listEmptyList;
                                        ml.E2 = linkedHashMap;
                                        ml.f5956e = fillImage;
                                        ml.f5962v = 2;
                                        Object objN2 = HI0.r.n(q2, fillImage2, ml);
                                        if (objN2 != coroutine_suspended) {
                                            scene7 = scene2;
                                            obj7 = objN2;
                                            q11 = q2;
                                            list2 = arrayList;
                                            list14 = list;
                                            map7 = linkedHashMap;
                                            it2 = it;
                                            sceneElement = sceneElement2;
                                            HI0.UGc uGc22 = (HI0.UGc) obj7;
                                            linkedHashMap.put(fillImage, uGc22);
                                            Object obj82 = uGc22;
                                            linkedHashMap = map7;
                                            list = list14;
                                            scene2 = scene7;
                                            q3 = q11;
                                            int i82 = j.$EnumSwitchMapping$0[((HI0.UGc) obj82).ordinal()];
                                            if (i82 != 1) {
                                                if (i82 != 2 && i82 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                ml5 = ml;
                                                q2 = q3;
                                                ml = ml5;
                                                sceneElement2 = sceneElement;
                                                it = it2;
                                                arrayList = list2;
                                            }
                                        }
                                    } else {
                                        obj82 = obj10;
                                        q3 = q2;
                                        list2 = arrayList;
                                        it2 = it;
                                        sceneElement = sceneElement2;
                                        int i822 = j.$EnumSwitchMapping$0[((HI0.UGc) obj82).ordinal()];
                                        if (i822 != 1) {
                                        }
                                    }
                                }
                                if (sceneElement2.getType().getHasNestedScene()) {
                                }
                                if (it.hasNext()) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        pair = (Pair) XoT.qz.n(arrayList);
                        if (pair == null) {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                Ml ml52 = ml;
                CloseableKt.closeFinally(cursorJ2, null);
                XoT.C.qie(scene2, new Function0() { // from class: LM.fuX
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.Uo(sceneElement2, lBoxLong2);
                    }
                });
                if (lBoxLong2 != null) {
                }
                ml = ml52;
                sceneElement2 = sceneElement;
                it = it2;
                arrayList = list2;
                if (sceneElement2.getType().getHasNestedScene()) {
                }
                if (it.hasNext()) {
                }
                pair = (Pair) XoT.qz.n(arrayList);
                if (pair == null) {
                }
            }
        } else if (i7 == 3) {
            SceneElement sceneElement11 = (SceneElement) ml.f5953T;
            Uri uri4 = (Uri) ml.f5954X;
            Map map8 = (Map) ml.f5956e;
            List list15 = (List) ml.E2;
            SceneElement sceneElement12 = (SceneElement) ml.f5957g;
            Iterator it6 = (Iterator) ml.f5952S;
            list9 = (List) ml.f5955Z;
            Pair pair4 = (Pair) ml.f5959o;
            List list16 = (List) ml.f5960r;
            Map map9 = (Map) ml.J2;
            List list17 = (List) ml.f5951O;
            HI0.Q q12 = (HI0.Q) ml.f5961t;
            Scene scene8 = (Scene) ml.f5958n;
            ResultKt.throwOnFailure(obj6);
            map3 = map9;
            list7 = list17;
            q2 = q12;
            list4 = list15;
            uri = uri4;
            ml3 = ml;
            scene4 = scene8;
            obj5 = obj6;
            list8 = list16;
            pair3 = pair4;
            it3 = it6;
            sceneElement6 = sceneElement12;
            map4 = map8;
            sceneElement4 = sceneElement11;
            HI0.UGc uGc4 = (HI0.UGc) obj5;
            map4.put(uri, uGc4);
            sceneElement3 = sceneElement4;
            sceneElement4 = sceneElement6;
            pair2 = pair3;
            list5 = list8;
            list = list7;
            q5 = q2;
            list6 = list9;
            obj3 = uGc4;
            scene2 = scene4;
            ml = ml3;
            linkedHashMap = map3;
            i3 = j.$EnumSwitchMapping$0[((HI0.UGc) obj3).ordinal()];
            Ml ml6 = ml;
            if (i3 == 1) {
            }
            linkedHashMap = map2;
            obj4 = coroutine_suspended;
            list4 = list6;
            sceneElement4 = sceneElement5;
            ml2 = ml6;
            q2 = q6;
            if (sceneElement4.getType().getHasNestedScene()) {
            }
            ml = ml2;
            coroutine_suspended = obj4;
            if (!it3.hasNext()) {
            }
        } else {
            if (i7 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SceneElement sceneElement13 = (SceneElement) ml.f5953T;
            Uri uri5 = (Uri) ml.f5954X;
            Map map10 = (Map) ml.f5956e;
            List list18 = (List) ml.E2;
            SceneElement sceneElement14 = (SceneElement) ml.f5957g;
            it3 = (Iterator) ml.f5952S;
            List list19 = (List) ml.f5955Z;
            pair2 = (Pair) ml.f5959o;
            list5 = (List) ml.f5960r;
            Map map11 = (Map) ml.J2;
            Object obj11 = obj6;
            List list20 = (List) ml.f5951O;
            HI0.Q q13 = (HI0.Q) ml.f5961t;
            Scene scene9 = (Scene) ml.f5958n;
            ResultKt.throwOnFailure(obj11);
            list = list20;
            Scene scene10 = scene9;
            Uri uri6 = uri5;
            List list21 = list18;
            list4 = list19;
            SceneElement sceneElement15 = sceneElement14;
            sceneElement4 = sceneElement13;
            Ml ml7 = ml;
            Map map12 = map10;
            q2 = q13;
            obj4 = coroutine_suspended;
            HI0.UGc uGc5 = (HI0.UGc) obj11;
            map12.put(uri6, uGc5);
            scene2 = scene10;
            ml = ml7;
            linkedHashMap = map11;
            Object obj12 = uGc5;
            SceneElement sceneElement16 = sceneElement4;
            sceneElement4 = sceneElement15;
            List list22 = list4;
            list4 = list21;
            HI0.Q q14 = q2;
            int i9 = j.$EnumSwitchMapping$0[((HI0.UGc) obj12).ordinal()];
            if (i9 == 1) {
                Uri EXTERNAL_CONTENT_URI3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI3, "EXTERNAL_CONTENT_URI");
                cursorJ2 = q14.J2(EXTERNAL_CONTENT_URI3, new String[]{"_id"}, "_display_name=?", new String[]{sceneElement4.getLabel()}, null);
                q7 = q14;
                if (cursorJ2 != null) {
                    try {
                        lBoxLong4 = cursorJ2.moveToFirst() ? Boxing.boxLong(cursorJ2.getLong(0)) : null;
                        ml4 = ml;
                        CloseableKt.closeFinally(cursorJ2, null);
                        XoT.C.qie(scene2, new Function0() { // from class: LM.fuX
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Dsr.Uo(sceneElement4, lBoxLong4);
                            }
                        });
                        if (lBoxLong4 != null) {
                            List listPlus3 = CollectionsKt.plus((Collection<? extends SceneElement>) list4, SceneElement.copy$default(sceneElement4, null, 0, 0, 0L, null, null, null, null, EXTERNAL_CONTENT_URI3.buildUpon().appendPath(lBoxLong4.toString()).build(), null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -257, 127, null));
                            ListIterator listIterator3 = listPlus3.listIterator(listPlus3.size());
                            if (!listIterator3.hasPrevious()) {
                                throw new UnsupportedOperationException("Empty list can't be reduced.");
                            }
                            Object objPrevious3 = listIterator3.previous();
                            while (listIterator3.hasPrevious()) {
                                SceneElement sceneElement17 = (SceneElement) listIterator3.previous();
                                objPrevious3 = SceneElement.copy$default(sceneElement17, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, SceneKt.copyUpdatingElement(sceneElement17.getNestedScene(), (SceneElement) objPrevious3), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
                            }
                            list.add(objPrevious3);
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                ml4 = ml;
                CloseableKt.closeFinally(cursorJ2, null);
                XoT.C.qie(scene2, new Function0() { // from class: LM.fuX
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.Uo(sceneElement4, lBoxLong4);
                    }
                });
                if (lBoxLong4 != null) {
                }
            } else {
                if (i9 != 2 && i9 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ml4 = ml;
                q7 = q14;
            }
            sceneElement4 = sceneElement16;
            list4 = list22;
            q2 = q7;
            ml2 = ml4;
            if (sceneElement4.getType().getHasNestedScene()) {
                list5.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list4, sceneElement4), sceneElement4.getNestedScene()));
            }
            ml = ml2;
            coroutine_suspended = obj4;
            if (!it3.hasNext()) {
                sceneElement4 = (SceneElement) it3.next();
                if (sceneElement4.getType().getHasFillVideo() && sceneElement4.getFillType() == FillType.MEDIA && sceneElement4.getFillVideo() != null) {
                    Uri fillVideo3 = sceneElement4.getFillVideo();
                    obj3 = linkedHashMap.get(fillVideo3);
                    if (obj3 == null) {
                        Uri fillVideo4 = sceneElement4.getFillVideo();
                        ml.f5958n = scene2;
                        ml.f5961t = q2;
                        ml.f5951O = list;
                        ml.J2 = linkedHashMap;
                        ml.f5960r = list5;
                        ml.f5959o = pair2;
                        ml.f5955Z = list4;
                        ml.f5952S = it3;
                        ml.f5957g = sceneElement4;
                        ml.E2 = list4;
                        ml.f5956e = linkedHashMap;
                        ml.f5954X = fillVideo3;
                        ml.f5953T = sceneElement4;
                        ml.f5962v = 3;
                        Object objN3 = HI0.r.n(q2, fillVideo4, ml);
                        if (objN3 != coroutine_suspended) {
                            map3 = linkedHashMap;
                            list8 = list5;
                            list7 = list;
                            list9 = list4;
                            ml3 = ml;
                            sceneElement6 = sceneElement4;
                            pair3 = pair2;
                            scene4 = scene2;
                            map4 = map3;
                            obj5 = objN3;
                            uri = fillVideo3;
                            HI0.UGc uGc42 = (HI0.UGc) obj5;
                            map4.put(uri, uGc42);
                            sceneElement3 = sceneElement4;
                            sceneElement4 = sceneElement6;
                            pair2 = pair3;
                            list5 = list8;
                            list = list7;
                            q5 = q2;
                            list6 = list9;
                            obj3 = uGc42;
                            scene2 = scene4;
                            ml = ml3;
                            linkedHashMap = map3;
                            i3 = j.$EnumSwitchMapping$0[((HI0.UGc) obj3).ordinal()];
                            Ml ml62 = ml;
                            if (i3 == 1) {
                                Uri EXTERNAL_CONTENT_URI4 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI4, "EXTERNAL_CONTENT_URI");
                                cursorJ2 = q5.J2(EXTERNAL_CONTENT_URI4, new String[]{"_id"}, "_display_name=?", new String[]{sceneElement4.getLabel()}, null);
                                q6 = q5;
                                if (cursorJ2 != null) {
                                    try {
                                        if (cursorJ2.moveToFirst()) {
                                            map2 = linkedHashMap;
                                            lBoxLong3 = Boxing.boxLong(cursorJ2.getLong(0));
                                        }
                                        sceneElement5 = sceneElement3;
                                        CloseableKt.closeFinally(cursorJ2, null);
                                        XoT.C.qie(scene2, new Function0() { // from class: LM.CN3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Dsr.J2(sceneElement4, lBoxLong3);
                                            }
                                        });
                                        if (lBoxLong3 != null) {
                                            List listPlus4 = CollectionsKt.plus((Collection<? extends SceneElement>) list4, SceneElement.copy$default(sceneElement4, null, 0, 0, 0L, null, null, null, null, null, EXTERNAL_CONTENT_URI4.buildUpon().appendPath(lBoxLong3.toString()).build(), null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -513, 127, null));
                                            ListIterator listIterator4 = listPlus4.listIterator(listPlus4.size());
                                            if (!listIterator4.hasPrevious()) {
                                                throw new UnsupportedOperationException("Empty list can't be reduced.");
                                            }
                                            Object objPrevious4 = listIterator4.previous();
                                            while (listIterator4.hasPrevious()) {
                                                SceneElement sceneElement18 = (SceneElement) listIterator4.previous();
                                                objPrevious4 = SceneElement.copy$default(sceneElement18, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, SceneKt.copyUpdatingElement(sceneElement18.getNestedScene(), (SceneElement) objPrevious4), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null);
                                            }
                                            list.add(objPrevious4);
                                        }
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                }
                                map2 = linkedHashMap;
                                lBoxLong3 = null;
                                sceneElement5 = sceneElement3;
                                CloseableKt.closeFinally(cursorJ2, null);
                                XoT.C.qie(scene2, new Function0() { // from class: LM.CN3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Dsr.J2(sceneElement4, lBoxLong3);
                                    }
                                });
                                if (lBoxLong3 != null) {
                                }
                            } else {
                                if (i3 != 2 && i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                map2 = linkedHashMap;
                                sceneElement5 = sceneElement3;
                                q6 = q5;
                            }
                            linkedHashMap = map2;
                            obj4 = coroutine_suspended;
                            list4 = list6;
                            sceneElement4 = sceneElement5;
                            ml2 = ml62;
                            q2 = q6;
                            if (sceneElement4.getType().getHasNestedScene()) {
                            }
                            ml = ml2;
                            coroutine_suspended = obj4;
                            if (!it3.hasNext()) {
                            }
                        }
                    } else {
                        sceneElement3 = sceneElement4;
                        q5 = q2;
                        list6 = list4;
                        i3 = j.$EnumSwitchMapping$0[((HI0.UGc) obj3).ordinal()];
                        Ml ml622 = ml;
                        if (i3 == 1) {
                        }
                        linkedHashMap = map2;
                        obj4 = coroutine_suspended;
                        list4 = list6;
                        sceneElement4 = sceneElement5;
                        ml2 = ml622;
                        q2 = q6;
                        if (sceneElement4.getType().getHasNestedScene()) {
                        }
                        ml = ml2;
                        coroutine_suspended = obj4;
                        if (!it3.hasNext()) {
                        }
                    }
                } else if (sceneElement4.getType().getHasFillImage() && sceneElement4.getFillType() == FillType.MEDIA && sceneElement4.getFillImage() != null) {
                    Uri fillImage3 = sceneElement4.getFillImage();
                    obj12 = linkedHashMap.get(fillImage3);
                    if (obj12 == null) {
                        Uri fillImage4 = sceneElement4.getFillImage();
                        ml.f5958n = scene2;
                        ml.f5961t = q2;
                        ml.f5951O = list;
                        ml.J2 = linkedHashMap;
                        ml.f5960r = list5;
                        ml.f5959o = pair2;
                        ml.f5955Z = list4;
                        ml.f5952S = it3;
                        ml.f5957g = sceneElement4;
                        ml.E2 = list4;
                        ml.f5956e = linkedHashMap;
                        ml.f5954X = fillImage3;
                        ml.f5953T = sceneElement4;
                        Scene scene11 = scene2;
                        ml.f5962v = 4;
                        Object objN4 = HI0.r.n(q2, fillImage4, ml);
                        if (objN4 != coroutine_suspended) {
                            uri6 = fillImage3;
                            list21 = list4;
                            scene10 = scene11;
                            sceneElement15 = sceneElement4;
                            obj11 = objN4;
                            map11 = linkedHashMap;
                            ml7 = ml;
                            map12 = map11;
                            obj4 = coroutine_suspended;
                            HI0.UGc uGc52 = (HI0.UGc) obj11;
                            map12.put(uri6, uGc52);
                            scene2 = scene10;
                            ml = ml7;
                            linkedHashMap = map11;
                            Object obj122 = uGc52;
                            SceneElement sceneElement162 = sceneElement4;
                            sceneElement4 = sceneElement15;
                            List list222 = list4;
                            list4 = list21;
                            HI0.Q q142 = q2;
                            int i92 = j.$EnumSwitchMapping$0[((HI0.UGc) obj122).ordinal()];
                            if (i92 == 1) {
                            }
                            sceneElement4 = sceneElement162;
                            list4 = list222;
                            q2 = q7;
                            ml2 = ml4;
                            if (sceneElement4.getType().getHasNestedScene()) {
                            }
                            ml = ml2;
                            coroutine_suspended = obj4;
                            if (!it3.hasNext()) {
                            }
                        }
                    } else {
                        obj4 = coroutine_suspended;
                        sceneElement162 = sceneElement4;
                        list222 = list4;
                        HI0.Q q1422 = q2;
                        int i922 = j.$EnumSwitchMapping$0[((HI0.UGc) obj122).ordinal()];
                        if (i922 == 1) {
                        }
                        sceneElement4 = sceneElement162;
                        list4 = list222;
                        q2 = q7;
                        ml2 = ml4;
                        if (sceneElement4.getType().getHasNestedScene()) {
                        }
                        ml = ml2;
                        coroutine_suspended = obj4;
                        if (!it3.hasNext()) {
                        }
                    }
                } else {
                    obj4 = coroutine_suspended;
                    ml2 = ml;
                    scene2 = scene2;
                    if (sceneElement4.getType().getHasNestedScene()) {
                    }
                    ml = ml2;
                    coroutine_suspended = obj4;
                    if (!it3.hasNext()) {
                        Object obj13 = coroutine_suspended;
                        Ml ml8 = ml;
                        pair = pair2;
                        arrayList = list5;
                        scene2 = scene2;
                        if (pair != null) {
                            return SceneKt.copyUpdatingElements(scene2, list);
                        }
                        ml = ml8;
                        coroutine_suspended = obj13;
                        pair = (Pair) XoT.qz.n(arrayList);
                        if (pair == null) {
                            list4 = (List) pair.component1();
                            it3 = ((Scene) pair.component2()).getElements().iterator();
                            list5 = arrayList;
                            pair2 = pair;
                            if (!it3.hasNext()) {
                            }
                        } else {
                            obj13 = coroutine_suspended;
                            ml8 = ml;
                            if (pair != null) {
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HI0.UGc.values().length];
            try {
                iArr[HI0.UGc.f3843t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HI0.UGc.f3841n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HI0.UGc.f3840O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (GJW.Dsr.Uo(r7, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(SceneHolder sceneHolder, Context context, Continuation continuation) {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f5963O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f5963O = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objUo = nVar.f5965t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f5963O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            GJW.lej lejVarRl = GJW.OU.rl();
            I28 i28 = new I28(sceneHolder, context, null);
            nVar.f5964n = sceneHolder;
            nVar.f5963O = 1;
            objUo = GJW.Dsr.Uo(lejVarRl, i28, nVar);
            if (objUo != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUo);
            return Unit.INSTANCE;
        }
        sceneHolder = (SceneHolder) nVar.f5964n;
        ResultKt.throwOnFailure(objUo);
        DC dcP0N = GJW.OU.t().p0N();
        w6 w6Var = new w6(sceneHolder, (Scene) objUo, null);
        nVar.f5964n = null;
        nVar.f5963O = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J2(SceneElement sceneElement, Long l2) {
        return "Scene/fillVideo Not found: " + sceneElement.getFillVideo() + " (" + sceneElement.getLabel() + ") replacementId=" + l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo(SceneElement sceneElement, Long l2) {
        return "Scene/fillImage Not found: " + sceneElement.getFillImage() + " (" + sceneElement.getLabel() + ") replacementId=" + l2;
    }
}
