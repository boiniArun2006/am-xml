package f0P;

import com.alightcreative.app.motion.scene.Axis2D;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.Vector2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class D9M {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f64127n = new LinkedHashMap();
    private Map rl = new LinkedHashMap();

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f64128n;
        private final Rectangle rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f64128n, jVar.f64128n) == 0 && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public j(float f3, Rectangle bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            this.f64128n = f3;
            this.rl = bounds;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64128n) * 31) + this.rl.hashCode();
        }

        public final Rectangle n() {
            return this.rl;
        }

        public final float rl() {
            return this.f64128n;
        }

        public String toString() {
            return "BoundsAndLength(length=" + this.f64128n + ", bounds=" + this.rl + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class n {
        private static final /* synthetic */ n[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f64131r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f64130n = new n("BOTH", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f64132t = new n("X", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f64129O = new n("Y", 2);

        static {
            n[] nVarArrN = n();
            J2 = nVarArrN;
            f64131r = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f64130n, f64132t, f64129O};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) J2.clone();
        }

        private n(String str, int i2) {
        }
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.f64132t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.f64129O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Axis2D.values().length];
            try {
                iArr2[Axis2D.f45912X.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Axis2D.f45913Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final List n(n targetAxis, Scene scene, SceneElement el, float f3, int i2) {
        Axis2D axis2D;
        LinkedHashMap linkedHashMap;
        Rectangle rectangleN;
        Intrinsics.checkNotNullParameter(targetAxis, "targetAxis");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(el, scene, f3, i2, scene.getFramesPerHundredSeconds());
        if (!GeometryKt.isFinite(rectangleBoundsAtTime) || (rectangleBoundsAtTime.getLeft() >= rectangleBoundsAtTime.getRight() && rectangleBoundsAtTime.getTop() >= rectangleBoundsAtTime.getBottom())) {
            return CollectionsKt.emptyList();
        }
        Vector2D size = rectangleBoundsAtTime.getSize();
        if (!GeometryKt.isFinite(size)) {
            return CollectionsKt.emptyList();
        }
        if (targetAxis == n.f64130n) {
            Vector2D size2 = rectangleBoundsAtTime.getSize();
            Map map = this.f64127n;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (Math.abs(size2.getX() - ((j) entry.getValue()).rl()) < 0.01f) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Map map2 = this.rl;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                if (Math.abs(size2.getY() - ((j) entry2.getValue()).rl()) < 0.01f) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set setIntersect = CollectionsKt.intersect(CollectionsKt.toSet(linkedHashMap2.keySet()), linkedHashMap3.keySet());
            if (!setIntersect.isEmpty()) {
                List listListOf = CollectionsKt.listOf((Object[]) new b1P.n[]{b1P.I28.rl(rectangleBoundsAtTime, b1P.j.f43141n), b1P.I28.rl(rectangleBoundsAtTime, b1P.j.J2)});
                ArrayList arrayList = new ArrayList();
                Iterator it = setIntersect.iterator();
                while (it.hasNext()) {
                    j jVar = (j) linkedHashMap2.get(Long.valueOf(((Number) it.next()).longValue()));
                    CollectionsKt.addAll(arrayList, (jVar == null || (rectangleN = jVar.n()) == null) ? CollectionsKt.emptyList() : CollectionsKt.listOf((Object[]) new b1P.n[]{b1P.I28.rl(rectangleN, b1P.j.f43141n), b1P.I28.rl(rectangleN, b1P.j.J2)}));
                }
                return CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
            }
            if (!linkedHashMap2.isEmpty()) {
                List listListOf2 = CollectionsKt.listOf(b1P.I28.rl(rectangleBoundsAtTime, b1P.j.J2));
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(b1P.I28.rl(((j) ((Map.Entry) it2.next()).getValue()).n(), b1P.j.J2));
                }
                return CollectionsKt.plus((Collection) listListOf2, (Iterable) arrayList2);
            }
            if (linkedHashMap3.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            List listListOf3 = CollectionsKt.listOf(b1P.I28.rl(rectangleBoundsAtTime, b1P.j.f43141n));
            ArrayList arrayList3 = new ArrayList(linkedHashMap3.size());
            Iterator it3 = linkedHashMap3.entrySet().iterator();
            while (it3.hasNext()) {
                arrayList3.add(b1P.I28.rl(((j) ((Map.Entry) it3.next()).getValue()).n(), b1P.j.f43141n));
            }
            return CollectionsKt.plus((Collection) listListOf3, (Iterable) arrayList3);
        }
        int i3 = w6.$EnumSwitchMapping$0[targetAxis.ordinal()];
        if (i3 == 1) {
            axis2D = Axis2D.f45912X;
        } else {
            if (i3 != 2) {
                return CollectionsKt.emptyList();
            }
            axis2D = Axis2D.f45913Y;
        }
        int i5 = w6.$EnumSwitchMapping$1[axis2D.ordinal()];
        if (i5 == 1) {
            Map map3 = this.f64127n;
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry3 : map3.entrySet()) {
                if (size.getX() == ((j) entry3.getValue()).rl()) {
                    linkedHashMap.put(entry3.getKey(), entry3.getValue());
                }
            }
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Map map4 = this.rl;
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry4 : map4.entrySet()) {
                if (size.getY() == ((j) entry4.getValue()).rl()) {
                    linkedHashMap.put(entry4.getKey(), entry4.getValue());
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (axis2D == Axis2D.f45912X) {
            List listListOf4 = CollectionsKt.listOf(b1P.I28.rl(rectangleBoundsAtTime, b1P.j.f43141n));
            ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
            Iterator it4 = linkedHashMap.entrySet().iterator();
            while (it4.hasNext()) {
                ((j) ((Map.Entry) it4.next()).getValue()).n();
                arrayList4.add(b1P.I28.rl(rectangleBoundsAtTime, b1P.j.f43141n));
            }
            return CollectionsKt.plus((Collection) listListOf4, (Iterable) arrayList4);
        }
        List listListOf5 = CollectionsKt.listOf(b1P.I28.rl(rectangleBoundsAtTime, b1P.j.J2));
        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
        Iterator it5 = linkedHashMap.entrySet().iterator();
        while (it5.hasNext()) {
            ((j) ((Map.Entry) it5.next()).getValue()).n();
            arrayList5.add(b1P.I28.rl(rectangleBoundsAtTime, b1P.j.J2));
        }
        return CollectionsKt.plus((Collection) listListOf5, (Iterable) arrayList5);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rl(n targetAxis, Scene scene, SceneElement targetEl, int i2, int i3) {
        Axis2D axis2D;
        float f3;
        Intrinsics.checkNotNullParameter(targetAxis, "targetAxis");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(targetEl, "targetEl");
        long id = targetEl.getId();
        int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        float f4 = 0.0f;
        if (targetAxis == n.f64130n) {
            for (SceneElement sceneElement : scene.getElements()) {
                Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(sceneElement, scene, SceneElementKt.fractionalTime(sceneElement, i2), i3, framesPerHundredSeconds);
                if (!sceneElement.getType().isRenderable() || sceneElement.getId() == id || i2 < sceneElement.getStartTime() || i2 > sceneElement.getEndTime() || !rectangleBoundsAtTime.isNotEmpty()) {
                    f3 = f4;
                } else {
                    Vector2D size = rectangleBoundsAtTime.getSize();
                    if (GeometryKt.isFinite(size)) {
                        Pair pair = rectangleBoundsAtTime.getWidth() > rectangleBoundsAtTime.getHeight() ? new Pair(Float.valueOf(size.getX()), Float.valueOf((size.getY() * rectangleBoundsAtTime.getWidth()) / rectangleBoundsAtTime.getHeight())) : new Pair(Float.valueOf((size.getX() * rectangleBoundsAtTime.getHeight()) / rectangleBoundsAtTime.getWidth()), Float.valueOf(size.getY()));
                        float fFloatValue = ((Number) pair.component1()).floatValue();
                        float fFloatValue2 = ((Number) pair.component2()).floatValue();
                        int i5 = (int) fFloatValue2;
                        if (((int) fFloatValue) > f4) {
                            f3 = f4;
                            this.f64127n.put(Long.valueOf(sceneElement.getId()), new j(fFloatValue, rectangleBoundsAtTime));
                        } else {
                            f3 = f4;
                        }
                        if (i5 > f3) {
                            this.rl.put(Long.valueOf(sceneElement.getId()), new j(fFloatValue2, rectangleBoundsAtTime));
                        }
                    }
                }
                f4 = f3;
            }
            return;
        }
        int i7 = w6.$EnumSwitchMapping$0[targetAxis.ordinal()];
        if (i7 == 1) {
            axis2D = Axis2D.f45912X;
        } else if (i7 != 2) {
            return;
        } else {
            axis2D = Axis2D.f45913Y;
        }
        for (SceneElement sceneElement2 : scene.getElements()) {
            if (sceneElement2.getType().isRenderable() && sceneElement2.getId() != id && i2 >= sceneElement2.getStartTime() && i2 <= sceneElement2.getEndTime()) {
                Rectangle rectangleBoundsAtTime2 = SceneElementKt.boundsAtTime(sceneElement2, scene, SceneElementKt.fractionalTime(sceneElement2, i2), i3, framesPerHundredSeconds);
                Vector2D size2 = rectangleBoundsAtTime2.getSize();
                int i8 = w6.$EnumSwitchMapping$1[axis2D.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (size2.getY() > 0.0f) {
                        this.rl.put(Long.valueOf(sceneElement2.getId()), new j(size2.getY(), rectangleBoundsAtTime2));
                    }
                } else if (size2.getX() > 0.0f) {
                    this.f64127n.put(Long.valueOf(sceneElement2.getId()), new j(size2.getX(), rectangleBoundsAtTime2));
                }
            }
        }
    }

    public final void t() {
        this.f64127n = new LinkedHashMap();
        this.rl = new LinkedHashMap();
    }
}
