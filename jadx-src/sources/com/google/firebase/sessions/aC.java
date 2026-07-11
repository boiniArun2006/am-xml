package com.google.firebase.sessions;

import KfI.iwV;
import KfI.r;
import KfI.rv6;
import cS.Zv.SzFNXybiSxdx;
import com.google.firebase.o;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class aC {
    public static final j J2 = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private r f60804O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iwV f60805n;
    private int nr;
    private final rv6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60806t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final aC n() {
            return ((n) o.n(com.google.firebase.w6.f60907n).mUb(n.class)).n();
        }
    }

    public aC(iwV timeProvider, rv6 uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f60805n = timeProvider;
        this.rl = uuidGenerator;
        this.f60806t = rl();
        this.nr = -1;
    }

    private final String rl() {
        String string = this.rl.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "uuidGenerator.next().toString()");
        String lowerCase = StringsKt.replace$default(string, SzFNXybiSxdx.PdYhTZFlebqZxH, "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final r n() {
        int i2 = this.nr + 1;
        this.nr = i2;
        this.f60804O = new r(i2 == 0 ? this.f60806t : rl(), this.f60806t, this.nr, this.f60805n.n());
        return t();
    }

    public final r t() {
        r rVar = this.f60804O;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currentSession");
        return null;
    }
}
