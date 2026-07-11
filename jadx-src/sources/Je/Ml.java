package Je;

import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableEdgeDecoration;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneElementTypeKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.StyledText;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.widget.U4;
import f0P.p4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kgE.K;
import kgE.Md;
import kgE.fuX;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml implements Ja.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f4611n;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float KN(float f3, float f4, float f5) {
        return (f5 * f3) / f4;
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FillType.values().length];
            try {
                iArr[FillType.MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FillType.INTRINSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[U4.values().length];
            try {
                iArr2[U4.f47298O.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[U4.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[U4.f47305r.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[U4.f47304o.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[U4.f47301Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[U4.f47299S.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[U4.f47303g.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[U4.E2.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Ml(fuX iapManager) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f4611n = iapManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable Uo(SceneElement sceneElement, SceneElement sceneElement2, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final float fGh = p4.gh(sceneElement, 1.0f) - p4.gh(sceneElement, 0.0f);
        final float fGh2 = p4.gh(sceneElement2, 1.0f) - p4.gh(sceneElement2, 0.0f);
        return KeyableKt.copyAdjustingTime(sceneElement.getSpeedMap(), new Function1() { // from class: Je.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(Ml.KN(fGh2, fGh, ((Float) obj).floatValue()));
            }
        });
    }

    private final Set mUb(SceneElement sceneElement) {
        U4 u4;
        U4 u42 = U4.f47305r;
        u42.nr(sceneElement.getType().getHasBlendingMode());
        Unit unit = Unit.INSTANCE;
        U4 u43 = U4.f47304o;
        u43.nr(sceneElement.getType().getHasTransform());
        U4 u44 = U4.J2;
        u44.nr(sceneElement.getType().getHasBorderAndShadow());
        U4 u45 = U4.f47303g;
        u45.nr(sceneElement.getType().getHasVisualEffects());
        U4 u46 = U4.f47298O;
        u46.nr(false);
        if (sceneElement.getType() == SceneElementType.Scene || !SceneElementKt.hasAnyAudio(sceneElement)) {
            u4 = U4.f47301Z;
            u4.nr(sceneElement.getType().getHasText());
        } else {
            u4 = U4.f47299S;
        }
        U4 u47 = U4.E2;
        u47.nr(true);
        return SetsKt.setOf((Object[]) new U4[]{u42, u43, u44, u45, u46, u4, u47});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable xMQ(SceneElement sceneElement, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sceneElement.getSpeedMap();
    }

    @Override // Ja.j
    public void n(SceneElement element, String presetId, SceneElement styleElement, SceneHolder sceneHolder) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(presetId, "presetId");
        Intrinsics.checkNotNullParameter(styleElement, "styleElement");
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        J2(CollectionsKt.listOf(SceneElement.copy$default(element, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, presetId, -1, 63, null)), styleElement, mUb(element), sceneHolder, true);
    }

    @Override // Ja.j
    public void rl(List elements, SceneElement styleElement, Set optList, SceneHolder sceneHolder) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(styleElement, "styleElement");
        Intrinsics.checkNotNullParameter(optList, "optList");
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        J2(elements, styleElement, optList, sceneHolder, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r9v13, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r9v18, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r9v22, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r9v27, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r9v36, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r9v46, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r9v54, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r9v62, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r9v67, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    private final void J2(List list, SceneElement sceneElement, Set set, SceneHolder sceneHolder, boolean z2) {
        boolean z3;
        final SceneElement sceneElement2;
        KeyableEdgeDecoration stroke;
        T tCopy$default;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ?? r12 = (SceneElement) it.next();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r12;
            boolean z4 = false;
            if (r12.getType() == SceneElementType.Scene && sceneElement.getSpeedMap().getKeyed()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                sceneElement2 = sceneElement;
                objectRef.element = p4.ck((SceneElement) objectRef.element, new Function1() { // from class: Je.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ml.Uo(sceneElement2, r12, (Keyable) obj);
                    }
                });
            } else {
                sceneElement2 = sceneElement;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                U4 u4 = (U4) it2.next();
                if (u4.t() && u4.rl()) {
                    switch (j.$EnumSwitchMapping$1[u4.ordinal()]) {
                        case 1:
                            if (r12.getType().getHasFillColor()) {
                                int i2 = j.$EnumSwitchMapping$0[sceneElement2.getFillType().ordinal()];
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (SceneElementTypeKt.getSupportsMediaFill(sceneElement2.getType()) && SceneElementTypeKt.getSupportsMediaFill(r12.getType())) {
                                            objectRef.element = SceneElement.copy$default((SceneElement) objectRef.element, null, 0, 0, 0L, null, null, null, sceneElement2.getFillColor(), sceneElement2.getFillImage(), sceneElement2.getFillVideo(), sceneElement2.getFillGradient(), sceneElement2.getFillType(), null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -3969, 127, null);
                                        } else {
                                            objectRef.element = SceneElement.copy$default((SceneElement) objectRef.element, null, 0, 0, 0L, null, null, null, sceneElement2.getFillColor(), null, null, sceneElement2.getFillGradient(), sceneElement2.getFillType(), null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -3201, 127, null);
                                        }
                                        Unit unit = Unit.INSTANCE;
                                    } else {
                                        if (SceneElementTypeKt.getSupportsIntrinsicFill(r12.getType())) {
                                            objectRef.element = SceneElement.copy$default((SceneElement) objectRef.element, null, 0, 0, 0L, null, null, null, sceneElement2.getFillColor(), null, null, sceneElement2.getFillGradient(), sceneElement2.getFillType(), null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -3201, 127, null);
                                        }
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                } else {
                                    if (SceneElementTypeKt.getSupportsMediaFill(r12.getType())) {
                                        objectRef.element = SceneElement.copy$default((SceneElement) objectRef.element, null, 0, 0, 0L, null, null, null, sceneElement2.getFillColor(), sceneElement2.getFillImage(), sceneElement2.getFillVideo(), sceneElement2.getFillGradient(), sceneElement2.getFillType(), null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -3969, 127, null);
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            }
                            Unit unit4 = Unit.INSTANCE;
                            break;
                        case 2:
                            if (r12.getType().getHasBorderAndShadow()) {
                                SceneElement sceneElement3 = (SceneElement) objectRef.element;
                                if (r12.getType().getHasStroke() && sceneElement2.getType().getHasStroke()) {
                                    stroke = sceneElement2.getStroke();
                                } else {
                                    stroke = r12.getStroke();
                                }
                                objectRef.element = SceneElement.copy$default(sceneElement3, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, stroke, sceneElement2.getBorders(), sceneElement2.getDropShadow(), false, null, null, false, null, null, 1073741823, 126, null);
                            }
                            Unit unit5 = Unit.INSTANCE;
                            break;
                        case 3:
                            if (r12.getType().getHasBlendingMode()) {
                                T t3 = objectRef.element;
                                objectRef.element = SceneElement.copy$default((SceneElement) t3, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(((SceneElement) t3).getTransform(), null, null, null, null, 0.0f, 0.0f, sceneElement2.getTransform().getOpacity(), null, false, 447, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, sceneElement2.getBlendingMode(), null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -4194369, 127, null);
                            }
                            Unit unit6 = Unit.INSTANCE;
                            break;
                        case 4:
                            if (r12.getType().getHasTransform()) {
                                KeyableTransform transform = ((SceneElement) objectRef.element).getTransform();
                                SceneElement sceneElement4 = (SceneElement) objectRef.element;
                                Keyable<Vector2D> scale = sceneElement2.getTransform().getScale();
                                if (!scale.getKeyed() && z2) {
                                    scale = transform.getScale();
                                }
                                Keyable<Vector2D> keyable = scale;
                                Keyable<Vector3D> location = sceneElement2.getTransform().getLocation();
                                if (!location.getKeyed() && z2) {
                                    location = transform.getLocation();
                                }
                                Keyable<Float> rotation = sceneElement2.getTransform().getRotation();
                                if (!rotation.getKeyed() && z2) {
                                    rotation = transform.getRotation();
                                }
                                Keyable<Float> keyable2 = rotation;
                                Keyable<Vector2D> skew = sceneElement2.getTransform().getSkew();
                                if (!skew.getKeyed() && z2) {
                                    skew = transform.getSkew();
                                }
                                Keyable<Vector2D> keyable3 = skew;
                                Keyable<Vector2D> pivot = sceneElement2.getTransform().getPivot();
                                if (!pivot.getKeyed() && z2) {
                                    pivot = transform.getPivot();
                                }
                                objectRef.element = SceneElement.copy$default(sceneElement4, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(transform, location, pivot, keyable, keyable2, 0.0f, 0.0f, null, keyable3, false, 368, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
                            }
                            Unit unit7 = Unit.INSTANCE;
                            break;
                        case 5:
                            if (r12.getType() == SceneElementType.Text) {
                                T t4 = objectRef.element;
                                objectRef.element = SceneElement.copy$default((SceneElement) t4, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, StyledText.copy$default(((SceneElement) t4).getText(), null, sceneElement2.getText().getFontSize(), sceneElement2.getText().getAlign(), 0, sceneElement2.getText().getFont(), 9, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097153, 127, null);
                            }
                            Unit unit8 = Unit.INSTANCE;
                            break;
                        case 6:
                            if (r12.getType() != SceneElementType.Scene && SceneElementKt.hasAnyAudio(r12)) {
                                objectRef.element = SceneElement.copy$default((SceneElement) objectRef.element, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, sceneElement2.getGain(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1048577, 127, null);
                            }
                            Unit unit9 = Unit.INSTANCE;
                            break;
                        case 7:
                            if (r12.getType().getHasVisualEffects()) {
                                if (!this.f4611n.Uo().contains(K.f70072S)) {
                                    Map<Long, KeyableVisualEffectRef> visualEffects = sceneElement2.getVisualEffects();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Map.Entry<Long, KeyableVisualEffectRef> entry : visualEffects.entrySet()) {
                                        if (!Md.n().contains(entry.getValue().getId())) {
                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    List<Long> visualEffectOrder = sceneElement2.getVisualEffectOrder();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : visualEffectOrder) {
                                        long jLongValue = ((Number) obj).longValue();
                                        if (!linkedHashMap.isEmpty()) {
                                            Iterator it3 = linkedHashMap.entrySet().iterator();
                                            while (true) {
                                                if (!it3.hasNext()) {
                                                    break;
                                                } else if (((KeyableVisualEffectRef) ((Map.Entry) it3.next()).getValue()).getInstanceId() == jLongValue) {
                                                    arrayList.add(obj);
                                                }
                                            }
                                        }
                                    }
                                    tCopy$default = SceneElement.copy$default((SceneElement) objectRef.element, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, linkedHashMap, arrayList, null, null, null, null, null, null, false, null, null, false, null, null, -100663297, 127, null);
                                } else {
                                    tCopy$default = SceneElement.copy$default((SceneElement) objectRef.element, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, sceneElement2.getVisualEffects(), sceneElement2.getVisualEffectOrder(), null, null, null, null, null, null, false, null, null, false, null, null, -100663297, 127, null);
                                }
                                objectRef.element = tCopy$default;
                            }
                            Unit unit10 = Unit.INSTANCE;
                            break;
                        case 8:
                            Unit unit11 = Unit.INSTANCE;
                            z4 = true;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if (z3 && !z4) {
                objectRef.element = p4.ck((SceneElement) objectRef.element, new Function1() { // from class: Je.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Ml.xMQ(r12, (Keyable) obj2);
                    }
                });
            }
            sceneHolder.update((SceneElement) objectRef.element);
        }
    }
}
