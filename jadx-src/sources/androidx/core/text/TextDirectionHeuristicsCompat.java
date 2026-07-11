package androidx.core.text;

import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f36642O;
    public static final TextDirectionHeuristicCompat nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f36644t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f36643n = new TextDirectionHeuristicInternal(null, false);
    public static final TextDirectionHeuristicCompat rl = new TextDirectionHeuristicInternal(null, true);

    private interface TextDirectionAlgorithm {
        int n(CharSequence charSequence, int i2, int i3);
    }

    private static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TextDirectionAlgorithm f36647n;

        protected abstract boolean rl();

        private boolean t(CharSequence charSequence, int i2, int i3) {
            int iN = this.f36647n.n(charSequence, i2, i3);
            if (iN == 0) {
                return true;
            }
            if (iN != 1) {
                return rl();
            }
            return false;
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean n(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null || i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            return this.f36647n == null ? rl() : t(charSequence, i2, i3);
        }

        TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.f36647n = textDirectionAlgorithm;
        }
    }

    private static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean rl;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean rl() {
            return this.rl;
        }

        TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z2) {
            super(textDirectionAlgorithm);
            this.rl = z2;
        }
    }

    static int n(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int rl(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    private static class AnyStrong implements TextDirectionAlgorithm {
        static final AnyStrong rl = new AnyStrong(true);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f36645n;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int n(CharSequence charSequence, int i2, int i3) {
            int i5 = i3 + i2;
            boolean z2 = false;
            while (i2 < i5) {
                int iN = TextDirectionHeuristicsCompat.n(Character.getDirectionality(charSequence.charAt(i2)));
                if (iN != 0) {
                    if (iN != 1) {
                        continue;
                        i2++;
                        z2 = z2;
                    } else if (!this.f36645n) {
                        return 1;
                    }
                } else if (this.f36645n) {
                    return 0;
                }
                z2 = true;
                i2++;
                z2 = z2;
            }
            if (z2) {
                return this.f36645n ? 1 : 0;
            }
            return 2;
        }

        private AnyStrong(boolean z2) {
            this.f36645n = z2;
        }
    }

    private static class FirstStrong implements TextDirectionAlgorithm {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final FirstStrong f36646n = new FirstStrong();

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int n(CharSequence charSequence, int i2, int i3) {
            int i5 = i3 + i2;
            int iRl = 2;
            while (i2 < i5 && iRl == 2) {
                iRl = TextDirectionHeuristicsCompat.rl(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return iRl;
        }

        private FirstStrong() {
        }
    }

    private static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        static final TextDirectionHeuristicLocale rl = new TextDirectionHeuristicLocale();

        TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean rl() {
            if (TextUtilsCompat.n(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.f36646n;
        f36644t = new TextDirectionHeuristicInternal(firstStrong, false);
        nr = new TextDirectionHeuristicInternal(firstStrong, true);
        f36642O = new TextDirectionHeuristicInternal(AnyStrong.rl, false);
        J2 = TextDirectionHeuristicLocale.rl;
    }
}
