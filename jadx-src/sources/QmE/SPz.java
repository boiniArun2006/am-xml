package QmE;

import QmE.j;
import com.alightcreative.app.motion.templates.Template;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class SPz implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8357n;
    private final boolean rl;

    public /* synthetic */ SPz(String str, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SPz)) {
            return false;
        }
        SPz sPz = (SPz) obj;
        return Template.Tag.J2(this.f8357n, sPz.f8357n) && this.rl == sPz.rl;
    }

    private SPz(String tag, boolean z2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f8357n = tag;
        this.rl = z2;
    }

    public int hashCode() {
        return (Template.Tag.Uo(this.f8357n) * 31) + Boolean.hashCode(this.rl);
    }

    public final String n() {
        return this.f8357n;
    }

    public final boolean rl() {
        return this.rl;
    }

    public String toString() {
        return "TemplateFilterTapped(tag=" + Template.Tag.KN(this.f8357n) + ", isEnabled=" + this.rl + ")";
    }
}
