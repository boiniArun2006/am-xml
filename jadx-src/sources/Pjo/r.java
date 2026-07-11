package Pjo;

import android.net.Uri;
import com.alightcreative.app.motion.templates.Template;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class r {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f7837O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7838n;
    private final int nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Uri f7839t;

    public /* synthetic */ r(String str, List list, Uri uri, int i2, int i3, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, uri, i2, i3, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Template.Tag.J2(this.f7838n, rVar.f7838n) && Intrinsics.areEqual(this.rl, rVar.rl) && Intrinsics.areEqual(this.f7839t, rVar.f7839t) && this.nr == rVar.nr && this.f7837O == rVar.f7837O && this.J2 == rVar.J2 && this.Uo == rVar.Uo;
    }

    private r(String mainTag, List currentTemplateTags, Uri currentTemplateVideoUri, int i2, int i3, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(mainTag, "mainTag");
        Intrinsics.checkNotNullParameter(currentTemplateTags, "currentTemplateTags");
        Intrinsics.checkNotNullParameter(currentTemplateVideoUri, "currentTemplateVideoUri");
        this.f7838n = mainTag;
        this.rl = currentTemplateTags;
        this.f7839t = currentTemplateVideoUri;
        this.nr = i2;
        this.f7837O = i3;
        this.J2 = z2;
        this.Uo = z3;
    }

    public final boolean J2() {
        return this.Uo;
    }

    public final int O() {
        return this.f7837O;
    }

    public final boolean Uo() {
        return this.J2;
    }

    public int hashCode() {
        return (((((((((((Template.Tag.Uo(this.f7838n) * 31) + this.rl.hashCode()) * 31) + this.f7839t.hashCode()) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f7837O)) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo);
    }

    public final int n() {
        return this.nr;
    }

    public final String nr() {
        return this.f7838n;
    }

    public final List rl() {
        return this.rl;
    }

    public final Uri t() {
        return this.f7839t;
    }

    public String toString() {
        return "StoriesViewState(mainTag=" + Template.Tag.KN(this.f7838n) + ", currentTemplateTags=" + this.rl + ", currentTemplateVideoUri=" + this.f7839t + ", currentTemplateIndex=" + this.nr + ", templatesCount=" + this.f7837O + ", isSaved=" + this.J2 + ", isAddedToFavoritesBannerVisible=" + this.Uo + ")";
    }
}
