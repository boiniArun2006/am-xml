package QmE;

import QmE.j;
import com.alightcreative.app.motion.templates.Template;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Q implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8355n;

    public /* synthetic */ Q(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Q) && Template.Tag.J2(this.f8355n, ((Q) obj).f8355n);
    }

    private Q(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f8355n = tag;
    }

    public int hashCode() {
        return Template.Tag.Uo(this.f8355n);
    }

    public final String n() {
        return this.f8355n;
    }

    public String toString() {
        return "TemplateCircleTapped(tag=" + Template.Tag.KN(this.f8355n) + ")";
    }
}
