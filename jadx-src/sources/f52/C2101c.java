package f52;

import HI0.rv6;
import PB.Wre;
import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import com.alightcreative.app.motion.templates.Template;
import com.alightcreative.app.motion.templates.w6;
import f52.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: renamed from: f52.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C2101c {
    private final boolean J2;
    private final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f66502O;
    private final List Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x0X.n f66503n;
    private final TemplateFiltersItem.Content nr;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f66504t;
    private final List xMQ;

    public C2101c(x0X.n nVar, Set set, Set set2, TemplateFiltersItem.Content selectedFilter, boolean z2, boolean z3) {
        List listN;
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        this.f66503n = nVar;
        this.rl = set;
        this.f66504t = set2;
        this.nr = selectedFilter;
        this.f66502O = z2;
        this.J2 = z3;
        List list3 = null;
        List listFlatten = (nVar == null || (list2 = (List) x0X.w6.nr(nVar)) == null) ? null : CollectionsKt.flatten(list2);
        this.Uo = listFlatten;
        if (listFlatten != null) {
            listN = com.alightcreative.app.motion.activities.main.maintabs.templates.models.j.n(listFlatten, selectedFilter, set2 == null ? SetsKt.emptySet() : set2);
        } else {
            listN = null;
        }
        this.KN = listN;
        if (nVar != null && (list = (List) x0X.w6.nr(nVar)) != null) {
            list3 = (List) CollectionsKt.first(list);
        }
        this.xMQ = list3;
    }

    public final r KN() {
        x0X.n nVar = this.f66503n;
        if (nVar == null) {
            return new r.w6(this.J2);
        }
        if (x0X.w6.O(nVar)) {
            return new r.n(this.J2);
        }
        List list = this.KN;
        if (list == null || this.xMQ == null || this.rl == null || this.f66504t == null) {
            return new r.w6(this.J2);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Bj.n.n((Template) it.next(), this.f66504t));
        }
        List listN = rv6.n(com.alightcreative.app.motion.templates.Ml.Ik(this.xMQ, new w6.n(this.rl, 3), Template.Tag.w6.f46389t), 0, Template.Tag.rl(Template.Tag.INSTANCE.n()));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
        Iterator it2 = listN.iterator();
        while (it2.hasNext()) {
            String value = ((Template.Tag) it2.next()).getValue();
            String strS = com.alightcreative.app.motion.templates.Ml.S(this.xMQ, value);
            if (strS == null) {
                strS = "";
            }
            arrayList2.add(new Wre.j(value, strS, !com.alightcreative.app.motion.templates.Ml.HI(this.xMQ, this.rl, value), null));
        }
        List listListOf = CollectionsKt.listOf((Object[]) new TemplateFiltersItem.Content[]{TemplateFiltersItem.Content.Saved.f45448O, TemplateFiltersItem.Content.AllTemplates.f45446O});
        List listIk = com.alightcreative.app.motion.templates.Ml.Ik(CollectionsKt.flatten((Iterable) ((n.w6) this.f66503n).n()), w6.j.f46418n, Template.Tag.w6.f46388n);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIk, 10));
        Iterator it3 = listIk.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new TemplateFiltersItem.Content.Tag(((Template.Tag) it3.next()).getValue(), null));
        }
        return new r.j(arrayList, arrayList2, CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList3), this.nr, this.f66502O, this.J2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2101c)) {
            return false;
        }
        C2101c c2101c = (C2101c) obj;
        return Intrinsics.areEqual(this.f66503n, c2101c.f66503n) && Intrinsics.areEqual(this.rl, c2101c.rl) && Intrinsics.areEqual(this.f66504t, c2101c.f66504t) && Intrinsics.areEqual(this.nr, c2101c.nr) && this.f66502O == c2101c.f66502O && this.J2 == c2101c.J2;
    }

    public static /* synthetic */ C2101c rl(C2101c c2101c, x0X.n nVar, Set set, Set set2, TemplateFiltersItem.Content content, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nVar = c2101c.f66503n;
        }
        if ((i2 & 2) != 0) {
            set = c2101c.rl;
        }
        if ((i2 & 4) != 0) {
            set2 = c2101c.f66504t;
        }
        if ((i2 & 8) != 0) {
            content = c2101c.nr;
        }
        if ((i2 & 16) != 0) {
            z2 = c2101c.f66502O;
        }
        if ((i2 & 32) != 0) {
            z3 = c2101c.J2;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return c2101c.n(nVar, set, set2, content, z4, z5);
    }

    public final boolean J2() {
        return this.f66502O;
    }

    public final x0X.n O() {
        return this.f66503n;
    }

    public final boolean Uo() {
        return this.J2;
    }

    public int hashCode() {
        x0X.n nVar = this.f66503n;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        Set set = this.rl;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f66504t;
        return ((((((iHashCode2 + (set2 != null ? set2.hashCode() : 0)) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f66502O)) * 31) + Boolean.hashCode(this.J2);
    }

    public final C2101c n(x0X.n nVar, Set set, Set set2, TemplateFiltersItem.Content selectedFilter, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        return new C2101c(nVar, set, set2, selectedFilter, z2, z3);
    }

    public final TemplateFiltersItem.Content nr() {
        return this.nr;
    }

    public final List t() {
        return this.Uo;
    }

    public String toString() {
        return "TemplatesViewModelState(templates=" + this.f66503n + ", seenTemplateIds=" + this.rl + ", savedTemplateIds=" + this.f66504t + ", selectedFilter=" + this.nr + ", isLoadingMoreTemplates=" + this.f66502O + ", isRefreshing=" + this.J2 + ")";
    }

    public /* synthetic */ C2101c(x0X.n nVar, Set set, Set set2, TemplateFiltersItem.Content content, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : nVar, (i2 & 2) != 0 ? null : set, (i2 & 4) != 0 ? null : set2, (i2 & 8) != 0 ? TemplateFiltersItem.Content.AllTemplates.f45446O : content, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3);
    }
}
