package QmE;

import QmE.j;
import com.alightcreative.app.motion.templates.Template;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class K implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f8346n;

    public static abstract class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8347n;

        /* JADX INFO: renamed from: QmE.K$j$j, reason: collision with other inner class name */
        public static final class C0291j extends j {
            public static final C0291j rl = new C0291j();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0291j);
            }

            private C0291j() {
                super("reels", null);
            }

            public String toString() {
                return "Reels";
            }

            public int hashCode() {
                return 925163503;
            }
        }

        public static final class n extends j {
            private final String rl;

            public /* synthetic */ n(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && Template.Tag.J2(this.rl, ((n) obj).rl);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private n(String tag) {
                super("stories", null);
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.rl = tag;
            }

            public int hashCode() {
                return Template.Tag.Uo(this.rl);
            }

            public final String rl() {
                return this.rl;
            }

            public String toString() {
                return "Stories(tag=" + Template.Tag.KN(this.rl) + ")";
            }
        }

        public /* synthetic */ j(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private j(String str) {
            this.f8347n = str;
        }

        public final String n() {
            return this.f8347n;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && Intrinsics.areEqual(this.f8346n, ((K) obj).f8346n);
    }

    public K(j style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f8346n = style;
    }

    public int hashCode() {
        return this.f8346n.hashCode();
    }

    public final j n() {
        return this.f8346n;
    }

    public String toString() {
        return "Shown(style=" + this.f8346n + ")";
    }
}
