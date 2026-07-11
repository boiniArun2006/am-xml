package com.alightcreative.app.motion.activities.survey;

import KQ.eO;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface CN3 {

    public static final class j implements CN3 {
        private final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f45653O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final eO f45654n;
        private final boolean nr;
        private final Map rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f45655t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f45654n, jVar.f45654n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f45655t == jVar.f45655t && this.nr == jVar.nr && this.f45653O == jVar.f45653O && this.J2 == jVar.J2;
        }

        public int hashCode() {
            return (((((((((this.f45654n.hashCode() * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f45655t)) * 31) + Boolean.hashCode(this.nr)) * 31) + Integer.hashCode(this.f45653O)) * 31) + Boolean.hashCode(this.J2);
        }

        public String toString() {
            return "Content(surveyPageUIModel=" + this.f45654n + ", openFieldValues=" + this.rl + ", isBackButtonVisible=" + this.f45655t + ", isSkipButtonVisible=" + this.nr + ", ctaButtonText=" + this.f45653O + ", isCtaButtonEnabled=" + this.J2 + ")";
        }

        public j(eO surveyPageUIModel, Map openFieldValues, boolean z2, boolean z3, int i2, boolean z4) {
            Intrinsics.checkNotNullParameter(surveyPageUIModel, "surveyPageUIModel");
            Intrinsics.checkNotNullParameter(openFieldValues, "openFieldValues");
            this.f45654n = surveyPageUIModel;
            this.rl = openFieldValues;
            this.f45655t = z2;
            this.nr = z3;
            this.f45653O = i2;
            this.J2 = z4;
        }

        public final boolean J2() {
            return this.nr;
        }

        public final boolean O() {
            return this.J2;
        }

        public final int n() {
            return this.f45653O;
        }

        public final boolean nr() {
            return this.f45655t;
        }

        public final Map rl() {
            return this.rl;
        }

        public final eO t() {
            return this.f45654n;
        }
    }

    public static final class n implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f45656n = new n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return 1151741067;
        }

        public String toString() {
            return "Error";
        }

        private n() {
        }
    }
}
