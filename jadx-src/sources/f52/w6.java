package f52;

import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import com.alightcreative.app.motion.templates.Template;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface w6 {

    public static final class j implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f66565n;
        private final TemplateFiltersItem.Content rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f66566t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f66565n, jVar.f66565n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f66566t == jVar.f66566t;
        }

        public j(String selectedTemplateId, TemplateFiltersItem.Content selectedFilter, int i2) {
            Intrinsics.checkNotNullParameter(selectedTemplateId, "selectedTemplateId");
            Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
            this.f66565n = selectedTemplateId;
            this.rl = selectedFilter;
            this.f66566t = i2;
        }

        public int hashCode() {
            return (((this.f66565n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f66566t);
        }

        public final int n() {
            return this.f66566t;
        }

        public final TemplateFiltersItem.Content rl() {
            return this.rl;
        }

        public final String t() {
            return this.f66565n;
        }

        public String toString() {
            return "NavigateToReelView(selectedTemplateId=" + this.f66565n + ", selectedFilter=" + this.rl + ", pagesLoaded=" + this.f66566t + ")";
        }
    }

    public static final class n implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f66567n;

        public /* synthetic */ n(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Template.Tag.J2(this.f66567n, ((n) obj).f66567n);
        }

        private n(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f66567n = tag;
        }

        public int hashCode() {
            return Template.Tag.Uo(this.f66567n);
        }

        public final String n() {
            return this.f66567n;
        }

        public String toString() {
            return "NavigateToStoryView(tag=" + Template.Tag.KN(this.f66567n) + ")";
        }
    }

    /* JADX INFO: renamed from: f52.w6$w6, reason: collision with other inner class name */
    public static final class C0916w6 implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0916w6 f66568n = new C0916w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0916w6);
        }

        public String toString() {
            return "NavigateToYourTemplates";
        }

        private C0916w6() {
        }

        public int hashCode() {
            return -934873551;
        }
    }
}
