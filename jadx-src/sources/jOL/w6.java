package jOL;

import jOL.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface w6 {

    public static final class j implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f69434n;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Function0 f69435t;

        public j(int i2, boolean z2, Function0 onClick) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f69434n = i2;
            this.rl = z2;
            this.f69435t = onClick;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f69434n == jVar.f69434n && this.rl == jVar.rl && Intrinsics.areEqual(this.f69435t, jVar.f69435t);
        }

        public static /* synthetic */ j nr(j jVar, int i2, boolean z2, Function0 function0, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = jVar.f69434n;
            }
            if ((i3 & 2) != 0) {
                z2 = jVar.rl;
            }
            if ((i3 & 4) != 0) {
                function0 = jVar.f69435t;
            }
            return jVar.t(i2, z2, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit rl() {
            return Unit.INSTANCE;
        }

        public Function0 J2() {
            return this.f69435t;
        }

        public boolean O() {
            return this.rl;
        }

        public final int Uo() {
            return this.f69434n;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f69434n) * 31) + Boolean.hashCode(this.rl)) * 31) + this.f69435t.hashCode();
        }

        public final j t(int i2, boolean z2, Function0 onClick) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new j(i2, z2, onClick);
        }

        public String toString() {
            return "Image(resource=" + this.f69434n + ", enabled=" + this.rl + ", onClick=" + this.f69435t + ")";
        }

        public /* synthetic */ j(int i2, boolean z2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, (i3 & 2) != 0 ? true : z2, (i3 & 4) != 0 ? new Function0() { // from class: jOL.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.j.rl();
                }
            } : function0);
        }
    }

    public static final class n implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f69436n;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Function0 f69437t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f69436n, nVar.f69436n) && this.rl == nVar.rl && Intrinsics.areEqual(this.f69437t, nVar.f69437t);
        }

        public n(String text, boolean z2, Function0 onClick) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f69436n = text;
            this.rl = z2;
            this.f69437t = onClick;
        }

        public static /* synthetic */ n rl(n nVar, String str, boolean z2, Function0 function0, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = nVar.f69436n;
            }
            if ((i2 & 2) != 0) {
                z2 = nVar.rl;
            }
            if ((i2 & 4) != 0) {
                function0 = nVar.f69437t;
            }
            return nVar.n(str, z2, function0);
        }

        public final String O() {
            return this.f69436n;
        }

        public int hashCode() {
            return (((this.f69436n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + this.f69437t.hashCode();
        }

        public final n n(String text, boolean z2, Function0 onClick) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new n(text, z2, onClick);
        }

        public Function0 nr() {
            return this.f69437t;
        }

        public boolean t() {
            return this.rl;
        }

        public String toString() {
            return "Text(text=" + this.f69436n + ", enabled=" + this.rl + ", onClick=" + this.f69437t + ")";
        }
    }
}
