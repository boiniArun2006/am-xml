package a;

import GJW.Lu;
import GJW.OU;
import GJW.vd;
import LM.Wre;
import SJ0.yr;
import Si.o;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.alightcreative.app.motion.scene.ElementTiming;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.TimeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class C1498j extends AbstractC1499n {
    private final MutableState KN;

    public /* synthetic */ C1498j(o oVar, vd vdVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, (i2 & 2) != 0 ? Lu.n(OU.n()) : vdVar);
    }

    private final List WPU(Scene scene, List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ElementTiming elementTimingAbsoluteTimingInScene = SceneElementKt.absoluteTimingInScene((SceneElement) it.next(), scene);
            arrayList.add(TuplesKt.to(Long.valueOf(elementTimingAbsoluteTimingInScene.getStartTime()), Long.valueOf(elementTimingAbsoluteTimingInScene.getEndTime())));
        }
        return arrayList;
    }

    private final int XQ(Scene scene, List list) {
        Integer num;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SceneElementKt.absoluteTimingInScene((SceneElement) it.next(), scene));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Integer numValueOf = Integer.valueOf(((ElementTiming) it2.next()).getStartTime());
            while (it2.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((ElementTiming) it2.next()).getStartTime());
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        return TimeKt.frameNumberFromStartTime(Math.max(0, num != null ? num.intValue() : 0), nr().getFramesPerHundredSeconds());
    }

    private final void g(List list) {
        this.KN.setValue(list);
    }

    public final List S() {
        return (List) this.KN.getValue();
    }

    public final void ViF(SceneElement sceneElement) {
        if (sceneElement == null) {
            return;
        }
        aYN(sceneElement);
        Ik(true);
    }

    public final void aYN(SceneElement sceneElement) {
        if (sceneElement == null) {
            return;
        }
        HI(TimeKt.frameNumberFromStartTime(sceneElement.getStartTime(), nr().getFramesPerHundredSeconds()));
        g(CollectionsKt.listOf(TuplesKt.to(Long.valueOf(sceneElement.getStartTime()), Long.valueOf(sceneElement.getEndTime()))));
    }

    public final void nY(Wre projectHolder, Uri uri) {
        Intrinsics.checkNotNullParameter(projectHolder, "projectHolder");
        Intrinsics.checkNotNullParameter(uri, FijIa.mYyTyNo);
        Scene scene = projectHolder.KN().getScene();
        List listZ = Z(scene, uri);
        List listWPU = WPU(scene, listZ);
        HI(XQ(scene, listZ));
        g(listWPU);
    }

    public void te(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        yr yrVarN = yr.n(view);
        Intrinsics.checkNotNullExpressionValue(yrVarN, "bind(...)");
        yrVarN.f9692t.setDragging(KN());
        yrVarN.f9692t.setProgress(O() / J2());
        yrVarN.f9692t.setCurrentTimeMillis(O());
        yrVarN.rl.n(S(), J2());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1498j(o player, vd scope) {
        super(player, scope);
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.KN = SnapshotStateKt__SnapshotStateKt.O(CollectionsKt.emptyList(), null, 2, null);
    }

    private final List Z(Scene scene, Uri uri) {
        List<SceneElement> recursiveElements = SceneKt.getRecursiveElements(scene);
        ArrayList arrayList = new ArrayList();
        for (Object obj : recursiveElements) {
            SceneElement sceneElement = (SceneElement) obj;
            if (sceneElement.getFillType() == FillType.MEDIA && sceneElement.getEndTime() >= 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            SceneElement sceneElement2 = (SceneElement) obj2;
            Uri fillImage = sceneElement2.getFillImage();
            if (fillImage == null) {
                fillImage = sceneElement2.getFillVideo();
            }
            if (Intrinsics.areEqual(fillImage, uri)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
