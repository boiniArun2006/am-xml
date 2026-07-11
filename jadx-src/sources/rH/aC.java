package rH;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class aC {
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f72969O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f72970n;
    private final int nr;
    private Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C f72971t;

    public static final class j {
        public int J2;
        private final Context KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f72972O;
        public int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Drawable f72973n;
        public int nr;
        public Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public C f72974t;

        public j(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.KN = context;
            this.f72974t = C.LEFT;
            this.nr = YQ.j.nr(context, 28);
            this.f72972O = YQ.j.nr(context, 28);
            this.J2 = YQ.j.nr(context, 8);
            this.Uo = -1;
        }

        public final j J2(int i2) {
            this.J2 = i2;
            return this;
        }

        public final j O(int i2) {
            this.f72972O = i2;
            return this;
        }

        public final j Uo(int i2) {
            this.nr = i2;
            return this;
        }

        public final aC n() {
            return new aC(this);
        }

        public final j nr(int i2) {
            this.Uo = i2;
            return this;
        }

        public final j rl(Drawable drawable) {
            this.f72973n = drawable;
            return this;
        }

        public final j t(C value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72974t = value;
            return this;
        }
    }

    public aC(j builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f72970n = builder.f72973n;
        this.rl = builder.rl;
        this.f72971t = builder.f72974t;
        this.nr = builder.nr;
        this.f72969O = builder.f72972O;
        this.J2 = builder.J2;
        this.Uo = builder.Uo;
    }

    public final int J2() {
        return this.J2;
    }

    public final int O() {
        return this.f72969O;
    }

    public final int Uo() {
        return this.nr;
    }

    public final Drawable n() {
        return this.f72970n;
    }

    public final C nr() {
        return this.f72971t;
    }

    public final Integer rl() {
        return this.rl;
    }

    public final int t() {
        return this.Uo;
    }
}
