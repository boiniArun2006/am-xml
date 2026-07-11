package GW;

import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import com.alightcreative.app.motion.templates.Template;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class s4 {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f3686O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f3687n;
    private final boolean nr;
    private final TemplateFiltersItem.Content rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f3688t;

    public s4(List list, TemplateFiltersItem.Content filter, Set set, boolean z2, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f3687n = list;
        this.rl = filter;
        this.f3688t = set;
        this.nr = z2;
        this.f3686O = z3;
        this.J2 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return Intrinsics.areEqual(this.f3687n, s4Var.f3687n) && Intrinsics.areEqual(this.rl, s4Var.rl) && Intrinsics.areEqual(this.f3688t, s4Var.f3688t) && this.nr == s4Var.nr && this.f3686O == s4Var.f3686O && Intrinsics.areEqual(this.J2, s4Var.J2);
    }

    public static /* synthetic */ s4 rl(s4 s4Var, List list, TemplateFiltersItem.Content content, Set set, boolean z2, boolean z3, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = s4Var.f3687n;
        }
        if ((i2 & 2) != 0) {
            content = s4Var.rl;
        }
        if ((i2 & 4) != 0) {
            set = s4Var.f3688t;
        }
        if ((i2 & 8) != 0) {
            z2 = s4Var.nr;
        }
        if ((i2 & 16) != 0) {
            z3 = s4Var.f3686O;
        }
        if ((i2 & 32) != 0) {
            str = s4Var.J2;
        }
        boolean z4 = z3;
        String str2 = str;
        return s4Var.n(list, content, set, z2, z4, str2);
    }

    public int hashCode() {
        List list = this.f3687n;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.rl.hashCode()) * 31;
        Set set = this.f3688t;
        int iHashCode2 = (((((iHashCode + (set == null ? 0 : set.hashCode())) * 31) + Boolean.hashCode(this.nr)) * 31) + Boolean.hashCode(this.f3686O)) * 31;
        String str = this.J2;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final s4 n(List list, TemplateFiltersItem.Content filter, Set set, boolean z2, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new s4(list, filter, set, z2, z3, str);
    }

    public final nKK nr() {
        List list;
        List listN;
        Set set = this.f3688t;
        ArrayList arrayList = null;
        if (set != null && (list = this.f3687n) != null && (listN = com.alightcreative.app.motion.activities.main.maintabs.templates.models.j.n(list, this.rl, set)) != null) {
            arrayList = new ArrayList();
            for (Object obj : listN) {
                if (((Template) obj).getVideoUrl().length() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        Set set2 = this.f3688t;
        return new nKK(arrayList, set2 != null ? CollectionsKt.contains(set2, this.J2) : false, this.nr, this.f3686O);
    }

    public final boolean t() {
        return this.f3686O;
    }

    public String toString() {
        return "ReelsVMState(templates=" + this.f3687n + ", filter=" + this.rl + wDgKoYAES.gTPGJUH + this.f3688t + ", isAddedToFavoritesBannerVisible=" + this.nr + ", shouldShowSwipeHint=" + this.f3686O + ", currentTemplateId=" + this.J2 + ")";
    }

    public /* synthetic */ s4(List list, TemplateFiltersItem.Content content, Set set, boolean z2, boolean z3, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? TemplateFiltersItem.Content.AllTemplates.f45446O : content, (i2 & 4) != 0 ? null : set, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? null : str);
    }
}
