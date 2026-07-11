package UO6;

import UO6.vd;
import com.alightcreative.monorepo.settings.ExportFeature;
import com.alightcreative.monorepo.settings.ExportUIMenuItem;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Lu {
    public static final List n(Iterable newFeatures, Map exportInfoPreferences) {
        Intrinsics.checkNotNullParameter(newFeatures, "newFeatures");
        Intrinsics.checkNotNullParameter(exportInfoPreferences, "exportInfoPreferences");
        vd.n nVar = vd.n.f10734t;
        w6 w6Var = (w6) exportInfoPreferences.get(nVar);
        vd vdVar = w6Var != null ? new vd(nVar, 2132020422, 2131231728, ExportUIMenuItem.VIDEO, vd.j.f10723O, false, false, true, w6Var, 96, null) : null;
        vd.n nVar2 = vd.n.f10729Z;
        ExportUIMenuItem exportUIMenuItem = ExportUIMenuItem.TEMPLATE;
        vd.j jVar = vd.j.f10725t;
        ExportFeature exportFeature = ExportFeature.TEMPLATE;
        vd vdVar2 = new vd(nVar2, 2132019041, 2131231727, exportUIMenuItem, jVar, CollectionsKt.contains(newFeatures, exportFeature), false, false, null, 448, null);
        vd vdVar3 = new vd(nVar2, 2132019040, 2131231727, ExportUIMenuItem.PRESET, jVar, CollectionsKt.contains(newFeatures, exportFeature), false, false, null, 448, null);
        vd vdVar4 = new vd(vd.n.f10728S, 2132019976, 2131231726, ExportUIMenuItem.PROJECT_PACKAGE, jVar, false, true, false, null, 416, null);
        vd vdVar5 = new vd(vd.n.f10731g, 2132020390, 2131231721, ExportUIMenuItem.CLOUD_BACKUP, null, false, true, false, null, 416, null);
        vd vdVar6 = new vd(vd.n.f10727O, 2132017639, 2131231722, ExportUIMenuItem.PNG, null, false, false, false, null, 480, null);
        vd.n nVar3 = vd.n.J2;
        w6 w6Var2 = (w6) exportInfoPreferences.get(nVar3);
        vd vdVar7 = w6Var2 != null ? new vd(nVar3, 2132019400, 2131231724, ExportUIMenuItem.IMAGE_SEQUENCE, vd.j.f10723O, false, false, false, w6Var2, 224, null) : null;
        vd.n nVar4 = vd.n.f10733r;
        w6 w6Var3 = (w6) exportInfoPreferences.get(nVar4);
        return CollectionsKt.listOfNotNull((Object[]) new vd[]{vdVar, vdVar2, vdVar3, vdVar4, vdVar5, vdVar6, vdVar7, w6Var3 != null ? new vd(nVar4, 2132019338, 2131231723, ExportUIMenuItem.GIF, vd.j.f10723O, false, false, false, w6Var3, 224, null) : null, new vd(vd.n.f10732o, 2132020451, 2131231729, ExportUIMenuItem.XML, null, false, false, false, null, 480, null)});
    }
}
