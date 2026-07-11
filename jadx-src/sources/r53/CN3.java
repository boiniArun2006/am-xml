package r53;

import HI0.Q;
import QmE.iF;
import android.content.Context;
import android.net.Uri;
import com.alightcreative.app.motion.scene.MalformedXMLException;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$1$lens$1;
import com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$2$lens$1;
import com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$2$lens$2;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import ga6.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f72840n;
    private final o rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iF f72841t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f72839O = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public CN3(Context context, o sceneSerializer, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sceneSerializer, "sceneSerializer");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f72840n = context;
        this.rl = sceneSerializer;
        this.f72841t = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scene J2(CN3 cn3, String str) {
        return cn3.Uo(cn3.nr(cn3.O(cn3.rl.rl(str))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement KN(Map map, SceneElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SceneElement.copy$default(it, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, map, null, null, null, null, null, null, null, false, null, null, false, null, null, -33554433, 127, null);
    }

    private final Scene Uo(Scene scene) {
        Pair pair;
        ArrayList arrayList = new ArrayList();
        Object objT = scene;
        int i2 = 0;
        for (Object obj : scene.getElements()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SceneElement sceneElement = (SceneElement) obj;
            oA.C c2 = new oA.C(Reflection.getOrCreateKotlinClass(Scene.class), KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Scene.class), null, false, null, 7, null));
            SceneKt$forEachElementRecursiveWithLens$1$lens$1 sceneKt$forEachElementRecursiveWithLens$1$lens$1 = SceneKt$forEachElementRecursiveWithLens$1$lens$1.INSTANCE;
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$1$lens$1.getReturnType(), c2, sceneKt$forEachElementRecursiveWithLens$1$lens$1);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Scene.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
            SceneElement sceneElement2 = (SceneElement) w6Var.get(objT);
            Map<Long, KeyableVisualEffectRef> visualEffects = sceneElement2.getVisualEffects();
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Long, KeyableVisualEffectRef> entry : visualEffects.entrySet()) {
                if (VisualEffectKt.visualEffectById(entry.getValue().getId()) != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.size() != sceneElement2.getVisualEffects().size()) {
                objT = w6Var.t(objT, new Function1() { // from class: r53.Wre
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CN3.KN(linkedHashMap, (SceneElement) obj2);
                    }
                });
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList.add(TuplesKt.to(w6Var, sceneElement.getNestedScene()));
            }
            i2 = i3;
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                oA.j jVar = (oA.j) pair.component1();
                int i5 = 0;
                for (Object obj2 : ((Scene) pair.component2()).getElements()) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    SceneElement sceneElement3 = (SceneElement) obj2;
                    SceneKt$forEachElementRecursiveWithLens$2$lens$1 sceneKt$forEachElementRecursiveWithLens$2$lens$1 = SceneKt$forEachElementRecursiveWithLens$2$lens$1.INSTANCE;
                    oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$1.getReturnType(), jVar, sceneKt$forEachElementRecursiveWithLens$2$lens$1);
                    SceneKt$forEachElementRecursiveWithLens$2$lens$2 sceneKt$forEachElementRecursiveWithLens$2$lens$2 = SceneKt$forEachElementRecursiveWithLens$2$lens$2.INSTANCE;
                    oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(Scene.class), sceneKt$forEachElementRecursiveWithLens$2$lens$2.getReturnType(), aCVar2, sceneKt$forEachElementRecursiveWithLens$2$lens$2);
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Scene.class);
                    KType type2 = aCVar3.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type2);
                    oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar3, i5);
                    SceneElement sceneElement4 = (SceneElement) w6Var2.get(objT);
                    Map<Long, KeyableVisualEffectRef> visualEffects2 = sceneElement4.getVisualEffects();
                    final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<Long, KeyableVisualEffectRef> entry2 : visualEffects2.entrySet()) {
                        if (VisualEffectKt.visualEffectById(entry2.getValue().getId()) != null) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    if (linkedHashMap2.size() != sceneElement4.getVisualEffects().size()) {
                        objT = w6Var2.t(objT, new Function1() { // from class: r53.Wre
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj22) {
                                return CN3.KN(linkedHashMap2, (SceneElement) obj22);
                            }
                        });
                    }
                    if (sceneElement3.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(w6Var2, sceneElement3.getNestedScene()));
                    }
                    i5 = i7;
                }
            }
        } while (pair != null);
        return (Scene) objT;
    }

    private final Scene nr(Scene scene) throws MalformedSceneException {
        ICC.qz qzVarRl = SceneKt.makeMediaComp(scene, new Q(this.f72840n)).rl();
        if (qzVarRl.n() > 1000 || qzVarRl.rl() > 1000) {
            throw new MalformedSceneException("Exceeds maximum peak media usage.", null, false, 6, null);
        }
        return scene;
    }

    @Override // r53.Ml
    public x0X.n n(final String xmlString, Uri uri) {
        Intrinsics.checkNotNullParameter(xmlString, "xmlString");
        Intrinsics.checkNotNullParameter(uri, "uri");
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: r53.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.J2(this.f72842n, xmlString);
            }
        }), j.w6.f67628O, j.EnumC0949j.J2, j.n.f67621O, null, 8, null), this.f72841t);
    }

    private final Scene O(Scene scene) throws MalformedXMLException {
        if (scene.getType() != SceneType.PRESET) {
            return scene;
        }
        throw new MalformedXMLException("Contains scene of illegal type.", null, false, 6, null);
    }
}
