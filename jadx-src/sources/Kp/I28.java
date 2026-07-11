package Kp;

import LQ.j;
import MoG.QJ;
import MoG.Xo;
import XoT.qz;
import android.net.Uri;
import com.alightcreative.app.motion.AlightMotionApplication;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import d2n.Ml;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class I28 {

    static final class j extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f5834O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5835n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5836r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f5837t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f5836r |= Integer.MIN_VALUE;
            return I28.J2(null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f5838O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5839n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f5840t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5838O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.Uo(null, null, this);
        }

        n(Continuation continuation) {
            super(continuation);
        }
    }

    static final class w6 extends ContinuationImpl {
        Object E2;
        Object J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        int f5841N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f5842O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f5843S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        /* synthetic */ Object f5844T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        Object f5845X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f5846Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5847e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5848g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5849n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f5850o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f5851r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f5852t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5844T = obj;
            this.f5841N |= Integer.MIN_VALUE;
            return I28.KN(null, this);
        }

        w6(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J2(SceneElement sceneElement, List list, Continuation continuation) {
        j jVar;
        Uri fillVideo;
        Uri uri;
        List list2;
        SceneElement sceneElement2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f5836r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f5836r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f5836r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (sceneElement.getType() == SceneElementType.Audio) {
                fillVideo = sceneElement.getSrc();
                if (Intrinsics.areEqual(fillVideo, Uri.EMPTY)) {
                    fillVideo = null;
                }
            } else {
                fillVideo = sceneElement.getFillVideo();
            }
            if (fillVideo == null) {
                return null;
            }
            List<Keyframe<Float>> keyframes = sceneElement.getSpeedMap().getKeyframes();
            if (keyframes == null || !keyframes.isEmpty()) {
                Iterator<T> it = keyframes.iterator();
                while (it.hasNext()) {
                    if (Math.abs(((Number) ((Keyframe) it.next()).getValue()).floatValue() - 1.0f) > 1.0E-4d) {
                        return null;
                    }
                }
            }
            AlightMotionApplication alightMotionApplicationRl = IvA.n.rl();
            jVar.f5835n = sceneElement;
            jVar.f5837t = list;
            jVar.f5834O = fillVideo;
            jVar.f5836r = 1;
            Object objN = Kp.n.n(alightMotionApplicationRl, fillVideo, jVar);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            uri = fillVideo;
            obj = objN;
            list2 = list;
            sceneElement2 = sceneElement;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = (Uri) jVar.f5834O;
            list2 = (List) jVar.f5837t;
            sceneElement2 = (SceneElement) jVar.f5835n;
            ResultKt.throwOnFailure(obj);
        }
        N1.Wre wre = (N1.Wre) qie((LQ.j) obj);
        if (wre == null) {
            return null;
        }
        MoG.Wre wreT = wre.t();
        if (wreT != null) {
            Ml.j jVar2 = d2n.Ml.f63370t;
            long jIk = ((d2n.Ml) RangesKt.coerceIn(d2n.Ml.rl(jVar2.rl(sceneElement2.getInTime())), d2n.Ml.rl(jVar2.J2()), d2n.Ml.rl(d2n.I28.t(d2n.n.n(wreT.n()))))).Ik();
            return new MoG.I28(O(sceneElement2, list2, uri), wreT, new d2n.Wre(jIk, ((d2n.Ml) RangesKt.coerceIn(d2n.Ml.rl(jVar2.rl(sceneElement2.getOutTime())), d2n.Ml.rl(d2n.I28.rl(jIk)), d2n.Ml.rl(d2n.n.n(wreT.n())))).Ik(), null), H7v.j.f3795O.n(1.0d), new sz.j(new C(sceneElement2)), null);
        }
        if (sceneElement2.getType() == SceneElementType.Audio) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
            firebaseCrashlytics.log("Null audio asset for scene element with audio type: " + firebaseCrashlytics + ".Resource info: " + wre);
            StringBuilder sb = new StringBuilder();
            sb.append("Null audio asset for uri ");
            sb.append(uri);
            firebaseCrashlytics.recordException(new C1398j(sb.toString()));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x044b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01d2 -> B:38:0x01da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x02a1 -> B:86:0x0448). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x02a3 -> B:56:0x02b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0374 -> B:15:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KN(com.alightcreative.app.motion.scene.Scene r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kp.I28.KN(com.alightcreative.app.motion.scene.Scene, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Uo(SceneElement sceneElement, List list, Continuation continuation) {
        n nVar;
        boolean z2;
        SceneElement sceneElement2;
        List list2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objN = nVar.f5838O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            if (sceneElement.getFillVideo() != null && !sceneElement.getHidden()) {
                Iterator it = list.iterator();
                loop0: while (true) {
                    z2 = false;
                    while (it.hasNext()) {
                        if (((SceneElement) it.next()).getHidden() || z2) {
                            z2 = true;
                        }
                    }
                }
                if (!z2) {
                    AlightMotionApplication alightMotionApplicationRl = IvA.n.rl();
                    Uri fillVideo = sceneElement.getFillVideo();
                    nVar.f5839n = sceneElement;
                    nVar.f5840t = list;
                    nVar.J2 = 1;
                    objN = Kp.n.n(alightMotionApplicationRl, fillVideo, nVar);
                    if (objN == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sceneElement2 = sceneElement;
                    list2 = list;
                }
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list2 = (List) nVar.f5840t;
        sceneElement2 = (SceneElement) nVar.f5839n;
        ResultKt.throwOnFailure(objN);
        N1.Wre wre = (N1.Wre) qie((LQ.j) objN);
        if (wre == null) {
            return null;
        }
        QJ qjGh = wre.gh();
        if (qjGh != null) {
            Ml.j jVar = d2n.Ml.f63370t;
            long jRl = jVar.rl(sceneElement2.getInTime());
            return new MoG.n(az(sceneElement2, list2), qjGh, new d2n.Wre(jRl, ((d2n.Ml) RangesKt.coerceAtLeast(d2n.Ml.rl(jVar.rl(sceneElement2.getOutTime())), d2n.Ml.rl(d2n.I28.rl(jRl)))).Ik(), null), sceneElement2.getTimeMapping().getSpeedFunction(), null);
        }
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        firebaseCrashlytics.log("Null video asset for scene element with fillVideo: " + firebaseCrashlytics + ".Resource info: " + wre);
        Uri fillVideo2 = sceneElement2.getFillVideo();
        StringBuilder sb = new StringBuilder();
        sb.append("Null video asset for uri ");
        sb.append(fillVideo2);
        firebaseCrashlytics.recordException(new C1398j(sb.toString()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence gh(SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return String.valueOf(it.getId());
    }

    private static final C1398j nr(N1.n nVar) {
        return new C1398j(nVar.toString());
    }

    private static final Object qie(LQ.j jVar) {
        if (!(jVar instanceof j.n)) {
            if (jVar instanceof j.w6) {
                return ((j.w6) jVar).n();
            }
            throw new NoWhenBranchMatchedException();
        }
        N1.n nVar = (N1.n) ((j.n) jVar).n();
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        firebaseCrashlytics.log("Failed to get resource info for scene element: " + firebaseCrashlytics + " (" + nVar + ")");
        firebaseCrashlytics.recordException(nr(nVar));
        return null;
    }

    public static final Map xMQ(Map map, Scene scene) {
        Pair pair;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : scene.getElements()) {
            mapCreateMapBuilder.put(Xo.j.n(az(sceneElement, CollectionsKt.emptyList())), Long.valueOf(sceneElement.getEngineState().getTrackId()));
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) qz.n(arrayList);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    mapCreateMapBuilder.put(Xo.j.n(az(sceneElement2, list)), Long.valueOf(sceneElement2.getEngineState().getTrackId()));
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
        Map mapBuild = MapsKt.build(mapCreateMapBuilder);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(Long.valueOf(((Number) MapsKt.getValue(mapBuild, entry.getKey())).longValue()), entry.getValue());
        }
        return linkedHashMap;
    }

    private static final String O(SceneElement sceneElement, List list, Uri uri) {
        return Xo.j.rl(mUb(sceneElement, list) + "-audio-" + uri);
    }

    private static final String az(SceneElement sceneElement, List list) {
        return Xo.j.rl(mUb(sceneElement, list) + "-video");
    }

    private static final String mUb(SceneElement sceneElement, List list) {
        return CollectionsKt.joinToString$default(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement), "_", null, null, 0, null, new Function1() { // from class: Kp.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.gh((SceneElement) obj);
            }
        }, 30, null);
    }
}
