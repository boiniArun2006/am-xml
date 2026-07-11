package dX;

import Hh.C;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: dX.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C1954n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f63522n;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f63521t = new j(null);
    private static final Lazy nr = LazyKt.lazy(new Function0() { // from class: dX.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C1954n.nr();
        }
    });

    /* JADX INFO: renamed from: dX.n$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1954n t(int i2) {
            C.rl(Boolean.valueOf(i2 > 0));
            return new C1954n(0, i2);
        }

        private j() {
        }

        public final C1954n rl(int i2) {
            C.rl(Boolean.valueOf(i2 >= 0));
            return new C1954n(i2, Integer.MAX_VALUE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String nr(int i2) {
            if (i2 == Integer.MAX_VALUE) {
                return "";
            }
            return String.valueOf(i2);
        }
    }

    public static final C1954n O(int i2) {
        return f63521t.t(i2);
    }

    public static final C1954n t(int i2) {
        return f63521t.rl(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1954n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        C1954n c1954n = (C1954n) obj;
        return this.f63522n == c1954n.f63522n && this.rl == c1954n.rl;
    }

    public final boolean rl(C1954n c1954n) {
        return c1954n != null && this.f63522n <= c1954n.f63522n && c1954n.rl <= this.rl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern nr() {
        return Pattern.compile("[-/ ]");
    }

    public int hashCode() {
        return (this.f63522n * 31) + this.rl;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        j jVar = f63521t;
        String str = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{jVar.nr(this.f63522n), jVar.nr(this.rl)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public C1954n(int i2, int i3) {
        this.f63522n = i2;
        this.rl = i3;
    }
}
