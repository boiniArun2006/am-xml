package Pjo;

import android.net.Uri;
import com.alightcreative.app.motion.templates.Template;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C {
    private final Template J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f7752O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7753n;
    private final Set nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f7754t;

    public /* synthetic */ C(String str, List list, int i2, Set set, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i2, set, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return Template.Tag.J2(this.f7753n, c2.f7753n) && Intrinsics.areEqual(this.rl, c2.rl) && this.f7754t == c2.f7754t && Intrinsics.areEqual(this.nr, c2.nr) && this.f7752O == c2.f7752O;
    }

    private C(String tag, List templates, int i2, Set savedTemplateIds, boolean z2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(savedTemplateIds, "savedTemplateIds");
        this.f7753n = tag;
        this.rl = templates;
        this.f7754t = i2;
        this.nr = savedTemplateIds;
        this.f7752O = z2;
        this.J2 = (Template) CollectionsKt.getOrNull(templates, i2);
    }

    public static /* synthetic */ C rl(C c2, String str, List list, int i2, Set set, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = c2.f7753n;
        }
        if ((i3 & 2) != 0) {
            list = c2.rl;
        }
        if ((i3 & 4) != 0) {
            i2 = c2.f7754t;
        }
        if ((i3 & 8) != 0) {
            set = c2.nr;
        }
        if ((i3 & 16) != 0) {
            z2 = c2.f7752O;
        }
        boolean z3 = z2;
        int i5 = i2;
        return c2.n(str, list, i5, set, z3);
    }

    public final r J2() {
        Uri uri;
        List<Template.Tag> listEmptyList;
        String videoUrl;
        String str = this.f7753n;
        int i2 = this.f7754t;
        Template template = this.J2;
        if (template == null || (videoUrl = template.getVideoUrl()) == null || (uri = Uri.parse(videoUrl)) == null) {
            uri = Uri.EMPTY;
        }
        Uri uri2 = uri;
        Intrinsics.checkNotNull(uri2);
        Template template2 = this.J2;
        if (template2 == null || (listEmptyList = template2.getTags()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<Template.Tag> list = listEmptyList;
        Set set = this.nr;
        Template template3 = this.J2;
        return new r(str, list, uri2, i2, this.rl.size(), CollectionsKt.contains(set, template3 != null ? template3.getTemplateId() : null), this.f7752O, null);
    }

    public final List O() {
        return this.rl;
    }

    public int hashCode() {
        return (((((((Template.Tag.Uo(this.f7753n) * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f7754t)) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f7752O);
    }

    public final C n(String tag, List templates, int i2, Set savedTemplateIds, boolean z2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(savedTemplateIds, "savedTemplateIds");
        return new C(tag, templates, i2, savedTemplateIds, z2, null);
    }

    public final int nr() {
        return this.f7754t;
    }

    public final Template t() {
        return this.J2;
    }

    public String toString() {
        return "StoriesVMState(tag=" + Template.Tag.KN(this.f7753n) + ", templates=" + this.rl + ", currentTemplateIndex=" + this.f7754t + ", savedTemplateIds=" + this.nr + ", isAddedToFavoritesBannerVisible=" + this.f7752O + ")";
    }
}
