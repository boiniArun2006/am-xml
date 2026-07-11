package f0P;

import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: f0P.kW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC2049kW {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static List f65735n = null;
    private static String rl = "";

    public static final String J2(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return "<VisualEffectState visualEffects(size=" + sceneElement.getVisualEffects().size() + ", items=[" + CollectionsKt.joinToString$default(sceneElement.getVisualEffects().entrySet(), ", ", null, null, 0, null, new Function1() { // from class: f0P.yE
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC2049kW.Uo((Map.Entry) obj);
            }
        }, 30, null) + "]) visualEffectOrder(size=" + sceneElement.getVisualEffectOrder().size() + ", items=[" + CollectionsKt.joinToString$default(sceneElement.getVisualEffectOrder(), ", ", null, null, 0, null, new Function1() { // from class: f0P.cI
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC2049kW.KN(((Long) obj).longValue());
            }
        }, 30, null) + "])>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence Uo(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        long jLongValue = ((Number) entry.getKey()).longValue();
        KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) entry.getValue();
        return jLongValue + ":" + keyableVisualEffectRef.getInstanceId() + "/" + StringsKt.substringAfterLast$default(keyableVisualEffectRef.getId(), '.', (String) null, 2, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.List] */
    private static final void gh(Ref.ObjectRef objectRef, String str) {
        List listEmptyList = (List) objectRef.element;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        objectRef.element = CollectionsKt.plus((Collection<? extends String>) listEmptyList, str);
    }

    public static /* synthetic */ void mUb(SceneElement sceneElement, String str, Integer num, Long l2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        xMQ(sceneElement, str, num, l2);
    }

    public static final void xMQ(final SceneElement sceneElement, final String tag, Integer num, Long l2) {
        final String str;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (num != null && l2 != null) {
            str = "(pos=" + num + ",iid=" + l2 + ")";
        } else if (num != null) {
            str = "(pos=" + num + ")";
        } else if (l2 != null) {
            str = "(iid=" + l2 + ")";
        } else {
            str = "";
        }
        if (sceneElement.getVisualEffectOrder().size() != sceneElement.getVisualEffects().size()) {
            gh(objectRef, "visualEffectOrder != visualEffects.size");
        } else {
            Set<Map.Entry<Long, KeyableVisualEffectRef>> setEntrySet = sceneElement.getVisualEffects().entrySet();
            if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
                Iterator<T> it = setEntrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Number) entry.getKey()).longValue() != ((KeyableVisualEffectRef) entry.getValue()).getInstanceId()) {
                        gh(objectRef, "mismatched entry and instanceId");
                        break;
                    }
                }
            }
            List<Long> visualEffectOrder = sceneElement.getVisualEffectOrder();
            if (visualEffectOrder == null || !visualEffectOrder.isEmpty()) {
                Iterator<T> it2 = visualEffectOrder.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!sceneElement.getVisualEffects().containsKey(Long.valueOf(((Number) it2.next()).longValue()))) {
                        gh(objectRef, "visualEffectsOrder has non-existing effect iid");
                        break;
                    }
                }
            }
        }
        XoT.C.Uo(sceneElement, new Function0() { // from class: f0P.SA
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC2049kW.qie(tag, str, sceneElement);
            }
        });
        List list = (List) objectRef.element;
        if (list != null && !list.isEmpty()) {
            throw new IllegalStateException("Visual Effects Inconsistency: " + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, null, 62, null) + "; tag=" + tag + "; state=" + J2(sceneElement));
        }
        String str2 = "validateEffects:" + tag + str + " " + J2(sceneElement);
        if (Intrinsics.areEqual(rl, str2) && Intrinsics.areEqual(tag, "refresh")) {
            return;
        }
        rl = str2;
        XoT.C.nr(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence KN(long j2) {
        return String.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qie(String str, String str2, SceneElement sceneElement) {
        return "validateEffects:" + str + str2 + " " + J2(sceneElement);
    }
}
