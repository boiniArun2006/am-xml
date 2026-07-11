package xhQ;

import GJW.OU;
import GJW.vd;
import HI0.afx;
import JK.w6;
import android.content.Context;
import com.alightcreative.app.motion.easing.EasingKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kgE.K;
import kgE.Md;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class I28 implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f75405n;
    private final kgE.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Q.Xo f75406t;

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ I28 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f75407O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75408n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f75409t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(List list, I28 i28, Continuation continuation) {
            super(2, continuation);
            this.f75407O = list;
            this.J2 = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f75407O, this.J2, continuation);
            jVar.f75409t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM313constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f75408n == 0) {
                ResultKt.throwOnFailure(obj);
                List<String> list = this.f75407O;
                I28 i28 = this.J2;
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    Object obj2 = null;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM313constructorimpl = Result.m313constructorimpl(new Pair(str, SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(afx.o(i28.f75405n, str), null, 1, null), false, false, false, 14, null)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                    }
                    if (!Result.m319isFailureimpl(objM313constructorimpl)) {
                        obj2 = objM313constructorimpl;
                    }
                    Pair pair = (Pair) obj2;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75411n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f75412t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75412t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.n(null, this);
        }
    }

    public I28(Context context, kgE.fuX iapManager, Q.Xo rewardedAdUnlockUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(rewardedAdUnlockUseCase, "rewardedAdUnlockUseCase");
        this.f75405n = context;
        this.rl = iapManager;
        this.f75406t = rewardedAdUnlockUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xhQ.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(List list, Continuation continuation) {
        n nVar;
        I28 i28;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objO = nVar.f75412t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            nVar.f75411n = this;
            nVar.J2 = 1;
            objO = O(list, nVar);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            i28 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i28 = (I28) nVar.f75411n;
            ResultKt.throwOnFailure(objO);
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (Iterable) objO) {
            CollectionsKt.addAll(arrayList, i28.nr((Scene) pair.component2(), (String) pair.component1()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!i28.rl.Uo().contains(((CN3) obj).rl())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!i28.f75406t.rl(((CN3) obj2).t())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    @Override // xhQ.Ml
    public List rl(String projectId, Scene scene) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(scene, "scene");
        List listNr = nr(scene, projectId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listNr) {
            if (!this.rl.Uo().contains(((CN3) obj).rl())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!this.f75406t.rl(((CN3) obj2).t())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    private final Object O(List list, Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new j(list, this, null), continuation);
    }

    private final List nr(Scene scene, String str) {
        CN3 w6Var;
        K k2;
        JK.w6 c0153w6;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (SceneElement sceneElement : scene.getElements()) {
            Collection<KeyableVisualEffectRef> collectionValues = sceneElement.getVisualEffects().values();
            ArrayList<KeyableVisualEffectRef> arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (Md.n().contains(((KeyableVisualEffectRef) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (KeyableVisualEffectRef keyableVisualEffectRef : arrayList) {
                arrayList2.add(new xhQ.n(keyableVisualEffectRef.getId(), sceneElement.getLabel(), K.f70072S, new w6.Ml(str, keyableVisualEffectRef.getId())));
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                listCreateListBuilder.add((xhQ.n) it.next());
            }
            List<Keyable<? extends Object>> keyableProperties = SceneElementKt.getKeyableProperties(sceneElement);
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = keyableProperties.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList3, ((Keyable) it2.next()).getKeyframes());
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (EasingKt.getAdvanced(((Keyframe) obj2).getEasing())) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new xhQ.j(((Keyframe) it3.next()).getEasing(), sceneElement.getLabel(), K.f70075X, new w6.j(str)));
            }
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                listCreateListBuilder.add((xhQ.j) it4.next());
            }
            if (sceneElement.getParent() != null) {
                listCreateListBuilder.add(new w6(2131231859, sceneElement.getLabel(), K.f70073T, new w6.C0153w6(str)));
            }
            if (sceneElement.getType() == SceneElementType.Camera) {
                listCreateListBuilder.add(new w6(2131231569, sceneElement.getLabel(), K.f70070N, new w6.n(str)));
            }
            List<CN3> listNr = nr(sceneElement.getNestedScene(), str);
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listNr, 10));
            for (CN3 cn3 : listNr) {
                if (cn3 instanceof xhQ.n) {
                    xhQ.n nVar = (xhQ.n) cn3;
                    w6Var = new xhQ.n(nVar.nr(), sceneElement.getLabel() + " ▸ " + nVar.n(), K.f70072S, new w6.Ml(str, nVar.nr()));
                } else if (cn3 instanceof xhQ.j) {
                    xhQ.j jVar = (xhQ.j) cn3;
                    w6Var = new xhQ.j(jVar.nr(), sceneElement.getLabel() + " ▸ " + jVar.n(), K.f70075X, new w6.j(str));
                } else if (cn3 instanceof w6) {
                    w6 w6Var2 = (w6) cn3;
                    int iNr = w6Var2.nr();
                    String str2 = sceneElement.getLabel() + " ▸ " + w6Var2.n();
                    if (w6Var2.t() instanceof w6.n) {
                        k2 = K.f70070N;
                    } else {
                        k2 = K.f70073T;
                    }
                    if (w6Var2.t() instanceof w6.n) {
                        c0153w6 = new w6.n(str);
                    } else {
                        c0153w6 = new w6.C0153w6(str);
                    }
                    w6Var = new w6(iNr, str2, k2, c0153w6);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList6.add(w6Var);
            }
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                listCreateListBuilder.add((CN3) it5.next());
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
