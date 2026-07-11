package D3C;

import D3C.Q;
import HI0.rv6;
import PB.Wre;
import com.alightcreative.app.motion.templates.Template;
import com.alightcreative.app.motion.templates.w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x0X.n f1277n;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f1278t;

    public l3D(x0X.n nVar, Set set, boolean z2) {
        this.f1277n = nVar;
        this.rl = set;
        this.f1278t = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3D)) {
            return false;
        }
        l3D l3d = (l3D) obj;
        return Intrinsics.areEqual(this.f1277n, l3d.f1277n) && Intrinsics.areEqual(this.rl, l3d.rl) && this.f1278t == l3d.f1278t;
    }

    public static /* synthetic */ l3D rl(l3D l3d, x0X.n nVar, Set set, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nVar = l3d.f1277n;
        }
        if ((i2 & 2) != 0) {
            set = l3d.rl;
        }
        if ((i2 & 4) != 0) {
            z2 = l3d.f1278t;
        }
        return l3d.n(nVar, set, z2);
    }

    public final Q O() {
        x0X.n nVar = this.f1277n;
        if (nVar == null || this.rl == null) {
            return new Q.w6(this.f1278t);
        }
        if (x0X.w6.O(nVar)) {
            return new Q.n(this.f1278t);
        }
        List listN = rv6.n(com.alightcreative.app.motion.templates.Ml.Ik((List) ((n.w6) this.f1277n).n(), new w6.n(this.rl, 3), Template.Tag.w6.f46389t), 0, Template.Tag.rl(Template.Tag.INSTANCE.n()));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            String value = ((Template.Tag) it.next()).getValue();
            String strS = com.alightcreative.app.motion.templates.Ml.S((List) ((n.w6) this.f1277n).n(), value);
            if (strS == null) {
                strS = "";
            }
            arrayList.add(new Wre.j(value, strS, !com.alightcreative.app.motion.templates.Ml.HI((List) ((n.w6) this.f1277n).n(), this.rl, value), null));
        }
        return new Q.j(arrayList, this.f1278t);
    }

    public int hashCode() {
        x0X.n nVar = this.f1277n;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        Set set = this.rl;
        return ((iHashCode + (set != null ? set.hashCode() : 0)) * 31) + Boolean.hashCode(this.f1278t);
    }

    public final l3D n(x0X.n nVar, Set set, boolean z2) {
        return new l3D(nVar, set, z2);
    }

    public final boolean nr() {
        return this.f1278t;
    }

    public final x0X.n t() {
        return this.f1277n;
    }

    public String toString() {
        return "HomeViewModelState(templates=" + this.f1277n + ", seenTemplateIds=" + this.rl + ", isRefreshing=" + this.f1278t + ")";
    }

    public /* synthetic */ l3D(x0X.n nVar, Set set, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : nVar, (i2 & 2) != 0 ? null : set, (i2 & 4) != 0 ? false : z2);
    }
}
