package QmE;

import QmE.j;
import com.alightcreative.app.motion.templates.Template;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ln implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8348n;

    public /* synthetic */ Ln(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ln) && Template.Tag.J2(this.f8348n, ((Ln) obj).f8348n);
    }

    private Ln(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f8348n = tag;
    }

    public int hashCode() {
        return Template.Tag.Uo(this.f8348n);
    }

    public final String n() {
        return this.f8348n;
    }

    public String toString() {
        return "TemplateCircleTapped(tag=" + Template.Tag.KN(this.f8348n) + ")";
    }
}
