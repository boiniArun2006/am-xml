package U;

import KA9.iF;
import KA9.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml implements w6 {
    @Override // U.w6
    public void n(u newProjectListSortOrder) {
        Intrinsics.checkNotNullParameter(newProjectListSortOrder, "newProjectListSortOrder");
        com.alightcreative.app.motion.persist.j.INSTANCE.setProjectSortOrder(iF.J2(newProjectListSortOrder));
    }
}
