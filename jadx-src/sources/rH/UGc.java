package rH;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.MovementMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class UGc {
    private final int J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MovementMethod f72958O;
    private final Typeface Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CharSequence f72959n;
    private final boolean nr;
    private final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f72960t;

    public static final class j {
        public int J2;
        public int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public MovementMethod f72961O;
        public Typeface Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f72962n;
        public boolean nr;
        public float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f72963t;
        private final Context xMQ;

        public j(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.xMQ = context;
            this.f72962n = "";
            this.rl = 12.0f;
            this.f72963t = -1;
            this.KN = 17;
        }

        public final j J2(float f3) {
            this.rl = f3;
            return this;
        }

        public final j KN(Typeface typeface) {
            this.Uo = typeface;
            return this;
        }

        public final j O(boolean z2) {
            this.nr = z2;
            return this;
        }

        public final j Uo(int i2) {
            this.J2 = i2;
            return this;
        }

        public final UGc n() {
            return new UGc(this);
        }

        public final j nr(int i2) {
            this.KN = i2;
            return this;
        }

        public final j rl(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72962n = value;
            return this;
        }

        public final j t(int i2) {
            this.f72963t = i2;
            return this;
        }
    }

    public UGc(j builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f72959n = builder.f72962n;
        this.rl = builder.rl;
        this.f72960t = builder.f72963t;
        this.nr = builder.nr;
        this.f72958O = builder.f72961O;
        this.J2 = builder.J2;
        this.Uo = builder.Uo;
        this.KN = builder.KN;
    }

    public final float J2() {
        return this.rl;
    }

    public final Typeface KN() {
        return this.Uo;
    }

    public final boolean O() {
        return this.nr;
    }

    public final int Uo() {
        return this.J2;
    }

    public final MovementMethod n() {
        return this.f72958O;
    }

    public final int nr() {
        return this.KN;
    }

    public final CharSequence rl() {
        return this.f72959n;
    }

    public final int t() {
        return this.f72960t;
    }
}
