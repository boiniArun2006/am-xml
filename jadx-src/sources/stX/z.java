package stX;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class z implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73382n;

    static final class j extends Lambda implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Unexpected end of input: yet to parse '" + z.this.rl() + '\'';
        }
    }

    static final class n extends Lambda implements Function0 {
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f73384O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ CharSequence f73386t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(CharSequence charSequence, int i2, int i3) {
            super(0);
            this.f73386t = charSequence;
            this.f73384O = i2;
            this.J2 = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(z.this.rl());
            sb.append(" but got ");
            CharSequence charSequence = this.f73386t;
            int i2 = this.f73384O;
            sb.append(charSequence.subSequence(i2, this.J2 + i2 + 1).toString());
            return sb.toString();
        }
    }

    public z(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f73382n = string;
        if (string.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (fm.Ml.rl(string.charAt(0))) {
            throw new IllegalArgumentException(("String '" + string + "' starts with a digit").toString());
        }
        if (fm.Ml.rl(string.charAt(string.length() - 1))) {
            throw new IllegalArgumentException(("String '" + string + "' ends with a digit").toString());
        }
    }

    @Override // stX.Pl
    public Object n(Object obj, CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.f73382n.length() + i2 > input.length()) {
            return aC.f73359n.n(i2, new j());
        }
        int length = this.f73382n.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (input.charAt(i2 + i3) != this.f73382n.charAt(i3)) {
                return aC.f73359n.n(i2, new n(input, i2, i3));
            }
        }
        return aC.f73359n.rl(i2 + this.f73382n.length());
    }

    public final String rl() {
        return this.f73382n;
    }

    public String toString() {
        return '\'' + this.f73382n + '\'';
    }
}
