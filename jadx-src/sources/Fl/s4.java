package Fl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class s4 {

    public static final class j extends s4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final eO f3116n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f3116n, ((j) obj).f3116n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(eO type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.f3116n = type;
        }

        public int hashCode() {
            return this.f3116n.hashCode();
        }

        public final eO n() {
            return this.f3116n;
        }

        public String toString() {
            return "ShowPPTOS(type=" + this.f3116n + ")";
        }
    }

    public /* synthetic */ s4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private s4() {
    }
}
